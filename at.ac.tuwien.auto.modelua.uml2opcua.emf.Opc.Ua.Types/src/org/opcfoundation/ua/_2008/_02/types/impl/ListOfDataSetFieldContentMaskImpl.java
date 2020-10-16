/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.opcfoundation.ua._2008._02.types.ListOfDataSetFieldContentMask;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Of Data Set Field Content Mask</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ListOfDataSetFieldContentMaskImpl#getDataSetFieldContentMask <em>Data Set Field Content Mask</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListOfDataSetFieldContentMaskImpl extends MinimalEObjectImpl.Container implements ListOfDataSetFieldContentMask {
	/**
	 * The cached value of the '{@link #getDataSetFieldContentMask() <em>Data Set Field Content Mask</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSetFieldContentMask()
	 * @generated
	 * @ordered
	 */
	protected EList<Long> dataSetFieldContentMask;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListOfDataSetFieldContentMaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getListOfDataSetFieldContentMask();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Long> getDataSetFieldContentMask() {
		if (dataSetFieldContentMask == null) {
			dataSetFieldContentMask = new EDataTypeEList<Long>(Long.class, this, TypesPackage.LIST_OF_DATA_SET_FIELD_CONTENT_MASK__DATA_SET_FIELD_CONTENT_MASK);
		}
		return dataSetFieldContentMask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TypesPackage.LIST_OF_DATA_SET_FIELD_CONTENT_MASK__DATA_SET_FIELD_CONTENT_MASK:
				return getDataSetFieldContentMask();
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
			case TypesPackage.LIST_OF_DATA_SET_FIELD_CONTENT_MASK__DATA_SET_FIELD_CONTENT_MASK:
				getDataSetFieldContentMask().clear();
				getDataSetFieldContentMask().addAll((Collection<? extends Long>)newValue);
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
			case TypesPackage.LIST_OF_DATA_SET_FIELD_CONTENT_MASK__DATA_SET_FIELD_CONTENT_MASK:
				getDataSetFieldContentMask().clear();
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
			case TypesPackage.LIST_OF_DATA_SET_FIELD_CONTENT_MASK__DATA_SET_FIELD_CONTENT_MASK:
				return dataSetFieldContentMask != null && !dataSetFieldContentMask.isEmpty();
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
		result.append(" (dataSetFieldContentMask: ");
		result.append(dataSetFieldContentMask);
		result.append(')');
		return result.toString();
	}

} //ListOfDataSetFieldContentMaskImpl
