/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Status Code</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.StatusCode#getCode <em>Code</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getStatusCode()
 * @model extendedMetaData="name='StatusCode' kind='elementOnly'"
 * @generated
 */
public interface StatusCode extends EObject {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #isSetCode()
	 * @see #unsetCode()
	 * @see #setCode(long)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getStatusCode_Code()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='element' name='Code' namespace='##targetNamespace'"
	 * @generated
	 */
	long getCode();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.StatusCode#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #isSetCode()
	 * @see #unsetCode()
	 * @see #getCode()
	 * @generated
	 */
	void setCode(long value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.StatusCode#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCode()
	 * @see #getCode()
	 * @see #setCode(long)
	 * @generated
	 */
	void unsetCode();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.StatusCode#getCode <em>Code</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Code</em>' attribute is set.
	 * @see #unsetCode()
	 * @see #getCode()
	 * @see #setCode(long)
	 * @generated
	 */
	boolean isSetCode();

} // StatusCode
