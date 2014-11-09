/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.eclipse.jqvt.util

import com.google.inject.Inject
import java.util.Collection
import java.util.HashSet
import org.eclipse.emf.ecore.EObject
import org.eclipse.jqvt.jQVT.Direction
import org.eclipse.jqvt.jQVT.ObjectTemplate
import org.eclipse.jqvt.jQVT.Relation
import org.eclipse.jqvt.jQVT.RelationDomain
import org.eclipse.jqvt.jQVT.Transformation
import org.eclipse.jqvt.jvmmodel.ParamPair
import org.eclipse.xtext.common.types.JvmDeclaredType
import org.eclipse.xtext.common.types.JvmMember
import org.eclipse.xtext.common.types.JvmOperation
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference
import org.eclipse.xtext.common.types.JvmTypeReference
import org.eclipse.xtext.common.types.JvmVisibility
import org.eclipse.xtext.common.types.util.TypeReferences
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.xbase.XAbstractFeatureCall
import org.eclipse.xtext.xbase.XAssignment
import org.eclipse.xtext.xbase.XFeatureCall
import org.eclipse.xtext.xbase.XVariableDeclaration
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociations
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder
import org.eclipse.xtext.xbase.typesystem.references.OwnedConverter
import org.eclipse.xtext.xbase.typesystem.references.StandardTypeReferenceOwner
import org.eclipse.xtext.xbase.typesystem.util.CommonTypeComputationServices
import org.eclipse.xtext.xbase.XExpression

import static org.eclipse.jqvt.util.JQVTUtilsExtended.*

/**
 * Some utility methods
 */
class JQVTUtils {
	
	@Inject TypeReferences typeReferences;
	
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
		if (type instanceof JvmParameterizedTypeReference) (type as JvmParameterizedTypeReference).arguments.get(0) else type.newTypeRef(typeof(Object));
	}
	
	def boolean isMany(JvmTypeReference type) {
		typeReferences.is(type, typeof(Collection)) || type.type!=null && type.type.eIsProxy && type.type.toString().contains("EList") || typeReferences.isArray(type)
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
	
	def isConformant(JvmTypeReference t1, JvmTypeReference t2) {
		t1.toLightweightTypeReference.isAssignableFrom(t2.toLightweightTypeReference)
	}

	def toLightweightTypeReference(JvmTypeReference typeRef) {
		val converter = new OwnedConverter(new StandardTypeReferenceOwner(services, typeRef))
		converter.toLightweightReference(typeRef)
	}
	
	def makePublic(JvmMember member) {
		member.setVisibility(JvmVisibility.PUBLIC);
	}
	
	def getType(XExpression exp) {
		typesBuilder.inferredType(exp)
	}
	
}
