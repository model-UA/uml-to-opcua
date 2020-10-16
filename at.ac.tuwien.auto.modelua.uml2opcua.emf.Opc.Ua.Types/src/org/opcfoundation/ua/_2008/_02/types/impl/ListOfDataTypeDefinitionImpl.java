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

import org.opcfoundation.ua._2008._02.types.DataTypeDefinition;
import org.opcfoundation.ua._2008._02.types.ListOfDataTypeDefinition;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Of Data Type Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ListOfDataTypeDefinitionImpl#getDataTypeDefinition <em>Data Type Definition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListOfDataTypeDefinitionImpl extends MinimalEObjectImpl.Container implements ListOfDataTypeDefinition {
	/**
	 * The cached value of the '{@link #getDataTypeDefinition() <em>Data Type Definition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataTypeDefinition()
	 * @generated
	 * @ordered
	 */
	protected EList<DataTypeDefinition> dataTypeDefinition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListOfDataTypeDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getListOfDataTypeDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataTypeDefinition> getDataTypeDefinition() {
		if (dataTypeDefinition == null) {
			dataTypeDefinition = new EObjectContainmentEList<DataTypeDefinition>(DataTypeDefinition.class, this, TypesPackage.LIST_OF_DATA_TYPE_DEFINITION__DATA_TYPE_DEFINITION);
		}
		return dataTypeDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.LIST_OF_DATA_TYPE_DEFINITION__DATA_TYPE_DEFINITION:
				return ((InternalEList<?>)getDataTypeDefinition()).basicRemove(otherEnd, msgs);
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
			case TypesPackage.LIST_OF_DATA_TYPE_DEFINITION__DATA_TYPE_DEFINITION:
				return getDataTypeDefinition();
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
			case TypesPackage.LIST_OF_DATA_TYPE_DEFINITION__DATA_TYPE_DEFINITION:
				getDataTypeDefinition().clear();
				getDataTypeDefinition().addAll((Collection<? extends DataTypeDefinition>)newValue);
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
			case TypesPackage.LIST_OF_DATA_TYPE_DEFINITION__DATA_TYPE_DEFINITION:
				getDataTypeDefinition().clear();
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
			case TypesPackage.LIST_OF_DATA_TYPE_DEFINITION__DATA_TYPE_DEFINITION:
				return dataTypeDefinition != null && !dataTypeDefinition.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ListOfDataTypeDefinitionImpl
