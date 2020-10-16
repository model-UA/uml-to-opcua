/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Call Method Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfCallMethodRequest#getCallMethodRequest <em>Call Method Request</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfCallMethodRequest()
 * @model extendedMetaData="name='ListOfCallMethodRequest' kind='elementOnly'"
 * @generated
 */
public interface ListOfCallMethodRequest extends EObject {
	/**
	 * Returns the value of the '<em><b>Call Method Request</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2008._02.types.CallMethodRequest}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Call Method Request</em>' containment reference list.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfCallMethodRequest_CallMethodRequest()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CallMethodRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CallMethodRequest> getCallMethodRequest();

} // ListOfCallMethodRequest
