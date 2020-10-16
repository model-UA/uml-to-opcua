/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.opcfoundation.ua._2008._02.types.HistoryEventFieldList;
import org.opcfoundation.ua._2008._02.types.ListOfVariant;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>History Event Field List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.HistoryEventFieldListImpl#getEventFields <em>Event Fields</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HistoryEventFieldListImpl extends MinimalEObjectImpl.Container implements HistoryEventFieldList {
	/**
	 * The cached value of the '{@link #getEventFields() <em>Event Fields</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventFields()
	 * @generated
	 * @ordered
	 */
	protected ListOfVariant eventFields;

	/**
	 * This is true if the Event Fields containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean eventFieldsESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HistoryEventFieldListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getHistoryEventFieldList();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfVariant getEventFields() {
		return eventFields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEventFields(ListOfVariant newEventFields, NotificationChain msgs) {
		ListOfVariant oldEventFields = eventFields;
		eventFields = newEventFields;
		boolean oldEventFieldsESet = eventFieldsESet;
		eventFieldsESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.HISTORY_EVENT_FIELD_LIST__EVENT_FIELDS, oldEventFields, newEventFields, !oldEventFieldsESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEventFields(ListOfVariant newEventFields) {
		if (newEventFields != eventFields) {
			NotificationChain msgs = null;
			if (eventFields != null)
				msgs = ((InternalEObject)eventFields).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.HISTORY_EVENT_FIELD_LIST__EVENT_FIELDS, null, msgs);
			if (newEventFields != null)
				msgs = ((InternalEObject)newEventFields).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.HISTORY_EVENT_FIELD_LIST__EVENT_FIELDS, null, msgs);
			msgs = basicSetEventFields(newEventFields, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldEventFieldsESet = eventFieldsESet;
			eventFieldsESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.HISTORY_EVENT_FIELD_LIST__EVENT_FIELDS, newEventFields, newEventFields, !oldEventFieldsESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetEventFields(NotificationChain msgs) {
		ListOfVariant oldEventFields = eventFields;
		eventFields = null;
		boolean oldEventFieldsESet = eventFieldsESet;
		eventFieldsESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.HISTORY_EVENT_FIELD_LIST__EVENT_FIELDS, oldEventFields, null, oldEventFieldsESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEventFields() {
		if (eventFields != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)eventFields).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.HISTORY_EVENT_FIELD_LIST__EVENT_FIELDS, null, msgs);
			msgs = basicUnsetEventFields(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldEventFieldsESet = eventFieldsESet;
			eventFieldsESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.HISTORY_EVENT_FIELD_LIST__EVENT_FIELDS, null, null, oldEventFieldsESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEventFields() {
		return eventFieldsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.HISTORY_EVENT_FIELD_LIST__EVENT_FIELDS:
				return basicUnsetEventFields(msgs);
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
			case TypesPackage.HISTORY_EVENT_FIELD_LIST__EVENT_FIELDS:
				return getEventFields();
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
			case TypesPackage.HISTORY_EVENT_FIELD_LIST__EVENT_FIELDS:
				setEventFields((ListOfVariant)newValue);
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
			case TypesPackage.HISTORY_EVENT_FIELD_LIST__EVENT_FIELDS:
				unsetEventFields();
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
			case TypesPackage.HISTORY_EVENT_FIELD_LIST__EVENT_FIELDS:
				return isSetEventFields();
		}
		return super.eIsSet(featureID);
	}

} //HistoryEventFieldListImpl
