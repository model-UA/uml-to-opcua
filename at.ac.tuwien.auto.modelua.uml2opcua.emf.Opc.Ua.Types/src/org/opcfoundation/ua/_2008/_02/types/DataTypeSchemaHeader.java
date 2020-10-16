/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Type Schema Header</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DataTypeSchemaHeader#getNamespaces <em>Namespaces</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DataTypeSchemaHeader#getStructureDataTypes <em>Structure Data Types</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DataTypeSchemaHeader#getEnumDataTypes <em>Enum Data Types</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DataTypeSchemaHeader#getSimpleDataTypes <em>Simple Data Types</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDataTypeSchemaHeader()
 * @model extendedMetaData="name='DataTypeSchemaHeader' kind='elementOnly'"
 * @generated
 */
public interface DataTypeSchemaHeader extends EObject {
	/**
	 * Returns the value of the '<em><b>Namespaces</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Namespaces</em>' containment reference.
	 * @see #isSetNamespaces()
	 * @see #unsetNamespaces()
	 * @see #setNamespaces(ListOfString)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDataTypeSchemaHeader_Namespaces()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='Namespaces' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfString getNamespaces();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DataTypeSchemaHeader#getNamespaces <em>Namespaces</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Namespaces</em>' containment reference.
	 * @see #isSetNamespaces()
	 * @see #unsetNamespaces()
	 * @see #getNamespaces()
	 * @generated
	 */
	void setNamespaces(ListOfString value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.DataTypeSchemaHeader#getNamespaces <em>Namespaces</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNamespaces()
	 * @see #getNamespaces()
	 * @see #setNamespaces(ListOfString)
	 * @generated
	 */
	void unsetNamespaces();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.DataTypeSchemaHeader#getNamespaces <em>Namespaces</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Namespaces</em>' containment reference is set.
	 * @see #unsetNamespaces()
	 * @see #getNamespaces()
	 * @see #setNamespaces(ListOfString)
	 * @generated
	 */
	boolean isSetNamespaces();

	/**
	 * Returns the value of the '<em><b>Structure Data Types</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structure Data Types</em>' containment reference.
	 * @see #isSetStructureDataTypes()
	 * @see #unsetStructureDataTypes()
	 * @see #setStructureDataTypes(ListOfStructureDescription)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDataTypeSchemaHeader_StructureDataTypes()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='StructureDataTypes' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfStructureDescription getStructureDataTypes();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DataTypeSchemaHeader#getStructureDataTypes <em>Structure Data Types</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Structure Data Types</em>' containment reference.
	 * @see #isSetStructureDataTypes()
	 * @see #unsetStructureDataTypes()
	 * @see #getStructureDataTypes()
	 * @generated
	 */
	void setStructureDataTypes(ListOfStructureDescription value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.DataTypeSchemaHeader#getStructureDataTypes <em>Structure Data Types</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStructureDataTypes()
	 * @see #getStructureDataTypes()
	 * @see #setStructureDataTypes(ListOfStructureDescription)
	 * @generated
	 */
	void unsetStructureDataTypes();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.DataTypeSchemaHeader#getStructureDataTypes <em>Structure Data Types</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Structure Data Types</em>' containment reference is set.
	 * @see #unsetStructureDataTypes()
	 * @see #getStructureDataTypes()
	 * @see #setStructureDataTypes(ListOfStructureDescription)
	 * @generated
	 */
	boolean isSetStructureDataTypes();

	/**
	 * Returns the value of the '<em><b>Enum Data Types</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enum Data Types</em>' containment reference.
	 * @see #isSetEnumDataTypes()
	 * @see #unsetEnumDataTypes()
	 * @see #setEnumDataTypes(ListOfEnumDescription)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDataTypeSchemaHeader_EnumDataTypes()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='EnumDataTypes' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfEnumDescription getEnumDataTypes();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DataTypeSchemaHeader#getEnumDataTypes <em>Enum Data Types</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enum Data Types</em>' containment reference.
	 * @see #isSetEnumDataTypes()
	 * @see #unsetEnumDataTypes()
	 * @see #getEnumDataTypes()
	 * @generated
	 */
	void setEnumDataTypes(ListOfEnumDescription value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.DataTypeSchemaHeader#getEnumDataTypes <em>Enum Data Types</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEnumDataTypes()
	 * @see #getEnumDataTypes()
	 * @see #setEnumDataTypes(ListOfEnumDescription)
	 * @generated
	 */
	void unsetEnumDataTypes();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.DataTypeSchemaHeader#getEnumDataTypes <em>Enum Data Types</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Enum Data Types</em>' containment reference is set.
	 * @see #unsetEnumDataTypes()
	 * @see #getEnumDataTypes()
	 * @see #setEnumDataTypes(ListOfEnumDescription)
	 * @generated
	 */
	boolean isSetEnumDataTypes();

	/**
	 * Returns the value of the '<em><b>Simple Data Types</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simple Data Types</em>' containment reference.
	 * @see #isSetSimpleDataTypes()
	 * @see #unsetSimpleDataTypes()
	 * @see #setSimpleDataTypes(ListOfSimpleTypeDescription)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDataTypeSchemaHeader_SimpleDataTypes()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='SimpleDataTypes' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfSimpleTypeDescription getSimpleDataTypes();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DataTypeSchemaHeader#getSimpleDataTypes <em>Simple Data Types</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Simple Data Types</em>' containment reference.
	 * @see #isSetSimpleDataTypes()
	 * @see #unsetSimpleDataTypes()
	 * @see #getSimpleDataTypes()
	 * @generated
	 */
	void setSimpleDataTypes(ListOfSimpleTypeDescription value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.DataTypeSchemaHeader#getSimpleDataTypes <em>Simple Data Types</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSimpleDataTypes()
	 * @see #getSimpleDataTypes()
	 * @see #setSimpleDataTypes(ListOfSimpleTypeDescription)
	 * @generated
	 */
	void unsetSimpleDataTypes();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.DataTypeSchemaHeader#getSimpleDataTypes <em>Simple Data Types</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Simple Data Types</em>' containment reference is set.
	 * @see #unsetSimpleDataTypes()
	 * @see #getSimpleDataTypes()
	 * @see #setSimpleDataTypes(ListOfSimpleTypeDescription)
	 * @generated
	 */
	boolean isSetSimpleDataTypes();

} // DataTypeSchemaHeader
