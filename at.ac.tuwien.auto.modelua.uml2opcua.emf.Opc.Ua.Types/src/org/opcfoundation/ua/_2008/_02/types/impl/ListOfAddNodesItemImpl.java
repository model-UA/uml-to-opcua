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

import org.opcfoundation.ua._2008._02.types.AddNodesItem;
import org.opcfoundation.ua._2008._02.types.ListOfAddNodesItem;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Of Add Nodes Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ListOfAddNodesItemImpl#getAddNodesItem <em>Add Nodes Item</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListOfAddNodesItemImpl extends MinimalEObjectImpl.Container implements ListOfAddNodesItem {
	/**
	 * The cached value of the '{@link #getAddNodesItem() <em>Add Nodes Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddNodesItem()
	 * @generated
	 * @ordered
	 */
	protected EList<AddNodesItem> addNodesItem;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListOfAddNodesItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getListOfAddNodesItem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AddNodesItem> getAddNodesItem() {
		if (addNodesItem == null) {
			addNodesItem = new EObjectContainmentEList<AddNodesItem>(AddNodesItem.class, this, TypesPackage.LIST_OF_ADD_NODES_ITEM__ADD_NODES_ITEM);
		}
		return addNodesItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.LIST_OF_ADD_NODES_ITEM__ADD_NODES_ITEM:
				return ((InternalEList<?>)getAddNodesItem()).basicRemove(otherEnd, msgs);
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
			case TypesPackage.LIST_OF_ADD_NODES_ITEM__ADD_NODES_ITEM:
				return getAddNodesItem();
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
			case TypesPackage.LIST_OF_ADD_NODES_ITEM__ADD_NODES_ITEM:
				getAddNodesItem().clear();
				getAddNodesItem().addAll((Collection<? extends AddNodesItem>)newValue);
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
			case TypesPackage.LIST_OF_ADD_NODES_ITEM__ADD_NODES_ITEM:
				getAddNodesItem().clear();
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
			case TypesPackage.LIST_OF_ADD_NODES_ITEM__ADD_NODES_ITEM:
				return addNodesItem != null && !addNodesItem.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ListOfAddNodesItemImpl
