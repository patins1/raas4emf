/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.eclipse.jqvt.jvmmodel

import com.google.inject.Inject
import org.eclipse.emf.ecore.EObject
import org.eclipse.jqvt.jQVT.ObjectTemplate
import org.eclipse.jqvt.jQVT.PropertyTemplateItem
import org.eclipse.jqvt.jQVT.Query
import org.eclipse.jqvt.jQVT.Relation
import org.eclipse.jqvt.jQVT.RelationDomain
import org.eclipse.jqvt.jQVT.Transformation
import org.eclipse.jqvt.util.JQVTUtils
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtend2.lib.StringConcatenation
import org.eclipse.xtext.common.types.JvmPrimitiveType
import org.eclipse.xtext.common.types.util.TypeReferences
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.xtext.xbase.XAssignment
import org.eclipse.xtext.xbase.XExpression
import org.eclipse.xtext.xbase.XVariableDeclaration
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder
import org.eclipse.xtext.xbase.jvmmodel.JvmVisibilityExtension
import org.eclipse.xtext.xbase.typing.JvmOnlyTypeConformanceComputer
import org.eclipse.xtext.xbase.compiler.ImportManager

import static org.eclipse.xtext.common.types.TypesFactory.*

/**
 * Infers a JVM model from the JQVT model.
 */
class JQVTJvmModelInferrer extends AbstractModelInferrer {

	@Inject extension JvmTypesBuilder

    @Inject extension IQualifiedNameProvider
   
	@Inject	extension TypeReferences	
	
	@Inject	extension DependencyProcessor	
   
	@Inject	extension JvmVisibilityExtension
	 
	@Inject extension JvmOnlyTypeConformanceComputer
	
	@Inject	extension JQVTUtils
	
	def String getParamName(RelationDomain domain) {
		domain.name
	}
	
	def String triggerName(Relation r) {
		if (r.isTopRelation)
			return "top_relation_"+r.name
		return "relation_"+r.name
	} 
	
	def String tracesName(Relation r) {
		"traces_"+r.name
	} 
	
	def Iterable<RelationDomain> getSourceDomains(Relation relation) {
		relation.uniqueDomains.filter(domain | !domain.isTarget)
	}
	
	def Iterable<RelationDomain> getTargetDomains(Relation relation) {
		relation.uniqueDomains.filter(domain | domain.isTarget)
	}
	
	def String simpleTypeName(XVariableDeclaration decl) {
		if (decl.type!=null) decl.type.qualifiedName else "unknown_type"
	}
	
	def EObject eNull() {
		eINSTANCE.createJvmTypeParameter();
	}
	
	def String relBody(Relation relation, boolean useTraces, boolean onlyTraces) {
		return '''
	«relation.name» result = new «relation.name»(«FOR domain:relation.sourceDomains SEPARATOR ', '»«domain.paramName»«ENDFOR»);
	«IF useTraces»
	if («relation.tracesName»==null) «relation.tracesName» = new java.util.HashMap<«relation.name»,«relation.name»>();
	if («relation.tracesName».containsKey(result)) {
		result = «relation.tracesName».get(result);
	} else {
		«IF onlyTraces»
		return null;
		«ELSE»
		«relation.tracesName».put(result,null);
		«IF !relation.topRelation»	
		«FOR domain:relation.targetDomains»	
		result.«domain.name» = «domain.paramName»;
		«ENDFOR»
		«ENDIF»	
		if (!result.execute(this)) return null;
		«relation.tracesName».put(result,result);
		«ENDIF»
	}
	«ELSE»
	if (!result.execute(this)) return null;
	«ENDIF»
	return result;'''.toString();
	}
	
