/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>History Read Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.HistoryReadRequest#getRequestHeader <em>Request Header</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.HistoryReadRequest#getHistoryReadDetails <em>History Read Details</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.HistoryReadRequest#getTimestampsToReturn <em>Timestamps To Return</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.HistoryReadRequest#isReleaseContinuationPoints <em>Release Continuation Points</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.HistoryReadRequest#getNodesToRead <em>Nodes To Read</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getHistoryReadRequest()
 * @model extendedMetaData="name='HistoryReadRequest' kind='elementOnly'"
 * @generated
 */
public interface HistoryReadRequest extends EObject {
	/**
	 * Returns the value of the '<em><b>Request Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Header</em>' containment reference.
	 * @see #isSetRequestHeader()
	 * @see #unsetRequestHeader()
	 * @see #setRequestHeader(RequestHeader)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getHistoryReadRequest_RequestHeader()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='RequestHeader' namespace='##targetNamespace'"
	 * @generated
	 */
	RequestHeader getRequestHeader();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.HistoryReadRequest#getRequestHeader <em>Request Header</em>}' containment reference.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.HistoryReadRequest#getRequestHeader <em>Request Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRequestHeader()
	 * @see #getRequestHeader()
	 * @see #setRequestHeader(RequestHeader)
	 * @generated
	 */
	void unsetRequestHeader();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.HistoryReadRequest#getRequestHeader <em>Request Header</em>}' containment reference is set.
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
	 * Returns the value of the '<em><b>History Read Details</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>History Read Details</em>' containment reference.
	 * @see #isSetHistoryReadDetails()
	 * @see #unsetHistoryReadDetails()
	 * @see #setHistoryReadDetails(ExtensionObject)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getHistoryReadRequest_HistoryReadDetails()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='HistoryReadDetails' namespace='##targetNamespace'"
	 * @generated
	 */
	ExtensionObject getHistoryReadDetails();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.HistoryReadRequest#getHistoryReadDetails <em>History Read Details</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>History Read Details</em>' containment reference.
	 * @see #isSetHistoryReadDetails()
	 * @see #unsetHistoryReadDetails()
	 * @see #getHistoryReadDetails()
	 * @generated
	 */
	void setHistoryReadDetails(ExtensionObject value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.HistoryReadRequest#getHistoryReadDetails <em>History Read Details</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHistoryReadDetails()
	 * @see #getHistoryReadDetails()
	 * @see #setHistoryReadDetails(ExtensionObject)
	 * @generated
	 */
	void unsetHistoryReadDetails();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.HistoryReadRequest#getHistoryReadDetails <em>History Read Details</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>History Read Details</em>' containment reference is set.
	 * @see #unsetHistoryReadDetails()
	 * @see #getHistoryReadDetails()
	 * @see #setHistoryReadDetails(ExtensionObject)
	 * @generated
	 */
	boolean isSetHistoryReadDetails();

	/**
	 * Returns the value of the '<em><b>Timestamps To Return</b></em>' attribute.
	 * The literals are from the enumeration {@link org.opcfoundation.ua._2008._02.types.TimestampsToReturn}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timestamps To Return</em>' attribute.
	 * @see org.opcfoundation.ua._2008._02.types.TimestampsToReturn
	 * @see #isSetTimestampsToReturn()
	 * @see #unsetTimestampsToReturn()
	 * @see #setTimestampsToReturn(TimestampsToReturn)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getHistoryReadRequest_TimestampsToReturn()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='TimestampsToReturn' namespace='##targetNamespace'"
	 * @generated
	 */
	TimestampsToReturn getTimestampsToReturn();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.HistoryReadRequest#getTimestampsToReturn <em>Timestamps To Return</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timestamps To Return</em>' attribute.
	 * @see org.opcfoundation.ua._2008._02.types.TimestampsToReturn
	 * @see #isSetTimestampsToReturn()
	 * @see #unsetTimestampsToReturn()
	 * @see #getTimestampsToReturn()
	 * @generated
	 */
	void setTimestampsToReturn(TimestampsToReturn value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.HistoryReadRequest#getTimestampsToReturn <em>Timestamps To Return</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTimestampsToReturn()
	 * @see #getTimestampsToReturn()
	 * @see #setTimestampsToReturn(TimestampsToReturn)
	 * @generated
	 */
	void unsetTimestampsToReturn();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.HistoryReadRequest#getTimestampsToReturn <em>Timestamps To Return</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Timestamps To Return</em>' attribute is set.
	 * @see #unsetTimestampsToReturn()
	 * @see #getTimestampsToReturn()
	 * @see #setTimestampsToReturn(TimestampsToReturn)
	 * @generated
	 */
	boolean isSetTimestampsToReturn();

	/**
	 * Returns the value of the '<em><b>Release Continuation Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Release Continuation Points</em>' attribute.
	 * @see #isSetReleaseContinuationPoints()
	 * @see #unsetReleaseContinuationPoints()
	 * @see #setReleaseContinuationPoints(boolean)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getHistoryReadRequest_ReleaseContinuationPoints()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='ReleaseContinuationPoints' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isReleaseContinuationPoints();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.HistoryReadRequest#isReleaseContinuationPoints <em>Release Continuation Points</em>}' attribute.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.HistoryReadRequest#isReleaseContinuationPoints <em>Release Continuation Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReleaseContinuationPoints()
	 * @see #isReleaseContinuationPoints()
	 * @see #setReleaseContinuationPoints(boolean)
	 * @generated
	 */
	void unsetReleaseContinuationPoints();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.HistoryReadRequest#isReleaseContinuationPoints <em>Release Continuation Points</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Nodes To Read</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes To Read</em>' containment reference.
	 * @see #isSetNodesToRead()
	 * @see #unsetNodesToRead()
	 * @see #setNodesToRead(ListOfHistoryReadValueId)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getHistoryReadRequest_NodesToRead()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='NodesToRead' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfHistoryReadValueId getNodesToRead();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.HistoryReadRequest#getNodesToRead <em>Nodes To Read</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nodes To Read</em>' containment reference.
	 * @see #isSetNodesToRead()
	 * @see #unsetNodesToRead()
	 * @see #getNodesToRead()
	 * @generated
	 */
	void setNodesToRead(ListOfHistoryReadValueId value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.HistoryReadRequest#getNodesToRead <em>Nodes To Read</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNodesToRead()
	 * @see #getNodesToRead()
	 * @see #setNodesToRead(ListOfHistoryReadValueId)
	 * @generated
	 */
	void unsetNodesToRead();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.HistoryReadRequest#getNodesToRead <em>Nodes To Read</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nodes To Read</em>' containment reference is set.
	 * @see #unsetNodesToRead()
	 * @see #getNodesToRead()
	 * @see #setNodesToRead(ListOfHistoryReadValueId)
	 * @generated
	 */
	boolean isSetNodesToRead();

} // HistoryReadRequest
