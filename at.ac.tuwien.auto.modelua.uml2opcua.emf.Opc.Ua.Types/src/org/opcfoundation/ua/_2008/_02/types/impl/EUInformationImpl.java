/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.opcfoundation.ua._2008._02.types.EUInformation;
import org.opcfoundation.ua._2008._02.types.LocalizedText;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EU Information</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.EUInformationImpl#getNamespaceUri <em>Namespace Uri</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.EUInformationImpl#getUnitId <em>Unit Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.EUInformationImpl#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.EUInformationImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EUInformationImpl extends MinimalEObjectImpl.Container implements EUInformation {
	/**
	 * The default value of the '{@link #getNamespaceUri() <em>Namespace Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespaceUri()
	 * @generated
	 * @ordered
	 */
	protected static final String NAMESPACE_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNamespaceUri() <em>Namespace Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespaceUri()
	 * @generated
	 * @ordered
	 */
	protected String namespaceUri = NAMESPACE_URI_EDEFAULT;

	/**
	 * This is true if the Namespace Uri attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean namespaceUriESet;

	/**
	 * The default value of the '{@link #getUnitId() <em>Unit Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitId()
	 * @generated
	 * @ordered
	 */
	protected static final int UNIT_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getUnitId() <em>Unit Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitId()
	 * @generated
	 * @ordered
	 */
	protected int unitId = UNIT_ID_EDEFAULT;

	/**
	 * This is true if the Unit Id attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean unitIdESet;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EUInformationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getEUInformation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNamespaceUri() {
		return namespaceUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNamespaceUri(String newNamespaceUri) {
		String oldNamespaceUri = namespaceUri;
		namespaceUri = newNamespaceUri;
		boolean oldNamespaceUriESet = namespaceUriESet;
		namespaceUriESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.EU_INFORMATION__NAMESPACE_URI, oldNamespaceUri, namespaceUri, !oldNamespaceUriESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNamespaceUri() {
		String oldNamespaceUri = namespaceUri;
		boolean oldNamespaceUriESet = namespaceUriESet;
		namespaceUri = NAMESPACE_URI_EDEFAULT;
		namespaceUriESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.EU_INFORMATION__NAMESPACE_URI, oldNamespaceUri, NAMESPACE_URI_EDEFAULT, oldNamespaceUriESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNamespaceUri() {
		return namespaceUriESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getUnitId() {
		return unitId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnitId(int newUnitId) {
		int oldUnitId = unitId;
		unitId = newUnitId;
		boolean oldUnitIdESet = unitIdESet;
		unitIdESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.EU_INFORMATION__UNIT_ID, oldUnitId, unitId, !oldUnitIdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUnitId() {
		int oldUnitId = unitId;
		boolean oldUnitIdESet = unitIdESet;
		unitId = UNIT_ID_EDEFAULT;
		unitIdESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.EU_INFORMATION__UNIT_ID, oldUnitId, UNIT_ID_EDEFAULT, oldUnitIdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUnitId() {
		return unitIdESet;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.EU_INFORMATION__DISPLAY_NAME, oldDisplayName, newDisplayName, !oldDisplayNameESet);
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
				msgs = ((InternalEObject)displayName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.EU_INFORMATION__DISPLAY_NAME, null, msgs);
			if (newDisplayName != null)
				msgs = ((InternalEObject)newDisplayName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.EU_INFORMATION__DISPLAY_NAME, null, msgs);
			msgs = basicSetDisplayName(newDisplayName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldDisplayNameESet = displayNameESet;
			displayNameESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.EU_INFORMATION__DISPLAY_NAME, newDisplayName, newDisplayName, !oldDisplayNameESet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.EU_INFORMATION__DISPLAY_NAME, oldDisplayName, null, oldDisplayNameESet);
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
			msgs = ((InternalEObject)displayName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.EU_INFORMATION__DISPLAY_NAME, null, msgs);
			msgs = basicUnsetDisplayName(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldDisplayNameESet = displayNameESet;
			displayNameESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.EU_INFORMATION__DISPLAY_NAME, null, null, oldDisplayNameESet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.EU_INFORMATION__DESCRIPTION, oldDescription, newDescription, !oldDescriptionESet);
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
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.EU_INFORMATION__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.EU_INFORMATION__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldDescriptionESet = descriptionESet;
			descriptionESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.EU_INFORMATION__DESCRIPTION, newDescription, newDescription, !oldDescriptionESet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.EU_INFORMATION__DESCRIPTION, oldDescription, null, oldDescriptionESet);
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
			msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.EU_INFORMATION__DESCRIPTION, null, msgs);
			msgs = basicUnsetDescription(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldDescriptionESet = descriptionESet;
			descriptionESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.EU_INFORMATION__DESCRIPTION, null, null, oldDescriptionESet));
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
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.EU_INFORMATION__DISPLAY_NAME:
				return basicUnsetDisplayName(msgs);
			case TypesPackage.EU_INFORMATION__DESCRIPTION:
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
			case TypesPackage.EU_INFORMATION__NAMESPACE_URI:
				return getNamespaceUri();
			case TypesPackage.EU_INFORMATION__UNIT_ID:
				return getUnitId();
			case TypesPackage.EU_INFORMATION__DISPLAY_NAME:
				return getDisplayName();
			case TypesPackage.EU_INFORMATION__DESCRIPTION:
				return getDescription();
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
			case TypesPackage.EU_INFORMATION__NAMESPACE_URI:
				setNamespaceUri((String)newValue);
				return;
			case TypesPackage.EU_INFORMATION__UNIT_ID:
				setUnitId((Integer)newValue);
				return;
			case TypesPackage.EU_INFORMATION__DISPLAY_NAME:
				setDisplayName((LocalizedText)newValue);
				return;
			case TypesPackage.EU_INFORMATION__DESCRIPTION:
				setDescription((LocalizedText)newValue);
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
			case TypesPackage.EU_INFORMATION__NAMESPACE_URI:
				unsetNamespaceUri();
				return;
			case TypesPackage.EU_INFORMATION__UNIT_ID:
				unsetUnitId();
				return;
			case TypesPackage.EU_INFORMATION__DISPLAY_NAME:
				unsetDisplayName();
				return;
			case TypesPackage.EU_INFORMATION__DESCRIPTION:
				unsetDescription();
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
			case TypesPackage.EU_INFORMATION__NAMESPACE_URI:
				return isSetNamespaceUri();
			case TypesPackage.EU_INFORMATION__UNIT_ID:
				return isSetUnitId();
			case TypesPackage.EU_INFORMATION__DISPLAY_NAME:
				return isSetDisplayName();
			case TypesPackage.EU_INFORMATION__DESCRIPTION:
				return isSetDescription();
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
		result.append(" (namespaceUri: ");
		if (namespaceUriESet) result.append(namespaceUri); else result.append("<unset>");
		result.append(", unitId: ");
		if (unitIdESet) result.append(unitId); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //EUInformationImpl
