/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.opcfoundation.ua._2008._02.types.DeleteEventDetails;
import org.opcfoundation.ua._2008._02.types.ListOfByteString;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Delete Event Details</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DeleteEventDetailsImpl#getEventIds <em>Event Ids</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeleteEventDetailsImpl extends HistoryUpdateDetailsImpl implements DeleteEventDetails {
	/**
	 * The cached value of the '{@link #getEventIds() <em>Event Ids</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventIds()
	 * @generated
	 * @ordered
	 */
	protected ListOfByteString eventIds;

	/**
	 * This is true if the Event Ids containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean eventIdsESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeleteEventDetailsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getDeleteEventDetails();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfByteString getEventIds() {
		return eventIds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEventIds(ListOfByteString newEventIds, NotificationChain msgs) {
		ListOfByteString oldEventIds = eventIds;
		eventIds = newEventIds;
		boolean oldEventIdsESet = eventIdsESet;
		eventIdsESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.DELETE_EVENT_DETAILS__EVENT_IDS, oldEventIds, newEventIds, !oldEventIdsESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEventIds(ListOfByteString newEventIds) {
		if (newEventIds != eventIds) {
			NotificationChain msgs = null;
			if (eventIds != null)
				msgs = ((InternalEObject)eventIds).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.DELETE_EVENT_DETAILS__EVENT_IDS, null, msgs);
			if (newEventIds != null)
				msgs = ((InternalEObject)newEventIds).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.DELETE_EVENT_DETAILS__EVENT_IDS, null, msgs);
			msgs = basicSetEventIds(newEventIds, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldEventIdsESet = eventIdsESet;
			eventIdsESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.DELETE_EVENT_DETAILS__EVENT_IDS, newEventIds, newEventIds, !oldEventIdsESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetEventIds(NotificationChain msgs) {
		ListOfByteString oldEventIds = eventIds;
		eventIds = null;
		boolean oldEventIdsESet = eventIdsESet;
		eventIdsESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.DELETE_EVENT_DETAILS__EVENT_IDS, oldEventIds, null, oldEventIdsESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEventIds() {
		if (eventIds != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)eventIds).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.DELETE_EVENT_DETAILS__EVENT_IDS, null, msgs);
			msgs = basicUnsetEventIds(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldEventIdsESet = eventIdsESet;
			eventIdsESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.DELETE_EVENT_DETAILS__EVENT_IDS, null, null, oldEventIdsESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEventIds() {
		return eventIdsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.DELETE_EVENT_DETAILS__EVENT_IDS:
				return basicUnsetEventIds(msgs);
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
			case TypesPackage.DELETE_EVENT_DETAILS__EVENT_IDS:
				return getEventIds();
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
			case TypesPackage.DELETE_EVENT_DETAILS__EVENT_IDS:
				setEventIds((ListOfByteString)newValue);
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
			case TypesPackage.DELETE_EVENT_DETAILS__EVENT_IDS:
				unsetEventIds();
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
			case TypesPackage.DELETE_EVENT_DETAILS__EVENT_IDS:
				return isSetEventIds();
		}
		return super.eIsSet(featureID);
	}

} //DeleteEventDetailsImpl
