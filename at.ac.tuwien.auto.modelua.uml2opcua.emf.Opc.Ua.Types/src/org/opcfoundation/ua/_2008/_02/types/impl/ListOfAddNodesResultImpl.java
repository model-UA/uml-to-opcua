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

import org.opcfoundation.ua._2008._02.types.AddNodesResult;
import org.opcfoundation.ua._2008._02.types.ListOfAddNodesResult;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Of Add Nodes Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ListOfAddNodesResultImpl#getAddNodesResult <em>Add Nodes Result</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListOfAddNodesResultImpl extends MinimalEObjectImpl.Container implements ListOfAddNodesResult {
	/**
	 * The cached value of the '{@link #getAddNodesResult() <em>Add Nodes Result</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddNodesResult()
	 * @generated
	 * @ordered
	 */
	protected EList<AddNodesResult> addNodesResult;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListOfAddNodesResultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getListOfAddNodesResult();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AddNodesResult> getAddNodesResult() {
		if (addNodesResult == null) {
			addNodesResult = new EObjectContainmentEList<AddNodesResult>(AddNodesResult.class, this, TypesPackage.LIST_OF_ADD_NODES_RESULT__ADD_NODES_RESULT);
		}
		return addNodesResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.LIST_OF_ADD_NODES_RESULT__ADD_NODES_RESULT:
				return ((InternalEList<?>)getAddNodesResult()).basicRemove(otherEnd, msgs);
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
			case TypesPackage.LIST_OF_ADD_NODES_RESULT__ADD_NODES_RESULT:
				return getAddNodesResult();
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
			case TypesPackage.LIST_OF_ADD_NODES_RESULT__ADD_NODES_RESULT:
				getAddNodesResult().clear();
				getAddNodesResult().addAll((Collection<? extends AddNodesResult>)newValue);
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
			case TypesPackage.LIST_OF_ADD_NODES_RESULT__ADD_NODES_RESULT:
				getAddNodesResult().clear();
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
			case TypesPackage.LIST_OF_ADD_NODES_RESULT__ADD_NODES_RESULT:
				return addNodesResult != null && !addNodesResult.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ListOfAddNodesResultImpl
