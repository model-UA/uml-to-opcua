/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.opcfoundation.ua._2008._02.types.ThreeDCartesianCoordinates;
import org.opcfoundation.ua._2008._02.types.ThreeDFrame;
import org.opcfoundation.ua._2008._02.types.ThreeDOrientation;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Three DFrame</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ThreeDFrameImpl#getCartesianCoordinates <em>Cartesian Coordinates</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ThreeDFrameImpl#getOrientation <em>Orientation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ThreeDFrameImpl extends FrameImpl implements ThreeDFrame {
	/**
	 * The cached value of the '{@link #getCartesianCoordinates() <em>Cartesian Coordinates</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCartesianCoordinates()
	 * @generated
	 * @ordered
	 */
	protected ThreeDCartesianCoordinates cartesianCoordinates;

	/**
	 * This is true if the Cartesian Coordinates containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean cartesianCoordinatesESet;

	/**
	 * The cached value of the '{@link #getOrientation() <em>Orientation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrientation()
	 * @generated
	 * @ordered
	 */
	protected ThreeDOrientation orientation;

	/**
	 * This is true if the Orientation containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean orientationESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ThreeDFrameImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getThreeDFrame();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThreeDCartesianCoordinates getCartesianCoordinates() {
		return cartesianCoordinates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCartesianCoordinates(ThreeDCartesianCoordinates newCartesianCoordinates, NotificationChain msgs) {
		ThreeDCartesianCoordinates oldCartesianCoordinates = cartesianCoordinates;
		cartesianCoordinates = newCartesianCoordinates;
		boolean oldCartesianCoordinatesESet = cartesianCoordinatesESet;
		cartesianCoordinatesESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.THREE_DFRAME__CARTESIAN_COORDINATES, oldCartesianCoordinates, newCartesianCoordinates, !oldCartesianCoordinatesESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCartesianCoordinates(ThreeDCartesianCoordinates newCartesianCoordinates) {
		if (newCartesianCoordinates != cartesianCoordinates) {
			NotificationChain msgs = null;
			if (cartesianCoordinates != null)
				msgs = ((InternalEObject)cartesianCoordinates).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.THREE_DFRAME__CARTESIAN_COORDINATES, null, msgs);
			if (newCartesianCoordinates != null)
				msgs = ((InternalEObject)newCartesianCoordinates).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.THREE_DFRAME__CARTESIAN_COORDINATES, null, msgs);
			msgs = basicSetCartesianCoordinates(newCartesianCoordinates, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldCartesianCoordinatesESet = cartesianCoordinatesESet;
			cartesianCoordinatesESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.THREE_DFRAME__CARTESIAN_COORDINATES, newCartesianCoordinates, newCartesianCoordinates, !oldCartesianCoordinatesESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetCartesianCoordinates(NotificationChain msgs) {
		ThreeDCartesianCoordinates oldCartesianCoordinates = cartesianCoordinates;
		cartesianCoordinates = null;
		boolean oldCartesianCoordinatesESet = cartesianCoordinatesESet;
		cartesianCoordinatesESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.THREE_DFRAME__CARTESIAN_COORDINATES, oldCartesianCoordinates, null, oldCartesianCoordinatesESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCartesianCoordinates() {
		if (cartesianCoordinates != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)cartesianCoordinates).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.THREE_DFRAME__CARTESIAN_COORDINATES, null, msgs);
			msgs = basicUnsetCartesianCoordinates(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldCartesianCoordinatesESet = cartesianCoordinatesESet;
			cartesianCoordinatesESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.THREE_DFRAME__CARTESIAN_COORDINATES, null, null, oldCartesianCoordinatesESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCartesianCoordinates() {
		return cartesianCoordinatesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThreeDOrientation getOrientation() {
		return orientation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrientation(ThreeDOrientation newOrientation, NotificationChain msgs) {
		ThreeDOrientation oldOrientation = orientation;
		orientation = newOrientation;
		boolean oldOrientationESet = orientationESet;
		orientationESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.THREE_DFRAME__ORIENTATION, oldOrientation, newOrientation, !oldOrientationESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrientation(ThreeDOrientation newOrientation) {
		if (newOrientation != orientation) {
			NotificationChain msgs = null;
			if (orientation != null)
				msgs = ((InternalEObject)orientation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.THREE_DFRAME__ORIENTATION, null, msgs);
			if (newOrientation != null)
				msgs = ((InternalEObject)newOrientation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.THREE_DFRAME__ORIENTATION, null, msgs);
			msgs = basicSetOrientation(newOrientation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldOrientationESet = orientationESet;
			orientationESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.THREE_DFRAME__ORIENTATION, newOrientation, newOrientation, !oldOrientationESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetOrientation(NotificationChain msgs) {
		ThreeDOrientation oldOrientation = orientation;
		orientation = null;
		boolean oldOrientationESet = orientationESet;
		orientationESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.THREE_DFRAME__ORIENTATION, oldOrientation, null, oldOrientationESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetOrientation() {
		if (orientation != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)orientation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.THREE_DFRAME__ORIENTATION, null, msgs);
			msgs = basicUnsetOrientation(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldOrientationESet = orientationESet;
			orientationESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.THREE_DFRAME__ORIENTATION, null, null, oldOrientationESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOrientation() {
		return orientationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.THREE_DFRAME__CARTESIAN_COORDINATES:
				return basicUnsetCartesianCoordinates(msgs);
			case TypesPackage.THREE_DFRAME__ORIENTATION:
				return basicUnsetOrientation(msgs);
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
			case TypesPackage.THREE_DFRAME__CARTESIAN_COORDINATES:
				return getCartesianCoordinates();
			case TypesPackage.THREE_DFRAME__ORIENTATION:
				return getOrientation();
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
			case TypesPackage.THREE_DFRAME__CARTESIAN_COORDINATES:
				setCartesianCoordinates((ThreeDCartesianCoordinates)newValue);
				return;
			case TypesPackage.THREE_DFRAME__ORIENTATION:
				setOrientation((ThreeDOrientation)newValue);
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
			case TypesPackage.THREE_DFRAME__CARTESIAN_COORDINATES:
				unsetCartesianCoordinates();
				return;
			case TypesPackage.THREE_DFRAME__ORIENTATION:
				unsetOrientation();
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
			case TypesPackage.THREE_DFRAME__CARTESIAN_COORDINATES:
				return isSetCartesianCoordinates();
			case TypesPackage.THREE_DFRAME__ORIENTATION:
				return isSetOrientation();
		}
		return super.eIsSet(featureID);
	}

} //ThreeDFrameImpl
