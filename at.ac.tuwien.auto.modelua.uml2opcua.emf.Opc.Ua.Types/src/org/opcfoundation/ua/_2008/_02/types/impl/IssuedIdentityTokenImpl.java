/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.opcfoundation.ua._2008._02.types.IssuedIdentityToken;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Issued Identity Token</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.IssuedIdentityTokenImpl#getTokenData <em>Token Data</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.IssuedIdentityTokenImpl#getEncryptionAlgorithm <em>Encryption Algorithm</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IssuedIdentityTokenImpl extends UserIdentityTokenImpl implements IssuedIdentityToken {
	/**
	 * The default value of the '{@link #getTokenData() <em>Token Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTokenData()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] TOKEN_DATA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTokenData() <em>Token Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTokenData()
	 * @generated
	 * @ordered
	 */
	protected byte[] tokenData = TOKEN_DATA_EDEFAULT;

	/**
	 * This is true if the Token Data attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean tokenDataESet;

	/**
	 * The default value of the '{@link #getEncryptionAlgorithm() <em>Encryption Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncryptionAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected static final String ENCRYPTION_ALGORITHM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEncryptionAlgorithm() <em>Encryption Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncryptionAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected String encryptionAlgorithm = ENCRYPTION_ALGORITHM_EDEFAULT;

	/**
	 * This is true if the Encryption Algorithm attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean encryptionAlgorithmESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IssuedIdentityTokenImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getIssuedIdentityToken();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getTokenData() {
		return tokenData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTokenData(byte[] newTokenData) {
		byte[] oldTokenData = tokenData;
		tokenData = newTokenData;
		boolean oldTokenDataESet = tokenDataESet;
		tokenDataESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.ISSUED_IDENTITY_TOKEN__TOKEN_DATA, oldTokenData, tokenData, !oldTokenDataESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTokenData() {
		byte[] oldTokenData = tokenData;
		boolean oldTokenDataESet = tokenDataESet;
		tokenData = TOKEN_DATA_EDEFAULT;
		tokenDataESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.ISSUED_IDENTITY_TOKEN__TOKEN_DATA, oldTokenData, TOKEN_DATA_EDEFAULT, oldTokenDataESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTokenData() {
		return tokenDataESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEncryptionAlgorithm() {
		return encryptionAlgorithm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEncryptionAlgorithm(String newEncryptionAlgorithm) {
		String oldEncryptionAlgorithm = encryptionAlgorithm;
		encryptionAlgorithm = newEncryptionAlgorithm;
		boolean oldEncryptionAlgorithmESet = encryptionAlgorithmESet;
		encryptionAlgorithmESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.ISSUED_IDENTITY_TOKEN__ENCRYPTION_ALGORITHM, oldEncryptionAlgorithm, encryptionAlgorithm, !oldEncryptionAlgorithmESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEncryptionAlgorithm() {
		String oldEncryptionAlgorithm = encryptionAlgorithm;
		boolean oldEncryptionAlgorithmESet = encryptionAlgorithmESet;
		encryptionAlgorithm = ENCRYPTION_ALGORITHM_EDEFAULT;
		encryptionAlgorithmESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.ISSUED_IDENTITY_TOKEN__ENCRYPTION_ALGORITHM, oldEncryptionAlgorithm, ENCRYPTION_ALGORITHM_EDEFAULT, oldEncryptionAlgorithmESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEncryptionAlgorithm() {
		return encryptionAlgorithmESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TypesPackage.ISSUED_IDENTITY_TOKEN__TOKEN_DATA:
				return getTokenData();
			case TypesPackage.ISSUED_IDENTITY_TOKEN__ENCRYPTION_ALGORITHM:
				return getEncryptionAlgorithm();
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
			case TypesPackage.ISSUED_IDENTITY_TOKEN__TOKEN_DATA:
				setTokenData((byte[])newValue);
				return;
			case TypesPackage.ISSUED_IDENTITY_TOKEN__ENCRYPTION_ALGORITHM:
				setEncryptionAlgorithm((String)newValue);
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
			case TypesPackage.ISSUED_IDENTITY_TOKEN__TOKEN_DATA:
				unsetTokenData();
				return;
			case TypesPackage.ISSUED_IDENTITY_TOKEN__ENCRYPTION_ALGORITHM:
				unsetEncryptionAlgorithm();
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
			case TypesPackage.ISSUED_IDENTITY_TOKEN__TOKEN_DATA:
				return isSetTokenData();
			case TypesPackage.ISSUED_IDENTITY_TOKEN__ENCRYPTION_ALGORITHM:
				return isSetEncryptionAlgorithm();
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
		result.append(" (tokenData: ");
		if (tokenDataESet) result.append(tokenData); else result.append("<unset>");
		result.append(", encryptionAlgorithm: ");
		if (encryptionAlgorithmESet) result.append(encryptionAlgorithm); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IssuedIdentityTokenImpl
