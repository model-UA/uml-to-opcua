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

import org.opcfoundation.ua._2008._02.types.ListOfUadpDataSetWriterMessageDataType;
import org.opcfoundation.ua._2008._02.types.TypesPackage;
import org.opcfoundation.ua._2008._02.types.UadpDataSetWriterMessageDataType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Of Uadp Data Set Writer Message Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ListOfUadpDataSetWriterMessageDataTypeImpl#getUadpDataSetWriterMessageDataType <em>Uadp Data Set Writer Message Data Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListOfUadpDataSetWriterMessageDataTypeImpl extends MinimalEObjectImpl.Container implements ListOfUadpDataSetWriterMessageDataType {
	/**
	 * The cached value of the '{@link #getUadpDataSetWriterMessageDataType() <em>Uadp Data Set Writer Message Data Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUadpDataSetWriterMessageDataType()
	 * @generated
	 * @ordered
	 */
	protected EList<UadpDataSetWriterMessageDataType> uadpDataSetWriterMessageDataType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListOfUadpDataSetWriterMessageDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getListOfUadpDataSetWriterMessageDataType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UadpDataSetWriterMessageDataType> getUadpDataSetWriterMessageDataType() {
		if (uadpDataSetWriterMessageDataType == null) {
			uadpDataSetWriterMessageDataType = new EObjectContainmentEList<UadpDataSetWriterMessageDataType>(UadpDataSetWriterMessageDataType.class, this, TypesPackage.LIST_OF_UADP_DATA_SET_WRITER_MESSAGE_DATA_TYPE__UADP_DATA_SET_WRITER_MESSAGE_DATA_TYPE);
		}
		return uadpDataSetWriterMessageDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.LIST_OF_UADP_DATA_SET_WRITER_MESSAGE_DATA_TYPE__UADP_DATA_SET_WRITER_MESSAGE_DATA_TYPE:
				return ((InternalEList<?>)getUadpDataSetWriterMessageDataType()).basicRemove(otherEnd, msgs);
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
			case TypesPackage.LIST_OF_UADP_DATA_SET_WRITER_MESSAGE_DATA_TYPE__UADP_DATA_SET_WRITER_MESSAGE_DATA_TYPE:
				return getUadpDataSetWriterMessageDataType();
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
			case TypesPackage.LIST_OF_UADP_DATA_SET_WRITER_MESSAGE_DATA_TYPE__UADP_DATA_SET_WRITER_MESSAGE_DATA_TYPE:
				getUadpDataSetWriterMessageDataType().clear();
				getUadpDataSetWriterMessageDataType().addAll((Collection<? extends UadpDataSetWriterMessageDataType>)newValue);
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
			case TypesPackage.LIST_OF_UADP_DATA_SET_WRITER_MESSAGE_DATA_TYPE__UADP_DATA_SET_WRITER_MESSAGE_DATA_TYPE:
				getUadpDataSetWriterMessageDataType().clear();
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
			case TypesPackage.LIST_OF_UADP_DATA_SET_WRITER_MESSAGE_DATA_TYPE__UADP_DATA_SET_WRITER_MESSAGE_DATA_TYPE:
				return uadpDataSetWriterMessageDataType != null && !uadpDataSetWriterMessageDataType.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ListOfUadpDataSetWriterMessageDataTypeImpl
