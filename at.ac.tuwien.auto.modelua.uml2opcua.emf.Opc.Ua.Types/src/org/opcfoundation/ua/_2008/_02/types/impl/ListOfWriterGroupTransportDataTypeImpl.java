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

import org.opcfoundation.ua._2008._02.types.ListOfWriterGroupTransportDataType;
import org.opcfoundation.ua._2008._02.types.TypesPackage;
import org.opcfoundation.ua._2008._02.types.WriterGroupTransportDataType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Of Writer Group Transport Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ListOfWriterGroupTransportDataTypeImpl#getWriterGroupTransportDataType <em>Writer Group Transport Data Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListOfWriterGroupTransportDataTypeImpl extends MinimalEObjectImpl.Container implements ListOfWriterGroupTransportDataType {
	/**
	 * The cached value of the '{@link #getWriterGroupTransportDataType() <em>Writer Group Transport Data Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWriterGroupTransportDataType()
	 * @generated
	 * @ordered
	 */
	protected EList<WriterGroupTransportDataType> writerGroupTransportDataType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListOfWriterGroupTransportDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getListOfWriterGroupTransportDataType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WriterGroupTransportDataType> getWriterGroupTransportDataType() {
		if (writerGroupTransportDataType == null) {
			writerGroupTransportDataType = new EObjectContainmentEList<WriterGroupTransportDataType>(WriterGroupTransportDataType.class, this, TypesPackage.LIST_OF_WRITER_GROUP_TRANSPORT_DATA_TYPE__WRITER_GROUP_TRANSPORT_DATA_TYPE);
		}
		return writerGroupTransportDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.LIST_OF_WRITER_GROUP_TRANSPORT_DATA_TYPE__WRITER_GROUP_TRANSPORT_DATA_TYPE:
				return ((InternalEList<?>)getWriterGroupTransportDataType()).basicRemove(otherEnd, msgs);
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
			case TypesPackage.LIST_OF_WRITER_GROUP_TRANSPORT_DATA_TYPE__WRITER_GROUP_TRANSPORT_DATA_TYPE:
				return getWriterGroupTransportDataType();
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
			case TypesPackage.LIST_OF_WRITER_GROUP_TRANSPORT_DATA_TYPE__WRITER_GROUP_TRANSPORT_DATA_TYPE:
				getWriterGroupTransportDataType().clear();
				getWriterGroupTransportDataType().addAll((Collection<? extends WriterGroupTransportDataType>)newValue);
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
			case TypesPackage.LIST_OF_WRITER_GROUP_TRANSPORT_DATA_TYPE__WRITER_GROUP_TRANSPORT_DATA_TYPE:
				getWriterGroupTransportDataType().clear();
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
			case TypesPackage.LIST_OF_WRITER_GROUP_TRANSPORT_DATA_TYPE__WRITER_GROUP_TRANSPORT_DATA_TYPE:
				return writerGroupTransportDataType != null && !writerGroupTransportDataType.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ListOfWriterGroupTransportDataTypeImpl
