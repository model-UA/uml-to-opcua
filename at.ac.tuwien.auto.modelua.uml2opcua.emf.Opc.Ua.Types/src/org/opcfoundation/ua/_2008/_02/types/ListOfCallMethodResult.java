/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Call Method Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfCallMethodResult#getCallMethodResult <em>Call Method Result</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfCallMethodResult()
 * @model extendedMetaData="name='ListOfCallMethodResult' kind='elementOnly'"
 * @generated
 */
public interface ListOfCallMethodResult extends EObject {
	/**
	 * Returns the value of the '<em><b>Call Method Result</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2008._02.types.CallMethodResult}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Call Method Result</em>' containment reference list.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfCallMethodResult_CallMethodResult()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CallMethodResult' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CallMethodResult> getCallMethodResult();

} // ListOfCallMethodResult
