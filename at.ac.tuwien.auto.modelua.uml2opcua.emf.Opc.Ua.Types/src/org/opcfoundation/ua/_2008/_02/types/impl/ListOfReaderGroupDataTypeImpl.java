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

import org.opcfoundation.ua._2008._02.types.ListOfReaderGroupDataType;
import org.opcfoundation.ua._2008._02.types.ReaderGroupDataType;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Of Reader Group Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ListOfReaderGroupDataTypeImpl#getReaderGroupDataType <em>Reader Group Data Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListOfReaderGroupDataTypeImpl extends MinimalEObjectImpl.Container implements ListOfReaderGroupDataType {
	/**
	 * The cached value of the '{@link #getReaderGroupDataType() <em>Reader Group Data Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReaderGroupDataType()
	 * @generated
	 * @ordered
	 */
	protected EList<ReaderGroupDataType> readerGroupDataType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListOfReaderGroupDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getListOfReaderGroupDataType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReaderGroupDataType> getReaderGroupDataType() {
		if (readerGroupDataType == null) {
			readerGroupDataType = new EObjectContainmentEList<ReaderGroupDataType>(ReaderGroupDataType.class, this, TypesPackage.LIST_OF_READER_GROUP_DATA_TYPE__READER_GROUP_DATA_TYPE);
		}
		return readerGroupDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.LIST_OF_READER_GROUP_DATA_TYPE__READER_GROUP_DATA_TYPE:
				return ((InternalEList<?>)getReaderGroupDataType()).basicRemove(otherEnd, msgs);
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
			case TypesPackage.LIST_OF_READER_GROUP_DATA_TYPE__READER_GROUP_DATA_TYPE:
				return getReaderGroupDataType();
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
			case TypesPackage.LIST_OF_READER_GROUP_DATA_TYPE__READER_GROUP_DATA_TYPE:
				getReaderGroupDataType().clear();
				getReaderGroupDataType().addAll((Collection<? extends ReaderGroupDataType>)newValue);
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
			case TypesPackage.LIST_OF_READER_GROUP_DATA_TYPE__READER_GROUP_DATA_TYPE:
				getReaderGroupDataType().clear();
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
			case TypesPackage.LIST_OF_READER_GROUP_DATA_TYPE__READER_GROUP_DATA_TYPE:
				return readerGroupDataType != null && !readerGroupDataType.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ListOfReaderGroupDataTypeImpl
