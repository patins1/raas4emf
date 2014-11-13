/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.eclipse.jqvt.util

import com.google.inject.Inject
import com.google.inject.Provider
import java.util.HashSet
import java.util.List
import org.eclipse.emf.ecore.EObject
import org.eclipse.jqvt.jQVT.Direction
import org.eclipse.jqvt.jQVT.ObjectTemplate
import org.eclipse.jqvt.jQVT.Relation
import org.eclipse.jqvt.jQVT.RelationDomain
import org.eclipse.jqvt.jQVT.Transformation
import org.eclipse.jqvt.jvmmodel.ParamPair
import org.eclipse.xtext.common.types.JvmArrayType
import org.eclipse.xtext.common.types.JvmDeclaredType
import org.eclipse.xtext.common.types.JvmGenericArrayTypeReference
import org.eclipse.xtext.common.types.JvmMember
import org.eclipse.xtext.common.types.JvmOperation
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference
import org.eclipse.xtext.common.types.JvmTypeReference
import org.eclipse.xtext.common.types.JvmVisibility
import org.eclipse.xtext.common.types.util.TypeReferences
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.xbase.XAbstractFeatureCall
import org.eclipse.xtext.xbase.XAssignment
import org.eclipse.xtext.xbase.XExpression
import org.eclipse.xtext.xbase.XFeatureCall
import org.eclipse.xtext.xbase.XVariableDeclaration
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociations
import org.eclipse.xtext.xbase.jvmmodel.JvmTypeReferenceBuilder
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder
import org.eclipse.xtext.xbase.typesystem.IBatchTypeResolver
import org.eclipse.xtext.xbase.typesystem.conformance.TypeConformanceComputationArgument
import org.eclipse.xtext.xbase.typesystem.references.LightweightTypeReferenceFactory
import org.eclipse.xtext.xbase.typesystem.references.StandardTypeReferenceOwner
import org.eclipse.xtext.xbase.typesystem.util.CommonTypeComputationServices

import static org.eclipse.jqvt.util.JQVTUtilsExtended.*

/**
 * Some utility methods
 */
class JQVTUtils {
	@Inject
	private IBatchTypeResolver typeResolver;
	
    @Inject extension JvmTypeReferenceBuilder;
	
	@Inject JvmTypesBuilder typesBuilder;
	
	@Inject CommonTypeComputationServices services;
	
	@Inject	extension IJvmModelAssociations 
	
	@Inject extension JvmTypesBuilder
	
	def Iterable<RelationDomain> getUniqueDomains(Relation relation) {
		val names = new HashSet<String>()
		return relation.domains.filter(domain | !domain.isTarget && names.add(domain.name))+relation.domains.filter(domain | domain.isTarget && names.add(domain.name))
	}
	
	def String getName(RelationDomain domain) {
		domain.rootTemplate.name;
	}
	
	def JvmTypeReference getType(RelationDomain domain) {
		domain.rootTemplate.type;
	}
	
	def Iterable<ParamPair> getParamPairs(XFeatureCall call, Boolean isTarget) {
		val relation = getReferredRelation(call);
		return relation.uniqueDomains.filter(domain|(isTarget==null || isTarget.equals(domain.isTarget)) && relation.uniqueDomains.toList.indexOf(domain)<call.featureCallArguments.size).map(domain|new ParamPair(call.featureCallArguments.get(relation.uniqueDomains.toList.indexOf(domain)),domain))
	}
	
	def JvmDeclaredType getTypeForRelation(Relation relation) {
		return relation.jvmElements.filter(typeof(JvmDeclaredType)).head
	}
	
	def JvmDeclaredType getTypeForTransformation(Transformation transformation) {
		return transformation.jvmElements.filter(typeof(JvmDeclaredType)).head
	}
	
	def String triggerName(Relation r) {
		if (r.isTopRelation)
			return "top_relation_"+r.name
		return "relation_"+r.name
	} 
	
	def boolean isTarget(RelationDomain domain) {
		domain.getDirection() == getTarget(domain);
	}
   	   	
	def boolean isSourceDomain(XVariableDeclaration varDecl) {
		varDecl instanceof ObjectTemplate && varDecl.eContainer instanceof RelationDomain && !(varDecl.eContainer as RelationDomain).isTarget;
	}
   	   	
	def Iterable<XVariableDeclaration> getAllVarDecls(Relation relation) {
		relation.eAllContents.toIterable.filter(typeof(XVariableDeclaration))
	}
	
	def Relation getOuterRelation(EObject value) {
		getContainerIterable(value).filter(typeof(Relation)).head
	}	 
	
	def Transformation getOuterTransformation(EObject value) {
		getContainerIterable(value).filter(typeof(Transformation)).head
	}	 
	
