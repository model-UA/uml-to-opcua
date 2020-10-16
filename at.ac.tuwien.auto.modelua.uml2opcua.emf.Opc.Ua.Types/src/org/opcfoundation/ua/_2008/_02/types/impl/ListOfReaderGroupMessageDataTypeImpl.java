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

import org.opcfoundation.ua._2008._02.types.ListOfReaderGroupMessageDataType;
import org.opcfoundation.ua._2008._02.types.ReaderGroupMessageDataType;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Of Reader Group Message Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ListOfReaderGroupMessageDataTypeImpl#getReaderGroupMessageDataType <em>Reader Group Message Data Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListOfReaderGroupMessageDataTypeImpl extends MinimalEObjectImpl.Container implements ListOfReaderGroupMessageDataType {
	/**
	 * The cached value of the '{@link #getReaderGroupMessageDataType() <em>Reader Group Message Data Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReaderGroupMessageDataType()
	 * @generated
	 * @ordered
	 */
	protected EList<ReaderGroupMessageDataType> readerGroupMessageDataType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListOfReaderGroupMessageDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getListOfReaderGroupMessageDataType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReaderGroupMessageDataType> getReaderGroupMessageDataType() {
		if (readerGroupMessageDataType == null) {
			readerGroupMessageDataType = new EObjectContainmentEList<ReaderGroupMessageDataType>(ReaderGroupMessageDataType.class, this, TypesPackage.LIST_OF_READER_GROUP_MESSAGE_DATA_TYPE__READER_GROUP_MESSAGE_DATA_TYPE);
		}
		return readerGroupMessageDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.LIST_OF_READER_GROUP_MESSAGE_DATA_TYPE__READER_GROUP_MESSAGE_DATA_TYPE:
				return ((InternalEList<?>)getReaderGroupMessageDataType()).basicRemove(otherEnd, msgs);
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
			case TypesPackage.LIST_OF_READER_GROUP_MESSAGE_DATA_TYPE__READER_GROUP_MESSAGE_DATA_TYPE:
				return getReaderGroupMessageDataType();
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
			case TypesPackage.LIST_OF_READER_GROUP_MESSAGE_DATA_TYPE__READER_GROUP_MESSAGE_DATA_TYPE:
				getReaderGroupMessageDataType().clear();
				getReaderGroupMessageDataType().addAll((Collection<? extends ReaderGroupMessageDataType>)newValue);
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
			case TypesPackage.LIST_OF_READER_GROUP_MESSAGE_DATA_TYPE__READER_GROUP_MESSAGE_DATA_TYPE:
				getReaderGroupMessageDataType().clear();
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
			case TypesPackage.LIST_OF_READER_GROUP_MESSAGE_DATA_TYPE__READER_GROUP_MESSAGE_DATA_TYPE:
				return readerGroupMessageDataType != null && !readerGroupMessageDataType.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ListOfReaderGroupMessageDataTypeImpl
