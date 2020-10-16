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

import org.opcfoundation.ua._2008._02.types.ListOfServerOnNetwork;
import org.opcfoundation.ua._2008._02.types.ServerOnNetwork;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Of Server On Network</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ListOfServerOnNetworkImpl#getServerOnNetwork <em>Server On Network</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListOfServerOnNetworkImpl extends MinimalEObjectImpl.Container implements ListOfServerOnNetwork {
	/**
	 * The cached value of the '{@link #getServerOnNetwork() <em>Server On Network</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerOnNetwork()
	 * @generated
	 * @ordered
	 */
	protected EList<ServerOnNetwork> serverOnNetwork;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListOfServerOnNetworkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getListOfServerOnNetwork();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServerOnNetwork> getServerOnNetwork() {
		if (serverOnNetwork == null) {
			serverOnNetwork = new EObjectContainmentEList<ServerOnNetwork>(ServerOnNetwork.class, this, TypesPackage.LIST_OF_SERVER_ON_NETWORK__SERVER_ON_NETWORK);
		}
		return serverOnNetwork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.LIST_OF_SERVER_ON_NETWORK__SERVER_ON_NETWORK:
				return ((InternalEList<?>)getServerOnNetwork()).basicRemove(otherEnd, msgs);
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
			case TypesPackage.LIST_OF_SERVER_ON_NETWORK__SERVER_ON_NETWORK:
				return getServerOnNetwork();
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
			case TypesPackage.LIST_OF_SERVER_ON_NETWORK__SERVER_ON_NETWORK:
				getServerOnNetwork().clear();
				getServerOnNetwork().addAll((Collection<? extends ServerOnNetwork>)newValue);
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
			case TypesPackage.LIST_OF_SERVER_ON_NETWORK__SERVER_ON_NETWORK:
				getServerOnNetwork().clear();
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
			case TypesPackage.LIST_OF_SERVER_ON_NETWORK__SERVER_ON_NETWORK:
				return serverOnNetwork != null && !serverOnNetwork.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ListOfServerOnNetworkImpl
