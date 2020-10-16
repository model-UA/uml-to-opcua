/**
 */
package org.opcfoundation.ua._2011._03.ua.node.set;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UA Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.UAObject#getEventNotifier <em>Event Notifier</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2011._03.ua.node.set.SetPackage#getUAObject()
 * @model extendedMetaData="name='UAObject' kind='elementOnly'"
 * @generated
 */
public interface UAObject extends UAInstance {
	/**
	 * Returns the value of the '<em><b>Event Notifier</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Notifier</em>' attribute.
	 * @see #isSetEventNotifier()
	 * @see #unsetEventNotifier()
	 * @see #setEventNotifier(short)
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.SetPackage#getUAObject_EventNotifier()
	 * @model default="0" unsettable="true" dataType="org.opcfoundation.ua._2011._03.ua.node.set.EventNotifier"
	 *        extendedMetaData="kind='attribute' name='EventNotifier'"
	 * @generated
	 */
	short getEventNotifier();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.UAObject#getEventNotifier <em>Event Notifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Notifier</em>' attribute.
	 * @see #isSetEventNotifier()
	 * @see #unsetEventNotifier()
	 * @see #getEventNotifier()
	 * @generated
	 */
	void setEventNotifier(short value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.UAObject#getEventNotifier <em>Event Notifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEventNotifier()
	 * @see #getEventNotifier()
	 * @see #setEventNotifier(short)
	 * @generated
	 */
	void unsetEventNotifier();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.UAObject#getEventNotifier <em>Event Notifier</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Event Notifier</em>' attribute is set.
	 * @see #unsetEventNotifier()
	 * @see #getEventNotifier()
	 * @see #setEventNotifier(short)
	 * @generated
	 */
	boolean isSetEventNotifier();

} // UAObject
