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
import org.opcfoundation.ua._2008._02.types.QualifiedName;
import org.opcfoundation.ua._2008._02.types.RelativePathElement;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relative Path Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.RelativePathElementImpl#getReferenceTypeId <em>Reference Type Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.RelativePathElementImpl#isIsInverse <em>Is Inverse</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.RelativePathElementImpl#isIncludeSubtypes <em>Include Subtypes</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.RelativePathElementImpl#getTargetName <em>Target Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelativePathElementImpl extends MinimalEObjectImpl.Container implements RelativePathElement {
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
	 * The default value of the '{@link #isIsInverse() <em>Is Inverse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsInverse()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_INVERSE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsInverse() <em>Is Inverse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsInverse()
	 * @generated
	 * @ordered
	 */
	protected boolean isInverse = IS_INVERSE_EDEFAULT;

	/**
	 * This is true if the Is Inverse attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isInverseESet;

	/**
	 * The default value of the '{@link #isIncludeSubtypes() <em>Include Subtypes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIncludeSubtypes()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INCLUDE_SUBTYPES_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIncludeSubtypes() <em>Include Subtypes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIncludeSubtypes()
	 * @generated
	 * @ordered
	 */
	protected boolean includeSubtypes = INCLUDE_SUBTYPES_EDEFAULT;

	/**
	 * This is true if the Include Subtypes attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean includeSubtypesESet;

	/**
	 * The cached value of the '{@link #getTargetName() <em>Target Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetName()
	 * @generated
	 * @ordered
	 */
	protected QualifiedName targetName;

	/**
	 * This is true if the Target Name containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean targetNameESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelativePathElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getRelativePathElement();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.RELATIVE_PATH_ELEMENT__REFERENCE_TYPE_ID, oldReferenceTypeId, newReferenceTypeId, !oldReferenceTypeIdESet);
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
				msgs = ((InternalEObject)referenceTypeId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.RELATIVE_PATH_ELEMENT__REFERENCE_TYPE_ID, null, msgs);
			if (newReferenceTypeId != null)
				msgs = ((InternalEObject)newReferenceTypeId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.RELATIVE_PATH_ELEMENT__REFERENCE_TYPE_ID, null, msgs);
			msgs = basicSetReferenceTypeId(newReferenceTypeId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldReferenceTypeIdESet = referenceTypeIdESet;
			referenceTypeIdESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.RELATIVE_PATH_ELEMENT__REFERENCE_TYPE_ID, newReferenceTypeId, newReferenceTypeId, !oldReferenceTypeIdESet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.RELATIVE_PATH_ELEMENT__REFERENCE_TYPE_ID, oldReferenceTypeId, null, oldReferenceTypeIdESet);
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
			msgs = ((InternalEObject)referenceTypeId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.RELATIVE_PATH_ELEMENT__REFERENCE_TYPE_ID, null, msgs);
			msgs = basicUnsetReferenceTypeId(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldReferenceTypeIdESet = referenceTypeIdESet;
			referenceTypeIdESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.RELATIVE_PATH_ELEMENT__REFERENCE_TYPE_ID, null, null, oldReferenceTypeIdESet));
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
	public boolean isIsInverse() {
		return isInverse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsInverse(boolean newIsInverse) {
		boolean oldIsInverse = isInverse;
		isInverse = newIsInverse;
		boolean oldIsInverseESet = isInverseESet;
		isInverseESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.RELATIVE_PATH_ELEMENT__IS_INVERSE, oldIsInverse, isInverse, !oldIsInverseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsInverse() {
		boolean oldIsInverse = isInverse;
		boolean oldIsInverseESet = isInverseESet;
		isInverse = IS_INVERSE_EDEFAULT;
		isInverseESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.RELATIVE_PATH_ELEMENT__IS_INVERSE, oldIsInverse, IS_INVERSE_EDEFAULT, oldIsInverseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsInverse() {
		return isInverseESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIncludeSubtypes() {
		return includeSubtypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncludeSubtypes(boolean newIncludeSubtypes) {
		boolean oldIncludeSubtypes = includeSubtypes;
		includeSubtypes = newIncludeSubtypes;
		boolean oldIncludeSubtypesESet = includeSubtypesESet;
		includeSubtypesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.RELATIVE_PATH_ELEMENT__INCLUDE_SUBTYPES, oldIncludeSubtypes, includeSubtypes, !oldIncludeSubtypesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIncludeSubtypes() {
		boolean oldIncludeSubtypes = includeSubtypes;
		boolean oldIncludeSubtypesESet = includeSubtypesESet;
		includeSubtypes = INCLUDE_SUBTYPES_EDEFAULT;
		includeSubtypesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.RELATIVE_PATH_ELEMENT__INCLUDE_SUBTYPES, oldIncludeSubtypes, INCLUDE_SUBTYPES_EDEFAULT, oldIncludeSubtypesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIncludeSubtypes() {
		return includeSubtypesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualifiedName getTargetName() {
		return targetName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetName(QualifiedName newTargetName, NotificationChain msgs) {
		QualifiedName oldTargetName = targetName;
		targetName = newTargetName;
		boolean oldTargetNameESet = targetNameESet;
		targetNameESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.RELATIVE_PATH_ELEMENT__TARGET_NAME, oldTargetName, newTargetName, !oldTargetNameESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetName(QualifiedName newTargetName) {
		if (newTargetName != targetName) {
			NotificationChain msgs = null;
			if (targetName != null)
				msgs = ((InternalEObject)targetName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.RELATIVE_PATH_ELEMENT__TARGET_NAME, null, msgs);
			if (newTargetName != null)
				msgs = ((InternalEObject)newTargetName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.RELATIVE_PATH_ELEMENT__TARGET_NAME, null, msgs);
			msgs = basicSetTargetName(newTargetName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldTargetNameESet = targetNameESet;
			targetNameESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.RELATIVE_PATH_ELEMENT__TARGET_NAME, newTargetName, newTargetName, !oldTargetNameESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetTargetName(NotificationChain msgs) {
		QualifiedName oldTargetName = targetName;
		targetName = null;
		boolean oldTargetNameESet = targetNameESet;
		targetNameESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.RELATIVE_PATH_ELEMENT__TARGET_NAME, oldTargetName, null, oldTargetNameESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTargetName() {
		if (targetName != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)targetName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.RELATIVE_PATH_ELEMENT__TARGET_NAME, null, msgs);
			msgs = basicUnsetTargetName(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldTargetNameESet = targetNameESet;
			targetNameESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.RELATIVE_PATH_ELEMENT__TARGET_NAME, null, null, oldTargetNameESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTargetName() {
		return targetNameESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.RELATIVE_PATH_ELEMENT__REFERENCE_TYPE_ID:
				return basicUnsetReferenceTypeId(msgs);
			case TypesPackage.RELATIVE_PATH_ELEMENT__TARGET_NAME:
				return basicUnsetTargetName(msgs);
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
			case TypesPackage.RELATIVE_PATH_ELEMENT__REFERENCE_TYPE_ID:
				return getReferenceTypeId();
			case TypesPackage.RELATIVE_PATH_ELEMENT__IS_INVERSE:
				return isIsInverse();
			case TypesPackage.RELATIVE_PATH_ELEMENT__INCLUDE_SUBTYPES:
				return isIncludeSubtypes();
			case TypesPackage.RELATIVE_PATH_ELEMENT__TARGET_NAME:
				return getTargetName();
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
			case TypesPackage.RELATIVE_PATH_ELEMENT__REFERENCE_TYPE_ID:
				setReferenceTypeId((NodeId)newValue);
				return;
			case TypesPackage.RELATIVE_PATH_ELEMENT__IS_INVERSE:
				setIsInverse((Boolean)newValue);
				return;
			case TypesPackage.RELATIVE_PATH_ELEMENT__INCLUDE_SUBTYPES:
				setIncludeSubtypes((Boolean)newValue);
				return;
			case TypesPackage.RELATIVE_PATH_ELEMENT__TARGET_NAME:
				setTargetName((QualifiedName)newValue);
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
			case TypesPackage.RELATIVE_PATH_ELEMENT__REFERENCE_TYPE_ID:
				unsetReferenceTypeId();
				return;
			case TypesPackage.RELATIVE_PATH_ELEMENT__IS_INVERSE:
				unsetIsInverse();
				return;
			case TypesPackage.RELATIVE_PATH_ELEMENT__INCLUDE_SUBTYPES:
				unsetIncludeSubtypes();
				return;
			case TypesPackage.RELATIVE_PATH_ELEMENT__TARGET_NAME:
				unsetTargetName();
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
			case TypesPackage.RELATIVE_PATH_ELEMENT__REFERENCE_TYPE_ID:
				return isSetReferenceTypeId();
			case TypesPackage.RELATIVE_PATH_ELEMENT__IS_INVERSE:
				return isSetIsInverse();
			case TypesPackage.RELATIVE_PATH_ELEMENT__INCLUDE_SUBTYPES:
				return isSetIncludeSubtypes();
			case TypesPackage.RELATIVE_PATH_ELEMENT__TARGET_NAME:
				return isSetTargetName();
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
		result.append(" (isInverse: ");
		if (isInverseESet) result.append(isInverse); else result.append("<unset>");
		result.append(", includeSubtypes: ");
		if (includeSubtypesESet) result.append(includeSubtypes); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //RelativePathElementImpl
