/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.opcfoundation.ua._2008._02.types.IdentityCriteriaType;
import org.opcfoundation.ua._2008._02.types.ListOfIdentityCriteriaType;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Of Identity Criteria Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ListOfIdentityCriteriaTypeImpl#getIdentityCriteriaType <em>Identity Criteria Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListOfIdentityCriteriaTypeImpl extends MinimalEObjectImpl.Container implements ListOfIdentityCriteriaType {
	/**
	 * The cached value of the '{@link #getIdentityCriteriaType() <em>Identity Criteria Type</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentityCriteriaType()
	 * @generated
	 * @ordered
	 */
	protected EList<IdentityCriteriaType> identityCriteriaType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListOfIdentityCriteriaTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getListOfIdentityCriteriaType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IdentityCriteriaType> getIdentityCriteriaType() {
		if (identityCriteriaType == null) {
			identityCriteriaType = new EDataTypeEList<IdentityCriteriaType>(IdentityCriteriaType.class, this, TypesPackage.LIST_OF_IDENTITY_CRITERIA_TYPE__IDENTITY_CRITERIA_TYPE);
		}
		return identityCriteriaType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TypesPackage.LIST_OF_IDENTITY_CRITERIA_TYPE__IDENTITY_CRITERIA_TYPE:
				return getIdentityCriteriaType();
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
			case TypesPackage.LIST_OF_IDENTITY_CRITERIA_TYPE__IDENTITY_CRITERIA_TYPE:
				getIdentityCriteriaType().clear();
				getIdentityCriteriaType().addAll((Collection<? extends IdentityCriteriaType>)newValue);
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
			case TypesPackage.LIST_OF_IDENTITY_CRITERIA_TYPE__IDENTITY_CRITERIA_TYPE:
				getIdentityCriteriaType().clear();
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
			case TypesPackage.LIST_OF_IDENTITY_CRITERIA_TYPE__IDENTITY_CRITERIA_TYPE:
				return identityCriteriaType != null && !identityCriteriaType.isEmpty();
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
		result.append(" (identityCriteriaType: ");
		result.append(identityCriteriaType);
		result.append(')');
		return result.toString();
	}

} //ListOfIdentityCriteriaTypeImpl
