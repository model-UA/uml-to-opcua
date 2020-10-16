/**
 */
package org.opcfoundation.ua._2011._03.ua.node.set.impl;

import java.util.Collection;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.opcfoundation.ua._2011._03.ua.node.set.ListOfRolePermissions;
import org.opcfoundation.ua._2011._03.ua.node.set.ModelTableEntry;
import org.opcfoundation.ua._2011._03.ua.node.set.SetPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Table Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.ModelTableEntryImpl#getRolePermissions <em>Role Permissions</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.ModelTableEntryImpl#getRequiredModel <em>Required Model</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.ModelTableEntryImpl#getAccessRestrictions <em>Access Restrictions</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.ModelTableEntryImpl#getModelUri <em>Model Uri</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.ModelTableEntryImpl#getPublicationDate <em>Publication Date</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.ModelTableEntryImpl#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelTableEntryImpl extends MinimalEObjectImpl.Container implements ModelTableEntry {
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
	 * The cached value of the '{@link #getRequiredModel() <em>Required Model</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredModel()
	 * @generated
	 * @ordered
	 */
	protected EList<ModelTableEntry> requiredModel;

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
	 * The default value of the '{@link #getModelUri() <em>Model Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelUri()
	 * @generated
	 * @ordered
	 */
	protected static final String MODEL_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModelUri() <em>Model Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelUri()
	 * @generated
	 * @ordered
	 */
	protected String modelUri = MODEL_URI_EDEFAULT;

	/**
	 * The default value of the '{@link #getPublicationDate() <em>Publication Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublicationDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar PUBLICATION_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPublicationDate() <em>Publication Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublicationDate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar publicationDate = PUBLICATION_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelTableEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SetPackage.Literals.MODEL_TABLE_ENTRY;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SetPackage.MODEL_TABLE_ENTRY__ROLE_PERMISSIONS, oldRolePermissions, newRolePermissions);
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
				msgs = ((InternalEObject)rolePermissions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SetPackage.MODEL_TABLE_ENTRY__ROLE_PERMISSIONS, null, msgs);
			if (newRolePermissions != null)
				msgs = ((InternalEObject)newRolePermissions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SetPackage.MODEL_TABLE_ENTRY__ROLE_PERMISSIONS, null, msgs);
			msgs = basicSetRolePermissions(newRolePermissions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SetPackage.MODEL_TABLE_ENTRY__ROLE_PERMISSIONS, newRolePermissions, newRolePermissions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModelTableEntry> getRequiredModel() {
		if (requiredModel == null) {
			requiredModel = new EObjectContainmentEList<ModelTableEntry>(ModelTableEntry.class, this, SetPackage.MODEL_TABLE_ENTRY__REQUIRED_MODEL);
		}
		return requiredModel;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SetPackage.MODEL_TABLE_ENTRY__ACCESS_RESTRICTIONS, oldAccessRestrictions, accessRestrictions, !oldAccessRestrictionsESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, SetPackage.MODEL_TABLE_ENTRY__ACCESS_RESTRICTIONS, oldAccessRestrictions, ACCESS_RESTRICTIONS_EDEFAULT, oldAccessRestrictionsESet));
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
	public String getModelUri() {
		return modelUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelUri(String newModelUri) {
		String oldModelUri = modelUri;
		modelUri = newModelUri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SetPackage.MODEL_TABLE_ENTRY__MODEL_URI, oldModelUri, modelUri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getPublicationDate() {
		return publicationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublicationDate(XMLGregorianCalendar newPublicationDate) {
		XMLGregorianCalendar oldPublicationDate = publicationDate;
		publicationDate = newPublicationDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SetPackage.MODEL_TABLE_ENTRY__PUBLICATION_DATE, oldPublicationDate, publicationDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SetPackage.MODEL_TABLE_ENTRY__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SetPackage.MODEL_TABLE_ENTRY__ROLE_PERMISSIONS:
				return basicSetRolePermissions(null, msgs);
			case SetPackage.MODEL_TABLE_ENTRY__REQUIRED_MODEL:
				return ((InternalEList<?>)getRequiredModel()).basicRemove(otherEnd, msgs);
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
			case SetPackage.MODEL_TABLE_ENTRY__ROLE_PERMISSIONS:
				return getRolePermissions();
			case SetPackage.MODEL_TABLE_ENTRY__REQUIRED_MODEL:
				return getRequiredModel();
			case SetPackage.MODEL_TABLE_ENTRY__ACCESS_RESTRICTIONS:
				return getAccessRestrictions();
			case SetPackage.MODEL_TABLE_ENTRY__MODEL_URI:
				return getModelUri();
			case SetPackage.MODEL_TABLE_ENTRY__PUBLICATION_DATE:
				return getPublicationDate();
			case SetPackage.MODEL_TABLE_ENTRY__VERSION:
				return getVersion();
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
			case SetPackage.MODEL_TABLE_ENTRY__ROLE_PERMISSIONS:
				setRolePermissions((ListOfRolePermissions)newValue);
				return;
			case SetPackage.MODEL_TABLE_ENTRY__REQUIRED_MODEL:
				getRequiredModel().clear();
				getRequiredModel().addAll((Collection<? extends ModelTableEntry>)newValue);
				return;
			case SetPackage.MODEL_TABLE_ENTRY__ACCESS_RESTRICTIONS:
				setAccessRestrictions((Short)newValue);
				return;
			case SetPackage.MODEL_TABLE_ENTRY__MODEL_URI:
				setModelUri((String)newValue);
				return;
			case SetPackage.MODEL_TABLE_ENTRY__PUBLICATION_DATE:
				setPublicationDate((XMLGregorianCalendar)newValue);
				return;
			case SetPackage.MODEL_TABLE_ENTRY__VERSION:
				setVersion((String)newValue);
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
			case SetPackage.MODEL_TABLE_ENTRY__ROLE_PERMISSIONS:
				setRolePermissions((ListOfRolePermissions)null);
				return;
			case SetPackage.MODEL_TABLE_ENTRY__REQUIRED_MODEL:
				getRequiredModel().clear();
				return;
			case SetPackage.MODEL_TABLE_ENTRY__ACCESS_RESTRICTIONS:
				unsetAccessRestrictions();
				return;
			case SetPackage.MODEL_TABLE_ENTRY__MODEL_URI:
				setModelUri(MODEL_URI_EDEFAULT);
				return;
			case SetPackage.MODEL_TABLE_ENTRY__PUBLICATION_DATE:
				setPublicationDate(PUBLICATION_DATE_EDEFAULT);
				return;
			case SetPackage.MODEL_TABLE_ENTRY__VERSION:
				setVersion(VERSION_EDEFAULT);
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
			case SetPackage.MODEL_TABLE_ENTRY__ROLE_PERMISSIONS:
				return rolePermissions != null;
			case SetPackage.MODEL_TABLE_ENTRY__REQUIRED_MODEL:
				return requiredModel != null && !requiredModel.isEmpty();
			case SetPackage.MODEL_TABLE_ENTRY__ACCESS_RESTRICTIONS:
				return isSetAccessRestrictions();
			case SetPackage.MODEL_TABLE_ENTRY__MODEL_URI:
				return MODEL_URI_EDEFAULT == null ? modelUri != null : !MODEL_URI_EDEFAULT.equals(modelUri);
			case SetPackage.MODEL_TABLE_ENTRY__PUBLICATION_DATE:
				return PUBLICATION_DATE_EDEFAULT == null ? publicationDate != null : !PUBLICATION_DATE_EDEFAULT.equals(publicationDate);
			case SetPackage.MODEL_TABLE_ENTRY__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
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
		result.append(" (accessRestrictions: ");
		if (accessRestrictionsESet) result.append(accessRestrictions); else result.append("<unset>");
		result.append(", modelUri: ");
		result.append(modelUri);
		result.append(", publicationDate: ");
		result.append(publicationDate);
		result.append(", version: ");
		result.append(version);
		result.append(')');
		return result.toString();
	}

} //ModelTableEntryImpl
