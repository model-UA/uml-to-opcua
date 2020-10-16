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

import org.opcfoundation.ua._2008._02.types.ListOfWriterGroupMessageDataType;
import org.opcfoundation.ua._2008._02.types.TypesPackage;
import org.opcfoundation.ua._2008._02.types.WriterGroupMessageDataType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Of Writer Group Message Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ListOfWriterGroupMessageDataTypeImpl#getWriterGroupMessageDataType <em>Writer Group Message Data Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListOfWriterGroupMessageDataTypeImpl extends MinimalEObjectImpl.Container implements ListOfWriterGroupMessageDataType {
	/**
	 * The cached value of the '{@link #getWriterGroupMessageDataType() <em>Writer Group Message Data Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWriterGroupMessageDataType()
	 * @generated
	 * @ordered
	 */
	protected EList<WriterGroupMessageDataType> writerGroupMessageDataType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListOfWriterGroupMessageDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getListOfWriterGroupMessageDataType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WriterGroupMessageDataType> getWriterGroupMessageDataType() {
		if (writerGroupMessageDataType == null) {
			writerGroupMessageDataType = new EObjectContainmentEList<WriterGroupMessageDataType>(WriterGroupMessageDataType.class, this, TypesPackage.LIST_OF_WRITER_GROUP_MESSAGE_DATA_TYPE__WRITER_GROUP_MESSAGE_DATA_TYPE);
		}
		return writerGroupMessageDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.LIST_OF_WRITER_GROUP_MESSAGE_DATA_TYPE__WRITER_GROUP_MESSAGE_DATA_TYPE:
				return ((InternalEList<?>)getWriterGroupMessageDataType()).basicRemove(otherEnd, msgs);
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
			case TypesPackage.LIST_OF_WRITER_GROUP_MESSAGE_DATA_TYPE__WRITER_GROUP_MESSAGE_DATA_TYPE:
				return getWriterGroupMessageDataType();
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
			case TypesPackage.LIST_OF_WRITER_GROUP_MESSAGE_DATA_TYPE__WRITER_GROUP_MESSAGE_DATA_TYPE:
				getWriterGroupMessageDataType().clear();
				getWriterGroupMessageDataType().addAll((Collection<? extends WriterGroupMessageDataType>)newValue);
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
			case TypesPackage.LIST_OF_WRITER_GROUP_MESSAGE_DATA_TYPE__WRITER_GROUP_MESSAGE_DATA_TYPE:
				getWriterGroupMessageDataType().clear();
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
			case TypesPackage.LIST_OF_WRITER_GROUP_MESSAGE_DATA_TYPE__WRITER_GROUP_MESSAGE_DATA_TYPE:
				return writerGroupMessageDataType != null && !writerGroupMessageDataType.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ListOfWriterGroupMessageDataTypeImpl
