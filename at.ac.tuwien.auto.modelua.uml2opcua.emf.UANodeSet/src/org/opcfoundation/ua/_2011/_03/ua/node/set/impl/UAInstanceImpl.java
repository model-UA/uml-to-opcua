/**
 */
package org.opcfoundation.ua._2011._03.ua.node.set.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.opcfoundation.ua._2011._03.ua.node.set.SetPackage;
import org.opcfoundation.ua._2011._03.ua.node.set.UAInstance;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UA Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.UAInstanceImpl#getParentNodeId <em>Parent Node Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UAInstanceImpl extends UANodeImpl implements UAInstance {
	/**
	 * The default value of the '{@link #getParentNodeId() <em>Parent Node Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentNodeId()
	 * @generated
	 * @ordered
	 */
	protected static final String PARENT_NODE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParentNodeId() <em>Parent Node Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentNodeId()
	 * @generated
	 * @ordered
	 */
	protected String parentNodeId = PARENT_NODE_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UAInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SetPackage.Literals.UA_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getParentNodeId() {
		return parentNodeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentNodeId(String newParentNodeId) {
		String oldParentNodeId = parentNodeId;
		parentNodeId = newParentNodeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SetPackage.UA_INSTANCE__PARENT_NODE_ID, oldParentNodeId, parentNodeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SetPackage.UA_INSTANCE__PARENT_NODE_ID:
				return getParentNodeId();
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
			case SetPackage.UA_INSTANCE__PARENT_NODE_ID:
				setParentNodeId((String)newValue);
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
			case SetPackage.UA_INSTANCE__PARENT_NODE_ID:
				setParentNodeId(PARENT_NODE_ID_EDEFAULT);
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
			case SetPackage.UA_INSTANCE__PARENT_NODE_ID:
				return PARENT_NODE_ID_EDEFAULT == null ? parentNodeId != null : !PARENT_NODE_ID_EDEFAULT.equals(parentNodeId);
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
		result.append(" (parentNodeId: ");
		result.append(parentNodeId);
		result.append(')');
		return result.toString();
	}

} //UAInstanceImpl
