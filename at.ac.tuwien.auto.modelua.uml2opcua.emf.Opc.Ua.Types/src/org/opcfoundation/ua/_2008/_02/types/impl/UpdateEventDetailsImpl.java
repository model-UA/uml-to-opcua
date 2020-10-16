/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.opcfoundation.ua._2008._02.types.EventFilter;
import org.opcfoundation.ua._2008._02.types.ListOfHistoryEventFieldList;
import org.opcfoundation.ua._2008._02.types.PerformUpdateType;
import org.opcfoundation.ua._2008._02.types.TypesPackage;
import org.opcfoundation.ua._2008._02.types.UpdateEventDetails;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Update Event Details</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.UpdateEventDetailsImpl#getPerformInsertReplace <em>Perform Insert Replace</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.UpdateEventDetailsImpl#getFilter <em>Filter</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.UpdateEventDetailsImpl#getEventData <em>Event Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UpdateEventDetailsImpl extends HistoryUpdateDetailsImpl implements UpdateEventDetails {
	/**
	 * The default value of the '{@link #getPerformInsertReplace() <em>Perform Insert Replace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformInsertReplace()
	 * @generated
	 * @ordered
	 */
	protected static final PerformUpdateType PERFORM_INSERT_REPLACE_EDEFAULT = PerformUpdateType.INSERT1;

	/**
	 * The cached value of the '{@link #getPerformInsertReplace() <em>Perform Insert Replace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformInsertReplace()
	 * @generated
	 * @ordered
	 */
	protected PerformUpdateType performInsertReplace = PERFORM_INSERT_REPLACE_EDEFAULT;

	/**
	 * This is true if the Perform Insert Replace attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean performInsertReplaceESet;

	/**
	 * The cached value of the '{@link #getFilter() <em>Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilter()
	 * @generated
	 * @ordered
	 */
	protected EventFilter filter;

	/**
	 * This is true if the Filter containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean filterESet;

	/**
	 * The cached value of the '{@link #getEventData() <em>Event Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventData()
	 * @generated
	 * @ordered
	 */
	protected ListOfHistoryEventFieldList eventData;

	/**
	 * This is true if the Event Data containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean eventDataESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UpdateEventDetailsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getUpdateEventDetails();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformUpdateType getPerformInsertReplace() {
		return performInsertReplace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPerformInsertReplace(PerformUpdateType newPerformInsertReplace) {
		PerformUpdateType oldPerformInsertReplace = performInsertReplace;
		performInsertReplace = newPerformInsertReplace == null ? PERFORM_INSERT_REPLACE_EDEFAULT : newPerformInsertReplace;
		boolean oldPerformInsertReplaceESet = performInsertReplaceESet;
		performInsertReplaceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.UPDATE_EVENT_DETAILS__PERFORM_INSERT_REPLACE, oldPerformInsertReplace, performInsertReplace, !oldPerformInsertReplaceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPerformInsertReplace() {
		PerformUpdateType oldPerformInsertReplace = performInsertReplace;
		boolean oldPerformInsertReplaceESet = performInsertReplaceESet;
		performInsertReplace = PERFORM_INSERT_REPLACE_EDEFAULT;
		performInsertReplaceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.UPDATE_EVENT_DETAILS__PERFORM_INSERT_REPLACE, oldPerformInsertReplace, PERFORM_INSERT_REPLACE_EDEFAULT, oldPerformInsertReplaceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPerformInsertReplace() {
		return performInsertReplaceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventFilter getFilter() {
		return filter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFilter(EventFilter newFilter, NotificationChain msgs) {
		EventFilter oldFilter = filter;
		filter = newFilter;
		boolean oldFilterESet = filterESet;
		filterESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.UPDATE_EVENT_DETAILS__FILTER, oldFilter, newFilter, !oldFilterESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilter(EventFilter newFilter) {
		if (newFilter != filter) {
			NotificationChain msgs = null;
			if (filter != null)
				msgs = ((InternalEObject)filter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.UPDATE_EVENT_DETAILS__FILTER, null, msgs);
			if (newFilter != null)
				msgs = ((InternalEObject)newFilter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.UPDATE_EVENT_DETAILS__FILTER, null, msgs);
			msgs = basicSetFilter(newFilter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldFilterESet = filterESet;
			filterESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.UPDATE_EVENT_DETAILS__FILTER, newFilter, newFilter, !oldFilterESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetFilter(NotificationChain msgs) {
		EventFilter oldFilter = filter;
		filter = null;
		boolean oldFilterESet = filterESet;
		filterESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.UPDATE_EVENT_DETAILS__FILTER, oldFilter, null, oldFilterESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFilter() {
		if (filter != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)filter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.UPDATE_EVENT_DETAILS__FILTER, null, msgs);
			msgs = basicUnsetFilter(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldFilterESet = filterESet;
			filterESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.UPDATE_EVENT_DETAILS__FILTER, null, null, oldFilterESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFilter() {
		return filterESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfHistoryEventFieldList getEventData() {
		return eventData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEventData(ListOfHistoryEventFieldList newEventData, NotificationChain msgs) {
		ListOfHistoryEventFieldList oldEventData = eventData;
		eventData = newEventData;
		boolean oldEventDataESet = eventDataESet;
		eventDataESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.UPDATE_EVENT_DETAILS__EVENT_DATA, oldEventData, newEventData, !oldEventDataESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEventData(ListOfHistoryEventFieldList newEventData) {
		if (newEventData != eventData) {
			NotificationChain msgs = null;
			if (eventData != null)
				msgs = ((InternalEObject)eventData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.UPDATE_EVENT_DETAILS__EVENT_DATA, null, msgs);
			if (newEventData != null)
				msgs = ((InternalEObject)newEventData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.UPDATE_EVENT_DETAILS__EVENT_DATA, null, msgs);
			msgs = basicSetEventData(newEventData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldEventDataESet = eventDataESet;
			eventDataESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.UPDATE_EVENT_DETAILS__EVENT_DATA, newEventData, newEventData, !oldEventDataESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetEventData(NotificationChain msgs) {
		ListOfHistoryEventFieldList oldEventData = eventData;
		eventData = null;
		boolean oldEventDataESet = eventDataESet;
		eventDataESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.UPDATE_EVENT_DETAILS__EVENT_DATA, oldEventData, null, oldEventDataESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEventData() {
		if (eventData != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)eventData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.UPDATE_EVENT_DETAILS__EVENT_DATA, null, msgs);
			msgs = basicUnsetEventData(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldEventDataESet = eventDataESet;
			eventDataESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.UPDATE_EVENT_DETAILS__EVENT_DATA, null, null, oldEventDataESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEventData() {
		return eventDataESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.UPDATE_EVENT_DETAILS__FILTER:
				return basicUnsetFilter(msgs);
			case TypesPackage.UPDATE_EVENT_DETAILS__EVENT_DATA:
				return basicUnsetEventData(msgs);
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
			case TypesPackage.UPDATE_EVENT_DETAILS__PERFORM_INSERT_REPLACE:
				return getPerformInsertReplace();
			case TypesPackage.UPDATE_EVENT_DETAILS__FILTER:
				return getFilter();
			case TypesPackage.UPDATE_EVENT_DETAILS__EVENT_DATA:
				return getEventData();
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
			case TypesPackage.UPDATE_EVENT_DETAILS__PERFORM_INSERT_REPLACE:
				setPerformInsertReplace((PerformUpdateType)newValue);
				return;
			case TypesPackage.UPDATE_EVENT_DETAILS__FILTER:
				setFilter((EventFilter)newValue);
				return;
			case TypesPackage.UPDATE_EVENT_DETAILS__EVENT_DATA:
				setEventData((ListOfHistoryEventFieldList)newValue);
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
			case TypesPackage.UPDATE_EVENT_DETAILS__PERFORM_INSERT_REPLACE:
				unsetPerformInsertReplace();
				return;
			case TypesPackage.UPDATE_EVENT_DETAILS__FILTER:
				unsetFilter();
				return;
			case TypesPackage.UPDATE_EVENT_DETAILS__EVENT_DATA:
				unsetEventData();
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
			case TypesPackage.UPDATE_EVENT_DETAILS__PERFORM_INSERT_REPLACE:
				return isSetPerformInsertReplace();
			case TypesPackage.UPDATE_EVENT_DETAILS__FILTER:
				return isSetFilter();
			case TypesPackage.UPDATE_EVENT_DETAILS__EVENT_DATA:
				return isSetEventData();
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
		result.append(" (performInsertReplace: ");
		if (performInsertReplaceESet) result.append(performInsertReplace); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //UpdateEventDetailsImpl
