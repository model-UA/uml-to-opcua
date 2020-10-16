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

import org.opcfoundation.ua._2008._02.types.ListOfWriterGroupDataType;
import org.opcfoundation.ua._2008._02.types.TypesPackage;
import org.opcfoundation.ua._2008._02.types.WriterGroupDataType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Of Writer Group Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ListOfWriterGroupDataTypeImpl#getWriterGroupDataType <em>Writer Group Data Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListOfWriterGroupDataTypeImpl extends MinimalEObjectImpl.Container implements ListOfWriterGroupDataType {
	/**
	 * The cached value of the '{@link #getWriterGroupDataType() <em>Writer Group Data Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWriterGroupDataType()
	 * @generated
	 * @ordered
	 */
	protected EList<WriterGroupDataType> writerGroupDataType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListOfWriterGroupDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getListOfWriterGroupDataType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WriterGroupDataType> getWriterGroupDataType() {
		if (writerGroupDataType == null) {
			writerGroupDataType = new EObjectContainmentEList<WriterGroupDataType>(WriterGroupDataType.class, this, TypesPackage.LIST_OF_WRITER_GROUP_DATA_TYPE__WRITER_GROUP_DATA_TYPE);
		}
		return writerGroupDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.LIST_OF_WRITER_GROUP_DATA_TYPE__WRITER_GROUP_DATA_TYPE:
				return ((InternalEList<?>)getWriterGroupDataType()).basicRemove(otherEnd, msgs);
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
			case TypesPackage.LIST_OF_WRITER_GROUP_DATA_TYPE__WRITER_GROUP_DATA_TYPE:
				return getWriterGroupDataType();
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
			case TypesPackage.LIST_OF_WRITER_GROUP_DATA_TYPE__WRITER_GROUP_DATA_TYPE:
				getWriterGroupDataType().clear();
				getWriterGroupDataType().addAll((Collection<? extends WriterGroupDataType>)newValue);
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
			case TypesPackage.LIST_OF_WRITER_GROUP_DATA_TYPE__WRITER_GROUP_DATA_TYPE:
				getWriterGroupDataType().clear();
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
			case TypesPackage.LIST_OF_WRITER_GROUP_DATA_TYPE__WRITER_GROUP_DATA_TYPE:
				return writerGroupDataType != null && !writerGroupDataType.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ListOfWriterGroupDataTypeImpl
