/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Browse Next Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.BrowseNextRequest#getRequestHeader <em>Request Header</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.BrowseNextRequest#isReleaseContinuationPoints <em>Release Continuation Points</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.BrowseNextRequest#getContinuationPoints <em>Continuation Points</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getBrowseNextRequest()
 * @model extendedMetaData="name='BrowseNextRequest' kind='elementOnly'"
 * @generated
 */
public interface BrowseNextRequest extends EObject {
	/**
	 * Returns the value of the '<em><b>Request Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Header</em>' containment reference.
	 * @see #isSetRequestHeader()
	 * @see #unsetRequestHeader()
	 * @see #setRequestHeader(RequestHeader)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getBrowseNextRequest_RequestHeader()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='RequestHeader' namespace='##targetNamespace'"
	 * @generated
	 */
	RequestHeader getRequestHeader();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.BrowseNextRequest#getRequestHeader <em>Request Header</em>}' containment reference.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.BrowseNextRequest#getRequestHeader <em>Request Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRequestHeader()
	 * @see #getRequestHeader()
	 * @see #setRequestHeader(RequestHeader)
	 * @generated
	 */
	void unsetRequestHeader();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.BrowseNextRequest#getRequestHeader <em>Request Header</em>}' containment reference is set.
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
	 * Returns the value of the '<em><b>Release Continuation Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Release Continuation Points</em>' attribute.
	 * @see #isSetReleaseContinuationPoints()
	 * @see #unsetReleaseContinuationPoints()
	 * @see #setReleaseContinuationPoints(boolean)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getBrowseNextRequest_ReleaseContinuationPoints()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='ReleaseContinuationPoints' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isReleaseContinuationPoints();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.BrowseNextRequest#isReleaseContinuationPoints <em>Release Continuation Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Release Continuation Points</em>' attribute.
	 * @see #isSetReleaseContinuationPoints()
	 * @see #unsetReleaseContinuationPoints()
	 * @see #isReleaseContinuationPoints()
	 * @generated
	 */
	void setReleaseContinuationPoints(boolean value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.BrowseNextRequest#isReleaseContinuationPoints <em>Release Continuation Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReleaseContinuationPoints()
	 * @see #isReleaseContinuationPoints()
	 * @see #setReleaseContinuationPoints(boolean)
	 * @generated
	 */
	void unsetReleaseContinuationPoints();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.BrowseNextRequest#isReleaseContinuationPoints <em>Release Continuation Points</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Release Continuation Points</em>' attribute is set.
	 * @see #unsetReleaseContinuationPoints()
	 * @see #isReleaseContinuationPoints()
	 * @see #setReleaseContinuationPoints(boolean)
	 * @generated
	 */
	boolean isSetReleaseContinuationPoints();

	/**
	 * Returns the value of the '<em><b>Continuation Points</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Continuation Points</em>' containment reference.
	 * @see #isSetContinuationPoints()
	 * @see #unsetContinuationPoints()
	 * @see #setContinuationPoints(ListOfByteString)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getBrowseNextRequest_ContinuationPoints()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='ContinuationPoints' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfByteString getContinuationPoints();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.BrowseNextRequest#getContinuationPoints <em>Continuation Points</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Continuation Points</em>' containment reference.
	 * @see #isSetContinuationPoints()
	 * @see #unsetContinuationPoints()
	 * @see #getContinuationPoints()
	 * @generated
	 */
	void setContinuationPoints(ListOfByteString value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.BrowseNextRequest#getContinuationPoints <em>Continuation Points</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetContinuationPoints()
	 * @see #getContinuationPoints()
	 * @see #setContinuationPoints(ListOfByteString)
	 * @generated
	 */
	void unsetContinuationPoints();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.BrowseNextRequest#getContinuationPoints <em>Continuation Points</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Continuation Points</em>' containment reference is set.
	 * @see #unsetContinuationPoints()
	 * @see #getContinuationPoints()
	 * @see #setContinuationPoints(ListOfByteString)
	 * @generated
	 */
	boolean isSetContinuationPoints();

} // BrowseNextRequest
