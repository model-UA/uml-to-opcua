/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.opcfoundation.ua._2008._02.types.CurrencyUnitType;
import org.opcfoundation.ua._2008._02.types.LocalizedText;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Currency Unit Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.CurrencyUnitTypeImpl#getNumericCode <em>Numeric Code</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.CurrencyUnitTypeImpl#getExponent <em>Exponent</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.CurrencyUnitTypeImpl#getAlphabeticCode <em>Alphabetic Code</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.CurrencyUnitTypeImpl#getCurrency <em>Currency</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CurrencyUnitTypeImpl extends MinimalEObjectImpl.Container implements CurrencyUnitType {
	/**
	 * The default value of the '{@link #getNumericCode() <em>Numeric Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumericCode()
	 * @generated
	 * @ordered
	 */
	protected static final short NUMERIC_CODE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumericCode() <em>Numeric Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumericCode()
	 * @generated
	 * @ordered
	 */
	protected short numericCode = NUMERIC_CODE_EDEFAULT;

	/**
	 * This is true if the Numeric Code attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean numericCodeESet;

	/**
	 * The default value of the '{@link #getExponent() <em>Exponent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExponent()
	 * @generated
	 * @ordered
	 */
	protected static final byte EXPONENT_EDEFAULT = 0x00;

	/**
	 * The cached value of the '{@link #getExponent() <em>Exponent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExponent()
	 * @generated
	 * @ordered
	 */
	protected byte exponent = EXPONENT_EDEFAULT;

	/**
	 * This is true if the Exponent attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean exponentESet;

	/**
	 * The default value of the '{@link #getAlphabeticCode() <em>Alphabetic Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlphabeticCode()
	 * @generated
	 * @ordered
	 */
	protected static final String ALPHABETIC_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlphabeticCode() <em>Alphabetic Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlphabeticCode()
	 * @generated
	 * @ordered
	 */
	protected String alphabeticCode = ALPHABETIC_CODE_EDEFAULT;

	/**
	 * This is true if the Alphabetic Code attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean alphabeticCodeESet;

	/**
	 * The cached value of the '{@link #getCurrency() <em>Currency</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrency()
	 * @generated
	 * @ordered
	 */
	protected LocalizedText currency;

	/**
	 * This is true if the Currency containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean currencyESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CurrencyUnitTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getCurrencyUnitType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public short getNumericCode() {
		return numericCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumericCode(short newNumericCode) {
		short oldNumericCode = numericCode;
		numericCode = newNumericCode;
		boolean oldNumericCodeESet = numericCodeESet;
		numericCodeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.CURRENCY_UNIT_TYPE__NUMERIC_CODE, oldNumericCode, numericCode, !oldNumericCodeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNumericCode() {
		short oldNumericCode = numericCode;
		boolean oldNumericCodeESet = numericCodeESet;
		numericCode = NUMERIC_CODE_EDEFAULT;
		numericCodeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.CURRENCY_UNIT_TYPE__NUMERIC_CODE, oldNumericCode, NUMERIC_CODE_EDEFAULT, oldNumericCodeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNumericCode() {
		return numericCodeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte getExponent() {
		return exponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExponent(byte newExponent) {
		byte oldExponent = exponent;
		exponent = newExponent;
		boolean oldExponentESet = exponentESet;
		exponentESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.CURRENCY_UNIT_TYPE__EXPONENT, oldExponent, exponent, !oldExponentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetExponent() {
		byte oldExponent = exponent;
		boolean oldExponentESet = exponentESet;
		exponent = EXPONENT_EDEFAULT;
		exponentESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.CURRENCY_UNIT_TYPE__EXPONENT, oldExponent, EXPONENT_EDEFAULT, oldExponentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetExponent() {
		return exponentESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAlphabeticCode() {
		return alphabeticCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlphabeticCode(String newAlphabeticCode) {
		String oldAlphabeticCode = alphabeticCode;
		alphabeticCode = newAlphabeticCode;
		boolean oldAlphabeticCodeESet = alphabeticCodeESet;
		alphabeticCodeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.CURRENCY_UNIT_TYPE__ALPHABETIC_CODE, oldAlphabeticCode, alphabeticCode, !oldAlphabeticCodeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAlphabeticCode() {
		String oldAlphabeticCode = alphabeticCode;
		boolean oldAlphabeticCodeESet = alphabeticCodeESet;
		alphabeticCode = ALPHABETIC_CODE_EDEFAULT;
		alphabeticCodeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.CURRENCY_UNIT_TYPE__ALPHABETIC_CODE, oldAlphabeticCode, ALPHABETIC_CODE_EDEFAULT, oldAlphabeticCodeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAlphabeticCode() {
		return alphabeticCodeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalizedText getCurrency() {
		return currency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCurrency(LocalizedText newCurrency, NotificationChain msgs) {
		LocalizedText oldCurrency = currency;
		currency = newCurrency;
		boolean oldCurrencyESet = currencyESet;
		currencyESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.CURRENCY_UNIT_TYPE__CURRENCY, oldCurrency, newCurrency, !oldCurrencyESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrency(LocalizedText newCurrency) {
		if (newCurrency != currency) {
			NotificationChain msgs = null;
			if (currency != null)
				msgs = ((InternalEObject)currency).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.CURRENCY_UNIT_TYPE__CURRENCY, null, msgs);
			if (newCurrency != null)
				msgs = ((InternalEObject)newCurrency).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.CURRENCY_UNIT_TYPE__CURRENCY, null, msgs);
			msgs = basicSetCurrency(newCurrency, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldCurrencyESet = currencyESet;
			currencyESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.CURRENCY_UNIT_TYPE__CURRENCY, newCurrency, newCurrency, !oldCurrencyESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetCurrency(NotificationChain msgs) {
		LocalizedText oldCurrency = currency;
		currency = null;
		boolean oldCurrencyESet = currencyESet;
		currencyESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.CURRENCY_UNIT_TYPE__CURRENCY, oldCurrency, null, oldCurrencyESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCurrency() {
		if (currency != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)currency).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.CURRENCY_UNIT_TYPE__CURRENCY, null, msgs);
			msgs = basicUnsetCurrency(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldCurrencyESet = currencyESet;
			currencyESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.CURRENCY_UNIT_TYPE__CURRENCY, null, null, oldCurrencyESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCurrency() {
		return currencyESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.CURRENCY_UNIT_TYPE__CURRENCY:
				return basicUnsetCurrency(msgs);
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
			case TypesPackage.CURRENCY_UNIT_TYPE__NUMERIC_CODE:
				return getNumericCode();
			case TypesPackage.CURRENCY_UNIT_TYPE__EXPONENT:
				return getExponent();
			case TypesPackage.CURRENCY_UNIT_TYPE__ALPHABETIC_CODE:
				return getAlphabeticCode();
			case TypesPackage.CURRENCY_UNIT_TYPE__CURRENCY:
				return getCurrency();
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
			case TypesPackage.CURRENCY_UNIT_TYPE__NUMERIC_CODE:
				setNumericCode((Short)newValue);
				return;
			case TypesPackage.CURRENCY_UNIT_TYPE__EXPONENT:
				setExponent((Byte)newValue);
				return;
			case TypesPackage.CURRENCY_UNIT_TYPE__ALPHABETIC_CODE:
				setAlphabeticCode((String)newValue);
				return;
			case TypesPackage.CURRENCY_UNIT_TYPE__CURRENCY:
				setCurrency((LocalizedText)newValue);
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
			case TypesPackage.CURRENCY_UNIT_TYPE__NUMERIC_CODE:
				unsetNumericCode();
				return;
			case TypesPackage.CURRENCY_UNIT_TYPE__EXPONENT:
				unsetExponent();
				return;
			case TypesPackage.CURRENCY_UNIT_TYPE__ALPHABETIC_CODE:
				unsetAlphabeticCode();
				return;
			case TypesPackage.CURRENCY_UNIT_TYPE__CURRENCY:
				unsetCurrency();
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
			case TypesPackage.CURRENCY_UNIT_TYPE__NUMERIC_CODE:
				return isSetNumericCode();
			case TypesPackage.CURRENCY_UNIT_TYPE__EXPONENT:
				return isSetExponent();
			case TypesPackage.CURRENCY_UNIT_TYPE__ALPHABETIC_CODE:
				return isSetAlphabeticCode();
			case TypesPackage.CURRENCY_UNIT_TYPE__CURRENCY:
				return isSetCurrency();
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
		result.append(" (numericCode: ");
		if (numericCodeESet) result.append(numericCode); else result.append("<unset>");
		result.append(", exponent: ");
		if (exponentESet) result.append(exponent); else result.append("<unset>");
		result.append(", alphabeticCode: ");
		if (alphabeticCodeESet) result.append(alphabeticCode); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //CurrencyUnitTypeImpl