	def XVariableDeclaration findVarDecl(EObject eObject, String name) {
		eObject.outerRelation?.allVarDecls.findFirst(x|name.equals(x.name))
	}
	
	def Relation getReferredRelation(XAbstractFeatureCall xFeatureCall) {
		val name = xFeatureCall.getConcreteSyntaxFeatureName();
		return xFeatureCall.outerTransformation?.rules.findFirst(x|name.equals(x.name))
	}
	
	def XVariableDeclaration asVar(EObject eObject) {
		switch eObject {
			XAssignment: findVarDecl(eObject, eObject.getConcreteSyntaxFeatureName)
			XFeatureCall: if(eObject.feature instanceof JvmOperation) null else findVarDecl(eObject, eObject.getConcreteSyntaxFeatureName)
			ObjectTemplate: eObject
		}
	}
	
	def Direction getTarget(EObject eObject) {
		getContainerIterable(eObject).filter(typeof(Transformation)).head?.directions.last
	}
	
	def boolean isRootTemplate(EObject objectTemplate) {
		objectTemplate.eContainer instanceof RelationDomain
	}
	
	def static String toGetterName(JvmOperation property) {
		property.simpleName
	}
	
	def static String toSetterName(JvmOperation property) {
		return "set" + property.toPropertyName
	}
	
	def static String toPropertyName(JvmOperation op) {
		if (op == null || op.simpleName == null)
			return null;
		if (op.simpleName.startsWith("get"))
			return op.simpleName.substring(3);
		if (op.simpleName.startsWith("is"))
			return op.simpleName.substring(2);
		return null;
	}
	
	def getComponentType(JvmTypeReference type) {
		if (type instanceof JvmParameterizedTypeReference && (type as JvmParameterizedTypeReference).arguments.length!=0) (type as JvmParameterizedTypeReference).arguments.get(0) else type.newTypeRef(typeof(Object));
	}
	
	def boolean isMany(JvmTypeReference type, EObject context) {		
		isConformantRawTypes(context.newTypeRef(typeof(List)),type,context) || type instanceof JvmGenericArrayTypeReference || type.type instanceof JvmArrayType
	}
	
	def static String toQVT(EObject clause) {
		if (clause == null)
			return "null";
		if (clause instanceof ObjectTemplate) {
			val objectTemplate = clause as ObjectTemplate;
			return objectTemplate.name + " : " + (if (objectTemplate.type != null) objectTemplate.type.simpleName else "unknown_type") + " {..}";
		}
		try {
			return (clause.eResource as XtextResource).serializer.serialize(clause).trim
		} catch (Exception e) {
			return "Error occured: " + e.message;
		}
	}
	
	def static String toQVTWithinComment(EObject clause) {
		return toQVT(clause).trim.replace("\n", "\n// ").replace("\r", "");
	}
		
	def static String toQVTWithinString(EObject clause) {
		return toQVT(clause).trim.replace("\n", "\\n").replace("\"", "\\\"").replace("\r", "");
	}
	
	def isConformant(RelationDomain domain, JvmTypeReference t2) {
		isConformant(domain.type,t2,domain)
	}
	
	def isConformant(JvmTypeReference t1, RelationDomain domain) {
		isConformant(t1,domain.type,domain)
	}
	
	def isConformant(XVariableDeclaration varDecl, JvmTypeReference t2) {
		isConformant(varDecl.type,t2,varDecl)
	}
	
	def isConformant(JvmTypeReference t1, JvmTypeReference t2, EObject context) {
		t1.toLightweightTypeReference(context).isAssignableFrom(t2.toLightweightTypeReference(context))
	}
	
	def isConformantRawTypes(JvmTypeReference t1, JvmTypeReference t2, EObject context) {
		t1.toLightweightTypeReference(context).isAssignableFrom(t2.toLightweightTypeReference(context), new TypeConformanceComputationArgument(!false, false, true, true, false, true))
	}

	def toLightweightTypeReference(JvmTypeReference typeRef, EObject context) {
		return toLightweightTypeReference(typeRef, false, context);
	}
	
	def toLightweightTypeReference(JvmTypeReference typeRef, boolean keepUnboundWildcardInformation, EObject context) {
		val owner = new StandardTypeReferenceOwner(services, context);
		val factory = new LightweightTypeReferenceFactory(owner, keepUnboundWildcardInformation);
		val reference = factory.toLightweightReference(typeRef);
		return reference;
	}
	
	def makePublic(JvmMember member) {
		member.setVisibility(JvmVisibility.PUBLIC);
	}
	
	def getType(XExpression exp) {
		typesBuilder.inferredType(exp)
	}
	
}
