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

import org.opcfoundation.ua._2008._02.types.ListOfRegisteredServer;
import org.opcfoundation.ua._2008._02.types.RegisteredServer;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Of Registered Server</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ListOfRegisteredServerImpl#getRegisteredServer <em>Registered Server</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListOfRegisteredServerImpl extends MinimalEObjectImpl.Container implements ListOfRegisteredServer {
	/**
	 * The cached value of the '{@link #getRegisteredServer() <em>Registered Server</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegisteredServer()
	 * @generated
	 * @ordered
	 */
	protected EList<RegisteredServer> registeredServer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListOfRegisteredServerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getListOfRegisteredServer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RegisteredServer> getRegisteredServer() {
		if (registeredServer == null) {
			registeredServer = new EObjectContainmentEList<RegisteredServer>(RegisteredServer.class, this, TypesPackage.LIST_OF_REGISTERED_SERVER__REGISTERED_SERVER);
		}
		return registeredServer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.LIST_OF_REGISTERED_SERVER__REGISTERED_SERVER:
				return ((InternalEList<?>)getRegisteredServer()).basicRemove(otherEnd, msgs);
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
			case TypesPackage.LIST_OF_REGISTERED_SERVER__REGISTERED_SERVER:
				return getRegisteredServer();
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
			case TypesPackage.LIST_OF_REGISTERED_SERVER__REGISTERED_SERVER:
				getRegisteredServer().clear();
				getRegisteredServer().addAll((Collection<? extends RegisteredServer>)newValue);
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
			case TypesPackage.LIST_OF_REGISTERED_SERVER__REGISTERED_SERVER:
				getRegisteredServer().clear();
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
			case TypesPackage.LIST_OF_REGISTERED_SERVER__REGISTERED_SERVER:
				return registeredServer != null && !registeredServer.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ListOfRegisteredServerImpl
