/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Find Servers On Network Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.FindServersOnNetworkRequest#getRequestHeader <em>Request Header</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.FindServersOnNetworkRequest#getStartingRecordId <em>Starting Record Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.FindServersOnNetworkRequest#getMaxRecordsToReturn <em>Max Records To Return</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.FindServersOnNetworkRequest#getServerCapabilityFilter <em>Server Capability Filter</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getFindServersOnNetworkRequest()
 * @model extendedMetaData="name='FindServersOnNetworkRequest' kind='elementOnly'"
 * @generated
 */
public interface FindServersOnNetworkRequest extends EObject {
	/**
	 * Returns the value of the '<em><b>Request Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Header</em>' containment reference.
	 * @see #isSetRequestHeader()
	 * @see #unsetRequestHeader()
	 * @see #setRequestHeader(RequestHeader)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getFindServersOnNetworkRequest_RequestHeader()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='RequestHeader' namespace='##targetNamespace'"
	 * @generated
	 */
	RequestHeader getRequestHeader();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.FindServersOnNetworkRequest#getRequestHeader <em>Request Header</em>}' containment reference.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.FindServersOnNetworkRequest#getRequestHeader <em>Request Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRequestHeader()
	 * @see #getRequestHeader()
	 * @see #setRequestHeader(RequestHeader)
	 * @generated
	 */
	void unsetRequestHeader();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.FindServersOnNetworkRequest#getRequestHeader <em>Request Header</em>}' containment reference is set.
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
	 * Returns the value of the '<em><b>Starting Record Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Starting Record Id</em>' attribute.
	 * @see #isSetStartingRecordId()
	 * @see #unsetStartingRecordId()
	 * @see #setStartingRecordId(long)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getFindServersOnNetworkRequest_StartingRecordId()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='element' name='StartingRecordId' namespace='##targetNamespace'"
	 * @generated
	 */
	long getStartingRecordId();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.FindServersOnNetworkRequest#getStartingRecordId <em>Starting Record Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Starting Record Id</em>' attribute.
	 * @see #isSetStartingRecordId()
	 * @see #unsetStartingRecordId()
	 * @see #getStartingRecordId()
	 * @generated
	 */
	void setStartingRecordId(long value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.FindServersOnNetworkRequest#getStartingRecordId <em>Starting Record Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStartingRecordId()
	 * @see #getStartingRecordId()
	 * @see #setStartingRecordId(long)
	 * @generated
	 */
	void unsetStartingRecordId();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.FindServersOnNetworkRequest#getStartingRecordId <em>Starting Record Id</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Starting Record Id</em>' attribute is set.
	 * @see #unsetStartingRecordId()
	 * @see #getStartingRecordId()
	 * @see #setStartingRecordId(long)
	 * @generated
	 */
	boolean isSetStartingRecordId();

	/**
	 * Returns the value of the '<em><b>Max Records To Return</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Records To Return</em>' attribute.
	 * @see #isSetMaxRecordsToReturn()
	 * @see #unsetMaxRecordsToReturn()
	 * @see #setMaxRecordsToReturn(long)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getFindServersOnNetworkRequest_MaxRecordsToReturn()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='element' name='MaxRecordsToReturn' namespace='##targetNamespace'"
	 * @generated
	 */
	long getMaxRecordsToReturn();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.FindServersOnNetworkRequest#getMaxRecordsToReturn <em>Max Records To Return</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Records To Return</em>' attribute.
	 * @see #isSetMaxRecordsToReturn()
	 * @see #unsetMaxRecordsToReturn()
	 * @see #getMaxRecordsToReturn()
	 * @generated
	 */
	void setMaxRecordsToReturn(long value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.FindServersOnNetworkRequest#getMaxRecordsToReturn <em>Max Records To Return</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaxRecordsToReturn()
	 * @see #getMaxRecordsToReturn()
	 * @see #setMaxRecordsToReturn(long)
	 * @generated
	 */
	void unsetMaxRecordsToReturn();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.FindServersOnNetworkRequest#getMaxRecordsToReturn <em>Max Records To Return</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Max Records To Return</em>' attribute is set.
	 * @see #unsetMaxRecordsToReturn()
	 * @see #getMaxRecordsToReturn()
	 * @see #setMaxRecordsToReturn(long)
	 * @generated
	 */
	boolean isSetMaxRecordsToReturn();

	/**
	 * Returns the value of the '<em><b>Server Capability Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server Capability Filter</em>' containment reference.
	 * @see #isSetServerCapabilityFilter()
	 * @see #unsetServerCapabilityFilter()
	 * @see #setServerCapabilityFilter(ListOfString)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getFindServersOnNetworkRequest_ServerCapabilityFilter()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='ServerCapabilityFilter' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfString getServerCapabilityFilter();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.FindServersOnNetworkRequest#getServerCapabilityFilter <em>Server Capability Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server Capability Filter</em>' containment reference.
	 * @see #isSetServerCapabilityFilter()
	 * @see #unsetServerCapabilityFilter()
	 * @see #getServerCapabilityFilter()
	 * @generated
	 */
	void setServerCapabilityFilter(ListOfString value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.FindServersOnNetworkRequest#getServerCapabilityFilter <em>Server Capability Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetServerCapabilityFilter()
	 * @see #getServerCapabilityFilter()
	 * @see #setServerCapabilityFilter(ListOfString)
	 * @generated
	 */
	void unsetServerCapabilityFilter();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.FindServersOnNetworkRequest#getServerCapabilityFilter <em>Server Capability Filter</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Server Capability Filter</em>' containment reference is set.
	 * @see #unsetServerCapabilityFilter()
	 * @see #getServerCapabilityFilter()
	 * @see #setServerCapabilityFilter(ListOfString)
	 * @generated
	 */
	boolean isSetServerCapabilityFilter();

} // FindServersOnNetworkRequest
