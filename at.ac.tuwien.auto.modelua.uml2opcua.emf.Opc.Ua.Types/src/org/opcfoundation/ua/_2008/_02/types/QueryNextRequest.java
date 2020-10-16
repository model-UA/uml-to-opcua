/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Query Next Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.QueryNextRequest#getRequestHeader <em>Request Header</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.QueryNextRequest#isReleaseContinuationPoint <em>Release Continuation Point</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.QueryNextRequest#getContinuationPoint <em>Continuation Point</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getQueryNextRequest()
 * @model extendedMetaData="name='QueryNextRequest' kind='elementOnly'"
 * @generated
 */
public interface QueryNextRequest extends EObject {
	/**
	 * Returns the value of the '<em><b>Request Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Header</em>' containment reference.
	 * @see #isSetRequestHeader()
	 * @see #unsetRequestHeader()
	 * @see #setRequestHeader(RequestHeader)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getQueryNextRequest_RequestHeader()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='RequestHeader' namespace='##targetNamespace'"
	 * @generated
	 */
	RequestHeader getRequestHeader();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.QueryNextRequest#getRequestHeader <em>Request Header</em>}' containment reference.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.QueryNextRequest#getRequestHeader <em>Request Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRequestHeader()
	 * @see #getRequestHeader()
	 * @see #setRequestHeader(RequestHeader)
	 * @generated
	 */
	void unsetRequestHeader();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.QueryNextRequest#getRequestHeader <em>Request Header</em>}' containment reference is set.
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
	 * Returns the value of the '<em><b>Release Continuation Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Release Continuation Point</em>' attribute.
	 * @see #isSetReleaseContinuationPoint()
	 * @see #unsetReleaseContinuationPoint()
	 * @see #setReleaseContinuationPoint(boolean)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getQueryNextRequest_ReleaseContinuationPoint()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='ReleaseContinuationPoint' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isReleaseContinuationPoint();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.QueryNextRequest#isReleaseContinuationPoint <em>Release Continuation Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Release Continuation Point</em>' attribute.
	 * @see #isSetReleaseContinuationPoint()
	 * @see #unsetReleaseContinuationPoint()
	 * @see #isReleaseContinuationPoint()
	 * @generated
	 */
	void setReleaseContinuationPoint(boolean value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.QueryNextRequest#isReleaseContinuationPoint <em>Release Continuation Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReleaseContinuationPoint()
	 * @see #isReleaseContinuationPoint()
	 * @see #setReleaseContinuationPoint(boolean)
	 * @generated
	 */
	void unsetReleaseContinuationPoint();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.QueryNextRequest#isReleaseContinuationPoint <em>Release Continuation Point</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Release Continuation Point</em>' attribute is set.
	 * @see #unsetReleaseContinuationPoint()
	 * @see #isReleaseContinuationPoint()
	 * @see #setReleaseContinuationPoint(boolean)
	 * @generated
	 */
	boolean isSetReleaseContinuationPoint();

	/**
	 * Returns the value of the '<em><b>Continuation Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Continuation Point</em>' attribute.
	 * @see #isSetContinuationPoint()
	 * @see #unsetContinuationPoint()
	 * @see #setContinuationPoint(byte[])
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getQueryNextRequest_ContinuationPoint()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Base64Binary"
	 *        extendedMetaData="kind='element' name='ContinuationPoint' namespace='##targetNamespace'"
	 * @generated
	 */
	byte[] getContinuationPoint();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.QueryNextRequest#getContinuationPoint <em>Continuation Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Continuation Point</em>' attribute.
	 * @see #isSetContinuationPoint()
	 * @see #unsetContinuationPoint()
	 * @see #getContinuationPoint()
	 * @generated
	 */
	void setContinuationPoint(byte[] value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.QueryNextRequest#getContinuationPoint <em>Continuation Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetContinuationPoint()
	 * @see #getContinuationPoint()
	 * @see #setContinuationPoint(byte[])
	 * @generated
	 */
	void unsetContinuationPoint();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.QueryNextRequest#getContinuationPoint <em>Continuation Point</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Continuation Point</em>' attribute is set.
	 * @see #unsetContinuationPoint()
	 * @see #getContinuationPoint()
	 * @see #setContinuationPoint(byte[])
	 * @generated
	 */
	boolean isSetContinuationPoint();

} // QueryNextRequest
