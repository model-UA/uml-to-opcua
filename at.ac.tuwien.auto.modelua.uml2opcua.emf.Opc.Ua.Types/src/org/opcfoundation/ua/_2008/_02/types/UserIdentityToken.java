/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User Identity Token</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.UserIdentityToken#getPolicyId <em>Policy Id</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getUserIdentityToken()
 * @model extendedMetaData="name='UserIdentityToken' kind='elementOnly'"
 * @generated
 */
public interface UserIdentityToken extends EObject {
	/**
	 * Returns the value of the '<em><b>Policy Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Policy Id</em>' attribute.
	 * @see #isSetPolicyId()
	 * @see #unsetPolicyId()
	 * @see #setPolicyId(String)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getUserIdentityToken_PolicyId()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='PolicyId' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPolicyId();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.UserIdentityToken#getPolicyId <em>Policy Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Policy Id</em>' attribute.
	 * @see #isSetPolicyId()
	 * @see #unsetPolicyId()
	 * @see #getPolicyId()
	 * @generated
	 */
	void setPolicyId(String value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.UserIdentityToken#getPolicyId <em>Policy Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPolicyId()
	 * @see #getPolicyId()
	 * @see #setPolicyId(String)
	 * @generated
	 */
	void unsetPolicyId();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.UserIdentityToken#getPolicyId <em>Policy Id</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Policy Id</em>' attribute is set.
	 * @see #unsetPolicyId()
	 * @see #getPolicyId()
	 * @see #setPolicyId(String)
	 * @generated
	 */
	boolean isSetPolicyId();

} // UserIdentityToken
