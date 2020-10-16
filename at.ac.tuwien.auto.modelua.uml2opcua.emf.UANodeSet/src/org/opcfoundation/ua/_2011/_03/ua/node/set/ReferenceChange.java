/**
 */
package org.opcfoundation.ua._2011._03.ua.node.set;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference Change</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.ReferenceChange#getValue <em>Value</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.ReferenceChange#isIsForward <em>Is Forward</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.ReferenceChange#getReferenceType <em>Reference Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.ReferenceChange#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2011._03.ua.node.set.SetPackage#getReferenceChange()
 * @model extendedMetaData="name='ReferenceChange' kind='simple'"
 * @generated
 */
public interface ReferenceChange extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.SetPackage#getReferenceChange_Value()
	 * @model dataType="org.opcfoundation.ua._2011._03.ua.node.set.NodeId"
	 *        extendedMetaData="name=':0' kind='simple'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.ReferenceChange#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Is Forward</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Forward</em>' attribute.
	 * @see #isSetIsForward()
	 * @see #unsetIsForward()
	 * @see #setIsForward(boolean)
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.SetPackage#getReferenceChange_IsForward()
	 * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='IsForward'"
	 * @generated
	 */
	boolean isIsForward();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.ReferenceChange#isIsForward <em>Is Forward</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Forward</em>' attribute.
	 * @see #isSetIsForward()
	 * @see #unsetIsForward()
	 * @see #isIsForward()
	 * @generated
	 */
	void setIsForward(boolean value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.ReferenceChange#isIsForward <em>Is Forward</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsForward()
	 * @see #isIsForward()
	 * @see #setIsForward(boolean)
	 * @generated
	 */
	void unsetIsForward();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.ReferenceChange#isIsForward <em>Is Forward</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Forward</em>' attribute is set.
	 * @see #unsetIsForward()
	 * @see #isIsForward()
	 * @see #setIsForward(boolean)
	 * @generated
	 */
	boolean isSetIsForward();

	/**
	 * Returns the value of the '<em><b>Reference Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Type</em>' attribute.
	 * @see #setReferenceType(String)
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.SetPackage#getReferenceChange_ReferenceType()
	 * @model dataType="org.opcfoundation.ua._2011._03.ua.node.set.NodeId" required="true"
	 *        extendedMetaData="kind='attribute' name='ReferenceType'"
	 * @generated
	 */
	String getReferenceType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.ReferenceChange#getReferenceType <em>Reference Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Type</em>' attribute.
	 * @see #getReferenceType()
	 * @generated
	 */
	void setReferenceType(String value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' attribute.
	 * @see #setSource(String)
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.SetPackage#getReferenceChange_Source()
	 * @model dataType="org.opcfoundation.ua._2011._03.ua.node.set.NodeId" required="true"
	 *        extendedMetaData="kind='attribute' name='Source'"
	 * @generated
	 */
	String getSource();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.ReferenceChange#getSource <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' attribute.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(String value);

} // ReferenceChange
