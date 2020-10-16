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

import org.opcfoundation.ua._2008._02.types.ListOfSessionDiagnosticsDataType;
import org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Of Session Diagnostics Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ListOfSessionDiagnosticsDataTypeImpl#getSessionDiagnosticsDataType <em>Session Diagnostics Data Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListOfSessionDiagnosticsDataTypeImpl extends MinimalEObjectImpl.Container implements ListOfSessionDiagnosticsDataType {
	/**
	 * The cached value of the '{@link #getSessionDiagnosticsDataType() <em>Session Diagnostics Data Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSessionDiagnosticsDataType()
	 * @generated
	 * @ordered
	 */
	protected EList<SessionDiagnosticsDataType> sessionDiagnosticsDataType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListOfSessionDiagnosticsDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getListOfSessionDiagnosticsDataType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SessionDiagnosticsDataType> getSessionDiagnosticsDataType() {
		if (sessionDiagnosticsDataType == null) {
			sessionDiagnosticsDataType = new EObjectContainmentEList<SessionDiagnosticsDataType>(SessionDiagnosticsDataType.class, this, TypesPackage.LIST_OF_SESSION_DIAGNOSTICS_DATA_TYPE__SESSION_DIAGNOSTICS_DATA_TYPE);
		}
		return sessionDiagnosticsDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.LIST_OF_SESSION_DIAGNOSTICS_DATA_TYPE__SESSION_DIAGNOSTICS_DATA_TYPE:
				return ((InternalEList<?>)getSessionDiagnosticsDataType()).basicRemove(otherEnd, msgs);
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
			case TypesPackage.LIST_OF_SESSION_DIAGNOSTICS_DATA_TYPE__SESSION_DIAGNOSTICS_DATA_TYPE:
				return getSessionDiagnosticsDataType();
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
			case TypesPackage.LIST_OF_SESSION_DIAGNOSTICS_DATA_TYPE__SESSION_DIAGNOSTICS_DATA_TYPE:
				getSessionDiagnosticsDataType().clear();
				getSessionDiagnosticsDataType().addAll((Collection<? extends SessionDiagnosticsDataType>)newValue);
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
			case TypesPackage.LIST_OF_SESSION_DIAGNOSTICS_DATA_TYPE__SESSION_DIAGNOSTICS_DATA_TYPE:
				getSessionDiagnosticsDataType().clear();
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
			case TypesPackage.LIST_OF_SESSION_DIAGNOSTICS_DATA_TYPE__SESSION_DIAGNOSTICS_DATA_TYPE:
				return sessionDiagnosticsDataType != null && !sessionDiagnosticsDataType.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ListOfSessionDiagnosticsDataTypeImpl
