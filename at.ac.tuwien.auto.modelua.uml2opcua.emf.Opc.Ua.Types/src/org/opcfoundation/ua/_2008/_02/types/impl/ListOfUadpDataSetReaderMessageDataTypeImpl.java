/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.opcfoundation.ua._2008._02.types.ListOfUadpDataSetReaderMessageDataType;
import org.opcfoundation.ua._2008._02.types.TypesPackage;
import org.opcfoundation.ua._2008._02.types.UadpDataSetReaderMessageDataType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Of Uadp Data Set Reader Message Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ListOfUadpDataSetReaderMessageDataTypeImpl#getUadpDataSetReaderMessageDataType <em>Uadp Data Set Reader Message Data Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListOfUadpDataSetReaderMessageDataTypeImpl extends MinimalEObjectImpl.Container implements ListOfUadpDataSetReaderMessageDataType {
	/**
	 * The cached value of the '{@link #getUadpDataSetReaderMessageDataType() <em>Uadp Data Set Reader Message Data Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUadpDataSetReaderMessageDataType()
	 * @generated
	 * @ordered
	 */
	protected EList<UadpDataSetReaderMessageDataType> uadpDataSetReaderMessageDataType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListOfUadpDataSetReaderMessageDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getListOfUadpDataSetReaderMessageDataType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UadpDataSetReaderMessageDataType> getUadpDataSetReaderMessageDataType() {
		if (uadpDataSetReaderMessageDataType == null) {
			uadpDataSetReaderMessageDataType = new EObjectContainmentEList<UadpDataSetReaderMessageDataType>(UadpDataSetReaderMessageDataType.class, this, TypesPackage.LIST_OF_UADP_DATA_SET_READER_MESSAGE_DATA_TYPE__UADP_DATA_SET_READER_MESSAGE_DATA_TYPE);
		}
		return uadpDataSetReaderMessageDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.LIST_OF_UADP_DATA_SET_READER_MESSAGE_DATA_TYPE__UADP_DATA_SET_READER_MESSAGE_DATA_TYPE:
				return ((InternalEList<?>)getUadpDataSetReaderMessageDataType()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TypesPackage.LIST_OF_UADP_DATA_SET_READER_MESSAGE_DATA_TYPE__UADP_DATA_SET_READER_MESSAGE_DATA_TYPE:
				return getUadpDataSetReaderMessageDataType();
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
			case TypesPackage.LIST_OF_UADP_DATA_SET_READER_MESSAGE_DATA_TYPE__UADP_DATA_SET_READER_MESSAGE_DATA_TYPE:
				getUadpDataSetReaderMessageDataType().clear();
				getUadpDataSetReaderMessageDataType().addAll((Collection<? extends UadpDataSetReaderMessageDataType>)newValue);
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
			case TypesPackage.LIST_OF_UADP_DATA_SET_READER_MESSAGE_DATA_TYPE__UADP_DATA_SET_READER_MESSAGE_DATA_TYPE:
				getUadpDataSetReaderMessageDataType().clear();
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
			case TypesPackage.LIST_OF_UADP_DATA_SET_READER_MESSAGE_DATA_TYPE__UADP_DATA_SET_READER_MESSAGE_DATA_TYPE:
				return uadpDataSetReaderMessageDataType != null && !uadpDataSetReaderMessageDataType.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ListOfUadpDataSetReaderMessageDataTypeImpl
