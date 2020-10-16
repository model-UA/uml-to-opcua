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

import org.opcfoundation.ua._2008._02.types.DeleteNodesItem;
import org.opcfoundation.ua._2008._02.types.ListOfDeleteNodesItem;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Of Delete Nodes Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ListOfDeleteNodesItemImpl#getDeleteNodesItem <em>Delete Nodes Item</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListOfDeleteNodesItemImpl extends MinimalEObjectImpl.Container implements ListOfDeleteNodesItem {
	/**
	 * The cached value of the '{@link #getDeleteNodesItem() <em>Delete Nodes Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeleteNodesItem()
	 * @generated
	 * @ordered
	 */
	protected EList<DeleteNodesItem> deleteNodesItem;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListOfDeleteNodesItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getListOfDeleteNodesItem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DeleteNodesItem> getDeleteNodesItem() {
		if (deleteNodesItem == null) {
			deleteNodesItem = new EObjectContainmentEList<DeleteNodesItem>(DeleteNodesItem.class, this, TypesPackage.LIST_OF_DELETE_NODES_ITEM__DELETE_NODES_ITEM);
		}
		return deleteNodesItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.LIST_OF_DELETE_NODES_ITEM__DELETE_NODES_ITEM:
				return ((InternalEList<?>)getDeleteNodesItem()).basicRemove(otherEnd, msgs);
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
			case TypesPackage.LIST_OF_DELETE_NODES_ITEM__DELETE_NODES_ITEM:
				return getDeleteNodesItem();
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
			case TypesPackage.LIST_OF_DELETE_NODES_ITEM__DELETE_NODES_ITEM:
				getDeleteNodesItem().clear();
				getDeleteNodesItem().addAll((Collection<? extends DeleteNodesItem>)newValue);
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
			case TypesPackage.LIST_OF_DELETE_NODES_ITEM__DELETE_NODES_ITEM:
				getDeleteNodesItem().clear();
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
			case TypesPackage.LIST_OF_DELETE_NODES_ITEM__DELETE_NODES_ITEM:
				return deleteNodesItem != null && !deleteNodesItem.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ListOfDeleteNodesItemImpl