   	def dispatch void infer(Transformation transformation, IJvmDeclaredTypeAcceptor  acceptor, boolean isPrelinkingPhase) {
   		
     transformation.clearStaleDependencyInfos();
   		
     val trafoType = transformation.toClass(transformation.eContainer.fullyQualifiedName.append('Transformation')) [
       abstract = true;
       documentation = transformation.documentation
     ]
     acceptor.accept(trafoType)
    
		
       for (relation : transformation.rules) {
	     val c =relation.toClass(relation.fullyQualifiedName) [
	       documentation = relation.documentation
	        members += relation.toField("trafo", trafoType.createTypeRef())
	       	members += eNull.toField('hash', relation.newTypeRef(typeof(int)))
			members += eNull.toConstructor() [
			   simpleName = relation.name;
               for (domain:relation.sourceDomains) {
                 parameters += eNull.toParameter(domain.name, domain.type)
               }	
			   it.eAdapters().clear(); //otherwise the default constructor body is inserted!
		       body = [		       
	               append(relation.sourceDomains.map(domain|'''this.«domain.name»=«domain.name»;''').join("\n"));
		       ]
			]
			members += eNull.toMethod("hashCode", relation.newTypeRef(typeof(int))) [	
				val b = '''if (hash != 0) return hash;
final int prime = 31;
int result = 1;
«FOR domain:relation.sourceDomains»result = prime * result + «domain.name».hashCode();
«ENDFOR»
return hash = result;'''								
				body = [append(b)]
			]
			members += eNull.toMethod("equals", relation.newTypeRef(typeof(boolean))) [	
				parameters += eNull.toParameter('obj', relation.newTypeRef(typeof(Object)))
				val b = '''if (this == obj) return true;
if (!(obj instanceof «relation.name»)) return false;
«relation.name» other = («relation.name») obj;
«FOR domain:relation.sourceDomains»if («domain.name» != null ? !«domain.name».equals(other.«domain.name») :  other.«domain.name» == null) return false;
«ENDFOR»
return true;'''								
				body = [append(b)]
			]
		]
		if (c!=null) {
	    acceptor.accept(c);
	    
	       val mapMethod = new StringConcatenation()
	       mapMethod.append('''this.trafo = transformation;
   	''')
	       var i = 1;
	       var nesting = 0;
	       var stopTuple = '''return false;
	       ''';
	       for (feature : relation.uniqueVars.values) {
	       		val field =feature.toField(feature.name, feature.type)
	       		makePublic(field);
	       		field.final = feature.isSourceDomain;
	            c.members += field
//	             members += feature.toSetter(feature.name, feature.type)
//	             members += feature.toGetter(feature.name, feature.type)
	       }       
	       
	       for (info : relation.sortSnippetsOfRelation) {
					val clause = info.snippet;
					if (info.isTarget)
				       stopTuple = '''throw new RuntimeException("where clause of «relation.name» failed!");
				       ''';
					switch clause {
						ObjectTemplate: {		
							if (info.isTarget && clause.type!=null && !(clause.type.type instanceof JvmPrimitiveType) && info.isWrite(clause)) {
									mapMethod.append('''// «JQVTUtils::toQVTWithinComment(clause)»
	''')
								mapMethod.append('''«IF info.isRead(clause) || isRootTemplate(clause) && (nesting>=1 || !relation.isTopRelation)»if («clause.name»==null) «ENDIF»«clause.name» = transformation.create(«clause.simpleTypeName».class);
	''') 				 
							}
							
						}
						PropertyTemplateItem: {
								val objectTemplate = clause.eContainer as ObjectTemplate;
								val propName = JQVTUtils::toPropertyName(clause.referredProperty);
								if (propName!=null) {
									val field = clause.referredProperty;
									val getter = JQVTUtils::toGetterName(clause.referredProperty);
									val isMany = field.returnType.isMany 
									var rhsExp = 'unknown';
									if (clause.value.asVar!=null) {
										rhsExp = clause.value.asVar.name;
									} else {
										rhsExp = "evaluateExpression" + i + "()";
										c.members += eNull.toMethod("evaluateExpression"+i, field.returnType) [	
											body = clause.value
										]
									} 
									val printFailure = '''trafo.logFailure(«NodeModelUtils::getNode(clause).getStartLine()»);
		'''
									val printSuccess = '''trafo.logSuccess(«NodeModelUtils::getNode(clause).getStartLine()»);
		'''
									mapMethod.append('''// «propName» = «JQVTUtils::toQVTWithinComment(clause.value)»
		''')
									if (info.isTarget) {
										if (isMany && clause.value instanceof ObjectTemplate)
											mapMethod.append('''«objectTemplate.name».«getter»().add(«rhsExp»);
		''')
										else
										if (isMany) {
											mapMethod.append('''«objectTemplate.name».«getter»().retainAll(«rhsExp»);
«objectTemplate.name».«getter»().addAll(«rhsExp»);
		''')								
										}
										else
											mapMethod.append('''«objectTemplate.name».«JQVTUtils::toSetterName(clause.referredProperty)»(«rhsExp»);
		''');
									} else {
										if (clause.value instanceof ObjectTemplate && isMany) {
											nesting = nesting+1
								   			if (nesting==1)
								   				mapMethod.append('''boolean result = false;
		''')
											stopTuple = '''continue;
											'''
											val rhs = clause.value as ObjectTemplate;
											val componentType =  field.returnType.componentType
											val conformant = rhs.type.isConformant(componentType);
											mapMethod.append('''for («componentType.qualifiedName» __«rhs.name» : «objectTemplate.name».«getter»()) {
«IF !conformant»if (!(__«rhs.name» instanceof «rhs.simpleTypeName»)) {«printFailure»«stopTuple»}«printSuccess»«ENDIF»
«rhs.name» = «IF !conformant»(«rhs.simpleTypeName»)«ENDIF»__«rhs.name»;
			''')
										} else
										if (clause.value.asVar!=null && info.isWrite(clause.value.asVar) && !info.isRead(clause.value.asVar)) {
												val rhs = clause.value.asVar;
												val conformant = rhs.type.isConformant(field.returnType);
												mapMethod.append('''«IF !conformant»if (!(«objectTemplate.name».«getter»() instanceof «rhs.simpleTypeName»)) {«printFailure»«stopTuple»}«printSuccess»«ENDIF»
«IF conformant && (clause.value instanceof ObjectTemplate || rhs.type.type instanceof JvmPrimitiveType && !(field.returnType.type instanceof JvmPrimitiveType))»if («objectTemplate.name».«getter»() == null) {«printFailure»«stopTuple»}«printSuccess»«ENDIF»
«rhs.name» = «IF !conformant»(«rhs.simpleTypeName»)«ENDIF» «objectTemplate.name».«getter»();
			''')
										} else 
												mapMethod.append('''if («objectTemplate.name».«getter»() == null ? «rhsExp» != null : !«objectTemplate.name».«getter»().equals(«rhsExp»)) {«printFailure»«stopTuple»}«printSuccess»
			''')										
									}
								
								}
						}
						XExpression: {
							val booleanTyped = !info.isTarget && !(clause instanceof XAssignment);
							c.members += eNull.toMethod("evaluateClause"+i, if (booleanTyped) relation.newTypeRef(typeof(boolean)) else relation.newTypeRef(Void::TYPE)) [	
								body = clause
							]			
							val printFailure = '''trafo.logFailure(«NodeModelUtils::getNode(clause).getStartLine()»);
		'''
							val printSuccess = '''trafo.logSuccess(«NodeModelUtils::getNode(clause).getStartLine()»);
		'''
								mapMethod.append('''// «JQVTUtils::toQVTWithinComment(clause)»
«IF booleanTyped»if (!evaluateClause«i»()) {«printFailure»«stopTuple»}«printSuccess»«ELSE»evaluateClause«i»();«ENDIF»
'''	)								
						}
					}
					
   				i = i+1
   			}
   			if (nesting>0)
				mapMethod.append('''result=true;
	''');
			var _nesting = 0;
			while (_nesting<nesting) {	
				mapMethod.append('''}
	''');
				_nesting = _nesting + 1;
			}
			
			
	        mapMethod.append('''return «IF nesting>0»result«ELSE»true«ENDIF»;''');			
			
			
			c.members += eNull.toMethod("execute", relation.newTypeRef(typeof(boolean))) [
               parameters += eNull.toParameter("transformation", trafoType.createTypeRef())
		       body = [append(mapMethod)] 
			]
	     }
	   }
	   
       for (relation : transformation.rules) {
			trafoType.members += relation.toMethod(relation.name, relation.newTypeRef(typeof(boolean))) [
               for (domain:relation.uniqueDomains) parameters += eNull.toParameter(domain.paramName, domain.newTypeRef(typeof(Object)))
               documentation = relation.documentation
               body = [append('''throw new RuntimeException("should never be called");''')]
			]			
		}
	     
       for (Query query:transformation.queries) {
             trafoType.members += query.toMethod(query.name, query.type) [
               for (p : query.params) {
                 parameters += p.toParameter(p.name, p.parameterType)
               }
               documentation = query.documentation
               body = query.body
             ]                   
       	}
	    
       for (relation : transformation.sortedRelations) {
       		val c = relation.typeForRelation;
       		if (c!=null) {
       		val relationType = c.createTypeRef();  	
       		
			val hashMap = relation.newTypeRef("java.util.HashMap", c.createTypeRef(), c.createTypeRef());
            val traceField = eNull.toField(relation.tracesName, hashMap)
       		makePublic(traceField);
            trafoType.members += traceField
            
			trafoType.members += eNull.toMethod((if (relation.topRelation) "top_relation_" else "push_relation_")+relation.name, relationType) [
                for (domain:relation.uniqueDomains) 
                	if (!relation.topRelation || !domain.isTarget) parameters += eNull.toParameter(domain.paramName, domain.type)
				body = [append(relBody(relation,true, false))]
			]
			
			if (!relation.topRelation)
			trafoType.members += eNull.toMethod("relation_"+relation.name, relationType) [
                for (domain:relation.uniqueDomains) if (!domain.isTarget) parameters += eNull.toParameter(domain.paramName, domain.type)
				body = [append(relBody(relation,true, true))]
			]
			}
       }    
       
       
	    val T = eINSTANCE.createJvmTypeParameter();		
	    T.name = "T"
	    val returnT = _typeReferences.createTypeRef(T);
		trafoType.members += eNull.toMethod("create", returnT) [
		   typeParameters += T;
	       parameters += eNull.toParameter("c", transformation.newTypeRef(typeof(Class),returnT))
	       abstract = true; 
		]  
       
   	}
   	
  	
}