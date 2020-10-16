/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.opcfoundation.ua._2008._02.types.ListOfReferenceNode;
import org.opcfoundation.ua._2008._02.types.ListOfRolePermissionType;
import org.opcfoundation.ua._2008._02.types.LocalizedText;
import org.opcfoundation.ua._2008._02.types.Node;
import org.opcfoundation.ua._2008._02.types.NodeClass;
import org.opcfoundation.ua._2008._02.types.NodeId;
import org.opcfoundation.ua._2008._02.types.QualifiedName;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.NodeImpl#getNodeId <em>Node Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.NodeImpl#getNodeClass <em>Node Class</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.NodeImpl#getBrowseName <em>Browse Name</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.NodeImpl#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.NodeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.NodeImpl#getWriteMask <em>Write Mask</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.NodeImpl#getUserWriteMask <em>User Write Mask</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.NodeImpl#getRolePermissions <em>Role Permissions</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.NodeImpl#getUserRolePermissions <em>User Role Permissions</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.NodeImpl#getAccessRestrictions <em>Access Restrictions</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.NodeImpl#getReferences <em>References</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NodeImpl extends MinimalEObjectImpl.Container implements Node {
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
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected LocalizedText description;

	/**
	 * This is true if the Description containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean descriptionESet;

	/**
	 * The default value of the '{@link #getWriteMask() <em>Write Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWriteMask()
	 * @generated
	 * @ordered
	 */
	protected static final long WRITE_MASK_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getWriteMask() <em>Write Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWriteMask()
	 * @generated
	 * @ordered
	 */
	protected long writeMask = WRITE_MASK_EDEFAULT;

	/**
	 * This is true if the Write Mask attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean writeMaskESet;

	/**
	 * The default value of the '{@link #getUserWriteMask() <em>User Write Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserWriteMask()
	 * @generated
	 * @ordered
	 */
	protected static final long USER_WRITE_MASK_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getUserWriteMask() <em>User Write Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserWriteMask()
	 * @generated
	 * @ordered
	 */
	protected long userWriteMask = USER_WRITE_MASK_EDEFAULT;

	/**
	 * This is true if the User Write Mask attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean userWriteMaskESet;

	/**
	 * The cached value of the '{@link #getRolePermissions() <em>Role Permissions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRolePermissions()
	 * @generated
	 * @ordered
	 */
	protected ListOfRolePermissionType rolePermissions;

	/**
	 * This is true if the Role Permissions containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean rolePermissionsESet;

	/**
	 * The cached value of the '{@link #getUserRolePermissions() <em>User Role Permissions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserRolePermissions()
	 * @generated
	 * @ordered
	 */
	protected ListOfRolePermissionType userRolePermissions;

	/**
	 * This is true if the User Role Permissions containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean userRolePermissionsESet;

	/**
	 * The default value of the '{@link #getAccessRestrictions() <em>Access Restrictions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessRestrictions()
	 * @generated
	 * @ordered
	 */
	protected static final int ACCESS_RESTRICTIONS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAccessRestrictions() <em>Access Restrictions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessRestrictions()
	 * @generated
	 * @ordered
	 */
	protected int accessRestrictions = ACCESS_RESTRICTIONS_EDEFAULT;

	/**
	 * This is true if the Access Restrictions attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean accessRestrictionsESet;

	/**
	 * The cached value of the '{@link #getReferences() <em>References</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferences()
	 * @generated
	 * @ordered
	 */
	protected ListOfReferenceNode references;

	/**
	 * This is true if the References containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean referencesESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getNode();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.NODE__NODE_ID, oldNodeId, newNodeId, !oldNodeIdESet);
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
				msgs = ((InternalEObject)nodeId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.NODE__NODE_ID, null, msgs);
			if (newNodeId != null)
				msgs = ((InternalEObject)newNodeId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.NODE__NODE_ID, null, msgs);
			msgs = basicSetNodeId(newNodeId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldNodeIdESet = nodeIdESet;
			nodeIdESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.NODE__NODE_ID, newNodeId, newNodeId, !oldNodeIdESet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.NODE__NODE_ID, oldNodeId, null, oldNodeIdESet);
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
			msgs = ((InternalEObject)nodeId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.NODE__NODE_ID, null, msgs);
			msgs = basicUnsetNodeId(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldNodeIdESet = nodeIdESet;
			nodeIdESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.NODE__NODE_ID, null, null, oldNodeIdESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.NODE__NODE_CLASS, oldNodeClass, nodeClass, !oldNodeClassESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.NODE__NODE_CLASS, oldNodeClass, NODE_CLASS_EDEFAULT, oldNodeClassESet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.NODE__BROWSE_NAME, oldBrowseName, newBrowseName, !oldBrowseNameESet);
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
				msgs = ((InternalEObject)browseName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.NODE__BROWSE_NAME, null, msgs);
			if (newBrowseName != null)
				msgs = ((InternalEObject)newBrowseName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.NODE__BROWSE_NAME, null, msgs);
			msgs = basicSetBrowseName(newBrowseName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldBrowseNameESet = browseNameESet;
			browseNameESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.NODE__BROWSE_NAME, newBrowseName, newBrowseName, !oldBrowseNameESet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.NODE__BROWSE_NAME, oldBrowseName, null, oldBrowseNameESet);
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
			msgs = ((InternalEObject)browseName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.NODE__BROWSE_NAME, null, msgs);
			msgs = basicUnsetBrowseName(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldBrowseNameESet = browseNameESet;
			browseNameESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.NODE__BROWSE_NAME, null, null, oldBrowseNameESet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.NODE__DISPLAY_NAME, oldDisplayName, newDisplayName, !oldDisplayNameESet);
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
				msgs = ((InternalEObject)displayName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.NODE__DISPLAY_NAME, null, msgs);
			if (newDisplayName != null)
				msgs = ((InternalEObject)newDisplayName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.NODE__DISPLAY_NAME, null, msgs);
			msgs = basicSetDisplayName(newDisplayName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldDisplayNameESet = displayNameESet;
			displayNameESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.NODE__DISPLAY_NAME, newDisplayName, newDisplayName, !oldDisplayNameESet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.NODE__DISPLAY_NAME, oldDisplayName, null, oldDisplayNameESet);
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
			msgs = ((InternalEObject)displayName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.NODE__DISPLAY_NAME, null, msgs);
			msgs = basicUnsetDisplayName(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldDisplayNameESet = displayNameESet;
			displayNameESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.NODE__DISPLAY_NAME, null, null, oldDisplayNameESet));
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
	public LocalizedText getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(LocalizedText newDescription, NotificationChain msgs) {
		LocalizedText oldDescription = description;
		description = newDescription;
		boolean oldDescriptionESet = descriptionESet;
		descriptionESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.NODE__DESCRIPTION, oldDescription, newDescription, !oldDescriptionESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(LocalizedText newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.NODE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.NODE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldDescriptionESet = descriptionESet;
			descriptionESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.NODE__DESCRIPTION, newDescription, newDescription, !oldDescriptionESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetDescription(NotificationChain msgs) {
		LocalizedText oldDescription = description;
		description = null;
		boolean oldDescriptionESet = descriptionESet;
		descriptionESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.NODE__DESCRIPTION, oldDescription, null, oldDescriptionESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDescription() {
		if (description != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.NODE__DESCRIPTION, null, msgs);
			msgs = basicUnsetDescription(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldDescriptionESet = descriptionESet;
			descriptionESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.NODE__DESCRIPTION, null, null, oldDescriptionESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDescription() {
		return descriptionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getWriteMask() {
		return writeMask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWriteMask(long newWriteMask) {
		long oldWriteMask = writeMask;
		writeMask = newWriteMask;
		boolean oldWriteMaskESet = writeMaskESet;
		writeMaskESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.NODE__WRITE_MASK, oldWriteMask, writeMask, !oldWriteMaskESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetWriteMask() {
		long oldWriteMask = writeMask;
		boolean oldWriteMaskESet = writeMaskESet;
		writeMask = WRITE_MASK_EDEFAULT;
		writeMaskESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.NODE__WRITE_MASK, oldWriteMask, WRITE_MASK_EDEFAULT, oldWriteMaskESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetWriteMask() {
		return writeMaskESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getUserWriteMask() {
		return userWriteMask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserWriteMask(long newUserWriteMask) {
		long oldUserWriteMask = userWriteMask;
		userWriteMask = newUserWriteMask;
		boolean oldUserWriteMaskESet = userWriteMaskESet;
		userWriteMaskESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.NODE__USER_WRITE_MASK, oldUserWriteMask, userWriteMask, !oldUserWriteMaskESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUserWriteMask() {
		long oldUserWriteMask = userWriteMask;
		boolean oldUserWriteMaskESet = userWriteMaskESet;
		userWriteMask = USER_WRITE_MASK_EDEFAULT;
		userWriteMaskESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.NODE__USER_WRITE_MASK, oldUserWriteMask, USER_WRITE_MASK_EDEFAULT, oldUserWriteMaskESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUserWriteMask() {
		return userWriteMaskESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfRolePermissionType getRolePermissions() {
		return rolePermissions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRolePermissions(ListOfRolePermissionType newRolePermissions, NotificationChain msgs) {
		ListOfRolePermissionType oldRolePermissions = rolePermissions;
		rolePermissions = newRolePermissions;
		boolean oldRolePermissionsESet = rolePermissionsESet;
		rolePermissionsESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.NODE__ROLE_PERMISSIONS, oldRolePermissions, newRolePermissions, !oldRolePermissionsESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRolePermissions(ListOfRolePermissionType newRolePermissions) {
		if (newRolePermissions != rolePermissions) {
			NotificationChain msgs = null;
			if (rolePermissions != null)
				msgs = ((InternalEObject)rolePermissions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.NODE__ROLE_PERMISSIONS, null, msgs);
			if (newRolePermissions != null)
				msgs = ((InternalEObject)newRolePermissions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.NODE__ROLE_PERMISSIONS, null, msgs);
			msgs = basicSetRolePermissions(newRolePermissions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldRolePermissionsESet = rolePermissionsESet;
			rolePermissionsESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.NODE__ROLE_PERMISSIONS, newRolePermissions, newRolePermissions, !oldRolePermissionsESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetRolePermissions(NotificationChain msgs) {
		ListOfRolePermissionType oldRolePermissions = rolePermissions;
		rolePermissions = null;
		boolean oldRolePermissionsESet = rolePermissionsESet;
		rolePermissionsESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.NODE__ROLE_PERMISSIONS, oldRolePermissions, null, oldRolePermissionsESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRolePermissions() {
		if (rolePermissions != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)rolePermissions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.NODE__ROLE_PERMISSIONS, null, msgs);
			msgs = basicUnsetRolePermissions(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldRolePermissionsESet = rolePermissionsESet;
			rolePermissionsESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.NODE__ROLE_PERMISSIONS, null, null, oldRolePermissionsESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRolePermissions() {
		return rolePermissionsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfRolePermissionType getUserRolePermissions() {
		return userRolePermissions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUserRolePermissions(ListOfRolePermissionType newUserRolePermissions, NotificationChain msgs) {
		ListOfRolePermissionType oldUserRolePermissions = userRolePermissions;
		userRolePermissions = newUserRolePermissions;
		boolean oldUserRolePermissionsESet = userRolePermissionsESet;
		userRolePermissionsESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.NODE__USER_ROLE_PERMISSIONS, oldUserRolePermissions, newUserRolePermissions, !oldUserRolePermissionsESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserRolePermissions(ListOfRolePermissionType newUserRolePermissions) {
		if (newUserRolePermissions != userRolePermissions) {
			NotificationChain msgs = null;
			if (userRolePermissions != null)
				msgs = ((InternalEObject)userRolePermissions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.NODE__USER_ROLE_PERMISSIONS, null, msgs);
			if (newUserRolePermissions != null)
				msgs = ((InternalEObject)newUserRolePermissions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.NODE__USER_ROLE_PERMISSIONS, null, msgs);
			msgs = basicSetUserRolePermissions(newUserRolePermissions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldUserRolePermissionsESet = userRolePermissionsESet;
			userRolePermissionsESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.NODE__USER_ROLE_PERMISSIONS, newUserRolePermissions, newUserRolePermissions, !oldUserRolePermissionsESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetUserRolePermissions(NotificationChain msgs) {
		ListOfRolePermissionType oldUserRolePermissions = userRolePermissions;
		userRolePermissions = null;
		boolean oldUserRolePermissionsESet = userRolePermissionsESet;
		userRolePermissionsESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.NODE__USER_ROLE_PERMISSIONS, oldUserRolePermissions, null, oldUserRolePermissionsESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUserRolePermissions() {
		if (userRolePermissions != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)userRolePermissions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.NODE__USER_ROLE_PERMISSIONS, null, msgs);
			msgs = basicUnsetUserRolePermissions(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldUserRolePermissionsESet = userRolePermissionsESet;
			userRolePermissionsESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.NODE__USER_ROLE_PERMISSIONS, null, null, oldUserRolePermissionsESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUserRolePermissions() {
		return userRolePermissionsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAccessRestrictions() {
		return accessRestrictions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccessRestrictions(int newAccessRestrictions) {
		int oldAccessRestrictions = accessRestrictions;
		accessRestrictions = newAccessRestrictions;
		boolean oldAccessRestrictionsESet = accessRestrictionsESet;
		accessRestrictionsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.NODE__ACCESS_RESTRICTIONS, oldAccessRestrictions, accessRestrictions, !oldAccessRestrictionsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAccessRestrictions() {
		int oldAccessRestrictions = accessRestrictions;
		boolean oldAccessRestrictionsESet = accessRestrictionsESet;
		accessRestrictions = ACCESS_RESTRICTIONS_EDEFAULT;
		accessRestrictionsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.NODE__ACCESS_RESTRICTIONS, oldAccessRestrictions, ACCESS_RESTRICTIONS_EDEFAULT, oldAccessRestrictionsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAccessRestrictions() {
		return accessRestrictionsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfReferenceNode getReferences() {
		return references;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferences(ListOfReferenceNode newReferences, NotificationChain msgs) {
		ListOfReferenceNode oldReferences = references;
		references = newReferences;
		boolean oldReferencesESet = referencesESet;
		referencesESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.NODE__REFERENCES, oldReferences, newReferences, !oldReferencesESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferences(ListOfReferenceNode newReferences) {
		if (newReferences != references) {
			NotificationChain msgs = null;
			if (references != null)
				msgs = ((InternalEObject)references).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.NODE__REFERENCES, null, msgs);
			if (newReferences != null)
				msgs = ((InternalEObject)newReferences).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.NODE__REFERENCES, null, msgs);
			msgs = basicSetReferences(newReferences, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldReferencesESet = referencesESet;
			referencesESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.NODE__REFERENCES, newReferences, newReferences, !oldReferencesESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetReferences(NotificationChain msgs) {
		ListOfReferenceNode oldReferences = references;
		references = null;
		boolean oldReferencesESet = referencesESet;
		referencesESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.NODE__REFERENCES, oldReferences, null, oldReferencesESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetReferences() {
		if (references != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)references).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.NODE__REFERENCES, null, msgs);
			msgs = basicUnsetReferences(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldReferencesESet = referencesESet;
			referencesESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.NODE__REFERENCES, null, null, oldReferencesESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetReferences() {
		return referencesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.NODE__NODE_ID:
				return basicUnsetNodeId(msgs);
			case TypesPackage.NODE__BROWSE_NAME:
				return basicUnsetBrowseName(msgs);
			case TypesPackage.NODE__DISPLAY_NAME:
				return basicUnsetDisplayName(msgs);
			case TypesPackage.NODE__DESCRIPTION:
				return basicUnsetDescription(msgs);
			case TypesPackage.NODE__ROLE_PERMISSIONS:
				return basicUnsetRolePermissions(msgs);
			case TypesPackage.NODE__USER_ROLE_PERMISSIONS:
				return basicUnsetUserRolePermissions(msgs);
			case TypesPackage.NODE__REFERENCES:
				return basicUnsetReferences(msgs);
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
			case TypesPackage.NODE__NODE_ID:
				return getNodeId();
			case TypesPackage.NODE__NODE_CLASS:
				return getNodeClass();
			case TypesPackage.NODE__BROWSE_NAME:
				return getBrowseName();
			case TypesPackage.NODE__DISPLAY_NAME:
				return getDisplayName();
			case TypesPackage.NODE__DESCRIPTION:
				return getDescription();
			case TypesPackage.NODE__WRITE_MASK:
				return getWriteMask();
			case TypesPackage.NODE__USER_WRITE_MASK:
				return getUserWriteMask();
			case TypesPackage.NODE__ROLE_PERMISSIONS:
				return getRolePermissions();
			case TypesPackage.NODE__USER_ROLE_PERMISSIONS:
				return getUserRolePermissions();
			case TypesPackage.NODE__ACCESS_RESTRICTIONS:
				return getAccessRestrictions();
			case TypesPackage.NODE__REFERENCES:
				return getReferences();
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
			case TypesPackage.NODE__NODE_ID:
				setNodeId((NodeId)newValue);
				return;
			case TypesPackage.NODE__NODE_CLASS:
				setNodeClass((NodeClass)newValue);
				return;
			case TypesPackage.NODE__BROWSE_NAME:
				setBrowseName((QualifiedName)newValue);
				return;
			case TypesPackage.NODE__DISPLAY_NAME:
				setDisplayName((LocalizedText)newValue);
				return;
			case TypesPackage.NODE__DESCRIPTION:
				setDescription((LocalizedText)newValue);
				return;
			case TypesPackage.NODE__WRITE_MASK:
				setWriteMask((Long)newValue);
				return;
			case TypesPackage.NODE__USER_WRITE_MASK:
				setUserWriteMask((Long)newValue);
				return;
			case TypesPackage.NODE__ROLE_PERMISSIONS:
				setRolePermissions((ListOfRolePermissionType)newValue);
				return;
			case TypesPackage.NODE__USER_ROLE_PERMISSIONS:
				setUserRolePermissions((ListOfRolePermissionType)newValue);
				return;
			case TypesPackage.NODE__ACCESS_RESTRICTIONS:
				setAccessRestrictions((Integer)newValue);
				return;
			case TypesPackage.NODE__REFERENCES:
				setReferences((ListOfReferenceNode)newValue);
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
			case TypesPackage.NODE__NODE_ID:
				unsetNodeId();
				return;
			case TypesPackage.NODE__NODE_CLASS:
				unsetNodeClass();
				return;
			case TypesPackage.NODE__BROWSE_NAME:
				unsetBrowseName();
				return;
			case TypesPackage.NODE__DISPLAY_NAME:
				unsetDisplayName();
				return;
			case TypesPackage.NODE__DESCRIPTION:
				unsetDescription();
				return;
			case TypesPackage.NODE__WRITE_MASK:
				unsetWriteMask();
				return;
			case TypesPackage.NODE__USER_WRITE_MASK:
				unsetUserWriteMask();
				return;
			case TypesPackage.NODE__ROLE_PERMISSIONS:
				unsetRolePermissions();
				return;
			case TypesPackage.NODE__USER_ROLE_PERMISSIONS:
				unsetUserRolePermissions();
				return;
			case TypesPackage.NODE__ACCESS_RESTRICTIONS:
				unsetAccessRestrictions();
				return;
			case TypesPackage.NODE__REFERENCES:
				unsetReferences();
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
			case TypesPackage.NODE__NODE_ID:
				return isSetNodeId();
			case TypesPackage.NODE__NODE_CLASS:
				return isSetNodeClass();
			case TypesPackage.NODE__BROWSE_NAME:
				return isSetBrowseName();
			case TypesPackage.NODE__DISPLAY_NAME:
				return isSetDisplayName();
			case TypesPackage.NODE__DESCRIPTION:
				return isSetDescription();
			case TypesPackage.NODE__WRITE_MASK:
				return isSetWriteMask();
			case TypesPackage.NODE__USER_WRITE_MASK:
				return isSetUserWriteMask();
			case TypesPackage.NODE__ROLE_PERMISSIONS:
				return isSetRolePermissions();
			case TypesPackage.NODE__USER_ROLE_PERMISSIONS:
				return isSetUserRolePermissions();
			case TypesPackage.NODE__ACCESS_RESTRICTIONS:
				return isSetAccessRestrictions();
			case TypesPackage.NODE__REFERENCES:
				return isSetReferences();
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
		result.append(", writeMask: ");
		if (writeMaskESet) result.append(writeMask); else result.append("<unset>");
		result.append(", userWriteMask: ");
		if (userWriteMaskESet) result.append(userWriteMask); else result.append("<unset>");
		result.append(", accessRestrictions: ");
		if (accessRestrictionsESet) result.append(accessRestrictions); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //NodeImpl
