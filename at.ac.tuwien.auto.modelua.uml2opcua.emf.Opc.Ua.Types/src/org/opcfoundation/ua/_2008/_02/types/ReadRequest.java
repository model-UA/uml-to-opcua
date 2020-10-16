/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Read Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ReadRequest#getRequestHeader <em>Request Header</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ReadRequest#getMaxAge <em>Max Age</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ReadRequest#getTimestampsToReturn <em>Timestamps To Return</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ReadRequest#getNodesToRead <em>Nodes To Read</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getReadRequest()
 * @model extendedMetaData="name='ReadRequest' kind='elementOnly'"
 * @generated
 */
public interface ReadRequest extends EObject {
	/**
	 * Returns the value of the '<em><b>Request Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Header</em>' containment reference.
	 * @see #isSetRequestHeader()
	 * @see #unsetRequestHeader()
	 * @see #setRequestHeader(RequestHeader)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getReadRequest_RequestHeader()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='RequestHeader' namespace='##targetNamespace'"
	 * @generated
	 */
	RequestHeader getRequestHeader();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.ReadRequest#getRequestHeader <em>Request Header</em>}' containment reference.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.ReadRequest#getRequestHeader <em>Request Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRequestHeader()
	 * @see #getRequestHeader()
	 * @see #setRequestHeader(RequestHeader)
	 * @generated
	 */
	void unsetRequestHeader();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.ReadRequest#getRequestHeader <em>Request Header</em>}' containment reference is set.
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
	 * Returns the value of the '<em><b>Max Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Age</em>' attribute.
	 * @see #isSetMaxAge()
	 * @see #unsetMaxAge()
	 * @see #setMaxAge(double)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getReadRequest_MaxAge()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='element' name='MaxAge' namespace='##targetNamespace'"
	 * @generated
	 */
	double getMaxAge();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.ReadRequest#getMaxAge <em>Max Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Age</em>' attribute.
	 * @see #isSetMaxAge()
	 * @see #unsetMaxAge()
	 * @see #getMaxAge()
	 * @generated
	 */
	void setMaxAge(double value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.ReadRequest#getMaxAge <em>Max Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaxAge()
	 * @see #getMaxAge()
	 * @see #setMaxAge(double)
	 * @generated
	 */
	void unsetMaxAge();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.ReadRequest#getMaxAge <em>Max Age</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Max Age</em>' attribute is set.
	 * @see #unsetMaxAge()
	 * @see #getMaxAge()
	 * @see #setMaxAge(double)
	 * @generated
	 */
	boolean isSetMaxAge();

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
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getReadRequest_TimestampsToReturn()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='TimestampsToReturn' namespace='##targetNamespace'"
	 * @generated
	 */
	TimestampsToReturn getTimestampsToReturn();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.ReadRequest#getTimestampsToReturn <em>Timestamps To Return</em>}' attribute.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.ReadRequest#getTimestampsToReturn <em>Timestamps To Return</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTimestampsToReturn()
	 * @see #getTimestampsToReturn()
	 * @see #setTimestampsToReturn(TimestampsToReturn)
	 * @generated
	 */
	void unsetTimestampsToReturn();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.ReadRequest#getTimestampsToReturn <em>Timestamps To Return</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Nodes To Read</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes To Read</em>' containment reference.
	 * @see #isSetNodesToRead()
	 * @see #unsetNodesToRead()
	 * @see #setNodesToRead(ListOfReadValueId)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getReadRequest_NodesToRead()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='NodesToRead' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfReadValueId getNodesToRead();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.ReadRequest#getNodesToRead <em>Nodes To Read</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nodes To Read</em>' containment reference.
	 * @see #isSetNodesToRead()
	 * @see #unsetNodesToRead()
	 * @see #getNodesToRead()
	 * @generated
	 */
	void setNodesToRead(ListOfReadValueId value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.ReadRequest#getNodesToRead <em>Nodes To Read</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNodesToRead()
	 * @see #getNodesToRead()
	 * @see #setNodesToRead(ListOfReadValueId)
	 * @generated
	 */
	void unsetNodesToRead();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.ReadRequest#getNodesToRead <em>Nodes To Read</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nodes To Read</em>' containment reference is set.
	 * @see #unsetNodesToRead()
	 * @see #getNodesToRead()
	 * @see #setNodesToRead(ListOfReadValueId)
	 * @generated
	 */
	boolean isSetNodesToRead();

} // ReadRequest
