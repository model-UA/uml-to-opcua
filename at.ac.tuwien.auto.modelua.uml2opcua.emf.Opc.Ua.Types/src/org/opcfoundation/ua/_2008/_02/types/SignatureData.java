/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signature Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.SignatureData#getAlgorithm <em>Algorithm</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.SignatureData#getSignature <em>Signature</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getSignatureData()
 * @model extendedMetaData="name='SignatureData' kind='elementOnly'"
 * @generated
 */
public interface SignatureData extends EObject {
	/**
	 * Returns the value of the '<em><b>Algorithm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Algorithm</em>' attribute.
	 * @see #isSetAlgorithm()
	 * @see #unsetAlgorithm()
	 * @see #setAlgorithm(String)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getSignatureData_Algorithm()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Algorithm' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAlgorithm();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.SignatureData#getAlgorithm <em>Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Algorithm</em>' attribute.
	 * @see #isSetAlgorithm()
	 * @see #unsetAlgorithm()
	 * @see #getAlgorithm()
	 * @generated
	 */
	void setAlgorithm(String value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.SignatureData#getAlgorithm <em>Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAlgorithm()
	 * @see #getAlgorithm()
	 * @see #setAlgorithm(String)
	 * @generated
	 */
	void unsetAlgorithm();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.SignatureData#getAlgorithm <em>Algorithm</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Algorithm</em>' attribute is set.
	 * @see #unsetAlgorithm()
	 * @see #getAlgorithm()
	 * @see #setAlgorithm(String)
	 * @generated
	 */
	boolean isSetAlgorithm();

	/**
	 * Returns the value of the '<em><b>Signature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signature</em>' attribute.
	 * @see #isSetSignature()
	 * @see #unsetSignature()
	 * @see #setSignature(byte[])
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getSignatureData_Signature()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Base64Binary"
	 *        extendedMetaData="kind='element' name='Signature' namespace='##targetNamespace'"
	 * @generated
	 */
	byte[] getSignature();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.SignatureData#getSignature <em>Signature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signature</em>' attribute.
	 * @see #isSetSignature()
	 * @see #unsetSignature()
	 * @see #getSignature()
	 * @generated
	 */
	void setSignature(byte[] value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.SignatureData#getSignature <em>Signature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSignature()
	 * @see #getSignature()
	 * @see #setSignature(byte[])
	 * @generated
	 */
	void unsetSignature();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.SignatureData#getSignature <em>Signature</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Signature</em>' attribute is set.
	 * @see #unsetSignature()
	 * @see #getSignature()
	 * @see #setSignature(byte[])
	 * @generated
	 */
	boolean isSetSignature();

} // SignatureData
