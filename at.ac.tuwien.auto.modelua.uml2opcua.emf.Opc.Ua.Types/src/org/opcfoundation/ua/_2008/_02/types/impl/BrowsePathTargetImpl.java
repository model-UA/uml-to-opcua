/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.opcfoundation.ua._2008._02.types.BrowsePathTarget;
import org.opcfoundation.ua._2008._02.types.ExpandedNodeId;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Browse Path Target</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.BrowsePathTargetImpl#getTargetId <em>Target Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.BrowsePathTargetImpl#getRemainingPathIndex <em>Remaining Path Index</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BrowsePathTargetImpl extends MinimalEObjectImpl.Container implements BrowsePathTarget {
	/**
	 * The cached value of the '{@link #getTargetId() <em>Target Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetId()
	 * @generated
	 * @ordered
	 */
	protected ExpandedNodeId targetId;

	/**
	 * This is true if the Target Id containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean targetIdESet;

	/**
	 * The default value of the '{@link #getRemainingPathIndex() <em>Remaining Path Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemainingPathIndex()
	 * @generated
	 * @ordered
	 */
	protected static final long REMAINING_PATH_INDEX_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getRemainingPathIndex() <em>Remaining Path Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemainingPathIndex()
	 * @generated
	 * @ordered
	 */
	protected long remainingPathIndex = REMAINING_PATH_INDEX_EDEFAULT;

	/**
	 * This is true if the Remaining Path Index attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean remainingPathIndexESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BrowsePathTargetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getBrowsePathTarget();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpandedNodeId getTargetId() {
		return targetId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetId(ExpandedNodeId newTargetId, NotificationChain msgs) {
		ExpandedNodeId oldTargetId = targetId;
		targetId = newTargetId;
		boolean oldTargetIdESet = targetIdESet;
		targetIdESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.BROWSE_PATH_TARGET__TARGET_ID, oldTargetId, newTargetId, !oldTargetIdESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetId(ExpandedNodeId newTargetId) {
		if (newTargetId != targetId) {
			NotificationChain msgs = null;
			if (targetId != null)
				msgs = ((InternalEObject)targetId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.BROWSE_PATH_TARGET__TARGET_ID, null, msgs);
			if (newTargetId != null)
				msgs = ((InternalEObject)newTargetId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.BROWSE_PATH_TARGET__TARGET_ID, null, msgs);
			msgs = basicSetTargetId(newTargetId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldTargetIdESet = targetIdESet;
			targetIdESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.BROWSE_PATH_TARGET__TARGET_ID, newTargetId, newTargetId, !oldTargetIdESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetTargetId(NotificationChain msgs) {
		ExpandedNodeId oldTargetId = targetId;
		targetId = null;
		boolean oldTargetIdESet = targetIdESet;
		targetIdESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.BROWSE_PATH_TARGET__TARGET_ID, oldTargetId, null, oldTargetIdESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTargetId() {
		if (targetId != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)targetId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.BROWSE_PATH_TARGET__TARGET_ID, null, msgs);
			msgs = basicUnsetTargetId(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldTargetIdESet = targetIdESet;
			targetIdESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.BROWSE_PATH_TARGET__TARGET_ID, null, null, oldTargetIdESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTargetId() {
		return targetIdESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getRemainingPathIndex() {
		return remainingPathIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemainingPathIndex(long newRemainingPathIndex) {
		long oldRemainingPathIndex = remainingPathIndex;
		remainingPathIndex = newRemainingPathIndex;
		boolean oldRemainingPathIndexESet = remainingPathIndexESet;
		remainingPathIndexESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.BROWSE_PATH_TARGET__REMAINING_PATH_INDEX, oldRemainingPathIndex, remainingPathIndex, !oldRemainingPathIndexESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRemainingPathIndex() {
		long oldRemainingPathIndex = remainingPathIndex;
		boolean oldRemainingPathIndexESet = remainingPathIndexESet;
		remainingPathIndex = REMAINING_PATH_INDEX_EDEFAULT;
		remainingPathIndexESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.BROWSE_PATH_TARGET__REMAINING_PATH_INDEX, oldRemainingPathIndex, REMAINING_PATH_INDEX_EDEFAULT, oldRemainingPathIndexESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRemainingPathIndex() {
		return remainingPathIndexESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.BROWSE_PATH_TARGET__TARGET_ID:
				return basicUnsetTargetId(msgs);
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
			case TypesPackage.BROWSE_PATH_TARGET__TARGET_ID:
				return getTargetId();
			case TypesPackage.BROWSE_PATH_TARGET__REMAINING_PATH_INDEX:
				return getRemainingPathIndex();
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
			case TypesPackage.BROWSE_PATH_TARGET__TARGET_ID:
				setTargetId((ExpandedNodeId)newValue);
				return;
			case TypesPackage.BROWSE_PATH_TARGET__REMAINING_PATH_INDEX:
				setRemainingPathIndex((Long)newValue);
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
			case TypesPackage.BROWSE_PATH_TARGET__TARGET_ID:
				unsetTargetId();
				return;
			case TypesPackage.BROWSE_PATH_TARGET__REMAINING_PATH_INDEX:
				unsetRemainingPathIndex();
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
			case TypesPackage.BROWSE_PATH_TARGET__TARGET_ID:
				return isSetTargetId();
			case TypesPackage.BROWSE_PATH_TARGET__REMAINING_PATH_INDEX:
				return isSetRemainingPathIndex();
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
		result.append(" (remainingPathIndex: ");
		if (remainingPathIndexESet) result.append(remainingPathIndex); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //BrowsePathTargetImpl
