/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.opcfoundation.ua._2008._02.types.ListOfRelativePathElement;
import org.opcfoundation.ua._2008._02.types.RelativePath;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relative Path</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.RelativePathImpl#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelativePathImpl extends MinimalEObjectImpl.Container implements RelativePath {
	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected ListOfRelativePathElement elements;

	/**
	 * This is true if the Elements containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean elementsESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelativePathImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getRelativePath();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfRelativePathElement getElements() {
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElements(ListOfRelativePathElement newElements, NotificationChain msgs) {
		ListOfRelativePathElement oldElements = elements;
		elements = newElements;
		boolean oldElementsESet = elementsESet;
		elementsESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.RELATIVE_PATH__ELEMENTS, oldElements, newElements, !oldElementsESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElements(ListOfRelativePathElement newElements) {
		if (newElements != elements) {
			NotificationChain msgs = null;
			if (elements != null)
				msgs = ((InternalEObject)elements).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.RELATIVE_PATH__ELEMENTS, null, msgs);
			if (newElements != null)
				msgs = ((InternalEObject)newElements).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.RELATIVE_PATH__ELEMENTS, null, msgs);
			msgs = basicSetElements(newElements, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldElementsESet = elementsESet;
			elementsESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.RELATIVE_PATH__ELEMENTS, newElements, newElements, !oldElementsESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetElements(NotificationChain msgs) {
		ListOfRelativePathElement oldElements = elements;
		elements = null;
		boolean oldElementsESet = elementsESet;
		elementsESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.RELATIVE_PATH__ELEMENTS, oldElements, null, oldElementsESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetElements() {
		if (elements != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)elements).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.RELATIVE_PATH__ELEMENTS, null, msgs);
			msgs = basicUnsetElements(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldElementsESet = elementsESet;
			elementsESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.RELATIVE_PATH__ELEMENTS, null, null, oldElementsESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetElements() {
		return elementsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.RELATIVE_PATH__ELEMENTS:
				return basicUnsetElements(msgs);
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
			case TypesPackage.RELATIVE_PATH__ELEMENTS:
				return getElements();
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
			case TypesPackage.RELATIVE_PATH__ELEMENTS:
				setElements((ListOfRelativePathElement)newValue);
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
			case TypesPackage.RELATIVE_PATH__ELEMENTS:
				unsetElements();
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
			case TypesPackage.RELATIVE_PATH__ELEMENTS:
				return isSetElements();
		}
		return super.eIsSet(featureID);
	}

} //RelativePathImpl
