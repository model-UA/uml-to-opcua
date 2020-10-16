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

import org.opcfoundation.ua._2008._02.types.CallMethodRequest;
import org.opcfoundation.ua._2008._02.types.ListOfCallMethodRequest;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Of Call Method Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ListOfCallMethodRequestImpl#getCallMethodRequest <em>Call Method Request</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListOfCallMethodRequestImpl extends MinimalEObjectImpl.Container implements ListOfCallMethodRequest {
	/**
	 * The cached value of the '{@link #getCallMethodRequest() <em>Call Method Request</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallMethodRequest()
	 * @generated
	 * @ordered
	 */
	protected EList<CallMethodRequest> callMethodRequest;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListOfCallMethodRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getListOfCallMethodRequest();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CallMethodRequest> getCallMethodRequest() {
		if (callMethodRequest == null) {
			callMethodRequest = new EObjectContainmentEList<CallMethodRequest>(CallMethodRequest.class, this, TypesPackage.LIST_OF_CALL_METHOD_REQUEST__CALL_METHOD_REQUEST);
		}
		return callMethodRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.LIST_OF_CALL_METHOD_REQUEST__CALL_METHOD_REQUEST:
				return ((InternalEList<?>)getCallMethodRequest()).basicRemove(otherEnd, msgs);
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
			case TypesPackage.LIST_OF_CALL_METHOD_REQUEST__CALL_METHOD_REQUEST:
				return getCallMethodRequest();
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
			case TypesPackage.LIST_OF_CALL_METHOD_REQUEST__CALL_METHOD_REQUEST:
				getCallMethodRequest().clear();
				getCallMethodRequest().addAll((Collection<? extends CallMethodRequest>)newValue);
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
			case TypesPackage.LIST_OF_CALL_METHOD_REQUEST__CALL_METHOD_REQUEST:
				getCallMethodRequest().clear();
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
			case TypesPackage.LIST_OF_CALL_METHOD_REQUEST__CALL_METHOD_REQUEST:
				return callMethodRequest != null && !callMethodRequest.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ListOfCallMethodRequestImpl
