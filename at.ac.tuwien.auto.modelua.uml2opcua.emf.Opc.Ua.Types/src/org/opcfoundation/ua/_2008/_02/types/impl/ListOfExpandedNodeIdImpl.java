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

import org.opcfoundation.ua._2008._02.types.ExpandedNodeId;
import org.opcfoundation.ua._2008._02.types.ListOfExpandedNodeId;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Of Expanded Node Id</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ListOfExpandedNodeIdImpl#getExpandedNodeId <em>Expanded Node Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListOfExpandedNodeIdImpl extends MinimalEObjectImpl.Container implements ListOfExpandedNodeId {
	/**
	 * The cached value of the '{@link #getExpandedNodeId() <em>Expanded Node Id</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpandedNodeId()
	 * @generated
	 * @ordered
	 */
	protected EList<ExpandedNodeId> expandedNodeId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListOfExpandedNodeIdImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getListOfExpandedNodeId();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExpandedNodeId> getExpandedNodeId() {
		if (expandedNodeId == null) {
			expandedNodeId = new EObjectContainmentEList<ExpandedNodeId>(ExpandedNodeId.class, this, TypesPackage.LIST_OF_EXPANDED_NODE_ID__EXPANDED_NODE_ID);
		}
		return expandedNodeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.LIST_OF_EXPANDED_NODE_ID__EXPANDED_NODE_ID:
				return ((InternalEList<?>)getExpandedNodeId()).basicRemove(otherEnd, msgs);
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
			case TypesPackage.LIST_OF_EXPANDED_NODE_ID__EXPANDED_NODE_ID:
				return getExpandedNodeId();
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
			case TypesPackage.LIST_OF_EXPANDED_NODE_ID__EXPANDED_NODE_ID:
				getExpandedNodeId().clear();
				getExpandedNodeId().addAll((Collection<? extends ExpandedNodeId>)newValue);
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
			case TypesPackage.LIST_OF_EXPANDED_NODE_ID__EXPANDED_NODE_ID:
				getExpandedNodeId().clear();
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
			case TypesPackage.LIST_OF_EXPANDED_NODE_ID__EXPANDED_NODE_ID:
				return expandedNodeId != null && !expandedNodeId.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ListOfExpandedNodeIdImpl
