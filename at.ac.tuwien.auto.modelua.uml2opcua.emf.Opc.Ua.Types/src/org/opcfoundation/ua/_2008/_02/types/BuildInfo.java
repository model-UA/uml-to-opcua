/**
 */
package org.opcfoundation.ua._2008._02.types;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Build Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.BuildInfo#getProductUri <em>Product Uri</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.BuildInfo#getManufacturerName <em>Manufacturer Name</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.BuildInfo#getProductName <em>Product Name</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.BuildInfo#getSoftwareVersion <em>Software Version</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.BuildInfo#getBuildNumber <em>Build Number</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.BuildInfo#getBuildDate <em>Build Date</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getBuildInfo()
 * @model extendedMetaData="name='BuildInfo' kind='elementOnly'"
 * @generated
 */
public interface BuildInfo extends EObject {
	/**
	 * Returns the value of the '<em><b>Product Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Uri</em>' attribute.
	 * @see #isSetProductUri()
	 * @see #unsetProductUri()
	 * @see #setProductUri(String)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getBuildInfo_ProductUri()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='ProductUri' namespace='##targetNamespace'"
	 * @generated
	 */
	String getProductUri();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.BuildInfo#getProductUri <em>Product Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Uri</em>' attribute.
	 * @see #isSetProductUri()
	 * @see #unsetProductUri()
	 * @see #getProductUri()
	 * @generated
	 */
	void setProductUri(String value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.BuildInfo#getProductUri <em>Product Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetProductUri()
	 * @see #getProductUri()
	 * @see #setProductUri(String)
	 * @generated
	 */
	void unsetProductUri();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.BuildInfo#getProductUri <em>Product Uri</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Product Uri</em>' attribute is set.
	 * @see #unsetProductUri()
	 * @see #getProductUri()
	 * @see #setProductUri(String)
	 * @generated
	 */
	boolean isSetProductUri();

	/**
	 * Returns the value of the '<em><b>Manufacturer Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manufacturer Name</em>' attribute.
	 * @see #isSetManufacturerName()
	 * @see #unsetManufacturerName()
	 * @see #setManufacturerName(String)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getBuildInfo_ManufacturerName()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='ManufacturerName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getManufacturerName();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.BuildInfo#getManufacturerName <em>Manufacturer Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manufacturer Name</em>' attribute.
	 * @see #isSetManufacturerName()
	 * @see #unsetManufacturerName()
	 * @see #getManufacturerName()
	 * @generated
	 */
	void setManufacturerName(String value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.BuildInfo#getManufacturerName <em>Manufacturer Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetManufacturerName()
	 * @see #getManufacturerName()
	 * @see #setManufacturerName(String)
	 * @generated
	 */
	void unsetManufacturerName();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.BuildInfo#getManufacturerName <em>Manufacturer Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Manufacturer Name</em>' attribute is set.
	 * @see #unsetManufacturerName()
	 * @see #getManufacturerName()
	 * @see #setManufacturerName(String)
	 * @generated
	 */
	boolean isSetManufacturerName();

	/**
	 * Returns the value of the '<em><b>Product Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Name</em>' attribute.
	 * @see #isSetProductName()
	 * @see #unsetProductName()
	 * @see #setProductName(String)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getBuildInfo_ProductName()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='ProductName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getProductName();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.BuildInfo#getProductName <em>Product Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Name</em>' attribute.
	 * @see #isSetProductName()
	 * @see #unsetProductName()
	 * @see #getProductName()
	 * @generated
	 */
	void setProductName(String value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.BuildInfo#getProductName <em>Product Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetProductName()
	 * @see #getProductName()
	 * @see #setProductName(String)
	 * @generated
	 */
	void unsetProductName();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.BuildInfo#getProductName <em>Product Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Product Name</em>' attribute is set.
	 * @see #unsetProductName()
	 * @see #getProductName()
	 * @see #setProductName(String)
	 * @generated
	 */
	boolean isSetProductName();

	/**
	 * Returns the value of the '<em><b>Software Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Software Version</em>' attribute.
	 * @see #isSetSoftwareVersion()
	 * @see #unsetSoftwareVersion()
	 * @see #setSoftwareVersion(String)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getBuildInfo_SoftwareVersion()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='SoftwareVersion' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSoftwareVersion();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.BuildInfo#getSoftwareVersion <em>Software Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Software Version</em>' attribute.
	 * @see #isSetSoftwareVersion()
	 * @see #unsetSoftwareVersion()
	 * @see #getSoftwareVersion()
	 * @generated
	 */
	void setSoftwareVersion(String value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.BuildInfo#getSoftwareVersion <em>Software Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSoftwareVersion()
	 * @see #getSoftwareVersion()
	 * @see #setSoftwareVersion(String)
	 * @generated
	 */
	void unsetSoftwareVersion();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.BuildInfo#getSoftwareVersion <em>Software Version</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Software Version</em>' attribute is set.
	 * @see #unsetSoftwareVersion()
	 * @see #getSoftwareVersion()
	 * @see #setSoftwareVersion(String)
	 * @generated
	 */
	boolean isSetSoftwareVersion();

	/**
	 * Returns the value of the '<em><b>Build Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Build Number</em>' attribute.
	 * @see #isSetBuildNumber()
	 * @see #unsetBuildNumber()
	 * @see #setBuildNumber(String)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getBuildInfo_BuildNumber()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='BuildNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	String getBuildNumber();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.BuildInfo#getBuildNumber <em>Build Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Build Number</em>' attribute.
	 * @see #isSetBuildNumber()
	 * @see #unsetBuildNumber()
	 * @see #getBuildNumber()
	 * @generated
	 */
	void setBuildNumber(String value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.BuildInfo#getBuildNumber <em>Build Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBuildNumber()
	 * @see #getBuildNumber()
	 * @see #setBuildNumber(String)
	 * @generated
	 */
	void unsetBuildNumber();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.BuildInfo#getBuildNumber <em>Build Number</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Build Number</em>' attribute is set.
	 * @see #unsetBuildNumber()
	 * @see #getBuildNumber()
	 * @see #setBuildNumber(String)
	 * @generated
	 */
	boolean isSetBuildNumber();

	/**
	 * Returns the value of the '<em><b>Build Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Build Date</em>' attribute.
	 * @see #setBuildDate(XMLGregorianCalendar)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getBuildInfo_BuildDate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='BuildDate' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getBuildDate();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.BuildInfo#getBuildDate <em>Build Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Build Date</em>' attribute.
	 * @see #getBuildDate()
	 * @generated
	 */
	void setBuildDate(XMLGregorianCalendar value);

} // BuildInfo
