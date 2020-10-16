/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.opcfoundation.ua._2008._02.types.DataSetOrderingType;
import org.opcfoundation.ua._2008._02.types.ListOfDataSetOrderingType;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Of Data Set Ordering Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ListOfDataSetOrderingTypeImpl#getDataSetOrderingType <em>Data Set Ordering Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListOfDataSetOrderingTypeImpl extends MinimalEObjectImpl.Container implements ListOfDataSetOrderingType {
	/**
	 * The cached value of the '{@link #getDataSetOrderingType() <em>Data Set Ordering Type</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSetOrderingType()
	 * @generated
	 * @ordered
	 */
	protected EList<DataSetOrderingType> dataSetOrderingType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListOfDataSetOrderingTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getListOfDataSetOrderingType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataSetOrderingType> getDataSetOrderingType() {
		if (dataSetOrderingType == null) {
			dataSetOrderingType = new EDataTypeEList<DataSetOrderingType>(DataSetOrderingType.class, this, TypesPackage.LIST_OF_DATA_SET_ORDERING_TYPE__DATA_SET_ORDERING_TYPE);
		}
		return dataSetOrderingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TypesPackage.LIST_OF_DATA_SET_ORDERING_TYPE__DATA_SET_ORDERING_TYPE:
				return getDataSetOrderingType();
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
			case TypesPackage.LIST_OF_DATA_SET_ORDERING_TYPE__DATA_SET_ORDERING_TYPE:
				getDataSetOrderingType().clear();
				getDataSetOrderingType().addAll((Collection<? extends DataSetOrderingType>)newValue);
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
			case TypesPackage.LIST_OF_DATA_SET_ORDERING_TYPE__DATA_SET_ORDERING_TYPE:
				getDataSetOrderingType().clear();
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
			case TypesPackage.LIST_OF_DATA_SET_ORDERING_TYPE__DATA_SET_ORDERING_TYPE:
				return dataSetOrderingType != null && !dataSetOrderingType.isEmpty();
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
		result.append(" (dataSetOrderingType: ");
		result.append(dataSetOrderingType);
		result.append(')');
		return result.toString();
	}

} //ListOfDataSetOrderingTypeImpl
