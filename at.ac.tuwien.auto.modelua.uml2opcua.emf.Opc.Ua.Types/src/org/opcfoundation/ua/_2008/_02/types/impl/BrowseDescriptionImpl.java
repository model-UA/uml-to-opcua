/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.opcfoundation.ua._2008._02.types.BrowseDescription;
import org.opcfoundation.ua._2008._02.types.BrowseDirection;
import org.opcfoundation.ua._2008._02.types.NodeId;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Browse Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.BrowseDescriptionImpl#getNodeId <em>Node Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.BrowseDescriptionImpl#getBrowseDirection <em>Browse Direction</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.BrowseDescriptionImpl#getReferenceTypeId <em>Reference Type Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.BrowseDescriptionImpl#isIncludeSubtypes <em>Include Subtypes</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.BrowseDescriptionImpl#getNodeClassMask <em>Node Class Mask</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.BrowseDescriptionImpl#getResultMask <em>Result Mask</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BrowseDescriptionImpl extends MinimalEObjectImpl.Container implements BrowseDescription {
	/**
	 * The cached value of the '{@link #getNodeId() <em>Node Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeId()
	 * @generated
	 * @ordered
	 */
	protected NodeId nodeId;

	/**
	 * This is true if the Node Id containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nodeIdESet;

	/**
	 * The default value of the '{@link #getBrowseDirection() <em>Browse Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBrowseDirection()
	 * @generated
	 * @ordered
	 */
	protected static final BrowseDirection BROWSE_DIRECTION_EDEFAULT = BrowseDirection.FORWARD0;

	/**
	 * The cached value of the '{@link #getBrowseDirection() <em>Browse Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBrowseDirection()
	 * @generated
	 * @ordered
	 */
	protected BrowseDirection browseDirection = BROWSE_DIRECTION_EDEFAULT;

	/**
	 * This is true if the Browse Direction attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean browseDirectionESet;

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
	 * The default value of the '{@link #isIncludeSubtypes() <em>Include Subtypes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIncludeSubtypes()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INCLUDE_SUBTYPES_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIncludeSubtypes() <em>Include Subtypes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIncludeSubtypes()
	 * @generated
	 * @ordered
	 */
	protected boolean includeSubtypes = INCLUDE_SUBTYPES_EDEFAULT;

	/**
	 * This is true if the Include Subtypes attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean includeSubtypesESet;

	/**
	 * The default value of the '{@link #getNodeClassMask() <em>Node Class Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeClassMask()
	 * @generated
	 * @ordered
	 */
	protected static final long NODE_CLASS_MASK_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNodeClassMask() <em>Node Class Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeClassMask()
	 * @generated
	 * @ordered
	 */
	protected long nodeClassMask = NODE_CLASS_MASK_EDEFAULT;

	/**
	 * This is true if the Node Class Mask attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nodeClassMaskESet;

	/**
	 * The default value of the '{@link #getResultMask() <em>Result Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultMask()
	 * @generated
	 * @ordered
	 */
	protected static final long RESULT_MASK_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getResultMask() <em>Result Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultMask()
	 * @generated
	 * @ordered
	 */
	protected long resultMask = RESULT_MASK_EDEFAULT;

	/**
	 * This is true if the Result Mask attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean resultMaskESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BrowseDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getBrowseDescription();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeId getNodeId() {
		return nodeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNodeId(NodeId newNodeId, NotificationChain msgs) {
		NodeId oldNodeId = nodeId;
		nodeId = newNodeId;
		boolean oldNodeIdESet = nodeIdESet;
		nodeIdESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.BROWSE_DESCRIPTION__NODE_ID, oldNodeId, newNodeId, !oldNodeIdESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNodeId(NodeId newNodeId) {
		if (newNodeId != nodeId) {
			NotificationChain msgs = null;
			if (nodeId != null)
				msgs = ((InternalEObject)nodeId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.BROWSE_DESCRIPTION__NODE_ID, null, msgs);
			if (newNodeId != null)
				msgs = ((InternalEObject)newNodeId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.BROWSE_DESCRIPTION__NODE_ID, null, msgs);
			msgs = basicSetNodeId(newNodeId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldNodeIdESet = nodeIdESet;
			nodeIdESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.BROWSE_DESCRIPTION__NODE_ID, newNodeId, newNodeId, !oldNodeIdESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetNodeId(NotificationChain msgs) {
		NodeId oldNodeId = nodeId;
		nodeId = null;
		boolean oldNodeIdESet = nodeIdESet;
		nodeIdESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.BROWSE_DESCRIPTION__NODE_ID, oldNodeId, null, oldNodeIdESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNodeId() {
		if (nodeId != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)nodeId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.BROWSE_DESCRIPTION__NODE_ID, null, msgs);
			msgs = basicUnsetNodeId(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldNodeIdESet = nodeIdESet;
			nodeIdESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.BROWSE_DESCRIPTION__NODE_ID, null, null, oldNodeIdESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNodeId() {
		return nodeIdESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BrowseDirection getBrowseDirection() {
		return browseDirection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBrowseDirection(BrowseDirection newBrowseDirection) {
		BrowseDirection oldBrowseDirection = browseDirection;
		browseDirection = newBrowseDirection == null ? BROWSE_DIRECTION_EDEFAULT : newBrowseDirection;
		boolean oldBrowseDirectionESet = browseDirectionESet;
		browseDirectionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.BROWSE_DESCRIPTION__BROWSE_DIRECTION, oldBrowseDirection, browseDirection, !oldBrowseDirectionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBrowseDirection() {
		BrowseDirection oldBrowseDirection = browseDirection;
		boolean oldBrowseDirectionESet = browseDirectionESet;
		browseDirection = BROWSE_DIRECTION_EDEFAULT;
		browseDirectionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.BROWSE_DESCRIPTION__BROWSE_DIRECTION, oldBrowseDirection, BROWSE_DIRECTION_EDEFAULT, oldBrowseDirectionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBrowseDirection() {
		return browseDirectionESet;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.BROWSE_DESCRIPTION__REFERENCE_TYPE_ID, oldReferenceTypeId, newReferenceTypeId, !oldReferenceTypeIdESet);
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
				msgs = ((InternalEObject)referenceTypeId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.BROWSE_DESCRIPTION__REFERENCE_TYPE_ID, null, msgs);
			if (newReferenceTypeId != null)
				msgs = ((InternalEObject)newReferenceTypeId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.BROWSE_DESCRIPTION__REFERENCE_TYPE_ID, null, msgs);
			msgs = basicSetReferenceTypeId(newReferenceTypeId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldReferenceTypeIdESet = referenceTypeIdESet;
			referenceTypeIdESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.BROWSE_DESCRIPTION__REFERENCE_TYPE_ID, newReferenceTypeId, newReferenceTypeId, !oldReferenceTypeIdESet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.BROWSE_DESCRIPTION__REFERENCE_TYPE_ID, oldReferenceTypeId, null, oldReferenceTypeIdESet);
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
			msgs = ((InternalEObject)referenceTypeId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.BROWSE_DESCRIPTION__REFERENCE_TYPE_ID, null, msgs);
			msgs = basicUnsetReferenceTypeId(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldReferenceTypeIdESet = referenceTypeIdESet;
			referenceTypeIdESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.BROWSE_DESCRIPTION__REFERENCE_TYPE_ID, null, null, oldReferenceTypeIdESet));
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
	public boolean isIncludeSubtypes() {
		return includeSubtypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncludeSubtypes(boolean newIncludeSubtypes) {
		boolean oldIncludeSubtypes = includeSubtypes;
		includeSubtypes = newIncludeSubtypes;
		boolean oldIncludeSubtypesESet = includeSubtypesESet;
		includeSubtypesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.BROWSE_DESCRIPTION__INCLUDE_SUBTYPES, oldIncludeSubtypes, includeSubtypes, !oldIncludeSubtypesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIncludeSubtypes() {
		boolean oldIncludeSubtypes = includeSubtypes;
		boolean oldIncludeSubtypesESet = includeSubtypesESet;
		includeSubtypes = INCLUDE_SUBTYPES_EDEFAULT;
		includeSubtypesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.BROWSE_DESCRIPTION__INCLUDE_SUBTYPES, oldIncludeSubtypes, INCLUDE_SUBTYPES_EDEFAULT, oldIncludeSubtypesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIncludeSubtypes() {
		return includeSubtypesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNodeClassMask() {
		return nodeClassMask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNodeClassMask(long newNodeClassMask) {
		long oldNodeClassMask = nodeClassMask;
		nodeClassMask = newNodeClassMask;
		boolean oldNodeClassMaskESet = nodeClassMaskESet;
		nodeClassMaskESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.BROWSE_DESCRIPTION__NODE_CLASS_MASK, oldNodeClassMask, nodeClassMask, !oldNodeClassMaskESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNodeClassMask() {
		long oldNodeClassMask = nodeClassMask;
		boolean oldNodeClassMaskESet = nodeClassMaskESet;
		nodeClassMask = NODE_CLASS_MASK_EDEFAULT;
		nodeClassMaskESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.BROWSE_DESCRIPTION__NODE_CLASS_MASK, oldNodeClassMask, NODE_CLASS_MASK_EDEFAULT, oldNodeClassMaskESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNodeClassMask() {
		return nodeClassMaskESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getResultMask() {
		return resultMask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResultMask(long newResultMask) {
		long oldResultMask = resultMask;
		resultMask = newResultMask;
		boolean oldResultMaskESet = resultMaskESet;
		resultMaskESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.BROWSE_DESCRIPTION__RESULT_MASK, oldResultMask, resultMask, !oldResultMaskESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetResultMask() {
		long oldResultMask = resultMask;
		boolean oldResultMaskESet = resultMaskESet;
		resultMask = RESULT_MASK_EDEFAULT;
		resultMaskESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.BROWSE_DESCRIPTION__RESULT_MASK, oldResultMask, RESULT_MASK_EDEFAULT, oldResultMaskESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetResultMask() {
		return resultMaskESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.BROWSE_DESCRIPTION__NODE_ID:
				return basicUnsetNodeId(msgs);
			case TypesPackage.BROWSE_DESCRIPTION__REFERENCE_TYPE_ID:
				return basicUnsetReferenceTypeId(msgs);
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
			case TypesPackage.BROWSE_DESCRIPTION__NODE_ID:
				return getNodeId();
			case TypesPackage.BROWSE_DESCRIPTION__BROWSE_DIRECTION:
				return getBrowseDirection();
			case TypesPackage.BROWSE_DESCRIPTION__REFERENCE_TYPE_ID:
				return getReferenceTypeId();
			case TypesPackage.BROWSE_DESCRIPTION__INCLUDE_SUBTYPES:
				return isIncludeSubtypes();
			case TypesPackage.BROWSE_DESCRIPTION__NODE_CLASS_MASK:
				return getNodeClassMask();
			case TypesPackage.BROWSE_DESCRIPTION__RESULT_MASK:
				return getResultMask();
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
			case TypesPackage.BROWSE_DESCRIPTION__NODE_ID:
				setNodeId((NodeId)newValue);
				return;
			case TypesPackage.BROWSE_DESCRIPTION__BROWSE_DIRECTION:
				setBrowseDirection((BrowseDirection)newValue);
				return;
			case TypesPackage.BROWSE_DESCRIPTION__REFERENCE_TYPE_ID:
				setReferenceTypeId((NodeId)newValue);
				return;
			case TypesPackage.BROWSE_DESCRIPTION__INCLUDE_SUBTYPES:
				setIncludeSubtypes((Boolean)newValue);
				return;
			case TypesPackage.BROWSE_DESCRIPTION__NODE_CLASS_MASK:
				setNodeClassMask((Long)newValue);
				return;
			case TypesPackage.BROWSE_DESCRIPTION__RESULT_MASK:
				setResultMask((Long)newValue);
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
			case TypesPackage.BROWSE_DESCRIPTION__NODE_ID:
				unsetNodeId();
				return;
			case TypesPackage.BROWSE_DESCRIPTION__BROWSE_DIRECTION:
				unsetBrowseDirection();
				return;
			case TypesPackage.BROWSE_DESCRIPTION__REFERENCE_TYPE_ID:
				unsetReferenceTypeId();
				return;
			case TypesPackage.BROWSE_DESCRIPTION__INCLUDE_SUBTYPES:
				unsetIncludeSubtypes();
				return;
			case TypesPackage.BROWSE_DESCRIPTION__NODE_CLASS_MASK:
				unsetNodeClassMask();
				return;
			case TypesPackage.BROWSE_DESCRIPTION__RESULT_MASK:
				unsetResultMask();
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
			case TypesPackage.BROWSE_DESCRIPTION__NODE_ID:
				return isSetNodeId();
			case TypesPackage.BROWSE_DESCRIPTION__BROWSE_DIRECTION:
				return isSetBrowseDirection();
			case TypesPackage.BROWSE_DESCRIPTION__REFERENCE_TYPE_ID:
				return isSetReferenceTypeId();
			case TypesPackage.BROWSE_DESCRIPTION__INCLUDE_SUBTYPES:
				return isSetIncludeSubtypes();
			case TypesPackage.BROWSE_DESCRIPTION__NODE_CLASS_MASK:
				return isSetNodeClassMask();
			case TypesPackage.BROWSE_DESCRIPTION__RESULT_MASK:
				return isSetResultMask();
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
		result.append(" (browseDirection: ");
		if (browseDirectionESet) result.append(browseDirection); else result.append("<unset>");
		result.append(", includeSubtypes: ");
		if (includeSubtypesESet) result.append(includeSubtypes); else result.append("<unset>");
		result.append(", nodeClassMask: ");
		if (nodeClassMaskESet) result.append(nodeClassMask); else result.append("<unset>");
		result.append(", resultMask: ");
		if (resultMaskESet) result.append(resultMask); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //BrowseDescriptionImpl
