/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>History Update Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.HistoryUpdateRequest#getRequestHeader <em>Request Header</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.HistoryUpdateRequest#getHistoryUpdateDetails <em>History Update Details</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getHistoryUpdateRequest()
 * @model extendedMetaData="name='HistoryUpdateRequest' kind='elementOnly'"
 * @generated
 */
public interface HistoryUpdateRequest extends EObject {
	/**
	 * Returns the value of the '<em><b>Request Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Header</em>' containment reference.
	 * @see #isSetRequestHeader()
	 * @see #unsetRequestHeader()
	 * @see #setRequestHeader(RequestHeader)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getHistoryUpdateRequest_RequestHeader()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='RequestHeader' namespace='##targetNamespace'"
	 * @generated
	 */
	RequestHeader getRequestHeader();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.HistoryUpdateRequest#getRequestHeader <em>Request Header</em>}' containment reference.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.HistoryUpdateRequest#getRequestHeader <em>Request Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRequestHeader()
	 * @see #getRequestHeader()
	 * @see #setRequestHeader(RequestHeader)
	 * @generated
	 */
	void unsetRequestHeader();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.HistoryUpdateRequest#getRequestHeader <em>Request Header</em>}' containment reference is set.
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
	 * Returns the value of the '<em><b>History Update Details</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>History Update Details</em>' containment reference.
	 * @see #isSetHistoryUpdateDetails()
	 * @see #unsetHistoryUpdateDetails()
	 * @see #setHistoryUpdateDetails(ListOfExtensionObject)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getHistoryUpdateRequest_HistoryUpdateDetails()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='HistoryUpdateDetails' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfExtensionObject getHistoryUpdateDetails();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.HistoryUpdateRequest#getHistoryUpdateDetails <em>History Update Details</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>History Update Details</em>' containment reference.
	 * @see #isSetHistoryUpdateDetails()
	 * @see #unsetHistoryUpdateDetails()
	 * @see #getHistoryUpdateDetails()
	 * @generated
	 */
	void setHistoryUpdateDetails(ListOfExtensionObject value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.HistoryUpdateRequest#getHistoryUpdateDetails <em>History Update Details</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHistoryUpdateDetails()
	 * @see #getHistoryUpdateDetails()
	 * @see #setHistoryUpdateDetails(ListOfExtensionObject)
	 * @generated
	 */
	void unsetHistoryUpdateDetails();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.HistoryUpdateRequest#getHistoryUpdateDetails <em>History Update Details</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>History Update Details</em>' containment reference is set.
	 * @see #unsetHistoryUpdateDetails()
	 * @see #getHistoryUpdateDetails()
	 * @see #setHistoryUpdateDetails(ListOfExtensionObject)
	 * @generated
	 */
	boolean isSetHistoryUpdateDetails();

} // HistoryUpdateRequest
