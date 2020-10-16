/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Argument</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.Argument#getName <em>Name</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.Argument#getDataType <em>Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.Argument#getValueRank <em>Value Rank</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.Argument#getArrayDimensions <em>Array Dimensions</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.Argument#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getArgument()
 * @model extendedMetaData="name='Argument' kind='elementOnly'"
 * @generated
 */
public interface Argument extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #isSetName()
	 * @see #unsetName()
	 * @see #setName(String)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getArgument_Name()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.Argument#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #isSetName()
	 * @see #unsetName()
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.Argument#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetName()
	 * @see #getName()
	 * @see #setName(String)
	 * @generated
	 */
	void unsetName();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.Argument#getName <em>Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Name</em>' attribute is set.
	 * @see #unsetName()
	 * @see #getName()
	 * @see #setName(String)
	 * @generated
	 */
	boolean isSetName();

	/**
	 * Returns the value of the '<em><b>Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type</em>' containment reference.
	 * @see #isSetDataType()
	 * @see #unsetDataType()
	 * @see #setDataType(NodeId)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getArgument_DataType()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='DataType' namespace='##targetNamespace'"
	 * @generated
	 */
	NodeId getDataType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.Argument#getDataType <em>Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type</em>' containment reference.
	 * @see #isSetDataType()
	 * @see #unsetDataType()
	 * @see #getDataType()
	 * @generated
	 */
	void setDataType(NodeId value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.Argument#getDataType <em>Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDataType()
	 * @see #getDataType()
	 * @see #setDataType(NodeId)
	 * @generated
	 */
	void unsetDataType();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.Argument#getDataType <em>Data Type</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Data Type</em>' containment reference is set.
	 * @see #unsetDataType()
	 * @see #getDataType()
	 * @see #setDataType(NodeId)
	 * @generated
	 */
	boolean isSetDataType();

	/**
	 * Returns the value of the '<em><b>Value Rank</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Rank</em>' attribute.
	 * @see #isSetValueRank()
	 * @see #unsetValueRank()
	 * @see #setValueRank(int)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getArgument_ValueRank()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='element' name='ValueRank' namespace='##targetNamespace'"
	 * @generated
	 */
	int getValueRank();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.Argument#getValueRank <em>Value Rank</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Rank</em>' attribute.
	 * @see #isSetValueRank()
	 * @see #unsetValueRank()
	 * @see #getValueRank()
	 * @generated
	 */
	void setValueRank(int value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.Argument#getValueRank <em>Value Rank</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValueRank()
	 * @see #getValueRank()
	 * @see #setValueRank(int)
	 * @generated
	 */
	void unsetValueRank();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.Argument#getValueRank <em>Value Rank</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Value Rank</em>' attribute is set.
	 * @see #unsetValueRank()
	 * @see #getValueRank()
	 * @see #setValueRank(int)
	 * @generated
	 */
	boolean isSetValueRank();

	/**
	 * Returns the value of the '<em><b>Array Dimensions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Array Dimensions</em>' containment reference.
	 * @see #isSetArrayDimensions()
	 * @see #unsetArrayDimensions()
	 * @see #setArrayDimensions(ListOfUInt32)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getArgument_ArrayDimensions()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='ArrayDimensions' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfUInt32 getArrayDimensions();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.Argument#getArrayDimensions <em>Array Dimensions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Array Dimensions</em>' containment reference.
	 * @see #isSetArrayDimensions()
	 * @see #unsetArrayDimensions()
	 * @see #getArrayDimensions()
	 * @generated
	 */
	void setArrayDimensions(ListOfUInt32 value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.Argument#getArrayDimensions <em>Array Dimensions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetArrayDimensions()
	 * @see #getArrayDimensions()
	 * @see #setArrayDimensions(ListOfUInt32)
	 * @generated
	 */
	void unsetArrayDimensions();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.Argument#getArrayDimensions <em>Array Dimensions</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Array Dimensions</em>' containment reference is set.
	 * @see #unsetArrayDimensions()
	 * @see #getArrayDimensions()
	 * @see #setArrayDimensions(ListOfUInt32)
	 * @generated
	 */
	boolean isSetArrayDimensions();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #isSetDescription()
	 * @see #unsetDescription()
	 * @see #setDescription(LocalizedText)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getArgument_Description()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='Description' namespace='##targetNamespace'"
	 * @generated
	 */
	LocalizedText getDescription();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.Argument#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #isSetDescription()
	 * @see #unsetDescription()
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(LocalizedText value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.Argument#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDescription()
	 * @see #getDescription()
	 * @see #setDescription(LocalizedText)
	 * @generated
	 */
	void unsetDescription();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.Argument#getDescription <em>Description</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Description</em>' containment reference is set.
	 * @see #unsetDescription()
	 * @see #getDescription()
	 * @see #setDescription(LocalizedText)
	 * @generated
	 */
	boolean isSetDescription();

} // Argument
