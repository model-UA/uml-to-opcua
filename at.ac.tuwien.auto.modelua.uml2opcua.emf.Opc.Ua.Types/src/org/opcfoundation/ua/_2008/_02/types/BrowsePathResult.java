/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Browse Path Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.BrowsePathResult#getStatusCode <em>Status Code</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.BrowsePathResult#getTargets <em>Targets</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getBrowsePathResult()
 * @model extendedMetaData="name='BrowsePathResult' kind='elementOnly'"
 * @generated
 */
public interface BrowsePathResult extends EObject {
	/**
	 * Returns the value of the '<em><b>Status Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status Code</em>' containment reference.
	 * @see #setStatusCode(StatusCode)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getBrowsePathResult_StatusCode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='StatusCode' namespace='##targetNamespace'"
	 * @generated
	 */
	StatusCode getStatusCode();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.BrowsePathResult#getStatusCode <em>Status Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Code</em>' containment reference.
	 * @see #getStatusCode()
	 * @generated
	 */
	void setStatusCode(StatusCode value);

	/**
	 * Returns the value of the '<em><b>Targets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Targets</em>' containment reference.
	 * @see #isSetTargets()
	 * @see #unsetTargets()
	 * @see #setTargets(ListOfBrowsePathTarget)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getBrowsePathResult_Targets()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='Targets' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfBrowsePathTarget getTargets();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.BrowsePathResult#getTargets <em>Targets</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Targets</em>' containment reference.
	 * @see #isSetTargets()
	 * @see #unsetTargets()
	 * @see #getTargets()
	 * @generated
	 */
	void setTargets(ListOfBrowsePathTarget value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.BrowsePathResult#getTargets <em>Targets</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTargets()
	 * @see #getTargets()
	 * @see #setTargets(ListOfBrowsePathTarget)
	 * @generated
	 */
	void unsetTargets();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.BrowsePathResult#getTargets <em>Targets</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Targets</em>' containment reference is set.
	 * @see #unsetTargets()
	 * @see #getTargets()
	 * @see #setTargets(ListOfBrowsePathTarget)
	 * @generated
	 */
	boolean isSetTargets();

} // BrowsePathResult
