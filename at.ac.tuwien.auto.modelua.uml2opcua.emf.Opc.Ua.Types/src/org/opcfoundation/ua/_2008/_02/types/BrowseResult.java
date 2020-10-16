/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Browse Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.BrowseResult#getStatusCode <em>Status Code</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.BrowseResult#getContinuationPoint <em>Continuation Point</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.BrowseResult#getReferences <em>References</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getBrowseResult()
 * @model extendedMetaData="name='BrowseResult' kind='elementOnly'"
 * @generated
 */
public interface BrowseResult extends EObject {
	/**
	 * Returns the value of the '<em><b>Status Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status Code</em>' containment reference.
	 * @see #setStatusCode(StatusCode)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getBrowseResult_StatusCode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='StatusCode' namespace='##targetNamespace'"
	 * @generated
	 */
	StatusCode getStatusCode();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.BrowseResult#getStatusCode <em>Status Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Code</em>' containment reference.
	 * @see #getStatusCode()
	 * @generated
	 */
	void setStatusCode(StatusCode value);

	/**
	 * Returns the value of the '<em><b>Continuation Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Continuation Point</em>' attribute.
	 * @see #isSetContinuationPoint()
	 * @see #unsetContinuationPoint()
	 * @see #setContinuationPoint(byte[])
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getBrowseResult_ContinuationPoint()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Base64Binary"
	 *        extendedMetaData="kind='element' name='ContinuationPoint' namespace='##targetNamespace'"
	 * @generated
	 */
	byte[] getContinuationPoint();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.BrowseResult#getContinuationPoint <em>Continuation Point</em>}' attribute.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.BrowseResult#getContinuationPoint <em>Continuation Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetContinuationPoint()
	 * @see #getContinuationPoint()
	 * @see #setContinuationPoint(byte[])
	 * @generated
	 */
	void unsetContinuationPoint();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.BrowseResult#getContinuationPoint <em>Continuation Point</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Continuation Point</em>' attribute is set.
	 * @see #unsetContinuationPoint()
	 * @see #getContinuationPoint()
	 * @see #setContinuationPoint(byte[])
	 * @generated
	 */
	boolean isSetContinuationPoint();

	/**
	 * Returns the value of the '<em><b>References</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>References</em>' containment reference.
	 * @see #isSetReferences()
	 * @see #unsetReferences()
	 * @see #setReferences(ListOfReferenceDescription)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getBrowseResult_References()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='References' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfReferenceDescription getReferences();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.BrowseResult#getReferences <em>References</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>References</em>' containment reference.
	 * @see #isSetReferences()
	 * @see #unsetReferences()
	 * @see #getReferences()
	 * @generated
	 */
	void setReferences(ListOfReferenceDescription value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.BrowseResult#getReferences <em>References</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReferences()
	 * @see #getReferences()
	 * @see #setReferences(ListOfReferenceDescription)
	 * @generated
	 */
	void unsetReferences();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.BrowseResult#getReferences <em>References</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>References</em>' containment reference is set.
	 * @see #unsetReferences()
	 * @see #getReferences()
	 * @see #setReferences(ListOfReferenceDescription)
	 * @generated
	 */
	boolean isSetReferences();

} // BrowseResult
