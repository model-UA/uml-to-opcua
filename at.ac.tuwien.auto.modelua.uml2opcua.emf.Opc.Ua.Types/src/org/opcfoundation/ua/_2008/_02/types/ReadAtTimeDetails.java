/**
 */
package org.opcfoundation.ua._2008._02.types;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Read At Time Details</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ReadAtTimeDetails#getReqTimes <em>Req Times</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ReadAtTimeDetails#isUseSimpleBounds <em>Use Simple Bounds</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getReadAtTimeDetails()
 * @model extendedMetaData="name='ReadAtTimeDetails' kind='elementOnly'"
 * @generated
 */
public interface ReadAtTimeDetails extends HistoryReadDetails {
	/**
	 * Returns the value of the '<em><b>Req Times</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Req Times</em>' containment reference.
	 * @see #isSetReqTimes()
	 * @see #unsetReqTimes()
	 * @see #setReqTimes(ListOfDateTime)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getReadAtTimeDetails_ReqTimes()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='ReqTimes' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfDateTime getReqTimes();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.ReadAtTimeDetails#getReqTimes <em>Req Times</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Req Times</em>' containment reference.
	 * @see #isSetReqTimes()
	 * @see #unsetReqTimes()
	 * @see #getReqTimes()
	 * @generated
	 */
	void setReqTimes(ListOfDateTime value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.ReadAtTimeDetails#getReqTimes <em>Req Times</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReqTimes()
	 * @see #getReqTimes()
	 * @see #setReqTimes(ListOfDateTime)
	 * @generated
	 */
	void unsetReqTimes();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.ReadAtTimeDetails#getReqTimes <em>Req Times</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Req Times</em>' containment reference is set.
	 * @see #unsetReqTimes()
	 * @see #getReqTimes()
	 * @see #setReqTimes(ListOfDateTime)
	 * @generated
	 */
	boolean isSetReqTimes();

	/**
	 * Returns the value of the '<em><b>Use Simple Bounds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Simple Bounds</em>' attribute.
	 * @see #isSetUseSimpleBounds()
	 * @see #unsetUseSimpleBounds()
	 * @see #setUseSimpleBounds(boolean)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getReadAtTimeDetails_UseSimpleBounds()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='UseSimpleBounds' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isUseSimpleBounds();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.ReadAtTimeDetails#isUseSimpleBounds <em>Use Simple Bounds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Simple Bounds</em>' attribute.
	 * @see #isSetUseSimpleBounds()
	 * @see #unsetUseSimpleBounds()
	 * @see #isUseSimpleBounds()
	 * @generated
	 */
	void setUseSimpleBounds(boolean value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.ReadAtTimeDetails#isUseSimpleBounds <em>Use Simple Bounds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUseSimpleBounds()
	 * @see #isUseSimpleBounds()
	 * @see #setUseSimpleBounds(boolean)
	 * @generated
	 */
	void unsetUseSimpleBounds();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.ReadAtTimeDetails#isUseSimpleBounds <em>Use Simple Bounds</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Use Simple Bounds</em>' attribute is set.
	 * @see #unsetUseSimpleBounds()
	 * @see #isUseSimpleBounds()
	 * @see #setUseSimpleBounds(boolean)
	 * @generated
	 */
	boolean isSetUseSimpleBounds();

} // ReadAtTimeDetails
