/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.opcfoundation.ua._2008._02.types.BuildInfo;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Build Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.BuildInfoImpl#getProductUri <em>Product Uri</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.BuildInfoImpl#getManufacturerName <em>Manufacturer Name</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.BuildInfoImpl#getProductName <em>Product Name</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.BuildInfoImpl#getSoftwareVersion <em>Software Version</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.BuildInfoImpl#getBuildNumber <em>Build Number</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.BuildInfoImpl#getBuildDate <em>Build Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BuildInfoImpl extends MinimalEObjectImpl.Container implements BuildInfo {
	/**
	 * The default value of the '{@link #getProductUri() <em>Product Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductUri()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductUri() <em>Product Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductUri()
	 * @generated
	 * @ordered
	 */
	protected String productUri = PRODUCT_URI_EDEFAULT;

	/**
	 * This is true if the Product Uri attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean productUriESet;

	/**
	 * The default value of the '{@link #getManufacturerName() <em>Manufacturer Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManufacturerName()
	 * @generated
	 * @ordered
	 */
	protected static final String MANUFACTURER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getManufacturerName() <em>Manufacturer Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManufacturerName()
	 * @generated
	 * @ordered
	 */
	protected String manufacturerName = MANUFACTURER_NAME_EDEFAULT;

	/**
	 * This is true if the Manufacturer Name attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean manufacturerNameESet;

	/**
	 * The default value of the '{@link #getProductName() <em>Product Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductName()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductName() <em>Product Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductName()
	 * @generated
	 * @ordered
	 */
	protected String productName = PRODUCT_NAME_EDEFAULT;

	/**
	 * This is true if the Product Name attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean productNameESet;

	/**
	 * The default value of the '{@link #getSoftwareVersion() <em>Software Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoftwareVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String SOFTWARE_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSoftwareVersion() <em>Software Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoftwareVersion()
	 * @generated
	 * @ordered
	 */
	protected String softwareVersion = SOFTWARE_VERSION_EDEFAULT;

	/**
	 * This is true if the Software Version attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean softwareVersionESet;

	/**
	 * The default value of the '{@link #getBuildNumber() <em>Build Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuildNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String BUILD_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBuildNumber() <em>Build Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuildNumber()
	 * @generated
	 * @ordered
	 */
	protected String buildNumber = BUILD_NUMBER_EDEFAULT;

	/**
	 * This is true if the Build Number attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean buildNumberESet;

	/**
	 * The default value of the '{@link #getBuildDate() <em>Build Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuildDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar BUILD_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBuildDate() <em>Build Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuildDate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar buildDate = BUILD_DATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BuildInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getBuildInfo();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProductUri() {
		return productUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProductUri(String newProductUri) {
		String oldProductUri = productUri;
		productUri = newProductUri;
		boolean oldProductUriESet = productUriESet;
		productUriESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.BUILD_INFO__PRODUCT_URI, oldProductUri, productUri, !oldProductUriESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetProductUri() {
		String oldProductUri = productUri;
		boolean oldProductUriESet = productUriESet;
		productUri = PRODUCT_URI_EDEFAULT;
		productUriESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.BUILD_INFO__PRODUCT_URI, oldProductUri, PRODUCT_URI_EDEFAULT, oldProductUriESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetProductUri() {
		return productUriESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getManufacturerName() {
		return manufacturerName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setManufacturerName(String newManufacturerName) {
		String oldManufacturerName = manufacturerName;
		manufacturerName = newManufacturerName;
		boolean oldManufacturerNameESet = manufacturerNameESet;
		manufacturerNameESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.BUILD_INFO__MANUFACTURER_NAME, oldManufacturerName, manufacturerName, !oldManufacturerNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetManufacturerName() {
		String oldManufacturerName = manufacturerName;
		boolean oldManufacturerNameESet = manufacturerNameESet;
		manufacturerName = MANUFACTURER_NAME_EDEFAULT;
		manufacturerNameESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.BUILD_INFO__MANUFACTURER_NAME, oldManufacturerName, MANUFACTURER_NAME_EDEFAULT, oldManufacturerNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetManufacturerName() {
		return manufacturerNameESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProductName() {
		return productName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProductName(String newProductName) {
		String oldProductName = productName;
		productName = newProductName;
		boolean oldProductNameESet = productNameESet;
		productNameESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.BUILD_INFO__PRODUCT_NAME, oldProductName, productName, !oldProductNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetProductName() {
		String oldProductName = productName;
		boolean oldProductNameESet = productNameESet;
		productName = PRODUCT_NAME_EDEFAULT;
		productNameESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.BUILD_INFO__PRODUCT_NAME, oldProductName, PRODUCT_NAME_EDEFAULT, oldProductNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetProductName() {
		return productNameESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSoftwareVersion() {
		return softwareVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSoftwareVersion(String newSoftwareVersion) {
		String oldSoftwareVersion = softwareVersion;
		softwareVersion = newSoftwareVersion;
		boolean oldSoftwareVersionESet = softwareVersionESet;
		softwareVersionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.BUILD_INFO__SOFTWARE_VERSION, oldSoftwareVersion, softwareVersion, !oldSoftwareVersionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSoftwareVersion() {
		String oldSoftwareVersion = softwareVersion;
		boolean oldSoftwareVersionESet = softwareVersionESet;
		softwareVersion = SOFTWARE_VERSION_EDEFAULT;
		softwareVersionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.BUILD_INFO__SOFTWARE_VERSION, oldSoftwareVersion, SOFTWARE_VERSION_EDEFAULT, oldSoftwareVersionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSoftwareVersion() {
		return softwareVersionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBuildNumber() {
		return buildNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBuildNumber(String newBuildNumber) {
		String oldBuildNumber = buildNumber;
		buildNumber = newBuildNumber;
		boolean oldBuildNumberESet = buildNumberESet;
		buildNumberESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.BUILD_INFO__BUILD_NUMBER, oldBuildNumber, buildNumber, !oldBuildNumberESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBuildNumber() {
		String oldBuildNumber = buildNumber;
		boolean oldBuildNumberESet = buildNumberESet;
		buildNumber = BUILD_NUMBER_EDEFAULT;
		buildNumberESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.BUILD_INFO__BUILD_NUMBER, oldBuildNumber, BUILD_NUMBER_EDEFAULT, oldBuildNumberESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBuildNumber() {
		return buildNumberESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getBuildDate() {
		return buildDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBuildDate(XMLGregorianCalendar newBuildDate) {
		XMLGregorianCalendar oldBuildDate = buildDate;
		buildDate = newBuildDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.BUILD_INFO__BUILD_DATE, oldBuildDate, buildDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TypesPackage.BUILD_INFO__PRODUCT_URI:
				return getProductUri();
			case TypesPackage.BUILD_INFO__MANUFACTURER_NAME:
				return getManufacturerName();
			case TypesPackage.BUILD_INFO__PRODUCT_NAME:
				return getProductName();
			case TypesPackage.BUILD_INFO__SOFTWARE_VERSION:
				return getSoftwareVersion();
			case TypesPackage.BUILD_INFO__BUILD_NUMBER:
				return getBuildNumber();
			case TypesPackage.BUILD_INFO__BUILD_DATE:
				return getBuildDate();
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
			case TypesPackage.BUILD_INFO__PRODUCT_URI:
				setProductUri((String)newValue);
				return;
			case TypesPackage.BUILD_INFO__MANUFACTURER_NAME:
				setManufacturerName((String)newValue);
				return;
			case TypesPackage.BUILD_INFO__PRODUCT_NAME:
				setProductName((String)newValue);
				return;
			case TypesPackage.BUILD_INFO__SOFTWARE_VERSION:
				setSoftwareVersion((String)newValue);
				return;
			case TypesPackage.BUILD_INFO__BUILD_NUMBER:
				setBuildNumber((String)newValue);
				return;
			case TypesPackage.BUILD_INFO__BUILD_DATE:
				setBuildDate((XMLGregorianCalendar)newValue);
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
			case TypesPackage.BUILD_INFO__PRODUCT_URI:
				unsetProductUri();
				return;
			case TypesPackage.BUILD_INFO__MANUFACTURER_NAME:
				unsetManufacturerName();
				return;
			case TypesPackage.BUILD_INFO__PRODUCT_NAME:
				unsetProductName();
				return;
			case TypesPackage.BUILD_INFO__SOFTWARE_VERSION:
				unsetSoftwareVersion();
				return;
			case TypesPackage.BUILD_INFO__BUILD_NUMBER:
				unsetBuildNumber();
				return;
			case TypesPackage.BUILD_INFO__BUILD_DATE:
				setBuildDate(BUILD_DATE_EDEFAULT);
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
			case TypesPackage.BUILD_INFO__PRODUCT_URI:
				return isSetProductUri();
			case TypesPackage.BUILD_INFO__MANUFACTURER_NAME:
				return isSetManufacturerName();
			case TypesPackage.BUILD_INFO__PRODUCT_NAME:
				return isSetProductName();
			case TypesPackage.BUILD_INFO__SOFTWARE_VERSION:
				return isSetSoftwareVersion();
			case TypesPackage.BUILD_INFO__BUILD_NUMBER:
				return isSetBuildNumber();
			case TypesPackage.BUILD_INFO__BUILD_DATE:
				return BUILD_DATE_EDEFAULT == null ? buildDate != null : !BUILD_DATE_EDEFAULT.equals(buildDate);
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
		result.append(" (productUri: ");
		if (productUriESet) result.append(productUri); else result.append("<unset>");
		result.append(", manufacturerName: ");
		if (manufacturerNameESet) result.append(manufacturerName); else result.append("<unset>");
		result.append(", productName: ");
		if (productNameESet) result.append(productName); else result.append("<unset>");
		result.append(", softwareVersion: ");
		if (softwareVersionESet) result.append(softwareVersion); else result.append("<unset>");
		result.append(", buildNumber: ");
		if (buildNumberESet) result.append(buildNumber); else result.append("<unset>");
		result.append(", buildDate: ");
		result.append(buildDate);
		result.append(')');
		return result.toString();
	}

} //BuildInfoImpl
