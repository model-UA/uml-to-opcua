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

import org.opcfoundation.ua._2008._02.types.ListOfReaderGroupTransportDataType;
import org.opcfoundation.ua._2008._02.types.ReaderGroupTransportDataType;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Of Reader Group Transport Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ListOfReaderGroupTransportDataTypeImpl#getReaderGroupTransportDataType <em>Reader Group Transport Data Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListOfReaderGroupTransportDataTypeImpl extends MinimalEObjectImpl.Container implements ListOfReaderGroupTransportDataType {
	/**
	 * The cached value of the '{@link #getReaderGroupTransportDataType() <em>Reader Group Transport Data Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReaderGroupTransportDataType()
	 * @generated
	 * @ordered
	 */
	protected EList<ReaderGroupTransportDataType> readerGroupTransportDataType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListOfReaderGroupTransportDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getListOfReaderGroupTransportDataType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReaderGroupTransportDataType> getReaderGroupTransportDataType() {
		if (readerGroupTransportDataType == null) {
			readerGroupTransportDataType = new EObjectContainmentEList<ReaderGroupTransportDataType>(ReaderGroupTransportDataType.class, this, TypesPackage.LIST_OF_READER_GROUP_TRANSPORT_DATA_TYPE__READER_GROUP_TRANSPORT_DATA_TYPE);
		}
		return readerGroupTransportDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.LIST_OF_READER_GROUP_TRANSPORT_DATA_TYPE__READER_GROUP_TRANSPORT_DATA_TYPE:
				return ((InternalEList<?>)getReaderGroupTransportDataType()).basicRemove(otherEnd, msgs);
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
			case TypesPackage.LIST_OF_READER_GROUP_TRANSPORT_DATA_TYPE__READER_GROUP_TRANSPORT_DATA_TYPE:
				return getReaderGroupTransportDataType();
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
			case TypesPackage.LIST_OF_READER_GROUP_TRANSPORT_DATA_TYPE__READER_GROUP_TRANSPORT_DATA_TYPE:
				getReaderGroupTransportDataType().clear();
				getReaderGroupTransportDataType().addAll((Collection<? extends ReaderGroupTransportDataType>)newValue);
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
			case TypesPackage.LIST_OF_READER_GROUP_TRANSPORT_DATA_TYPE__READER_GROUP_TRANSPORT_DATA_TYPE:
				getReaderGroupTransportDataType().clear();
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
			case TypesPackage.LIST_OF_READER_GROUP_TRANSPORT_DATA_TYPE__READER_GROUP_TRANSPORT_DATA_TYPE:
				return readerGroupTransportDataType != null && !readerGroupTransportDataType.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ListOfReaderGroupTransportDataTypeImpl
