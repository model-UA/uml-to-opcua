/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.opcfoundation.ua._2008._02.types.AddReferencesItem;
import org.opcfoundation.ua._2008._02.types.ExpandedNodeId;
import org.opcfoundation.ua._2008._02.types.NodeClass;
import org.opcfoundation.ua._2008._02.types.NodeId;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Add References Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.AddReferencesItemImpl#getSourceNodeId <em>Source Node Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.AddReferencesItemImpl#getReferenceTypeId <em>Reference Type Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.AddReferencesItemImpl#isIsForward <em>Is Forward</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.AddReferencesItemImpl#getTargetServerUri <em>Target Server Uri</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.AddReferencesItemImpl#getTargetNodeId <em>Target Node Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.AddReferencesItemImpl#getTargetNodeClass <em>Target Node Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AddReferencesItemImpl extends MinimalEObjectImpl.Container implements AddReferencesItem {
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
	 * The default value of the '{@link #getTargetServerUri() <em>Target Server Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetServerUri()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_SERVER_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetServerUri() <em>Target Server Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetServerUri()
	 * @generated
	 * @ordered
	 */
	protected String targetServerUri = TARGET_SERVER_URI_EDEFAULT;

	/**
	 * This is true if the Target Server Uri attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean targetServerUriESet;

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
	 * The default value of the '{@link #getTargetNodeClass() <em>Target Node Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetNodeClass()
	 * @generated
	 * @ordered
	 */
	protected static final NodeClass TARGET_NODE_CLASS_EDEFAULT = NodeClass.UNSPECIFIED0;

	/**
	 * The cached value of the '{@link #getTargetNodeClass() <em>Target Node Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetNodeClass()
	 * @generated
	 * @ordered
	 */
	protected NodeClass targetNodeClass = TARGET_NODE_CLASS_EDEFAULT;

	/**
	 * This is true if the Target Node Class attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean targetNodeClassESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AddReferencesItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getAddReferencesItem();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.ADD_REFERENCES_ITEM__SOURCE_NODE_ID, oldSourceNodeId, newSourceNodeId, !oldSourceNodeIdESet);
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
				msgs = ((InternalEObject)sourceNodeId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.ADD_REFERENCES_ITEM__SOURCE_NODE_ID, null, msgs);
			if (newSourceNodeId != null)
				msgs = ((InternalEObject)newSourceNodeId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.ADD_REFERENCES_ITEM__SOURCE_NODE_ID, null, msgs);
			msgs = basicSetSourceNodeId(newSourceNodeId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldSourceNodeIdESet = sourceNodeIdESet;
			sourceNodeIdESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.ADD_REFERENCES_ITEM__SOURCE_NODE_ID, newSourceNodeId, newSourceNodeId, !oldSourceNodeIdESet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.ADD_REFERENCES_ITEM__SOURCE_NODE_ID, oldSourceNodeId, null, oldSourceNodeIdESet);
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
			msgs = ((InternalEObject)sourceNodeId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.ADD_REFERENCES_ITEM__SOURCE_NODE_ID, null, msgs);
			msgs = basicUnsetSourceNodeId(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldSourceNodeIdESet = sourceNodeIdESet;
			sourceNodeIdESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.ADD_REFERENCES_ITEM__SOURCE_NODE_ID, null, null, oldSourceNodeIdESet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.ADD_REFERENCES_ITEM__REFERENCE_TYPE_ID, oldReferenceTypeId, newReferenceTypeId, !oldReferenceTypeIdESet);
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
				msgs = ((InternalEObject)referenceTypeId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.ADD_REFERENCES_ITEM__REFERENCE_TYPE_ID, null, msgs);
			if (newReferenceTypeId != null)
				msgs = ((InternalEObject)newReferenceTypeId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.ADD_REFERENCES_ITEM__REFERENCE_TYPE_ID, null, msgs);
			msgs = basicSetReferenceTypeId(newReferenceTypeId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldReferenceTypeIdESet = referenceTypeIdESet;
			referenceTypeIdESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.ADD_REFERENCES_ITEM__REFERENCE_TYPE_ID, newReferenceTypeId, newReferenceTypeId, !oldReferenceTypeIdESet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.ADD_REFERENCES_ITEM__REFERENCE_TYPE_ID, oldReferenceTypeId, null, oldReferenceTypeIdESet);
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
			msgs = ((InternalEObject)referenceTypeId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.ADD_REFERENCES_ITEM__REFERENCE_TYPE_ID, null, msgs);
			msgs = basicUnsetReferenceTypeId(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldReferenceTypeIdESet = referenceTypeIdESet;
			referenceTypeIdESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.ADD_REFERENCES_ITEM__REFERENCE_TYPE_ID, null, null, oldReferenceTypeIdESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.ADD_REFERENCES_ITEM__IS_FORWARD, oldIsForward, isForward, !oldIsForwardESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.ADD_REFERENCES_ITEM__IS_FORWARD, oldIsForward, IS_FORWARD_EDEFAULT, oldIsForwardESet));
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
	public String getTargetServerUri() {
		return targetServerUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetServerUri(String newTargetServerUri) {
		String oldTargetServerUri = targetServerUri;
		targetServerUri = newTargetServerUri;
		boolean oldTargetServerUriESet = targetServerUriESet;
		targetServerUriESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.ADD_REFERENCES_ITEM__TARGET_SERVER_URI, oldTargetServerUri, targetServerUri, !oldTargetServerUriESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTargetServerUri() {
		String oldTargetServerUri = targetServerUri;
		boolean oldTargetServerUriESet = targetServerUriESet;
		targetServerUri = TARGET_SERVER_URI_EDEFAULT;
		targetServerUriESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.ADD_REFERENCES_ITEM__TARGET_SERVER_URI, oldTargetServerUri, TARGET_SERVER_URI_EDEFAULT, oldTargetServerUriESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTargetServerUri() {
		return targetServerUriESet;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.ADD_REFERENCES_ITEM__TARGET_NODE_ID, oldTargetNodeId, newTargetNodeId, !oldTargetNodeIdESet);
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
				msgs = ((InternalEObject)targetNodeId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.ADD_REFERENCES_ITEM__TARGET_NODE_ID, null, msgs);
			if (newTargetNodeId != null)
				msgs = ((InternalEObject)newTargetNodeId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.ADD_REFERENCES_ITEM__TARGET_NODE_ID, null, msgs);
			msgs = basicSetTargetNodeId(newTargetNodeId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldTargetNodeIdESet = targetNodeIdESet;
			targetNodeIdESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.ADD_REFERENCES_ITEM__TARGET_NODE_ID, newTargetNodeId, newTargetNodeId, !oldTargetNodeIdESet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.ADD_REFERENCES_ITEM__TARGET_NODE_ID, oldTargetNodeId, null, oldTargetNodeIdESet);
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
			msgs = ((InternalEObject)targetNodeId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.ADD_REFERENCES_ITEM__TARGET_NODE_ID, null, msgs);
			msgs = basicUnsetTargetNodeId(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldTargetNodeIdESet = targetNodeIdESet;
			targetNodeIdESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.ADD_REFERENCES_ITEM__TARGET_NODE_ID, null, null, oldTargetNodeIdESet));
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
	public NodeClass getTargetNodeClass() {
		return targetNodeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetNodeClass(NodeClass newTargetNodeClass) {
		NodeClass oldTargetNodeClass = targetNodeClass;
		targetNodeClass = newTargetNodeClass == null ? TARGET_NODE_CLASS_EDEFAULT : newTargetNodeClass;
		boolean oldTargetNodeClassESet = targetNodeClassESet;
		targetNodeClassESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.ADD_REFERENCES_ITEM__TARGET_NODE_CLASS, oldTargetNodeClass, targetNodeClass, !oldTargetNodeClassESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTargetNodeClass() {
		NodeClass oldTargetNodeClass = targetNodeClass;
		boolean oldTargetNodeClassESet = targetNodeClassESet;
		targetNodeClass = TARGET_NODE_CLASS_EDEFAULT;
		targetNodeClassESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.ADD_REFERENCES_ITEM__TARGET_NODE_CLASS, oldTargetNodeClass, TARGET_NODE_CLASS_EDEFAULT, oldTargetNodeClassESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTargetNodeClass() {
		return targetNodeClassESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.ADD_REFERENCES_ITEM__SOURCE_NODE_ID:
				return basicUnsetSourceNodeId(msgs);
			case TypesPackage.ADD_REFERENCES_ITEM__REFERENCE_TYPE_ID:
				return basicUnsetReferenceTypeId(msgs);
			case TypesPackage.ADD_REFERENCES_ITEM__TARGET_NODE_ID:
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
			case TypesPackage.ADD_REFERENCES_ITEM__SOURCE_NODE_ID:
				return getSourceNodeId();
			case TypesPackage.ADD_REFERENCES_ITEM__REFERENCE_TYPE_ID:
				return getReferenceTypeId();
			case TypesPackage.ADD_REFERENCES_ITEM__IS_FORWARD:
				return isIsForward();
			case TypesPackage.ADD_REFERENCES_ITEM__TARGET_SERVER_URI:
				return getTargetServerUri();
			case TypesPackage.ADD_REFERENCES_ITEM__TARGET_NODE_ID:
				return getTargetNodeId();
			case TypesPackage.ADD_REFERENCES_ITEM__TARGET_NODE_CLASS:
				return getTargetNodeClass();
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
			case TypesPackage.ADD_REFERENCES_ITEM__SOURCE_NODE_ID:
				setSourceNodeId((NodeId)newValue);
				return;
			case TypesPackage.ADD_REFERENCES_ITEM__REFERENCE_TYPE_ID:
				setReferenceTypeId((NodeId)newValue);
				return;
			case TypesPackage.ADD_REFERENCES_ITEM__IS_FORWARD:
				setIsForward((Boolean)newValue);
				return;
			case TypesPackage.ADD_REFERENCES_ITEM__TARGET_SERVER_URI:
				setTargetServerUri((String)newValue);
				return;
			case TypesPackage.ADD_REFERENCES_ITEM__TARGET_NODE_ID:
				setTargetNodeId((ExpandedNodeId)newValue);
				return;
			case TypesPackage.ADD_REFERENCES_ITEM__TARGET_NODE_CLASS:
				setTargetNodeClass((NodeClass)newValue);
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
			case TypesPackage.ADD_REFERENCES_ITEM__SOURCE_NODE_ID:
				unsetSourceNodeId();
				return;
			case TypesPackage.ADD_REFERENCES_ITEM__REFERENCE_TYPE_ID:
				unsetReferenceTypeId();
				return;
			case TypesPackage.ADD_REFERENCES_ITEM__IS_FORWARD:
				unsetIsForward();
				return;
			case TypesPackage.ADD_REFERENCES_ITEM__TARGET_SERVER_URI:
				unsetTargetServerUri();
				return;
			case TypesPackage.ADD_REFERENCES_ITEM__TARGET_NODE_ID:
				unsetTargetNodeId();
				return;
			case TypesPackage.ADD_REFERENCES_ITEM__TARGET_NODE_CLASS:
				unsetTargetNodeClass();
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
			case TypesPackage.ADD_REFERENCES_ITEM__SOURCE_NODE_ID:
				return isSetSourceNodeId();
			case TypesPackage.ADD_REFERENCES_ITEM__REFERENCE_TYPE_ID:
				return isSetReferenceTypeId();
			case TypesPackage.ADD_REFERENCES_ITEM__IS_FORWARD:
				return isSetIsForward();
			case TypesPackage.ADD_REFERENCES_ITEM__TARGET_SERVER_URI:
				return isSetTargetServerUri();
			case TypesPackage.ADD_REFERENCES_ITEM__TARGET_NODE_ID:
				return isSetTargetNodeId();
			case TypesPackage.ADD_REFERENCES_ITEM__TARGET_NODE_CLASS:
				return isSetTargetNodeClass();
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
		result.append(", targetServerUri: ");
		if (targetServerUriESet) result.append(targetServerUri); else result.append("<unset>");
		result.append(", targetNodeClass: ");
		if (targetNodeClassESet) result.append(targetNodeClass); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //AddReferencesItemImpl
