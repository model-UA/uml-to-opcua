/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.opcfoundation.ua._2008._02.types.ContentFilter;
import org.opcfoundation.ua._2008._02.types.ListOfSimpleAttributeOperand;
import org.opcfoundation.ua._2008._02.types.NodeId;
import org.opcfoundation.ua._2008._02.types.PublishedEventsDataType;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Published Events Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.PublishedEventsDataTypeImpl#getEventNotifier <em>Event Notifier</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.PublishedEventsDataTypeImpl#getSelectedFields <em>Selected Fields</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.PublishedEventsDataTypeImpl#getFilter <em>Filter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PublishedEventsDataTypeImpl extends PublishedDataSetSourceDataTypeImpl implements PublishedEventsDataType {
	/**
	 * The cached value of the '{@link #getEventNotifier() <em>Event Notifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventNotifier()
	 * @generated
	 * @ordered
	 */
	protected NodeId eventNotifier;

	/**
	 * This is true if the Event Notifier containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean eventNotifierESet;

	/**
	 * The cached value of the '{@link #getSelectedFields() <em>Selected Fields</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectedFields()
	 * @generated
	 * @ordered
	 */
	protected ListOfSimpleAttributeOperand selectedFields;

	/**
	 * This is true if the Selected Fields containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean selectedFieldsESet;

	/**
	 * The cached value of the '{@link #getFilter() <em>Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilter()
	 * @generated
	 * @ordered
	 */
	protected ContentFilter filter;

	/**
	 * This is true if the Filter containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean filterESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PublishedEventsDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getPublishedEventsDataType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeId getEventNotifier() {
		return eventNotifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEventNotifier(NodeId newEventNotifier, NotificationChain msgs) {
		NodeId oldEventNotifier = eventNotifier;
		eventNotifier = newEventNotifier;
		boolean oldEventNotifierESet = eventNotifierESet;
		eventNotifierESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.PUBLISHED_EVENTS_DATA_TYPE__EVENT_NOTIFIER, oldEventNotifier, newEventNotifier, !oldEventNotifierESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEventNotifier(NodeId newEventNotifier) {
		if (newEventNotifier != eventNotifier) {
			NotificationChain msgs = null;
			if (eventNotifier != null)
				msgs = ((InternalEObject)eventNotifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.PUBLISHED_EVENTS_DATA_TYPE__EVENT_NOTIFIER, null, msgs);
			if (newEventNotifier != null)
				msgs = ((InternalEObject)newEventNotifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.PUBLISHED_EVENTS_DATA_TYPE__EVENT_NOTIFIER, null, msgs);
			msgs = basicSetEventNotifier(newEventNotifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldEventNotifierESet = eventNotifierESet;
			eventNotifierESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.PUBLISHED_EVENTS_DATA_TYPE__EVENT_NOTIFIER, newEventNotifier, newEventNotifier, !oldEventNotifierESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetEventNotifier(NotificationChain msgs) {
		NodeId oldEventNotifier = eventNotifier;
		eventNotifier = null;
		boolean oldEventNotifierESet = eventNotifierESet;
		eventNotifierESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.PUBLISHED_EVENTS_DATA_TYPE__EVENT_NOTIFIER, oldEventNotifier, null, oldEventNotifierESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEventNotifier() {
		if (eventNotifier != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)eventNotifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.PUBLISHED_EVENTS_DATA_TYPE__EVENT_NOTIFIER, null, msgs);
			msgs = basicUnsetEventNotifier(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldEventNotifierESet = eventNotifierESet;
			eventNotifierESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.PUBLISHED_EVENTS_DATA_TYPE__EVENT_NOTIFIER, null, null, oldEventNotifierESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEventNotifier() {
		return eventNotifierESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfSimpleAttributeOperand getSelectedFields() {
		return selectedFields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSelectedFields(ListOfSimpleAttributeOperand newSelectedFields, NotificationChain msgs) {
		ListOfSimpleAttributeOperand oldSelectedFields = selectedFields;
		selectedFields = newSelectedFields;
		boolean oldSelectedFieldsESet = selectedFieldsESet;
		selectedFieldsESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.PUBLISHED_EVENTS_DATA_TYPE__SELECTED_FIELDS, oldSelectedFields, newSelectedFields, !oldSelectedFieldsESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelectedFields(ListOfSimpleAttributeOperand newSelectedFields) {
		if (newSelectedFields != selectedFields) {
			NotificationChain msgs = null;
			if (selectedFields != null)
				msgs = ((InternalEObject)selectedFields).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.PUBLISHED_EVENTS_DATA_TYPE__SELECTED_FIELDS, null, msgs);
			if (newSelectedFields != null)
				msgs = ((InternalEObject)newSelectedFields).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.PUBLISHED_EVENTS_DATA_TYPE__SELECTED_FIELDS, null, msgs);
			msgs = basicSetSelectedFields(newSelectedFields, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldSelectedFieldsESet = selectedFieldsESet;
			selectedFieldsESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.PUBLISHED_EVENTS_DATA_TYPE__SELECTED_FIELDS, newSelectedFields, newSelectedFields, !oldSelectedFieldsESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetSelectedFields(NotificationChain msgs) {
		ListOfSimpleAttributeOperand oldSelectedFields = selectedFields;
		selectedFields = null;
		boolean oldSelectedFieldsESet = selectedFieldsESet;
		selectedFieldsESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.PUBLISHED_EVENTS_DATA_TYPE__SELECTED_FIELDS, oldSelectedFields, null, oldSelectedFieldsESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSelectedFields() {
		if (selectedFields != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)selectedFields).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.PUBLISHED_EVENTS_DATA_TYPE__SELECTED_FIELDS, null, msgs);
			msgs = basicUnsetSelectedFields(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldSelectedFieldsESet = selectedFieldsESet;
			selectedFieldsESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.PUBLISHED_EVENTS_DATA_TYPE__SELECTED_FIELDS, null, null, oldSelectedFieldsESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSelectedFields() {
		return selectedFieldsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentFilter getFilter() {
		return filter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFilter(ContentFilter newFilter, NotificationChain msgs) {
		ContentFilter oldFilter = filter;
		filter = newFilter;
		boolean oldFilterESet = filterESet;
		filterESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.PUBLISHED_EVENTS_DATA_TYPE__FILTER, oldFilter, newFilter, !oldFilterESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilter(ContentFilter newFilter) {
		if (newFilter != filter) {
			NotificationChain msgs = null;
			if (filter != null)
				msgs = ((InternalEObject)filter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.PUBLISHED_EVENTS_DATA_TYPE__FILTER, null, msgs);
			if (newFilter != null)
				msgs = ((InternalEObject)newFilter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.PUBLISHED_EVENTS_DATA_TYPE__FILTER, null, msgs);
			msgs = basicSetFilter(newFilter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldFilterESet = filterESet;
			filterESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.PUBLISHED_EVENTS_DATA_TYPE__FILTER, newFilter, newFilter, !oldFilterESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetFilter(NotificationChain msgs) {
		ContentFilter oldFilter = filter;
		filter = null;
		boolean oldFilterESet = filterESet;
		filterESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.PUBLISHED_EVENTS_DATA_TYPE__FILTER, oldFilter, null, oldFilterESet);
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
			msgs = ((InternalEObject)filter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.PUBLISHED_EVENTS_DATA_TYPE__FILTER, null, msgs);
			msgs = basicUnsetFilter(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldFilterESet = filterESet;
			filterESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.PUBLISHED_EVENTS_DATA_TYPE__FILTER, null, null, oldFilterESet));
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
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.PUBLISHED_EVENTS_DATA_TYPE__EVENT_NOTIFIER:
				return basicUnsetEventNotifier(msgs);
			case TypesPackage.PUBLISHED_EVENTS_DATA_TYPE__SELECTED_FIELDS:
				return basicUnsetSelectedFields(msgs);
			case TypesPackage.PUBLISHED_EVENTS_DATA_TYPE__FILTER:
				return basicUnsetFilter(msgs);
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
			case TypesPackage.PUBLISHED_EVENTS_DATA_TYPE__EVENT_NOTIFIER:
				return getEventNotifier();
			case TypesPackage.PUBLISHED_EVENTS_DATA_TYPE__SELECTED_FIELDS:
				return getSelectedFields();
			case TypesPackage.PUBLISHED_EVENTS_DATA_TYPE__FILTER:
				return getFilter();
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
			case TypesPackage.PUBLISHED_EVENTS_DATA_TYPE__EVENT_NOTIFIER:
				setEventNotifier((NodeId)newValue);
				return;
			case TypesPackage.PUBLISHED_EVENTS_DATA_TYPE__SELECTED_FIELDS:
				setSelectedFields((ListOfSimpleAttributeOperand)newValue);
				return;
			case TypesPackage.PUBLISHED_EVENTS_DATA_TYPE__FILTER:
				setFilter((ContentFilter)newValue);
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
			case TypesPackage.PUBLISHED_EVENTS_DATA_TYPE__EVENT_NOTIFIER:
				unsetEventNotifier();
				return;
			case TypesPackage.PUBLISHED_EVENTS_DATA_TYPE__SELECTED_FIELDS:
				unsetSelectedFields();
				return;
			case TypesPackage.PUBLISHED_EVENTS_DATA_TYPE__FILTER:
				unsetFilter();
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
			case TypesPackage.PUBLISHED_EVENTS_DATA_TYPE__EVENT_NOTIFIER:
				return isSetEventNotifier();
			case TypesPackage.PUBLISHED_EVENTS_DATA_TYPE__SELECTED_FIELDS:
				return isSetSelectedFields();
			case TypesPackage.PUBLISHED_EVENTS_DATA_TYPE__FILTER:
				return isSetFilter();
		}
		return super.eIsSet(featureID);
	}

} //PublishedEventsDataTypeImpl
