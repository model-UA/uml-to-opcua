/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Guid</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.Guid#getString <em>String</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getGuid()
 * @model extendedMetaData="name='Guid' kind='elementOnly'"
 * @generated
 */
public interface Guid extends EObject {
	/**
	 * Returns the value of the '<em><b>String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>String</em>' attribute.
	 * @see #isSetString()
	 * @see #unsetString()
	 * @see #setString(String)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getGuid_String()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='String' namespace='##targetNamespace'"
	 * @generated
	 */
	String getString();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.Guid#getString <em>String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>String</em>' attribute.
	 * @see #isSetString()
	 * @see #unsetString()
	 * @see #getString()
	 * @generated
	 */
	void setString(String value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.Guid#getString <em>String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetString()
	 * @see #getString()
	 * @see #setString(String)
	 * @generated
	 */
	void unsetString();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.Guid#getString <em>String</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>String</em>' attribute is set.
	 * @see #unsetString()
	 * @see #getString()
	 * @see #setString(String)
	 * @generated
	 */
	boolean isSetString();

} // Guid
