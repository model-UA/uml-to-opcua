/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.opcfoundation.ua._2008._02.types.ThreeDOrientation;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Three DOrientation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ThreeDOrientationImpl#getA <em>A</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ThreeDOrientationImpl#getB <em>B</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ThreeDOrientationImpl#getC <em>C</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ThreeDOrientationImpl extends OrientationImpl implements ThreeDOrientation {
	/**
	 * The default value of the '{@link #getA() <em>A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getA()
	 * @generated
	 * @ordered
	 */
	protected static final double A_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getA() <em>A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getA()
	 * @generated
	 * @ordered
	 */
	protected double a = A_EDEFAULT;

	/**
	 * This is true if the A attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean aESet;

	/**
	 * The default value of the '{@link #getB() <em>B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getB()
	 * @generated
	 * @ordered
	 */
	protected static final double B_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getB() <em>B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getB()
	 * @generated
	 * @ordered
	 */
	protected double b = B_EDEFAULT;

	/**
	 * This is true if the B attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean bESet;

	/**
	 * The default value of the '{@link #getC() <em>C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getC()
	 * @generated
	 * @ordered
	 */
	protected static final double C_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getC() <em>C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getC()
	 * @generated
	 * @ordered
	 */
	protected double c = C_EDEFAULT;

	/**
	 * This is true if the C attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean cESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ThreeDOrientationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getThreeDOrientation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getA() {
		return a;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setA(double newA) {
		double oldA = a;
		a = newA;
		boolean oldAESet = aESet;
		aESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.THREE_DORIENTATION__A, oldA, a, !oldAESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetA() {
		double oldA = a;
		boolean oldAESet = aESet;
		a = A_EDEFAULT;
		aESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.THREE_DORIENTATION__A, oldA, A_EDEFAULT, oldAESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetA() {
		return aESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getB() {
		return b;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setB(double newB) {
		double oldB = b;
		b = newB;
		boolean oldBESet = bESet;
		bESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.THREE_DORIENTATION__B, oldB, b, !oldBESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetB() {
		double oldB = b;
		boolean oldBESet = bESet;
		b = B_EDEFAULT;
		bESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.THREE_DORIENTATION__B, oldB, B_EDEFAULT, oldBESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetB() {
		return bESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getC() {
		return c;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setC(double newC) {
		double oldC = c;
		c = newC;
		boolean oldCESet = cESet;
		cESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.THREE_DORIENTATION__C, oldC, c, !oldCESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetC() {
		double oldC = c;
		boolean oldCESet = cESet;
		c = C_EDEFAULT;
		cESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.THREE_DORIENTATION__C, oldC, C_EDEFAULT, oldCESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetC() {
		return cESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TypesPackage.THREE_DORIENTATION__A:
				return getA();
			case TypesPackage.THREE_DORIENTATION__B:
				return getB();
			case TypesPackage.THREE_DORIENTATION__C:
				return getC();
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
			case TypesPackage.THREE_DORIENTATION__A:
				setA((Double)newValue);
				return;
			case TypesPackage.THREE_DORIENTATION__B:
				setB((Double)newValue);
				return;
			case TypesPackage.THREE_DORIENTATION__C:
				setC((Double)newValue);
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
			case TypesPackage.THREE_DORIENTATION__A:
				unsetA();
				return;
			case TypesPackage.THREE_DORIENTATION__B:
				unsetB();
				return;
			case TypesPackage.THREE_DORIENTATION__C:
				unsetC();
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
			case TypesPackage.THREE_DORIENTATION__A:
				return isSetA();
			case TypesPackage.THREE_DORIENTATION__B:
				return isSetB();
			case TypesPackage.THREE_DORIENTATION__C:
				return isSetC();
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
		result.append(" (a: ");
		if (aESet) result.append(a); else result.append("<unset>");
		result.append(", b: ");
		if (bESet) result.append(b); else result.append("<unset>");
		result.append(", c: ");
		if (cESet) result.append(c); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ThreeDOrientationImpl
