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

import org.opcfoundation.ua._2008._02.types.ListOfSessionSecurityDiagnosticsDataType;
import org.opcfoundation.ua._2008._02.types.SessionSecurityDiagnosticsDataType;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Of Session Security Diagnostics Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ListOfSessionSecurityDiagnosticsDataTypeImpl#getSessionSecurityDiagnosticsDataType <em>Session Security Diagnostics Data Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListOfSessionSecurityDiagnosticsDataTypeImpl extends MinimalEObjectImpl.Container implements ListOfSessionSecurityDiagnosticsDataType {
	/**
	 * The cached value of the '{@link #getSessionSecurityDiagnosticsDataType() <em>Session Security Diagnostics Data Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSessionSecurityDiagnosticsDataType()
	 * @generated
	 * @ordered
	 */
	protected EList<SessionSecurityDiagnosticsDataType> sessionSecurityDiagnosticsDataType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListOfSessionSecurityDiagnosticsDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getListOfSessionSecurityDiagnosticsDataType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SessionSecurityDiagnosticsDataType> getSessionSecurityDiagnosticsDataType() {
		if (sessionSecurityDiagnosticsDataType == null) {
			sessionSecurityDiagnosticsDataType = new EObjectContainmentEList<SessionSecurityDiagnosticsDataType>(SessionSecurityDiagnosticsDataType.class, this, TypesPackage.LIST_OF_SESSION_SECURITY_DIAGNOSTICS_DATA_TYPE__SESSION_SECURITY_DIAGNOSTICS_DATA_TYPE);
		}
		return sessionSecurityDiagnosticsDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.LIST_OF_SESSION_SECURITY_DIAGNOSTICS_DATA_TYPE__SESSION_SECURITY_DIAGNOSTICS_DATA_TYPE:
				return ((InternalEList<?>)getSessionSecurityDiagnosticsDataType()).basicRemove(otherEnd, msgs);
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
			case TypesPackage.LIST_OF_SESSION_SECURITY_DIAGNOSTICS_DATA_TYPE__SESSION_SECURITY_DIAGNOSTICS_DATA_TYPE:
				return getSessionSecurityDiagnosticsDataType();
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
			case TypesPackage.LIST_OF_SESSION_SECURITY_DIAGNOSTICS_DATA_TYPE__SESSION_SECURITY_DIAGNOSTICS_DATA_TYPE:
				getSessionSecurityDiagnosticsDataType().clear();
				getSessionSecurityDiagnosticsDataType().addAll((Collection<? extends SessionSecurityDiagnosticsDataType>)newValue);
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
			case TypesPackage.LIST_OF_SESSION_SECURITY_DIAGNOSTICS_DATA_TYPE__SESSION_SECURITY_DIAGNOSTICS_DATA_TYPE:
				getSessionSecurityDiagnosticsDataType().clear();
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
			case TypesPackage.LIST_OF_SESSION_SECURITY_DIAGNOSTICS_DATA_TYPE__SESSION_SECURITY_DIAGNOSTICS_DATA_TYPE:
				return sessionSecurityDiagnosticsDataType != null && !sessionSecurityDiagnosticsDataType.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ListOfSessionSecurityDiagnosticsDataTypeImpl
