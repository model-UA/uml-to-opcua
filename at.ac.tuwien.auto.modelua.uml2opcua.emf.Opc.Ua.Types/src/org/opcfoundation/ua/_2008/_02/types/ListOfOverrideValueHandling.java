/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Override Value Handling</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfOverrideValueHandling#getOverrideValueHandling <em>Override Value Handling</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfOverrideValueHandling()
 * @model extendedMetaData="name='ListOfOverrideValueHandling' kind='elementOnly'"
 * @generated
 */
public interface ListOfOverrideValueHandling extends EObject {
	/**
	 * Returns the value of the '<em><b>Override Value Handling</b></em>' attribute list.
	 * The list contents are of type {@link org.opcfoundation.ua._2008._02.types.OverrideValueHandling}.
	 * The literals are from the enumeration {@link org.opcfoundation.ua._2008._02.types.OverrideValueHandling}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Override Value Handling</em>' attribute list.
	 * @see org.opcfoundation.ua._2008._02.types.OverrideValueHandling
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfOverrideValueHandling_OverrideValueHandling()
	 * @model unique="false"
	 *        extendedMetaData="kind='element' name='OverrideValueHandling' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<OverrideValueHandling> getOverrideValueHandling();

} // ListOfOverrideValueHandling
