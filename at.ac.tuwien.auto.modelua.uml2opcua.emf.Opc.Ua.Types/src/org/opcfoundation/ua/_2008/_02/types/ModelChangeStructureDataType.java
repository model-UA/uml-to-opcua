/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Change Structure Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ModelChangeStructureDataType#getAffected <em>Affected</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ModelChangeStructureDataType#getAffectedType <em>Affected Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ModelChangeStructureDataType#getVerb <em>Verb</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getModelChangeStructureDataType()
 * @model extendedMetaData="name='ModelChangeStructureDataType' kind='elementOnly'"
 * @generated
 */
public interface ModelChangeStructureDataType extends EObject {
	/**
	 * Returns the value of the '<em><b>Affected</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Affected</em>' containment reference.
	 * @see #isSetAffected()
	 * @see #unsetAffected()
	 * @see #setAffected(NodeId)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getModelChangeStructureDataType_Affected()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='Affected' namespace='##targetNamespace'"
	 * @generated
	 */
	NodeId getAffected();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.ModelChangeStructureDataType#getAffected <em>Affected</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Affected</em>' containment reference.
	 * @see #isSetAffected()
	 * @see #unsetAffected()
	 * @see #getAffected()
	 * @generated
	 */
	void setAffected(NodeId value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.ModelChangeStructureDataType#getAffected <em>Affected</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAffected()
	 * @see #getAffected()
	 * @see #setAffected(NodeId)
	 * @generated
	 */
	void unsetAffected();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.ModelChangeStructureDataType#getAffected <em>Affected</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Affected</em>' containment reference is set.
	 * @see #unsetAffected()
	 * @see #getAffected()
	 * @see #setAffected(NodeId)
	 * @generated
	 */
	boolean isSetAffected();

	/**
	 * Returns the value of the '<em><b>Affected Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Affected Type</em>' containment reference.
	 * @see #isSetAffectedType()
	 * @see #unsetAffectedType()
	 * @see #setAffectedType(NodeId)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getModelChangeStructureDataType_AffectedType()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='AffectedType' namespace='##targetNamespace'"
	 * @generated
	 */
	NodeId getAffectedType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.ModelChangeStructureDataType#getAffectedType <em>Affected Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Affected Type</em>' containment reference.
	 * @see #isSetAffectedType()
	 * @see #unsetAffectedType()
	 * @see #getAffectedType()
	 * @generated
	 */
	void setAffectedType(NodeId value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.ModelChangeStructureDataType#getAffectedType <em>Affected Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAffectedType()
	 * @see #getAffectedType()
	 * @see #setAffectedType(NodeId)
	 * @generated
	 */
	void unsetAffectedType();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.ModelChangeStructureDataType#getAffectedType <em>Affected Type</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Affected Type</em>' containment reference is set.
	 * @see #unsetAffectedType()
	 * @see #getAffectedType()
	 * @see #setAffectedType(NodeId)
	 * @generated
	 */
	boolean isSetAffectedType();

	/**
	 * Returns the value of the '<em><b>Verb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Verb</em>' attribute.
	 * @see #isSetVerb()
	 * @see #unsetVerb()
	 * @see #setVerb(short)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getModelChangeStructureDataType_Verb()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedByte"
	 *        extendedMetaData="kind='element' name='Verb' namespace='##targetNamespace'"
	 * @generated
	 */
	short getVerb();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.ModelChangeStructureDataType#getVerb <em>Verb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verb</em>' attribute.
	 * @see #isSetVerb()
	 * @see #unsetVerb()
	 * @see #getVerb()
	 * @generated
	 */
	void setVerb(short value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.ModelChangeStructureDataType#getVerb <em>Verb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVerb()
	 * @see #getVerb()
	 * @see #setVerb(short)
	 * @generated
	 */
	void unsetVerb();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.ModelChangeStructureDataType#getVerb <em>Verb</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Verb</em>' attribute is set.
	 * @see #unsetVerb()
	 * @see #getVerb()
	 * @see #setVerb(short)
	 * @generated
	 */
	boolean isSetVerb();

} // ModelChangeStructureDataType
