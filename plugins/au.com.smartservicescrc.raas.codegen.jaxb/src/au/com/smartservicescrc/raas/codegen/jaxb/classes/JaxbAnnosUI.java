/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package au.com.smartservicescrc.raas.codegen.jaxb.classes;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TimeZone;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
import org.eclipse.emf.codegen.ecore.genmodel.GenFeature;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.TypeDeclaration;

import au.com.smartservicescrc.raas.codegen.jaxb.actions.MultiJaxbAction;
import au.com.smartservicescrc.raas.codegen.jaxb.util.MetamodelUtil;

/**
 * Calculates and collects proposals for JAXB annotations
 */
public class JaxbAnnosUI {
	private List<JaxbProposal> proposals = new ArrayList<JaxbProposal>();

	public List<JaxbProposal> getProposals() {
		return this.proposals;
	}

	public void fetchProposalStructures(GenClass genClass, TypeDeclaration decl) throws CoreException {
		String p = genClass.getGenPackage().getQualifiedPackageName();
		{
			if (!decl.isInterface()) {
				JaxbProposal proposal = new JaxbProposal(decl);
				proposal.setAnnotation("javax.xml.bind.annotation.XmlRootElement");
				proposal.setLabel("Provide an XML element name for serialization as XML root element by JAXRS");
				proposal.put("name", genClass.getInterfaceName() + "Element");
				if (proposal.isRelevant()) {
					proposals.add(proposal);
				}
				proposal = new JaxbProposal(decl);
				proposal.setAnnotation("javax.xml.bind.annotation.XmlSeeAlso");
				proposal.setLabel("Required by JAXRS for client side usage");
				Set<ClassLiteral> seeAlsos = new HashSet<ClassLiteral>();
				for (EClass eClass : MetamodelUtil.getSubclasses(genClass.getEcoreClass(), MetamodelUtil.getEClasses(genClass.getGenModel()))) {
					if (!eClass.isInterface()) {
						GenClass subGenClass = (GenClass) genClass.getGenModel().findGenClassifier(eClass);
						seeAlsos.add(new ClassLiteral(subGenClass.getQualifiedClassName()));
					}
				}
				if (!seeAlsos.isEmpty()) {
					proposal.put("value", seeAlsos);
					if (proposal.isRelevant()) {
						proposals.add(proposal);
					}
				}
			}
			JaxbProposal proposal = new JaxbProposal(decl);
			String name = decl.getName().getIdentifier();
			if (decl.isInterface()) {
				proposal.setAnnotation("javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter");
				proposal.put("value", new ClassLiteral(p + ".jaxb." + name + "ImplAdapter"));
				proposal.setLabel("Delegate to serialization of implementation class, as interfaces cannot be serialized");
			} else {
				proposal.setAnnotation("javax.xml.bind.annotation.XmlType");
				proposal.put("name", genClass.getInterfaceName());
				proposal.setLabel("Use the interface name as XML element name, as the class name would be used by default");
			}
			if (proposal.isRelevant()) {
				proposals.add(proposal);
			}
		}
		if (decl.isInterface()) {
			return;
		}
		for (MethodDeclaration mdecl : decl.getMethods()) {
			String name = mdecl.getName().getIdentifier();
			if (!name.startsWith("get")) {
				continue;
			}
			String featureName = name.substring(3, 4).toLowerCase() + name.substring(4);
			EStructuralFeature eFeature = genClass.getEcoreClass().getEStructuralFeature(featureName);
			if (eFeature == null) {
				continue;
			}
			if (eFeature.getLowerBound() >= 1 || eFeature.isMany()) {
				JaxbProposal proposal = new JaxbProposal(mdecl);
				if (eFeature.getLowerBound() >= 1) {
					proposal.put("required", true);
					proposal.setLabel("Feature is required to be set (lowerBound>=1)");
				} else {
					proposal.setLabel("Declare explicitely to serialize this feature, as it has no setter method");
				}
				proposal.setAnnotation("javax.xml.bind.annotation.XmlElement");
				if (proposal.isRelevant()) {
					proposals.add(proposal);
				}
			}
			if (eFeature instanceof EReference) {
				EReference eReference = (EReference) eFeature;
				if (!eReference.isContainment()) {
					GenFeature genFeature = getGenFeatureFor(eFeature, genClass);
					if (genFeature == null) {
						continue;
					}
					GenClass type = genFeature.getTypeGenClass();
					if (type == null) {
						continue;
					}
					JaxbProposal proposal = new JaxbProposal(mdecl);
					proposal.put("value", new ClassLiteral(type.getGenPackage().getQualifiedPackageName() + ".jaxb." + eReference.getEType().getName() + "RefAdapter"));
					proposal.setAnnotation("javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter");
					proposal.setLabel("Delegate to serialization of ID-representing bean, as reference is non-containment");
					if (proposal.isRelevant()) {
						proposals.add(proposal);
					}
				}
			} else if (eFeature.getEType() != null && TimeZone.class.equals(eFeature.getEType().getInstanceClass())) {
				JaxbProposal proposal = new JaxbProposal(mdecl);
				proposal.put("value", new ClassLiteral(MultiJaxbAction.jaxbUtilPackage + ".TimeZoneAdapter"));
				proposal.setAnnotation("javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter");
				proposal.setLabel("Delegate to serialization of a bean representing the ID of the time zone");
				if (proposal.isRelevant()) {
					proposals.add(proposal);
				}
			}
		}
	}

	private GenFeature getGenFeatureFor(EStructuralFeature eFeature, GenClass genClass) {
		for (GenFeature genFeature : genClass.getAllGenFeatures()) {
			if (genFeature.getEcoreFeature() == eFeature) {
				return genFeature;
			}
		}
		return null;
	}
}
