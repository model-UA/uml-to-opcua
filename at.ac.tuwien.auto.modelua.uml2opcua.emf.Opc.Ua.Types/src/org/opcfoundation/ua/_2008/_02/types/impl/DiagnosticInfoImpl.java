/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.opcfoundation.ua._2008._02.types.DiagnosticInfo;
import org.opcfoundation.ua._2008._02.types.StatusCode;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diagnostic Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DiagnosticInfoImpl#getSymbolicId <em>Symbolic Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DiagnosticInfoImpl#getNamespaceUri <em>Namespace Uri</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DiagnosticInfoImpl#getLocale <em>Locale</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DiagnosticInfoImpl#getLocalizedText <em>Localized Text</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DiagnosticInfoImpl#getAdditionalInfo <em>Additional Info</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DiagnosticInfoImpl#getInnerStatusCode <em>Inner Status Code</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DiagnosticInfoImpl#getInnerDiagnosticInfo <em>Inner Diagnostic Info</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiagnosticInfoImpl extends MinimalEObjectImpl.Container implements DiagnosticInfo {
	/**
	 * The default value of the '{@link #getSymbolicId() <em>Symbolic Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymbolicId()
	 * @generated
	 * @ordered
	 */
	protected static final int SYMBOLIC_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSymbolicId() <em>Symbolic Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymbolicId()
	 * @generated
	 * @ordered
	 */
	protected int symbolicId = SYMBOLIC_ID_EDEFAULT;

	/**
	 * This is true if the Symbolic Id attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean symbolicIdESet;

	/**
	 * The default value of the '{@link #getNamespaceUri() <em>Namespace Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespaceUri()
	 * @generated
	 * @ordered
	 */
	protected static final int NAMESPACE_URI_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNamespaceUri() <em>Namespace Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespaceUri()
	 * @generated
	 * @ordered
	 */
	protected int namespaceUri = NAMESPACE_URI_EDEFAULT;

	/**
	 * This is true if the Namespace Uri attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean namespaceUriESet;

	/**
	 * The default value of the '{@link #getLocale() <em>Locale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocale()
	 * @generated
	 * @ordered
	 */
	protected static final int LOCALE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLocale() <em>Locale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocale()
	 * @generated
	 * @ordered
	 */
	protected int locale = LOCALE_EDEFAULT;

	/**
	 * This is true if the Locale attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean localeESet;

	/**
	 * The default value of the '{@link #getLocalizedText() <em>Localized Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalizedText()
	 * @generated
	 * @ordered
	 */
	protected static final int LOCALIZED_TEXT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLocalizedText() <em>Localized Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalizedText()
	 * @generated
	 * @ordered
	 */
	protected int localizedText = LOCALIZED_TEXT_EDEFAULT;

	/**
	 * This is true if the Localized Text attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean localizedTextESet;

	/**
	 * The default value of the '{@link #getAdditionalInfo() <em>Additional Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalInfo()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDITIONAL_INFO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAdditionalInfo() <em>Additional Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalInfo()
	 * @generated
	 * @ordered
	 */
	protected String additionalInfo = ADDITIONAL_INFO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInnerStatusCode() <em>Inner Status Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInnerStatusCode()
	 * @generated
	 * @ordered
	 */
	protected StatusCode innerStatusCode;

	/**
	 * The cached value of the '{@link #getInnerDiagnosticInfo() <em>Inner Diagnostic Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInnerDiagnosticInfo()
	 * @generated
	 * @ordered
	 */
	protected DiagnosticInfo innerDiagnosticInfo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiagnosticInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getDiagnosticInfo();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSymbolicId() {
		return symbolicId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSymbolicId(int newSymbolicId) {
		int oldSymbolicId = symbolicId;
		symbolicId = newSymbolicId;
		boolean oldSymbolicIdESet = symbolicIdESet;
		symbolicIdESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.DIAGNOSTIC_INFO__SYMBOLIC_ID, oldSymbolicId, symbolicId, !oldSymbolicIdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSymbolicId() {
		int oldSymbolicId = symbolicId;
		boolean oldSymbolicIdESet = symbolicIdESet;
		symbolicId = SYMBOLIC_ID_EDEFAULT;
		symbolicIdESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.DIAGNOSTIC_INFO__SYMBOLIC_ID, oldSymbolicId, SYMBOLIC_ID_EDEFAULT, oldSymbolicIdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSymbolicId() {
		return symbolicIdESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNamespaceUri() {
		return namespaceUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNamespaceUri(int newNamespaceUri) {
		int oldNamespaceUri = namespaceUri;
		namespaceUri = newNamespaceUri;
		boolean oldNamespaceUriESet = namespaceUriESet;
		namespaceUriESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.DIAGNOSTIC_INFO__NAMESPACE_URI, oldNamespaceUri, namespaceUri, !oldNamespaceUriESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNamespaceUri() {
		int oldNamespaceUri = namespaceUri;
		boolean oldNamespaceUriESet = namespaceUriESet;
		namespaceUri = NAMESPACE_URI_EDEFAULT;
		namespaceUriESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.DIAGNOSTIC_INFO__NAMESPACE_URI, oldNamespaceUri, NAMESPACE_URI_EDEFAULT, oldNamespaceUriESet));
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
	public int getLocale() {
		return locale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocale(int newLocale) {
		int oldLocale = locale;
		locale = newLocale;
		boolean oldLocaleESet = localeESet;
		localeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.DIAGNOSTIC_INFO__LOCALE, oldLocale, locale, !oldLocaleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLocale() {
		int oldLocale = locale;
		boolean oldLocaleESet = localeESet;
		locale = LOCALE_EDEFAULT;
		localeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.DIAGNOSTIC_INFO__LOCALE, oldLocale, LOCALE_EDEFAULT, oldLocaleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLocale() {
		return localeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLocalizedText() {
		return localizedText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocalizedText(int newLocalizedText) {
		int oldLocalizedText = localizedText;
		localizedText = newLocalizedText;
		boolean oldLocalizedTextESet = localizedTextESet;
		localizedTextESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.DIAGNOSTIC_INFO__LOCALIZED_TEXT, oldLocalizedText, localizedText, !oldLocalizedTextESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLocalizedText() {
		int oldLocalizedText = localizedText;
		boolean oldLocalizedTextESet = localizedTextESet;
		localizedText = LOCALIZED_TEXT_EDEFAULT;
		localizedTextESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.DIAGNOSTIC_INFO__LOCALIZED_TEXT, oldLocalizedText, LOCALIZED_TEXT_EDEFAULT, oldLocalizedTextESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLocalizedText() {
		return localizedTextESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAdditionalInfo() {
		return additionalInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdditionalInfo(String newAdditionalInfo) {
		String oldAdditionalInfo = additionalInfo;
		additionalInfo = newAdditionalInfo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.DIAGNOSTIC_INFO__ADDITIONAL_INFO, oldAdditionalInfo, additionalInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatusCode getInnerStatusCode() {
		return innerStatusCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInnerStatusCode(StatusCode newInnerStatusCode, NotificationChain msgs) {
		StatusCode oldInnerStatusCode = innerStatusCode;
		innerStatusCode = newInnerStatusCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.DIAGNOSTIC_INFO__INNER_STATUS_CODE, oldInnerStatusCode, newInnerStatusCode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInnerStatusCode(StatusCode newInnerStatusCode) {
		if (newInnerStatusCode != innerStatusCode) {
			NotificationChain msgs = null;
			if (innerStatusCode != null)
				msgs = ((InternalEObject)innerStatusCode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.DIAGNOSTIC_INFO__INNER_STATUS_CODE, null, msgs);
			if (newInnerStatusCode != null)
				msgs = ((InternalEObject)newInnerStatusCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.DIAGNOSTIC_INFO__INNER_STATUS_CODE, null, msgs);
			msgs = basicSetInnerStatusCode(newInnerStatusCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.DIAGNOSTIC_INFO__INNER_STATUS_CODE, newInnerStatusCode, newInnerStatusCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagnosticInfo getInnerDiagnosticInfo() {
		return innerDiagnosticInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInnerDiagnosticInfo(DiagnosticInfo newInnerDiagnosticInfo, NotificationChain msgs) {
		DiagnosticInfo oldInnerDiagnosticInfo = innerDiagnosticInfo;
		innerDiagnosticInfo = newInnerDiagnosticInfo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.DIAGNOSTIC_INFO__INNER_DIAGNOSTIC_INFO, oldInnerDiagnosticInfo, newInnerDiagnosticInfo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInnerDiagnosticInfo(DiagnosticInfo newInnerDiagnosticInfo) {
		if (newInnerDiagnosticInfo != innerDiagnosticInfo) {
			NotificationChain msgs = null;
			if (innerDiagnosticInfo != null)
				msgs = ((InternalEObject)innerDiagnosticInfo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.DIAGNOSTIC_INFO__INNER_DIAGNOSTIC_INFO, null, msgs);
			if (newInnerDiagnosticInfo != null)
				msgs = ((InternalEObject)newInnerDiagnosticInfo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.DIAGNOSTIC_INFO__INNER_DIAGNOSTIC_INFO, null, msgs);
			msgs = basicSetInnerDiagnosticInfo(newInnerDiagnosticInfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.DIAGNOSTIC_INFO__INNER_DIAGNOSTIC_INFO, newInnerDiagnosticInfo, newInnerDiagnosticInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.DIAGNOSTIC_INFO__INNER_STATUS_CODE:
				return basicSetInnerStatusCode(null, msgs);
			case TypesPackage.DIAGNOSTIC_INFO__INNER_DIAGNOSTIC_INFO:
				return basicSetInnerDiagnosticInfo(null, msgs);
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
			case TypesPackage.DIAGNOSTIC_INFO__SYMBOLIC_ID:
				return getSymbolicId();
			case TypesPackage.DIAGNOSTIC_INFO__NAMESPACE_URI:
				return getNamespaceUri();
			case TypesPackage.DIAGNOSTIC_INFO__LOCALE:
				return getLocale();
			case TypesPackage.DIAGNOSTIC_INFO__LOCALIZED_TEXT:
				return getLocalizedText();
			case TypesPackage.DIAGNOSTIC_INFO__ADDITIONAL_INFO:
				return getAdditionalInfo();
			case TypesPackage.DIAGNOSTIC_INFO__INNER_STATUS_CODE:
				return getInnerStatusCode();
			case TypesPackage.DIAGNOSTIC_INFO__INNER_DIAGNOSTIC_INFO:
				return getInnerDiagnosticInfo();
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
			case TypesPackage.DIAGNOSTIC_INFO__SYMBOLIC_ID:
				setSymbolicId((Integer)newValue);
				return;
			case TypesPackage.DIAGNOSTIC_INFO__NAMESPACE_URI:
				setNamespaceUri((Integer)newValue);
				return;
			case TypesPackage.DIAGNOSTIC_INFO__LOCALE:
				setLocale((Integer)newValue);
				return;
			case TypesPackage.DIAGNOSTIC_INFO__LOCALIZED_TEXT:
				setLocalizedText((Integer)newValue);
				return;
			case TypesPackage.DIAGNOSTIC_INFO__ADDITIONAL_INFO:
				setAdditionalInfo((String)newValue);
				return;
			case TypesPackage.DIAGNOSTIC_INFO__INNER_STATUS_CODE:
				setInnerStatusCode((StatusCode)newValue);
				return;
			case TypesPackage.DIAGNOSTIC_INFO__INNER_DIAGNOSTIC_INFO:
				setInnerDiagnosticInfo((DiagnosticInfo)newValue);
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
			case TypesPackage.DIAGNOSTIC_INFO__SYMBOLIC_ID:
				unsetSymbolicId();
				return;
			case TypesPackage.DIAGNOSTIC_INFO__NAMESPACE_URI:
				unsetNamespaceUri();
				return;
			case TypesPackage.DIAGNOSTIC_INFO__LOCALE:
				unsetLocale();
				return;
			case TypesPackage.DIAGNOSTIC_INFO__LOCALIZED_TEXT:
				unsetLocalizedText();
				return;
			case TypesPackage.DIAGNOSTIC_INFO__ADDITIONAL_INFO:
				setAdditionalInfo(ADDITIONAL_INFO_EDEFAULT);
				return;
			case TypesPackage.DIAGNOSTIC_INFO__INNER_STATUS_CODE:
				setInnerStatusCode((StatusCode)null);
				return;
			case TypesPackage.DIAGNOSTIC_INFO__INNER_DIAGNOSTIC_INFO:
				setInnerDiagnosticInfo((DiagnosticInfo)null);
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
			case TypesPackage.DIAGNOSTIC_INFO__SYMBOLIC_ID:
				return isSetSymbolicId();
			case TypesPackage.DIAGNOSTIC_INFO__NAMESPACE_URI:
				return isSetNamespaceUri();
			case TypesPackage.DIAGNOSTIC_INFO__LOCALE:
				return isSetLocale();
			case TypesPackage.DIAGNOSTIC_INFO__LOCALIZED_TEXT:
				return isSetLocalizedText();
			case TypesPackage.DIAGNOSTIC_INFO__ADDITIONAL_INFO:
				return ADDITIONAL_INFO_EDEFAULT == null ? additionalInfo != null : !ADDITIONAL_INFO_EDEFAULT.equals(additionalInfo);
			case TypesPackage.DIAGNOSTIC_INFO__INNER_STATUS_CODE:
				return innerStatusCode != null;
			case TypesPackage.DIAGNOSTIC_INFO__INNER_DIAGNOSTIC_INFO:
				return innerDiagnosticInfo != null;
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
		result.append(" (symbolicId: ");
		if (symbolicIdESet) result.append(symbolicId); else result.append("<unset>");
		result.append(", namespaceUri: ");
		if (namespaceUriESet) result.append(namespaceUri); else result.append("<unset>");
		result.append(", locale: ");
		if (localeESet) result.append(locale); else result.append("<unset>");
		result.append(", localizedText: ");
		if (localizedTextESet) result.append(localizedText); else result.append("<unset>");
		result.append(", additionalInfo: ");
		result.append(additionalInfo);
		result.append(')');
		return result.toString();
	}

} //DiagnosticInfoImpl
