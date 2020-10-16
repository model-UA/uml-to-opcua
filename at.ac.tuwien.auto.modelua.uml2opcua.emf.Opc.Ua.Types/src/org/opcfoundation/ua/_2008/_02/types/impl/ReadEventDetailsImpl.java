/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.opcfoundation.ua._2008._02.types.EventFilter;
import org.opcfoundation.ua._2008._02.types.ReadEventDetails;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Read Event Details</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ReadEventDetailsImpl#getNumValuesPerNode <em>Num Values Per Node</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ReadEventDetailsImpl#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ReadEventDetailsImpl#getEndTime <em>End Time</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ReadEventDetailsImpl#getFilter <em>Filter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReadEventDetailsImpl extends HistoryReadDetailsImpl implements ReadEventDetails {
	/**
	 * The default value of the '{@link #getNumValuesPerNode() <em>Num Values Per Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumValuesPerNode()
	 * @generated
	 * @ordered
	 */
	protected static final long NUM_VALUES_PER_NODE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNumValuesPerNode() <em>Num Values Per Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumValuesPerNode()
	 * @generated
	 * @ordered
	 */
	protected long numValuesPerNode = NUM_VALUES_PER_NODE_EDEFAULT;

	/**
	 * This is true if the Num Values Per Node attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean numValuesPerNodeESet;

	/**
	 * The default value of the '{@link #getStartTime() <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartTime()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar START_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartTime() <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartTime()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar startTime = START_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndTime() <em>End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndTime()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar END_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndTime() <em>End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndTime()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar endTime = END_TIME_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReadEventDetailsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getReadEventDetails();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNumValuesPerNode() {
		return numValuesPerNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumValuesPerNode(long newNumValuesPerNode) {
		long oldNumValuesPerNode = numValuesPerNode;
		numValuesPerNode = newNumValuesPerNode;
		boolean oldNumValuesPerNodeESet = numValuesPerNodeESet;
		numValuesPerNodeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.READ_EVENT_DETAILS__NUM_VALUES_PER_NODE, oldNumValuesPerNode, numValuesPerNode, !oldNumValuesPerNodeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNumValuesPerNode() {
		long oldNumValuesPerNode = numValuesPerNode;
		boolean oldNumValuesPerNodeESet = numValuesPerNodeESet;
		numValuesPerNode = NUM_VALUES_PER_NODE_EDEFAULT;
		numValuesPerNodeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.READ_EVENT_DETAILS__NUM_VALUES_PER_NODE, oldNumValuesPerNode, NUM_VALUES_PER_NODE_EDEFAULT, oldNumValuesPerNodeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNumValuesPerNode() {
		return numValuesPerNodeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getStartTime() {
		return startTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartTime(XMLGregorianCalendar newStartTime) {
		XMLGregorianCalendar oldStartTime = startTime;
		startTime = newStartTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.READ_EVENT_DETAILS__START_TIME, oldStartTime, startTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getEndTime() {
		return endTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndTime(XMLGregorianCalendar newEndTime) {
		XMLGregorianCalendar oldEndTime = endTime;
		endTime = newEndTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.READ_EVENT_DETAILS__END_TIME, oldEndTime, endTime));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.READ_EVENT_DETAILS__FILTER, oldFilter, newFilter, !oldFilterESet);
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
				msgs = ((InternalEObject)filter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.READ_EVENT_DETAILS__FILTER, null, msgs);
			if (newFilter != null)
				msgs = ((InternalEObject)newFilter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.READ_EVENT_DETAILS__FILTER, null, msgs);
			msgs = basicSetFilter(newFilter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldFilterESet = filterESet;
			filterESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.READ_EVENT_DETAILS__FILTER, newFilter, newFilter, !oldFilterESet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.READ_EVENT_DETAILS__FILTER, oldFilter, null, oldFilterESet);
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
			msgs = ((InternalEObject)filter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.READ_EVENT_DETAILS__FILTER, null, msgs);
			msgs = basicUnsetFilter(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldFilterESet = filterESet;
			filterESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.READ_EVENT_DETAILS__FILTER, null, null, oldFilterESet));
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
			case TypesPackage.READ_EVENT_DETAILS__FILTER:
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
			case TypesPackage.READ_EVENT_DETAILS__NUM_VALUES_PER_NODE:
				return getNumValuesPerNode();
			case TypesPackage.READ_EVENT_DETAILS__START_TIME:
				return getStartTime();
			case TypesPackage.READ_EVENT_DETAILS__END_TIME:
				return getEndTime();
			case TypesPackage.READ_EVENT_DETAILS__FILTER:
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
			case TypesPackage.READ_EVENT_DETAILS__NUM_VALUES_PER_NODE:
				setNumValuesPerNode((Long)newValue);
				return;
			case TypesPackage.READ_EVENT_DETAILS__START_TIME:
				setStartTime((XMLGregorianCalendar)newValue);
				return;
			case TypesPackage.READ_EVENT_DETAILS__END_TIME:
				setEndTime((XMLGregorianCalendar)newValue);
				return;
			case TypesPackage.READ_EVENT_DETAILS__FILTER:
				setFilter((EventFilter)newValue);
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
			case TypesPackage.READ_EVENT_DETAILS__NUM_VALUES_PER_NODE:
				unsetNumValuesPerNode();
				return;
			case TypesPackage.READ_EVENT_DETAILS__START_TIME:
				setStartTime(START_TIME_EDEFAULT);
				return;
			case TypesPackage.READ_EVENT_DETAILS__END_TIME:
				setEndTime(END_TIME_EDEFAULT);
				return;
			case TypesPackage.READ_EVENT_DETAILS__FILTER:
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
			case TypesPackage.READ_EVENT_DETAILS__NUM_VALUES_PER_NODE:
				return isSetNumValuesPerNode();
			case TypesPackage.READ_EVENT_DETAILS__START_TIME:
				return START_TIME_EDEFAULT == null ? startTime != null : !START_TIME_EDEFAULT.equals(startTime);
			case TypesPackage.READ_EVENT_DETAILS__END_TIME:
				return END_TIME_EDEFAULT == null ? endTime != null : !END_TIME_EDEFAULT.equals(endTime);
			case TypesPackage.READ_EVENT_DETAILS__FILTER:
				return isSetFilter();
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
		result.append(" (numValuesPerNode: ");
		if (numValuesPerNodeESet) result.append(numValuesPerNode); else result.append("<unset>");
		result.append(", startTime: ");
		result.append(startTime);
		result.append(", endTime: ");
		result.append(endTime);
		result.append(')');
		return result.toString();
	}

} //ReadEventDetailsImpl
