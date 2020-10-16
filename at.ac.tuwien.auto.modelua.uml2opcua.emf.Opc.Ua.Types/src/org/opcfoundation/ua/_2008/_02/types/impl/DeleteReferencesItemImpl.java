/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.opcfoundation.ua._2008._02.types.DeleteReferencesItem;
import org.opcfoundation.ua._2008._02.types.ExpandedNodeId;
import org.opcfoundation.ua._2008._02.types.NodeId;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Delete References Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DeleteReferencesItemImpl#getSourceNodeId <em>Source Node Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DeleteReferencesItemImpl#getReferenceTypeId <em>Reference Type Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DeleteReferencesItemImpl#isIsForward <em>Is Forward</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DeleteReferencesItemImpl#getTargetNodeId <em>Target Node Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DeleteReferencesItemImpl#isDeleteBidirectional <em>Delete Bidirectional</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeleteReferencesItemImpl extends MinimalEObjectImpl.Container implements DeleteReferencesItem {
	/**
	 * The cached value of the '{@link #getSourceNodeId() <em>Source Node Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceNodeId()
	 * @generated
	 * @ordered
	 */
	protected NodeId sourceNodeId;

	/**
	 * This is true if the Source Node Id containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sourceNodeIdESet;

	/**
	 * The cached value of the '{@link #getReferenceTypeId() <em>Reference Type Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceTypeId()
	 * @generated
	 * @ordered
	 */
	protected NodeId referenceTypeId;

	/**
	 * This is true if the Reference Type Id containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean referenceTypeIdESet;

	/**
	 * The default value of the '{@link #isIsForward() <em>Is Forward</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsForward()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_FORWARD_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsForward() <em>Is Forward</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsForward()
	 * @generated
	 * @ordered
	 */
	protected boolean isForward = IS_FORWARD_EDEFAULT;

	/**
	 * This is true if the Is Forward attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isForwardESet;

	/**
	 * The cached value of the '{@link #getTargetNodeId() <em>Target Node Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetNodeId()
	 * @generated
	 * @ordered
	 */
	protected ExpandedNodeId targetNodeId;

	/**
	 * This is true if the Target Node Id containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean targetNodeIdESet;

	/**
	 * The default value of the '{@link #isDeleteBidirectional() <em>Delete Bidirectional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDeleteBidirectional()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DELETE_BIDIRECTIONAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDeleteBidirectional() <em>Delete Bidirectional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDeleteBidirectional()
	 * @generated
	 * @ordered
	 */
	protected boolean deleteBidirectional = DELETE_BIDIRECTIONAL_EDEFAULT;

	/**
	 * This is true if the Delete Bidirectional attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean deleteBidirectionalESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeleteReferencesItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getDeleteReferencesItem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeId getSourceNodeId() {
		return sourceNodeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceNodeId(NodeId newSourceNodeId, NotificationChain msgs) {
		NodeId oldSourceNodeId = sourceNodeId;
		sourceNodeId = newSourceNodeId;
		boolean oldSourceNodeIdESet = sourceNodeIdESet;
		sourceNodeIdESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.DELETE_REFERENCES_ITEM__SOURCE_NODE_ID, oldSourceNodeId, newSourceNodeId, !oldSourceNodeIdESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceNodeId(NodeId newSourceNodeId) {
		if (newSourceNodeId != sourceNodeId) {
			NotificationChain msgs = null;
			if (sourceNodeId != null)
				msgs = ((InternalEObject)sourceNodeId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.DELETE_REFERENCES_ITEM__SOURCE_NODE_ID, null, msgs);
			if (newSourceNodeId != null)
				msgs = ((InternalEObject)newSourceNodeId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.DELETE_REFERENCES_ITEM__SOURCE_NODE_ID, null, msgs);
			msgs = basicSetSourceNodeId(newSourceNodeId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldSourceNodeIdESet = sourceNodeIdESet;
			sourceNodeIdESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.DELETE_REFERENCES_ITEM__SOURCE_NODE_ID, newSourceNodeId, newSourceNodeId, !oldSourceNodeIdESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetSourceNodeId(NotificationChain msgs) {
		NodeId oldSourceNodeId = sourceNodeId;
		sourceNodeId = null;
		boolean oldSourceNodeIdESet = sourceNodeIdESet;
		sourceNodeIdESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.DELETE_REFERENCES_ITEM__SOURCE_NODE_ID, oldSourceNodeId, null, oldSourceNodeIdESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSourceNodeId() {
		if (sourceNodeId != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)sourceNodeId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.DELETE_REFERENCES_ITEM__SOURCE_NODE_ID, null, msgs);
			msgs = basicUnsetSourceNodeId(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldSourceNodeIdESet = sourceNodeIdESet;
			sourceNodeIdESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.DELETE_REFERENCES_ITEM__SOURCE_NODE_ID, null, null, oldSourceNodeIdESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSourceNodeId() {
		return sourceNodeIdESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeId getReferenceTypeId() {
		return referenceTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferenceTypeId(NodeId newReferenceTypeId, NotificationChain msgs) {
		NodeId oldReferenceTypeId = referenceTypeId;
		referenceTypeId = newReferenceTypeId;
		boolean oldReferenceTypeIdESet = referenceTypeIdESet;
		referenceTypeIdESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.DELETE_REFERENCES_ITEM__REFERENCE_TYPE_ID, oldReferenceTypeId, newReferenceTypeId, !oldReferenceTypeIdESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferenceTypeId(NodeId newReferenceTypeId) {
		if (newReferenceTypeId != referenceTypeId) {
			NotificationChain msgs = null;
			if (referenceTypeId != null)
				msgs = ((InternalEObject)referenceTypeId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.DELETE_REFERENCES_ITEM__REFERENCE_TYPE_ID, null, msgs);
			if (newReferenceTypeId != null)
				msgs = ((InternalEObject)newReferenceTypeId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.DELETE_REFERENCES_ITEM__REFERENCE_TYPE_ID, null, msgs);
			msgs = basicSetReferenceTypeId(newReferenceTypeId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldReferenceTypeIdESet = referenceTypeIdESet;
			referenceTypeIdESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.DELETE_REFERENCES_ITEM__REFERENCE_TYPE_ID, newReferenceTypeId, newReferenceTypeId, !oldReferenceTypeIdESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetReferenceTypeId(NotificationChain msgs) {
		NodeId oldReferenceTypeId = referenceTypeId;
		referenceTypeId = null;
		boolean oldReferenceTypeIdESet = referenceTypeIdESet;
		referenceTypeIdESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.DELETE_REFERENCES_ITEM__REFERENCE_TYPE_ID, oldReferenceTypeId, null, oldReferenceTypeIdESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetReferenceTypeId() {
		if (referenceTypeId != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)referenceTypeId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.DELETE_REFERENCES_ITEM__REFERENCE_TYPE_ID, null, msgs);
			msgs = basicUnsetReferenceTypeId(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldReferenceTypeIdESet = referenceTypeIdESet;
			referenceTypeIdESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.DELETE_REFERENCES_ITEM__REFERENCE_TYPE_ID, null, null, oldReferenceTypeIdESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetReferenceTypeId() {
		return referenceTypeIdESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsForward() {
		return isForward;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsForward(boolean newIsForward) {
		boolean oldIsForward = isForward;
		isForward = newIsForward;
		boolean oldIsForwardESet = isForwardESet;
		isForwardESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.DELETE_REFERENCES_ITEM__IS_FORWARD, oldIsForward, isForward, !oldIsForwardESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsForward() {
		boolean oldIsForward = isForward;
		boolean oldIsForwardESet = isForwardESet;
		isForward = IS_FORWARD_EDEFAULT;
		isForwardESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.DELETE_REFERENCES_ITEM__IS_FORWARD, oldIsForward, IS_FORWARD_EDEFAULT, oldIsForwardESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsForward() {
		return isForwardESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpandedNodeId getTargetNodeId() {
		return targetNodeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetNodeId(ExpandedNodeId newTargetNodeId, NotificationChain msgs) {
		ExpandedNodeId oldTargetNodeId = targetNodeId;
		targetNodeId = newTargetNodeId;
		boolean oldTargetNodeIdESet = targetNodeIdESet;
		targetNodeIdESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.DELETE_REFERENCES_ITEM__TARGET_NODE_ID, oldTargetNodeId, newTargetNodeId, !oldTargetNodeIdESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetNodeId(ExpandedNodeId newTargetNodeId) {
		if (newTargetNodeId != targetNodeId) {
			NotificationChain msgs = null;
			if (targetNodeId != null)
				msgs = ((InternalEObject)targetNodeId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.DELETE_REFERENCES_ITEM__TARGET_NODE_ID, null, msgs);
			if (newTargetNodeId != null)
				msgs = ((InternalEObject)newTargetNodeId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.DELETE_REFERENCES_ITEM__TARGET_NODE_ID, null, msgs);
			msgs = basicSetTargetNodeId(newTargetNodeId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldTargetNodeIdESet = targetNodeIdESet;
			targetNodeIdESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.DELETE_REFERENCES_ITEM__TARGET_NODE_ID, newTargetNodeId, newTargetNodeId, !oldTargetNodeIdESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetTargetNodeId(NotificationChain msgs) {
		ExpandedNodeId oldTargetNodeId = targetNodeId;
		targetNodeId = null;
		boolean oldTargetNodeIdESet = targetNodeIdESet;
		targetNodeIdESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.DELETE_REFERENCES_ITEM__TARGET_NODE_ID, oldTargetNodeId, null, oldTargetNodeIdESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTargetNodeId() {
		if (targetNodeId != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)targetNodeId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.DELETE_REFERENCES_ITEM__TARGET_NODE_ID, null, msgs);
			msgs = basicUnsetTargetNodeId(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldTargetNodeIdESet = targetNodeIdESet;
			targetNodeIdESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.DELETE_REFERENCES_ITEM__TARGET_NODE_ID, null, null, oldTargetNodeIdESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTargetNodeId() {
		return targetNodeIdESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDeleteBidirectional() {
		return deleteBidirectional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeleteBidirectional(boolean newDeleteBidirectional) {
		boolean oldDeleteBidirectional = deleteBidirectional;
		deleteBidirectional = newDeleteBidirectional;
		boolean oldDeleteBidirectionalESet = deleteBidirectionalESet;
		deleteBidirectionalESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.DELETE_REFERENCES_ITEM__DELETE_BIDIRECTIONAL, oldDeleteBidirectional, deleteBidirectional, !oldDeleteBidirectionalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDeleteBidirectional() {
		boolean oldDeleteBidirectional = deleteBidirectional;
		boolean oldDeleteBidirectionalESet = deleteBidirectionalESet;
		deleteBidirectional = DELETE_BIDIRECTIONAL_EDEFAULT;
		deleteBidirectionalESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.DELETE_REFERENCES_ITEM__DELETE_BIDIRECTIONAL, oldDeleteBidirectional, DELETE_BIDIRECTIONAL_EDEFAULT, oldDeleteBidirectionalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDeleteBidirectional() {
		return deleteBidirectionalESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.DELETE_REFERENCES_ITEM__SOURCE_NODE_ID:
				return basicUnsetSourceNodeId(msgs);
			case TypesPackage.DELETE_REFERENCES_ITEM__REFERENCE_TYPE_ID:
				return basicUnsetReferenceTypeId(msgs);
			case TypesPackage.DELETE_REFERENCES_ITEM__TARGET_NODE_ID:
				return basicUnsetTargetNodeId(msgs);
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
			case TypesPackage.DELETE_REFERENCES_ITEM__SOURCE_NODE_ID:
				return getSourceNodeId();
			case TypesPackage.DELETE_REFERENCES_ITEM__REFERENCE_TYPE_ID:
				return getReferenceTypeId();
			case TypesPackage.DELETE_REFERENCES_ITEM__IS_FORWARD:
				return isIsForward();
			case TypesPackage.DELETE_REFERENCES_ITEM__TARGET_NODE_ID:
				return getTargetNodeId();
			case TypesPackage.DELETE_REFERENCES_ITEM__DELETE_BIDIRECTIONAL:
				return isDeleteBidirectional();
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
			case TypesPackage.DELETE_REFERENCES_ITEM__SOURCE_NODE_ID:
				setSourceNodeId((NodeId)newValue);
				return;
			case TypesPackage.DELETE_REFERENCES_ITEM__REFERENCE_TYPE_ID:
				setReferenceTypeId((NodeId)newValue);
				return;
			case TypesPackage.DELETE_REFERENCES_ITEM__IS_FORWARD:
				setIsForward((Boolean)newValue);
				return;
			case TypesPackage.DELETE_REFERENCES_ITEM__TARGET_NODE_ID:
				setTargetNodeId((ExpandedNodeId)newValue);
				return;
			case TypesPackage.DELETE_REFERENCES_ITEM__DELETE_BIDIRECTIONAL:
				setDeleteBidirectional((Boolean)newValue);
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
			case TypesPackage.DELETE_REFERENCES_ITEM__SOURCE_NODE_ID:
				unsetSourceNodeId();
				return;
			case TypesPackage.DELETE_REFERENCES_ITEM__REFERENCE_TYPE_ID:
				unsetReferenceTypeId();
				return;
			case TypesPackage.DELETE_REFERENCES_ITEM__IS_FORWARD:
				unsetIsForward();
				return;
			case TypesPackage.DELETE_REFERENCES_ITEM__TARGET_NODE_ID:
				unsetTargetNodeId();
				return;
			case TypesPackage.DELETE_REFERENCES_ITEM__DELETE_BIDIRECTIONAL:
				unsetDeleteBidirectional();
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
			case TypesPackage.DELETE_REFERENCES_ITEM__SOURCE_NODE_ID:
				return isSetSourceNodeId();
			case TypesPackage.DELETE_REFERENCES_ITEM__REFERENCE_TYPE_ID:
				return isSetReferenceTypeId();
			case TypesPackage.DELETE_REFERENCES_ITEM__IS_FORWARD:
				return isSetIsForward();
			case TypesPackage.DELETE_REFERENCES_ITEM__TARGET_NODE_ID:
				return isSetTargetNodeId();
			case TypesPackage.DELETE_REFERENCES_ITEM__DELETE_BIDIRECTIONAL:
				return isSetDeleteBidirectional();
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
		result.append(" (isForward: ");
		if (isForwardESet) result.append(isForward); else result.append("<unset>");
		result.append(", deleteBidirectional: ");
		if (deleteBidirectionalESet) result.append(deleteBidirectional); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //DeleteReferencesItemImpl
