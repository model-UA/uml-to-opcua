/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.opcfoundation.ua._2008._02.types.TypesPackage;
import org.opcfoundation.ua._2008._02.types.UserNameIdentityToken;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User Name Identity Token</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.UserNameIdentityTokenImpl#getUserName <em>User Name</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.UserNameIdentityTokenImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.UserNameIdentityTokenImpl#getEncryptionAlgorithm <em>Encryption Algorithm</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UserNameIdentityTokenImpl extends UserIdentityTokenImpl implements UserNameIdentityToken {
	/**
	 * The default value of the '{@link #getUserName() <em>User Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserName()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUserName() <em>User Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserName()
	 * @generated
	 * @ordered
	 */
	protected String userName = USER_NAME_EDEFAULT;

	/**
	 * This is true if the User Name attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean userNameESet;

	/**
	 * The default value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] PASSWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected byte[] password = PASSWORD_EDEFAULT;

	/**
	 * This is true if the Password attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean passwordESet;

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
	protected UserNameIdentityTokenImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getUserNameIdentityToken();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserName(String newUserName) {
		String oldUserName = userName;
		userName = newUserName;
		boolean oldUserNameESet = userNameESet;
		userNameESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.USER_NAME_IDENTITY_TOKEN__USER_NAME, oldUserName, userName, !oldUserNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUserName() {
		String oldUserName = userName;
		boolean oldUserNameESet = userNameESet;
		userName = USER_NAME_EDEFAULT;
		userNameESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.USER_NAME_IDENTITY_TOKEN__USER_NAME, oldUserName, USER_NAME_EDEFAULT, oldUserNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUserName() {
		return userNameESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getPassword() {
		return password;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassword(byte[] newPassword) {
		byte[] oldPassword = password;
		password = newPassword;
		boolean oldPasswordESet = passwordESet;
		passwordESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.USER_NAME_IDENTITY_TOKEN__PASSWORD, oldPassword, password, !oldPasswordESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPassword() {
		byte[] oldPassword = password;
		boolean oldPasswordESet = passwordESet;
		password = PASSWORD_EDEFAULT;
		passwordESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.USER_NAME_IDENTITY_TOKEN__PASSWORD, oldPassword, PASSWORD_EDEFAULT, oldPasswordESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPassword() {
		return passwordESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.USER_NAME_IDENTITY_TOKEN__ENCRYPTION_ALGORITHM, oldEncryptionAlgorithm, encryptionAlgorithm, !oldEncryptionAlgorithmESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.USER_NAME_IDENTITY_TOKEN__ENCRYPTION_ALGORITHM, oldEncryptionAlgorithm, ENCRYPTION_ALGORITHM_EDEFAULT, oldEncryptionAlgorithmESet));
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
			case TypesPackage.USER_NAME_IDENTITY_TOKEN__USER_NAME:
				return getUserName();
			case TypesPackage.USER_NAME_IDENTITY_TOKEN__PASSWORD:
				return getPassword();
			case TypesPackage.USER_NAME_IDENTITY_TOKEN__ENCRYPTION_ALGORITHM:
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
			case TypesPackage.USER_NAME_IDENTITY_TOKEN__USER_NAME:
				setUserName((String)newValue);
				return;
			case TypesPackage.USER_NAME_IDENTITY_TOKEN__PASSWORD:
				setPassword((byte[])newValue);
				return;
			case TypesPackage.USER_NAME_IDENTITY_TOKEN__ENCRYPTION_ALGORITHM:
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
			case TypesPackage.USER_NAME_IDENTITY_TOKEN__USER_NAME:
				unsetUserName();
				return;
			case TypesPackage.USER_NAME_IDENTITY_TOKEN__PASSWORD:
				unsetPassword();
				return;
			case TypesPackage.USER_NAME_IDENTITY_TOKEN__ENCRYPTION_ALGORITHM:
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
			case TypesPackage.USER_NAME_IDENTITY_TOKEN__USER_NAME:
				return isSetUserName();
			case TypesPackage.USER_NAME_IDENTITY_TOKEN__PASSWORD:
				return isSetPassword();
			case TypesPackage.USER_NAME_IDENTITY_TOKEN__ENCRYPTION_ALGORITHM:
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
		result.append(" (userName: ");
		if (userNameESet) result.append(userName); else result.append("<unset>");
		result.append(", password: ");
		if (passwordESet) result.append(password); else result.append("<unset>");
		result.append(", encryptionAlgorithm: ");
		if (encryptionAlgorithmESet) result.append(encryptionAlgorithm); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //UserNameIdentityTokenImpl
