/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.opcfoundation.ua._2008._02.types.LocalizedText;
import org.opcfoundation.ua._2008._02.types.NodeAttributes;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node Attributes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.NodeAttributesImpl#getSpecifiedAttributes <em>Specified Attributes</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.NodeAttributesImpl#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.NodeAttributesImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.NodeAttributesImpl#getWriteMask <em>Write Mask</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.NodeAttributesImpl#getUserWriteMask <em>User Write Mask</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NodeAttributesImpl extends MinimalEObjectImpl.Container implements NodeAttributes {
	/**
	 * The default value of the '{@link #getSpecifiedAttributes() <em>Specified Attributes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecifiedAttributes()
	 * @generated
	 * @ordered
	 */
	protected static final long SPECIFIED_ATTRIBUTES_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getSpecifiedAttributes() <em>Specified Attributes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecifiedAttributes()
	 * @generated
	 * @ordered
	 */
	protected long specifiedAttributes = SPECIFIED_ATTRIBUTES_EDEFAULT;

	/**
	 * This is true if the Specified Attributes attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean specifiedAttributesESet;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeAttributesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getNodeAttributes();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getSpecifiedAttributes() {
		return specifiedAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecifiedAttributes(long newSpecifiedAttributes) {
		long oldSpecifiedAttributes = specifiedAttributes;
		specifiedAttributes = newSpecifiedAttributes;
		boolean oldSpecifiedAttributesESet = specifiedAttributesESet;
		specifiedAttributesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.NODE_ATTRIBUTES__SPECIFIED_ATTRIBUTES, oldSpecifiedAttributes, specifiedAttributes, !oldSpecifiedAttributesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSpecifiedAttributes() {
		long oldSpecifiedAttributes = specifiedAttributes;
		boolean oldSpecifiedAttributesESet = specifiedAttributesESet;
		specifiedAttributes = SPECIFIED_ATTRIBUTES_EDEFAULT;
		specifiedAttributesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.NODE_ATTRIBUTES__SPECIFIED_ATTRIBUTES, oldSpecifiedAttributes, SPECIFIED_ATTRIBUTES_EDEFAULT, oldSpecifiedAttributesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSpecifiedAttributes() {
		return specifiedAttributesESet;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.NODE_ATTRIBUTES__DISPLAY_NAME, oldDisplayName, newDisplayName, !oldDisplayNameESet);
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
				msgs = ((InternalEObject)displayName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.NODE_ATTRIBUTES__DISPLAY_NAME, null, msgs);
			if (newDisplayName != null)
				msgs = ((InternalEObject)newDisplayName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.NODE_ATTRIBUTES__DISPLAY_NAME, null, msgs);
			msgs = basicSetDisplayName(newDisplayName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldDisplayNameESet = displayNameESet;
			displayNameESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.NODE_ATTRIBUTES__DISPLAY_NAME, newDisplayName, newDisplayName, !oldDisplayNameESet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.NODE_ATTRIBUTES__DISPLAY_NAME, oldDisplayName, null, oldDisplayNameESet);
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
			msgs = ((InternalEObject)displayName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.NODE_ATTRIBUTES__DISPLAY_NAME, null, msgs);
			msgs = basicUnsetDisplayName(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldDisplayNameESet = displayNameESet;
			displayNameESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.NODE_ATTRIBUTES__DISPLAY_NAME, null, null, oldDisplayNameESet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.NODE_ATTRIBUTES__DESCRIPTION, oldDescription, newDescription, !oldDescriptionESet);
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
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.NODE_ATTRIBUTES__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.NODE_ATTRIBUTES__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldDescriptionESet = descriptionESet;
			descriptionESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.NODE_ATTRIBUTES__DESCRIPTION, newDescription, newDescription, !oldDescriptionESet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.NODE_ATTRIBUTES__DESCRIPTION, oldDescription, null, oldDescriptionESet);
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
			msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.NODE_ATTRIBUTES__DESCRIPTION, null, msgs);
			msgs = basicUnsetDescription(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldDescriptionESet = descriptionESet;
			descriptionESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.NODE_ATTRIBUTES__DESCRIPTION, null, null, oldDescriptionESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.NODE_ATTRIBUTES__WRITE_MASK, oldWriteMask, writeMask, !oldWriteMaskESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.NODE_ATTRIBUTES__WRITE_MASK, oldWriteMask, WRITE_MASK_EDEFAULT, oldWriteMaskESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.NODE_ATTRIBUTES__USER_WRITE_MASK, oldUserWriteMask, userWriteMask, !oldUserWriteMaskESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.NODE_ATTRIBUTES__USER_WRITE_MASK, oldUserWriteMask, USER_WRITE_MASK_EDEFAULT, oldUserWriteMaskESet));
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
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.NODE_ATTRIBUTES__DISPLAY_NAME:
				return basicUnsetDisplayName(msgs);
			case TypesPackage.NODE_ATTRIBUTES__DESCRIPTION:
				return basicUnsetDescription(msgs);
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
			case TypesPackage.NODE_ATTRIBUTES__SPECIFIED_ATTRIBUTES:
				return getSpecifiedAttributes();
			case TypesPackage.NODE_ATTRIBUTES__DISPLAY_NAME:
				return getDisplayName();
			case TypesPackage.NODE_ATTRIBUTES__DESCRIPTION:
				return getDescription();
			case TypesPackage.NODE_ATTRIBUTES__WRITE_MASK:
				return getWriteMask();
			case TypesPackage.NODE_ATTRIBUTES__USER_WRITE_MASK:
				return getUserWriteMask();
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
			case TypesPackage.NODE_ATTRIBUTES__SPECIFIED_ATTRIBUTES:
				setSpecifiedAttributes((Long)newValue);
				return;
			case TypesPackage.NODE_ATTRIBUTES__DISPLAY_NAME:
				setDisplayName((LocalizedText)newValue);
				return;
			case TypesPackage.NODE_ATTRIBUTES__DESCRIPTION:
				setDescription((LocalizedText)newValue);
				return;
			case TypesPackage.NODE_ATTRIBUTES__WRITE_MASK:
				setWriteMask((Long)newValue);
				return;
			case TypesPackage.NODE_ATTRIBUTES__USER_WRITE_MASK:
				setUserWriteMask((Long)newValue);
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
			case TypesPackage.NODE_ATTRIBUTES__SPECIFIED_ATTRIBUTES:
				unsetSpecifiedAttributes();
				return;
			case TypesPackage.NODE_ATTRIBUTES__DISPLAY_NAME:
				unsetDisplayName();
				return;
			case TypesPackage.NODE_ATTRIBUTES__DESCRIPTION:
				unsetDescription();
				return;
			case TypesPackage.NODE_ATTRIBUTES__WRITE_MASK:
				unsetWriteMask();
				return;
			case TypesPackage.NODE_ATTRIBUTES__USER_WRITE_MASK:
				unsetUserWriteMask();
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
			case TypesPackage.NODE_ATTRIBUTES__SPECIFIED_ATTRIBUTES:
				return isSetSpecifiedAttributes();
			case TypesPackage.NODE_ATTRIBUTES__DISPLAY_NAME:
				return isSetDisplayName();
			case TypesPackage.NODE_ATTRIBUTES__DESCRIPTION:
				return isSetDescription();
			case TypesPackage.NODE_ATTRIBUTES__WRITE_MASK:
				return isSetWriteMask();
			case TypesPackage.NODE_ATTRIBUTES__USER_WRITE_MASK:
				return isSetUserWriteMask();
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
		result.append(" (specifiedAttributes: ");
		if (specifiedAttributesESet) result.append(specifiedAttributes); else result.append("<unset>");
		result.append(", writeMask: ");
		if (writeMaskESet) result.append(writeMask); else result.append("<unset>");
		result.append(", userWriteMask: ");
		if (userWriteMaskESet) result.append(userWriteMask); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //NodeAttributesImpl
