/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration Version Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ConfigurationVersionDataType#getMajorVersion <em>Major Version</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ConfigurationVersionDataType#getMinorVersion <em>Minor Version</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getConfigurationVersionDataType()
 * @model extendedMetaData="name='ConfigurationVersionDataType' kind='elementOnly'"
 * @generated
 */
public interface ConfigurationVersionDataType extends EObject {
	/**
	 * Returns the value of the '<em><b>Major Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Major Version</em>' attribute.
	 * @see #isSetMajorVersion()
	 * @see #unsetMajorVersion()
	 * @see #setMajorVersion(long)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getConfigurationVersionDataType_MajorVersion()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='element' name='MajorVersion' namespace='##targetNamespace'"
	 * @generated
	 */
	long getMajorVersion();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.ConfigurationVersionDataType#getMajorVersion <em>Major Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Major Version</em>' attribute.
	 * @see #isSetMajorVersion()
	 * @see #unsetMajorVersion()
	 * @see #getMajorVersion()
	 * @generated
	 */
	void setMajorVersion(long value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.ConfigurationVersionDataType#getMajorVersion <em>Major Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMajorVersion()
	 * @see #getMajorVersion()
	 * @see #setMajorVersion(long)
	 * @generated
	 */
	void unsetMajorVersion();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.ConfigurationVersionDataType#getMajorVersion <em>Major Version</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Major Version</em>' attribute is set.
	 * @see #unsetMajorVersion()
	 * @see #getMajorVersion()
	 * @see #setMajorVersion(long)
	 * @generated
	 */
	boolean isSetMajorVersion();

	/**
	 * Returns the value of the '<em><b>Minor Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minor Version</em>' attribute.
	 * @see #isSetMinorVersion()
	 * @see #unsetMinorVersion()
	 * @see #setMinorVersion(long)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getConfigurationVersionDataType_MinorVersion()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='element' name='MinorVersion' namespace='##targetNamespace'"
	 * @generated
	 */
	long getMinorVersion();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.ConfigurationVersionDataType#getMinorVersion <em>Minor Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minor Version</em>' attribute.
	 * @see #isSetMinorVersion()
	 * @see #unsetMinorVersion()
	 * @see #getMinorVersion()
	 * @generated
	 */
	void setMinorVersion(long value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.ConfigurationVersionDataType#getMinorVersion <em>Minor Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMinorVersion()
	 * @see #getMinorVersion()
	 * @see #setMinorVersion(long)
	 * @generated
	 */
	void unsetMinorVersion();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.ConfigurationVersionDataType#getMinorVersion <em>Minor Version</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Minor Version</em>' attribute is set.
	 * @see #unsetMinorVersion()
	 * @see #getMinorVersion()
	 * @see #setMinorVersion(long)
	 * @generated
	 */
	boolean isSetMinorVersion();

} // ConfigurationVersionDataType
