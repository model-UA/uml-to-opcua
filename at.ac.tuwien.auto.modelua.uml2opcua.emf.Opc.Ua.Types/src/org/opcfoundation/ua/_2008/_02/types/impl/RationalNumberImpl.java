/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.opcfoundation.ua._2008._02.types.RationalNumber;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rational Number</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.RationalNumberImpl#getNumerator <em>Numerator</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.RationalNumberImpl#getDenominator <em>Denominator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RationalNumberImpl extends MinimalEObjectImpl.Container implements RationalNumber {
	/**
	 * The default value of the '{@link #getNumerator() <em>Numerator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumerator()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMERATOR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumerator() <em>Numerator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumerator()
	 * @generated
	 * @ordered
	 */
	protected int numerator = NUMERATOR_EDEFAULT;

	/**
	 * This is true if the Numerator attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean numeratorESet;

	/**
	 * The default value of the '{@link #getDenominator() <em>Denominator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDenominator()
	 * @generated
	 * @ordered
	 */
	protected static final long DENOMINATOR_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getDenominator() <em>Denominator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDenominator()
	 * @generated
	 * @ordered
	 */
	protected long denominator = DENOMINATOR_EDEFAULT;

	/**
	 * This is true if the Denominator attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean denominatorESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RationalNumberImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getRationalNumber();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumerator() {
		return numerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumerator(int newNumerator) {
		int oldNumerator = numerator;
		numerator = newNumerator;
		boolean oldNumeratorESet = numeratorESet;
		numeratorESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.RATIONAL_NUMBER__NUMERATOR, oldNumerator, numerator, !oldNumeratorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNumerator() {
		int oldNumerator = numerator;
		boolean oldNumeratorESet = numeratorESet;
		numerator = NUMERATOR_EDEFAULT;
		numeratorESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.RATIONAL_NUMBER__NUMERATOR, oldNumerator, NUMERATOR_EDEFAULT, oldNumeratorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNumerator() {
		return numeratorESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getDenominator() {
		return denominator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDenominator(long newDenominator) {
		long oldDenominator = denominator;
		denominator = newDenominator;
		boolean oldDenominatorESet = denominatorESet;
		denominatorESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.RATIONAL_NUMBER__DENOMINATOR, oldDenominator, denominator, !oldDenominatorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDenominator() {
		long oldDenominator = denominator;
		boolean oldDenominatorESet = denominatorESet;
		denominator = DENOMINATOR_EDEFAULT;
		denominatorESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.RATIONAL_NUMBER__DENOMINATOR, oldDenominator, DENOMINATOR_EDEFAULT, oldDenominatorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDenominator() {
		return denominatorESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TypesPackage.RATIONAL_NUMBER__NUMERATOR:
				return getNumerator();
			case TypesPackage.RATIONAL_NUMBER__DENOMINATOR:
				return getDenominator();
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
			case TypesPackage.RATIONAL_NUMBER__NUMERATOR:
				setNumerator((Integer)newValue);
				return;
			case TypesPackage.RATIONAL_NUMBER__DENOMINATOR:
				setDenominator((Long)newValue);
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
			case TypesPackage.RATIONAL_NUMBER__NUMERATOR:
				unsetNumerator();
				return;
			case TypesPackage.RATIONAL_NUMBER__DENOMINATOR:
				unsetDenominator();
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
			case TypesPackage.RATIONAL_NUMBER__NUMERATOR:
				return isSetNumerator();
			case TypesPackage.RATIONAL_NUMBER__DENOMINATOR:
				return isSetDenominator();
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
		result.append(" (numerator: ");
		if (numeratorESet) result.append(numerator); else result.append("<unset>");
		result.append(", denominator: ");
		if (denominatorESet) result.append(denominator); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //RationalNumberImpl
