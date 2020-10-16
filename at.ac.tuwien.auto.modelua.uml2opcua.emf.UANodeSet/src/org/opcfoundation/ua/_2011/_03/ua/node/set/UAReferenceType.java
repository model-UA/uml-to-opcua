/**
 */
package org.opcfoundation.ua._2011._03.ua.node.set;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UA Reference Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.UAReferenceType#getInverseName <em>Inverse Name</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.UAReferenceType#isSymmetric <em>Symmetric</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2011._03.ua.node.set.SetPackage#getUAReferenceType()
 * @model extendedMetaData="name='UAReferenceType' kind='elementOnly'"
 * @generated
 */
public interface UAReferenceType extends UAType {
	/**
	 * Returns the value of the '<em><b>Inverse Name</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2011._03.ua.node.set.LocalizedText}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inverse Name</em>' containment reference list.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.SetPackage#getUAReferenceType_InverseName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='InverseName' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<LocalizedText> getInverseName();

	/**
	 * Returns the value of the '<em><b>Symmetric</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Symmetric</em>' attribute.
	 * @see #isSetSymmetric()
	 * @see #unsetSymmetric()
	 * @see #setSymmetric(boolean)
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.SetPackage#getUAReferenceType_Symmetric()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='Symmetric'"
	 * @generated
	 */
	boolean isSymmetric();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.UAReferenceType#isSymmetric <em>Symmetric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Symmetric</em>' attribute.
	 * @see #isSetSymmetric()
	 * @see #unsetSymmetric()
	 * @see #isSymmetric()
	 * @generated
	 */
	void setSymmetric(boolean value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.UAReferenceType#isSymmetric <em>Symmetric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSymmetric()
	 * @see #isSymmetric()
	 * @see #setSymmetric(boolean)
	 * @generated
	 */
	void unsetSymmetric();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.UAReferenceType#isSymmetric <em>Symmetric</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Symmetric</em>' attribute is set.
	 * @see #unsetSymmetric()
	 * @see #isSymmetric()
	 * @see #setSymmetric(boolean)
	 * @generated
	 */
	boolean isSetSymmetric();

} // UAReferenceType
