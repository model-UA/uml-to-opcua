/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.opcfoundation.ua._2008._02.types.ComplexNumberType;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Complex Number Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ComplexNumberTypeImpl#getReal <em>Real</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ComplexNumberTypeImpl#getImaginary <em>Imaginary</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComplexNumberTypeImpl extends MinimalEObjectImpl.Container implements ComplexNumberType {
	/**
	 * The default value of the '{@link #getReal() <em>Real</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReal()
	 * @generated
	 * @ordered
	 */
	protected static final float REAL_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getReal() <em>Real</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReal()
	 * @generated
	 * @ordered
	 */
	protected float real = REAL_EDEFAULT;

	/**
	 * This is true if the Real attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean realESet;

	/**
	 * The default value of the '{@link #getImaginary() <em>Imaginary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImaginary()
	 * @generated
	 * @ordered
	 */
	protected static final float IMAGINARY_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getImaginary() <em>Imaginary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImaginary()
	 * @generated
	 * @ordered
	 */
	protected float imaginary = IMAGINARY_EDEFAULT;

	/**
	 * This is true if the Imaginary attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean imaginaryESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComplexNumberTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getComplexNumberType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getReal() {
		return real;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReal(float newReal) {
		float oldReal = real;
		real = newReal;
		boolean oldRealESet = realESet;
		realESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.COMPLEX_NUMBER_TYPE__REAL, oldReal, real, !oldRealESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetReal() {
		float oldReal = real;
		boolean oldRealESet = realESet;
		real = REAL_EDEFAULT;
		realESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.COMPLEX_NUMBER_TYPE__REAL, oldReal, REAL_EDEFAULT, oldRealESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetReal() {
		return realESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getImaginary() {
		return imaginary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImaginary(float newImaginary) {
		float oldImaginary = imaginary;
		imaginary = newImaginary;
		boolean oldImaginaryESet = imaginaryESet;
		imaginaryESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.COMPLEX_NUMBER_TYPE__IMAGINARY, oldImaginary, imaginary, !oldImaginaryESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetImaginary() {
		float oldImaginary = imaginary;
		boolean oldImaginaryESet = imaginaryESet;
		imaginary = IMAGINARY_EDEFAULT;
		imaginaryESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.COMPLEX_NUMBER_TYPE__IMAGINARY, oldImaginary, IMAGINARY_EDEFAULT, oldImaginaryESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetImaginary() {
		return imaginaryESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TypesPackage.COMPLEX_NUMBER_TYPE__REAL:
				return getReal();
			case TypesPackage.COMPLEX_NUMBER_TYPE__IMAGINARY:
				return getImaginary();
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
			case TypesPackage.COMPLEX_NUMBER_TYPE__REAL:
				setReal((Float)newValue);
				return;
			case TypesPackage.COMPLEX_NUMBER_TYPE__IMAGINARY:
				setImaginary((Float)newValue);
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
			case TypesPackage.COMPLEX_NUMBER_TYPE__REAL:
				unsetReal();
				return;
			case TypesPackage.COMPLEX_NUMBER_TYPE__IMAGINARY:
				unsetImaginary();
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
			case TypesPackage.COMPLEX_NUMBER_TYPE__REAL:
				return isSetReal();
			case TypesPackage.COMPLEX_NUMBER_TYPE__IMAGINARY:
				return isSetImaginary();
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
		result.append(" (real: ");
		if (realESet) result.append(real); else result.append("<unset>");
		result.append(", imaginary: ");
		if (imaginaryESet) result.append(imaginary); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ComplexNumberTypeImpl
