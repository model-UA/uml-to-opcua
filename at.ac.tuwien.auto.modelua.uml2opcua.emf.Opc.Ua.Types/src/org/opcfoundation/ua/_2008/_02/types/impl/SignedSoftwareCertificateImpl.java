/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.opcfoundation.ua._2008._02.types.SignedSoftwareCertificate;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Signed Software Certificate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.SignedSoftwareCertificateImpl#getCertificateData <em>Certificate Data</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.SignedSoftwareCertificateImpl#getSignature <em>Signature</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SignedSoftwareCertificateImpl extends MinimalEObjectImpl.Container implements SignedSoftwareCertificate {
	/**
	 * The default value of the '{@link #getCertificateData() <em>Certificate Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCertificateData()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] CERTIFICATE_DATA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCertificateData() <em>Certificate Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCertificateData()
	 * @generated
	 * @ordered
	 */
	protected byte[] certificateData = CERTIFICATE_DATA_EDEFAULT;

	/**
	 * This is true if the Certificate Data attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean certificateDataESet;

	/**
	 * The default value of the '{@link #getSignature() <em>Signature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignature()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] SIGNATURE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSignature() <em>Signature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignature()
	 * @generated
	 * @ordered
	 */
	protected byte[] signature = SIGNATURE_EDEFAULT;

	/**
	 * This is true if the Signature attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean signatureESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SignedSoftwareCertificateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getSignedSoftwareCertificate();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getCertificateData() {
		return certificateData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCertificateData(byte[] newCertificateData) {
		byte[] oldCertificateData = certificateData;
		certificateData = newCertificateData;
		boolean oldCertificateDataESet = certificateDataESet;
		certificateDataESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SIGNED_SOFTWARE_CERTIFICATE__CERTIFICATE_DATA, oldCertificateData, certificateData, !oldCertificateDataESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCertificateData() {
		byte[] oldCertificateData = certificateData;
		boolean oldCertificateDataESet = certificateDataESet;
		certificateData = CERTIFICATE_DATA_EDEFAULT;
		certificateDataESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.SIGNED_SOFTWARE_CERTIFICATE__CERTIFICATE_DATA, oldCertificateData, CERTIFICATE_DATA_EDEFAULT, oldCertificateDataESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCertificateData() {
		return certificateDataESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getSignature() {
		return signature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignature(byte[] newSignature) {
		byte[] oldSignature = signature;
		signature = newSignature;
		boolean oldSignatureESet = signatureESet;
		signatureESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SIGNED_SOFTWARE_CERTIFICATE__SIGNATURE, oldSignature, signature, !oldSignatureESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSignature() {
		byte[] oldSignature = signature;
		boolean oldSignatureESet = signatureESet;
		signature = SIGNATURE_EDEFAULT;
		signatureESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.SIGNED_SOFTWARE_CERTIFICATE__SIGNATURE, oldSignature, SIGNATURE_EDEFAULT, oldSignatureESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSignature() {
		return signatureESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TypesPackage.SIGNED_SOFTWARE_CERTIFICATE__CERTIFICATE_DATA:
				return getCertificateData();
			case TypesPackage.SIGNED_SOFTWARE_CERTIFICATE__SIGNATURE:
				return getSignature();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TypesPackage.SIGNED_SOFTWARE_CERTIFICATE__CERTIFICATE_DATA:
				setCertificateData((byte[])newValue);
				return;
			case TypesPackage.SIGNED_SOFTWARE_CERTIFICATE__SIGNATURE:
				setSignature((byte[])newValue);
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
			case TypesPackage.SIGNED_SOFTWARE_CERTIFICATE__CERTIFICATE_DATA:
				unsetCertificateData();
				return;
			case TypesPackage.SIGNED_SOFTWARE_CERTIFICATE__SIGNATURE:
				unsetSignature();
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
			case TypesPackage.SIGNED_SOFTWARE_CERTIFICATE__CERTIFICATE_DATA:
				return isSetCertificateData();
			case TypesPackage.SIGNED_SOFTWARE_CERTIFICATE__SIGNATURE:
				return isSetSignature();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (certificateData: ");
		if (certificateDataESet) result.append(certificateData); else result.append("<unset>");
		result.append(", signature: ");
		if (signatureESet) result.append(signature); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //SignedSoftwareCertificateImpl
