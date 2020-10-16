/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.opcfoundation.ua._2008._02.types.TypesPackage;
import org.opcfoundation.ua._2008._02.types.X509IdentityToken;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>X509 Identity Token</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.X509IdentityTokenImpl#getCertificateData <em>Certificate Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class X509IdentityTokenImpl extends UserIdentityTokenImpl implements X509IdentityToken {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected X509IdentityTokenImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getX509IdentityToken();
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
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.X509_IDENTITY_TOKEN__CERTIFICATE_DATA, oldCertificateData, certificateData, !oldCertificateDataESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.X509_IDENTITY_TOKEN__CERTIFICATE_DATA, oldCertificateData, CERTIFICATE_DATA_EDEFAULT, oldCertificateDataESet));
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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TypesPackage.X509_IDENTITY_TOKEN__CERTIFICATE_DATA:
				return getCertificateData();
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
			case TypesPackage.X509_IDENTITY_TOKEN__CERTIFICATE_DATA:
				setCertificateData((byte[])newValue);
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
			case TypesPackage.X509_IDENTITY_TOKEN__CERTIFICATE_DATA:
				unsetCertificateData();
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
			case TypesPackage.X509_IDENTITY_TOKEN__CERTIFICATE_DATA:
				return isSetCertificateData();
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
		result.append(')');
		return result.toString();
	}

} //X509IdentityTokenImpl
