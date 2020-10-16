/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Alias Name Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfAliasNameDataType#getAliasNameDataType <em>Alias Name Data Type</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfAliasNameDataType()
 * @model extendedMetaData="name='ListOfAliasNameDataType' kind='elementOnly'"
 * @generated
 */
public interface ListOfAliasNameDataType extends EObject {
	/**
	 * Returns the value of the '<em><b>Alias Name Data Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2008._02.types.AliasNameDataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alias Name Data Type</em>' containment reference list.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfAliasNameDataType_AliasNameDataType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AliasNameDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AliasNameDataType> getAliasNameDataType();

} // ListOfAliasNameDataType
