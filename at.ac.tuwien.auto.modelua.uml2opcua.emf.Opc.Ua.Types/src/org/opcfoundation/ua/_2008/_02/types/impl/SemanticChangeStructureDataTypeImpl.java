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
import org.opcfoundation.ua._2008._02.types.SemanticChangeStructureDataType;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Semantic Change Structure Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.SemanticChangeStructureDataTypeImpl#getAffected <em>Affected</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.SemanticChangeStructureDataTypeImpl#getAffectedType <em>Affected Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SemanticChangeStructureDataTypeImpl extends MinimalEObjectImpl.Container implements SemanticChangeStructureDataType {
	/**
	 * The cached value of the '{@link #getAffected() <em>Affected</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAffected()
	 * @generated
	 * @ordered
	 */
	protected NodeId affected;

	/**
	 * This is true if the Affected containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean affectedESet;

	/**
	 * The cached value of the '{@link #getAffectedType() <em>Affected Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAffectedType()
	 * @generated
	 * @ordered
	 */
	protected NodeId affectedType;

	/**
	 * This is true if the Affected Type containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean affectedTypeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SemanticChangeStructureDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getSemanticChangeStructureDataType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeId getAffected() {
		return affected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAffected(NodeId newAffected, NotificationChain msgs) {
		NodeId oldAffected = affected;
		affected = newAffected;
		boolean oldAffectedESet = affectedESet;
		affectedESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.SEMANTIC_CHANGE_STRUCTURE_DATA_TYPE__AFFECTED, oldAffected, newAffected, !oldAffectedESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAffected(NodeId newAffected) {
		if (newAffected != affected) {
			NotificationChain msgs = null;
			if (affected != null)
				msgs = ((InternalEObject)affected).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SEMANTIC_CHANGE_STRUCTURE_DATA_TYPE__AFFECTED, null, msgs);
			if (newAffected != null)
				msgs = ((InternalEObject)newAffected).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SEMANTIC_CHANGE_STRUCTURE_DATA_TYPE__AFFECTED, null, msgs);
			msgs = basicSetAffected(newAffected, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldAffectedESet = affectedESet;
			affectedESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SEMANTIC_CHANGE_STRUCTURE_DATA_TYPE__AFFECTED, newAffected, newAffected, !oldAffectedESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetAffected(NotificationChain msgs) {
		NodeId oldAffected = affected;
		affected = null;
		boolean oldAffectedESet = affectedESet;
		affectedESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.SEMANTIC_CHANGE_STRUCTURE_DATA_TYPE__AFFECTED, oldAffected, null, oldAffectedESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAffected() {
		if (affected != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)affected).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SEMANTIC_CHANGE_STRUCTURE_DATA_TYPE__AFFECTED, null, msgs);
			msgs = basicUnsetAffected(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldAffectedESet = affectedESet;
			affectedESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.SEMANTIC_CHANGE_STRUCTURE_DATA_TYPE__AFFECTED, null, null, oldAffectedESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAffected() {
		return affectedESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeId getAffectedType() {
		return affectedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAffectedType(NodeId newAffectedType, NotificationChain msgs) {
		NodeId oldAffectedType = affectedType;
		affectedType = newAffectedType;
		boolean oldAffectedTypeESet = affectedTypeESet;
		affectedTypeESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.SEMANTIC_CHANGE_STRUCTURE_DATA_TYPE__AFFECTED_TYPE, oldAffectedType, newAffectedType, !oldAffectedTypeESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAffectedType(NodeId newAffectedType) {
		if (newAffectedType != affectedType) {
			NotificationChain msgs = null;
			if (affectedType != null)
				msgs = ((InternalEObject)affectedType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SEMANTIC_CHANGE_STRUCTURE_DATA_TYPE__AFFECTED_TYPE, null, msgs);
			if (newAffectedType != null)
				msgs = ((InternalEObject)newAffectedType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SEMANTIC_CHANGE_STRUCTURE_DATA_TYPE__AFFECTED_TYPE, null, msgs);
			msgs = basicSetAffectedType(newAffectedType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldAffectedTypeESet = affectedTypeESet;
			affectedTypeESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SEMANTIC_CHANGE_STRUCTURE_DATA_TYPE__AFFECTED_TYPE, newAffectedType, newAffectedType, !oldAffectedTypeESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetAffectedType(NotificationChain msgs) {
		NodeId oldAffectedType = affectedType;
		affectedType = null;
		boolean oldAffectedTypeESet = affectedTypeESet;
		affectedTypeESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.SEMANTIC_CHANGE_STRUCTURE_DATA_TYPE__AFFECTED_TYPE, oldAffectedType, null, oldAffectedTypeESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAffectedType() {
		if (affectedType != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)affectedType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SEMANTIC_CHANGE_STRUCTURE_DATA_TYPE__AFFECTED_TYPE, null, msgs);
			msgs = basicUnsetAffectedType(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldAffectedTypeESet = affectedTypeESet;
			affectedTypeESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.SEMANTIC_CHANGE_STRUCTURE_DATA_TYPE__AFFECTED_TYPE, null, null, oldAffectedTypeESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAffectedType() {
		return affectedTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.SEMANTIC_CHANGE_STRUCTURE_DATA_TYPE__AFFECTED:
				return basicUnsetAffected(msgs);
			case TypesPackage.SEMANTIC_CHANGE_STRUCTURE_DATA_TYPE__AFFECTED_TYPE:
				return basicUnsetAffectedType(msgs);
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
			case TypesPackage.SEMANTIC_CHANGE_STRUCTURE_DATA_TYPE__AFFECTED:
				return getAffected();
			case TypesPackage.SEMANTIC_CHANGE_STRUCTURE_DATA_TYPE__AFFECTED_TYPE:
				return getAffectedType();
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
			case TypesPackage.SEMANTIC_CHANGE_STRUCTURE_DATA_TYPE__AFFECTED:
				setAffected((NodeId)newValue);
				return;
			case TypesPackage.SEMANTIC_CHANGE_STRUCTURE_DATA_TYPE__AFFECTED_TYPE:
				setAffectedType((NodeId)newValue);
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
			case TypesPackage.SEMANTIC_CHANGE_STRUCTURE_DATA_TYPE__AFFECTED:
				unsetAffected();
				return;
			case TypesPackage.SEMANTIC_CHANGE_STRUCTURE_DATA_TYPE__AFFECTED_TYPE:
				unsetAffectedType();
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
			case TypesPackage.SEMANTIC_CHANGE_STRUCTURE_DATA_TYPE__AFFECTED:
				return isSetAffected();
			case TypesPackage.SEMANTIC_CHANGE_STRUCTURE_DATA_TYPE__AFFECTED_TYPE:
				return isSetAffectedType();
		}
		return super.eIsSet(featureID);
	}

} //SemanticChangeStructureDataTypeImpl
