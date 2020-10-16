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

import org.opcfoundation.ua._2008._02.types.ListOfSignedSoftwareCertificate;
import org.opcfoundation.ua._2008._02.types.SignedSoftwareCertificate;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Of Signed Software Certificate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ListOfSignedSoftwareCertificateImpl#getSignedSoftwareCertificate <em>Signed Software Certificate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListOfSignedSoftwareCertificateImpl extends MinimalEObjectImpl.Container implements ListOfSignedSoftwareCertificate {
	/**
	 * The cached value of the '{@link #getSignedSoftwareCertificate() <em>Signed Software Certificate</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignedSoftwareCertificate()
	 * @generated
	 * @ordered
	 */
	protected EList<SignedSoftwareCertificate> signedSoftwareCertificate;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListOfSignedSoftwareCertificateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getListOfSignedSoftwareCertificate();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SignedSoftwareCertificate> getSignedSoftwareCertificate() {
		if (signedSoftwareCertificate == null) {
			signedSoftwareCertificate = new EObjectContainmentEList<SignedSoftwareCertificate>(SignedSoftwareCertificate.class, this, TypesPackage.LIST_OF_SIGNED_SOFTWARE_CERTIFICATE__SIGNED_SOFTWARE_CERTIFICATE);
		}
		return signedSoftwareCertificate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.LIST_OF_SIGNED_SOFTWARE_CERTIFICATE__SIGNED_SOFTWARE_CERTIFICATE:
				return ((InternalEList<?>)getSignedSoftwareCertificate()).basicRemove(otherEnd, msgs);
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
			case TypesPackage.LIST_OF_SIGNED_SOFTWARE_CERTIFICATE__SIGNED_SOFTWARE_CERTIFICATE:
				return getSignedSoftwareCertificate();
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
			case TypesPackage.LIST_OF_SIGNED_SOFTWARE_CERTIFICATE__SIGNED_SOFTWARE_CERTIFICATE:
				getSignedSoftwareCertificate().clear();
				getSignedSoftwareCertificate().addAll((Collection<? extends SignedSoftwareCertificate>)newValue);
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
			case TypesPackage.LIST_OF_SIGNED_SOFTWARE_CERTIFICATE__SIGNED_SOFTWARE_CERTIFICATE:
				getSignedSoftwareCertificate().clear();
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
			case TypesPackage.LIST_OF_SIGNED_SOFTWARE_CERTIFICATE__SIGNED_SOFTWARE_CERTIFICATE:
				return signedSoftwareCertificate != null && !signedSoftwareCertificate.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ListOfSignedSoftwareCertificateImpl
