/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Type Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DataTypeDescription#getDataTypeId <em>Data Type Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DataTypeDescription#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDataTypeDescription()
 * @model extendedMetaData="name='DataTypeDescription' kind='elementOnly'"
 * @generated
 */
public interface DataTypeDescription extends EObject {
	/**
	 * Returns the value of the '<em><b>Data Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type Id</em>' containment reference.
	 * @see #isSetDataTypeId()
	 * @see #unsetDataTypeId()
	 * @see #setDataTypeId(NodeId)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDataTypeDescription_DataTypeId()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='DataTypeId' namespace='##targetNamespace'"
	 * @generated
	 */
	NodeId getDataTypeId();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DataTypeDescription#getDataTypeId <em>Data Type Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type Id</em>' containment reference.
	 * @see #isSetDataTypeId()
	 * @see #unsetDataTypeId()
	 * @see #getDataTypeId()
	 * @generated
	 */
	void setDataTypeId(NodeId value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.DataTypeDescription#getDataTypeId <em>Data Type Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDataTypeId()
	 * @see #getDataTypeId()
	 * @see #setDataTypeId(NodeId)
	 * @generated
	 */
	void unsetDataTypeId();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.DataTypeDescription#getDataTypeId <em>Data Type Id</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Data Type Id</em>' containment reference is set.
	 * @see #unsetDataTypeId()
	 * @see #getDataTypeId()
	 * @see #setDataTypeId(NodeId)
	 * @generated
	 */
	boolean isSetDataTypeId();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #isSetName()
	 * @see #unsetName()
	 * @see #setName(QualifiedName)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDataTypeDescription_Name()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='Name' namespace='##targetNamespace'"
	 * @generated
	 */
	QualifiedName getName();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DataTypeDescription#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #isSetName()
	 * @see #unsetName()
	 * @see #getName()
	 * @generated
	 */
	void setName(QualifiedName value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.DataTypeDescription#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetName()
	 * @see #getName()
	 * @see #setName(QualifiedName)
	 * @generated
	 */
	void unsetName();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.DataTypeDescription#getName <em>Name</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Name</em>' containment reference is set.
	 * @see #unsetName()
	 * @see #getName()
	 * @see #setName(QualifiedName)
	 * @generated
	 */
	boolean isSetName();

} // DataTypeDescription
