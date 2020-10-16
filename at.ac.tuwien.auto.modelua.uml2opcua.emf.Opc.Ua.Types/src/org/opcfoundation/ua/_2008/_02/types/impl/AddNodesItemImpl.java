/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.opcfoundation.ua._2008._02.types.AddNodesItem;
import org.opcfoundation.ua._2008._02.types.ExpandedNodeId;
import org.opcfoundation.ua._2008._02.types.ExtensionObject;
import org.opcfoundation.ua._2008._02.types.NodeClass;
import org.opcfoundation.ua._2008._02.types.NodeId;
import org.opcfoundation.ua._2008._02.types.QualifiedName;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Add Nodes Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.AddNodesItemImpl#getParentNodeId <em>Parent Node Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.AddNodesItemImpl#getReferenceTypeId <em>Reference Type Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.AddNodesItemImpl#getRequestedNewNodeId <em>Requested New Node Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.AddNodesItemImpl#getBrowseName <em>Browse Name</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.AddNodesItemImpl#getNodeClass <em>Node Class</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.AddNodesItemImpl#getNodeAttributes <em>Node Attributes</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.AddNodesItemImpl#getTypeDefinition <em>Type Definition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AddNodesItemImpl extends MinimalEObjectImpl.Container implements AddNodesItem {
	/**
	 * The cached value of the '{@link #getParentNodeId() <em>Parent Node Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentNodeId()
	 * @generated
	 * @ordered
	 */
	protected ExpandedNodeId parentNodeId;

	/**
	 * This is true if the Parent Node Id containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean parentNodeIdESet;

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
	 * The cached value of the '{@link #getRequestedNewNodeId() <em>Requested New Node Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestedNewNodeId()
	 * @generated
	 * @ordered
	 */
	protected ExpandedNodeId requestedNewNodeId;

	/**
	 * This is true if the Requested New Node Id containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean requestedNewNodeIdESet;

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
	 * The cached value of the '{@link #getNodeAttributes() <em>Node Attributes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeAttributes()
	 * @generated
	 * @ordered
	 */
	protected ExtensionObject nodeAttributes;

	/**
	 * This is true if the Node Attributes containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nodeAttributesESet;

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
	protected AddNodesItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getAddNodesItem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpandedNodeId getParentNodeId() {
		return parentNodeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentNodeId(ExpandedNodeId newParentNodeId, NotificationChain msgs) {
		ExpandedNodeId oldParentNodeId = parentNodeId;
		parentNodeId = newParentNodeId;
		boolean oldParentNodeIdESet = parentNodeIdESet;
		parentNodeIdESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.ADD_NODES_ITEM__PARENT_NODE_ID, oldParentNodeId, newParentNodeId, !oldParentNodeIdESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentNodeId(ExpandedNodeId newParentNodeId) {
		if (newParentNodeId != parentNodeId) {
			NotificationChain msgs = null;
			if (parentNodeId != null)
				msgs = ((InternalEObject)parentNodeId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.ADD_NODES_ITEM__PARENT_NODE_ID, null, msgs);
			if (newParentNodeId != null)
				msgs = ((InternalEObject)newParentNodeId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.ADD_NODES_ITEM__PARENT_NODE_ID, null, msgs);
			msgs = basicSetParentNodeId(newParentNodeId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldParentNodeIdESet = parentNodeIdESet;
			parentNodeIdESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.ADD_NODES_ITEM__PARENT_NODE_ID, newParentNodeId, newParentNodeId, !oldParentNodeIdESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetParentNodeId(NotificationChain msgs) {
		ExpandedNodeId oldParentNodeId = parentNodeId;
		parentNodeId = null;
		boolean oldParentNodeIdESet = parentNodeIdESet;
		parentNodeIdESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.ADD_NODES_ITEM__PARENT_NODE_ID, oldParentNodeId, null, oldParentNodeIdESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetParentNodeId() {
		if (parentNodeId != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)parentNodeId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.ADD_NODES_ITEM__PARENT_NODE_ID, null, msgs);
			msgs = basicUnsetParentNodeId(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldParentNodeIdESet = parentNodeIdESet;
			parentNodeIdESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.ADD_NODES_ITEM__PARENT_NODE_ID, null, null, oldParentNodeIdESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetParentNodeId() {
		return parentNodeIdESet;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.ADD_NODES_ITEM__REFERENCE_TYPE_ID, oldReferenceTypeId, newReferenceTypeId, !oldReferenceTypeIdESet);
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
				msgs = ((InternalEObject)referenceTypeId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.ADD_NODES_ITEM__REFERENCE_TYPE_ID, null, msgs);
			if (newReferenceTypeId != null)
				msgs = ((InternalEObject)newReferenceTypeId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.ADD_NODES_ITEM__REFERENCE_TYPE_ID, null, msgs);
			msgs = basicSetReferenceTypeId(newReferenceTypeId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldReferenceTypeIdESet = referenceTypeIdESet;
			referenceTypeIdESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.ADD_NODES_ITEM__REFERENCE_TYPE_ID, newReferenceTypeId, newReferenceTypeId, !oldReferenceTypeIdESet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.ADD_NODES_ITEM__REFERENCE_TYPE_ID, oldReferenceTypeId, null, oldReferenceTypeIdESet);
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
			msgs = ((InternalEObject)referenceTypeId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.ADD_NODES_ITEM__REFERENCE_TYPE_ID, null, msgs);
			msgs = basicUnsetReferenceTypeId(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldReferenceTypeIdESet = referenceTypeIdESet;
			referenceTypeIdESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.ADD_NODES_ITEM__REFERENCE_TYPE_ID, null, null, oldReferenceTypeIdESet));
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
	public ExpandedNodeId getRequestedNewNodeId() {
		return requestedNewNodeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequestedNewNodeId(ExpandedNodeId newRequestedNewNodeId, NotificationChain msgs) {
		ExpandedNodeId oldRequestedNewNodeId = requestedNewNodeId;
		requestedNewNodeId = newRequestedNewNodeId;
		boolean oldRequestedNewNodeIdESet = requestedNewNodeIdESet;
		requestedNewNodeIdESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.ADD_NODES_ITEM__REQUESTED_NEW_NODE_ID, oldRequestedNewNodeId, newRequestedNewNodeId, !oldRequestedNewNodeIdESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequestedNewNodeId(ExpandedNodeId newRequestedNewNodeId) {
		if (newRequestedNewNodeId != requestedNewNodeId) {
			NotificationChain msgs = null;
			if (requestedNewNodeId != null)
				msgs = ((InternalEObject)requestedNewNodeId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.ADD_NODES_ITEM__REQUESTED_NEW_NODE_ID, null, msgs);
			if (newRequestedNewNodeId != null)
				msgs = ((InternalEObject)newRequestedNewNodeId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.ADD_NODES_ITEM__REQUESTED_NEW_NODE_ID, null, msgs);
			msgs = basicSetRequestedNewNodeId(newRequestedNewNodeId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldRequestedNewNodeIdESet = requestedNewNodeIdESet;
			requestedNewNodeIdESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.ADD_NODES_ITEM__REQUESTED_NEW_NODE_ID, newRequestedNewNodeId, newRequestedNewNodeId, !oldRequestedNewNodeIdESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetRequestedNewNodeId(NotificationChain msgs) {
		ExpandedNodeId oldRequestedNewNodeId = requestedNewNodeId;
		requestedNewNodeId = null;
		boolean oldRequestedNewNodeIdESet = requestedNewNodeIdESet;
		requestedNewNodeIdESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.ADD_NODES_ITEM__REQUESTED_NEW_NODE_ID, oldRequestedNewNodeId, null, oldRequestedNewNodeIdESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRequestedNewNodeId() {
		if (requestedNewNodeId != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)requestedNewNodeId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.ADD_NODES_ITEM__REQUESTED_NEW_NODE_ID, null, msgs);
			msgs = basicUnsetRequestedNewNodeId(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldRequestedNewNodeIdESet = requestedNewNodeIdESet;
			requestedNewNodeIdESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.ADD_NODES_ITEM__REQUESTED_NEW_NODE_ID, null, null, oldRequestedNewNodeIdESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRequestedNewNodeId() {
		return requestedNewNodeIdESet;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.ADD_NODES_ITEM__BROWSE_NAME, oldBrowseName, newBrowseName, !oldBrowseNameESet);
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
				msgs = ((InternalEObject)browseName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.ADD_NODES_ITEM__BROWSE_NAME, null, msgs);
			if (newBrowseName != null)
				msgs = ((InternalEObject)newBrowseName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.ADD_NODES_ITEM__BROWSE_NAME, null, msgs);
			msgs = basicSetBrowseName(newBrowseName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldBrowseNameESet = browseNameESet;
			browseNameESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.ADD_NODES_ITEM__BROWSE_NAME, newBrowseName, newBrowseName, !oldBrowseNameESet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.ADD_NODES_ITEM__BROWSE_NAME, oldBrowseName, null, oldBrowseNameESet);
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
			msgs = ((InternalEObject)browseName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.ADD_NODES_ITEM__BROWSE_NAME, null, msgs);
			msgs = basicUnsetBrowseName(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldBrowseNameESet = browseNameESet;
			browseNameESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.ADD_NODES_ITEM__BROWSE_NAME, null, null, oldBrowseNameESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.ADD_NODES_ITEM__NODE_CLASS, oldNodeClass, nodeClass, !oldNodeClassESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.ADD_NODES_ITEM__NODE_CLASS, oldNodeClass, NODE_CLASS_EDEFAULT, oldNodeClassESet));
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
	public ExtensionObject getNodeAttributes() {
		return nodeAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNodeAttributes(ExtensionObject newNodeAttributes, NotificationChain msgs) {
		ExtensionObject oldNodeAttributes = nodeAttributes;
		nodeAttributes = newNodeAttributes;
		boolean oldNodeAttributesESet = nodeAttributesESet;
		nodeAttributesESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.ADD_NODES_ITEM__NODE_ATTRIBUTES, oldNodeAttributes, newNodeAttributes, !oldNodeAttributesESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNodeAttributes(ExtensionObject newNodeAttributes) {
		if (newNodeAttributes != nodeAttributes) {
			NotificationChain msgs = null;
			if (nodeAttributes != null)
				msgs = ((InternalEObject)nodeAttributes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.ADD_NODES_ITEM__NODE_ATTRIBUTES, null, msgs);
			if (newNodeAttributes != null)
				msgs = ((InternalEObject)newNodeAttributes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.ADD_NODES_ITEM__NODE_ATTRIBUTES, null, msgs);
			msgs = basicSetNodeAttributes(newNodeAttributes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldNodeAttributesESet = nodeAttributesESet;
			nodeAttributesESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.ADD_NODES_ITEM__NODE_ATTRIBUTES, newNodeAttributes, newNodeAttributes, !oldNodeAttributesESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetNodeAttributes(NotificationChain msgs) {
		ExtensionObject oldNodeAttributes = nodeAttributes;
		nodeAttributes = null;
		boolean oldNodeAttributesESet = nodeAttributesESet;
		nodeAttributesESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.ADD_NODES_ITEM__NODE_ATTRIBUTES, oldNodeAttributes, null, oldNodeAttributesESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNodeAttributes() {
		if (nodeAttributes != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)nodeAttributes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.ADD_NODES_ITEM__NODE_ATTRIBUTES, null, msgs);
			msgs = basicUnsetNodeAttributes(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldNodeAttributesESet = nodeAttributesESet;
			nodeAttributesESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.ADD_NODES_ITEM__NODE_ATTRIBUTES, null, null, oldNodeAttributesESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNodeAttributes() {
		return nodeAttributesESet;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.ADD_NODES_ITEM__TYPE_DEFINITION, oldTypeDefinition, newTypeDefinition, !oldTypeDefinitionESet);
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
				msgs = ((InternalEObject)typeDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.ADD_NODES_ITEM__TYPE_DEFINITION, null, msgs);
			if (newTypeDefinition != null)
				msgs = ((InternalEObject)newTypeDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.ADD_NODES_ITEM__TYPE_DEFINITION, null, msgs);
			msgs = basicSetTypeDefinition(newTypeDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldTypeDefinitionESet = typeDefinitionESet;
			typeDefinitionESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.ADD_NODES_ITEM__TYPE_DEFINITION, newTypeDefinition, newTypeDefinition, !oldTypeDefinitionESet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.ADD_NODES_ITEM__TYPE_DEFINITION, oldTypeDefinition, null, oldTypeDefinitionESet);
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
			msgs = ((InternalEObject)typeDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.ADD_NODES_ITEM__TYPE_DEFINITION, null, msgs);
			msgs = basicUnsetTypeDefinition(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldTypeDefinitionESet = typeDefinitionESet;
			typeDefinitionESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.ADD_NODES_ITEM__TYPE_DEFINITION, null, null, oldTypeDefinitionESet));
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
			case TypesPackage.ADD_NODES_ITEM__PARENT_NODE_ID:
				return basicUnsetParentNodeId(msgs);
			case TypesPackage.ADD_NODES_ITEM__REFERENCE_TYPE_ID:
				return basicUnsetReferenceTypeId(msgs);
			case TypesPackage.ADD_NODES_ITEM__REQUESTED_NEW_NODE_ID:
				return basicUnsetRequestedNewNodeId(msgs);
			case TypesPackage.ADD_NODES_ITEM__BROWSE_NAME:
				return basicUnsetBrowseName(msgs);
			case TypesPackage.ADD_NODES_ITEM__NODE_ATTRIBUTES:
				return basicUnsetNodeAttributes(msgs);
			case TypesPackage.ADD_NODES_ITEM__TYPE_DEFINITION:
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
			case TypesPackage.ADD_NODES_ITEM__PARENT_NODE_ID:
				return getParentNodeId();
			case TypesPackage.ADD_NODES_ITEM__REFERENCE_TYPE_ID:
				return getReferenceTypeId();
			case TypesPackage.ADD_NODES_ITEM__REQUESTED_NEW_NODE_ID:
				return getRequestedNewNodeId();
			case TypesPackage.ADD_NODES_ITEM__BROWSE_NAME:
				return getBrowseName();
			case TypesPackage.ADD_NODES_ITEM__NODE_CLASS:
				return getNodeClass();
			case TypesPackage.ADD_NODES_ITEM__NODE_ATTRIBUTES:
				return getNodeAttributes();
			case TypesPackage.ADD_NODES_ITEM__TYPE_DEFINITION:
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
			case TypesPackage.ADD_NODES_ITEM__PARENT_NODE_ID:
				setParentNodeId((ExpandedNodeId)newValue);
				return;
			case TypesPackage.ADD_NODES_ITEM__REFERENCE_TYPE_ID:
				setReferenceTypeId((NodeId)newValue);
				return;
			case TypesPackage.ADD_NODES_ITEM__REQUESTED_NEW_NODE_ID:
				setRequestedNewNodeId((ExpandedNodeId)newValue);
				return;
			case TypesPackage.ADD_NODES_ITEM__BROWSE_NAME:
				setBrowseName((QualifiedName)newValue);
				return;
			case TypesPackage.ADD_NODES_ITEM__NODE_CLASS:
				setNodeClass((NodeClass)newValue);
				return;
			case TypesPackage.ADD_NODES_ITEM__NODE_ATTRIBUTES:
				setNodeAttributes((ExtensionObject)newValue);
				return;
			case TypesPackage.ADD_NODES_ITEM__TYPE_DEFINITION:
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
			case TypesPackage.ADD_NODES_ITEM__PARENT_NODE_ID:
				unsetParentNodeId();
				return;
			case TypesPackage.ADD_NODES_ITEM__REFERENCE_TYPE_ID:
				unsetReferenceTypeId();
				return;
			case TypesPackage.ADD_NODES_ITEM__REQUESTED_NEW_NODE_ID:
				unsetRequestedNewNodeId();
				return;
			case TypesPackage.ADD_NODES_ITEM__BROWSE_NAME:
				unsetBrowseName();
				return;
			case TypesPackage.ADD_NODES_ITEM__NODE_CLASS:
				unsetNodeClass();
				return;
			case TypesPackage.ADD_NODES_ITEM__NODE_ATTRIBUTES:
				unsetNodeAttributes();
				return;
			case TypesPackage.ADD_NODES_ITEM__TYPE_DEFINITION:
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
			case TypesPackage.ADD_NODES_ITEM__PARENT_NODE_ID:
				return isSetParentNodeId();
			case TypesPackage.ADD_NODES_ITEM__REFERENCE_TYPE_ID:
				return isSetReferenceTypeId();
			case TypesPackage.ADD_NODES_ITEM__REQUESTED_NEW_NODE_ID:
				return isSetRequestedNewNodeId();
			case TypesPackage.ADD_NODES_ITEM__BROWSE_NAME:
				return isSetBrowseName();
			case TypesPackage.ADD_NODES_ITEM__NODE_CLASS:
				return isSetNodeClass();
			case TypesPackage.ADD_NODES_ITEM__NODE_ATTRIBUTES:
				return isSetNodeAttributes();
			case TypesPackage.ADD_NODES_ITEM__TYPE_DEFINITION:
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
		result.append(" (nodeClass: ");
		if (nodeClassESet) result.append(nodeClass); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //AddNodesItemImpl
