/**
 */
package org.opcfoundation.ua._2011._03.ua.node.set.impl;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.opcfoundation.ua._2011._03.ua.node.set.ListOfExtensions;
import org.opcfoundation.ua._2011._03.ua.node.set.ListOfReferences;
import org.opcfoundation.ua._2011._03.ua.node.set.ListOfRolePermissions;
import org.opcfoundation.ua._2011._03.ua.node.set.LocalizedText;
import org.opcfoundation.ua._2011._03.ua.node.set.ReleaseStatus;
import org.opcfoundation.ua._2011._03.ua.node.set.SetPackage;
import org.opcfoundation.ua._2011._03.ua.node.set.UANode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UA Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.UANodeImpl#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.UANodeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.UANodeImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.UANodeImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.UANodeImpl#getReferences <em>References</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.UANodeImpl#getRolePermissions <em>Role Permissions</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.UANodeImpl#getExtensions <em>Extensions</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.UANodeImpl#getAccessRestrictions <em>Access Restrictions</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.UANodeImpl#getBrowseName <em>Browse Name</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.UANodeImpl#getNodeId <em>Node Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.UANodeImpl#getReleaseStatus <em>Release Status</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.UANodeImpl#getSymbolicName <em>Symbolic Name</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.UANodeImpl#getUserWriteMask <em>User Write Mask</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.UANodeImpl#getWriteMask <em>Write Mask</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UANodeImpl extends MinimalEObjectImpl.Container implements UANode {
	/**
	 * The cached value of the '{@link #getDisplayName() <em>Display Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayName()
	 * @generated
	 * @ordered
	 */
	protected EList<LocalizedText> displayName;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected EList<LocalizedText> description;

	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected EList<String> category;

	/**
	 * The default value of the '{@link #getDocumentation() <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected static final String DOCUMENTATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDocumentation() <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected String documentation = DOCUMENTATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReferences() <em>References</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferences()
	 * @generated
	 * @ordered
	 */
	protected ListOfReferences references;

	/**
	 * The cached value of the '{@link #getRolePermissions() <em>Role Permissions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRolePermissions()
	 * @generated
	 * @ordered
	 */
	protected ListOfRolePermissions rolePermissions;

	/**
	 * The cached value of the '{@link #getExtensions() <em>Extensions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtensions()
	 * @generated
	 * @ordered
	 */
	protected ListOfExtensions extensions;

	/**
	 * The default value of the '{@link #getAccessRestrictions() <em>Access Restrictions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessRestrictions()
	 * @generated
	 * @ordered
	 */
	protected static final short ACCESS_RESTRICTIONS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAccessRestrictions() <em>Access Restrictions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessRestrictions()
	 * @generated
	 * @ordered
	 */
	protected short accessRestrictions = ACCESS_RESTRICTIONS_EDEFAULT;

	/**
	 * This is true if the Access Restrictions attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean accessRestrictionsESet;

	/**
	 * The default value of the '{@link #getBrowseName() <em>Browse Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBrowseName()
	 * @generated
	 * @ordered
	 */
	protected static final String BROWSE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBrowseName() <em>Browse Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBrowseName()
	 * @generated
	 * @ordered
	 */
	protected String browseName = BROWSE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getNodeId() <em>Node Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeId()
	 * @generated
	 * @ordered
	 */
	protected static final String NODE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNodeId() <em>Node Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeId()
	 * @generated
	 * @ordered
	 */
	protected String nodeId = NODE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getReleaseStatus() <em>Release Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReleaseStatus()
	 * @generated
	 * @ordered
	 */
	protected static final ReleaseStatus RELEASE_STATUS_EDEFAULT = ReleaseStatus.RELEASED;

	/**
	 * The cached value of the '{@link #getReleaseStatus() <em>Release Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReleaseStatus()
	 * @generated
	 * @ordered
	 */
	protected ReleaseStatus releaseStatus = RELEASE_STATUS_EDEFAULT;

	/**
	 * This is true if the Release Status attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean releaseStatusESet;

	/**
	 * The default value of the '{@link #getSymbolicName() <em>Symbolic Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymbolicName()
	 * @generated
	 * @ordered
	 */
	protected static final List<String> SYMBOLIC_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSymbolicName() <em>Symbolic Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymbolicName()
	 * @generated
	 * @ordered
	 */
	protected List<String> symbolicName = SYMBOLIC_NAME_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UANodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SetPackage.Literals.UA_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LocalizedText> getDisplayName() {
		if (displayName == null) {
			displayName = new EObjectContainmentEList<LocalizedText>(LocalizedText.class, this, SetPackage.UA_NODE__DISPLAY_NAME);
		}
		return displayName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LocalizedText> getDescription() {
		if (description == null) {
			description = new EObjectContainmentEList<LocalizedText>(LocalizedText.class, this, SetPackage.UA_NODE__DESCRIPTION);
		}
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getCategory() {
		if (category == null) {
			category = new EDataTypeEList<String>(String.class, this, SetPackage.UA_NODE__CATEGORY);
		}
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDocumentation() {
		return documentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentation(String newDocumentation) {
		String oldDocumentation = documentation;
		documentation = newDocumentation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SetPackage.UA_NODE__DOCUMENTATION, oldDocumentation, documentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfReferences getReferences() {
		return references;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferences(ListOfReferences newReferences, NotificationChain msgs) {
		ListOfReferences oldReferences = references;
		references = newReferences;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SetPackage.UA_NODE__REFERENCES, oldReferences, newReferences);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferences(ListOfReferences newReferences) {
		if (newReferences != references) {
			NotificationChain msgs = null;
			if (references != null)
				msgs = ((InternalEObject)references).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SetPackage.UA_NODE__REFERENCES, null, msgs);
			if (newReferences != null)
				msgs = ((InternalEObject)newReferences).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SetPackage.UA_NODE__REFERENCES, null, msgs);
			msgs = basicSetReferences(newReferences, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SetPackage.UA_NODE__REFERENCES, newReferences, newReferences));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfRolePermissions getRolePermissions() {
		return rolePermissions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRolePermissions(ListOfRolePermissions newRolePermissions, NotificationChain msgs) {
		ListOfRolePermissions oldRolePermissions = rolePermissions;
		rolePermissions = newRolePermissions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SetPackage.UA_NODE__ROLE_PERMISSIONS, oldRolePermissions, newRolePermissions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRolePermissions(ListOfRolePermissions newRolePermissions) {
		if (newRolePermissions != rolePermissions) {
			NotificationChain msgs = null;
			if (rolePermissions != null)
				msgs = ((InternalEObject)rolePermissions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SetPackage.UA_NODE__ROLE_PERMISSIONS, null, msgs);
			if (newRolePermissions != null)
				msgs = ((InternalEObject)newRolePermissions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SetPackage.UA_NODE__ROLE_PERMISSIONS, null, msgs);
			msgs = basicSetRolePermissions(newRolePermissions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SetPackage.UA_NODE__ROLE_PERMISSIONS, newRolePermissions, newRolePermissions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfExtensions getExtensions() {
		return extensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtensions(ListOfExtensions newExtensions, NotificationChain msgs) {
		ListOfExtensions oldExtensions = extensions;
		extensions = newExtensions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SetPackage.UA_NODE__EXTENSIONS, oldExtensions, newExtensions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtensions(ListOfExtensions newExtensions) {
		if (newExtensions != extensions) {
			NotificationChain msgs = null;
			if (extensions != null)
				msgs = ((InternalEObject)extensions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SetPackage.UA_NODE__EXTENSIONS, null, msgs);
			if (newExtensions != null)
				msgs = ((InternalEObject)newExtensions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SetPackage.UA_NODE__EXTENSIONS, null, msgs);
			msgs = basicSetExtensions(newExtensions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SetPackage.UA_NODE__EXTENSIONS, newExtensions, newExtensions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public short getAccessRestrictions() {
		return accessRestrictions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccessRestrictions(short newAccessRestrictions) {
		short oldAccessRestrictions = accessRestrictions;
		accessRestrictions = newAccessRestrictions;
		boolean oldAccessRestrictionsESet = accessRestrictionsESet;
		accessRestrictionsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SetPackage.UA_NODE__ACCESS_RESTRICTIONS, oldAccessRestrictions, accessRestrictions, !oldAccessRestrictionsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAccessRestrictions() {
		short oldAccessRestrictions = accessRestrictions;
		boolean oldAccessRestrictionsESet = accessRestrictionsESet;
		accessRestrictions = ACCESS_RESTRICTIONS_EDEFAULT;
		accessRestrictionsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SetPackage.UA_NODE__ACCESS_RESTRICTIONS, oldAccessRestrictions, ACCESS_RESTRICTIONS_EDEFAULT, oldAccessRestrictionsESet));
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
	public String getBrowseName() {
		return browseName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBrowseName(String newBrowseName) {
		String oldBrowseName = browseName;
		browseName = newBrowseName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SetPackage.UA_NODE__BROWSE_NAME, oldBrowseName, browseName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNodeId() {
		return nodeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNodeId(String newNodeId) {
		String oldNodeId = nodeId;
		nodeId = newNodeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SetPackage.UA_NODE__NODE_ID, oldNodeId, nodeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReleaseStatus getReleaseStatus() {
		return releaseStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReleaseStatus(ReleaseStatus newReleaseStatus) {
		ReleaseStatus oldReleaseStatus = releaseStatus;
		releaseStatus = newReleaseStatus == null ? RELEASE_STATUS_EDEFAULT : newReleaseStatus;
		boolean oldReleaseStatusESet = releaseStatusESet;
		releaseStatusESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SetPackage.UA_NODE__RELEASE_STATUS, oldReleaseStatus, releaseStatus, !oldReleaseStatusESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetReleaseStatus() {
		ReleaseStatus oldReleaseStatus = releaseStatus;
		boolean oldReleaseStatusESet = releaseStatusESet;
		releaseStatus = RELEASE_STATUS_EDEFAULT;
		releaseStatusESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SetPackage.UA_NODE__RELEASE_STATUS, oldReleaseStatus, RELEASE_STATUS_EDEFAULT, oldReleaseStatusESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetReleaseStatus() {
		return releaseStatusESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> getSymbolicName() {
		return symbolicName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSymbolicName(List<String> newSymbolicName) {
		List<String> oldSymbolicName = symbolicName;
		symbolicName = newSymbolicName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SetPackage.UA_NODE__SYMBOLIC_NAME, oldSymbolicName, symbolicName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SetPackage.UA_NODE__USER_WRITE_MASK, oldUserWriteMask, userWriteMask, !oldUserWriteMaskESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, SetPackage.UA_NODE__USER_WRITE_MASK, oldUserWriteMask, USER_WRITE_MASK_EDEFAULT, oldUserWriteMaskESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SetPackage.UA_NODE__WRITE_MASK, oldWriteMask, writeMask, !oldWriteMaskESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, SetPackage.UA_NODE__WRITE_MASK, oldWriteMask, WRITE_MASK_EDEFAULT, oldWriteMaskESet));
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
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SetPackage.UA_NODE__DISPLAY_NAME:
				return ((InternalEList<?>)getDisplayName()).basicRemove(otherEnd, msgs);
			case SetPackage.UA_NODE__DESCRIPTION:
				return ((InternalEList<?>)getDescription()).basicRemove(otherEnd, msgs);
			case SetPackage.UA_NODE__REFERENCES:
				return basicSetReferences(null, msgs);
			case SetPackage.UA_NODE__ROLE_PERMISSIONS:
				return basicSetRolePermissions(null, msgs);
			case SetPackage.UA_NODE__EXTENSIONS:
				return basicSetExtensions(null, msgs);
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
			case SetPackage.UA_NODE__DISPLAY_NAME:
				return getDisplayName();
			case SetPackage.UA_NODE__DESCRIPTION:
				return getDescription();
			case SetPackage.UA_NODE__CATEGORY:
				return getCategory();
			case SetPackage.UA_NODE__DOCUMENTATION:
				return getDocumentation();
			case SetPackage.UA_NODE__REFERENCES:
				return getReferences();
			case SetPackage.UA_NODE__ROLE_PERMISSIONS:
				return getRolePermissions();
			case SetPackage.UA_NODE__EXTENSIONS:
				return getExtensions();
			case SetPackage.UA_NODE__ACCESS_RESTRICTIONS:
				return getAccessRestrictions();
			case SetPackage.UA_NODE__BROWSE_NAME:
				return getBrowseName();
			case SetPackage.UA_NODE__NODE_ID:
				return getNodeId();
			case SetPackage.UA_NODE__RELEASE_STATUS:
				return getReleaseStatus();
			case SetPackage.UA_NODE__SYMBOLIC_NAME:
				return getSymbolicName();
			case SetPackage.UA_NODE__USER_WRITE_MASK:
				return getUserWriteMask();
			case SetPackage.UA_NODE__WRITE_MASK:
				return getWriteMask();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SetPackage.UA_NODE__DISPLAY_NAME:
				getDisplayName().clear();
				getDisplayName().addAll((Collection<? extends LocalizedText>)newValue);
				return;
			case SetPackage.UA_NODE__DESCRIPTION:
				getDescription().clear();
				getDescription().addAll((Collection<? extends LocalizedText>)newValue);
				return;
			case SetPackage.UA_NODE__CATEGORY:
				getCategory().clear();
				getCategory().addAll((Collection<? extends String>)newValue);
				return;
			case SetPackage.UA_NODE__DOCUMENTATION:
				setDocumentation((String)newValue);
				return;
			case SetPackage.UA_NODE__REFERENCES:
				setReferences((ListOfReferences)newValue);
				return;
			case SetPackage.UA_NODE__ROLE_PERMISSIONS:
				setRolePermissions((ListOfRolePermissions)newValue);
				return;
			case SetPackage.UA_NODE__EXTENSIONS:
				setExtensions((ListOfExtensions)newValue);
				return;
			case SetPackage.UA_NODE__ACCESS_RESTRICTIONS:
				setAccessRestrictions((Short)newValue);
				return;
			case SetPackage.UA_NODE__BROWSE_NAME:
				setBrowseName((String)newValue);
				return;
			case SetPackage.UA_NODE__NODE_ID:
				setNodeId((String)newValue);
				return;
			case SetPackage.UA_NODE__RELEASE_STATUS:
				setReleaseStatus((ReleaseStatus)newValue);
				return;
			case SetPackage.UA_NODE__SYMBOLIC_NAME:
				setSymbolicName((List<String>)newValue);
				return;
			case SetPackage.UA_NODE__USER_WRITE_MASK:
				setUserWriteMask((Long)newValue);
				return;
			case SetPackage.UA_NODE__WRITE_MASK:
				setWriteMask((Long)newValue);
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
			case SetPackage.UA_NODE__DISPLAY_NAME:
				getDisplayName().clear();
				return;
			case SetPackage.UA_NODE__DESCRIPTION:
				getDescription().clear();
				return;
			case SetPackage.UA_NODE__CATEGORY:
				getCategory().clear();
				return;
			case SetPackage.UA_NODE__DOCUMENTATION:
				setDocumentation(DOCUMENTATION_EDEFAULT);
				return;
			case SetPackage.UA_NODE__REFERENCES:
				setReferences((ListOfReferences)null);
				return;
			case SetPackage.UA_NODE__ROLE_PERMISSIONS:
				setRolePermissions((ListOfRolePermissions)null);
				return;
			case SetPackage.UA_NODE__EXTENSIONS:
				setExtensions((ListOfExtensions)null);
				return;
			case SetPackage.UA_NODE__ACCESS_RESTRICTIONS:
				unsetAccessRestrictions();
				return;
			case SetPackage.UA_NODE__BROWSE_NAME:
				setBrowseName(BROWSE_NAME_EDEFAULT);
				return;
			case SetPackage.UA_NODE__NODE_ID:
				setNodeId(NODE_ID_EDEFAULT);
				return;
			case SetPackage.UA_NODE__RELEASE_STATUS:
				unsetReleaseStatus();
				return;
			case SetPackage.UA_NODE__SYMBOLIC_NAME:
				setSymbolicName(SYMBOLIC_NAME_EDEFAULT);
				return;
			case SetPackage.UA_NODE__USER_WRITE_MASK:
				unsetUserWriteMask();
				return;
			case SetPackage.UA_NODE__WRITE_MASK:
				unsetWriteMask();
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
			case SetPackage.UA_NODE__DISPLAY_NAME:
				return displayName != null && !displayName.isEmpty();
			case SetPackage.UA_NODE__DESCRIPTION:
				return description != null && !description.isEmpty();
			case SetPackage.UA_NODE__CATEGORY:
				return category != null && !category.isEmpty();
			case SetPackage.UA_NODE__DOCUMENTATION:
				return DOCUMENTATION_EDEFAULT == null ? documentation != null : !DOCUMENTATION_EDEFAULT.equals(documentation);
			case SetPackage.UA_NODE__REFERENCES:
				return references != null;
			case SetPackage.UA_NODE__ROLE_PERMISSIONS:
				return rolePermissions != null;
			case SetPackage.UA_NODE__EXTENSIONS:
				return extensions != null;
			case SetPackage.UA_NODE__ACCESS_RESTRICTIONS:
				return isSetAccessRestrictions();
			case SetPackage.UA_NODE__BROWSE_NAME:
				return BROWSE_NAME_EDEFAULT == null ? browseName != null : !BROWSE_NAME_EDEFAULT.equals(browseName);
			case SetPackage.UA_NODE__NODE_ID:
				return NODE_ID_EDEFAULT == null ? nodeId != null : !NODE_ID_EDEFAULT.equals(nodeId);
			case SetPackage.UA_NODE__RELEASE_STATUS:
				return isSetReleaseStatus();
			case SetPackage.UA_NODE__SYMBOLIC_NAME:
				return SYMBOLIC_NAME_EDEFAULT == null ? symbolicName != null : !SYMBOLIC_NAME_EDEFAULT.equals(symbolicName);
			case SetPackage.UA_NODE__USER_WRITE_MASK:
				return isSetUserWriteMask();
			case SetPackage.UA_NODE__WRITE_MASK:
				return isSetWriteMask();
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
		result.append(" (category: ");
		result.append(category);
		result.append(", documentation: ");
		result.append(documentation);
		result.append(", accessRestrictions: ");
		if (accessRestrictionsESet) result.append(accessRestrictions); else result.append("<unset>");
		result.append(", browseName: ");
		result.append(browseName);
		result.append(", nodeId: ");
		result.append(nodeId);
		result.append(", releaseStatus: ");
		if (releaseStatusESet) result.append(releaseStatus); else result.append("<unset>");
		result.append(", symbolicName: ");
		result.append(symbolicName);
		result.append(", userWriteMask: ");
		if (userWriteMaskESet) result.append(userWriteMask); else result.append("<unset>");
		result.append(", writeMask: ");
		if (writeMaskESet) result.append(writeMask); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //UANodeImpl
