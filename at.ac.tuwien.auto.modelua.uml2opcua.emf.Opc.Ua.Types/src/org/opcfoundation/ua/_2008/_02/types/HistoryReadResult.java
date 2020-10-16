/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>History Read Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.HistoryReadResult#getStatusCode <em>Status Code</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.HistoryReadResult#getContinuationPoint <em>Continuation Point</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.HistoryReadResult#getHistoryData <em>History Data</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getHistoryReadResult()
 * @model extendedMetaData="name='HistoryReadResult' kind='elementOnly'"
 * @generated
 */
public interface HistoryReadResult extends EObject {
	/**
	 * Returns the value of the '<em><b>Status Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status Code</em>' containment reference.
	 * @see #setStatusCode(StatusCode)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getHistoryReadResult_StatusCode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='StatusCode' namespace='##targetNamespace'"
	 * @generated
	 */
	StatusCode getStatusCode();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.HistoryReadResult#getStatusCode <em>Status Code</em>}' containment reference.
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
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getHistoryReadResult_ContinuationPoint()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Base64Binary"
	 *        extendedMetaData="kind='element' name='ContinuationPoint' namespace='##targetNamespace'"
	 * @generated
	 */
	byte[] getContinuationPoint();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.HistoryReadResult#getContinuationPoint <em>Continuation Point</em>}' attribute.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.HistoryReadResult#getContinuationPoint <em>Continuation Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetContinuationPoint()
	 * @see #getContinuationPoint()
	 * @see #setContinuationPoint(byte[])
	 * @generated
	 */
	void unsetContinuationPoint();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.HistoryReadResult#getContinuationPoint <em>Continuation Point</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>History Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>History Data</em>' containment reference.
	 * @see #isSetHistoryData()
	 * @see #unsetHistoryData()
	 * @see #setHistoryData(ExtensionObject)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getHistoryReadResult_HistoryData()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='HistoryData' namespace='##targetNamespace'"
	 * @generated
	 */
	ExtensionObject getHistoryData();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.HistoryReadResult#getHistoryData <em>History Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>History Data</em>' containment reference.
	 * @see #isSetHistoryData()
	 * @see #unsetHistoryData()
	 * @see #getHistoryData()
	 * @generated
	 */
	void setHistoryData(ExtensionObject value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.HistoryReadResult#getHistoryData <em>History Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHistoryData()
	 * @see #getHistoryData()
	 * @see #setHistoryData(ExtensionObject)
	 * @generated
	 */
	void unsetHistoryData();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.HistoryReadResult#getHistoryData <em>History Data</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>History Data</em>' containment reference is set.
	 * @see #unsetHistoryData()
	 * @see #getHistoryData()
	 * @see #setHistoryData(ExtensionObject)
	 * @generated
	 */
	boolean isSetHistoryData();

} // HistoryReadResult
