/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.opcfoundation.ua._2008._02.types.ListOfRolePermissionType;
import org.opcfoundation.ua._2008._02.types.SubscribedDataSetMirrorDataType;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subscribed Data Set Mirror Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.SubscribedDataSetMirrorDataTypeImpl#getParentNodeName <em>Parent Node Name</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.SubscribedDataSetMirrorDataTypeImpl#getRolePermissions <em>Role Permissions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubscribedDataSetMirrorDataTypeImpl extends SubscribedDataSetDataTypeImpl implements SubscribedDataSetMirrorDataType {
	/**
	 * The default value of the '{@link #getParentNodeName() <em>Parent Node Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentNodeName()
	 * @generated
	 * @ordered
	 */
	protected static final String PARENT_NODE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParentNodeName() <em>Parent Node Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentNodeName()
	 * @generated
	 * @ordered
	 */
	protected String parentNodeName = PARENT_NODE_NAME_EDEFAULT;

	/**
	 * This is true if the Parent Node Name attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean parentNodeNameESet;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubscribedDataSetMirrorDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getSubscribedDataSetMirrorDataType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getParentNodeName() {
		return parentNodeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentNodeName(String newParentNodeName) {
		String oldParentNodeName = parentNodeName;
		parentNodeName = newParentNodeName;
		boolean oldParentNodeNameESet = parentNodeNameESet;
		parentNodeNameESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SUBSCRIBED_DATA_SET_MIRROR_DATA_TYPE__PARENT_NODE_NAME, oldParentNodeName, parentNodeName, !oldParentNodeNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetParentNodeName() {
		String oldParentNodeName = parentNodeName;
		boolean oldParentNodeNameESet = parentNodeNameESet;
		parentNodeName = PARENT_NODE_NAME_EDEFAULT;
		parentNodeNameESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.SUBSCRIBED_DATA_SET_MIRROR_DATA_TYPE__PARENT_NODE_NAME, oldParentNodeName, PARENT_NODE_NAME_EDEFAULT, oldParentNodeNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetParentNodeName() {
		return parentNodeNameESet;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.SUBSCRIBED_DATA_SET_MIRROR_DATA_TYPE__ROLE_PERMISSIONS, oldRolePermissions, newRolePermissions, !oldRolePermissionsESet);
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
				msgs = ((InternalEObject)rolePermissions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SUBSCRIBED_DATA_SET_MIRROR_DATA_TYPE__ROLE_PERMISSIONS, null, msgs);
			if (newRolePermissions != null)
				msgs = ((InternalEObject)newRolePermissions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SUBSCRIBED_DATA_SET_MIRROR_DATA_TYPE__ROLE_PERMISSIONS, null, msgs);
			msgs = basicSetRolePermissions(newRolePermissions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldRolePermissionsESet = rolePermissionsESet;
			rolePermissionsESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SUBSCRIBED_DATA_SET_MIRROR_DATA_TYPE__ROLE_PERMISSIONS, newRolePermissions, newRolePermissions, !oldRolePermissionsESet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.SUBSCRIBED_DATA_SET_MIRROR_DATA_TYPE__ROLE_PERMISSIONS, oldRolePermissions, null, oldRolePermissionsESet);
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
			msgs = ((InternalEObject)rolePermissions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SUBSCRIBED_DATA_SET_MIRROR_DATA_TYPE__ROLE_PERMISSIONS, null, msgs);
			msgs = basicUnsetRolePermissions(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldRolePermissionsESet = rolePermissionsESet;
			rolePermissionsESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.SUBSCRIBED_DATA_SET_MIRROR_DATA_TYPE__ROLE_PERMISSIONS, null, null, oldRolePermissionsESet));
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
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.SUBSCRIBED_DATA_SET_MIRROR_DATA_TYPE__ROLE_PERMISSIONS:
				return basicUnsetRolePermissions(msgs);
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
			case TypesPackage.SUBSCRIBED_DATA_SET_MIRROR_DATA_TYPE__PARENT_NODE_NAME:
				return getParentNodeName();
			case TypesPackage.SUBSCRIBED_DATA_SET_MIRROR_DATA_TYPE__ROLE_PERMISSIONS:
				return getRolePermissions();
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
			case TypesPackage.SUBSCRIBED_DATA_SET_MIRROR_DATA_TYPE__PARENT_NODE_NAME:
				setParentNodeName((String)newValue);
				return;
			case TypesPackage.SUBSCRIBED_DATA_SET_MIRROR_DATA_TYPE__ROLE_PERMISSIONS:
				setRolePermissions((ListOfRolePermissionType)newValue);
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
			case TypesPackage.SUBSCRIBED_DATA_SET_MIRROR_DATA_TYPE__PARENT_NODE_NAME:
				unsetParentNodeName();
				return;
			case TypesPackage.SUBSCRIBED_DATA_SET_MIRROR_DATA_TYPE__ROLE_PERMISSIONS:
				unsetRolePermissions();
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
			case TypesPackage.SUBSCRIBED_DATA_SET_MIRROR_DATA_TYPE__PARENT_NODE_NAME:
				return isSetParentNodeName();
			case TypesPackage.SUBSCRIBED_DATA_SET_MIRROR_DATA_TYPE__ROLE_PERMISSIONS:
				return isSetRolePermissions();
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
		result.append(" (parentNodeName: ");
		if (parentNodeNameESet) result.append(parentNodeName); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //SubscribedDataSetMirrorDataTypeImpl
