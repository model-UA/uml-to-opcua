/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.opcfoundation.ua._2008._02.types.ListOfOverrideValueHandling;
import org.opcfoundation.ua._2008._02.types.OverrideValueHandling;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Of Override Value Handling</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ListOfOverrideValueHandlingImpl#getOverrideValueHandling <em>Override Value Handling</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListOfOverrideValueHandlingImpl extends MinimalEObjectImpl.Container implements ListOfOverrideValueHandling {
	/**
	 * The cached value of the '{@link #getOverrideValueHandling() <em>Override Value Handling</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverrideValueHandling()
	 * @generated
	 * @ordered
	 */
	protected EList<OverrideValueHandling> overrideValueHandling;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListOfOverrideValueHandlingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getListOfOverrideValueHandling();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OverrideValueHandling> getOverrideValueHandling() {
		if (overrideValueHandling == null) {
			overrideValueHandling = new EDataTypeEList<OverrideValueHandling>(OverrideValueHandling.class, this, TypesPackage.LIST_OF_OVERRIDE_VALUE_HANDLING__OVERRIDE_VALUE_HANDLING);
		}
		return overrideValueHandling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TypesPackage.LIST_OF_OVERRIDE_VALUE_HANDLING__OVERRIDE_VALUE_HANDLING:
				return getOverrideValueHandling();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TypesPackage.LIST_OF_OVERRIDE_VALUE_HANDLING__OVERRIDE_VALUE_HANDLING:
				getOverrideValueHandling().clear();
				getOverrideValueHandling().addAll((Collection<? extends OverrideValueHandling>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TypesPackage.LIST_OF_OVERRIDE_VALUE_HANDLING__OVERRIDE_VALUE_HANDLING:
				getOverrideValueHandling().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TypesPackage.LIST_OF_OVERRIDE_VALUE_HANDLING__OVERRIDE_VALUE_HANDLING:
				return overrideValueHandling != null && !overrideValueHandling.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (overrideValueHandling: ");
		result.append(overrideValueHandling);
		result.append(')');
		return result.toString();
	}

} //ListOfOverrideValueHandlingImpl
