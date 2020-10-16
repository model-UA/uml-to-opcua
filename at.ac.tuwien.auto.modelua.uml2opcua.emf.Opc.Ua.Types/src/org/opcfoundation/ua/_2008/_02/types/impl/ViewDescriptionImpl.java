/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.opcfoundation.ua._2008._02.types.NodeId;
import org.opcfoundation.ua._2008._02.types.TypesPackage;
import org.opcfoundation.ua._2008._02.types.ViewDescription;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>View Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ViewDescriptionImpl#getViewId <em>View Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ViewDescriptionImpl#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ViewDescriptionImpl#getViewVersion <em>View Version</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ViewDescriptionImpl extends MinimalEObjectImpl.Container implements ViewDescription {
	/**
	 * The cached value of the '{@link #getViewId() <em>View Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewId()
	 * @generated
	 * @ordered
	 */
	protected NodeId viewId;

	/**
	 * This is true if the View Id containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean viewIdESet;

	/**
	 * The default value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar TIMESTAMP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar timestamp = TIMESTAMP_EDEFAULT;

	/**
	 * The default value of the '{@link #getViewVersion() <em>View Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewVersion()
	 * @generated
	 * @ordered
	 */
	protected static final long VIEW_VERSION_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getViewVersion() <em>View Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewVersion()
	 * @generated
	 * @ordered
	 */
	protected long viewVersion = VIEW_VERSION_EDEFAULT;

	/**
	 * This is true if the View Version attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean viewVersionESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getViewDescription();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeId getViewId() {
		return viewId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetViewId(NodeId newViewId, NotificationChain msgs) {
		NodeId oldViewId = viewId;
		viewId = newViewId;
		boolean oldViewIdESet = viewIdESet;
		viewIdESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.VIEW_DESCRIPTION__VIEW_ID, oldViewId, newViewId, !oldViewIdESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setViewId(NodeId newViewId) {
		if (newViewId != viewId) {
			NotificationChain msgs = null;
			if (viewId != null)
				msgs = ((InternalEObject)viewId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.VIEW_DESCRIPTION__VIEW_ID, null, msgs);
			if (newViewId != null)
				msgs = ((InternalEObject)newViewId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.VIEW_DESCRIPTION__VIEW_ID, null, msgs);
			msgs = basicSetViewId(newViewId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldViewIdESet = viewIdESet;
			viewIdESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.VIEW_DESCRIPTION__VIEW_ID, newViewId, newViewId, !oldViewIdESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetViewId(NotificationChain msgs) {
		NodeId oldViewId = viewId;
		viewId = null;
		boolean oldViewIdESet = viewIdESet;
		viewIdESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.VIEW_DESCRIPTION__VIEW_ID, oldViewId, null, oldViewIdESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetViewId() {
		if (viewId != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)viewId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.VIEW_DESCRIPTION__VIEW_ID, null, msgs);
			msgs = basicUnsetViewId(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldViewIdESet = viewIdESet;
			viewIdESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.VIEW_DESCRIPTION__VIEW_ID, null, null, oldViewIdESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetViewId() {
		return viewIdESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getTimestamp() {
		return timestamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimestamp(XMLGregorianCalendar newTimestamp) {
		XMLGregorianCalendar oldTimestamp = timestamp;
		timestamp = newTimestamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.VIEW_DESCRIPTION__TIMESTAMP, oldTimestamp, timestamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getViewVersion() {
		return viewVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setViewVersion(long newViewVersion) {
		long oldViewVersion = viewVersion;
		viewVersion = newViewVersion;
		boolean oldViewVersionESet = viewVersionESet;
		viewVersionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.VIEW_DESCRIPTION__VIEW_VERSION, oldViewVersion, viewVersion, !oldViewVersionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetViewVersion() {
		long oldViewVersion = viewVersion;
		boolean oldViewVersionESet = viewVersionESet;
		viewVersion = VIEW_VERSION_EDEFAULT;
		viewVersionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.VIEW_DESCRIPTION__VIEW_VERSION, oldViewVersion, VIEW_VERSION_EDEFAULT, oldViewVersionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetViewVersion() {
		return viewVersionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.VIEW_DESCRIPTION__VIEW_ID:
				return basicUnsetViewId(msgs);
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
			case TypesPackage.VIEW_DESCRIPTION__VIEW_ID:
				return getViewId();
			case TypesPackage.VIEW_DESCRIPTION__TIMESTAMP:
				return getTimestamp();
			case TypesPackage.VIEW_DESCRIPTION__VIEW_VERSION:
				return getViewVersion();
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
			case TypesPackage.VIEW_DESCRIPTION__VIEW_ID:
				setViewId((NodeId)newValue);
				return;
			case TypesPackage.VIEW_DESCRIPTION__TIMESTAMP:
				setTimestamp((XMLGregorianCalendar)newValue);
				return;
			case TypesPackage.VIEW_DESCRIPTION__VIEW_VERSION:
				setViewVersion((Long)newValue);
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
			case TypesPackage.VIEW_DESCRIPTION__VIEW_ID:
				unsetViewId();
				return;
			case TypesPackage.VIEW_DESCRIPTION__TIMESTAMP:
				setTimestamp(TIMESTAMP_EDEFAULT);
				return;
			case TypesPackage.VIEW_DESCRIPTION__VIEW_VERSION:
				unsetViewVersion();
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
			case TypesPackage.VIEW_DESCRIPTION__VIEW_ID:
				return isSetViewId();
			case TypesPackage.VIEW_DESCRIPTION__TIMESTAMP:
				return TIMESTAMP_EDEFAULT == null ? timestamp != null : !TIMESTAMP_EDEFAULT.equals(timestamp);
			case TypesPackage.VIEW_DESCRIPTION__VIEW_VERSION:
				return isSetViewVersion();
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
		result.append(" (timestamp: ");
		result.append(timestamp);
		result.append(", viewVersion: ");
		if (viewVersionESet) result.append(viewVersion); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ViewDescriptionImpl
