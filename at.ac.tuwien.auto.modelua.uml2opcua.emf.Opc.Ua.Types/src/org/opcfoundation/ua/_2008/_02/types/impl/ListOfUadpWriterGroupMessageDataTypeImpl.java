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

import org.opcfoundation.ua._2008._02.types.ListOfUadpWriterGroupMessageDataType;
import org.opcfoundation.ua._2008._02.types.TypesPackage;
import org.opcfoundation.ua._2008._02.types.UadpWriterGroupMessageDataType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Of Uadp Writer Group Message Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ListOfUadpWriterGroupMessageDataTypeImpl#getUadpWriterGroupMessageDataType <em>Uadp Writer Group Message Data Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListOfUadpWriterGroupMessageDataTypeImpl extends MinimalEObjectImpl.Container implements ListOfUadpWriterGroupMessageDataType {
	/**
	 * The cached value of the '{@link #getUadpWriterGroupMessageDataType() <em>Uadp Writer Group Message Data Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUadpWriterGroupMessageDataType()
	 * @generated
	 * @ordered
	 */
	protected EList<UadpWriterGroupMessageDataType> uadpWriterGroupMessageDataType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListOfUadpWriterGroupMessageDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getListOfUadpWriterGroupMessageDataType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UadpWriterGroupMessageDataType> getUadpWriterGroupMessageDataType() {
		if (uadpWriterGroupMessageDataType == null) {
			uadpWriterGroupMessageDataType = new EObjectContainmentEList<UadpWriterGroupMessageDataType>(UadpWriterGroupMessageDataType.class, this, TypesPackage.LIST_OF_UADP_WRITER_GROUP_MESSAGE_DATA_TYPE__UADP_WRITER_GROUP_MESSAGE_DATA_TYPE);
		}
		return uadpWriterGroupMessageDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.LIST_OF_UADP_WRITER_GROUP_MESSAGE_DATA_TYPE__UADP_WRITER_GROUP_MESSAGE_DATA_TYPE:
				return ((InternalEList<?>)getUadpWriterGroupMessageDataType()).basicRemove(otherEnd, msgs);
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
			case TypesPackage.LIST_OF_UADP_WRITER_GROUP_MESSAGE_DATA_TYPE__UADP_WRITER_GROUP_MESSAGE_DATA_TYPE:
				return getUadpWriterGroupMessageDataType();
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
			case TypesPackage.LIST_OF_UADP_WRITER_GROUP_MESSAGE_DATA_TYPE__UADP_WRITER_GROUP_MESSAGE_DATA_TYPE:
				getUadpWriterGroupMessageDataType().clear();
				getUadpWriterGroupMessageDataType().addAll((Collection<? extends UadpWriterGroupMessageDataType>)newValue);
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
			case TypesPackage.LIST_OF_UADP_WRITER_GROUP_MESSAGE_DATA_TYPE__UADP_WRITER_GROUP_MESSAGE_DATA_TYPE:
				getUadpWriterGroupMessageDataType().clear();
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
			case TypesPackage.LIST_OF_UADP_WRITER_GROUP_MESSAGE_DATA_TYPE__UADP_WRITER_GROUP_MESSAGE_DATA_TYPE:
				return uadpWriterGroupMessageDataType != null && !uadpWriterGroupMessageDataType.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ListOfUadpWriterGroupMessageDataTypeImpl
