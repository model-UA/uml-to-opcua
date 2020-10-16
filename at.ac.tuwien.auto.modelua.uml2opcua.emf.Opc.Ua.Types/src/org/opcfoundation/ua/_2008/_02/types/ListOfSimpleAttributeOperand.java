/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Simple Attribute Operand</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfSimpleAttributeOperand#getSimpleAttributeOperand <em>Simple Attribute Operand</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfSimpleAttributeOperand()
 * @model extendedMetaData="name='ListOfSimpleAttributeOperand' kind='elementOnly'"
 * @generated
 */
public interface ListOfSimpleAttributeOperand extends EObject {
	/**
	 * Returns the value of the '<em><b>Simple Attribute Operand</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2008._02.types.SimpleAttributeOperand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simple Attribute Operand</em>' containment reference list.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfSimpleAttributeOperand_SimpleAttributeOperand()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SimpleAttributeOperand' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SimpleAttributeOperand> getSimpleAttributeOperand();

} // ListOfSimpleAttributeOperand
