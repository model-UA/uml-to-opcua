/**
 */
package org.opcfoundation.ua._2011._03.ua.node.set;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UA View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.UAView#isContainsNoLoops <em>Contains No Loops</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.UAView#getEventNotifier <em>Event Notifier</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2011._03.ua.node.set.SetPackage#getUAView()
 * @model extendedMetaData="name='UAView' kind='elementOnly'"
 * @generated
 */
public interface UAView extends UAInstance {
	/**
	 * Returns the value of the '<em><b>Contains No Loops</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains No Loops</em>' attribute.
	 * @see #isSetContainsNoLoops()
	 * @see #unsetContainsNoLoops()
	 * @see #setContainsNoLoops(boolean)
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.SetPackage#getUAView_ContainsNoLoops()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='ContainsNoLoops'"
	 * @generated
	 */
	boolean isContainsNoLoops();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.UAView#isContainsNoLoops <em>Contains No Loops</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contains No Loops</em>' attribute.
	 * @see #isSetContainsNoLoops()
	 * @see #unsetContainsNoLoops()
	 * @see #isContainsNoLoops()
	 * @generated
	 */
	void setContainsNoLoops(boolean value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.UAView#isContainsNoLoops <em>Contains No Loops</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetContainsNoLoops()
	 * @see #isContainsNoLoops()
	 * @see #setContainsNoLoops(boolean)
	 * @generated
	 */
	void unsetContainsNoLoops();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.UAView#isContainsNoLoops <em>Contains No Loops</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Contains No Loops</em>' attribute is set.
	 * @see #unsetContainsNoLoops()
	 * @see #isContainsNoLoops()
	 * @see #setContainsNoLoops(boolean)
	 * @generated
	 */
	boolean isSetContainsNoLoops();

	/**
	 * Returns the value of the '<em><b>Event Notifier</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Notifier</em>' attribute.
	 * @see #isSetEventNotifier()
	 * @see #unsetEventNotifier()
	 * @see #setEventNotifier(short)
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.SetPackage#getUAView_EventNotifier()
	 * @model default="0" unsettable="true" dataType="org.opcfoundation.ua._2011._03.ua.node.set.EventNotifier"
	 *        extendedMetaData="kind='attribute' name='EventNotifier'"
	 * @generated
	 */
	short getEventNotifier();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.UAView#getEventNotifier <em>Event Notifier</em>}' attribute.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.UAView#getEventNotifier <em>Event Notifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEventNotifier()
	 * @see #getEventNotifier()
	 * @see #setEventNotifier(short)
	 * @generated
	 */
	void unsetEventNotifier();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.UAView#getEventNotifier <em>Event Notifier</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Event Notifier</em>' attribute is set.
	 * @see #unsetEventNotifier()
	 * @see #getEventNotifier()
	 * @see #setEventNotifier(short)
	 * @generated
	 */
	boolean isSetEventNotifier();

} // UAView
