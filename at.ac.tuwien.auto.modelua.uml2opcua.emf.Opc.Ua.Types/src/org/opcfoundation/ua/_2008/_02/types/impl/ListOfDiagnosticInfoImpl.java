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

import org.opcfoundation.ua._2008._02.types.DiagnosticInfo;
import org.opcfoundation.ua._2008._02.types.ListOfDiagnosticInfo;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Of Diagnostic Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ListOfDiagnosticInfoImpl#getDiagnosticInfo <em>Diagnostic Info</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListOfDiagnosticInfoImpl extends MinimalEObjectImpl.Container implements ListOfDiagnosticInfo {
	/**
	 * The cached value of the '{@link #getDiagnosticInfo() <em>Diagnostic Info</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagnosticInfo()
	 * @generated
	 * @ordered
	 */
	protected EList<DiagnosticInfo> diagnosticInfo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListOfDiagnosticInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getListOfDiagnosticInfo();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiagnosticInfo> getDiagnosticInfo() {
		if (diagnosticInfo == null) {
			diagnosticInfo = new EObjectContainmentEList<DiagnosticInfo>(DiagnosticInfo.class, this, TypesPackage.LIST_OF_DIAGNOSTIC_INFO__DIAGNOSTIC_INFO);
		}
		return diagnosticInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.LIST_OF_DIAGNOSTIC_INFO__DIAGNOSTIC_INFO:
				return ((InternalEList<?>)getDiagnosticInfo()).basicRemove(otherEnd, msgs);
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
			case TypesPackage.LIST_OF_DIAGNOSTIC_INFO__DIAGNOSTIC_INFO:
				return getDiagnosticInfo();
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
			case TypesPackage.LIST_OF_DIAGNOSTIC_INFO__DIAGNOSTIC_INFO:
				getDiagnosticInfo().clear();
				getDiagnosticInfo().addAll((Collection<? extends DiagnosticInfo>)newValue);
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
			case TypesPackage.LIST_OF_DIAGNOSTIC_INFO__DIAGNOSTIC_INFO:
				getDiagnosticInfo().clear();
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
			case TypesPackage.LIST_OF_DIAGNOSTIC_INFO__DIAGNOSTIC_INFO:
				return diagnosticInfo != null && !diagnosticInfo.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ListOfDiagnosticInfoImpl
