/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delete References Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DeleteReferencesRequest#getRequestHeader <em>Request Header</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DeleteReferencesRequest#getReferencesToDelete <em>References To Delete</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDeleteReferencesRequest()
 * @model extendedMetaData="name='DeleteReferencesRequest' kind='elementOnly'"
 * @generated
 */
public interface DeleteReferencesRequest extends EObject {
	/**
	 * Returns the value of the '<em><b>Request Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Header</em>' containment reference.
	 * @see #isSetRequestHeader()
	 * @see #unsetRequestHeader()
	 * @see #setRequestHeader(RequestHeader)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDeleteReferencesRequest_RequestHeader()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='RequestHeader' namespace='##targetNamespace'"
	 * @generated
	 */
	RequestHeader getRequestHeader();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DeleteReferencesRequest#getRequestHeader <em>Request Header</em>}' containment reference.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.DeleteReferencesRequest#getRequestHeader <em>Request Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRequestHeader()
	 * @see #getRequestHeader()
	 * @see #setRequestHeader(RequestHeader)
	 * @generated
	 */
	void unsetRequestHeader();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.DeleteReferencesRequest#getRequestHeader <em>Request Header</em>}' containment reference is set.
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
	 * Returns the value of the '<em><b>References To Delete</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>References To Delete</em>' containment reference.
	 * @see #isSetReferencesToDelete()
	 * @see #unsetReferencesToDelete()
	 * @see #setReferencesToDelete(ListOfDeleteReferencesItem)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDeleteReferencesRequest_ReferencesToDelete()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='ReferencesToDelete' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfDeleteReferencesItem getReferencesToDelete();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DeleteReferencesRequest#getReferencesToDelete <em>References To Delete</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>References To Delete</em>' containment reference.
	 * @see #isSetReferencesToDelete()
	 * @see #unsetReferencesToDelete()
	 * @see #getReferencesToDelete()
	 * @generated
	 */
	void setReferencesToDelete(ListOfDeleteReferencesItem value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.DeleteReferencesRequest#getReferencesToDelete <em>References To Delete</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReferencesToDelete()
	 * @see #getReferencesToDelete()
	 * @see #setReferencesToDelete(ListOfDeleteReferencesItem)
	 * @generated
	 */
	void unsetReferencesToDelete();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.DeleteReferencesRequest#getReferencesToDelete <em>References To Delete</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>References To Delete</em>' containment reference is set.
	 * @see #unsetReferencesToDelete()
	 * @see #getReferencesToDelete()
	 * @see #setReferencesToDelete(ListOfDeleteReferencesItem)
	 * @generated
	 */
	boolean isSetReferencesToDelete();

} // DeleteReferencesRequest
