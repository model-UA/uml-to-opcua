/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Option Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfOptionSet#getOptionSet <em>Option Set</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfOptionSet()
 * @model extendedMetaData="name='ListOfOptionSet' kind='elementOnly'"
 * @generated
 */
public interface ListOfOptionSet extends EObject {
	/**
	 * Returns the value of the '<em><b>Option Set</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2008._02.types.OptionSet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Option Set</em>' containment reference list.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfOptionSet_OptionSet()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='OptionSet' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<OptionSet> getOptionSet();

} // ListOfOptionSet
