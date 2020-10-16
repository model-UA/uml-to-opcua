/**
 */
package org.opcfoundation.ua._2011._03.ua.node.set;

import java.util.List;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Type Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.DataTypeDefinition#getField <em>Field</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.DataTypeDefinition#getBaseType <em>Base Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.DataTypeDefinition#isIsOptionSet <em>Is Option Set</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.DataTypeDefinition#isIsUnion <em>Is Union</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.DataTypeDefinition#getName <em>Name</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.DataTypeDefinition#getSymbolicName <em>Symbolic Name</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2011._03.ua.node.set.SetPackage#getDataTypeDefinition()
 * @model extendedMetaData="name='DataTypeDefinition' kind='elementOnly'"
 * @generated
 */
public interface DataTypeDefinition extends EObject {
	/**
	 * Returns the value of the '<em><b>Field</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2011._03.ua.node.set.DataTypeField}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field</em>' containment reference list.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.SetPackage#getDataTypeDefinition_Field()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Field' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DataTypeField> getField();

	/**
	 * Returns the value of the '<em><b>Base Type</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Type</em>' attribute.
	 * @see #isSetBaseType()
	 * @see #unsetBaseType()
	 * @see #setBaseType(String)
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.SetPackage#getDataTypeDefinition_BaseType()
	 * @model default="" unsettable="true" dataType="org.opcfoundation.ua._2011._03.ua.node.set.QualifiedName"
	 *        extendedMetaData="kind='attribute' name='BaseType'"
	 * @generated
	 */
	String getBaseType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.DataTypeDefinition#getBaseType <em>Base Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Type</em>' attribute.
	 * @see #isSetBaseType()
	 * @see #unsetBaseType()
	 * @see #getBaseType()
	 * @generated
	 */
	void setBaseType(String value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.DataTypeDefinition#getBaseType <em>Base Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBaseType()
	 * @see #getBaseType()
	 * @see #setBaseType(String)
	 * @generated
	 */
	void unsetBaseType();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.DataTypeDefinition#getBaseType <em>Base Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Base Type</em>' attribute is set.
	 * @see #unsetBaseType()
	 * @see #getBaseType()
	 * @see #setBaseType(String)
	 * @generated
	 */
	boolean isSetBaseType();

	/**
	 * Returns the value of the '<em><b>Is Option Set</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Option Set</em>' attribute.
	 * @see #isSetIsOptionSet()
	 * @see #unsetIsOptionSet()
	 * @see #setIsOptionSet(boolean)
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.SetPackage#getDataTypeDefinition_IsOptionSet()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='IsOptionSet'"
	 * @generated
	 */
	boolean isIsOptionSet();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.DataTypeDefinition#isIsOptionSet <em>Is Option Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Option Set</em>' attribute.
	 * @see #isSetIsOptionSet()
	 * @see #unsetIsOptionSet()
	 * @see #isIsOptionSet()
	 * @generated
	 */
	void setIsOptionSet(boolean value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.DataTypeDefinition#isIsOptionSet <em>Is Option Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsOptionSet()
	 * @see #isIsOptionSet()
	 * @see #setIsOptionSet(boolean)
	 * @generated
	 */
	void unsetIsOptionSet();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.DataTypeDefinition#isIsOptionSet <em>Is Option Set</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Option Set</em>' attribute is set.
	 * @see #unsetIsOptionSet()
	 * @see #isIsOptionSet()
	 * @see #setIsOptionSet(boolean)
	 * @generated
	 */
	boolean isSetIsOptionSet();

	/**
	 * Returns the value of the '<em><b>Is Union</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Union</em>' attribute.
	 * @see #isSetIsUnion()
	 * @see #unsetIsUnion()
	 * @see #setIsUnion(boolean)
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.SetPackage#getDataTypeDefinition_IsUnion()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='IsUnion'"
	 * @generated
	 */
	boolean isIsUnion();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.DataTypeDefinition#isIsUnion <em>Is Union</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Union</em>' attribute.
	 * @see #isSetIsUnion()
	 * @see #unsetIsUnion()
	 * @see #isIsUnion()
	 * @generated
	 */
	void setIsUnion(boolean value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.DataTypeDefinition#isIsUnion <em>Is Union</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsUnion()
	 * @see #isIsUnion()
	 * @see #setIsUnion(boolean)
	 * @generated
	 */
	void unsetIsUnion();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.DataTypeDefinition#isIsUnion <em>Is Union</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Union</em>' attribute is set.
	 * @see #unsetIsUnion()
	 * @see #isIsUnion()
	 * @see #setIsUnion(boolean)
	 * @generated
	 */
	boolean isSetIsUnion();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.SetPackage#getDataTypeDefinition_Name()
	 * @model dataType="org.opcfoundation.ua._2011._03.ua.node.set.QualifiedName" required="true"
	 *        extendedMetaData="kind='attribute' name='Name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.DataTypeDefinition#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Symbolic Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Symbolic Name</em>' attribute.
	 * @see #isSetSymbolicName()
	 * @see #unsetSymbolicName()
	 * @see #setSymbolicName(List)
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.SetPackage#getDataTypeDefinition_SymbolicName()
	 * @model default="" unsettable="true" dataType="org.opcfoundation.ua._2011._03.ua.node.set.SymbolicName" many="false"
	 *        extendedMetaData="kind='attribute' name='SymbolicName'"
	 * @generated
	 */
	List<String> getSymbolicName();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.DataTypeDefinition#getSymbolicName <em>Symbolic Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Symbolic Name</em>' attribute.
	 * @see #isSetSymbolicName()
	 * @see #unsetSymbolicName()
	 * @see #getSymbolicName()
	 * @generated
	 */
	void setSymbolicName(List<String> value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.DataTypeDefinition#getSymbolicName <em>Symbolic Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSymbolicName()
	 * @see #getSymbolicName()
	 * @see #setSymbolicName(List)
	 * @generated
	 */
	void unsetSymbolicName();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.DataTypeDefinition#getSymbolicName <em>Symbolic Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Symbolic Name</em>' attribute is set.
	 * @see #unsetSymbolicName()
	 * @see #getSymbolicName()
	 * @see #setSymbolicName(List)
	 * @generated
	 */
	boolean isSetSymbolicName();

} // DataTypeDefinition
