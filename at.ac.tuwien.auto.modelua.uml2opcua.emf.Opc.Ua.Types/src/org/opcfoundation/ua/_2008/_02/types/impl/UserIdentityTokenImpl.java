/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.opcfoundation.ua._2008._02.types.TypesPackage;
import org.opcfoundation.ua._2008._02.types.UserIdentityToken;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User Identity Token</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.UserIdentityTokenImpl#getPolicyId <em>Policy Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UserIdentityTokenImpl extends MinimalEObjectImpl.Container implements UserIdentityToken {
	/**
	 * The default value of the '{@link #getPolicyId() <em>Policy Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicyId()
	 * @generated
	 * @ordered
	 */
	protected static final String POLICY_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPolicyId() <em>Policy Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicyId()
	 * @generated
	 * @ordered
	 */
	protected String policyId = POLICY_ID_EDEFAULT;

	/**
	 * This is true if the Policy Id attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean policyIdESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserIdentityTokenImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getUserIdentityToken();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPolicyId() {
		return policyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPolicyId(String newPolicyId) {
		String oldPolicyId = policyId;
		policyId = newPolicyId;
		boolean oldPolicyIdESet = policyIdESet;
		policyIdESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.USER_IDENTITY_TOKEN__POLICY_ID, oldPolicyId, policyId, !oldPolicyIdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPolicyId() {
		String oldPolicyId = policyId;
		boolean oldPolicyIdESet = policyIdESet;
		policyId = POLICY_ID_EDEFAULT;
		policyIdESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.USER_IDENTITY_TOKEN__POLICY_ID, oldPolicyId, POLICY_ID_EDEFAULT, oldPolicyIdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPolicyId() {
		return policyIdESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TypesPackage.USER_IDENTITY_TOKEN__POLICY_ID:
				return getPolicyId();
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
			case TypesPackage.USER_IDENTITY_TOKEN__POLICY_ID:
				setPolicyId((String)newValue);
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
			case TypesPackage.USER_IDENTITY_TOKEN__POLICY_ID:
				unsetPolicyId();
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
			case TypesPackage.USER_IDENTITY_TOKEN__POLICY_ID:
				return isSetPolicyId();
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
		result.append(" (policyId: ");
		if (policyIdESet) result.append(policyId); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //UserIdentityTokenImpl
