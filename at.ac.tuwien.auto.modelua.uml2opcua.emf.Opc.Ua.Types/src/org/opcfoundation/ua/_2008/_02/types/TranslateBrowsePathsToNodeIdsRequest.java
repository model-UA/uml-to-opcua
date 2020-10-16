/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Translate Browse Paths To Node Ids Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.TranslateBrowsePathsToNodeIdsRequest#getRequestHeader <em>Request Header</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.TranslateBrowsePathsToNodeIdsRequest#getBrowsePaths <em>Browse Paths</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getTranslateBrowsePathsToNodeIdsRequest()
 * @model extendedMetaData="name='TranslateBrowsePathsToNodeIdsRequest' kind='elementOnly'"
 * @generated
 */
public interface TranslateBrowsePathsToNodeIdsRequest extends EObject {
	/**
	 * Returns the value of the '<em><b>Request Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Header</em>' containment reference.
	 * @see #isSetRequestHeader()
	 * @see #unsetRequestHeader()
	 * @see #setRequestHeader(RequestHeader)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getTranslateBrowsePathsToNodeIdsRequest_RequestHeader()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='RequestHeader' namespace='##targetNamespace'"
	 * @generated
	 */
	RequestHeader getRequestHeader();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.TranslateBrowsePathsToNodeIdsRequest#getRequestHeader <em>Request Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request Header</em>' containment reference.
	 * @see #isSetRequestHeader()
	 * @see #unsetRequestHeader()
	 * @see #getRequestHeader()
	 * @generated
	 */
	void setRequestHeader(RequestHeader value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.TranslateBrowsePathsToNodeIdsRequest#getRequestHeader <em>Request Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRequestHeader()
	 * @see #getRequestHeader()
	 * @see #setRequestHeader(RequestHeader)
	 * @generated
	 */
	void unsetRequestHeader();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.TranslateBrowsePathsToNodeIdsRequest#getRequestHeader <em>Request Header</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Request Header</em>' containment reference is set.
	 * @see #unsetRequestHeader()
	 * @see #getRequestHeader()
	 * @see #setRequestHeader(RequestHeader)
	 * @generated
	 */
	boolean isSetRequestHeader();

	/**
	 * Returns the value of the '<em><b>Browse Paths</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Browse Paths</em>' containment reference.
	 * @see #isSetBrowsePaths()
	 * @see #unsetBrowsePaths()
	 * @see #setBrowsePaths(ListOfBrowsePath)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getTranslateBrowsePathsToNodeIdsRequest_BrowsePaths()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='BrowsePaths' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfBrowsePath getBrowsePaths();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.TranslateBrowsePathsToNodeIdsRequest#getBrowsePaths <em>Browse Paths</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Browse Paths</em>' containment reference.
	 * @see #isSetBrowsePaths()
	 * @see #unsetBrowsePaths()
	 * @see #getBrowsePaths()
	 * @generated
	 */
	void setBrowsePaths(ListOfBrowsePath value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.TranslateBrowsePathsToNodeIdsRequest#getBrowsePaths <em>Browse Paths</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBrowsePaths()
	 * @see #getBrowsePaths()
	 * @see #setBrowsePaths(ListOfBrowsePath)
	 * @generated
	 */
	void unsetBrowsePaths();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.TranslateBrowsePathsToNodeIdsRequest#getBrowsePaths <em>Browse Paths</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Browse Paths</em>' containment reference is set.
	 * @see #unsetBrowsePaths()
	 * @see #getBrowsePaths()
	 * @see #setBrowsePaths(ListOfBrowsePath)
	 * @generated
	 */
	boolean isSetBrowsePaths();

} // TranslateBrowsePathsToNodeIdsRequest
