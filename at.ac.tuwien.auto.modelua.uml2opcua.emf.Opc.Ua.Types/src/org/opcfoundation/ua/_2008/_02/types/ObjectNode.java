/**
 */
package org.opcfoundation.ua._2008._02.types;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ObjectNode#getEventNotifier <em>Event Notifier</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getObjectNode()
 * @model extendedMetaData="name='ObjectNode' kind='elementOnly'"
 * @generated
 */
public interface ObjectNode extends InstanceNode {
	/**
	 * Returns the value of the '<em><b>Event Notifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Notifier</em>' attribute.
	 * @see #isSetEventNotifier()
	 * @see #unsetEventNotifier()
	 * @see #setEventNotifier(short)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getObjectNode_EventNotifier()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedByte"
	 *        extendedMetaData="kind='element' name='EventNotifier' namespace='##targetNamespace'"
	 * @generated
	 */
	short getEventNotifier();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.ObjectNode#getEventNotifier <em>Event Notifier</em>}' attribute.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.ObjectNode#getEventNotifier <em>Event Notifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEventNotifier()
	 * @see #getEventNotifier()
	 * @see #setEventNotifier(short)
	 * @generated
	 */
	void unsetEventNotifier();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.ObjectNode#getEventNotifier <em>Event Notifier</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Event Notifier</em>' attribute is set.
	 * @see #unsetEventNotifier()
	 * @see #getEventNotifier()
	 * @see #setEventNotifier(short)
	 * @generated
	 */
	boolean isSetEventNotifier();

} // ObjectNode
