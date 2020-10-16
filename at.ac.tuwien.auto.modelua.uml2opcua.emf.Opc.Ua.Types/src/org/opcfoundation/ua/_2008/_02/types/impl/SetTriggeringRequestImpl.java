/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.opcfoundation.ua._2008._02.types.ListOfUInt32;
import org.opcfoundation.ua._2008._02.types.RequestHeader;
import org.opcfoundation.ua._2008._02.types.SetTriggeringRequest;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Set Triggering Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.SetTriggeringRequestImpl#getRequestHeader <em>Request Header</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.SetTriggeringRequestImpl#getSubscriptionId <em>Subscription Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.SetTriggeringRequestImpl#getTriggeringItemId <em>Triggering Item Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.SetTriggeringRequestImpl#getLinksToAdd <em>Links To Add</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.SetTriggeringRequestImpl#getLinksToRemove <em>Links To Remove</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SetTriggeringRequestImpl extends MinimalEObjectImpl.Container implements SetTriggeringRequest {
	/**
	 * The cached value of the '{@link #getRequestHeader() <em>Request Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestHeader()
	 * @generated
	 * @ordered
	 */
	protected RequestHeader requestHeader;

	/**
	 * This is true if the Request Header containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean requestHeaderESet;

	/**
	 * The default value of the '{@link #getSubscriptionId() <em>Subscription Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscriptionId()
	 * @generated
	 * @ordered
	 */
	protected static final long SUBSCRIPTION_ID_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getSubscriptionId() <em>Subscription Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscriptionId()
	 * @generated
	 * @ordered
	 */
	protected long subscriptionId = SUBSCRIPTION_ID_EDEFAULT;

	/**
	 * This is true if the Subscription Id attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean subscriptionIdESet;

	/**
	 * The default value of the '{@link #getTriggeringItemId() <em>Triggering Item Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggeringItemId()
	 * @generated
	 * @ordered
	 */
	protected static final long TRIGGERING_ITEM_ID_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getTriggeringItemId() <em>Triggering Item Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggeringItemId()
	 * @generated
	 * @ordered
	 */
	protected long triggeringItemId = TRIGGERING_ITEM_ID_EDEFAULT;

	/**
	 * This is true if the Triggering Item Id attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean triggeringItemIdESet;

	/**
	 * The cached value of the '{@link #getLinksToAdd() <em>Links To Add</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinksToAdd()
	 * @generated
	 * @ordered
	 */
	protected ListOfUInt32 linksToAdd;

	/**
	 * This is true if the Links To Add containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean linksToAddESet;

	/**
	 * The cached value of the '{@link #getLinksToRemove() <em>Links To Remove</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinksToRemove()
	 * @generated
	 * @ordered
	 */
	protected ListOfUInt32 linksToRemove;

	/**
	 * This is true if the Links To Remove containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean linksToRemoveESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SetTriggeringRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getSetTriggeringRequest();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestHeader getRequestHeader() {
		return requestHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequestHeader(RequestHeader newRequestHeader, NotificationChain msgs) {
		RequestHeader oldRequestHeader = requestHeader;
		requestHeader = newRequestHeader;
		boolean oldRequestHeaderESet = requestHeaderESet;
		requestHeaderESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.SET_TRIGGERING_REQUEST__REQUEST_HEADER, oldRequestHeader, newRequestHeader, !oldRequestHeaderESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequestHeader(RequestHeader newRequestHeader) {
		if (newRequestHeader != requestHeader) {
			NotificationChain msgs = null;
			if (requestHeader != null)
				msgs = ((InternalEObject)requestHeader).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SET_TRIGGERING_REQUEST__REQUEST_HEADER, null, msgs);
			if (newRequestHeader != null)
				msgs = ((InternalEObject)newRequestHeader).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SET_TRIGGERING_REQUEST__REQUEST_HEADER, null, msgs);
			msgs = basicSetRequestHeader(newRequestHeader, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldRequestHeaderESet = requestHeaderESet;
			requestHeaderESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SET_TRIGGERING_REQUEST__REQUEST_HEADER, newRequestHeader, newRequestHeader, !oldRequestHeaderESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetRequestHeader(NotificationChain msgs) {
		RequestHeader oldRequestHeader = requestHeader;
		requestHeader = null;
		boolean oldRequestHeaderESet = requestHeaderESet;
		requestHeaderESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.SET_TRIGGERING_REQUEST__REQUEST_HEADER, oldRequestHeader, null, oldRequestHeaderESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRequestHeader() {
		if (requestHeader != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)requestHeader).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SET_TRIGGERING_REQUEST__REQUEST_HEADER, null, msgs);
			msgs = basicUnsetRequestHeader(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldRequestHeaderESet = requestHeaderESet;
			requestHeaderESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.SET_TRIGGERING_REQUEST__REQUEST_HEADER, null, null, oldRequestHeaderESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRequestHeader() {
		return requestHeaderESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getSubscriptionId() {
		return subscriptionId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubscriptionId(long newSubscriptionId) {
		long oldSubscriptionId = subscriptionId;
		subscriptionId = newSubscriptionId;
		boolean oldSubscriptionIdESet = subscriptionIdESet;
		subscriptionIdESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SET_TRIGGERING_REQUEST__SUBSCRIPTION_ID, oldSubscriptionId, subscriptionId, !oldSubscriptionIdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSubscriptionId() {
		long oldSubscriptionId = subscriptionId;
		boolean oldSubscriptionIdESet = subscriptionIdESet;
		subscriptionId = SUBSCRIPTION_ID_EDEFAULT;
		subscriptionIdESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.SET_TRIGGERING_REQUEST__SUBSCRIPTION_ID, oldSubscriptionId, SUBSCRIPTION_ID_EDEFAULT, oldSubscriptionIdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSubscriptionId() {
		return subscriptionIdESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getTriggeringItemId() {
		return triggeringItemId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTriggeringItemId(long newTriggeringItemId) {
		long oldTriggeringItemId = triggeringItemId;
		triggeringItemId = newTriggeringItemId;
		boolean oldTriggeringItemIdESet = triggeringItemIdESet;
		triggeringItemIdESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SET_TRIGGERING_REQUEST__TRIGGERING_ITEM_ID, oldTriggeringItemId, triggeringItemId, !oldTriggeringItemIdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTriggeringItemId() {
		long oldTriggeringItemId = triggeringItemId;
		boolean oldTriggeringItemIdESet = triggeringItemIdESet;
		triggeringItemId = TRIGGERING_ITEM_ID_EDEFAULT;
		triggeringItemIdESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.SET_TRIGGERING_REQUEST__TRIGGERING_ITEM_ID, oldTriggeringItemId, TRIGGERING_ITEM_ID_EDEFAULT, oldTriggeringItemIdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTriggeringItemId() {
		return triggeringItemIdESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfUInt32 getLinksToAdd() {
		return linksToAdd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLinksToAdd(ListOfUInt32 newLinksToAdd, NotificationChain msgs) {
		ListOfUInt32 oldLinksToAdd = linksToAdd;
		linksToAdd = newLinksToAdd;
		boolean oldLinksToAddESet = linksToAddESet;
		linksToAddESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.SET_TRIGGERING_REQUEST__LINKS_TO_ADD, oldLinksToAdd, newLinksToAdd, !oldLinksToAddESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinksToAdd(ListOfUInt32 newLinksToAdd) {
		if (newLinksToAdd != linksToAdd) {
			NotificationChain msgs = null;
			if (linksToAdd != null)
				msgs = ((InternalEObject)linksToAdd).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SET_TRIGGERING_REQUEST__LINKS_TO_ADD, null, msgs);
			if (newLinksToAdd != null)
				msgs = ((InternalEObject)newLinksToAdd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SET_TRIGGERING_REQUEST__LINKS_TO_ADD, null, msgs);
			msgs = basicSetLinksToAdd(newLinksToAdd, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldLinksToAddESet = linksToAddESet;
			linksToAddESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SET_TRIGGERING_REQUEST__LINKS_TO_ADD, newLinksToAdd, newLinksToAdd, !oldLinksToAddESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetLinksToAdd(NotificationChain msgs) {
		ListOfUInt32 oldLinksToAdd = linksToAdd;
		linksToAdd = null;
		boolean oldLinksToAddESet = linksToAddESet;
		linksToAddESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.SET_TRIGGERING_REQUEST__LINKS_TO_ADD, oldLinksToAdd, null, oldLinksToAddESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLinksToAdd() {
		if (linksToAdd != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)linksToAdd).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SET_TRIGGERING_REQUEST__LINKS_TO_ADD, null, msgs);
			msgs = basicUnsetLinksToAdd(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldLinksToAddESet = linksToAddESet;
			linksToAddESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.SET_TRIGGERING_REQUEST__LINKS_TO_ADD, null, null, oldLinksToAddESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLinksToAdd() {
		return linksToAddESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfUInt32 getLinksToRemove() {
		return linksToRemove;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLinksToRemove(ListOfUInt32 newLinksToRemove, NotificationChain msgs) {
		ListOfUInt32 oldLinksToRemove = linksToRemove;
		linksToRemove = newLinksToRemove;
		boolean oldLinksToRemoveESet = linksToRemoveESet;
		linksToRemoveESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.SET_TRIGGERING_REQUEST__LINKS_TO_REMOVE, oldLinksToRemove, newLinksToRemove, !oldLinksToRemoveESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinksToRemove(ListOfUInt32 newLinksToRemove) {
		if (newLinksToRemove != linksToRemove) {
			NotificationChain msgs = null;
			if (linksToRemove != null)
				msgs = ((InternalEObject)linksToRemove).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SET_TRIGGERING_REQUEST__LINKS_TO_REMOVE, null, msgs);
			if (newLinksToRemove != null)
				msgs = ((InternalEObject)newLinksToRemove).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SET_TRIGGERING_REQUEST__LINKS_TO_REMOVE, null, msgs);
			msgs = basicSetLinksToRemove(newLinksToRemove, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldLinksToRemoveESet = linksToRemoveESet;
			linksToRemoveESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SET_TRIGGERING_REQUEST__LINKS_TO_REMOVE, newLinksToRemove, newLinksToRemove, !oldLinksToRemoveESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetLinksToRemove(NotificationChain msgs) {
		ListOfUInt32 oldLinksToRemove = linksToRemove;
		linksToRemove = null;
		boolean oldLinksToRemoveESet = linksToRemoveESet;
		linksToRemoveESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.SET_TRIGGERING_REQUEST__LINKS_TO_REMOVE, oldLinksToRemove, null, oldLinksToRemoveESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLinksToRemove() {
		if (linksToRemove != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)linksToRemove).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SET_TRIGGERING_REQUEST__LINKS_TO_REMOVE, null, msgs);
			msgs = basicUnsetLinksToRemove(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldLinksToRemoveESet = linksToRemoveESet;
			linksToRemoveESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.SET_TRIGGERING_REQUEST__LINKS_TO_REMOVE, null, null, oldLinksToRemoveESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLinksToRemove() {
		return linksToRemoveESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.SET_TRIGGERING_REQUEST__REQUEST_HEADER:
				return basicUnsetRequestHeader(msgs);
			case TypesPackage.SET_TRIGGERING_REQUEST__LINKS_TO_ADD:
				return basicUnsetLinksToAdd(msgs);
			case TypesPackage.SET_TRIGGERING_REQUEST__LINKS_TO_REMOVE:
				return basicUnsetLinksToRemove(msgs);
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
			case TypesPackage.SET_TRIGGERING_REQUEST__REQUEST_HEADER:
				return getRequestHeader();
			case TypesPackage.SET_TRIGGERING_REQUEST__SUBSCRIPTION_ID:
				return getSubscriptionId();
			case TypesPackage.SET_TRIGGERING_REQUEST__TRIGGERING_ITEM_ID:
				return getTriggeringItemId();
			case TypesPackage.SET_TRIGGERING_REQUEST__LINKS_TO_ADD:
				return getLinksToAdd();
			case TypesPackage.SET_TRIGGERING_REQUEST__LINKS_TO_REMOVE:
				return getLinksToRemove();
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
			case TypesPackage.SET_TRIGGERING_REQUEST__REQUEST_HEADER:
				setRequestHeader((RequestHeader)newValue);
				return;
			case TypesPackage.SET_TRIGGERING_REQUEST__SUBSCRIPTION_ID:
				setSubscriptionId((Long)newValue);
				return;
			case TypesPackage.SET_TRIGGERING_REQUEST__TRIGGERING_ITEM_ID:
				setTriggeringItemId((Long)newValue);
				return;
			case TypesPackage.SET_TRIGGERING_REQUEST__LINKS_TO_ADD:
				setLinksToAdd((ListOfUInt32)newValue);
				return;
			case TypesPackage.SET_TRIGGERING_REQUEST__LINKS_TO_REMOVE:
				setLinksToRemove((ListOfUInt32)newValue);
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
			case TypesPackage.SET_TRIGGERING_REQUEST__REQUEST_HEADER:
				unsetRequestHeader();
				return;
			case TypesPackage.SET_TRIGGERING_REQUEST__SUBSCRIPTION_ID:
				unsetSubscriptionId();
				return;
			case TypesPackage.SET_TRIGGERING_REQUEST__TRIGGERING_ITEM_ID:
				unsetTriggeringItemId();
				return;
			case TypesPackage.SET_TRIGGERING_REQUEST__LINKS_TO_ADD:
				unsetLinksToAdd();
				return;
			case TypesPackage.SET_TRIGGERING_REQUEST__LINKS_TO_REMOVE:
				unsetLinksToRemove();
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
			case TypesPackage.SET_TRIGGERING_REQUEST__REQUEST_HEADER:
				return isSetRequestHeader();
			case TypesPackage.SET_TRIGGERING_REQUEST__SUBSCRIPTION_ID:
				return isSetSubscriptionId();
			case TypesPackage.SET_TRIGGERING_REQUEST__TRIGGERING_ITEM_ID:
				return isSetTriggeringItemId();
			case TypesPackage.SET_TRIGGERING_REQUEST__LINKS_TO_ADD:
				return isSetLinksToAdd();
			case TypesPackage.SET_TRIGGERING_REQUEST__LINKS_TO_REMOVE:
				return isSetLinksToRemove();
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
		result.append(" (subscriptionId: ");
		if (subscriptionIdESet) result.append(subscriptionId); else result.append("<unset>");
		result.append(", triggeringItemId: ");
		if (triggeringItemIdESet) result.append(triggeringItemId); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //SetTriggeringRequestImpl
