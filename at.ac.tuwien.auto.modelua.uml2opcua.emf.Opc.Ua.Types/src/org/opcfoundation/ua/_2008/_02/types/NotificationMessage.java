/**
 */
package org.opcfoundation.ua._2008._02.types;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Notification Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.NotificationMessage#getSequenceNumber <em>Sequence Number</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.NotificationMessage#getPublishTime <em>Publish Time</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.NotificationMessage#getNotificationData <em>Notification Data</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getNotificationMessage()
 * @model extendedMetaData="name='NotificationMessage' kind='elementOnly'"
 * @generated
 */
public interface NotificationMessage extends EObject {
	/**
	 * Returns the value of the '<em><b>Sequence Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence Number</em>' attribute.
	 * @see #isSetSequenceNumber()
	 * @see #unsetSequenceNumber()
	 * @see #setSequenceNumber(long)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getNotificationMessage_SequenceNumber()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='element' name='SequenceNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	long getSequenceNumber();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.NotificationMessage#getSequenceNumber <em>Sequence Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence Number</em>' attribute.
	 * @see #isSetSequenceNumber()
	 * @see #unsetSequenceNumber()
	 * @see #getSequenceNumber()
	 * @generated
	 */
	void setSequenceNumber(long value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.NotificationMessage#getSequenceNumber <em>Sequence Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSequenceNumber()
	 * @see #getSequenceNumber()
	 * @see #setSequenceNumber(long)
	 * @generated
	 */
	void unsetSequenceNumber();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.NotificationMessage#getSequenceNumber <em>Sequence Number</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Sequence Number</em>' attribute is set.
	 * @see #unsetSequenceNumber()
	 * @see #getSequenceNumber()
	 * @see #setSequenceNumber(long)
	 * @generated
	 */
	boolean isSetSequenceNumber();

	/**
	 * Returns the value of the '<em><b>Publish Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publish Time</em>' attribute.
	 * @see #setPublishTime(XMLGregorianCalendar)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getNotificationMessage_PublishTime()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='PublishTime' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getPublishTime();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.NotificationMessage#getPublishTime <em>Publish Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publish Time</em>' attribute.
	 * @see #getPublishTime()
	 * @generated
	 */
	void setPublishTime(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Notification Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notification Data</em>' containment reference.
	 * @see #isSetNotificationData()
	 * @see #unsetNotificationData()
	 * @see #setNotificationData(ListOfExtensionObject)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getNotificationMessage_NotificationData()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='NotificationData' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfExtensionObject getNotificationData();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.NotificationMessage#getNotificationData <em>Notification Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notification Data</em>' containment reference.
	 * @see #isSetNotificationData()
	 * @see #unsetNotificationData()
	 * @see #getNotificationData()
	 * @generated
	 */
	void setNotificationData(ListOfExtensionObject value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.NotificationMessage#getNotificationData <em>Notification Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNotificationData()
	 * @see #getNotificationData()
	 * @see #setNotificationData(ListOfExtensionObject)
	 * @generated
	 */
	void unsetNotificationData();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.NotificationMessage#getNotificationData <em>Notification Data</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Notification Data</em>' containment reference is set.
	 * @see #unsetNotificationData()
	 * @see #getNotificationData()
	 * @see #setNotificationData(ListOfExtensionObject)
	 * @generated
	 */
	boolean isSetNotificationData();

} // NotificationMessage
