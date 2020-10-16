/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.opcfoundation.ua._2008._02.types.ListOfByteString;
import org.opcfoundation.ua._2008._02.types.TrustListDataType;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trust List Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.TrustListDataTypeImpl#getSpecifiedLists <em>Specified Lists</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.TrustListDataTypeImpl#getTrustedCertificates <em>Trusted Certificates</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.TrustListDataTypeImpl#getTrustedCrls <em>Trusted Crls</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.TrustListDataTypeImpl#getIssuerCertificates <em>Issuer Certificates</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.TrustListDataTypeImpl#getIssuerCrls <em>Issuer Crls</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TrustListDataTypeImpl extends MinimalEObjectImpl.Container implements TrustListDataType {
	/**
	 * The default value of the '{@link #getSpecifiedLists() <em>Specified Lists</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecifiedLists()
	 * @generated
	 * @ordered
	 */
	protected static final long SPECIFIED_LISTS_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getSpecifiedLists() <em>Specified Lists</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecifiedLists()
	 * @generated
	 * @ordered
	 */
	protected long specifiedLists = SPECIFIED_LISTS_EDEFAULT;

	/**
	 * This is true if the Specified Lists attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean specifiedListsESet;

	/**
	 * The cached value of the '{@link #getTrustedCertificates() <em>Trusted Certificates</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrustedCertificates()
	 * @generated
	 * @ordered
	 */
	protected ListOfByteString trustedCertificates;

	/**
	 * This is true if the Trusted Certificates containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean trustedCertificatesESet;

	/**
	 * The cached value of the '{@link #getTrustedCrls() <em>Trusted Crls</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrustedCrls()
	 * @generated
	 * @ordered
	 */
	protected ListOfByteString trustedCrls;

	/**
	 * This is true if the Trusted Crls containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean trustedCrlsESet;

	/**
	 * The cached value of the '{@link #getIssuerCertificates() <em>Issuer Certificates</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssuerCertificates()
	 * @generated
	 * @ordered
	 */
	protected ListOfByteString issuerCertificates;

	/**
	 * This is true if the Issuer Certificates containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean issuerCertificatesESet;

	/**
	 * The cached value of the '{@link #getIssuerCrls() <em>Issuer Crls</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssuerCrls()
	 * @generated
	 * @ordered
	 */
	protected ListOfByteString issuerCrls;

	/**
	 * This is true if the Issuer Crls containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean issuerCrlsESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrustListDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getTrustListDataType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getSpecifiedLists() {
		return specifiedLists;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecifiedLists(long newSpecifiedLists) {
		long oldSpecifiedLists = specifiedLists;
		specifiedLists = newSpecifiedLists;
		boolean oldSpecifiedListsESet = specifiedListsESet;
		specifiedListsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.TRUST_LIST_DATA_TYPE__SPECIFIED_LISTS, oldSpecifiedLists, specifiedLists, !oldSpecifiedListsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSpecifiedLists() {
		long oldSpecifiedLists = specifiedLists;
		boolean oldSpecifiedListsESet = specifiedListsESet;
		specifiedLists = SPECIFIED_LISTS_EDEFAULT;
		specifiedListsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.TRUST_LIST_DATA_TYPE__SPECIFIED_LISTS, oldSpecifiedLists, SPECIFIED_LISTS_EDEFAULT, oldSpecifiedListsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSpecifiedLists() {
		return specifiedListsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfByteString getTrustedCertificates() {
		return trustedCertificates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTrustedCertificates(ListOfByteString newTrustedCertificates, NotificationChain msgs) {
		ListOfByteString oldTrustedCertificates = trustedCertificates;
		trustedCertificates = newTrustedCertificates;
		boolean oldTrustedCertificatesESet = trustedCertificatesESet;
		trustedCertificatesESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.TRUST_LIST_DATA_TYPE__TRUSTED_CERTIFICATES, oldTrustedCertificates, newTrustedCertificates, !oldTrustedCertificatesESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrustedCertificates(ListOfByteString newTrustedCertificates) {
		if (newTrustedCertificates != trustedCertificates) {
			NotificationChain msgs = null;
			if (trustedCertificates != null)
				msgs = ((InternalEObject)trustedCertificates).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.TRUST_LIST_DATA_TYPE__TRUSTED_CERTIFICATES, null, msgs);
			if (newTrustedCertificates != null)
				msgs = ((InternalEObject)newTrustedCertificates).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.TRUST_LIST_DATA_TYPE__TRUSTED_CERTIFICATES, null, msgs);
			msgs = basicSetTrustedCertificates(newTrustedCertificates, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldTrustedCertificatesESet = trustedCertificatesESet;
			trustedCertificatesESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.TRUST_LIST_DATA_TYPE__TRUSTED_CERTIFICATES, newTrustedCertificates, newTrustedCertificates, !oldTrustedCertificatesESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetTrustedCertificates(NotificationChain msgs) {
		ListOfByteString oldTrustedCertificates = trustedCertificates;
		trustedCertificates = null;
		boolean oldTrustedCertificatesESet = trustedCertificatesESet;
		trustedCertificatesESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.TRUST_LIST_DATA_TYPE__TRUSTED_CERTIFICATES, oldTrustedCertificates, null, oldTrustedCertificatesESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTrustedCertificates() {
		if (trustedCertificates != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)trustedCertificates).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.TRUST_LIST_DATA_TYPE__TRUSTED_CERTIFICATES, null, msgs);
			msgs = basicUnsetTrustedCertificates(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldTrustedCertificatesESet = trustedCertificatesESet;
			trustedCertificatesESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.TRUST_LIST_DATA_TYPE__TRUSTED_CERTIFICATES, null, null, oldTrustedCertificatesESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTrustedCertificates() {
		return trustedCertificatesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfByteString getTrustedCrls() {
		return trustedCrls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTrustedCrls(ListOfByteString newTrustedCrls, NotificationChain msgs) {
		ListOfByteString oldTrustedCrls = trustedCrls;
		trustedCrls = newTrustedCrls;
		boolean oldTrustedCrlsESet = trustedCrlsESet;
		trustedCrlsESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.TRUST_LIST_DATA_TYPE__TRUSTED_CRLS, oldTrustedCrls, newTrustedCrls, !oldTrustedCrlsESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrustedCrls(ListOfByteString newTrustedCrls) {
		if (newTrustedCrls != trustedCrls) {
			NotificationChain msgs = null;
			if (trustedCrls != null)
				msgs = ((InternalEObject)trustedCrls).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.TRUST_LIST_DATA_TYPE__TRUSTED_CRLS, null, msgs);
			if (newTrustedCrls != null)
				msgs = ((InternalEObject)newTrustedCrls).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.TRUST_LIST_DATA_TYPE__TRUSTED_CRLS, null, msgs);
			msgs = basicSetTrustedCrls(newTrustedCrls, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldTrustedCrlsESet = trustedCrlsESet;
			trustedCrlsESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.TRUST_LIST_DATA_TYPE__TRUSTED_CRLS, newTrustedCrls, newTrustedCrls, !oldTrustedCrlsESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetTrustedCrls(NotificationChain msgs) {
		ListOfByteString oldTrustedCrls = trustedCrls;
		trustedCrls = null;
		boolean oldTrustedCrlsESet = trustedCrlsESet;
		trustedCrlsESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.TRUST_LIST_DATA_TYPE__TRUSTED_CRLS, oldTrustedCrls, null, oldTrustedCrlsESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTrustedCrls() {
		if (trustedCrls != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)trustedCrls).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.TRUST_LIST_DATA_TYPE__TRUSTED_CRLS, null, msgs);
			msgs = basicUnsetTrustedCrls(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldTrustedCrlsESet = trustedCrlsESet;
			trustedCrlsESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.TRUST_LIST_DATA_TYPE__TRUSTED_CRLS, null, null, oldTrustedCrlsESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTrustedCrls() {
		return trustedCrlsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfByteString getIssuerCertificates() {
		return issuerCertificates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIssuerCertificates(ListOfByteString newIssuerCertificates, NotificationChain msgs) {
		ListOfByteString oldIssuerCertificates = issuerCertificates;
		issuerCertificates = newIssuerCertificates;
		boolean oldIssuerCertificatesESet = issuerCertificatesESet;
		issuerCertificatesESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.TRUST_LIST_DATA_TYPE__ISSUER_CERTIFICATES, oldIssuerCertificates, newIssuerCertificates, !oldIssuerCertificatesESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIssuerCertificates(ListOfByteString newIssuerCertificates) {
		if (newIssuerCertificates != issuerCertificates) {
			NotificationChain msgs = null;
			if (issuerCertificates != null)
				msgs = ((InternalEObject)issuerCertificates).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.TRUST_LIST_DATA_TYPE__ISSUER_CERTIFICATES, null, msgs);
			if (newIssuerCertificates != null)
				msgs = ((InternalEObject)newIssuerCertificates).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.TRUST_LIST_DATA_TYPE__ISSUER_CERTIFICATES, null, msgs);
			msgs = basicSetIssuerCertificates(newIssuerCertificates, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldIssuerCertificatesESet = issuerCertificatesESet;
			issuerCertificatesESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.TRUST_LIST_DATA_TYPE__ISSUER_CERTIFICATES, newIssuerCertificates, newIssuerCertificates, !oldIssuerCertificatesESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetIssuerCertificates(NotificationChain msgs) {
		ListOfByteString oldIssuerCertificates = issuerCertificates;
		issuerCertificates = null;
		boolean oldIssuerCertificatesESet = issuerCertificatesESet;
		issuerCertificatesESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.TRUST_LIST_DATA_TYPE__ISSUER_CERTIFICATES, oldIssuerCertificates, null, oldIssuerCertificatesESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIssuerCertificates() {
		if (issuerCertificates != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)issuerCertificates).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.TRUST_LIST_DATA_TYPE__ISSUER_CERTIFICATES, null, msgs);
			msgs = basicUnsetIssuerCertificates(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldIssuerCertificatesESet = issuerCertificatesESet;
			issuerCertificatesESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.TRUST_LIST_DATA_TYPE__ISSUER_CERTIFICATES, null, null, oldIssuerCertificatesESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIssuerCertificates() {
		return issuerCertificatesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfByteString getIssuerCrls() {
		return issuerCrls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIssuerCrls(ListOfByteString newIssuerCrls, NotificationChain msgs) {
		ListOfByteString oldIssuerCrls = issuerCrls;
		issuerCrls = newIssuerCrls;
		boolean oldIssuerCrlsESet = issuerCrlsESet;
		issuerCrlsESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.TRUST_LIST_DATA_TYPE__ISSUER_CRLS, oldIssuerCrls, newIssuerCrls, !oldIssuerCrlsESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIssuerCrls(ListOfByteString newIssuerCrls) {
		if (newIssuerCrls != issuerCrls) {
			NotificationChain msgs = null;
			if (issuerCrls != null)
				msgs = ((InternalEObject)issuerCrls).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.TRUST_LIST_DATA_TYPE__ISSUER_CRLS, null, msgs);
			if (newIssuerCrls != null)
				msgs = ((InternalEObject)newIssuerCrls).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.TRUST_LIST_DATA_TYPE__ISSUER_CRLS, null, msgs);
			msgs = basicSetIssuerCrls(newIssuerCrls, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldIssuerCrlsESet = issuerCrlsESet;
			issuerCrlsESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.TRUST_LIST_DATA_TYPE__ISSUER_CRLS, newIssuerCrls, newIssuerCrls, !oldIssuerCrlsESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetIssuerCrls(NotificationChain msgs) {
		ListOfByteString oldIssuerCrls = issuerCrls;
		issuerCrls = null;
		boolean oldIssuerCrlsESet = issuerCrlsESet;
		issuerCrlsESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.TRUST_LIST_DATA_TYPE__ISSUER_CRLS, oldIssuerCrls, null, oldIssuerCrlsESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIssuerCrls() {
		if (issuerCrls != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)issuerCrls).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.TRUST_LIST_DATA_TYPE__ISSUER_CRLS, null, msgs);
			msgs = basicUnsetIssuerCrls(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldIssuerCrlsESet = issuerCrlsESet;
			issuerCrlsESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.TRUST_LIST_DATA_TYPE__ISSUER_CRLS, null, null, oldIssuerCrlsESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIssuerCrls() {
		return issuerCrlsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.TRUST_LIST_DATA_TYPE__TRUSTED_CERTIFICATES:
				return basicUnsetTrustedCertificates(msgs);
			case TypesPackage.TRUST_LIST_DATA_TYPE__TRUSTED_CRLS:
				return basicUnsetTrustedCrls(msgs);
			case TypesPackage.TRUST_LIST_DATA_TYPE__ISSUER_CERTIFICATES:
				return basicUnsetIssuerCertificates(msgs);
			case TypesPackage.TRUST_LIST_DATA_TYPE__ISSUER_CRLS:
				return basicUnsetIssuerCrls(msgs);
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
			case TypesPackage.TRUST_LIST_DATA_TYPE__SPECIFIED_LISTS:
				return getSpecifiedLists();
			case TypesPackage.TRUST_LIST_DATA_TYPE__TRUSTED_CERTIFICATES:
				return getTrustedCertificates();
			case TypesPackage.TRUST_LIST_DATA_TYPE__TRUSTED_CRLS:
				return getTrustedCrls();
			case TypesPackage.TRUST_LIST_DATA_TYPE__ISSUER_CERTIFICATES:
				return getIssuerCertificates();
			case TypesPackage.TRUST_LIST_DATA_TYPE__ISSUER_CRLS:
				return getIssuerCrls();
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
			case TypesPackage.TRUST_LIST_DATA_TYPE__SPECIFIED_LISTS:
				setSpecifiedLists((Long)newValue);
				return;
			case TypesPackage.TRUST_LIST_DATA_TYPE__TRUSTED_CERTIFICATES:
				setTrustedCertificates((ListOfByteString)newValue);
				return;
			case TypesPackage.TRUST_LIST_DATA_TYPE__TRUSTED_CRLS:
				setTrustedCrls((ListOfByteString)newValue);
				return;
			case TypesPackage.TRUST_LIST_DATA_TYPE__ISSUER_CERTIFICATES:
				setIssuerCertificates((ListOfByteString)newValue);
				return;
			case TypesPackage.TRUST_LIST_DATA_TYPE__ISSUER_CRLS:
				setIssuerCrls((ListOfByteString)newValue);
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
			case TypesPackage.TRUST_LIST_DATA_TYPE__SPECIFIED_LISTS:
				unsetSpecifiedLists();
				return;
			case TypesPackage.TRUST_LIST_DATA_TYPE__TRUSTED_CERTIFICATES:
				unsetTrustedCertificates();
				return;
			case TypesPackage.TRUST_LIST_DATA_TYPE__TRUSTED_CRLS:
				unsetTrustedCrls();
				return;
			case TypesPackage.TRUST_LIST_DATA_TYPE__ISSUER_CERTIFICATES:
				unsetIssuerCertificates();
				return;
			case TypesPackage.TRUST_LIST_DATA_TYPE__ISSUER_CRLS:
				unsetIssuerCrls();
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
			case TypesPackage.TRUST_LIST_DATA_TYPE__SPECIFIED_LISTS:
				return isSetSpecifiedLists();
			case TypesPackage.TRUST_LIST_DATA_TYPE__TRUSTED_CERTIFICATES:
				return isSetTrustedCertificates();
			case TypesPackage.TRUST_LIST_DATA_TYPE__TRUSTED_CRLS:
				return isSetTrustedCrls();
			case TypesPackage.TRUST_LIST_DATA_TYPE__ISSUER_CERTIFICATES:
				return isSetIssuerCertificates();
			case TypesPackage.TRUST_LIST_DATA_TYPE__ISSUER_CRLS:
				return isSetIssuerCrls();
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
		result.append(" (specifiedLists: ");
		if (specifiedListsESet) result.append(specifiedLists); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TrustListDataTypeImpl
