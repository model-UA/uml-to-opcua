/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.opcfoundation.ua._2008._02.types.NodeId;
import org.opcfoundation.ua._2008._02.types.RolePermissionType;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role Permission Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.RolePermissionTypeImpl#getRoleId <em>Role Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.RolePermissionTypeImpl#getPermissions <em>Permissions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RolePermissionTypeImpl extends MinimalEObjectImpl.Container implements RolePermissionType {
	/**
	 * The cached value of the '{@link #getRoleId() <em>Role Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleId()
	 * @generated
	 * @ordered
	 */
	protected NodeId roleId;

	/**
	 * This is true if the Role Id containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean roleIdESet;

	/**
	 * The default value of the '{@link #getPermissions() <em>Permissions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPermissions()
	 * @generated
	 * @ordered
	 */
	protected static final long PERMISSIONS_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getPermissions() <em>Permissions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPermissions()
	 * @generated
	 * @ordered
	 */
	protected long permissions = PERMISSIONS_EDEFAULT;

	/**
	 * This is true if the Permissions attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean permissionsESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RolePermissionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getRolePermissionType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeId getRoleId() {
		return roleId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRoleId(NodeId newRoleId, NotificationChain msgs) {
		NodeId oldRoleId = roleId;
		roleId = newRoleId;
		boolean oldRoleIdESet = roleIdESet;
		roleIdESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.ROLE_PERMISSION_TYPE__ROLE_ID, oldRoleId, newRoleId, !oldRoleIdESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoleId(NodeId newRoleId) {
		if (newRoleId != roleId) {
			NotificationChain msgs = null;
			if (roleId != null)
				msgs = ((InternalEObject)roleId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.ROLE_PERMISSION_TYPE__ROLE_ID, null, msgs);
			if (newRoleId != null)
				msgs = ((InternalEObject)newRoleId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.ROLE_PERMISSION_TYPE__ROLE_ID, null, msgs);
			msgs = basicSetRoleId(newRoleId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldRoleIdESet = roleIdESet;
			roleIdESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.ROLE_PERMISSION_TYPE__ROLE_ID, newRoleId, newRoleId, !oldRoleIdESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetRoleId(NotificationChain msgs) {
		NodeId oldRoleId = roleId;
		roleId = null;
		boolean oldRoleIdESet = roleIdESet;
		roleIdESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.ROLE_PERMISSION_TYPE__ROLE_ID, oldRoleId, null, oldRoleIdESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRoleId() {
		if (roleId != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)roleId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.ROLE_PERMISSION_TYPE__ROLE_ID, null, msgs);
			msgs = basicUnsetRoleId(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldRoleIdESet = roleIdESet;
			roleIdESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.ROLE_PERMISSION_TYPE__ROLE_ID, null, null, oldRoleIdESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRoleId() {
		return roleIdESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getPermissions() {
		return permissions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPermissions(long newPermissions) {
		long oldPermissions = permissions;
		permissions = newPermissions;
		boolean oldPermissionsESet = permissionsESet;
		permissionsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.ROLE_PERMISSION_TYPE__PERMISSIONS, oldPermissions, permissions, !oldPermissionsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPermissions() {
		long oldPermissions = permissions;
		boolean oldPermissionsESet = permissionsESet;
		permissions = PERMISSIONS_EDEFAULT;
		permissionsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.ROLE_PERMISSION_TYPE__PERMISSIONS, oldPermissions, PERMISSIONS_EDEFAULT, oldPermissionsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPermissions() {
		return permissionsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.ROLE_PERMISSION_TYPE__ROLE_ID:
				return basicUnsetRoleId(msgs);
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
			case TypesPackage.ROLE_PERMISSION_TYPE__ROLE_ID:
				return getRoleId();
			case TypesPackage.ROLE_PERMISSION_TYPE__PERMISSIONS:
				return getPermissions();
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
			case TypesPackage.ROLE_PERMISSION_TYPE__ROLE_ID:
				setRoleId((NodeId)newValue);
				return;
			case TypesPackage.ROLE_PERMISSION_TYPE__PERMISSIONS:
				setPermissions((Long)newValue);
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
			case TypesPackage.ROLE_PERMISSION_TYPE__ROLE_ID:
				unsetRoleId();
				return;
			case TypesPackage.ROLE_PERMISSION_TYPE__PERMISSIONS:
				unsetPermissions();
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
			case TypesPackage.ROLE_PERMISSION_TYPE__ROLE_ID:
				return isSetRoleId();
			case TypesPackage.ROLE_PERMISSION_TYPE__PERMISSIONS:
				return isSetPermissions();
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
		result.append(" (permissions: ");
		if (permissionsESet) result.append(permissions); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //RolePermissionTypeImpl
