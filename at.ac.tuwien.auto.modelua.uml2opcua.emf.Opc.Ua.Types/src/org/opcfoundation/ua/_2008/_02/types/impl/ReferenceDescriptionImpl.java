/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.opcfoundation.ua._2008._02.types.ExpandedNodeId;
import org.opcfoundation.ua._2008._02.types.LocalizedText;
import org.opcfoundation.ua._2008._02.types.NodeClass;
import org.opcfoundation.ua._2008._02.types.NodeId;
import org.opcfoundation.ua._2008._02.types.QualifiedName;
import org.opcfoundation.ua._2008._02.types.ReferenceDescription;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reference Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ReferenceDescriptionImpl#getReferenceTypeId <em>Reference Type Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ReferenceDescriptionImpl#isIsForward <em>Is Forward</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ReferenceDescriptionImpl#getNodeId <em>Node Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ReferenceDescriptionImpl#getBrowseName <em>Browse Name</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ReferenceDescriptionImpl#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ReferenceDescriptionImpl#getNodeClass <em>Node Class</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ReferenceDescriptionImpl#getTypeDefinition <em>Type Definition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReferenceDescriptionImpl extends MinimalEObjectImpl.Container implements ReferenceDescription {
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
	 * The cached value of the '{@link #getNodeId() <em>Node Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeId()
	 * @generated
	 * @ordered
	 */
	protected ExpandedNodeId nodeId;

	/**
	 * This is true if the Node Id containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nodeIdESet;

	/**
	 * The cached value of the '{@link #getBrowseName() <em>Browse Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBrowseName()
	 * @generated
	 * @ordered
	 */
	protected QualifiedName browseName;

	/**
	 * This is true if the Browse Name containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean browseNameESet;

	/**
	 * The cached value of the '{@link #getDisplayName() <em>Display Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayName()
	 * @generated
	 * @ordered
	 */
	protected LocalizedText displayName;

	/**
	 * This is true if the Display Name containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean displayNameESet;

	/**
	 * The default value of the '{@link #getNodeClass() <em>Node Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeClass()
	 * @generated
	 * @ordered
	 */
	protected static final NodeClass NODE_CLASS_EDEFAULT = NodeClass.UNSPECIFIED0;

	/**
	 * The cached value of the '{@link #getNodeClass() <em>Node Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeClass()
	 * @generated
	 * @ordered
	 */
	protected NodeClass nodeClass = NODE_CLASS_EDEFAULT;

	/**
	 * This is true if the Node Class attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nodeClassESet;

	/**
	 * The cached value of the '{@link #getTypeDefinition() <em>Type Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeDefinition()
	 * @generated
	 * @ordered
	 */
	protected ExpandedNodeId typeDefinition;

	/**
	 * This is true if the Type Definition containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeDefinitionESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReferenceDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getReferenceDescription();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.REFERENCE_DESCRIPTION__REFERENCE_TYPE_ID, oldReferenceTypeId, newReferenceTypeId, !oldReferenceTypeIdESet);
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
				msgs = ((InternalEObject)referenceTypeId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.REFERENCE_DESCRIPTION__REFERENCE_TYPE_ID, null, msgs);
			if (newReferenceTypeId != null)
				msgs = ((InternalEObject)newReferenceTypeId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.REFERENCE_DESCRIPTION__REFERENCE_TYPE_ID, null, msgs);
			msgs = basicSetReferenceTypeId(newReferenceTypeId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldReferenceTypeIdESet = referenceTypeIdESet;
			referenceTypeIdESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.REFERENCE_DESCRIPTION__REFERENCE_TYPE_ID, newReferenceTypeId, newReferenceTypeId, !oldReferenceTypeIdESet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.REFERENCE_DESCRIPTION__REFERENCE_TYPE_ID, oldReferenceTypeId, null, oldReferenceTypeIdESet);
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
			msgs = ((InternalEObject)referenceTypeId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.REFERENCE_DESCRIPTION__REFERENCE_TYPE_ID, null, msgs);
			msgs = basicUnsetReferenceTypeId(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldReferenceTypeIdESet = referenceTypeIdESet;
			referenceTypeIdESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.REFERENCE_DESCRIPTION__REFERENCE_TYPE_ID, null, null, oldReferenceTypeIdESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.REFERENCE_DESCRIPTION__IS_FORWARD, oldIsForward, isForward, !oldIsForwardESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.REFERENCE_DESCRIPTION__IS_FORWARD, oldIsForward, IS_FORWARD_EDEFAULT, oldIsForwardESet));
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
	public ExpandedNodeId getNodeId() {
		return nodeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNodeId(ExpandedNodeId newNodeId, NotificationChain msgs) {
		ExpandedNodeId oldNodeId = nodeId;
		nodeId = newNodeId;
		boolean oldNodeIdESet = nodeIdESet;
		nodeIdESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.REFERENCE_DESCRIPTION__NODE_ID, oldNodeId, newNodeId, !oldNodeIdESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNodeId(ExpandedNodeId newNodeId) {
		if (newNodeId != nodeId) {
			NotificationChain msgs = null;
			if (nodeId != null)
				msgs = ((InternalEObject)nodeId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.REFERENCE_DESCRIPTION__NODE_ID, null, msgs);
			if (newNodeId != null)
				msgs = ((InternalEObject)newNodeId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.REFERENCE_DESCRIPTION__NODE_ID, null, msgs);
			msgs = basicSetNodeId(newNodeId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldNodeIdESet = nodeIdESet;
			nodeIdESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.REFERENCE_DESCRIPTION__NODE_ID, newNodeId, newNodeId, !oldNodeIdESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetNodeId(NotificationChain msgs) {
		ExpandedNodeId oldNodeId = nodeId;
		nodeId = null;
		boolean oldNodeIdESet = nodeIdESet;
		nodeIdESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.REFERENCE_DESCRIPTION__NODE_ID, oldNodeId, null, oldNodeIdESet);
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
			msgs = ((InternalEObject)nodeId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.REFERENCE_DESCRIPTION__NODE_ID, null, msgs);
			msgs = basicUnsetNodeId(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldNodeIdESet = nodeIdESet;
			nodeIdESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.REFERENCE_DESCRIPTION__NODE_ID, null, null, oldNodeIdESet));
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
	public QualifiedName getBrowseName() {
		return browseName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBrowseName(QualifiedName newBrowseName, NotificationChain msgs) {
		QualifiedName oldBrowseName = browseName;
		browseName = newBrowseName;
		boolean oldBrowseNameESet = browseNameESet;
		browseNameESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.REFERENCE_DESCRIPTION__BROWSE_NAME, oldBrowseName, newBrowseName, !oldBrowseNameESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBrowseName(QualifiedName newBrowseName) {
		if (newBrowseName != browseName) {
			NotificationChain msgs = null;
			if (browseName != null)
				msgs = ((InternalEObject)browseName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.REFERENCE_DESCRIPTION__BROWSE_NAME, null, msgs);
			if (newBrowseName != null)
				msgs = ((InternalEObject)newBrowseName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.REFERENCE_DESCRIPTION__BROWSE_NAME, null, msgs);
			msgs = basicSetBrowseName(newBrowseName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldBrowseNameESet = browseNameESet;
			browseNameESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.REFERENCE_DESCRIPTION__BROWSE_NAME, newBrowseName, newBrowseName, !oldBrowseNameESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetBrowseName(NotificationChain msgs) {
		QualifiedName oldBrowseName = browseName;
		browseName = null;
		boolean oldBrowseNameESet = browseNameESet;
		browseNameESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.REFERENCE_DESCRIPTION__BROWSE_NAME, oldBrowseName, null, oldBrowseNameESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBrowseName() {
		if (browseName != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)browseName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.REFERENCE_DESCRIPTION__BROWSE_NAME, null, msgs);
			msgs = basicUnsetBrowseName(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldBrowseNameESet = browseNameESet;
			browseNameESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.REFERENCE_DESCRIPTION__BROWSE_NAME, null, null, oldBrowseNameESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBrowseName() {
		return browseNameESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalizedText getDisplayName() {
		return displayName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDisplayName(LocalizedText newDisplayName, NotificationChain msgs) {
		LocalizedText oldDisplayName = displayName;
		displayName = newDisplayName;
		boolean oldDisplayNameESet = displayNameESet;
		displayNameESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.REFERENCE_DESCRIPTION__DISPLAY_NAME, oldDisplayName, newDisplayName, !oldDisplayNameESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplayName(LocalizedText newDisplayName) {
		if (newDisplayName != displayName) {
			NotificationChain msgs = null;
			if (displayName != null)
				msgs = ((InternalEObject)displayName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.REFERENCE_DESCRIPTION__DISPLAY_NAME, null, msgs);
			if (newDisplayName != null)
				msgs = ((InternalEObject)newDisplayName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.REFERENCE_DESCRIPTION__DISPLAY_NAME, null, msgs);
			msgs = basicSetDisplayName(newDisplayName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldDisplayNameESet = displayNameESet;
			displayNameESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.REFERENCE_DESCRIPTION__DISPLAY_NAME, newDisplayName, newDisplayName, !oldDisplayNameESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetDisplayName(NotificationChain msgs) {
		LocalizedText oldDisplayName = displayName;
		displayName = null;
		boolean oldDisplayNameESet = displayNameESet;
		displayNameESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.REFERENCE_DESCRIPTION__DISPLAY_NAME, oldDisplayName, null, oldDisplayNameESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDisplayName() {
		if (displayName != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)displayName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.REFERENCE_DESCRIPTION__DISPLAY_NAME, null, msgs);
			msgs = basicUnsetDisplayName(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldDisplayNameESet = displayNameESet;
			displayNameESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.REFERENCE_DESCRIPTION__DISPLAY_NAME, null, null, oldDisplayNameESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDisplayName() {
		return displayNameESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeClass getNodeClass() {
		return nodeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNodeClass(NodeClass newNodeClass) {
		NodeClass oldNodeClass = nodeClass;
		nodeClass = newNodeClass == null ? NODE_CLASS_EDEFAULT : newNodeClass;
		boolean oldNodeClassESet = nodeClassESet;
		nodeClassESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.REFERENCE_DESCRIPTION__NODE_CLASS, oldNodeClass, nodeClass, !oldNodeClassESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNodeClass() {
		NodeClass oldNodeClass = nodeClass;
		boolean oldNodeClassESet = nodeClassESet;
		nodeClass = NODE_CLASS_EDEFAULT;
		nodeClassESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.REFERENCE_DESCRIPTION__NODE_CLASS, oldNodeClass, NODE_CLASS_EDEFAULT, oldNodeClassESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNodeClass() {
		return nodeClassESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpandedNodeId getTypeDefinition() {
		return typeDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTypeDefinition(ExpandedNodeId newTypeDefinition, NotificationChain msgs) {
		ExpandedNodeId oldTypeDefinition = typeDefinition;
		typeDefinition = newTypeDefinition;
		boolean oldTypeDefinitionESet = typeDefinitionESet;
		typeDefinitionESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.REFERENCE_DESCRIPTION__TYPE_DEFINITION, oldTypeDefinition, newTypeDefinition, !oldTypeDefinitionESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeDefinition(ExpandedNodeId newTypeDefinition) {
		if (newTypeDefinition != typeDefinition) {
			NotificationChain msgs = null;
			if (typeDefinition != null)
				msgs = ((InternalEObject)typeDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.REFERENCE_DESCRIPTION__TYPE_DEFINITION, null, msgs);
			if (newTypeDefinition != null)
				msgs = ((InternalEObject)newTypeDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.REFERENCE_DESCRIPTION__TYPE_DEFINITION, null, msgs);
			msgs = basicSetTypeDefinition(newTypeDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldTypeDefinitionESet = typeDefinitionESet;
			typeDefinitionESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.REFERENCE_DESCRIPTION__TYPE_DEFINITION, newTypeDefinition, newTypeDefinition, !oldTypeDefinitionESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetTypeDefinition(NotificationChain msgs) {
		ExpandedNodeId oldTypeDefinition = typeDefinition;
		typeDefinition = null;
		boolean oldTypeDefinitionESet = typeDefinitionESet;
		typeDefinitionESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.REFERENCE_DESCRIPTION__TYPE_DEFINITION, oldTypeDefinition, null, oldTypeDefinitionESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTypeDefinition() {
		if (typeDefinition != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)typeDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.REFERENCE_DESCRIPTION__TYPE_DEFINITION, null, msgs);
			msgs = basicUnsetTypeDefinition(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldTypeDefinitionESet = typeDefinitionESet;
			typeDefinitionESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.REFERENCE_DESCRIPTION__TYPE_DEFINITION, null, null, oldTypeDefinitionESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTypeDefinition() {
		return typeDefinitionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.REFERENCE_DESCRIPTION__REFERENCE_TYPE_ID:
				return basicUnsetReferenceTypeId(msgs);
			case TypesPackage.REFERENCE_DESCRIPTION__NODE_ID:
				return basicUnsetNodeId(msgs);
			case TypesPackage.REFERENCE_DESCRIPTION__BROWSE_NAME:
				return basicUnsetBrowseName(msgs);
			case TypesPackage.REFERENCE_DESCRIPTION__DISPLAY_NAME:
				return basicUnsetDisplayName(msgs);
			case TypesPackage.REFERENCE_DESCRIPTION__TYPE_DEFINITION:
				return basicUnsetTypeDefinition(msgs);
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
			case TypesPackage.REFERENCE_DESCRIPTION__REFERENCE_TYPE_ID:
				return getReferenceTypeId();
			case TypesPackage.REFERENCE_DESCRIPTION__IS_FORWARD:
				return isIsForward();
			case TypesPackage.REFERENCE_DESCRIPTION__NODE_ID:
				return getNodeId();
			case TypesPackage.REFERENCE_DESCRIPTION__BROWSE_NAME:
				return getBrowseName();
			case TypesPackage.REFERENCE_DESCRIPTION__DISPLAY_NAME:
				return getDisplayName();
			case TypesPackage.REFERENCE_DESCRIPTION__NODE_CLASS:
				return getNodeClass();
			case TypesPackage.REFERENCE_DESCRIPTION__TYPE_DEFINITION:
				return getTypeDefinition();
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
			case TypesPackage.REFERENCE_DESCRIPTION__REFERENCE_TYPE_ID:
				setReferenceTypeId((NodeId)newValue);
				return;
			case TypesPackage.REFERENCE_DESCRIPTION__IS_FORWARD:
				setIsForward((Boolean)newValue);
				return;
			case TypesPackage.REFERENCE_DESCRIPTION__NODE_ID:
				setNodeId((ExpandedNodeId)newValue);
				return;
			case TypesPackage.REFERENCE_DESCRIPTION__BROWSE_NAME:
				setBrowseName((QualifiedName)newValue);
				return;
			case TypesPackage.REFERENCE_DESCRIPTION__DISPLAY_NAME:
				setDisplayName((LocalizedText)newValue);
				return;
			case TypesPackage.REFERENCE_DESCRIPTION__NODE_CLASS:
				setNodeClass((NodeClass)newValue);
				return;
			case TypesPackage.REFERENCE_DESCRIPTION__TYPE_DEFINITION:
				setTypeDefinition((ExpandedNodeId)newValue);
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
			case TypesPackage.REFERENCE_DESCRIPTION__REFERENCE_TYPE_ID:
				unsetReferenceTypeId();
				return;
			case TypesPackage.REFERENCE_DESCRIPTION__IS_FORWARD:
				unsetIsForward();
				return;
			case TypesPackage.REFERENCE_DESCRIPTION__NODE_ID:
				unsetNodeId();
				return;
			case TypesPackage.REFERENCE_DESCRIPTION__BROWSE_NAME:
				unsetBrowseName();
				return;
			case TypesPackage.REFERENCE_DESCRIPTION__DISPLAY_NAME:
				unsetDisplayName();
				return;
			case TypesPackage.REFERENCE_DESCRIPTION__NODE_CLASS:
				unsetNodeClass();
				return;
			case TypesPackage.REFERENCE_DESCRIPTION__TYPE_DEFINITION:
				unsetTypeDefinition();
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
			case TypesPackage.REFERENCE_DESCRIPTION__REFERENCE_TYPE_ID:
				return isSetReferenceTypeId();
			case TypesPackage.REFERENCE_DESCRIPTION__IS_FORWARD:
				return isSetIsForward();
			case TypesPackage.REFERENCE_DESCRIPTION__NODE_ID:
				return isSetNodeId();
			case TypesPackage.REFERENCE_DESCRIPTION__BROWSE_NAME:
				return isSetBrowseName();
			case TypesPackage.REFERENCE_DESCRIPTION__DISPLAY_NAME:
				return isSetDisplayName();
			case TypesPackage.REFERENCE_DESCRIPTION__NODE_CLASS:
				return isSetNodeClass();
			case TypesPackage.REFERENCE_DESCRIPTION__TYPE_DEFINITION:
				return isSetTypeDefinition();
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
		result.append(", nodeClass: ");
		if (nodeClassESet) result.append(nodeClass); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ReferenceDescriptionImpl
