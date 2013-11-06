/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package express2ecore.util;

import express2ecore.*;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see express2ecore.Express2ecorePackage
 * @generated
 */
public class Express2ecoreSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Express2ecorePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Express2ecoreSwitch() {
		if (modelPackage == null) {
			modelPackage = Express2ecorePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case Express2ecorePackage.TYPE_MAP: {
				TypeMap typeMap = (TypeMap)theEObject;
				T result = caseTypeMap(typeMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Express2ecorePackage.ENTITY2_CLASS: {
				Entity2Class entity2Class = (Entity2Class)theEObject;
				T result = caseEntity2Class(entity2Class);
				if (result == null) result = caseTypeMap(entity2Class);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Express2ecorePackage.SCHEMA2_PACKAGE: {
				Schema2Package schema2Package = (Schema2Package)theEObject;
				T result = caseSchema2Package(schema2Package);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Express2ecorePackage.ATTRIBUTE2_FEATURE: {
				Attribute2Feature attribute2Feature = (Attribute2Feature)theEObject;
				T result = caseAttribute2Feature(attribute2Feature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Express2ecorePackage.ATTRIBUTE2_REFERENCE: {
				Attribute2Reference attribute2Reference = (Attribute2Reference)theEObject;
				T result = caseAttribute2Reference(attribute2Reference);
				if (result == null) result = caseAttribute2Feature(attribute2Reference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Express2ecorePackage.ATTRIBUTE2_ATTRIBUTE: {
				Attribute2Attribute attribute2Attribute = (Attribute2Attribute)theEObject;
				T result = caseAttribute2Attribute(attribute2Attribute);
				if (result == null) result = caseAttribute2Feature(attribute2Attribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Express2ecorePackage.ENTITY_SELECT: {
				EntitySelect entitySelect = (EntitySelect)theEObject;
				T result = caseEntitySelect(entitySelect);
				if (result == null) result = caseTypeMap(entitySelect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Express2ecorePackage.NON_ENTITY_SELECT: {
				NonEntitySelect nonEntitySelect = (NonEntitySelect)theEObject;
				T result = caseNonEntitySelect(nonEntitySelect);
				if (result == null) result = caseTypeMap(nonEntitySelect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Express2ecorePackage.SELECT_MEMBER2_FEATURE: {
				SelectMember2Feature selectMember2Feature = (SelectMember2Feature)theEObject;
				T result = caseSelectMember2Feature(selectMember2Feature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeMap(TypeMap object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity2 Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity2 Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntity2Class(Entity2Class object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Schema2 Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Schema2 Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSchema2Package(Schema2Package object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute2 Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute2 Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttribute2Feature(Attribute2Feature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute2 Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute2 Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttribute2Reference(Attribute2Reference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute2 Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute2 Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttribute2Attribute(Attribute2Attribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity Select</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity Select</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntitySelect(EntitySelect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Non Entity Select</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Non Entity Select</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNonEntitySelect(NonEntitySelect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Select Member2 Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Select Member2 Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSelectMember2Feature(SelectMember2Feature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //Express2ecoreSwitch
