/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.opcfoundation.ua._2008._02.types.AliasNameDataType;
import org.opcfoundation.ua._2008._02.types.ListOfExpandedNodeId;
import org.opcfoundation.ua._2008._02.types.QualifiedName;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Alias Name Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.AliasNameDataTypeImpl#getAliasName <em>Alias Name</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.AliasNameDataTypeImpl#getReferencedNodes <em>Referenced Nodes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AliasNameDataTypeImpl extends MinimalEObjectImpl.Container implements AliasNameDataType {
	/**
	 * The cached value of the '{@link #getAliasName() <em>Alias Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAliasName()
	 * @generated
	 * @ordered
	 */
	protected QualifiedName aliasName;

	/**
	 * This is true if the Alias Name containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean aliasNameESet;

	/**
	 * The cached value of the '{@link #getReferencedNodes() <em>Referenced Nodes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedNodes()
	 * @generated
	 * @ordered
	 */
	protected ListOfExpandedNodeId referencedNodes;

	/**
	 * This is true if the Referenced Nodes containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean referencedNodesESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AliasNameDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getAliasNameDataType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualifiedName getAliasName() {
		return aliasName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAliasName(QualifiedName newAliasName, NotificationChain msgs) {
		QualifiedName oldAliasName = aliasName;
		aliasName = newAliasName;
		boolean oldAliasNameESet = aliasNameESet;
		aliasNameESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.ALIAS_NAME_DATA_TYPE__ALIAS_NAME, oldAliasName, newAliasName, !oldAliasNameESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAliasName(QualifiedName newAliasName) {
		if (newAliasName != aliasName) {
			NotificationChain msgs = null;
			if (aliasName != null)
				msgs = ((InternalEObject)aliasName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.ALIAS_NAME_DATA_TYPE__ALIAS_NAME, null, msgs);
			if (newAliasName != null)
				msgs = ((InternalEObject)newAliasName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.ALIAS_NAME_DATA_TYPE__ALIAS_NAME, null, msgs);
			msgs = basicSetAliasName(newAliasName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldAliasNameESet = aliasNameESet;
			aliasNameESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.ALIAS_NAME_DATA_TYPE__ALIAS_NAME, newAliasName, newAliasName, !oldAliasNameESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetAliasName(NotificationChain msgs) {
		QualifiedName oldAliasName = aliasName;
		aliasName = null;
		boolean oldAliasNameESet = aliasNameESet;
		aliasNameESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.ALIAS_NAME_DATA_TYPE__ALIAS_NAME, oldAliasName, null, oldAliasNameESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAliasName() {
		if (aliasName != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)aliasName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.ALIAS_NAME_DATA_TYPE__ALIAS_NAME, null, msgs);
			msgs = basicUnsetAliasName(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldAliasNameESet = aliasNameESet;
			aliasNameESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.ALIAS_NAME_DATA_TYPE__ALIAS_NAME, null, null, oldAliasNameESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAliasName() {
		return aliasNameESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfExpandedNodeId getReferencedNodes() {
		return referencedNodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferencedNodes(ListOfExpandedNodeId newReferencedNodes, NotificationChain msgs) {
		ListOfExpandedNodeId oldReferencedNodes = referencedNodes;
		referencedNodes = newReferencedNodes;
		boolean oldReferencedNodesESet = referencedNodesESet;
		referencedNodesESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.ALIAS_NAME_DATA_TYPE__REFERENCED_NODES, oldReferencedNodes, newReferencedNodes, !oldReferencedNodesESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferencedNodes(ListOfExpandedNodeId newReferencedNodes) {
		if (newReferencedNodes != referencedNodes) {
			NotificationChain msgs = null;
			if (referencedNodes != null)
				msgs = ((InternalEObject)referencedNodes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.ALIAS_NAME_DATA_TYPE__REFERENCED_NODES, null, msgs);
			if (newReferencedNodes != null)
				msgs = ((InternalEObject)newReferencedNodes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.ALIAS_NAME_DATA_TYPE__REFERENCED_NODES, null, msgs);
			msgs = basicSetReferencedNodes(newReferencedNodes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldReferencedNodesESet = referencedNodesESet;
			referencedNodesESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.ALIAS_NAME_DATA_TYPE__REFERENCED_NODES, newReferencedNodes, newReferencedNodes, !oldReferencedNodesESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetReferencedNodes(NotificationChain msgs) {
		ListOfExpandedNodeId oldReferencedNodes = referencedNodes;
		referencedNodes = null;
		boolean oldReferencedNodesESet = referencedNodesESet;
		referencedNodesESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.ALIAS_NAME_DATA_TYPE__REFERENCED_NODES, oldReferencedNodes, null, oldReferencedNodesESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetReferencedNodes() {
		if (referencedNodes != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)referencedNodes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.ALIAS_NAME_DATA_TYPE__REFERENCED_NODES, null, msgs);
			msgs = basicUnsetReferencedNodes(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldReferencedNodesESet = referencedNodesESet;
			referencedNodesESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.ALIAS_NAME_DATA_TYPE__REFERENCED_NODES, null, null, oldReferencedNodesESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetReferencedNodes() {
		return referencedNodesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.ALIAS_NAME_DATA_TYPE__ALIAS_NAME:
				return basicUnsetAliasName(msgs);
			case TypesPackage.ALIAS_NAME_DATA_TYPE__REFERENCED_NODES:
				return basicUnsetReferencedNodes(msgs);
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
			case TypesPackage.ALIAS_NAME_DATA_TYPE__ALIAS_NAME:
				return getAliasName();
			case TypesPackage.ALIAS_NAME_DATA_TYPE__REFERENCED_NODES:
				return getReferencedNodes();
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
			case TypesPackage.ALIAS_NAME_DATA_TYPE__ALIAS_NAME:
				setAliasName((QualifiedName)newValue);
				return;
			case TypesPackage.ALIAS_NAME_DATA_TYPE__REFERENCED_NODES:
				setReferencedNodes((ListOfExpandedNodeId)newValue);
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
			case TypesPackage.ALIAS_NAME_DATA_TYPE__ALIAS_NAME:
				unsetAliasName();
				return;
			case TypesPackage.ALIAS_NAME_DATA_TYPE__REFERENCED_NODES:
				unsetReferencedNodes();
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
			case TypesPackage.ALIAS_NAME_DATA_TYPE__ALIAS_NAME:
				return isSetAliasName();
			case TypesPackage.ALIAS_NAME_DATA_TYPE__REFERENCED_NODES:
				return isSetReferencedNodes();
		}
		return super.eIsSet(featureID);
	}

} //AliasNameDataTypeImpl
