/**
 */
package org.opcfoundation.ua._2011._03.ua.node.set;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.opcfoundation.ua._2011._03.ua.node.set.SetFactory
 * @model kind="package"
 * @generated
 */
public interface SetPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "set";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://opcfoundation.org/UA/2011/03/UANodeSet.xsd";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SetPackage eINSTANCE = org.opcfoundation.ua._2011._03.ua.node.set.impl.SetPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.AliasTableImpl <em>Alias Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.AliasTableImpl
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.SetPackageImpl#getAliasTable()
	 * @generated
	 */
	int ALIAS_TABLE = 0;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_TABLE__ALIAS = 0;

	/**
	 * The number of structural features of the '<em>Alias Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_TABLE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Alias Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_TABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.DataTypeDefinitionImpl <em>Data Type Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.DataTypeDefinitionImpl
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.SetPackageImpl#getDataTypeDefinition()
	 * @generated
	 */
	int DATA_TYPE_DEFINITION = 1;

	/**
	 * The feature id for the '<em><b>Field</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_DEFINITION__FIELD = 0;

	/**
	 * The feature id for the '<em><b>Base Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_DEFINITION__BASE_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Is Option Set</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_DEFINITION__IS_OPTION_SET = 2;

	/**
	 * The feature id for the '<em><b>Is Union</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_DEFINITION__IS_UNION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_DEFINITION__NAME = 4;

	/**
	 * The feature id for the '<em><b>Symbolic Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_DEFINITION__SYMBOLIC_NAME = 5;

	/**
	 * The number of structural features of the '<em>Data Type Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_DEFINITION_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Data Type Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_DEFINITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.DataTypeFieldImpl <em>Data Type Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.DataTypeFieldImpl
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.SetPackageImpl#getDataTypeField()
	 * @generated
	 */
	int DATA_TYPE_FIELD = 2;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FIELD__DISPLAY_NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FIELD__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Array Dimensions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FIELD__ARRAY_DIMENSIONS = 2;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FIELD__DATA_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Is Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FIELD__IS_OPTIONAL = 4;

	/**
	 * The feature id for the '<em><b>Max String Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FIELD__MAX_STRING_LENGTH = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FIELD__NAME = 6;

	/**
	 * The feature id for the '<em><b>Symbolic Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FIELD__SYMBOLIC_NAME = 7;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FIELD__VALUE = 8;

	/**
	 * The feature id for the '<em><b>Value Rank</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FIELD__VALUE_RANK = 9;

	/**
	 * The number of structural features of the '<em>Data Type Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FIELD_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Data Type Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FIELD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.DocumentRootImpl
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.SetPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 3;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>UA Node Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__UA_NODE_SET = 3;

	/**
	 * The feature id for the '<em><b>UA Node Set Changes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__UA_NODE_SET_CHANGES = 4;

	/**
	 * The feature id for the '<em><b>UA Node Set Changes Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__UA_NODE_SET_CHANGES_STATUS = 5;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.ExtensionTypeImpl <em>Extension Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.ExtensionTypeImpl
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.SetPackageImpl#getExtensionType()
	 * @generated
	 */
	int EXTENSION_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_TYPE__ANY = 0;

	/**
	 * The number of structural features of the '<em>Extension Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Extension Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.ListOfExtensionsImpl <em>List Of Extensions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.ListOfExtensionsImpl
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.SetPackageImpl#getListOfExtensions()
	 * @generated
	 */
	int LIST_OF_EXTENSIONS = 5;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OF_EXTENSIONS__EXTENSION = 0;

	/**
	 * The number of structural features of the '<em>List Of Extensions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OF_EXTENSIONS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>List Of Extensions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OF_EXTENSIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.ListOfReferencesImpl <em>List Of References</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.ListOfReferencesImpl
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.SetPackageImpl#getListOfReferences()
	 * @generated
	 */
	int LIST_OF_REFERENCES = 6;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OF_REFERENCES__REFERENCE = 0;

	/**
	 * The number of structural features of the '<em>List Of References</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OF_REFERENCES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>List Of References</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OF_REFERENCES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.ListOfRolePermissionsImpl <em>List Of Role Permissions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.ListOfRolePermissionsImpl
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.SetPackageImpl#getListOfRolePermissions()
	 * @generated
	 */
	int LIST_OF_ROLE_PERMISSIONS = 7;

	/**
	 * The feature id for the '<em><b>Role Permission</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OF_ROLE_PERMISSIONS__ROLE_PERMISSION = 0;

	/**
	 * The number of structural features of the '<em>List Of Role Permissions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OF_ROLE_PERMISSIONS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>List Of Role Permissions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OF_ROLE_PERMISSIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.LocalizedTextImpl <em>Localized Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.LocalizedTextImpl
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.SetPackageImpl#getLocalizedText()
	 * @generated
	 */
	int LOCALIZED_TEXT = 8;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALIZED_TEXT__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Locale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALIZED_TEXT__LOCALE = 1;

	/**
	 * The number of structural features of the '<em>Localized Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALIZED_TEXT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Localized Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALIZED_TEXT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.ModelTableImpl <em>Model Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.ModelTableImpl
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.SetPackageImpl#getModelTable()
	 * @generated
	 */
	int MODEL_TABLE = 9;

	/**
	 * The feature id for the '<em><b>Model</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TABLE__MODEL = 0;

	/**
	 * The number of structural features of the '<em>Model Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TABLE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Model Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.ModelTableEntryImpl <em>Model Table Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.ModelTableEntryImpl
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.SetPackageImpl#getModelTableEntry()
	 * @generated
	 */
	int MODEL_TABLE_ENTRY = 10;

	/**
	 * The feature id for the '<em><b>Role Permissions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TABLE_ENTRY__ROLE_PERMISSIONS = 0;

	/**
	 * The feature id for the '<em><b>Required Model</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TABLE_ENTRY__REQUIRED_MODEL = 1;

	/**
	 * The feature id for the '<em><b>Access Restrictions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TABLE_ENTRY__ACCESS_RESTRICTIONS = 2;

	/**
	 * The feature id for the '<em><b>Model Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TABLE_ENTRY__MODEL_URI = 3;

	/**
	 * The feature id for the '<em><b>Publication Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TABLE_ENTRY__PUBLICATION_DATE = 4;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TABLE_ENTRY__VERSION = 5;

	/**
	 * The number of structural features of the '<em>Model Table Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TABLE_ENTRY_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Model Table Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TABLE_ENTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.NodeIdAliasImpl <em>Node Id Alias</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.NodeIdAliasImpl
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.SetPackageImpl#getNodeIdAlias()
	 * @generated
	 */
	int NODE_ID_ALIAS = 11;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ID_ALIAS__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ID_ALIAS__ALIAS = 1;

	/**
	 * The number of structural features of the '<em>Node Id Alias</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ID_ALIAS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Node Id Alias</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ID_ALIAS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.NodeSetStatusImpl <em>Node Set Status</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.NodeSetStatusImpl
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.SetPackageImpl#getNodeSetStatus()
	 * @generated
	 */
	int NODE_SET_STATUS = 12;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_SET_STATUS__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_SET_STATUS__CODE = 1;

	/**
	 * The number of structural features of the '<em>Node Set Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_SET_STATUS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Node Set Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_SET_STATUS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.NodeSetStatusListImpl <em>Node Set Status List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.NodeSetStatusListImpl
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.SetPackageImpl#getNodeSetStatusList()
	 * @generated
	 */
	int NODE_SET_STATUS_LIST = 13;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_SET_STATUS_LIST__STATUS = 0;

	/**
	 * The number of structural features of the '<em>Node Set Status List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_SET_STATUS_LIST_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Node Set Status List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_SET_STATUS_LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.NodesToAddImpl <em>Nodes To Add</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.NodesToAddImpl
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.SetPackageImpl#getNodesToAdd()
	 * @generated
	 */
	int NODES_TO_ADD = 14;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODES_TO_ADD__GROUP = 0;

	/**
	 * The feature id for the '<em><b>UA Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODES_TO_ADD__UA_OBJECT = 1;

	/**
	 * The feature id for the '<em><b>UA Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODES_TO_ADD__UA_VARIABLE = 2;

	/**
	 * The feature id for the '<em><b>UA Method</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODES_TO_ADD__UA_METHOD = 3;

	/**
	 * The feature id for the '<em><b>UA View</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODES_TO_ADD__UA_VIEW = 4;

	/**
	 * The feature id for the '<em><b>UA Object Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODES_TO_ADD__UA_OBJECT_TYPE = 5;

	/**
	 * The feature id for the '<em><b>UA Variable Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODES_TO_ADD__UA_VARIABLE_TYPE = 6;

	/**
	 * The feature id for the '<em><b>UA Data Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODES_TO_ADD__UA_DATA_TYPE = 7;

	/**
	 * The feature id for the '<em><b>UA Reference Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODES_TO_ADD__UA_REFERENCE_TYPE = 8;

	/**
	 * The number of structural features of the '<em>Nodes To Add</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODES_TO_ADD_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Nodes To Add</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODES_TO_ADD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.NodesToDeleteImpl <em>Nodes To Delete</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.NodesToDeleteImpl
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.SetPackageImpl#getNodesToDelete()
	 * @generated
	 */
	int NODES_TO_DELETE = 15;

	/**
	 * The feature id for the '<em><b>Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODES_TO_DELETE__NODE = 0;

	/**
	 * The number of structural features of the '<em>Nodes To Delete</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODES_TO_DELETE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Nodes To Delete</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODES_TO_DELETE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.NodeToDeleteImpl <em>Node To Delete</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.NodeToDeleteImpl
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.SetPackageImpl#getNodeToDelete()
	 * @generated
	 */
	int NODE_TO_DELETE = 16;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_TO_DELETE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Delete Reverse References</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_TO_DELETE__DELETE_REVERSE_REFERENCES = 1;

	/**
	 * The number of structural features of the '<em>Node To Delete</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_TO_DELETE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Node To Delete</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_TO_DELETE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.ReferenceImpl <em>Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.ReferenceImpl
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.SetPackageImpl#getReference()
	 * @generated
	 */
	int REFERENCE = 17;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Is Forward</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__IS_FORWARD = 1;

	/**
	 * The feature id for the '<em><b>Reference Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__REFERENCE_TYPE = 2;

	/**
	 * The number of structural features of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.ReferenceChangeImpl <em>Reference Change</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.ReferenceChangeImpl
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.SetPackageImpl#getReferenceChange()
	 * @generated
	 */
	int REFERENCE_CHANGE = 18;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_CHANGE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Is Forward</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_CHANGE__IS_FORWARD = 1;

	/**
	 * The feature id for the '<em><b>Reference Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_CHANGE__REFERENCE_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_CHANGE__SOURCE = 3;

	/**
	 * The number of structural features of the '<em>Reference Change</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_CHANGE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Reference Change</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_CHANGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.ReferencesToChangeImpl <em>References To Change</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.ReferencesToChangeImpl
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.SetPackageImpl#getReferencesToChange()
	 * @generated
	 */
	int REFERENCES_TO_CHANGE = 19;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCES_TO_CHANGE__REFERENCE = 0;

	/**
	 * The number of structural features of the '<em>References To Change</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCES_TO_CHANGE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>References To Change</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCES_TO_CHANGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.RolePermissionImpl <em>Role Permission</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.RolePermissionImpl
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.SetPackageImpl#getRolePermission()
	 * @generated
	 */
	int ROLE_PERMISSION = 20;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_PERMISSION__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Permissions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_PERMISSION__PERMISSIONS = 1;

	/**
	 * The number of structural features of the '<em>Role Permission</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_PERMISSION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Role Permission</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_PERMISSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.StructureTranslationTypeImpl <em>Structure Translation Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.StructureTranslationTypeImpl
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.SetPackageImpl#getStructureTranslationType()
	 * @generated
	 */
	int STRUCTURE_TRANSLATION_TYPE = 21;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_TRANSLATION_TYPE__TEXT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_TRANSLATION_TYPE__NAME = 1;

	/**
	 * The number of structural features of the '<em>Structure Translation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_TRANSLATION_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Structure Translation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_TRANSLATION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.TranslationTypeImpl <em>Translation Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.TranslationTypeImpl
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.SetPackageImpl#getTranslationType()
	 * @generated
	 */
	int TRANSLATION_TYPE = 22;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATION_TYPE__TEXT = 0;

	/**
	 * The feature id for the '<em><b>Field</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATION_TYPE__FIELD = 1;

	/**
	 * The number of structural features of the '<em>Translation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATION_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Translation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.UANodeImpl <em>UA Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.UANodeImpl
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.SetPackageImpl#getUANode()
	 * @generated
	 */
	int UA_NODE = 27;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_NODE__DISPLAY_NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_NODE__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_NODE__CATEGORY = 2;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_NODE__DOCUMENTATION = 3;

	/**
	 * The feature id for the '<em><b>References</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_NODE__REFERENCES = 4;

	/**
	 * The feature id for the '<em><b>Role Permissions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_NODE__ROLE_PERMISSIONS = 5;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_NODE__EXTENSIONS = 6;

	/**
	 * The feature id for the '<em><b>Access Restrictions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_NODE__ACCESS_RESTRICTIONS = 7;

	/**
	 * The feature id for the '<em><b>Browse Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_NODE__BROWSE_NAME = 8;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_NODE__NODE_ID = 9;

	/**
	 * The feature id for the '<em><b>Release Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_NODE__RELEASE_STATUS = 10;

	/**
	 * The feature id for the '<em><b>Symbolic Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_NODE__SYMBOLIC_NAME = 11;

	/**
	 * The feature id for the '<em><b>User Write Mask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_NODE__USER_WRITE_MASK = 12;

	/**
	 * The feature id for the '<em><b>Write Mask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_NODE__WRITE_MASK = 13;

	/**
	 * The number of structural features of the '<em>UA Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_NODE_FEATURE_COUNT = 14;

	/**
	 * The number of operations of the '<em>UA Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_NODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.UATypeImpl <em>UA Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.UATypeImpl
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.SetPackageImpl#getUAType()
	 * @generated
	 */
	int UA_TYPE = 34;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_TYPE__DISPLAY_NAME = UA_NODE__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_TYPE__DESCRIPTION = UA_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_TYPE__CATEGORY = UA_NODE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_TYPE__DOCUMENTATION = UA_NODE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>References</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_TYPE__REFERENCES = UA_NODE__REFERENCES;

	/**
	 * The feature id for the '<em><b>Role Permissions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_TYPE__ROLE_PERMISSIONS = UA_NODE__ROLE_PERMISSIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_TYPE__EXTENSIONS = UA_NODE__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Access Restrictions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_TYPE__ACCESS_RESTRICTIONS = UA_NODE__ACCESS_RESTRICTIONS;

	/**
	 * The feature id for the '<em><b>Browse Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_TYPE__BROWSE_NAME = UA_NODE__BROWSE_NAME;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_TYPE__NODE_ID = UA_NODE__NODE_ID;

	/**
	 * The feature id for the '<em><b>Release Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_TYPE__RELEASE_STATUS = UA_NODE__RELEASE_STATUS;

	/**
	 * The feature id for the '<em><b>Symbolic Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_TYPE__SYMBOLIC_NAME = UA_NODE__SYMBOLIC_NAME;

	/**
	 * The feature id for the '<em><b>User Write Mask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_TYPE__USER_WRITE_MASK = UA_NODE__USER_WRITE_MASK;

	/**
	 * The feature id for the '<em><b>Write Mask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_TYPE__WRITE_MASK = UA_NODE__WRITE_MASK;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_TYPE__IS_ABSTRACT = UA_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>UA Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_TYPE_FEATURE_COUNT = UA_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>UA Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_TYPE_OPERATION_COUNT = UA_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.UADataTypeImpl <em>UA Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.UADataTypeImpl
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.SetPackageImpl#getUADataType()
	 * @generated
	 */
	int UA_DATA_TYPE = 23;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_DATA_TYPE__DISPLAY_NAME = UA_TYPE__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_DATA_TYPE__DESCRIPTION = UA_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_DATA_TYPE__CATEGORY = UA_TYPE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_DATA_TYPE__DOCUMENTATION = UA_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>References</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_DATA_TYPE__REFERENCES = UA_TYPE__REFERENCES;

	/**
	 * The feature id for the '<em><b>Role Permissions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_DATA_TYPE__ROLE_PERMISSIONS = UA_TYPE__ROLE_PERMISSIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_DATA_TYPE__EXTENSIONS = UA_TYPE__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Access Restrictions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_DATA_TYPE__ACCESS_RESTRICTIONS = UA_TYPE__ACCESS_RESTRICTIONS;

	/**
	 * The feature id for the '<em><b>Browse Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_DATA_TYPE__BROWSE_NAME = UA_TYPE__BROWSE_NAME;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_DATA_TYPE__NODE_ID = UA_TYPE__NODE_ID;

	/**
	 * The feature id for the '<em><b>Release Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_DATA_TYPE__RELEASE_STATUS = UA_TYPE__RELEASE_STATUS;

	/**
	 * The feature id for the '<em><b>Symbolic Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_DATA_TYPE__SYMBOLIC_NAME = UA_TYPE__SYMBOLIC_NAME;

	/**
	 * The feature id for the '<em><b>User Write Mask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_DATA_TYPE__USER_WRITE_MASK = UA_TYPE__USER_WRITE_MASK;

	/**
	 * The feature id for the '<em><b>Write Mask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_DATA_TYPE__WRITE_MASK = UA_TYPE__WRITE_MASK;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_DATA_TYPE__IS_ABSTRACT = UA_TYPE__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_DATA_TYPE__DEFINITION = UA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_DATA_TYPE__PURPOSE = UA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>UA Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_DATA_TYPE_FEATURE_COUNT = UA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>UA Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_DATA_TYPE_OPERATION_COUNT = UA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.UAInstanceImpl <em>UA Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.UAInstanceImpl
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.SetPackageImpl#getUAInstance()
	 * @generated
	 */
	int UA_INSTANCE = 24;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_INSTANCE__DISPLAY_NAME = UA_NODE__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_INSTANCE__DESCRIPTION = UA_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_INSTANCE__CATEGORY = UA_NODE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_INSTANCE__DOCUMENTATION = UA_NODE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>References</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_INSTANCE__REFERENCES = UA_NODE__REFERENCES;

	/**
	 * The feature id for the '<em><b>Role Permissions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_INSTANCE__ROLE_PERMISSIONS = UA_NODE__ROLE_PERMISSIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_INSTANCE__EXTENSIONS = UA_NODE__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Access Restrictions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_INSTANCE__ACCESS_RESTRICTIONS = UA_NODE__ACCESS_RESTRICTIONS;

	/**
	 * The feature id for the '<em><b>Browse Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_INSTANCE__BROWSE_NAME = UA_NODE__BROWSE_NAME;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_INSTANCE__NODE_ID = UA_NODE__NODE_ID;

	/**
	 * The feature id for the '<em><b>Release Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_INSTANCE__RELEASE_STATUS = UA_NODE__RELEASE_STATUS;

	/**
	 * The feature id for the '<em><b>Symbolic Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_INSTANCE__SYMBOLIC_NAME = UA_NODE__SYMBOLIC_NAME;

	/**
	 * The feature id for the '<em><b>User Write Mask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_INSTANCE__USER_WRITE_MASK = UA_NODE__USER_WRITE_MASK;

	/**
	 * The feature id for the '<em><b>Write Mask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_INSTANCE__WRITE_MASK = UA_NODE__WRITE_MASK;

	/**
	 * The feature id for the '<em><b>Parent Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_INSTANCE__PARENT_NODE_ID = UA_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>UA Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_INSTANCE_FEATURE_COUNT = UA_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>UA Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_INSTANCE_OPERATION_COUNT = UA_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.UAMethodImpl <em>UA Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.UAMethodImpl
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.SetPackageImpl#getUAMethod()
	 * @generated
	 */
	int UA_METHOD = 25;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_METHOD__DISPLAY_NAME = UA_INSTANCE__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_METHOD__DESCRIPTION = UA_INSTANCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_METHOD__CATEGORY = UA_INSTANCE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_METHOD__DOCUMENTATION = UA_INSTANCE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>References</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_METHOD__REFERENCES = UA_INSTANCE__REFERENCES;

	/**
	 * The feature id for the '<em><b>Role Permissions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_METHOD__ROLE_PERMISSIONS = UA_INSTANCE__ROLE_PERMISSIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_METHOD__EXTENSIONS = UA_INSTANCE__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Access Restrictions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_METHOD__ACCESS_RESTRICTIONS = UA_INSTANCE__ACCESS_RESTRICTIONS;

	/**
	 * The feature id for the '<em><b>Browse Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_METHOD__BROWSE_NAME = UA_INSTANCE__BROWSE_NAME;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_METHOD__NODE_ID = UA_INSTANCE__NODE_ID;

	/**
	 * The feature id for the '<em><b>Release Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_METHOD__RELEASE_STATUS = UA_INSTANCE__RELEASE_STATUS;

	/**
	 * The feature id for the '<em><b>Symbolic Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_METHOD__SYMBOLIC_NAME = UA_INSTANCE__SYMBOLIC_NAME;

	/**
	 * The feature id for the '<em><b>User Write Mask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_METHOD__USER_WRITE_MASK = UA_INSTANCE__USER_WRITE_MASK;

	/**
	 * The feature id for the '<em><b>Write Mask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_METHOD__WRITE_MASK = UA_INSTANCE__WRITE_MASK;

	/**
	 * The feature id for the '<em><b>Parent Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_METHOD__PARENT_NODE_ID = UA_INSTANCE__PARENT_NODE_ID;

	/**
	 * The feature id for the '<em><b>Argument Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_METHOD__ARGUMENT_DESCRIPTION = UA_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Executable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_METHOD__EXECUTABLE = UA_INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Method Declaration Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_METHOD__METHOD_DECLARATION_ID = UA_INSTANCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>User Executable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_METHOD__USER_EXECUTABLE = UA_INSTANCE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>UA Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_METHOD_FEATURE_COUNT = UA_INSTANCE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>UA Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_METHOD_OPERATION_COUNT = UA_INSTANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.UAMethodArgumentImpl <em>UA Method Argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.UAMethodArgumentImpl
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.SetPackageImpl#getUAMethodArgument()
	 * @generated
	 */
	int UA_METHOD_ARGUMENT = 26;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_METHOD_ARGUMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_METHOD_ARGUMENT__DESCRIPTION = 1;

	/**
	 * The number of structural features of the '<em>UA Method Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_METHOD_ARGUMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>UA Method Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_METHOD_ARGUMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.UANodeSetChangesStatusTypeImpl <em>UA Node Set Changes Status Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.UANodeSetChangesStatusTypeImpl
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.SetPackageImpl#getUANodeSetChangesStatusType()
	 * @generated
	 */
	int UA_NODE_SET_CHANGES_STATUS_TYPE = 28;

	/**
	 * The feature id for the '<em><b>Nodes To Add</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_NODE_SET_CHANGES_STATUS_TYPE__NODES_TO_ADD = 0;

	/**
	 * The feature id for the '<em><b>References To Add</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_NODE_SET_CHANGES_STATUS_TYPE__REFERENCES_TO_ADD = 1;

	/**
	 * The feature id for the '<em><b>Nodes To Delete</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_NODE_SET_CHANGES_STATUS_TYPE__NODES_TO_DELETE = 2;

	/**
	 * The feature id for the '<em><b>References To Delete</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_NODE_SET_CHANGES_STATUS_TYPE__REFERENCES_TO_DELETE = 3;

	/**
	 * The feature id for the '<em><b>Last Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_NODE_SET_CHANGES_STATUS_TYPE__LAST_MODIFIED = 4;

	/**
	 * The feature id for the '<em><b>Transaction Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_NODE_SET_CHANGES_STATUS_TYPE__TRANSACTION_ID = 5;

	/**
	 * The number of structural features of the '<em>UA Node Set Changes Status Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_NODE_SET_CHANGES_STATUS_TYPE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>UA Node Set Changes Status Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_NODE_SET_CHANGES_STATUS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.UANodeSetChangesTypeImpl <em>UA Node Set Changes Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.UANodeSetChangesTypeImpl
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.SetPackageImpl#getUANodeSetChangesType()
	 * @generated
	 */
	int UA_NODE_SET_CHANGES_TYPE = 29;

	/**
	 * The feature id for the '<em><b>Namespace Uris</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_NODE_SET_CHANGES_TYPE__NAMESPACE_URIS = 0;

	/**
	 * The feature id for the '<em><b>Server Uris</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_NODE_SET_CHANGES_TYPE__SERVER_URIS = 1;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_NODE_SET_CHANGES_TYPE__ALIASES = 2;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_NODE_SET_CHANGES_TYPE__EXTENSIONS = 3;

	/**
	 * The feature id for the '<em><b>Nodes To Add</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_NODE_SET_CHANGES_TYPE__NODES_TO_ADD = 4;

	/**
	 * The feature id for the '<em><b>References To Add</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_NODE_SET_CHANGES_TYPE__REFERENCES_TO_ADD = 5;

	/**
	 * The feature id for the '<em><b>Nodes To Delete</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_NODE_SET_CHANGES_TYPE__NODES_TO_DELETE = 6;

	/**
	 * The feature id for the '<em><b>References To Delete</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_NODE_SET_CHANGES_TYPE__REFERENCES_TO_DELETE = 7;

	/**
	 * The feature id for the '<em><b>Accept All Or Nothing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_NODE_SET_CHANGES_TYPE__ACCEPT_ALL_OR_NOTHING = 8;

	/**
	 * The feature id for the '<em><b>Last Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_NODE_SET_CHANGES_TYPE__LAST_MODIFIED = 9;

	/**
	 * The feature id for the '<em><b>Transaction Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_NODE_SET_CHANGES_TYPE__TRANSACTION_ID = 10;

	/**
	 * The number of structural features of the '<em>UA Node Set Changes Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_NODE_SET_CHANGES_TYPE_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>UA Node Set Changes Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_NODE_SET_CHANGES_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.UANodeSetTypeImpl <em>UA Node Set Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.UANodeSetTypeImpl
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.SetPackageImpl#getUANodeSetType()
	 * @generated
	 */
	int UA_NODE_SET_TYPE = 30;

	/**
	 * The feature id for the '<em><b>Namespace Uris</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_NODE_SET_TYPE__NAMESPACE_URIS = 0;

	/**
	 * The feature id for the '<em><b>Server Uris</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_NODE_SET_TYPE__SERVER_URIS = 1;

	/**
	 * The feature id for the '<em><b>Models</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_NODE_SET_TYPE__MODELS = 2;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_NODE_SET_TYPE__ALIASES = 3;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_NODE_SET_TYPE__EXTENSIONS = 4;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_NODE_SET_TYPE__GROUP = 5;

	/**
	 * The feature id for the '<em><b>UA Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_NODE_SET_TYPE__UA_OBJECT = 6;

	/**
	 * The feature id for the '<em><b>UA Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_NODE_SET_TYPE__UA_VARIABLE = 7;

	/**
	 * The feature id for the '<em><b>UA Method</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_NODE_SET_TYPE__UA_METHOD = 8;

	/**
	 * The feature id for the '<em><b>UA View</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_NODE_SET_TYPE__UA_VIEW = 9;

	/**
	 * The feature id for the '<em><b>UA Object Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_NODE_SET_TYPE__UA_OBJECT_TYPE = 10;

	/**
	 * The feature id for the '<em><b>UA Variable Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_NODE_SET_TYPE__UA_VARIABLE_TYPE = 11;

	/**
	 * The feature id for the '<em><b>UA Data Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_NODE_SET_TYPE__UA_DATA_TYPE = 12;

	/**
	 * The feature id for the '<em><b>UA Reference Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_NODE_SET_TYPE__UA_REFERENCE_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Last Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_NODE_SET_TYPE__LAST_MODIFIED = 14;

	/**
	 * The number of structural features of the '<em>UA Node Set Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_NODE_SET_TYPE_FEATURE_COUNT = 15;

	/**
	 * The number of operations of the '<em>UA Node Set Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_NODE_SET_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.UAObjectImpl <em>UA Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.UAObjectImpl
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.SetPackageImpl#getUAObject()
	 * @generated
	 */
	int UA_OBJECT = 31;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_OBJECT__DISPLAY_NAME = UA_INSTANCE__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_OBJECT__DESCRIPTION = UA_INSTANCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_OBJECT__CATEGORY = UA_INSTANCE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_OBJECT__DOCUMENTATION = UA_INSTANCE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>References</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_OBJECT__REFERENCES = UA_INSTANCE__REFERENCES;

	/**
	 * The feature id for the '<em><b>Role Permissions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_OBJECT__ROLE_PERMISSIONS = UA_INSTANCE__ROLE_PERMISSIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_OBJECT__EXTENSIONS = UA_INSTANCE__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Access Restrictions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_OBJECT__ACCESS_RESTRICTIONS = UA_INSTANCE__ACCESS_RESTRICTIONS;

	/**
	 * The feature id for the '<em><b>Browse Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_OBJECT__BROWSE_NAME = UA_INSTANCE__BROWSE_NAME;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_OBJECT__NODE_ID = UA_INSTANCE__NODE_ID;

	/**
	 * The feature id for the '<em><b>Release Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_OBJECT__RELEASE_STATUS = UA_INSTANCE__RELEASE_STATUS;

	/**
	 * The feature id for the '<em><b>Symbolic Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_OBJECT__SYMBOLIC_NAME = UA_INSTANCE__SYMBOLIC_NAME;

	/**
	 * The feature id for the '<em><b>User Write Mask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_OBJECT__USER_WRITE_MASK = UA_INSTANCE__USER_WRITE_MASK;

	/**
	 * The feature id for the '<em><b>Write Mask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_OBJECT__WRITE_MASK = UA_INSTANCE__WRITE_MASK;

	/**
	 * The feature id for the '<em><b>Parent Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_OBJECT__PARENT_NODE_ID = UA_INSTANCE__PARENT_NODE_ID;

	/**
	 * The feature id for the '<em><b>Event Notifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_OBJECT__EVENT_NOTIFIER = UA_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>UA Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_OBJECT_FEATURE_COUNT = UA_INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>UA Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_OBJECT_OPERATION_COUNT = UA_INSTANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.UAObjectTypeImpl <em>UA Object Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.UAObjectTypeImpl
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.SetPackageImpl#getUAObjectType()
	 * @generated
	 */
	int UA_OBJECT_TYPE = 32;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_OBJECT_TYPE__DISPLAY_NAME = UA_TYPE__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_OBJECT_TYPE__DESCRIPTION = UA_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_OBJECT_TYPE__CATEGORY = UA_TYPE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_OBJECT_TYPE__DOCUMENTATION = UA_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>References</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_OBJECT_TYPE__REFERENCES = UA_TYPE__REFERENCES;

	/**
	 * The feature id for the '<em><b>Role Permissions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_OBJECT_TYPE__ROLE_PERMISSIONS = UA_TYPE__ROLE_PERMISSIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_OBJECT_TYPE__EXTENSIONS = UA_TYPE__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Access Restrictions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_OBJECT_TYPE__ACCESS_RESTRICTIONS = UA_TYPE__ACCESS_RESTRICTIONS;

	/**
	 * The feature id for the '<em><b>Browse Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_OBJECT_TYPE__BROWSE_NAME = UA_TYPE__BROWSE_NAME;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_OBJECT_TYPE__NODE_ID = UA_TYPE__NODE_ID;

	/**
	 * The feature id for the '<em><b>Release Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_OBJECT_TYPE__RELEASE_STATUS = UA_TYPE__RELEASE_STATUS;

	/**
	 * The feature id for the '<em><b>Symbolic Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_OBJECT_TYPE__SYMBOLIC_NAME = UA_TYPE__SYMBOLIC_NAME;

	/**
	 * The feature id for the '<em><b>User Write Mask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_OBJECT_TYPE__USER_WRITE_MASK = UA_TYPE__USER_WRITE_MASK;

	/**
	 * The feature id for the '<em><b>Write Mask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_OBJECT_TYPE__WRITE_MASK = UA_TYPE__WRITE_MASK;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_OBJECT_TYPE__IS_ABSTRACT = UA_TYPE__IS_ABSTRACT;

	/**
	 * The number of structural features of the '<em>UA Object Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_OBJECT_TYPE_FEATURE_COUNT = UA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>UA Object Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_OBJECT_TYPE_OPERATION_COUNT = UA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.UAReferenceTypeImpl <em>UA Reference Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.UAReferenceTypeImpl
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.SetPackageImpl#getUAReferenceType()
	 * @generated
	 */
	int UA_REFERENCE_TYPE = 33;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_REFERENCE_TYPE__DISPLAY_NAME = UA_TYPE__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_REFERENCE_TYPE__DESCRIPTION = UA_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_REFERENCE_TYPE__CATEGORY = UA_TYPE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_REFERENCE_TYPE__DOCUMENTATION = UA_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>References</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_REFERENCE_TYPE__REFERENCES = UA_TYPE__REFERENCES;

	/**
	 * The feature id for the '<em><b>Role Permissions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_REFERENCE_TYPE__ROLE_PERMISSIONS = UA_TYPE__ROLE_PERMISSIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_REFERENCE_TYPE__EXTENSIONS = UA_TYPE__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Access Restrictions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_REFERENCE_TYPE__ACCESS_RESTRICTIONS = UA_TYPE__ACCESS_RESTRICTIONS;

	/**
	 * The feature id for the '<em><b>Browse Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_REFERENCE_TYPE__BROWSE_NAME = UA_TYPE__BROWSE_NAME;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_REFERENCE_TYPE__NODE_ID = UA_TYPE__NODE_ID;

	/**
	 * The feature id for the '<em><b>Release Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_REFERENCE_TYPE__RELEASE_STATUS = UA_TYPE__RELEASE_STATUS;

	/**
	 * The feature id for the '<em><b>Symbolic Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_REFERENCE_TYPE__SYMBOLIC_NAME = UA_TYPE__SYMBOLIC_NAME;

	/**
	 * The feature id for the '<em><b>User Write Mask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_REFERENCE_TYPE__USER_WRITE_MASK = UA_TYPE__USER_WRITE_MASK;

	/**
	 * The feature id for the '<em><b>Write Mask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_REFERENCE_TYPE__WRITE_MASK = UA_TYPE__WRITE_MASK;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_REFERENCE_TYPE__IS_ABSTRACT = UA_TYPE__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Inverse Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_REFERENCE_TYPE__INVERSE_NAME = UA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Symmetric</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_REFERENCE_TYPE__SYMMETRIC = UA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>UA Reference Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_REFERENCE_TYPE_FEATURE_COUNT = UA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>UA Reference Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_REFERENCE_TYPE_OPERATION_COUNT = UA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.UAVariableImpl <em>UA Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.UAVariableImpl
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.SetPackageImpl#getUAVariable()
	 * @generated
	 */
	int UA_VARIABLE = 35;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_VARIABLE__DISPLAY_NAME = UA_INSTANCE__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_VARIABLE__DESCRIPTION = UA_INSTANCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_VARIABLE__CATEGORY = UA_INSTANCE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_VARIABLE__DOCUMENTATION = UA_INSTANCE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>References</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_VARIABLE__REFERENCES = UA_INSTANCE__REFERENCES;

	/**
	 * The feature id for the '<em><b>Role Permissions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_VARIABLE__ROLE_PERMISSIONS = UA_INSTANCE__ROLE_PERMISSIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_VARIABLE__EXTENSIONS = UA_INSTANCE__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Access Restrictions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_VARIABLE__ACCESS_RESTRICTIONS = UA_INSTANCE__ACCESS_RESTRICTIONS;

	/**
	 * The feature id for the '<em><b>Browse Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_VARIABLE__BROWSE_NAME = UA_INSTANCE__BROWSE_NAME;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_VARIABLE__NODE_ID = UA_INSTANCE__NODE_ID;

	/**
	 * The feature id for the '<em><b>Release Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_VARIABLE__RELEASE_STATUS = UA_INSTANCE__RELEASE_STATUS;

	/**
	 * The feature id for the '<em><b>Symbolic Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_VARIABLE__SYMBOLIC_NAME = UA_INSTANCE__SYMBOLIC_NAME;

	/**
	 * The feature id for the '<em><b>User Write Mask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_VARIABLE__USER_WRITE_MASK = UA_INSTANCE__USER_WRITE_MASK;

	/**
	 * The feature id for the '<em><b>Write Mask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_VARIABLE__WRITE_MASK = UA_INSTANCE__WRITE_MASK;

	/**
	 * The feature id for the '<em><b>Parent Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_VARIABLE__PARENT_NODE_ID = UA_INSTANCE__PARENT_NODE_ID;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_VARIABLE__VALUE = UA_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Translation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_VARIABLE__TRANSLATION = UA_INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Access Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_VARIABLE__ACCESS_LEVEL = UA_INSTANCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Array Dimensions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_VARIABLE__ARRAY_DIMENSIONS = UA_INSTANCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_VARIABLE__DATA_TYPE = UA_INSTANCE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Historizing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_VARIABLE__HISTORIZING = UA_INSTANCE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Minimum Sampling Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_VARIABLE__MINIMUM_SAMPLING_INTERVAL = UA_INSTANCE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>User Access Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_VARIABLE__USER_ACCESS_LEVEL = UA_INSTANCE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Value Rank</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_VARIABLE__VALUE_RANK = UA_INSTANCE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>UA Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_VARIABLE_FEATURE_COUNT = UA_INSTANCE_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>UA Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_VARIABLE_OPERATION_COUNT = UA_INSTANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.UAVariableTypeImpl <em>UA Variable Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.UAVariableTypeImpl
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.SetPackageImpl#getUAVariableType()
	 * @generated
	 */
	int UA_VARIABLE_TYPE = 36;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_VARIABLE_TYPE__DISPLAY_NAME = UA_TYPE__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_VARIABLE_TYPE__DESCRIPTION = UA_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_VARIABLE_TYPE__CATEGORY = UA_TYPE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_VARIABLE_TYPE__DOCUMENTATION = UA_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>References</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_VARIABLE_TYPE__REFERENCES = UA_TYPE__REFERENCES;

	/**
	 * The feature id for the '<em><b>Role Permissions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_VARIABLE_TYPE__ROLE_PERMISSIONS = UA_TYPE__ROLE_PERMISSIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_VARIABLE_TYPE__EXTENSIONS = UA_TYPE__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Access Restrictions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_VARIABLE_TYPE__ACCESS_RESTRICTIONS = UA_TYPE__ACCESS_RESTRICTIONS;

	/**
	 * The feature id for the '<em><b>Browse Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_VARIABLE_TYPE__BROWSE_NAME = UA_TYPE__BROWSE_NAME;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_VARIABLE_TYPE__NODE_ID = UA_TYPE__NODE_ID;

	/**
	 * The feature id for the '<em><b>Release Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_VARIABLE_TYPE__RELEASE_STATUS = UA_TYPE__RELEASE_STATUS;

	/**
	 * The feature id for the '<em><b>Symbolic Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_VARIABLE_TYPE__SYMBOLIC_NAME = UA_TYPE__SYMBOLIC_NAME;

	/**
	 * The feature id for the '<em><b>User Write Mask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_VARIABLE_TYPE__USER_WRITE_MASK = UA_TYPE__USER_WRITE_MASK;

	/**
	 * The feature id for the '<em><b>Write Mask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_VARIABLE_TYPE__WRITE_MASK = UA_TYPE__WRITE_MASK;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_VARIABLE_TYPE__IS_ABSTRACT = UA_TYPE__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_VARIABLE_TYPE__VALUE = UA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Array Dimensions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_VARIABLE_TYPE__ARRAY_DIMENSIONS = UA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_VARIABLE_TYPE__DATA_TYPE = UA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Value Rank</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_VARIABLE_TYPE__VALUE_RANK = UA_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>UA Variable Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_VARIABLE_TYPE_FEATURE_COUNT = UA_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>UA Variable Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_VARIABLE_TYPE_OPERATION_COUNT = UA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.UAViewImpl <em>UA View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.UAViewImpl
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.SetPackageImpl#getUAView()
	 * @generated
	 */
	int UA_VIEW = 37;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_VIEW__DISPLAY_NAME = UA_INSTANCE__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_VIEW__DESCRIPTION = UA_INSTANCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_VIEW__CATEGORY = UA_INSTANCE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_VIEW__DOCUMENTATION = UA_INSTANCE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>References</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_VIEW__REFERENCES = UA_INSTANCE__REFERENCES;

	/**
	 * The feature id for the '<em><b>Role Permissions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_VIEW__ROLE_PERMISSIONS = UA_INSTANCE__ROLE_PERMISSIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_VIEW__EXTENSIONS = UA_INSTANCE__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Access Restrictions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_VIEW__ACCESS_RESTRICTIONS = UA_INSTANCE__ACCESS_RESTRICTIONS;

	/**
	 * The feature id for the '<em><b>Browse Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_VIEW__BROWSE_NAME = UA_INSTANCE__BROWSE_NAME;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_VIEW__NODE_ID = UA_INSTANCE__NODE_ID;

	/**
	 * The feature id for the '<em><b>Release Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_VIEW__RELEASE_STATUS = UA_INSTANCE__RELEASE_STATUS;

	/**
	 * The feature id for the '<em><b>Symbolic Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_VIEW__SYMBOLIC_NAME = UA_INSTANCE__SYMBOLIC_NAME;

	/**
	 * The feature id for the '<em><b>User Write Mask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_VIEW__USER_WRITE_MASK = UA_INSTANCE__USER_WRITE_MASK;

	/**
	 * The feature id for the '<em><b>Write Mask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_VIEW__WRITE_MASK = UA_INSTANCE__WRITE_MASK;

	/**
	 * The feature id for the '<em><b>Parent Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_VIEW__PARENT_NODE_ID = UA_INSTANCE__PARENT_NODE_ID;

	/**
	 * The feature id for the '<em><b>Contains No Loops</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_VIEW__CONTAINS_NO_LOOPS = UA_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Event Notifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_VIEW__EVENT_NOTIFIER = UA_INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>UA View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_VIEW_FEATURE_COUNT = UA_INSTANCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>UA View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_VIEW_OPERATION_COUNT = UA_INSTANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.UriTableImpl <em>Uri Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.UriTableImpl
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.SetPackageImpl#getUriTable()
	 * @generated
	 */
	int URI_TABLE = 38;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URI_TABLE__URI = 0;

	/**
	 * The number of structural features of the '<em>Uri Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URI_TABLE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Uri Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URI_TABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.ValueTypeImpl <em>Value Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.ValueTypeImpl
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.SetPackageImpl#getValueType()
	 * @generated
	 */
	int VALUE_TYPE = 39;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE__ANY = 0;

	/**
	 * The number of structural features of the '<em>Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.ValueType1Impl <em>Value Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.ValueType1Impl
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.SetPackageImpl#getValueType1()
	 * @generated
	 */
	int VALUE_TYPE1 = 40;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE1__ANY = 0;

	/**
	 * The number of structural features of the '<em>Value Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE1_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Value Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE1_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.opcfoundation.ua._2011._03.ua.node.set.DataTypePurpose <em>Data Type Purpose</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.DataTypePurpose
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.SetPackageImpl#getDataTypePurpose()
	 * @generated
	 */
	int DATA_TYPE_PURPOSE = 41;

	/**
	 * The meta object id for the '{@link org.opcfoundation.ua._2011._03.ua.node.set.ReleaseStatus <em>Release Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.ReleaseStatus
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.SetPackageImpl#getReleaseStatus()
	 * @generated
	 */
	int RELEASE_STATUS = 42;

	/**
	 * The meta object id for the '<em>Access Level</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.SetPackageImpl#getAccessLevel()
	 * @generated
	 */
	int ACCESS_LEVEL = 43;

	/**
	 * The meta object id for the '<em>Access Level Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Long
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.SetPackageImpl#getAccessLevelObject()
	 * @generated
	 */
	int ACCESS_LEVEL_OBJECT = 44;

	/**
	 * The meta object id for the '<em>Access Restriction</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.SetPackageImpl#getAccessRestriction()
	 * @generated
	 */
	int ACCESS_RESTRICTION = 45;

	/**
	 * The meta object id for the '<em>Access Restriction Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Short
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.SetPackageImpl#getAccessRestrictionObject()
	 * @generated
	 */
	int ACCESS_RESTRICTION_OBJECT = 46;

	/**
	 * The meta object id for the '<em>Array Dimensions</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.SetPackageImpl#getArrayDimensions()
	 * @generated
	 */
	int ARRAY_DIMENSIONS = 47;

	/**
	 * The meta object id for the '<em>Cardinality Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.SetPackageImpl#getCardinalityType()
	 * @generated
	 */
	int CARDINALITY_TYPE = 48;

	/**
	 * The meta object id for the '<em>Cardinality Type Item</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.SetPackageImpl#getCardinalityTypeItem()
	 * @generated
	 */
	int CARDINALITY_TYPE_ITEM = 49;

	/**
	 * The meta object id for the '<em>Data Type Purpose Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.DataTypePurpose
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.SetPackageImpl#getDataTypePurposeObject()
	 * @generated
	 */
	int DATA_TYPE_PURPOSE_OBJECT = 50;

	/**
	 * The meta object id for the '<em>Duration</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.SetPackageImpl#getDuration()
	 * @generated
	 */
	int DURATION = 51;

	/**
	 * The meta object id for the '<em>Duration Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Double
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.SetPackageImpl#getDurationObject()
	 * @generated
	 */
	int DURATION_OBJECT = 52;

	/**
	 * The meta object id for the '<em>Event Notifier</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.SetPackageImpl#getEventNotifier()
	 * @generated
	 */
	int EVENT_NOTIFIER = 53;

	/**
	 * The meta object id for the '<em>Event Notifier Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Short
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.SetPackageImpl#getEventNotifierObject()
	 * @generated
	 */
	int EVENT_NOTIFIER_OBJECT = 54;

	/**
	 * The meta object id for the '<em>Locale</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.SetPackageImpl#getLocale()
	 * @generated
	 */
	int LOCALE = 55;

	/**
	 * The meta object id for the '<em>Node Id</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.SetPackageImpl#getNodeId()
	 * @generated
	 */
	int NODE_ID = 56;

	/**
	 * The meta object id for the '<em>Qualified Name</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.SetPackageImpl#getQualifiedName()
	 * @generated
	 */
	int QUALIFIED_NAME = 57;

	/**
	 * The meta object id for the '<em>Release Status Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.ReleaseStatus
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.SetPackageImpl#getReleaseStatusObject()
	 * @generated
	 */
	int RELEASE_STATUS_OBJECT = 58;

	/**
	 * The meta object id for the '<em>Symbolic Name</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.SetPackageImpl#getSymbolicName()
	 * @generated
	 */
	int SYMBOLIC_NAME = 59;

	/**
	 * The meta object id for the '<em>Symbolic Name Item</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.SetPackageImpl#getSymbolicNameItem()
	 * @generated
	 */
	int SYMBOLIC_NAME_ITEM = 60;

	/**
	 * The meta object id for the '<em>Value Rank</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.SetPackageImpl#getValueRank()
	 * @generated
	 */
	int VALUE_RANK = 61;

	/**
	 * The meta object id for the '<em>Value Rank Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Integer
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.SetPackageImpl#getValueRankObject()
	 * @generated
	 */
	int VALUE_RANK_OBJECT = 62;

	/**
	 * The meta object id for the '<em>Write Mask</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.SetPackageImpl#getWriteMask()
	 * @generated
	 */
	int WRITE_MASK = 63;

	/**
	 * The meta object id for the '<em>Write Mask Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Long
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.SetPackageImpl#getWriteMaskObject()
	 * @generated
	 */
	int WRITE_MASK_OBJECT = 64;


	/**
	 * Returns the meta object for class '{@link org.opcfoundation.ua._2011._03.ua.node.set.AliasTable <em>Alias Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alias Table</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.AliasTable
	 * @generated
	 */
	EClass getAliasTable();

	/**
	 * Returns the meta object for the containment reference list '{@link org.opcfoundation.ua._2011._03.ua.node.set.AliasTable#getAlias <em>Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Alias</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.AliasTable#getAlias()
	 * @see #getAliasTable()
	 * @generated
	 */
	EReference getAliasTable_Alias();

	/**
	 * Returns the meta object for class '{@link org.opcfoundation.ua._2011._03.ua.node.set.DataTypeDefinition <em>Data Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type Definition</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.DataTypeDefinition
	 * @generated
	 */
	EClass getDataTypeDefinition();

	/**
	 * Returns the meta object for the containment reference list '{@link org.opcfoundation.ua._2011._03.ua.node.set.DataTypeDefinition#getField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Field</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.DataTypeDefinition#getField()
	 * @see #getDataTypeDefinition()
	 * @generated
	 */
	EReference getDataTypeDefinition_Field();

	/**
	 * Returns the meta object for the attribute '{@link org.opcfoundation.ua._2011._03.ua.node.set.DataTypeDefinition#getBaseType <em>Base Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Type</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.DataTypeDefinition#getBaseType()
	 * @see #getDataTypeDefinition()
	 * @generated
	 */
	EAttribute getDataTypeDefinition_BaseType();

	/**
	 * Returns the meta object for the attribute '{@link org.opcfoundation.ua._2011._03.ua.node.set.DataTypeDefinition#isIsOptionSet <em>Is Option Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Option Set</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.DataTypeDefinition#isIsOptionSet()
	 * @see #getDataTypeDefinition()
	 * @generated
	 */
	EAttribute getDataTypeDefinition_IsOptionSet();

	/**
	 * Returns the meta object for the attribute '{@link org.opcfoundation.ua._2011._03.ua.node.set.DataTypeDefinition#isIsUnion <em>Is Union</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Union</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.DataTypeDefinition#isIsUnion()
	 * @see #getDataTypeDefinition()
	 * @generated
	 */
	EAttribute getDataTypeDefinition_IsUnion();

	/**
	 * Returns the meta object for the attribute '{@link org.opcfoundation.ua._2011._03.ua.node.set.DataTypeDefinition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.DataTypeDefinition#getName()
	 * @see #getDataTypeDefinition()
	 * @generated
	 */
	EAttribute getDataTypeDefinition_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.opcfoundation.ua._2011._03.ua.node.set.DataTypeDefinition#getSymbolicName <em>Symbolic Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Symbolic Name</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.DataTypeDefinition#getSymbolicName()
	 * @see #getDataTypeDefinition()
	 * @generated
	 */
	EAttribute getDataTypeDefinition_SymbolicName();

	/**
	 * Returns the meta object for class '{@link org.opcfoundation.ua._2011._03.ua.node.set.DataTypeField <em>Data Type Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type Field</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.DataTypeField
	 * @generated
	 */
	EClass getDataTypeField();

	/**
	 * Returns the meta object for the containment reference list '{@link org.opcfoundation.ua._2011._03.ua.node.set.DataTypeField#getDisplayName <em>Display Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Display Name</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.DataTypeField#getDisplayName()
	 * @see #getDataTypeField()
	 * @generated
	 */
	EReference getDataTypeField_DisplayName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.opcfoundation.ua._2011._03.ua.node.set.DataTypeField#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.DataTypeField#getDescription()
	 * @see #getDataTypeField()
	 * @generated
	 */
	EReference getDataTypeField_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.opcfoundation.ua._2011._03.ua.node.set.DataTypeField#getArrayDimensions <em>Array Dimensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Array Dimensions</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.DataTypeField#getArrayDimensions()
	 * @see #getDataTypeField()
	 * @generated
	 */
	EAttribute getDataTypeField_ArrayDimensions();

	/**
	 * Returns the meta object for the attribute '{@link org.opcfoundation.ua._2011._03.ua.node.set.DataTypeField#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Type</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.DataTypeField#getDataType()
	 * @see #getDataTypeField()
	 * @generated
	 */
	EAttribute getDataTypeField_DataType();

	/**
	 * Returns the meta object for the attribute '{@link org.opcfoundation.ua._2011._03.ua.node.set.DataTypeField#isIsOptional <em>Is Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Optional</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.DataTypeField#isIsOptional()
	 * @see #getDataTypeField()
	 * @generated
	 */
	EAttribute getDataTypeField_IsOptional();

	/**
	 * Returns the meta object for the attribute '{@link org.opcfoundation.ua._2011._03.ua.node.set.DataTypeField#getMaxStringLength <em>Max String Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max String Length</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.DataTypeField#getMaxStringLength()
	 * @see #getDataTypeField()
	 * @generated
	 */
	EAttribute getDataTypeField_MaxStringLength();

	/**
	 * Returns the meta object for the attribute '{@link org.opcfoundation.ua._2011._03.ua.node.set.DataTypeField#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.DataTypeField#getName()
	 * @see #getDataTypeField()
	 * @generated
	 */
	EAttribute getDataTypeField_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.opcfoundation.ua._2011._03.ua.node.set.DataTypeField#getSymbolicName <em>Symbolic Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Symbolic Name</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.DataTypeField#getSymbolicName()
	 * @see #getDataTypeField()
	 * @generated
	 */
	EAttribute getDataTypeField_SymbolicName();

	/**
	 * Returns the meta object for the attribute '{@link org.opcfoundation.ua._2011._03.ua.node.set.DataTypeField#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.DataTypeField#getValue()
	 * @see #getDataTypeField()
	 * @generated
	 */
	EAttribute getDataTypeField_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.opcfoundation.ua._2011._03.ua.node.set.DataTypeField#getValueRank <em>Value Rank</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Rank</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.DataTypeField#getValueRank()
	 * @see #getDataTypeField()
	 * @generated
	 */
	EAttribute getDataTypeField_ValueRank();

	/**
	 * Returns the meta object for class '{@link org.opcfoundation.ua._2011._03.ua.node.set.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.opcfoundation.ua._2011._03.ua.node.set.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.opcfoundation.ua._2011._03.ua.node.set.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.opcfoundation.ua._2011._03.ua.node.set.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.opcfoundation.ua._2011._03.ua.node.set.DocumentRoot#getUANodeSet <em>UA Node Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>UA Node Set</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.DocumentRoot#getUANodeSet()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_UANodeSet();

	/**
	 * Returns the meta object for the containment reference '{@link org.opcfoundation.ua._2011._03.ua.node.set.DocumentRoot#getUANodeSetChanges <em>UA Node Set Changes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>UA Node Set Changes</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.DocumentRoot#getUANodeSetChanges()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_UANodeSetChanges();

	/**
	 * Returns the meta object for the containment reference '{@link org.opcfoundation.ua._2011._03.ua.node.set.DocumentRoot#getUANodeSetChangesStatus <em>UA Node Set Changes Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>UA Node Set Changes Status</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.DocumentRoot#getUANodeSetChangesStatus()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_UANodeSetChangesStatus();

	/**
	 * Returns the meta object for class '{@link org.opcfoundation.ua._2011._03.ua.node.set.ExtensionType <em>Extension Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extension Type</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.ExtensionType
	 * @generated
	 */
	EClass getExtensionType();

	/**
	 * Returns the meta object for the attribute list '{@link org.opcfoundation.ua._2011._03.ua.node.set.ExtensionType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.ExtensionType#getAny()
	 * @see #getExtensionType()
	 * @generated
	 */
	EAttribute getExtensionType_Any();

	/**
	 * Returns the meta object for class '{@link org.opcfoundation.ua._2011._03.ua.node.set.ListOfExtensions <em>List Of Extensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Of Extensions</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.ListOfExtensions
	 * @generated
	 */
	EClass getListOfExtensions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.opcfoundation.ua._2011._03.ua.node.set.ListOfExtensions#getExtension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Extension</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.ListOfExtensions#getExtension()
	 * @see #getListOfExtensions()
	 * @generated
	 */
	EReference getListOfExtensions_Extension();

	/**
	 * Returns the meta object for class '{@link org.opcfoundation.ua._2011._03.ua.node.set.ListOfReferences <em>List Of References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Of References</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.ListOfReferences
	 * @generated
	 */
	EClass getListOfReferences();

	/**
	 * Returns the meta object for the containment reference list '{@link org.opcfoundation.ua._2011._03.ua.node.set.ListOfReferences#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reference</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.ListOfReferences#getReference()
	 * @see #getListOfReferences()
	 * @generated
	 */
	EReference getListOfReferences_Reference();

	/**
	 * Returns the meta object for class '{@link org.opcfoundation.ua._2011._03.ua.node.set.ListOfRolePermissions <em>List Of Role Permissions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Of Role Permissions</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.ListOfRolePermissions
	 * @generated
	 */
	EClass getListOfRolePermissions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.opcfoundation.ua._2011._03.ua.node.set.ListOfRolePermissions#getRolePermission <em>Role Permission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Role Permission</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.ListOfRolePermissions#getRolePermission()
	 * @see #getListOfRolePermissions()
	 * @generated
	 */
	EReference getListOfRolePermissions_RolePermission();

	/**
	 * Returns the meta object for class '{@link org.opcfoundation.ua._2011._03.ua.node.set.LocalizedText <em>Localized Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Localized Text</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.LocalizedText
	 * @generated
	 */
	EClass getLocalizedText();

	/**
	 * Returns the meta object for the attribute '{@link org.opcfoundation.ua._2011._03.ua.node.set.LocalizedText#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.LocalizedText#getValue()
	 * @see #getLocalizedText()
	 * @generated
	 */
	EAttribute getLocalizedText_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.opcfoundation.ua._2011._03.ua.node.set.LocalizedText#getLocale <em>Locale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Locale</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.LocalizedText#getLocale()
	 * @see #getLocalizedText()
	 * @generated
	 */
	EAttribute getLocalizedText_Locale();

	/**
	 * Returns the meta object for class '{@link org.opcfoundation.ua._2011._03.ua.node.set.ModelTable <em>Model Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Table</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.ModelTable
	 * @generated
	 */
	EClass getModelTable();

	/**
	 * Returns the meta object for the containment reference list '{@link org.opcfoundation.ua._2011._03.ua.node.set.ModelTable#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Model</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.ModelTable#getModel()
	 * @see #getModelTable()
	 * @generated
	 */
	EReference getModelTable_Model();

	/**
	 * Returns the meta object for class '{@link org.opcfoundation.ua._2011._03.ua.node.set.ModelTableEntry <em>Model Table Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Table Entry</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.ModelTableEntry
	 * @generated
	 */
	EClass getModelTableEntry();

	/**
	 * Returns the meta object for the containment reference '{@link org.opcfoundation.ua._2011._03.ua.node.set.ModelTableEntry#getRolePermissions <em>Role Permissions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Role Permissions</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.ModelTableEntry#getRolePermissions()
	 * @see #getModelTableEntry()
	 * @generated
	 */
	EReference getModelTableEntry_RolePermissions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.opcfoundation.ua._2011._03.ua.node.set.ModelTableEntry#getRequiredModel <em>Required Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Required Model</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.ModelTableEntry#getRequiredModel()
	 * @see #getModelTableEntry()
	 * @generated
	 */
	EReference getModelTableEntry_RequiredModel();

	/**
	 * Returns the meta object for the attribute '{@link org.opcfoundation.ua._2011._03.ua.node.set.ModelTableEntry#getAccessRestrictions <em>Access Restrictions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access Restrictions</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.ModelTableEntry#getAccessRestrictions()
	 * @see #getModelTableEntry()
	 * @generated
	 */
	EAttribute getModelTableEntry_AccessRestrictions();

	/**
	 * Returns the meta object for the attribute '{@link org.opcfoundation.ua._2011._03.ua.node.set.ModelTableEntry#getModelUri <em>Model Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model Uri</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.ModelTableEntry#getModelUri()
	 * @see #getModelTableEntry()
	 * @generated
	 */
	EAttribute getModelTableEntry_ModelUri();

	/**
	 * Returns the meta object for the attribute '{@link org.opcfoundation.ua._2011._03.ua.node.set.ModelTableEntry#getPublicationDate <em>Publication Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Publication Date</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.ModelTableEntry#getPublicationDate()
	 * @see #getModelTableEntry()
	 * @generated
	 */
	EAttribute getModelTableEntry_PublicationDate();

	/**
	 * Returns the meta object for the attribute '{@link org.opcfoundation.ua._2011._03.ua.node.set.ModelTableEntry#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.ModelTableEntry#getVersion()
	 * @see #getModelTableEntry()
	 * @generated
	 */
	EAttribute getModelTableEntry_Version();

	/**
	 * Returns the meta object for class '{@link org.opcfoundation.ua._2011._03.ua.node.set.NodeIdAlias <em>Node Id Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Id Alias</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.NodeIdAlias
	 * @generated
	 */
	EClass getNodeIdAlias();

	/**
	 * Returns the meta object for the attribute '{@link org.opcfoundation.ua._2011._03.ua.node.set.NodeIdAlias#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.NodeIdAlias#getValue()
	 * @see #getNodeIdAlias()
	 * @generated
	 */
	EAttribute getNodeIdAlias_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.opcfoundation.ua._2011._03.ua.node.set.NodeIdAlias#getAlias <em>Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alias</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.NodeIdAlias#getAlias()
	 * @see #getNodeIdAlias()
	 * @generated
	 */
	EAttribute getNodeIdAlias_Alias();

	/**
	 * Returns the meta object for class '{@link org.opcfoundation.ua._2011._03.ua.node.set.NodeSetStatus <em>Node Set Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Set Status</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.NodeSetStatus
	 * @generated
	 */
	EClass getNodeSetStatus();

	/**
	 * Returns the meta object for the attribute '{@link org.opcfoundation.ua._2011._03.ua.node.set.NodeSetStatus#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.NodeSetStatus#getValue()
	 * @see #getNodeSetStatus()
	 * @generated
	 */
	EAttribute getNodeSetStatus_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.opcfoundation.ua._2011._03.ua.node.set.NodeSetStatus#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.NodeSetStatus#getCode()
	 * @see #getNodeSetStatus()
	 * @generated
	 */
	EAttribute getNodeSetStatus_Code();

	/**
	 * Returns the meta object for class '{@link org.opcfoundation.ua._2011._03.ua.node.set.NodeSetStatusList <em>Node Set Status List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Set Status List</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.NodeSetStatusList
	 * @generated
	 */
	EClass getNodeSetStatusList();

	/**
	 * Returns the meta object for the containment reference list '{@link org.opcfoundation.ua._2011._03.ua.node.set.NodeSetStatusList#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Status</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.NodeSetStatusList#getStatus()
	 * @see #getNodeSetStatusList()
	 * @generated
	 */
	EReference getNodeSetStatusList_Status();

	/**
	 * Returns the meta object for class '{@link org.opcfoundation.ua._2011._03.ua.node.set.NodesToAdd <em>Nodes To Add</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nodes To Add</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.NodesToAdd
	 * @generated
	 */
	EClass getNodesToAdd();

	/**
	 * Returns the meta object for the attribute list '{@link org.opcfoundation.ua._2011._03.ua.node.set.NodesToAdd#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.NodesToAdd#getGroup()
	 * @see #getNodesToAdd()
	 * @generated
	 */
	EAttribute getNodesToAdd_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.opcfoundation.ua._2011._03.ua.node.set.NodesToAdd#getUAObject <em>UA Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>UA Object</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.NodesToAdd#getUAObject()
	 * @see #getNodesToAdd()
	 * @generated
	 */
	EReference getNodesToAdd_UAObject();

	/**
	 * Returns the meta object for the containment reference list '{@link org.opcfoundation.ua._2011._03.ua.node.set.NodesToAdd#getUAVariable <em>UA Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>UA Variable</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.NodesToAdd#getUAVariable()
	 * @see #getNodesToAdd()
	 * @generated
	 */
	EReference getNodesToAdd_UAVariable();

	/**
	 * Returns the meta object for the containment reference list '{@link org.opcfoundation.ua._2011._03.ua.node.set.NodesToAdd#getUAMethod <em>UA Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>UA Method</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.NodesToAdd#getUAMethod()
	 * @see #getNodesToAdd()
	 * @generated
	 */
	EReference getNodesToAdd_UAMethod();

	/**
	 * Returns the meta object for the containment reference list '{@link org.opcfoundation.ua._2011._03.ua.node.set.NodesToAdd#getUAView <em>UA View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>UA View</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.NodesToAdd#getUAView()
	 * @see #getNodesToAdd()
	 * @generated
	 */
	EReference getNodesToAdd_UAView();

	/**
	 * Returns the meta object for the containment reference list '{@link org.opcfoundation.ua._2011._03.ua.node.set.NodesToAdd#getUAObjectType <em>UA Object Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>UA Object Type</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.NodesToAdd#getUAObjectType()
	 * @see #getNodesToAdd()
	 * @generated
	 */
	EReference getNodesToAdd_UAObjectType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.opcfoundation.ua._2011._03.ua.node.set.NodesToAdd#getUAVariableType <em>UA Variable Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>UA Variable Type</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.NodesToAdd#getUAVariableType()
	 * @see #getNodesToAdd()
	 * @generated
	 */
	EReference getNodesToAdd_UAVariableType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.opcfoundation.ua._2011._03.ua.node.set.NodesToAdd#getUADataType <em>UA Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>UA Data Type</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.NodesToAdd#getUADataType()
	 * @see #getNodesToAdd()
	 * @generated
	 */
	EReference getNodesToAdd_UADataType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.opcfoundation.ua._2011._03.ua.node.set.NodesToAdd#getUAReferenceType <em>UA Reference Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>UA Reference Type</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.NodesToAdd#getUAReferenceType()
	 * @see #getNodesToAdd()
	 * @generated
	 */
	EReference getNodesToAdd_UAReferenceType();

	/**
	 * Returns the meta object for class '{@link org.opcfoundation.ua._2011._03.ua.node.set.NodesToDelete <em>Nodes To Delete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nodes To Delete</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.NodesToDelete
	 * @generated
	 */
	EClass getNodesToDelete();

	/**
	 * Returns the meta object for the containment reference list '{@link org.opcfoundation.ua._2011._03.ua.node.set.NodesToDelete#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Node</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.NodesToDelete#getNode()
	 * @see #getNodesToDelete()
	 * @generated
	 */
	EReference getNodesToDelete_Node();

	/**
	 * Returns the meta object for class '{@link org.opcfoundation.ua._2011._03.ua.node.set.NodeToDelete <em>Node To Delete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node To Delete</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.NodeToDelete
	 * @generated
	 */
	EClass getNodeToDelete();

	/**
	 * Returns the meta object for the attribute '{@link org.opcfoundation.ua._2011._03.ua.node.set.NodeToDelete#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.NodeToDelete#getValue()
	 * @see #getNodeToDelete()
	 * @generated
	 */
	EAttribute getNodeToDelete_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.opcfoundation.ua._2011._03.ua.node.set.NodeToDelete#isDeleteReverseReferences <em>Delete Reverse References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delete Reverse References</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.NodeToDelete#isDeleteReverseReferences()
	 * @see #getNodeToDelete()
	 * @generated
	 */
	EAttribute getNodeToDelete_DeleteReverseReferences();

	/**
	 * Returns the meta object for class '{@link org.opcfoundation.ua._2011._03.ua.node.set.Reference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.Reference
	 * @generated
	 */
	EClass getReference();

	/**
	 * Returns the meta object for the attribute '{@link org.opcfoundation.ua._2011._03.ua.node.set.Reference#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.Reference#getValue()
	 * @see #getReference()
	 * @generated
	 */
	EAttribute getReference_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.opcfoundation.ua._2011._03.ua.node.set.Reference#isIsForward <em>Is Forward</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Forward</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.Reference#isIsForward()
	 * @see #getReference()
	 * @generated
	 */
	EAttribute getReference_IsForward();

	/**
	 * Returns the meta object for the attribute '{@link org.opcfoundation.ua._2011._03.ua.node.set.Reference#getReferenceType <em>Reference Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference Type</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.Reference#getReferenceType()
	 * @see #getReference()
	 * @generated
	 */
	EAttribute getReference_ReferenceType();

	/**
	 * Returns the meta object for class '{@link org.opcfoundation.ua._2011._03.ua.node.set.ReferenceChange <em>Reference Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference Change</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.ReferenceChange
	 * @generated
	 */
	EClass getReferenceChange();

	/**
	 * Returns the meta object for the attribute '{@link org.opcfoundation.ua._2011._03.ua.node.set.ReferenceChange#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.ReferenceChange#getValue()
	 * @see #getReferenceChange()
	 * @generated
	 */
	EAttribute getReferenceChange_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.opcfoundation.ua._2011._03.ua.node.set.ReferenceChange#isIsForward <em>Is Forward</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Forward</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.ReferenceChange#isIsForward()
	 * @see #getReferenceChange()
	 * @generated
	 */
	EAttribute getReferenceChange_IsForward();

	/**
	 * Returns the meta object for the attribute '{@link org.opcfoundation.ua._2011._03.ua.node.set.ReferenceChange#getReferenceType <em>Reference Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference Type</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.ReferenceChange#getReferenceType()
	 * @see #getReferenceChange()
	 * @generated
	 */
	EAttribute getReferenceChange_ReferenceType();

	/**
	 * Returns the meta object for the attribute '{@link org.opcfoundation.ua._2011._03.ua.node.set.ReferenceChange#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.ReferenceChange#getSource()
	 * @see #getReferenceChange()
	 * @generated
	 */
	EAttribute getReferenceChange_Source();

	/**
	 * Returns the meta object for class '{@link org.opcfoundation.ua._2011._03.ua.node.set.ReferencesToChange <em>References To Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>References To Change</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.ReferencesToChange
	 * @generated
	 */
	EClass getReferencesToChange();

	/**
	 * Returns the meta object for the containment reference list '{@link org.opcfoundation.ua._2011._03.ua.node.set.ReferencesToChange#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reference</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.ReferencesToChange#getReference()
	 * @see #getReferencesToChange()
	 * @generated
	 */
	EReference getReferencesToChange_Reference();

	/**
	 * Returns the meta object for class '{@link org.opcfoundation.ua._2011._03.ua.node.set.RolePermission <em>Role Permission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Permission</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.RolePermission
	 * @generated
	 */
	EClass getRolePermission();

	/**
	 * Returns the meta object for the attribute '{@link org.opcfoundation.ua._2011._03.ua.node.set.RolePermission#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.RolePermission#getValue()
	 * @see #getRolePermission()
	 * @generated
	 */
	EAttribute getRolePermission_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.opcfoundation.ua._2011._03.ua.node.set.RolePermission#getPermissions <em>Permissions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Permissions</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.RolePermission#getPermissions()
	 * @see #getRolePermission()
	 * @generated
	 */
	EAttribute getRolePermission_Permissions();

	/**
	 * Returns the meta object for class '{@link org.opcfoundation.ua._2011._03.ua.node.set.StructureTranslationType <em>Structure Translation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structure Translation Type</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.StructureTranslationType
	 * @generated
	 */
	EClass getStructureTranslationType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.opcfoundation.ua._2011._03.ua.node.set.StructureTranslationType#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Text</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.StructureTranslationType#getText()
	 * @see #getStructureTranslationType()
	 * @generated
	 */
	EReference getStructureTranslationType_Text();

	/**
	 * Returns the meta object for the attribute '{@link org.opcfoundation.ua._2011._03.ua.node.set.StructureTranslationType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.StructureTranslationType#getName()
	 * @see #getStructureTranslationType()
	 * @generated
	 */
	EAttribute getStructureTranslationType_Name();

	/**
	 * Returns the meta object for class '{@link org.opcfoundation.ua._2011._03.ua.node.set.TranslationType <em>Translation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Translation Type</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.TranslationType
	 * @generated
	 */
	EClass getTranslationType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.opcfoundation.ua._2011._03.ua.node.set.TranslationType#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Text</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.TranslationType#getText()
	 * @see #getTranslationType()
	 * @generated
	 */
	EReference getTranslationType_Text();

	/**
	 * Returns the meta object for the containment reference list '{@link org.opcfoundation.ua._2011._03.ua.node.set.TranslationType#getField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Field</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.TranslationType#getField()
	 * @see #getTranslationType()
	 * @generated
	 */
	EReference getTranslationType_Field();

	/**
	 * Returns the meta object for class '{@link org.opcfoundation.ua._2011._03.ua.node.set.UADataType <em>UA Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UA Data Type</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.UADataType
	 * @generated
	 */
	EClass getUADataType();

	/**
	 * Returns the meta object for the containment reference '{@link org.opcfoundation.ua._2011._03.ua.node.set.UADataType#getDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Definition</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.UADataType#getDefinition()
	 * @see #getUADataType()
	 * @generated
	 */
	EReference getUADataType_Definition();

	/**
	 * Returns the meta object for the attribute '{@link org.opcfoundation.ua._2011._03.ua.node.set.UADataType#getPurpose <em>Purpose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Purpose</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.UADataType#getPurpose()
	 * @see #getUADataType()
	 * @generated
	 */
	EAttribute getUADataType_Purpose();

	/**
	 * Returns the meta object for class '{@link org.opcfoundation.ua._2011._03.ua.node.set.UAInstance <em>UA Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UA Instance</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.UAInstance
	 * @generated
	 */
	EClass getUAInstance();

	/**
	 * Returns the meta object for the attribute '{@link org.opcfoundation.ua._2011._03.ua.node.set.UAInstance#getParentNodeId <em>Parent Node Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parent Node Id</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.UAInstance#getParentNodeId()
	 * @see #getUAInstance()
	 * @generated
	 */
	EAttribute getUAInstance_ParentNodeId();

	/**
	 * Returns the meta object for class '{@link org.opcfoundation.ua._2011._03.ua.node.set.UAMethod <em>UA Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UA Method</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.UAMethod
	 * @generated
	 */
	EClass getUAMethod();

	/**
	 * Returns the meta object for the containment reference list '{@link org.opcfoundation.ua._2011._03.ua.node.set.UAMethod#getArgumentDescription <em>Argument Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Argument Description</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.UAMethod#getArgumentDescription()
	 * @see #getUAMethod()
	 * @generated
	 */
	EReference getUAMethod_ArgumentDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.opcfoundation.ua._2011._03.ua.node.set.UAMethod#isExecutable <em>Executable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Executable</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.UAMethod#isExecutable()
	 * @see #getUAMethod()
	 * @generated
	 */
	EAttribute getUAMethod_Executable();

	/**
	 * Returns the meta object for the attribute '{@link org.opcfoundation.ua._2011._03.ua.node.set.UAMethod#getMethodDeclarationId <em>Method Declaration Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method Declaration Id</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.UAMethod#getMethodDeclarationId()
	 * @see #getUAMethod()
	 * @generated
	 */
	EAttribute getUAMethod_MethodDeclarationId();

	/**
	 * Returns the meta object for the attribute '{@link org.opcfoundation.ua._2011._03.ua.node.set.UAMethod#isUserExecutable <em>User Executable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Executable</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.UAMethod#isUserExecutable()
	 * @see #getUAMethod()
	 * @generated
	 */
	EAttribute getUAMethod_UserExecutable();

	/**
	 * Returns the meta object for class '{@link org.opcfoundation.ua._2011._03.ua.node.set.UAMethodArgument <em>UA Method Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UA Method Argument</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.UAMethodArgument
	 * @generated
	 */
	EClass getUAMethodArgument();

	/**
	 * Returns the meta object for the attribute '{@link org.opcfoundation.ua._2011._03.ua.node.set.UAMethodArgument#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.UAMethodArgument#getName()
	 * @see #getUAMethodArgument()
	 * @generated
	 */
	EAttribute getUAMethodArgument_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.opcfoundation.ua._2011._03.ua.node.set.UAMethodArgument#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.UAMethodArgument#getDescription()
	 * @see #getUAMethodArgument()
	 * @generated
	 */
	EReference getUAMethodArgument_Description();

	/**
	 * Returns the meta object for class '{@link org.opcfoundation.ua._2011._03.ua.node.set.UANode <em>UA Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UA Node</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.UANode
	 * @generated
	 */
	EClass getUANode();

	/**
	 * Returns the meta object for the containment reference list '{@link org.opcfoundation.ua._2011._03.ua.node.set.UANode#getDisplayName <em>Display Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Display Name</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.UANode#getDisplayName()
	 * @see #getUANode()
	 * @generated
	 */
	EReference getUANode_DisplayName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.opcfoundation.ua._2011._03.ua.node.set.UANode#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.UANode#getDescription()
	 * @see #getUANode()
	 * @generated
	 */
	EReference getUANode_Description();

	/**
	 * Returns the meta object for the attribute list '{@link org.opcfoundation.ua._2011._03.ua.node.set.UANode#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Category</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.UANode#getCategory()
	 * @see #getUANode()
	 * @generated
	 */
	EAttribute getUANode_Category();

	/**
	 * Returns the meta object for the attribute '{@link org.opcfoundation.ua._2011._03.ua.node.set.UANode#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Documentation</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.UANode#getDocumentation()
	 * @see #getUANode()
	 * @generated
	 */
	EAttribute getUANode_Documentation();

	/**
	 * Returns the meta object for the containment reference '{@link org.opcfoundation.ua._2011._03.ua.node.set.UANode#getReferences <em>References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>References</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.UANode#getReferences()
	 * @see #getUANode()
	 * @generated
	 */
	EReference getUANode_References();

	/**
	 * Returns the meta object for the containment reference '{@link org.opcfoundation.ua._2011._03.ua.node.set.UANode#getRolePermissions <em>Role Permissions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Role Permissions</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.UANode#getRolePermissions()
	 * @see #getUANode()
	 * @generated
	 */
	EReference getUANode_RolePermissions();

	/**
	 * Returns the meta object for the containment reference '{@link org.opcfoundation.ua._2011._03.ua.node.set.UANode#getExtensions <em>Extensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Extensions</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.UANode#getExtensions()
	 * @see #getUANode()
	 * @generated
	 */
	EReference getUANode_Extensions();

	/**
	 * Returns the meta object for the attribute '{@link org.opcfoundation.ua._2011._03.ua.node.set.UANode#getAccessRestrictions <em>Access Restrictions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access Restrictions</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.UANode#getAccessRestrictions()
	 * @see #getUANode()
	 * @generated
	 */
	EAttribute getUANode_AccessRestrictions();

	/**
	 * Returns the meta object for the attribute '{@link org.opcfoundation.ua._2011._03.ua.node.set.UANode#getBrowseName <em>Browse Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Browse Name</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.UANode#getBrowseName()
	 * @see #getUANode()
	 * @generated
	 */
	EAttribute getUANode_BrowseName();

	/**
	 * Returns the meta object for the attribute '{@link org.opcfoundation.ua._2011._03.ua.node.set.UANode#getNodeId <em>Node Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node Id</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.UANode#getNodeId()
	 * @see #getUANode()
	 * @generated
	 */
	EAttribute getUANode_NodeId();

	/**
	 * Returns the meta object for the attribute '{@link org.opcfoundation.ua._2011._03.ua.node.set.UANode#getReleaseStatus <em>Release Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Release Status</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.UANode#getReleaseStatus()
	 * @see #getUANode()
	 * @generated
	 */
	EAttribute getUANode_ReleaseStatus();

	/**
	 * Returns the meta object for the attribute '{@link org.opcfoundation.ua._2011._03.ua.node.set.UANode#getSymbolicName <em>Symbolic Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Symbolic Name</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.UANode#getSymbolicName()
	 * @see #getUANode()
	 * @generated
	 */
	EAttribute getUANode_SymbolicName();

	/**
	 * Returns the meta object for the attribute '{@link org.opcfoundation.ua._2011._03.ua.node.set.UANode#getUserWriteMask <em>User Write Mask</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Write Mask</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.UANode#getUserWriteMask()
	 * @see #getUANode()
	 * @generated
	 */
	EAttribute getUANode_UserWriteMask();

	/**
	 * Returns the meta object for the attribute '{@link org.opcfoundation.ua._2011._03.ua.node.set.UANode#getWriteMask <em>Write Mask</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Write Mask</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.UANode#getWriteMask()
	 * @see #getUANode()
	 * @generated
	 */
	EAttribute getUANode_WriteMask();

	/**
	 * Returns the meta object for class '{@link org.opcfoundation.ua._2011._03.ua.node.set.UANodeSetChangesStatusType <em>UA Node Set Changes Status Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UA Node Set Changes Status Type</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.UANodeSetChangesStatusType
	 * @generated
	 */
	EClass getUANodeSetChangesStatusType();

	/**
	 * Returns the meta object for the containment reference '{@link org.opcfoundation.ua._2011._03.ua.node.set.UANodeSetChangesStatusType#getNodesToAdd <em>Nodes To Add</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Nodes To Add</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.UANodeSetChangesStatusType#getNodesToAdd()
	 * @see #getUANodeSetChangesStatusType()
	 * @generated
	 */
	EReference getUANodeSetChangesStatusType_NodesToAdd();

	/**
	 * Returns the meta object for the containment reference '{@link org.opcfoundation.ua._2011._03.ua.node.set.UANodeSetChangesStatusType#getReferencesToAdd <em>References To Add</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>References To Add</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.UANodeSetChangesStatusType#getReferencesToAdd()
	 * @see #getUANodeSetChangesStatusType()
	 * @generated
	 */
	EReference getUANodeSetChangesStatusType_ReferencesToAdd();

	/**
	 * Returns the meta object for the containment reference '{@link org.opcfoundation.ua._2011._03.ua.node.set.UANodeSetChangesStatusType#getNodesToDelete <em>Nodes To Delete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Nodes To Delete</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.UANodeSetChangesStatusType#getNodesToDelete()
	 * @see #getUANodeSetChangesStatusType()
	 * @generated
	 */
	EReference getUANodeSetChangesStatusType_NodesToDelete();

	/**
	 * Returns the meta object for the containment reference '{@link org.opcfoundation.ua._2011._03.ua.node.set.UANodeSetChangesStatusType#getReferencesToDelete <em>References To Delete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>References To Delete</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.UANodeSetChangesStatusType#getReferencesToDelete()
	 * @see #getUANodeSetChangesStatusType()
	 * @generated
	 */
	EReference getUANodeSetChangesStatusType_ReferencesToDelete();

	/**
	 * Returns the meta object for the attribute '{@link org.opcfoundation.ua._2011._03.ua.node.set.UANodeSetChangesStatusType#getLastModified <em>Last Modified</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Modified</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.UANodeSetChangesStatusType#getLastModified()
	 * @see #getUANodeSetChangesStatusType()
	 * @generated
	 */
	EAttribute getUANodeSetChangesStatusType_LastModified();

	/**
	 * Returns the meta object for the attribute '{@link org.opcfoundation.ua._2011._03.ua.node.set.UANodeSetChangesStatusType#getTransactionId <em>Transaction Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transaction Id</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.UANodeSetChangesStatusType#getTransactionId()
	 * @see #getUANodeSetChangesStatusType()
	 * @generated
	 */
	EAttribute getUANodeSetChangesStatusType_TransactionId();

	/**
	 * Returns the meta object for class '{@link org.opcfoundation.ua._2011._03.ua.node.set.UANodeSetChangesType <em>UA Node Set Changes Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UA Node Set Changes Type</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.UANodeSetChangesType
	 * @generated
	 */
	EClass getUANodeSetChangesType();

	/**
	 * Returns the meta object for the containment reference '{@link org.opcfoundation.ua._2011._03.ua.node.set.UANodeSetChangesType#getNamespaceUris <em>Namespace Uris</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Namespace Uris</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.UANodeSetChangesType#getNamespaceUris()
	 * @see #getUANodeSetChangesType()
	 * @generated
	 */
	EReference getUANodeSetChangesType_NamespaceUris();

	/**
	 * Returns the meta object for the containment reference '{@link org.opcfoundation.ua._2011._03.ua.node.set.UANodeSetChangesType#getServerUris <em>Server Uris</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Server Uris</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.UANodeSetChangesType#getServerUris()
	 * @see #getUANodeSetChangesType()
	 * @generated
	 */
	EReference getUANodeSetChangesType_ServerUris();

	/**
	 * Returns the meta object for the containment reference '{@link org.opcfoundation.ua._2011._03.ua.node.set.UANodeSetChangesType#getAliases <em>Aliases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Aliases</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.UANodeSetChangesType#getAliases()
	 * @see #getUANodeSetChangesType()
	 * @generated
	 */
	EReference getUANodeSetChangesType_Aliases();

	/**
	 * Returns the meta object for the containment reference '{@link org.opcfoundation.ua._2011._03.ua.node.set.UANodeSetChangesType#getExtensions <em>Extensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Extensions</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.UANodeSetChangesType#getExtensions()
	 * @see #getUANodeSetChangesType()
	 * @generated
	 */
	EReference getUANodeSetChangesType_Extensions();

	/**
	 * Returns the meta object for the containment reference '{@link org.opcfoundation.ua._2011._03.ua.node.set.UANodeSetChangesType#getNodesToAdd <em>Nodes To Add</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Nodes To Add</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.UANodeSetChangesType#getNodesToAdd()
	 * @see #getUANodeSetChangesType()
	 * @generated
	 */
	EReference getUANodeSetChangesType_NodesToAdd();

	/**
	 * Returns the meta object for the containment reference '{@link org.opcfoundation.ua._2011._03.ua.node.set.UANodeSetChangesType#getReferencesToAdd <em>References To Add</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>References To Add</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.UANodeSetChangesType#getReferencesToAdd()
	 * @see #getUANodeSetChangesType()
	 * @generated
	 */
	EReference getUANodeSetChangesType_ReferencesToAdd();

	/**
	 * Returns the meta object for the containment reference '{@link org.opcfoundation.ua._2011._03.ua.node.set.UANodeSetChangesType#getNodesToDelete <em>Nodes To Delete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Nodes To Delete</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.UANodeSetChangesType#getNodesToDelete()
	 * @see #getUANodeSetChangesType()
	 * @generated
	 */
	EReference getUANodeSetChangesType_NodesToDelete();

	/**
	 * Returns the meta object for the containment reference '{@link org.opcfoundation.ua._2011._03.ua.node.set.UANodeSetChangesType#getReferencesToDelete <em>References To Delete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>References To Delete</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.UANodeSetChangesType#getReferencesToDelete()
	 * @see #getUANodeSetChangesType()
	 * @generated
	 */
	EReference getUANodeSetChangesType_ReferencesToDelete();

	/**
	 * Returns the meta object for the attribute '{@link org.opcfoundation.ua._2011._03.ua.node.set.UANodeSetChangesType#isAcceptAllOrNothing <em>Accept All Or Nothing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Accept All Or Nothing</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.UANodeSetChangesType#isAcceptAllOrNothing()
	 * @see #getUANodeSetChangesType()
	 * @generated
	 */
	EAttribute getUANodeSetChangesType_AcceptAllOrNothing();

	/**
	 * Returns the meta object for the attribute '{@link org.opcfoundation.ua._2011._03.ua.node.set.UANodeSetChangesType#getLastModified <em>Last Modified</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Modified</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.UANodeSetChangesType#getLastModified()
	 * @see #getUANodeSetChangesType()
	 * @generated
	 */
	EAttribute getUANodeSetChangesType_LastModified();

	/**
	 * Returns the meta object for the attribute '{@link org.opcfoundation.ua._2011._03.ua.node.set.UANodeSetChangesType#getTransactionId <em>Transaction Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transaction Id</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.UANodeSetChangesType#getTransactionId()
	 * @see #getUANodeSetChangesType()
	 * @generated
	 */
	EAttribute getUANodeSetChangesType_TransactionId();

	/**
	 * Returns the meta object for class '{@link org.opcfoundation.ua._2011._03.ua.node.set.UANodeSetType <em>UA Node Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UA Node Set Type</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.UANodeSetType
	 * @generated
	 */
	EClass getUANodeSetType();

	/**
	 * Returns the meta object for the containment reference '{@link org.opcfoundation.ua._2011._03.ua.node.set.UANodeSetType#getNamespaceUris <em>Namespace Uris</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Namespace Uris</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.UANodeSetType#getNamespaceUris()
	 * @see #getUANodeSetType()
	 * @generated
	 */
	EReference getUANodeSetType_NamespaceUris();

	/**
	 * Returns the meta object for the containment reference '{@link org.opcfoundation.ua._2011._03.ua.node.set.UANodeSetType#getServerUris <em>Server Uris</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Server Uris</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.UANodeSetType#getServerUris()
	 * @see #getUANodeSetType()
	 * @generated
	 */
	EReference getUANodeSetType_ServerUris();

	/**
	 * Returns the meta object for the containment reference '{@link org.opcfoundation.ua._2011._03.ua.node.set.UANodeSetType#getModels <em>Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Models</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.UANodeSetType#getModels()
	 * @see #getUANodeSetType()
	 * @generated
	 */
	EReference getUANodeSetType_Models();

	/**
	 * Returns the meta object for the containment reference '{@link org.opcfoundation.ua._2011._03.ua.node.set.UANodeSetType#getAliases <em>Aliases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Aliases</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.UANodeSetType#getAliases()
	 * @see #getUANodeSetType()
	 * @generated
	 */
	EReference getUANodeSetType_Aliases();

	/**
	 * Returns the meta object for the containment reference '{@link org.opcfoundation.ua._2011._03.ua.node.set.UANodeSetType#getExtensions <em>Extensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Extensions</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.UANodeSetType#getExtensions()
	 * @see #getUANodeSetType()
	 * @generated
	 */
	EReference getUANodeSetType_Extensions();

	/**
	 * Returns the meta object for the attribute list '{@link org.opcfoundation.ua._2011._03.ua.node.set.UANodeSetType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.UANodeSetType#getGroup()
	 * @see #getUANodeSetType()
	 * @generated
	 */
	EAttribute getUANodeSetType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.opcfoundation.ua._2011._03.ua.node.set.UANodeSetType#getUAObject <em>UA Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>UA Object</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.UANodeSetType#getUAObject()
	 * @see #getUANodeSetType()
	 * @generated
	 */
	EReference getUANodeSetType_UAObject();

	/**
	 * Returns the meta object for the containment reference list '{@link org.opcfoundation.ua._2011._03.ua.node.set.UANodeSetType#getUAVariable <em>UA Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>UA Variable</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.UANodeSetType#getUAVariable()
	 * @see #getUANodeSetType()
	 * @generated
	 */
	EReference getUANodeSetType_UAVariable();

	/**
	 * Returns the meta object for the containment reference list '{@link org.opcfoundation.ua._2011._03.ua.node.set.UANodeSetType#getUAMethod <em>UA Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>UA Method</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.UANodeSetType#getUAMethod()
	 * @see #getUANodeSetType()
	 * @generated
	 */
	EReference getUANodeSetType_UAMethod();

	/**
	 * Returns the meta object for the containment reference list '{@link org.opcfoundation.ua._2011._03.ua.node.set.UANodeSetType#getUAView <em>UA View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>UA View</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.UANodeSetType#getUAView()
	 * @see #getUANodeSetType()
	 * @generated
	 */
	EReference getUANodeSetType_UAView();

	/**
	 * Returns the meta object for the containment reference list '{@link org.opcfoundation.ua._2011._03.ua.node.set.UANodeSetType#getUAObjectType <em>UA Object Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>UA Object Type</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.UANodeSetType#getUAObjectType()
	 * @see #getUANodeSetType()
	 * @generated
	 */
	EReference getUANodeSetType_UAObjectType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.opcfoundation.ua._2011._03.ua.node.set.UANodeSetType#getUAVariableType <em>UA Variable Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>UA Variable Type</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.UANodeSetType#getUAVariableType()
	 * @see #getUANodeSetType()
	 * @generated
	 */
	EReference getUANodeSetType_UAVariableType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.opcfoundation.ua._2011._03.ua.node.set.UANodeSetType#getUADataType <em>UA Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>UA Data Type</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.UANodeSetType#getUADataType()
	 * @see #getUANodeSetType()
	 * @generated
	 */
	EReference getUANodeSetType_UADataType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.opcfoundation.ua._2011._03.ua.node.set.UANodeSetType#getUAReferenceType <em>UA Reference Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>UA Reference Type</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.UANodeSetType#getUAReferenceType()
	 * @see #getUANodeSetType()
	 * @generated
	 */
	EReference getUANodeSetType_UAReferenceType();

	/**
	 * Returns the meta object for the attribute '{@link org.opcfoundation.ua._2011._03.ua.node.set.UANodeSetType#getLastModified <em>Last Modified</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Modified</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.UANodeSetType#getLastModified()
	 * @see #getUANodeSetType()
	 * @generated
	 */
	EAttribute getUANodeSetType_LastModified();

	/**
	 * Returns the meta object for class '{@link org.opcfoundation.ua._2011._03.ua.node.set.UAObject <em>UA Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UA Object</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.UAObject
	 * @generated
	 */
	EClass getUAObject();

	/**
	 * Returns the meta object for the attribute '{@link org.opcfoundation.ua._2011._03.ua.node.set.UAObject#getEventNotifier <em>Event Notifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event Notifier</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.UAObject#getEventNotifier()
	 * @see #getUAObject()
	 * @generated
	 */
	EAttribute getUAObject_EventNotifier();

	/**
	 * Returns the meta object for class '{@link org.opcfoundation.ua._2011._03.ua.node.set.UAObjectType <em>UA Object Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UA Object Type</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.UAObjectType
	 * @generated
	 */
	EClass getUAObjectType();

	/**
	 * Returns the meta object for class '{@link org.opcfoundation.ua._2011._03.ua.node.set.UAReferenceType <em>UA Reference Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UA Reference Type</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.UAReferenceType
	 * @generated
	 */
	EClass getUAReferenceType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.opcfoundation.ua._2011._03.ua.node.set.UAReferenceType#getInverseName <em>Inverse Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inverse Name</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.UAReferenceType#getInverseName()
	 * @see #getUAReferenceType()
	 * @generated
	 */
	EReference getUAReferenceType_InverseName();

	/**
	 * Returns the meta object for the attribute '{@link org.opcfoundation.ua._2011._03.ua.node.set.UAReferenceType#isSymmetric <em>Symmetric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Symmetric</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.UAReferenceType#isSymmetric()
	 * @see #getUAReferenceType()
	 * @generated
	 */
	EAttribute getUAReferenceType_Symmetric();

	/**
	 * Returns the meta object for class '{@link org.opcfoundation.ua._2011._03.ua.node.set.UAType <em>UA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UA Type</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.UAType
	 * @generated
	 */
	EClass getUAType();

	/**
	 * Returns the meta object for the attribute '{@link org.opcfoundation.ua._2011._03.ua.node.set.UAType#isIsAbstract <em>Is Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Abstract</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.UAType#isIsAbstract()
	 * @see #getUAType()
	 * @generated
	 */
	EAttribute getUAType_IsAbstract();

	/**
	 * Returns the meta object for class '{@link org.opcfoundation.ua._2011._03.ua.node.set.UAVariable <em>UA Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UA Variable</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.UAVariable
	 * @generated
	 */
	EClass getUAVariable();

	/**
	 * Returns the meta object for the containment reference '{@link org.opcfoundation.ua._2011._03.ua.node.set.UAVariable#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.UAVariable#getValue()
	 * @see #getUAVariable()
	 * @generated
	 */
	EReference getUAVariable_Value();

	/**
	 * Returns the meta object for the containment reference list '{@link org.opcfoundation.ua._2011._03.ua.node.set.UAVariable#getTranslation <em>Translation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Translation</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.UAVariable#getTranslation()
	 * @see #getUAVariable()
	 * @generated
	 */
	EReference getUAVariable_Translation();

	/**
	 * Returns the meta object for the attribute '{@link org.opcfoundation.ua._2011._03.ua.node.set.UAVariable#getAccessLevel <em>Access Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access Level</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.UAVariable#getAccessLevel()
	 * @see #getUAVariable()
	 * @generated
	 */
	EAttribute getUAVariable_AccessLevel();

	/**
	 * Returns the meta object for the attribute '{@link org.opcfoundation.ua._2011._03.ua.node.set.UAVariable#getArrayDimensions <em>Array Dimensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Array Dimensions</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.UAVariable#getArrayDimensions()
	 * @see #getUAVariable()
	 * @generated
	 */
	EAttribute getUAVariable_ArrayDimensions();

	/**
	 * Returns the meta object for the attribute '{@link org.opcfoundation.ua._2011._03.ua.node.set.UAVariable#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Type</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.UAVariable#getDataType()
	 * @see #getUAVariable()
	 * @generated
	 */
	EAttribute getUAVariable_DataType();

	/**
	 * Returns the meta object for the attribute '{@link org.opcfoundation.ua._2011._03.ua.node.set.UAVariable#isHistorizing <em>Historizing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Historizing</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.UAVariable#isHistorizing()
	 * @see #getUAVariable()
	 * @generated
	 */
	EAttribute getUAVariable_Historizing();

	/**
	 * Returns the meta object for the attribute '{@link org.opcfoundation.ua._2011._03.ua.node.set.UAVariable#getMinimumSamplingInterval <em>Minimum Sampling Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minimum Sampling Interval</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.UAVariable#getMinimumSamplingInterval()
	 * @see #getUAVariable()
	 * @generated
	 */
	EAttribute getUAVariable_MinimumSamplingInterval();

	/**
	 * Returns the meta object for the attribute '{@link org.opcfoundation.ua._2011._03.ua.node.set.UAVariable#getUserAccessLevel <em>User Access Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Access Level</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.UAVariable#getUserAccessLevel()
	 * @see #getUAVariable()
	 * @generated
	 */
	EAttribute getUAVariable_UserAccessLevel();

	/**
	 * Returns the meta object for the attribute '{@link org.opcfoundation.ua._2011._03.ua.node.set.UAVariable#getValueRank <em>Value Rank</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Rank</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.UAVariable#getValueRank()
	 * @see #getUAVariable()
	 * @generated
	 */
	EAttribute getUAVariable_ValueRank();

	/**
	 * Returns the meta object for class '{@link org.opcfoundation.ua._2011._03.ua.node.set.UAVariableType <em>UA Variable Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UA Variable Type</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.UAVariableType
	 * @generated
	 */
	EClass getUAVariableType();

	/**
	 * Returns the meta object for the containment reference '{@link org.opcfoundation.ua._2011._03.ua.node.set.UAVariableType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.UAVariableType#getValue()
	 * @see #getUAVariableType()
	 * @generated
	 */
	EReference getUAVariableType_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.opcfoundation.ua._2011._03.ua.node.set.UAVariableType#getArrayDimensions <em>Array Dimensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Array Dimensions</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.UAVariableType#getArrayDimensions()
	 * @see #getUAVariableType()
	 * @generated
	 */
	EAttribute getUAVariableType_ArrayDimensions();

	/**
	 * Returns the meta object for the attribute '{@link org.opcfoundation.ua._2011._03.ua.node.set.UAVariableType#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Type</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.UAVariableType#getDataType()
	 * @see #getUAVariableType()
	 * @generated
	 */
	EAttribute getUAVariableType_DataType();

	/**
	 * Returns the meta object for the attribute '{@link org.opcfoundation.ua._2011._03.ua.node.set.UAVariableType#getValueRank <em>Value Rank</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Rank</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.UAVariableType#getValueRank()
	 * @see #getUAVariableType()
	 * @generated
	 */
	EAttribute getUAVariableType_ValueRank();

	/**
	 * Returns the meta object for class '{@link org.opcfoundation.ua._2011._03.ua.node.set.UAView <em>UA View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UA View</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.UAView
	 * @generated
	 */
	EClass getUAView();

	/**
	 * Returns the meta object for the attribute '{@link org.opcfoundation.ua._2011._03.ua.node.set.UAView#isContainsNoLoops <em>Contains No Loops</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contains No Loops</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.UAView#isContainsNoLoops()
	 * @see #getUAView()
	 * @generated
	 */
	EAttribute getUAView_ContainsNoLoops();

	/**
	 * Returns the meta object for the attribute '{@link org.opcfoundation.ua._2011._03.ua.node.set.UAView#getEventNotifier <em>Event Notifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event Notifier</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.UAView#getEventNotifier()
	 * @see #getUAView()
	 * @generated
	 */
	EAttribute getUAView_EventNotifier();

	/**
	 * Returns the meta object for class '{@link org.opcfoundation.ua._2011._03.ua.node.set.UriTable <em>Uri Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uri Table</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.UriTable
	 * @generated
	 */
	EClass getUriTable();

	/**
	 * Returns the meta object for the attribute list '{@link org.opcfoundation.ua._2011._03.ua.node.set.UriTable#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Uri</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.UriTable#getUri()
	 * @see #getUriTable()
	 * @generated
	 */
	EAttribute getUriTable_Uri();

	/**
	 * Returns the meta object for class '{@link org.opcfoundation.ua._2011._03.ua.node.set.ValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Type</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.ValueType
	 * @generated
	 */
	EClass getValueType();

	/**
	 * Returns the meta object for the attribute list '{@link org.opcfoundation.ua._2011._03.ua.node.set.ValueType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.ValueType#getAny()
	 * @see #getValueType()
	 * @generated
	 */
	EAttribute getValueType_Any();

	/**
	 * Returns the meta object for class '{@link org.opcfoundation.ua._2011._03.ua.node.set.ValueType1 <em>Value Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Type1</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.ValueType1
	 * @generated
	 */
	EClass getValueType1();

	/**
	 * Returns the meta object for the attribute list '{@link org.opcfoundation.ua._2011._03.ua.node.set.ValueType1#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.ValueType1#getAny()
	 * @see #getValueType1()
	 * @generated
	 */
	EAttribute getValueType1_Any();

	/**
	 * Returns the meta object for enum '{@link org.opcfoundation.ua._2011._03.ua.node.set.DataTypePurpose <em>Data Type Purpose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Data Type Purpose</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.DataTypePurpose
	 * @generated
	 */
	EEnum getDataTypePurpose();

	/**
	 * Returns the meta object for enum '{@link org.opcfoundation.ua._2011._03.ua.node.set.ReleaseStatus <em>Release Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Release Status</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.ReleaseStatus
	 * @generated
	 */
	EEnum getReleaseStatus();

	/**
	 * Returns the meta object for data type '<em>Access Level</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Access Level</em>'.
	 * @model instanceClass="long"
	 *        extendedMetaData="name='AccessLevel' baseType='http://www.eclipse.org/emf/2003/XMLType#unsignedInt'"
	 * @generated
	 */
	EDataType getAccessLevel();

	/**
	 * Returns the meta object for data type '{@link java.lang.Long <em>Access Level Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Access Level Object</em>'.
	 * @see java.lang.Long
	 * @model instanceClass="java.lang.Long"
	 *        extendedMetaData="name='AccessLevel:Object' baseType='AccessLevel'"
	 * @generated
	 */
	EDataType getAccessLevelObject();

	/**
	 * Returns the meta object for data type '<em>Access Restriction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Access Restriction</em>'.
	 * @model instanceClass="short"
	 *        extendedMetaData="name='AccessRestriction' baseType='http://www.eclipse.org/emf/2003/XMLType#unsignedByte'"
	 * @generated
	 */
	EDataType getAccessRestriction();

	/**
	 * Returns the meta object for data type '{@link java.lang.Short <em>Access Restriction Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Access Restriction Object</em>'.
	 * @see java.lang.Short
	 * @model instanceClass="java.lang.Short"
	 *        extendedMetaData="name='AccessRestriction:Object' baseType='AccessRestriction'"
	 * @generated
	 */
	EDataType getAccessRestrictionObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Array Dimensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Array Dimensions</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='ArrayDimensions' baseType='http://www.eclipse.org/emf/2003/XMLType#token' pattern='(([0-9]+,)*[0-9]+)?'"
	 * @generated
	 */
	EDataType getArrayDimensions();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>Cardinality Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Cardinality Type</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List"
	 *        extendedMetaData="name='CardinalityType' itemType='CardinalityType_._item'"
	 * @generated
	 */
	EDataType getCardinalityType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Cardinality Type Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Cardinality Type Item</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='CardinalityType_._item' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='(\\p{N})*|unbounded'"
	 * @generated
	 */
	EDataType getCardinalityTypeItem();

	/**
	 * Returns the meta object for data type '{@link org.opcfoundation.ua._2011._03.ua.node.set.DataTypePurpose <em>Data Type Purpose Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Data Type Purpose Object</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.DataTypePurpose
	 * @model instanceClass="org.opcfoundation.ua._2011._03.ua.node.set.DataTypePurpose"
	 *        extendedMetaData="name='DataTypePurpose:Object' baseType='DataTypePurpose'"
	 * @generated
	 */
	EDataType getDataTypePurposeObject();

	/**
	 * Returns the meta object for data type '<em>Duration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Duration</em>'.
	 * @model instanceClass="double"
	 *        extendedMetaData="name='Duration' baseType='http://www.eclipse.org/emf/2003/XMLType#double'"
	 * @generated
	 */
	EDataType getDuration();

	/**
	 * Returns the meta object for data type '{@link java.lang.Double <em>Duration Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Duration Object</em>'.
	 * @see java.lang.Double
	 * @model instanceClass="java.lang.Double"
	 *        extendedMetaData="name='Duration:Object' baseType='Duration'"
	 * @generated
	 */
	EDataType getDurationObject();

	/**
	 * Returns the meta object for data type '<em>Event Notifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Event Notifier</em>'.
	 * @model instanceClass="short"
	 *        extendedMetaData="name='EventNotifier' baseType='http://www.eclipse.org/emf/2003/XMLType#unsignedByte'"
	 * @generated
	 */
	EDataType getEventNotifier();

	/**
	 * Returns the meta object for data type '{@link java.lang.Short <em>Event Notifier Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Event Notifier Object</em>'.
	 * @see java.lang.Short
	 * @model instanceClass="java.lang.Short"
	 *        extendedMetaData="name='EventNotifier:Object' baseType='EventNotifier'"
	 * @generated
	 */
	EDataType getEventNotifierObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Locale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Locale</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='Locale' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getLocale();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Node Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Node Id</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='NodeId' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getNodeId();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Qualified Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Qualified Name</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='QualifiedName' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getQualifiedName();

	/**
	 * Returns the meta object for data type '{@link org.opcfoundation.ua._2011._03.ua.node.set.ReleaseStatus <em>Release Status Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Release Status Object</em>'.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.ReleaseStatus
	 * @model instanceClass="org.opcfoundation.ua._2011._03.ua.node.set.ReleaseStatus"
	 *        extendedMetaData="name='ReleaseStatus:Object' baseType='ReleaseStatus'"
	 * @generated
	 */
	EDataType getReleaseStatusObject();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>Symbolic Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Symbolic Name</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List"
	 *        extendedMetaData="name='SymbolicName' itemType='SymbolicName_._item'"
	 * @generated
	 */
	EDataType getSymbolicName();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Symbolic Name Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Symbolic Name Item</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='SymbolicName_._item' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='[A-Za-z][A-Za-z0-9_]*'"
	 * @generated
	 */
	EDataType getSymbolicNameItem();

	/**
	 * Returns the meta object for data type '<em>Value Rank</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Value Rank</em>'.
	 * @model instanceClass="int"
	 *        extendedMetaData="name='ValueRank' baseType='http://www.eclipse.org/emf/2003/XMLType#int'"
	 * @generated
	 */
	EDataType getValueRank();

	/**
	 * Returns the meta object for data type '{@link java.lang.Integer <em>Value Rank Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Value Rank Object</em>'.
	 * @see java.lang.Integer
	 * @model instanceClass="java.lang.Integer"
	 *        extendedMetaData="name='ValueRank:Object' baseType='ValueRank'"
	 * @generated
	 */
	EDataType getValueRankObject();

	/**
	 * Returns the meta object for data type '<em>Write Mask</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Write Mask</em>'.
	 * @model instanceClass="long"
	 *        extendedMetaData="name='WriteMask' baseType='http://www.eclipse.org/emf/2003/XMLType#unsignedInt'"
	 * @generated
	 */
	EDataType getWriteMask();

	/**
	 * Returns the meta object for data type '{@link java.lang.Long <em>Write Mask Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Write Mask Object</em>'.
	 * @see java.lang.Long
	 * @model instanceClass="java.lang.Long"
	 *        extendedMetaData="name='WriteMask:Object' baseType='WriteMask'"
	 * @generated
	 */
	EDataType getWriteMaskObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SetFactory getSetFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.AliasTableImpl <em>Alias Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.AliasTableImpl
		 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.SetPackageImpl#getAliasTable()
		 * @generated
		 */
		EClass ALIAS_TABLE = eINSTANCE.getAliasTable();

		/**
		 * The meta object literal for the '<em><b>Alias</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALIAS_TABLE__ALIAS = eINSTANCE.getAliasTable_Alias();

		/**
		 * The meta object literal for the '{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.DataTypeDefinitionImpl <em>Data Type Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.DataTypeDefinitionImpl
		 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.SetPackageImpl#getDataTypeDefinition()
		 * @generated
		 */
		EClass DATA_TYPE_DEFINITION = eINSTANCE.getDataTypeDefinition();

		/**
		 * The meta object literal for the '<em><b>Field</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_TYPE_DEFINITION__FIELD = eINSTANCE.getDataTypeDefinition_Field();

		/**
		 * The meta object literal for the '<em><b>Base Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE_DEFINITION__BASE_TYPE = eINSTANCE.getDataTypeDefinition_BaseType();

		/**
		 * The meta object literal for the '<em><b>Is Option Set</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE_DEFINITION__IS_OPTION_SET = eINSTANCE.getDataTypeDefinition_IsOptionSet();

		/**
		 * The meta object literal for the '<em><b>Is Union</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE_DEFINITION__IS_UNION = eINSTANCE.getDataTypeDefinition_IsUnion();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE_DEFINITION__NAME = eINSTANCE.getDataTypeDefinition_Name();

		/**
		 * The meta object literal for the '<em><b>Symbolic Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE_DEFINITION__SYMBOLIC_NAME = eINSTANCE.getDataTypeDefinition_SymbolicName();

		/**
		 * The meta object literal for the '{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.DataTypeFieldImpl <em>Data Type Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.DataTypeFieldImpl
		 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.SetPackageImpl#getDataTypeField()
		 * @generated
		 */
		EClass DATA_TYPE_FIELD = eINSTANCE.getDataTypeField();

		/**
		 * The meta object literal for the '<em><b>Display Name</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_TYPE_FIELD__DISPLAY_NAME = eINSTANCE.getDataTypeField_DisplayName();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_TYPE_FIELD__DESCRIPTION = eINSTANCE.getDataTypeField_Description();

		/**
		 * The meta object literal for the '<em><b>Array Dimensions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE_FIELD__ARRAY_DIMENSIONS = eINSTANCE.getDataTypeField_ArrayDimensions();

		/**
		 * The meta object literal for the '<em><b>Data Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE_FIELD__DATA_TYPE = eINSTANCE.getDataTypeField_DataType();

		/**
		 * The meta object literal for the '<em><b>Is Optional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE_FIELD__IS_OPTIONAL = eINSTANCE.getDataTypeField_IsOptional();

		/**
		 * The meta object literal for the '<em><b>Max String Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE_FIELD__MAX_STRING_LENGTH = eINSTANCE.getDataTypeField_MaxStringLength();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE_FIELD__NAME = eINSTANCE.getDataTypeField_Name();

		/**
		 * The meta object literal for the '<em><b>Symbolic Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE_FIELD__SYMBOLIC_NAME = eINSTANCE.getDataTypeField_SymbolicName();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE_FIELD__VALUE = eINSTANCE.getDataTypeField_Value();

		/**
		 * The meta object literal for the '<em><b>Value Rank</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE_FIELD__VALUE_RANK = eINSTANCE.getDataTypeField_ValueRank();

		/**
		 * The meta object literal for the '{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.DocumentRootImpl
		 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.SetPackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>UA Node Set</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__UA_NODE_SET = eINSTANCE.getDocumentRoot_UANodeSet();

		/**
		 * The meta object literal for the '<em><b>UA Node Set Changes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__UA_NODE_SET_CHANGES = eINSTANCE.getDocumentRoot_UANodeSetChanges();

		/**
		 * The meta object literal for the '<em><b>UA Node Set Changes Status</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__UA_NODE_SET_CHANGES_STATUS = eINSTANCE.getDocumentRoot_UANodeSetChangesStatus();

		/**
		 * The meta object literal for the '{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.ExtensionTypeImpl <em>Extension Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.ExtensionTypeImpl
		 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.SetPackageImpl#getExtensionType()
		 * @generated
		 */
		EClass EXTENSION_TYPE = eINSTANCE.getExtensionType();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENSION_TYPE__ANY = eINSTANCE.getExtensionType_Any();

		/**
		 * The meta object literal for the '{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.ListOfExtensionsImpl <em>List Of Extensions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.ListOfExtensionsImpl
		 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.SetPackageImpl#getListOfExtensions()
		 * @generated
		 */
		EClass LIST_OF_EXTENSIONS = eINSTANCE.getListOfExtensions();

		/**
		 * The meta object literal for the '<em><b>Extension</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST_OF_EXTENSIONS__EXTENSION = eINSTANCE.getListOfExtensions_Extension();

		/**
		 * The meta object literal for the '{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.ListOfReferencesImpl <em>List Of References</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.ListOfReferencesImpl
		 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.SetPackageImpl#getListOfReferences()
		 * @generated
		 */
		EClass LIST_OF_REFERENCES = eINSTANCE.getListOfReferences();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST_OF_REFERENCES__REFERENCE = eINSTANCE.getListOfReferences_Reference();

		/**
		 * The meta object literal for the '{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.ListOfRolePermissionsImpl <em>List Of Role Permissions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.ListOfRolePermissionsImpl
		 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.SetPackageImpl#getListOfRolePermissions()
		 * @generated
		 */
		EClass LIST_OF_ROLE_PERMISSIONS = eINSTANCE.getListOfRolePermissions();

		/**
		 * The meta object literal for the '<em><b>Role Permission</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST_OF_ROLE_PERMISSIONS__ROLE_PERMISSION = eINSTANCE.getListOfRolePermissions_RolePermission();

		/**
		 * The meta object literal for the '{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.LocalizedTextImpl <em>Localized Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.LocalizedTextImpl
		 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.SetPackageImpl#getLocalizedText()
		 * @generated
		 */
		EClass LOCALIZED_TEXT = eINSTANCE.getLocalizedText();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCALIZED_TEXT__VALUE = eINSTANCE.getLocalizedText_Value();

		/**
		 * The meta object literal for the '<em><b>Locale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCALIZED_TEXT__LOCALE = eINSTANCE.getLocalizedText_Locale();

		/**
		 * The meta object literal for the '{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.ModelTableImpl <em>Model Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.ModelTableImpl
		 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.SetPackageImpl#getModelTable()
		 * @generated
		 */
		EClass MODEL_TABLE = eINSTANCE.getModelTable();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_TABLE__MODEL = eINSTANCE.getModelTable_Model();

		/**
		 * The meta object literal for the '{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.ModelTableEntryImpl <em>Model Table Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.ModelTableEntryImpl
		 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.SetPackageImpl#getModelTableEntry()
		 * @generated
		 */
		EClass MODEL_TABLE_ENTRY = eINSTANCE.getModelTableEntry();

		/**
		 * The meta object literal for the '<em><b>Role Permissions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_TABLE_ENTRY__ROLE_PERMISSIONS = eINSTANCE.getModelTableEntry_RolePermissions();

		/**
		 * The meta object literal for the '<em><b>Required Model</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_TABLE_ENTRY__REQUIRED_MODEL = eINSTANCE.getModelTableEntry_RequiredModel();

		/**
		 * The meta object literal for the '<em><b>Access Restrictions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_TABLE_ENTRY__ACCESS_RESTRICTIONS = eINSTANCE.getModelTableEntry_AccessRestrictions();

		/**
		 * The meta object literal for the '<em><b>Model Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_TABLE_ENTRY__MODEL_URI = eINSTANCE.getModelTableEntry_ModelUri();

		/**
		 * The meta object literal for the '<em><b>Publication Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_TABLE_ENTRY__PUBLICATION_DATE = eINSTANCE.getModelTableEntry_PublicationDate();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_TABLE_ENTRY__VERSION = eINSTANCE.getModelTableEntry_Version();

		/**
		 * The meta object literal for the '{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.NodeIdAliasImpl <em>Node Id Alias</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.NodeIdAliasImpl
		 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.SetPackageImpl#getNodeIdAlias()
		 * @generated
		 */
		EClass NODE_ID_ALIAS = eINSTANCE.getNodeIdAlias();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_ID_ALIAS__VALUE = eINSTANCE.getNodeIdAlias_Value();

		/**
		 * The meta object literal for the '<em><b>Alias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_ID_ALIAS__ALIAS = eINSTANCE.getNodeIdAlias_Alias();

		/**
		 * The meta object literal for the '{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.NodeSetStatusImpl <em>Node Set Status</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.NodeSetStatusImpl
		 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.SetPackageImpl#getNodeSetStatus()
		 * @generated
		 */
		EClass NODE_SET_STATUS = eINSTANCE.getNodeSetStatus();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_SET_STATUS__VALUE = eINSTANCE.getNodeSetStatus_Value();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_SET_STATUS__CODE = eINSTANCE.getNodeSetStatus_Code();

		/**
		 * The meta object literal for the '{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.NodeSetStatusListImpl <em>Node Set Status List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.NodeSetStatusListImpl
		 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.SetPackageImpl#getNodeSetStatusList()
		 * @generated
		 */
		EClass NODE_SET_STATUS_LIST = eINSTANCE.getNodeSetStatusList();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_SET_STATUS_LIST__STATUS = eINSTANCE.getNodeSetStatusList_Status();

		/**
		 * The meta object literal for the '{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.NodesToAddImpl <em>Nodes To Add</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.NodesToAddImpl
		 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.SetPackageImpl#getNodesToAdd()
		 * @generated
		 */
		EClass NODES_TO_ADD = eINSTANCE.getNodesToAdd();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODES_TO_ADD__GROUP = eINSTANCE.getNodesToAdd_Group();

		/**
		 * The meta object literal for the '<em><b>UA Object</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODES_TO_ADD__UA_OBJECT = eINSTANCE.getNodesToAdd_UAObject();

		/**
		 * The meta object literal for the '<em><b>UA Variable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODES_TO_ADD__UA_VARIABLE = eINSTANCE.getNodesToAdd_UAVariable();

		/**
		 * The meta object literal for the '<em><b>UA Method</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODES_TO_ADD__UA_METHOD = eINSTANCE.getNodesToAdd_UAMethod();

		/**
		 * The meta object literal for the '<em><b>UA View</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODES_TO_ADD__UA_VIEW = eINSTANCE.getNodesToAdd_UAView();

		/**
		 * The meta object literal for the '<em><b>UA Object Type</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODES_TO_ADD__UA_OBJECT_TYPE = eINSTANCE.getNodesToAdd_UAObjectType();

		/**
		 * The meta object literal for the '<em><b>UA Variable Type</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODES_TO_ADD__UA_VARIABLE_TYPE = eINSTANCE.getNodesToAdd_UAVariableType();

		/**
		 * The meta object literal for the '<em><b>UA Data Type</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODES_TO_ADD__UA_DATA_TYPE = eINSTANCE.getNodesToAdd_UADataType();

		/**
		 * The meta object literal for the '<em><b>UA Reference Type</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODES_TO_ADD__UA_REFERENCE_TYPE = eINSTANCE.getNodesToAdd_UAReferenceType();

		/**
		 * The meta object literal for the '{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.NodesToDeleteImpl <em>Nodes To Delete</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.NodesToDeleteImpl
		 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.SetPackageImpl#getNodesToDelete()
		 * @generated
		 */
		EClass NODES_TO_DELETE = eINSTANCE.getNodesToDelete();

		/**
		 * The meta object literal for the '<em><b>Node</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODES_TO_DELETE__NODE = eINSTANCE.getNodesToDelete_Node();

		/**
		 * The meta object literal for the '{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.NodeToDeleteImpl <em>Node To Delete</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.NodeToDeleteImpl
		 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.SetPackageImpl#getNodeToDelete()
		 * @generated
		 */
		EClass NODE_TO_DELETE = eINSTANCE.getNodeToDelete();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_TO_DELETE__VALUE = eINSTANCE.getNodeToDelete_Value();

		/**
		 * The meta object literal for the '<em><b>Delete Reverse References</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_TO_DELETE__DELETE_REVERSE_REFERENCES = eINSTANCE.getNodeToDelete_DeleteReverseReferences();

		/**
		 * The meta object literal for the '{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.ReferenceImpl <em>Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.ReferenceImpl
		 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.SetPackageImpl#getReference()
		 * @generated
		 */
		EClass REFERENCE = eINSTANCE.getReference();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE__VALUE = eINSTANCE.getReference_Value();

		/**
		 * The meta object literal for the '<em><b>Is Forward</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE__IS_FORWARD = eINSTANCE.getReference_IsForward();

		/**
		 * The meta object literal for the '<em><b>Reference Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE__REFERENCE_TYPE = eINSTANCE.getReference_ReferenceType();

		/**
		 * The meta object literal for the '{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.ReferenceChangeImpl <em>Reference Change</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.ReferenceChangeImpl
		 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.SetPackageImpl#getReferenceChange()
		 * @generated
		 */
		EClass REFERENCE_CHANGE = eINSTANCE.getReferenceChange();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE_CHANGE__VALUE = eINSTANCE.getReferenceChange_Value();

		/**
		 * The meta object literal for the '<em><b>Is Forward</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE_CHANGE__IS_FORWARD = eINSTANCE.getReferenceChange_IsForward();

		/**
		 * The meta object literal for the '<em><b>Reference Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE_CHANGE__REFERENCE_TYPE = eINSTANCE.getReferenceChange_ReferenceType();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE_CHANGE__SOURCE = eINSTANCE.getReferenceChange_Source();

		/**
		 * The meta object literal for the '{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.ReferencesToChangeImpl <em>References To Change</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.ReferencesToChangeImpl
		 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.SetPackageImpl#getReferencesToChange()
		 * @generated
		 */
		EClass REFERENCES_TO_CHANGE = eINSTANCE.getReferencesToChange();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCES_TO_CHANGE__REFERENCE = eINSTANCE.getReferencesToChange_Reference();

		/**
		 * The meta object literal for the '{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.RolePermissionImpl <em>Role Permission</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.RolePermissionImpl
		 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.SetPackageImpl#getRolePermission()
		 * @generated
		 */
		EClass ROLE_PERMISSION = eINSTANCE.getRolePermission();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE_PERMISSION__VALUE = eINSTANCE.getRolePermission_Value();

		/**
		 * The meta object literal for the '<em><b>Permissions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE_PERMISSION__PERMISSIONS = eINSTANCE.getRolePermission_Permissions();

		/**
		 * The meta object literal for the '{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.StructureTranslationTypeImpl <em>Structure Translation Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.StructureTranslationTypeImpl
		 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.SetPackageImpl#getStructureTranslationType()
		 * @generated
		 */
		EClass STRUCTURE_TRANSLATION_TYPE = eINSTANCE.getStructureTranslationType();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURE_TRANSLATION_TYPE__TEXT = eINSTANCE.getStructureTranslationType_Text();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRUCTURE_TRANSLATION_TYPE__NAME = eINSTANCE.getStructureTranslationType_Name();

		/**
		 * The meta object literal for the '{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.TranslationTypeImpl <em>Translation Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.TranslationTypeImpl
		 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.SetPackageImpl#getTranslationType()
		 * @generated
		 */
		EClass TRANSLATION_TYPE = eINSTANCE.getTranslationType();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSLATION_TYPE__TEXT = eINSTANCE.getTranslationType_Text();

		/**
		 * The meta object literal for the '<em><b>Field</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSLATION_TYPE__FIELD = eINSTANCE.getTranslationType_Field();

		/**
		 * The meta object literal for the '{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.UADataTypeImpl <em>UA Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.UADataTypeImpl
		 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.SetPackageImpl#getUADataType()
		 * @generated
		 */
		EClass UA_DATA_TYPE = eINSTANCE.getUADataType();

		/**
		 * The meta object literal for the '<em><b>Definition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UA_DATA_TYPE__DEFINITION = eINSTANCE.getUADataType_Definition();

		/**
		 * The meta object literal for the '<em><b>Purpose</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UA_DATA_TYPE__PURPOSE = eINSTANCE.getUADataType_Purpose();

		/**
		 * The meta object literal for the '{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.UAInstanceImpl <em>UA Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.UAInstanceImpl
		 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.SetPackageImpl#getUAInstance()
		 * @generated
		 */
		EClass UA_INSTANCE = eINSTANCE.getUAInstance();

		/**
		 * The meta object literal for the '<em><b>Parent Node Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UA_INSTANCE__PARENT_NODE_ID = eINSTANCE.getUAInstance_ParentNodeId();

		/**
		 * The meta object literal for the '{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.UAMethodImpl <em>UA Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.UAMethodImpl
		 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.SetPackageImpl#getUAMethod()
		 * @generated
		 */
		EClass UA_METHOD = eINSTANCE.getUAMethod();

		/**
		 * The meta object literal for the '<em><b>Argument Description</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UA_METHOD__ARGUMENT_DESCRIPTION = eINSTANCE.getUAMethod_ArgumentDescription();

		/**
		 * The meta object literal for the '<em><b>Executable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UA_METHOD__EXECUTABLE = eINSTANCE.getUAMethod_Executable();

		/**
		 * The meta object literal for the '<em><b>Method Declaration Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UA_METHOD__METHOD_DECLARATION_ID = eINSTANCE.getUAMethod_MethodDeclarationId();

		/**
		 * The meta object literal for the '<em><b>User Executable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UA_METHOD__USER_EXECUTABLE = eINSTANCE.getUAMethod_UserExecutable();

		/**
		 * The meta object literal for the '{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.UAMethodArgumentImpl <em>UA Method Argument</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.UAMethodArgumentImpl
		 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.SetPackageImpl#getUAMethodArgument()
		 * @generated
		 */
		EClass UA_METHOD_ARGUMENT = eINSTANCE.getUAMethodArgument();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UA_METHOD_ARGUMENT__NAME = eINSTANCE.getUAMethodArgument_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UA_METHOD_ARGUMENT__DESCRIPTION = eINSTANCE.getUAMethodArgument_Description();

		/**
		 * The meta object literal for the '{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.UANodeImpl <em>UA Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.UANodeImpl
		 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.SetPackageImpl#getUANode()
		 * @generated
		 */
		EClass UA_NODE = eINSTANCE.getUANode();

		/**
		 * The meta object literal for the '<em><b>Display Name</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UA_NODE__DISPLAY_NAME = eINSTANCE.getUANode_DisplayName();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UA_NODE__DESCRIPTION = eINSTANCE.getUANode_Description();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UA_NODE__CATEGORY = eINSTANCE.getUANode_Category();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UA_NODE__DOCUMENTATION = eINSTANCE.getUANode_Documentation();

		/**
		 * The meta object literal for the '<em><b>References</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UA_NODE__REFERENCES = eINSTANCE.getUANode_References();

		/**
		 * The meta object literal for the '<em><b>Role Permissions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UA_NODE__ROLE_PERMISSIONS = eINSTANCE.getUANode_RolePermissions();

		/**
		 * The meta object literal for the '<em><b>Extensions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UA_NODE__EXTENSIONS = eINSTANCE.getUANode_Extensions();

		/**
		 * The meta object literal for the '<em><b>Access Restrictions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UA_NODE__ACCESS_RESTRICTIONS = eINSTANCE.getUANode_AccessRestrictions();

		/**
		 * The meta object literal for the '<em><b>Browse Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UA_NODE__BROWSE_NAME = eINSTANCE.getUANode_BrowseName();

		/**
		 * The meta object literal for the '<em><b>Node Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UA_NODE__NODE_ID = eINSTANCE.getUANode_NodeId();

		/**
		 * The meta object literal for the '<em><b>Release Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UA_NODE__RELEASE_STATUS = eINSTANCE.getUANode_ReleaseStatus();

		/**
		 * The meta object literal for the '<em><b>Symbolic Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UA_NODE__SYMBOLIC_NAME = eINSTANCE.getUANode_SymbolicName();

		/**
		 * The meta object literal for the '<em><b>User Write Mask</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UA_NODE__USER_WRITE_MASK = eINSTANCE.getUANode_UserWriteMask();

		/**
		 * The meta object literal for the '<em><b>Write Mask</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UA_NODE__WRITE_MASK = eINSTANCE.getUANode_WriteMask();

		/**
		 * The meta object literal for the '{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.UANodeSetChangesStatusTypeImpl <em>UA Node Set Changes Status Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.UANodeSetChangesStatusTypeImpl
		 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.SetPackageImpl#getUANodeSetChangesStatusType()
		 * @generated
		 */
		EClass UA_NODE_SET_CHANGES_STATUS_TYPE = eINSTANCE.getUANodeSetChangesStatusType();

		/**
		 * The meta object literal for the '<em><b>Nodes To Add</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UA_NODE_SET_CHANGES_STATUS_TYPE__NODES_TO_ADD = eINSTANCE.getUANodeSetChangesStatusType_NodesToAdd();

		/**
		 * The meta object literal for the '<em><b>References To Add</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UA_NODE_SET_CHANGES_STATUS_TYPE__REFERENCES_TO_ADD = eINSTANCE.getUANodeSetChangesStatusType_ReferencesToAdd();

		/**
		 * The meta object literal for the '<em><b>Nodes To Delete</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UA_NODE_SET_CHANGES_STATUS_TYPE__NODES_TO_DELETE = eINSTANCE.getUANodeSetChangesStatusType_NodesToDelete();

		/**
		 * The meta object literal for the '<em><b>References To Delete</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UA_NODE_SET_CHANGES_STATUS_TYPE__REFERENCES_TO_DELETE = eINSTANCE.getUANodeSetChangesStatusType_ReferencesToDelete();

		/**
		 * The meta object literal for the '<em><b>Last Modified</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UA_NODE_SET_CHANGES_STATUS_TYPE__LAST_MODIFIED = eINSTANCE.getUANodeSetChangesStatusType_LastModified();

		/**
		 * The meta object literal for the '<em><b>Transaction Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UA_NODE_SET_CHANGES_STATUS_TYPE__TRANSACTION_ID = eINSTANCE.getUANodeSetChangesStatusType_TransactionId();

		/**
		 * The meta object literal for the '{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.UANodeSetChangesTypeImpl <em>UA Node Set Changes Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.UANodeSetChangesTypeImpl
		 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.SetPackageImpl#getUANodeSetChangesType()
		 * @generated
		 */
		EClass UA_NODE_SET_CHANGES_TYPE = eINSTANCE.getUANodeSetChangesType();

		/**
		 * The meta object literal for the '<em><b>Namespace Uris</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UA_NODE_SET_CHANGES_TYPE__NAMESPACE_URIS = eINSTANCE.getUANodeSetChangesType_NamespaceUris();

		/**
		 * The meta object literal for the '<em><b>Server Uris</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UA_NODE_SET_CHANGES_TYPE__SERVER_URIS = eINSTANCE.getUANodeSetChangesType_ServerUris();

		/**
		 * The meta object literal for the '<em><b>Aliases</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UA_NODE_SET_CHANGES_TYPE__ALIASES = eINSTANCE.getUANodeSetChangesType_Aliases();

		/**
		 * The meta object literal for the '<em><b>Extensions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UA_NODE_SET_CHANGES_TYPE__EXTENSIONS = eINSTANCE.getUANodeSetChangesType_Extensions();

		/**
		 * The meta object literal for the '<em><b>Nodes To Add</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UA_NODE_SET_CHANGES_TYPE__NODES_TO_ADD = eINSTANCE.getUANodeSetChangesType_NodesToAdd();

		/**
		 * The meta object literal for the '<em><b>References To Add</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UA_NODE_SET_CHANGES_TYPE__REFERENCES_TO_ADD = eINSTANCE.getUANodeSetChangesType_ReferencesToAdd();

		/**
		 * The meta object literal for the '<em><b>Nodes To Delete</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UA_NODE_SET_CHANGES_TYPE__NODES_TO_DELETE = eINSTANCE.getUANodeSetChangesType_NodesToDelete();

		/**
		 * The meta object literal for the '<em><b>References To Delete</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UA_NODE_SET_CHANGES_TYPE__REFERENCES_TO_DELETE = eINSTANCE.getUANodeSetChangesType_ReferencesToDelete();

		/**
		 * The meta object literal for the '<em><b>Accept All Or Nothing</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UA_NODE_SET_CHANGES_TYPE__ACCEPT_ALL_OR_NOTHING = eINSTANCE.getUANodeSetChangesType_AcceptAllOrNothing();

		/**
		 * The meta object literal for the '<em><b>Last Modified</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UA_NODE_SET_CHANGES_TYPE__LAST_MODIFIED = eINSTANCE.getUANodeSetChangesType_LastModified();

		/**
		 * The meta object literal for the '<em><b>Transaction Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UA_NODE_SET_CHANGES_TYPE__TRANSACTION_ID = eINSTANCE.getUANodeSetChangesType_TransactionId();

		/**
		 * The meta object literal for the '{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.UANodeSetTypeImpl <em>UA Node Set Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.UANodeSetTypeImpl
		 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.SetPackageImpl#getUANodeSetType()
		 * @generated
		 */
		EClass UA_NODE_SET_TYPE = eINSTANCE.getUANodeSetType();

		/**
		 * The meta object literal for the '<em><b>Namespace Uris</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UA_NODE_SET_TYPE__NAMESPACE_URIS = eINSTANCE.getUANodeSetType_NamespaceUris();

		/**
		 * The meta object literal for the '<em><b>Server Uris</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UA_NODE_SET_TYPE__SERVER_URIS = eINSTANCE.getUANodeSetType_ServerUris();

		/**
		 * The meta object literal for the '<em><b>Models</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UA_NODE_SET_TYPE__MODELS = eINSTANCE.getUANodeSetType_Models();

		/**
		 * The meta object literal for the '<em><b>Aliases</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UA_NODE_SET_TYPE__ALIASES = eINSTANCE.getUANodeSetType_Aliases();

		/**
		 * The meta object literal for the '<em><b>Extensions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UA_NODE_SET_TYPE__EXTENSIONS = eINSTANCE.getUANodeSetType_Extensions();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UA_NODE_SET_TYPE__GROUP = eINSTANCE.getUANodeSetType_Group();

		/**
		 * The meta object literal for the '<em><b>UA Object</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UA_NODE_SET_TYPE__UA_OBJECT = eINSTANCE.getUANodeSetType_UAObject();

		/**
		 * The meta object literal for the '<em><b>UA Variable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UA_NODE_SET_TYPE__UA_VARIABLE = eINSTANCE.getUANodeSetType_UAVariable();

		/**
		 * The meta object literal for the '<em><b>UA Method</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UA_NODE_SET_TYPE__UA_METHOD = eINSTANCE.getUANodeSetType_UAMethod();

		/**
		 * The meta object literal for the '<em><b>UA View</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UA_NODE_SET_TYPE__UA_VIEW = eINSTANCE.getUANodeSetType_UAView();

		/**
		 * The meta object literal for the '<em><b>UA Object Type</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UA_NODE_SET_TYPE__UA_OBJECT_TYPE = eINSTANCE.getUANodeSetType_UAObjectType();

		/**
		 * The meta object literal for the '<em><b>UA Variable Type</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UA_NODE_SET_TYPE__UA_VARIABLE_TYPE = eINSTANCE.getUANodeSetType_UAVariableType();

		/**
		 * The meta object literal for the '<em><b>UA Data Type</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UA_NODE_SET_TYPE__UA_DATA_TYPE = eINSTANCE.getUANodeSetType_UADataType();

		/**
		 * The meta object literal for the '<em><b>UA Reference Type</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UA_NODE_SET_TYPE__UA_REFERENCE_TYPE = eINSTANCE.getUANodeSetType_UAReferenceType();

		/**
		 * The meta object literal for the '<em><b>Last Modified</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UA_NODE_SET_TYPE__LAST_MODIFIED = eINSTANCE.getUANodeSetType_LastModified();

		/**
		 * The meta object literal for the '{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.UAObjectImpl <em>UA Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.UAObjectImpl
		 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.SetPackageImpl#getUAObject()
		 * @generated
		 */
		EClass UA_OBJECT = eINSTANCE.getUAObject();

		/**
		 * The meta object literal for the '<em><b>Event Notifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UA_OBJECT__EVENT_NOTIFIER = eINSTANCE.getUAObject_EventNotifier();

		/**
		 * The meta object literal for the '{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.UAObjectTypeImpl <em>UA Object Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.UAObjectTypeImpl
		 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.SetPackageImpl#getUAObjectType()
		 * @generated
		 */
		EClass UA_OBJECT_TYPE = eINSTANCE.getUAObjectType();

		/**
		 * The meta object literal for the '{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.UAReferenceTypeImpl <em>UA Reference Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.UAReferenceTypeImpl
		 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.SetPackageImpl#getUAReferenceType()
		 * @generated
		 */
		EClass UA_REFERENCE_TYPE = eINSTANCE.getUAReferenceType();

		/**
		 * The meta object literal for the '<em><b>Inverse Name</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UA_REFERENCE_TYPE__INVERSE_NAME = eINSTANCE.getUAReferenceType_InverseName();

		/**
		 * The meta object literal for the '<em><b>Symmetric</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UA_REFERENCE_TYPE__SYMMETRIC = eINSTANCE.getUAReferenceType_Symmetric();

		/**
		 * The meta object literal for the '{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.UATypeImpl <em>UA Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.UATypeImpl
		 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.SetPackageImpl#getUAType()
		 * @generated
		 */
		EClass UA_TYPE = eINSTANCE.getUAType();

		/**
		 * The meta object literal for the '<em><b>Is Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UA_TYPE__IS_ABSTRACT = eINSTANCE.getUAType_IsAbstract();

		/**
		 * The meta object literal for the '{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.UAVariableImpl <em>UA Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.UAVariableImpl
		 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.SetPackageImpl#getUAVariable()
		 * @generated
		 */
		EClass UA_VARIABLE = eINSTANCE.getUAVariable();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UA_VARIABLE__VALUE = eINSTANCE.getUAVariable_Value();

		/**
		 * The meta object literal for the '<em><b>Translation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UA_VARIABLE__TRANSLATION = eINSTANCE.getUAVariable_Translation();

		/**
		 * The meta object literal for the '<em><b>Access Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UA_VARIABLE__ACCESS_LEVEL = eINSTANCE.getUAVariable_AccessLevel();

		/**
		 * The meta object literal for the '<em><b>Array Dimensions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UA_VARIABLE__ARRAY_DIMENSIONS = eINSTANCE.getUAVariable_ArrayDimensions();

		/**
		 * The meta object literal for the '<em><b>Data Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UA_VARIABLE__DATA_TYPE = eINSTANCE.getUAVariable_DataType();

		/**
		 * The meta object literal for the '<em><b>Historizing</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UA_VARIABLE__HISTORIZING = eINSTANCE.getUAVariable_Historizing();

		/**
		 * The meta object literal for the '<em><b>Minimum Sampling Interval</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UA_VARIABLE__MINIMUM_SAMPLING_INTERVAL = eINSTANCE.getUAVariable_MinimumSamplingInterval();

		/**
		 * The meta object literal for the '<em><b>User Access Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UA_VARIABLE__USER_ACCESS_LEVEL = eINSTANCE.getUAVariable_UserAccessLevel();

		/**
		 * The meta object literal for the '<em><b>Value Rank</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UA_VARIABLE__VALUE_RANK = eINSTANCE.getUAVariable_ValueRank();

		/**
		 * The meta object literal for the '{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.UAVariableTypeImpl <em>UA Variable Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.UAVariableTypeImpl
		 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.SetPackageImpl#getUAVariableType()
		 * @generated
		 */
		EClass UA_VARIABLE_TYPE = eINSTANCE.getUAVariableType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UA_VARIABLE_TYPE__VALUE = eINSTANCE.getUAVariableType_Value();

		/**
		 * The meta object literal for the '<em><b>Array Dimensions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UA_VARIABLE_TYPE__ARRAY_DIMENSIONS = eINSTANCE.getUAVariableType_ArrayDimensions();

		/**
		 * The meta object literal for the '<em><b>Data Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UA_VARIABLE_TYPE__DATA_TYPE = eINSTANCE.getUAVariableType_DataType();

		/**
		 * The meta object literal for the '<em><b>Value Rank</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UA_VARIABLE_TYPE__VALUE_RANK = eINSTANCE.getUAVariableType_ValueRank();

		/**
		 * The meta object literal for the '{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.UAViewImpl <em>UA View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.UAViewImpl
		 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.SetPackageImpl#getUAView()
		 * @generated
		 */
		EClass UA_VIEW = eINSTANCE.getUAView();

		/**
		 * The meta object literal for the '<em><b>Contains No Loops</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UA_VIEW__CONTAINS_NO_LOOPS = eINSTANCE.getUAView_ContainsNoLoops();

		/**
		 * The meta object literal for the '<em><b>Event Notifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UA_VIEW__EVENT_NOTIFIER = eINSTANCE.getUAView_EventNotifier();

		/**
		 * The meta object literal for the '{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.UriTableImpl <em>Uri Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.UriTableImpl
		 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.SetPackageImpl#getUriTable()
		 * @generated
		 */
		EClass URI_TABLE = eINSTANCE.getUriTable();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute URI_TABLE__URI = eINSTANCE.getUriTable_Uri();

		/**
		 * The meta object literal for the '{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.ValueTypeImpl <em>Value Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.ValueTypeImpl
		 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.SetPackageImpl#getValueType()
		 * @generated
		 */
		EClass VALUE_TYPE = eINSTANCE.getValueType();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_TYPE__ANY = eINSTANCE.getValueType_Any();

		/**
		 * The meta object literal for the '{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.ValueType1Impl <em>Value Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.ValueType1Impl
		 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.SetPackageImpl#getValueType1()
		 * @generated
		 */
		EClass VALUE_TYPE1 = eINSTANCE.getValueType1();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_TYPE1__ANY = eINSTANCE.getValueType1_Any();

		/**
		 * The meta object literal for the '{@link org.opcfoundation.ua._2011._03.ua.node.set.DataTypePurpose <em>Data Type Purpose</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.opcfoundation.ua._2011._03.ua.node.set.DataTypePurpose
		 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.SetPackageImpl#getDataTypePurpose()
		 * @generated
		 */
		EEnum DATA_TYPE_PURPOSE = eINSTANCE.getDataTypePurpose();

		/**
		 * The meta object literal for the '{@link org.opcfoundation.ua._2011._03.ua.node.set.ReleaseStatus <em>Release Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.opcfoundation.ua._2011._03.ua.node.set.ReleaseStatus
		 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.SetPackageImpl#getReleaseStatus()
		 * @generated
		 */
		EEnum RELEASE_STATUS = eINSTANCE.getReleaseStatus();

		/**
		 * The meta object literal for the '<em>Access Level</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.SetPackageImpl#getAccessLevel()
		 * @generated
		 */
		EDataType ACCESS_LEVEL = eINSTANCE.getAccessLevel();

		/**
		 * The meta object literal for the '<em>Access Level Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Long
		 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.SetPackageImpl#getAccessLevelObject()
		 * @generated
		 */
		EDataType ACCESS_LEVEL_OBJECT = eINSTANCE.getAccessLevelObject();

		/**
		 * The meta object literal for the '<em>Access Restriction</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.SetPackageImpl#getAccessRestriction()
		 * @generated
		 */
		EDataType ACCESS_RESTRICTION = eINSTANCE.getAccessRestriction();

		/**
		 * The meta object literal for the '<em>Access Restriction Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Short
		 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.SetPackageImpl#getAccessRestrictionObject()
		 * @generated
		 */
		EDataType ACCESS_RESTRICTION_OBJECT = eINSTANCE.getAccessRestrictionObject();

		/**
		 * The meta object literal for the '<em>Array Dimensions</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.SetPackageImpl#getArrayDimensions()
		 * @generated
		 */
		EDataType ARRAY_DIMENSIONS = eINSTANCE.getArrayDimensions();

		/**
		 * The meta object literal for the '<em>Cardinality Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.SetPackageImpl#getCardinalityType()
		 * @generated
		 */
		EDataType CARDINALITY_TYPE = eINSTANCE.getCardinalityType();

		/**
		 * The meta object literal for the '<em>Cardinality Type Item</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.SetPackageImpl#getCardinalityTypeItem()
		 * @generated
		 */
		EDataType CARDINALITY_TYPE_ITEM = eINSTANCE.getCardinalityTypeItem();

		/**
		 * The meta object literal for the '<em>Data Type Purpose Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.opcfoundation.ua._2011._03.ua.node.set.DataTypePurpose
		 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.SetPackageImpl#getDataTypePurposeObject()
		 * @generated
		 */
		EDataType DATA_TYPE_PURPOSE_OBJECT = eINSTANCE.getDataTypePurposeObject();

		/**
		 * The meta object literal for the '<em>Duration</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.SetPackageImpl#getDuration()
		 * @generated
		 */
		EDataType DURATION = eINSTANCE.getDuration();

		/**
		 * The meta object literal for the '<em>Duration Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Double
		 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.SetPackageImpl#getDurationObject()
		 * @generated
		 */
		EDataType DURATION_OBJECT = eINSTANCE.getDurationObject();

		/**
		 * The meta object literal for the '<em>Event Notifier</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.SetPackageImpl#getEventNotifier()
		 * @generated
		 */
		EDataType EVENT_NOTIFIER = eINSTANCE.getEventNotifier();

		/**
		 * The meta object literal for the '<em>Event Notifier Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Short
		 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.SetPackageImpl#getEventNotifierObject()
		 * @generated
		 */
		EDataType EVENT_NOTIFIER_OBJECT = eINSTANCE.getEventNotifierObject();

		/**
		 * The meta object literal for the '<em>Locale</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.SetPackageImpl#getLocale()
		 * @generated
		 */
		EDataType LOCALE = eINSTANCE.getLocale();

		/**
		 * The meta object literal for the '<em>Node Id</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.SetPackageImpl#getNodeId()
		 * @generated
		 */
		EDataType NODE_ID = eINSTANCE.getNodeId();

		/**
		 * The meta object literal for the '<em>Qualified Name</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.SetPackageImpl#getQualifiedName()
		 * @generated
		 */
		EDataType QUALIFIED_NAME = eINSTANCE.getQualifiedName();

		/**
		 * The meta object literal for the '<em>Release Status Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.opcfoundation.ua._2011._03.ua.node.set.ReleaseStatus
		 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.SetPackageImpl#getReleaseStatusObject()
		 * @generated
		 */
		EDataType RELEASE_STATUS_OBJECT = eINSTANCE.getReleaseStatusObject();

		/**
		 * The meta object literal for the '<em>Symbolic Name</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.SetPackageImpl#getSymbolicName()
		 * @generated
		 */
		EDataType SYMBOLIC_NAME = eINSTANCE.getSymbolicName();

		/**
		 * The meta object literal for the '<em>Symbolic Name Item</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.SetPackageImpl#getSymbolicNameItem()
		 * @generated
		 */
		EDataType SYMBOLIC_NAME_ITEM = eINSTANCE.getSymbolicNameItem();

		/**
		 * The meta object literal for the '<em>Value Rank</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.SetPackageImpl#getValueRank()
		 * @generated
		 */
		EDataType VALUE_RANK = eINSTANCE.getValueRank();

		/**
		 * The meta object literal for the '<em>Value Rank Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Integer
		 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.SetPackageImpl#getValueRankObject()
		 * @generated
		 */
		EDataType VALUE_RANK_OBJECT = eINSTANCE.getValueRankObject();

		/**
		 * The meta object literal for the '<em>Write Mask</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.SetPackageImpl#getWriteMask()
		 * @generated
		 */
		EDataType WRITE_MASK = eINSTANCE.getWriteMask();

		/**
		 * The meta object literal for the '<em>Write Mask Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Long
		 * @see org.opcfoundation.ua._2011._03.ua.node.set.impl.SetPackageImpl#getWriteMaskObject()
		 * @generated
		 */
		EDataType WRITE_MASK_OBJECT = eINSTANCE.getWriteMaskObject();

	}

} //SetPackage
