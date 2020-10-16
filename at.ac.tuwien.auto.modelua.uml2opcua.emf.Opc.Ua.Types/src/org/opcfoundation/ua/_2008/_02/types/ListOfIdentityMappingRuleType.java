/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Identity Mapping Rule Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfIdentityMappingRuleType#getIdentityMappingRuleType <em>Identity Mapping Rule Type</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfIdentityMappingRuleType()
 * @model extendedMetaData="name='ListOfIdentityMappingRuleType' kind='elementOnly'"
 * @generated
 */
public interface ListOfIdentityMappingRuleType extends EObject {
	/**
	 * Returns the value of the '<em><b>Identity Mapping Rule Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2008._02.types.IdentityMappingRuleType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identity Mapping Rule Type</em>' containment reference list.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfIdentityMappingRuleType_IdentityMappingRuleType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='IdentityMappingRuleType' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<IdentityMappingRuleType> getIdentityMappingRuleType();

} // ListOfIdentityMappingRuleType
