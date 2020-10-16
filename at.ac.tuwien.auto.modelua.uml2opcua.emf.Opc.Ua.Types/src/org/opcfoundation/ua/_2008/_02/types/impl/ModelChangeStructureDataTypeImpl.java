/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.opcfoundation.ua._2008._02.types.ModelChangeStructureDataType;
import org.opcfoundation.ua._2008._02.types.NodeId;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Change Structure Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ModelChangeStructureDataTypeImpl#getAffected <em>Affected</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ModelChangeStructureDataTypeImpl#getAffectedType <em>Affected Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ModelChangeStructureDataTypeImpl#getVerb <em>Verb</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelChangeStructureDataTypeImpl extends MinimalEObjectImpl.Container implements ModelChangeStructureDataType {
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
	 * The default value of the '{@link #getVerb() <em>Verb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerb()
	 * @generated
	 * @ordered
	 */
	protected static final short VERB_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getVerb() <em>Verb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerb()
	 * @generated
	 * @ordered
	 */
	protected short verb = VERB_EDEFAULT;

	/**
	 * This is true if the Verb attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean verbESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelChangeStructureDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getModelChangeStructureDataType();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.MODEL_CHANGE_STRUCTURE_DATA_TYPE__AFFECTED, oldAffected, newAffected, !oldAffectedESet);
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
				msgs = ((InternalEObject)affected).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.MODEL_CHANGE_STRUCTURE_DATA_TYPE__AFFECTED, null, msgs);
			if (newAffected != null)
				msgs = ((InternalEObject)newAffected).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.MODEL_CHANGE_STRUCTURE_DATA_TYPE__AFFECTED, null, msgs);
			msgs = basicSetAffected(newAffected, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldAffectedESet = affectedESet;
			affectedESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.MODEL_CHANGE_STRUCTURE_DATA_TYPE__AFFECTED, newAffected, newAffected, !oldAffectedESet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.MODEL_CHANGE_STRUCTURE_DATA_TYPE__AFFECTED, oldAffected, null, oldAffectedESet);
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
			msgs = ((InternalEObject)affected).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.MODEL_CHANGE_STRUCTURE_DATA_TYPE__AFFECTED, null, msgs);
			msgs = basicUnsetAffected(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldAffectedESet = affectedESet;
			affectedESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.MODEL_CHANGE_STRUCTURE_DATA_TYPE__AFFECTED, null, null, oldAffectedESet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.MODEL_CHANGE_STRUCTURE_DATA_TYPE__AFFECTED_TYPE, oldAffectedType, newAffectedType, !oldAffectedTypeESet);
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
				msgs = ((InternalEObject)affectedType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.MODEL_CHANGE_STRUCTURE_DATA_TYPE__AFFECTED_TYPE, null, msgs);
			if (newAffectedType != null)
				msgs = ((InternalEObject)newAffectedType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.MODEL_CHANGE_STRUCTURE_DATA_TYPE__AFFECTED_TYPE, null, msgs);
			msgs = basicSetAffectedType(newAffectedType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldAffectedTypeESet = affectedTypeESet;
			affectedTypeESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.MODEL_CHANGE_STRUCTURE_DATA_TYPE__AFFECTED_TYPE, newAffectedType, newAffectedType, !oldAffectedTypeESet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.MODEL_CHANGE_STRUCTURE_DATA_TYPE__AFFECTED_TYPE, oldAffectedType, null, oldAffectedTypeESet);
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
			msgs = ((InternalEObject)affectedType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.MODEL_CHANGE_STRUCTURE_DATA_TYPE__AFFECTED_TYPE, null, msgs);
			msgs = basicUnsetAffectedType(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldAffectedTypeESet = affectedTypeESet;
			affectedTypeESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.MODEL_CHANGE_STRUCTURE_DATA_TYPE__AFFECTED_TYPE, null, null, oldAffectedTypeESet));
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
	public short getVerb() {
		return verb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVerb(short newVerb) {
		short oldVerb = verb;
		verb = newVerb;
		boolean oldVerbESet = verbESet;
		verbESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.MODEL_CHANGE_STRUCTURE_DATA_TYPE__VERB, oldVerb, verb, !oldVerbESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVerb() {
		short oldVerb = verb;
		boolean oldVerbESet = verbESet;
		verb = VERB_EDEFAULT;
		verbESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.MODEL_CHANGE_STRUCTURE_DATA_TYPE__VERB, oldVerb, VERB_EDEFAULT, oldVerbESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVerb() {
		return verbESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.MODEL_CHANGE_STRUCTURE_DATA_TYPE__AFFECTED:
				return basicUnsetAffected(msgs);
			case TypesPackage.MODEL_CHANGE_STRUCTURE_DATA_TYPE__AFFECTED_TYPE:
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
			case TypesPackage.MODEL_CHANGE_STRUCTURE_DATA_TYPE__AFFECTED:
				return getAffected();
			case TypesPackage.MODEL_CHANGE_STRUCTURE_DATA_TYPE__AFFECTED_TYPE:
				return getAffectedType();
			case TypesPackage.MODEL_CHANGE_STRUCTURE_DATA_TYPE__VERB:
				return getVerb();
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
			case TypesPackage.MODEL_CHANGE_STRUCTURE_DATA_TYPE__AFFECTED:
				setAffected((NodeId)newValue);
				return;
			case TypesPackage.MODEL_CHANGE_STRUCTURE_DATA_TYPE__AFFECTED_TYPE:
				setAffectedType((NodeId)newValue);
				return;
			case TypesPackage.MODEL_CHANGE_STRUCTURE_DATA_TYPE__VERB:
				setVerb((Short)newValue);
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
			case TypesPackage.MODEL_CHANGE_STRUCTURE_DATA_TYPE__AFFECTED:
				unsetAffected();
				return;
			case TypesPackage.MODEL_CHANGE_STRUCTURE_DATA_TYPE__AFFECTED_TYPE:
				unsetAffectedType();
				return;
			case TypesPackage.MODEL_CHANGE_STRUCTURE_DATA_TYPE__VERB:
				unsetVerb();
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
			case TypesPackage.MODEL_CHANGE_STRUCTURE_DATA_TYPE__AFFECTED:
				return isSetAffected();
			case TypesPackage.MODEL_CHANGE_STRUCTURE_DATA_TYPE__AFFECTED_TYPE:
				return isSetAffectedType();
			case TypesPackage.MODEL_CHANGE_STRUCTURE_DATA_TYPE__VERB:
				return isSetVerb();
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
		result.append(" (verb: ");
		if (verbESet) result.append(verb); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ModelChangeStructureDataTypeImpl
