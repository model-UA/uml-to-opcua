/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.CallRequest#getRequestHeader <em>Request Header</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.CallRequest#getMethodsToCall <em>Methods To Call</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getCallRequest()
 * @model extendedMetaData="name='CallRequest' kind='elementOnly'"
 * @generated
 */
public interface CallRequest extends EObject {
	/**
	 * Returns the value of the '<em><b>Request Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Header</em>' containment reference.
	 * @see #isSetRequestHeader()
	 * @see #unsetRequestHeader()
	 * @see #setRequestHeader(RequestHeader)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getCallRequest_RequestHeader()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='RequestHeader' namespace='##targetNamespace'"
	 * @generated
	 */
	RequestHeader getRequestHeader();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.CallRequest#getRequestHeader <em>Request Header</em>}' containment reference.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.CallRequest#getRequestHeader <em>Request Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRequestHeader()
	 * @see #getRequestHeader()
	 * @see #setRequestHeader(RequestHeader)
	 * @generated
	 */
	void unsetRequestHeader();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.CallRequest#getRequestHeader <em>Request Header</em>}' containment reference is set.
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
	 * Returns the value of the '<em><b>Methods To Call</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Methods To Call</em>' containment reference.
	 * @see #isSetMethodsToCall()
	 * @see #unsetMethodsToCall()
	 * @see #setMethodsToCall(ListOfCallMethodRequest)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getCallRequest_MethodsToCall()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='MethodsToCall' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfCallMethodRequest getMethodsToCall();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.CallRequest#getMethodsToCall <em>Methods To Call</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Methods To Call</em>' containment reference.
	 * @see #isSetMethodsToCall()
	 * @see #unsetMethodsToCall()
	 * @see #getMethodsToCall()
	 * @generated
	 */
	void setMethodsToCall(ListOfCallMethodRequest value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.CallRequest#getMethodsToCall <em>Methods To Call</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMethodsToCall()
	 * @see #getMethodsToCall()
	 * @see #setMethodsToCall(ListOfCallMethodRequest)
	 * @generated
	 */
	void unsetMethodsToCall();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.CallRequest#getMethodsToCall <em>Methods To Call</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Methods To Call</em>' containment reference is set.
	 * @see #unsetMethodsToCall()
	 * @see #getMethodsToCall()
	 * @see #setMethodsToCall(ListOfCallMethodRequest)
	 * @generated
	 */
	boolean isSetMethodsToCall();

} // CallRequest
