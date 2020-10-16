/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Add References Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.AddReferencesRequest#getRequestHeader <em>Request Header</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.AddReferencesRequest#getReferencesToAdd <em>References To Add</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getAddReferencesRequest()
 * @model extendedMetaData="name='AddReferencesRequest' kind='elementOnly'"
 * @generated
 */
public interface AddReferencesRequest extends EObject {
	/**
	 * Returns the value of the '<em><b>Request Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Header</em>' containment reference.
	 * @see #isSetRequestHeader()
	 * @see #unsetRequestHeader()
	 * @see #setRequestHeader(RequestHeader)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getAddReferencesRequest_RequestHeader()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='RequestHeader' namespace='##targetNamespace'"
	 * @generated
	 */
	RequestHeader getRequestHeader();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.AddReferencesRequest#getRequestHeader <em>Request Header</em>}' containment reference.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.AddReferencesRequest#getRequestHeader <em>Request Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRequestHeader()
	 * @see #getRequestHeader()
	 * @see #setRequestHeader(RequestHeader)
	 * @generated
	 */
	void unsetRequestHeader();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.AddReferencesRequest#getRequestHeader <em>Request Header</em>}' containment reference is set.
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
	 * Returns the value of the '<em><b>References To Add</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>References To Add</em>' containment reference.
	 * @see #isSetReferencesToAdd()
	 * @see #unsetReferencesToAdd()
	 * @see #setReferencesToAdd(ListOfAddReferencesItem)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getAddReferencesRequest_ReferencesToAdd()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='ReferencesToAdd' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfAddReferencesItem getReferencesToAdd();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.AddReferencesRequest#getReferencesToAdd <em>References To Add</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>References To Add</em>' containment reference.
	 * @see #isSetReferencesToAdd()
	 * @see #unsetReferencesToAdd()
	 * @see #getReferencesToAdd()
	 * @generated
	 */
	void setReferencesToAdd(ListOfAddReferencesItem value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.AddReferencesRequest#getReferencesToAdd <em>References To Add</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReferencesToAdd()
	 * @see #getReferencesToAdd()
	 * @see #setReferencesToAdd(ListOfAddReferencesItem)
	 * @generated
	 */
	void unsetReferencesToAdd();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.AddReferencesRequest#getReferencesToAdd <em>References To Add</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>References To Add</em>' containment reference is set.
	 * @see #unsetReferencesToAdd()
	 * @see #getReferencesToAdd()
	 * @see #setReferencesToAdd(ListOfAddReferencesItem)
	 * @generated
	 */
	boolean isSetReferencesToAdd();

} // AddReferencesRequest
