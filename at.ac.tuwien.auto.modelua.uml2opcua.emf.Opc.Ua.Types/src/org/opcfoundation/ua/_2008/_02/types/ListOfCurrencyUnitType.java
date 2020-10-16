/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Currency Unit Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfCurrencyUnitType#getCurrencyUnitType <em>Currency Unit Type</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfCurrencyUnitType()
 * @model extendedMetaData="name='ListOfCurrencyUnitType' kind='elementOnly'"
 * @generated
 */
public interface ListOfCurrencyUnitType extends EObject {
	/**
	 * Returns the value of the '<em><b>Currency Unit Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2008._02.types.CurrencyUnitType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Currency Unit Type</em>' containment reference list.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfCurrencyUnitType_CurrencyUnitType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CurrencyUnitType' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CurrencyUnitType> getCurrencyUnitType();

} // ListOfCurrencyUnitType
