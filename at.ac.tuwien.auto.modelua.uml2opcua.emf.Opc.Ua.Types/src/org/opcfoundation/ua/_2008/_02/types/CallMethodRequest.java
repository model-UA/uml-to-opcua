/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call Method Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.CallMethodRequest#getObjectId <em>Object Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.CallMethodRequest#getMethodId <em>Method Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.CallMethodRequest#getInputArguments <em>Input Arguments</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getCallMethodRequest()
 * @model extendedMetaData="name='CallMethodRequest' kind='elementOnly'"
 * @generated
 */
public interface CallMethodRequest extends EObject {
	/**
	 * Returns the value of the '<em><b>Object Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Id</em>' containment reference.
	 * @see #isSetObjectId()
	 * @see #unsetObjectId()
	 * @see #setObjectId(NodeId)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getCallMethodRequest_ObjectId()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='ObjectId' namespace='##targetNamespace'"
	 * @generated
	 */
	NodeId getObjectId();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.CallMethodRequest#getObjectId <em>Object Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Id</em>' containment reference.
	 * @see #isSetObjectId()
	 * @see #unsetObjectId()
	 * @see #getObjectId()
	 * @generated
	 */
	void setObjectId(NodeId value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.CallMethodRequest#getObjectId <em>Object Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetObjectId()
	 * @see #getObjectId()
	 * @see #setObjectId(NodeId)
	 * @generated
	 */
	void unsetObjectId();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.CallMethodRequest#getObjectId <em>Object Id</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Object Id</em>' containment reference is set.
	 * @see #unsetObjectId()
	 * @see #getObjectId()
	 * @see #setObjectId(NodeId)
	 * @generated
	 */
	boolean isSetObjectId();

	/**
	 * Returns the value of the '<em><b>Method Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method Id</em>' containment reference.
	 * @see #isSetMethodId()
	 * @see #unsetMethodId()
	 * @see #setMethodId(NodeId)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getCallMethodRequest_MethodId()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='MethodId' namespace='##targetNamespace'"
	 * @generated
	 */
	NodeId getMethodId();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.CallMethodRequest#getMethodId <em>Method Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method Id</em>' containment reference.
	 * @see #isSetMethodId()
	 * @see #unsetMethodId()
	 * @see #getMethodId()
	 * @generated
	 */
	void setMethodId(NodeId value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.CallMethodRequest#getMethodId <em>Method Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMethodId()
	 * @see #getMethodId()
	 * @see #setMethodId(NodeId)
	 * @generated
	 */
	void unsetMethodId();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.CallMethodRequest#getMethodId <em>Method Id</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Method Id</em>' containment reference is set.
	 * @see #unsetMethodId()
	 * @see #getMethodId()
	 * @see #setMethodId(NodeId)
	 * @generated
	 */
	boolean isSetMethodId();

	/**
	 * Returns the value of the '<em><b>Input Arguments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Arguments</em>' containment reference.
	 * @see #isSetInputArguments()
	 * @see #unsetInputArguments()
	 * @see #setInputArguments(ListOfVariant)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getCallMethodRequest_InputArguments()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='InputArguments' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfVariant getInputArguments();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.CallMethodRequest#getInputArguments <em>Input Arguments</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Arguments</em>' containment reference.
	 * @see #isSetInputArguments()
	 * @see #unsetInputArguments()
	 * @see #getInputArguments()
	 * @generated
	 */
	void setInputArguments(ListOfVariant value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.CallMethodRequest#getInputArguments <em>Input Arguments</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInputArguments()
	 * @see #getInputArguments()
	 * @see #setInputArguments(ListOfVariant)
	 * @generated
	 */
	void unsetInputArguments();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.CallMethodRequest#getInputArguments <em>Input Arguments</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Input Arguments</em>' containment reference is set.
	 * @see #unsetInputArguments()
	 * @see #getInputArguments()
	 * @see #setInputArguments(ListOfVariant)
	 * @generated
	 */
	boolean isSetInputArguments();

} // CallMethodRequest
