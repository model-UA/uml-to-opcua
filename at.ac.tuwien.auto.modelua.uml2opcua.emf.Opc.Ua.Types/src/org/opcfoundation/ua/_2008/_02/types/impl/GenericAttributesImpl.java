/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.opcfoundation.ua._2008._02.types.GenericAttributes;
import org.opcfoundation.ua._2008._02.types.ListOfGenericAttributeValue;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generic Attributes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.GenericAttributesImpl#getAttributeValues <em>Attribute Values</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GenericAttributesImpl extends NodeAttributesImpl implements GenericAttributes {
	/**
	 * The cached value of the '{@link #getAttributeValues() <em>Attribute Values</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeValues()
	 * @generated
	 * @ordered
	 */
	protected ListOfGenericAttributeValue attributeValues;

	/**
	 * This is true if the Attribute Values containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean attributeValuesESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenericAttributesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getGenericAttributes();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfGenericAttributeValue getAttributeValues() {
		return attributeValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttributeValues(ListOfGenericAttributeValue newAttributeValues, NotificationChain msgs) {
		ListOfGenericAttributeValue oldAttributeValues = attributeValues;
		attributeValues = newAttributeValues;
		boolean oldAttributeValuesESet = attributeValuesESet;
		attributeValuesESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.GENERIC_ATTRIBUTES__ATTRIBUTE_VALUES, oldAttributeValues, newAttributeValues, !oldAttributeValuesESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributeValues(ListOfGenericAttributeValue newAttributeValues) {
		if (newAttributeValues != attributeValues) {
			NotificationChain msgs = null;
			if (attributeValues != null)
				msgs = ((InternalEObject)attributeValues).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.GENERIC_ATTRIBUTES__ATTRIBUTE_VALUES, null, msgs);
			if (newAttributeValues != null)
				msgs = ((InternalEObject)newAttributeValues).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.GENERIC_ATTRIBUTES__ATTRIBUTE_VALUES, null, msgs);
			msgs = basicSetAttributeValues(newAttributeValues, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldAttributeValuesESet = attributeValuesESet;
			attributeValuesESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.GENERIC_ATTRIBUTES__ATTRIBUTE_VALUES, newAttributeValues, newAttributeValues, !oldAttributeValuesESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetAttributeValues(NotificationChain msgs) {
		ListOfGenericAttributeValue oldAttributeValues = attributeValues;
		attributeValues = null;
		boolean oldAttributeValuesESet = attributeValuesESet;
		attributeValuesESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.GENERIC_ATTRIBUTES__ATTRIBUTE_VALUES, oldAttributeValues, null, oldAttributeValuesESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAttributeValues() {
		if (attributeValues != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)attributeValues).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.GENERIC_ATTRIBUTES__ATTRIBUTE_VALUES, null, msgs);
			msgs = basicUnsetAttributeValues(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldAttributeValuesESet = attributeValuesESet;
			attributeValuesESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.GENERIC_ATTRIBUTES__ATTRIBUTE_VALUES, null, null, oldAttributeValuesESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAttributeValues() {
		return attributeValuesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.GENERIC_ATTRIBUTES__ATTRIBUTE_VALUES:
				return basicUnsetAttributeValues(msgs);
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
			case TypesPackage.GENERIC_ATTRIBUTES__ATTRIBUTE_VALUES:
				return getAttributeValues();
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
			case TypesPackage.GENERIC_ATTRIBUTES__ATTRIBUTE_VALUES:
				setAttributeValues((ListOfGenericAttributeValue)newValue);
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
			case TypesPackage.GENERIC_ATTRIBUTES__ATTRIBUTE_VALUES:
				unsetAttributeValues();
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
			case TypesPackage.GENERIC_ATTRIBUTES__ATTRIBUTE_VALUES:
				return isSetAttributeValues();
		}
		return super.eIsSet(featureID);
	}

} //GenericAttributesImpl
