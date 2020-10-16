/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Identity Mapping Rule Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.IdentityMappingRuleType#getCriteriaType <em>Criteria Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.IdentityMappingRuleType#getCriteria <em>Criteria</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getIdentityMappingRuleType()
 * @model extendedMetaData="name='IdentityMappingRuleType' kind='elementOnly'"
 * @generated
 */
public interface IdentityMappingRuleType extends EObject {
	/**
	 * Returns the value of the '<em><b>Criteria Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.opcfoundation.ua._2008._02.types.IdentityCriteriaType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Criteria Type</em>' attribute.
	 * @see org.opcfoundation.ua._2008._02.types.IdentityCriteriaType
	 * @see #isSetCriteriaType()
	 * @see #unsetCriteriaType()
	 * @see #setCriteriaType(IdentityCriteriaType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getIdentityMappingRuleType_CriteriaType()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='CriteriaType' namespace='##targetNamespace'"
	 * @generated
	 */
	IdentityCriteriaType getCriteriaType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.IdentityMappingRuleType#getCriteriaType <em>Criteria Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Criteria Type</em>' attribute.
	 * @see org.opcfoundation.ua._2008._02.types.IdentityCriteriaType
	 * @see #isSetCriteriaType()
	 * @see #unsetCriteriaType()
	 * @see #getCriteriaType()
	 * @generated
	 */
	void setCriteriaType(IdentityCriteriaType value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.IdentityMappingRuleType#getCriteriaType <em>Criteria Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCriteriaType()
	 * @see #getCriteriaType()
	 * @see #setCriteriaType(IdentityCriteriaType)
	 * @generated
	 */
	void unsetCriteriaType();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.IdentityMappingRuleType#getCriteriaType <em>Criteria Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Criteria Type</em>' attribute is set.
	 * @see #unsetCriteriaType()
	 * @see #getCriteriaType()
	 * @see #setCriteriaType(IdentityCriteriaType)
	 * @generated
	 */
	boolean isSetCriteriaType();

	/**
	 * Returns the value of the '<em><b>Criteria</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Criteria</em>' attribute.
	 * @see #isSetCriteria()
	 * @see #unsetCriteria()
	 * @see #setCriteria(String)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getIdentityMappingRuleType_Criteria()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Criteria' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCriteria();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.IdentityMappingRuleType#getCriteria <em>Criteria</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Criteria</em>' attribute.
	 * @see #isSetCriteria()
	 * @see #unsetCriteria()
	 * @see #getCriteria()
	 * @generated
	 */
	void setCriteria(String value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.IdentityMappingRuleType#getCriteria <em>Criteria</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCriteria()
	 * @see #getCriteria()
	 * @see #setCriteria(String)
	 * @generated
	 */
	void unsetCriteria();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.IdentityMappingRuleType#getCriteria <em>Criteria</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Criteria</em>' attribute is set.
	 * @see #unsetCriteria()
	 * @see #getCriteria()
	 * @see #setCriteria(String)
	 * @generated
	 */
	boolean isSetCriteria();

} // IdentityMappingRuleType
