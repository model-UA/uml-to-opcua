/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.opcfoundation.ua._2008._02.types.HistoryEvent;
import org.opcfoundation.ua._2008._02.types.ListOfHistoryEventFieldList;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>History Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.HistoryEventImpl#getEvents <em>Events</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HistoryEventImpl extends MinimalEObjectImpl.Container implements HistoryEvent {
	/**
	 * The cached value of the '{@link #getEvents() <em>Events</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvents()
	 * @generated
	 * @ordered
	 */
	protected ListOfHistoryEventFieldList events;

	/**
	 * This is true if the Events containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean eventsESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HistoryEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getHistoryEvent();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfHistoryEventFieldList getEvents() {
		return events;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEvents(ListOfHistoryEventFieldList newEvents, NotificationChain msgs) {
		ListOfHistoryEventFieldList oldEvents = events;
		events = newEvents;
		boolean oldEventsESet = eventsESet;
		eventsESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.HISTORY_EVENT__EVENTS, oldEvents, newEvents, !oldEventsESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvents(ListOfHistoryEventFieldList newEvents) {
		if (newEvents != events) {
			NotificationChain msgs = null;
			if (events != null)
				msgs = ((InternalEObject)events).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.HISTORY_EVENT__EVENTS, null, msgs);
			if (newEvents != null)
				msgs = ((InternalEObject)newEvents).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.HISTORY_EVENT__EVENTS, null, msgs);
			msgs = basicSetEvents(newEvents, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldEventsESet = eventsESet;
			eventsESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.HISTORY_EVENT__EVENTS, newEvents, newEvents, !oldEventsESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetEvents(NotificationChain msgs) {
		ListOfHistoryEventFieldList oldEvents = events;
		events = null;
		boolean oldEventsESet = eventsESet;
		eventsESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.HISTORY_EVENT__EVENTS, oldEvents, null, oldEventsESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEvents() {
		if (events != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)events).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.HISTORY_EVENT__EVENTS, null, msgs);
			msgs = basicUnsetEvents(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldEventsESet = eventsESet;
			eventsESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.HISTORY_EVENT__EVENTS, null, null, oldEventsESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEvents() {
		return eventsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.HISTORY_EVENT__EVENTS:
				return basicUnsetEvents(msgs);
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
			case TypesPackage.HISTORY_EVENT__EVENTS:
				return getEvents();
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
			case TypesPackage.HISTORY_EVENT__EVENTS:
				setEvents((ListOfHistoryEventFieldList)newValue);
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
			case TypesPackage.HISTORY_EVENT__EVENTS:
				unsetEvents();
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
			case TypesPackage.HISTORY_EVENT__EVENTS:
				return isSetEvents();
		}
		return super.eIsSet(featureID);
	}

} //HistoryEventImpl
