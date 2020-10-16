/**
 */
package org.opcfoundation.ua._2011._03.ua.node.set.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.opcfoundation.ua._2011._03.ua.node.set.Reference;
import org.opcfoundation.ua._2011._03.ua.node.set.SetPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.ReferenceImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.ReferenceImpl#isIsForward <em>Is Forward</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.ReferenceImpl#getReferenceType <em>Reference Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReferenceImpl extends MinimalEObjectImpl.Container implements Reference {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsForward() <em>Is Forward</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsForward()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_FORWARD_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isIsForward() <em>Is Forward</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsForward()
	 * @generated
	 * @ordered
	 */
	protected boolean isForward = IS_FORWARD_EDEFAULT;

	/**
	 * This is true if the Is Forward attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isForwardESet;

	/**
	 * The default value of the '{@link #getReferenceType() <em>Reference Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceType()
	 * @generated
	 * @ordered
	 */
	protected static final String REFERENCE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReferenceType() <em>Reference Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceType()
	 * @generated
	 * @ordered
	 */
	protected String referenceType = REFERENCE_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SetPackage.Literals.REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SetPackage.REFERENCE__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsForward() {
		return isForward;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsForward(boolean newIsForward) {
		boolean oldIsForward = isForward;
		isForward = newIsForward;
		boolean oldIsForwardESet = isForwardESet;
		isForwardESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SetPackage.REFERENCE__IS_FORWARD, oldIsForward, isForward, !oldIsForwardESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsForward() {
		boolean oldIsForward = isForward;
		boolean oldIsForwardESet = isForwardESet;
		isForward = IS_FORWARD_EDEFAULT;
		isForwardESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SetPackage.REFERENCE__IS_FORWARD, oldIsForward, IS_FORWARD_EDEFAULT, oldIsForwardESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsForward() {
		return isForwardESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReferenceType() {
		return referenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferenceType(String newReferenceType) {
		String oldReferenceType = referenceType;
		referenceType = newReferenceType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SetPackage.REFERENCE__REFERENCE_TYPE, oldReferenceType, referenceType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SetPackage.REFERENCE__VALUE:
				return getValue();
			case SetPackage.REFERENCE__IS_FORWARD:
				return isIsForward();
			case SetPackage.REFERENCE__REFERENCE_TYPE:
				return getReferenceType();
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
			case SetPackage.REFERENCE__VALUE:
				setValue((String)newValue);
				return;
			case SetPackage.REFERENCE__IS_FORWARD:
				setIsForward((Boolean)newValue);
				return;
			case SetPackage.REFERENCE__REFERENCE_TYPE:
				setReferenceType((String)newValue);
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
			case SetPackage.REFERENCE__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case SetPackage.REFERENCE__IS_FORWARD:
				unsetIsForward();
				return;
			case SetPackage.REFERENCE__REFERENCE_TYPE:
				setReferenceType(REFERENCE_TYPE_EDEFAULT);
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
			case SetPackage.REFERENCE__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case SetPackage.REFERENCE__IS_FORWARD:
				return isSetIsForward();
			case SetPackage.REFERENCE__REFERENCE_TYPE:
				return REFERENCE_TYPE_EDEFAULT == null ? referenceType != null : !REFERENCE_TYPE_EDEFAULT.equals(referenceType);
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
		result.append(" (value: ");
		result.append(value);
		result.append(", isForward: ");
		if (isForwardESet) result.append(isForward); else result.append("<unset>");
		result.append(", referenceType: ");
		result.append(referenceType);
		result.append(')');
		return result.toString();
	}

} //ReferenceImpl
