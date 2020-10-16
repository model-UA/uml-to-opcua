/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.opcfoundation.ua._2008._02.types.ContentFilter;
import org.opcfoundation.ua._2008._02.types.ListOfContentFilterElement;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Content Filter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ContentFilterImpl#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContentFilterImpl extends MinimalEObjectImpl.Container implements ContentFilter {
	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected ListOfContentFilterElement elements;

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
	protected ContentFilterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getContentFilter();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfContentFilterElement getElements() {
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElements(ListOfContentFilterElement newElements, NotificationChain msgs) {
		ListOfContentFilterElement oldElements = elements;
		elements = newElements;
		boolean oldElementsESet = elementsESet;
		elementsESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.CONTENT_FILTER__ELEMENTS, oldElements, newElements, !oldElementsESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElements(ListOfContentFilterElement newElements) {
		if (newElements != elements) {
			NotificationChain msgs = null;
			if (elements != null)
				msgs = ((InternalEObject)elements).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.CONTENT_FILTER__ELEMENTS, null, msgs);
			if (newElements != null)
				msgs = ((InternalEObject)newElements).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.CONTENT_FILTER__ELEMENTS, null, msgs);
			msgs = basicSetElements(newElements, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldElementsESet = elementsESet;
			elementsESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.CONTENT_FILTER__ELEMENTS, newElements, newElements, !oldElementsESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetElements(NotificationChain msgs) {
		ListOfContentFilterElement oldElements = elements;
		elements = null;
		boolean oldElementsESet = elementsESet;
		elementsESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.CONTENT_FILTER__ELEMENTS, oldElements, null, oldElementsESet);
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
			msgs = ((InternalEObject)elements).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.CONTENT_FILTER__ELEMENTS, null, msgs);
			msgs = basicUnsetElements(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldElementsESet = elementsESet;
			elementsESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.CONTENT_FILTER__ELEMENTS, null, null, oldElementsESet));
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
			case TypesPackage.CONTENT_FILTER__ELEMENTS:
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
			case TypesPackage.CONTENT_FILTER__ELEMENTS:
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
			case TypesPackage.CONTENT_FILTER__ELEMENTS:
				setElements((ListOfContentFilterElement)newValue);
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
			case TypesPackage.CONTENT_FILTER__ELEMENTS:
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
			case TypesPackage.CONTENT_FILTER__ELEMENTS:
				return isSetElements();
		}
		return super.eIsSet(featureID);
	}

} //ContentFilterImpl
