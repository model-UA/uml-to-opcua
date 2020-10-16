/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.opcfoundation.ua._2008._02.types.EventFieldList;
import org.opcfoundation.ua._2008._02.types.ListOfVariant;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event Field List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.EventFieldListImpl#getClientHandle <em>Client Handle</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.EventFieldListImpl#getEventFields <em>Event Fields</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EventFieldListImpl extends MinimalEObjectImpl.Container implements EventFieldList {
	/**
	 * The default value of the '{@link #getClientHandle() <em>Client Handle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientHandle()
	 * @generated
	 * @ordered
	 */
	protected static final long CLIENT_HANDLE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getClientHandle() <em>Client Handle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientHandle()
	 * @generated
	 * @ordered
	 */
	protected long clientHandle = CLIENT_HANDLE_EDEFAULT;

	/**
	 * This is true if the Client Handle attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean clientHandleESet;

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
	protected EventFieldListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getEventFieldList();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getClientHandle() {
		return clientHandle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClientHandle(long newClientHandle) {
		long oldClientHandle = clientHandle;
		clientHandle = newClientHandle;
		boolean oldClientHandleESet = clientHandleESet;
		clientHandleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.EVENT_FIELD_LIST__CLIENT_HANDLE, oldClientHandle, clientHandle, !oldClientHandleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetClientHandle() {
		long oldClientHandle = clientHandle;
		boolean oldClientHandleESet = clientHandleESet;
		clientHandle = CLIENT_HANDLE_EDEFAULT;
		clientHandleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.EVENT_FIELD_LIST__CLIENT_HANDLE, oldClientHandle, CLIENT_HANDLE_EDEFAULT, oldClientHandleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetClientHandle() {
		return clientHandleESet;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.EVENT_FIELD_LIST__EVENT_FIELDS, oldEventFields, newEventFields, !oldEventFieldsESet);
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
				msgs = ((InternalEObject)eventFields).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.EVENT_FIELD_LIST__EVENT_FIELDS, null, msgs);
			if (newEventFields != null)
				msgs = ((InternalEObject)newEventFields).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.EVENT_FIELD_LIST__EVENT_FIELDS, null, msgs);
			msgs = basicSetEventFields(newEventFields, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldEventFieldsESet = eventFieldsESet;
			eventFieldsESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.EVENT_FIELD_LIST__EVENT_FIELDS, newEventFields, newEventFields, !oldEventFieldsESet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.EVENT_FIELD_LIST__EVENT_FIELDS, oldEventFields, null, oldEventFieldsESet);
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
			msgs = ((InternalEObject)eventFields).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.EVENT_FIELD_LIST__EVENT_FIELDS, null, msgs);
			msgs = basicUnsetEventFields(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldEventFieldsESet = eventFieldsESet;
			eventFieldsESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.EVENT_FIELD_LIST__EVENT_FIELDS, null, null, oldEventFieldsESet));
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
			case TypesPackage.EVENT_FIELD_LIST__EVENT_FIELDS:
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
			case TypesPackage.EVENT_FIELD_LIST__CLIENT_HANDLE:
				return getClientHandle();
			case TypesPackage.EVENT_FIELD_LIST__EVENT_FIELDS:
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
			case TypesPackage.EVENT_FIELD_LIST__CLIENT_HANDLE:
				setClientHandle((Long)newValue);
				return;
			case TypesPackage.EVENT_FIELD_LIST__EVENT_FIELDS:
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
			case TypesPackage.EVENT_FIELD_LIST__CLIENT_HANDLE:
				unsetClientHandle();
				return;
			case TypesPackage.EVENT_FIELD_LIST__EVENT_FIELDS:
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
			case TypesPackage.EVENT_FIELD_LIST__CLIENT_HANDLE:
				return isSetClientHandle();
			case TypesPackage.EVENT_FIELD_LIST__EVENT_FIELDS:
				return isSetEventFields();
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
		result.append(" (clientHandle: ");
		if (clientHandleESet) result.append(clientHandle); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //EventFieldListImpl
