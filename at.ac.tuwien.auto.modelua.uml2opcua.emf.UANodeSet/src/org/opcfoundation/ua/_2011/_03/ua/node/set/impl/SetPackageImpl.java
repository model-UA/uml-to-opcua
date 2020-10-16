/**
 */
package org.opcfoundation.ua._2011._03.ua.node.set.impl;

import java.util.List;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.opcfoundation.ua._2011._03.ua.node.set.AliasTable;
import org.opcfoundation.ua._2011._03.ua.node.set.DataTypeDefinition;
import org.opcfoundation.ua._2011._03.ua.node.set.DataTypeField;
import org.opcfoundation.ua._2011._03.ua.node.set.DataTypePurpose;
import org.opcfoundation.ua._2011._03.ua.node.set.DocumentRoot;
import org.opcfoundation.ua._2011._03.ua.node.set.ExtensionType;
import org.opcfoundation.ua._2011._03.ua.node.set.ListOfExtensions;
import org.opcfoundation.ua._2011._03.ua.node.set.ListOfReferences;
import org.opcfoundation.ua._2011._03.ua.node.set.ListOfRolePermissions;
import org.opcfoundation.ua._2011._03.ua.node.set.LocalizedText;
import org.opcfoundation.ua._2011._03.ua.node.set.ModelTable;
import org.opcfoundation.ua._2011._03.ua.node.set.ModelTableEntry;
import org.opcfoundation.ua._2011._03.ua.node.set.NodeIdAlias;
import org.opcfoundation.ua._2011._03.ua.node.set.NodeSetStatus;
import org.opcfoundation.ua._2011._03.ua.node.set.NodeSetStatusList;
import org.opcfoundation.ua._2011._03.ua.node.set.NodeToDelete;
import org.opcfoundation.ua._2011._03.ua.node.set.NodesToAdd;
import org.opcfoundation.ua._2011._03.ua.node.set.NodesToDelete;
import org.opcfoundation.ua._2011._03.ua.node.set.Reference;
import org.opcfoundation.ua._2011._03.ua.node.set.ReferenceChange;
import org.opcfoundation.ua._2011._03.ua.node.set.ReferencesToChange;
import org.opcfoundation.ua._2011._03.ua.node.set.ReleaseStatus;
import org.opcfoundation.ua._2011._03.ua.node.set.RolePermission;
import org.opcfoundation.ua._2011._03.ua.node.set.SetFactory;
import org.opcfoundation.ua._2011._03.ua.node.set.SetPackage;
import org.opcfoundation.ua._2011._03.ua.node.set.StructureTranslationType;
import org.opcfoundation.ua._2011._03.ua.node.set.TranslationType;
import org.opcfoundation.ua._2011._03.ua.node.set.UADataType;
import org.opcfoundation.ua._2011._03.ua.node.set.UAInstance;
import org.opcfoundation.ua._2011._03.ua.node.set.UAMethod;
import org.opcfoundation.ua._2011._03.ua.node.set.UAMethodArgument;
import org.opcfoundation.ua._2011._03.ua.node.set.UANode;
import org.opcfoundation.ua._2011._03.ua.node.set.UANodeSetChangesStatusType;
import org.opcfoundation.ua._2011._03.ua.node.set.UANodeSetChangesType;
import org.opcfoundation.ua._2011._03.ua.node.set.UANodeSetType;
import org.opcfoundation.ua._2011._03.ua.node.set.UAObject;
import org.opcfoundation.ua._2011._03.ua.node.set.UAObjectType;
import org.opcfoundation.ua._2011._03.ua.node.set.UAReferenceType;
import org.opcfoundation.ua._2011._03.ua.node.set.UAType;
import org.opcfoundation.ua._2011._03.ua.node.set.UAVariable;
import org.opcfoundation.ua._2011._03.ua.node.set.UAVariableType;
import org.opcfoundation.ua._2011._03.ua.node.set.UAView;
import org.opcfoundation.ua._2011._03.ua.node.set.UriTable;
import org.opcfoundation.ua._2011._03.ua.node.set.ValueType;
import org.opcfoundation.ua._2011._03.ua.node.set.ValueType1;

import org.opcfoundation.ua._2011._03.ua.node.set.util.SetValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SetPackageImpl extends EPackageImpl implements SetPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aliasTableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataTypeDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataTypeFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extensionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfExtensionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfReferencesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfRolePermissionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass localizedTextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelTableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelTableEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeIdAliasEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeSetStatusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeSetStatusListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodesToAddEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodesToDeleteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeToDeleteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceChangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referencesToChangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rolePermissionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structureTranslationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass translationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uaDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uaInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uaMethodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uaMethodArgumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uaNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uaNodeSetChangesStatusTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uaNodeSetChangesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uaNodeSetTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uaObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uaObjectTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uaReferenceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uaTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uaVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uaVariableTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uaViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uriTableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dataTypePurposeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum releaseStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType accessLevelEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType accessLevelObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType accessRestrictionEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType accessRestrictionObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType arrayDimensionsEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cardinalityTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cardinalityTypeItemEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dataTypePurposeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType durationEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType durationObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eventNotifierEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eventNotifierObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType localeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType nodeIdEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType qualifiedNameEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType releaseStatusObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType symbolicNameEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType symbolicNameItemEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType valueRankEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType valueRankObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType writeMaskEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType writeMaskObjectEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.SetPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SetPackageImpl() {
		super(eNS_URI, SetFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link SetPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SetPackage init() {
		if (isInited) return (SetPackage)EPackage.Registry.INSTANCE.getEPackage(SetPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSetPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SetPackageImpl theSetPackage = registeredSetPackage instanceof SetPackageImpl ? (SetPackageImpl)registeredSetPackage : new SetPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSetPackage.createPackageContents();

		// Initialize created meta-data
		theSetPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theSetPackage,
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return SetValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theSetPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SetPackage.eNS_URI, theSetPackage);
		return theSetPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAliasTable() {
		return aliasTableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAliasTable_Alias() {
		return (EReference)aliasTableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataTypeDefinition() {
		return dataTypeDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataTypeDefinition_Field() {
		return (EReference)dataTypeDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataTypeDefinition_BaseType() {
		return (EAttribute)dataTypeDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataTypeDefinition_IsOptionSet() {
		return (EAttribute)dataTypeDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataTypeDefinition_IsUnion() {
		return (EAttribute)dataTypeDefinitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataTypeDefinition_Name() {
		return (EAttribute)dataTypeDefinitionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataTypeDefinition_SymbolicName() {
		return (EAttribute)dataTypeDefinitionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataTypeField() {
		return dataTypeFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataTypeField_DisplayName() {
		return (EReference)dataTypeFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataTypeField_Description() {
		return (EReference)dataTypeFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataTypeField_ArrayDimensions() {
		return (EAttribute)dataTypeFieldEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataTypeField_DataType() {
		return (EAttribute)dataTypeFieldEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataTypeField_IsOptional() {
		return (EAttribute)dataTypeFieldEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataTypeField_MaxStringLength() {
		return (EAttribute)dataTypeFieldEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataTypeField_Name() {
		return (EAttribute)dataTypeFieldEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataTypeField_SymbolicName() {
		return (EAttribute)dataTypeFieldEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataTypeField_Value() {
		return (EAttribute)dataTypeFieldEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataTypeField_ValueRank() {
		return (EAttribute)dataTypeFieldEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_UANodeSet() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_UANodeSetChanges() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_UANodeSetChangesStatus() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtensionType() {
		return extensionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtensionType_Any() {
		return (EAttribute)extensionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfExtensions() {
		return listOfExtensionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfExtensions_Extension() {
		return (EReference)listOfExtensionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfReferences() {
		return listOfReferencesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfReferences_Reference() {
		return (EReference)listOfReferencesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfRolePermissions() {
		return listOfRolePermissionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfRolePermissions_RolePermission() {
		return (EReference)listOfRolePermissionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocalizedText() {
		return localizedTextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocalizedText_Value() {
		return (EAttribute)localizedTextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocalizedText_Locale() {
		return (EAttribute)localizedTextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelTable() {
		return modelTableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelTable_Model() {
		return (EReference)modelTableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelTableEntry() {
		return modelTableEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelTableEntry_RolePermissions() {
		return (EReference)modelTableEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelTableEntry_RequiredModel() {
		return (EReference)modelTableEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelTableEntry_AccessRestrictions() {
		return (EAttribute)modelTableEntryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelTableEntry_ModelUri() {
		return (EAttribute)modelTableEntryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelTableEntry_PublicationDate() {
		return (EAttribute)modelTableEntryEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelTableEntry_Version() {
		return (EAttribute)modelTableEntryEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNodeIdAlias() {
		return nodeIdAliasEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodeIdAlias_Value() {
		return (EAttribute)nodeIdAliasEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodeIdAlias_Alias() {
		return (EAttribute)nodeIdAliasEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNodeSetStatus() {
		return nodeSetStatusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodeSetStatus_Value() {
		return (EAttribute)nodeSetStatusEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodeSetStatus_Code() {
		return (EAttribute)nodeSetStatusEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNodeSetStatusList() {
		return nodeSetStatusListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodeSetStatusList_Status() {
		return (EReference)nodeSetStatusListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNodesToAdd() {
		return nodesToAddEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodesToAdd_Group() {
		return (EAttribute)nodesToAddEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodesToAdd_UAObject() {
		return (EReference)nodesToAddEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodesToAdd_UAVariable() {
		return (EReference)nodesToAddEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodesToAdd_UAMethod() {
		return (EReference)nodesToAddEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodesToAdd_UAView() {
		return (EReference)nodesToAddEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodesToAdd_UAObjectType() {
		return (EReference)nodesToAddEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodesToAdd_UAVariableType() {
		return (EReference)nodesToAddEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodesToAdd_UADataType() {
		return (EReference)nodesToAddEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodesToAdd_UAReferenceType() {
		return (EReference)nodesToAddEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNodesToDelete() {
		return nodesToDeleteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodesToDelete_Node() {
		return (EReference)nodesToDeleteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNodeToDelete() {
		return nodeToDeleteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodeToDelete_Value() {
		return (EAttribute)nodeToDeleteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodeToDelete_DeleteReverseReferences() {
		return (EAttribute)nodeToDeleteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReference() {
		return referenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReference_Value() {
		return (EAttribute)referenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReference_IsForward() {
		return (EAttribute)referenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReference_ReferenceType() {
		return (EAttribute)referenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReferenceChange() {
		return referenceChangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferenceChange_Value() {
		return (EAttribute)referenceChangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferenceChange_IsForward() {
		return (EAttribute)referenceChangeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferenceChange_ReferenceType() {
		return (EAttribute)referenceChangeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferenceChange_Source() {
		return (EAttribute)referenceChangeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReferencesToChange() {
		return referencesToChangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferencesToChange_Reference() {
		return (EReference)referencesToChangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRolePermission() {
		return rolePermissionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRolePermission_Value() {
		return (EAttribute)rolePermissionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRolePermission_Permissions() {
		return (EAttribute)rolePermissionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructureTranslationType() {
		return structureTranslationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureTranslationType_Text() {
		return (EReference)structureTranslationTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStructureTranslationType_Name() {
		return (EAttribute)structureTranslationTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTranslationType() {
		return translationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTranslationType_Text() {
		return (EReference)translationTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTranslationType_Field() {
		return (EReference)translationTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUADataType() {
		return uaDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUADataType_Definition() {
		return (EReference)uaDataTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUADataType_Purpose() {
		return (EAttribute)uaDataTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUAInstance() {
		return uaInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUAInstance_ParentNodeId() {
		return (EAttribute)uaInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUAMethod() {
		return uaMethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUAMethod_ArgumentDescription() {
		return (EReference)uaMethodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUAMethod_Executable() {
		return (EAttribute)uaMethodEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUAMethod_MethodDeclarationId() {
		return (EAttribute)uaMethodEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUAMethod_UserExecutable() {
		return (EAttribute)uaMethodEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUAMethodArgument() {
		return uaMethodArgumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUAMethodArgument_Name() {
		return (EAttribute)uaMethodArgumentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUAMethodArgument_Description() {
		return (EReference)uaMethodArgumentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUANode() {
		return uaNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUANode_DisplayName() {
		return (EReference)uaNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUANode_Description() {
		return (EReference)uaNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUANode_Category() {
		return (EAttribute)uaNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUANode_Documentation() {
		return (EAttribute)uaNodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUANode_References() {
		return (EReference)uaNodeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUANode_RolePermissions() {
		return (EReference)uaNodeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUANode_Extensions() {
		return (EReference)uaNodeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUANode_AccessRestrictions() {
		return (EAttribute)uaNodeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUANode_BrowseName() {
		return (EAttribute)uaNodeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUANode_NodeId() {
		return (EAttribute)uaNodeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUANode_ReleaseStatus() {
		return (EAttribute)uaNodeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUANode_SymbolicName() {
		return (EAttribute)uaNodeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUANode_UserWriteMask() {
		return (EAttribute)uaNodeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUANode_WriteMask() {
		return (EAttribute)uaNodeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUANodeSetChangesStatusType() {
		return uaNodeSetChangesStatusTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUANodeSetChangesStatusType_NodesToAdd() {
		return (EReference)uaNodeSetChangesStatusTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUANodeSetChangesStatusType_ReferencesToAdd() {
		return (EReference)uaNodeSetChangesStatusTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUANodeSetChangesStatusType_NodesToDelete() {
		return (EReference)uaNodeSetChangesStatusTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUANodeSetChangesStatusType_ReferencesToDelete() {
		return (EReference)uaNodeSetChangesStatusTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUANodeSetChangesStatusType_LastModified() {
		return (EAttribute)uaNodeSetChangesStatusTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUANodeSetChangesStatusType_TransactionId() {
		return (EAttribute)uaNodeSetChangesStatusTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUANodeSetChangesType() {
		return uaNodeSetChangesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUANodeSetChangesType_NamespaceUris() {
		return (EReference)uaNodeSetChangesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUANodeSetChangesType_ServerUris() {
		return (EReference)uaNodeSetChangesTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUANodeSetChangesType_Aliases() {
		return (EReference)uaNodeSetChangesTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUANodeSetChangesType_Extensions() {
		return (EReference)uaNodeSetChangesTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUANodeSetChangesType_NodesToAdd() {
		return (EReference)uaNodeSetChangesTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUANodeSetChangesType_ReferencesToAdd() {
		return (EReference)uaNodeSetChangesTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUANodeSetChangesType_NodesToDelete() {
		return (EReference)uaNodeSetChangesTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUANodeSetChangesType_ReferencesToDelete() {
		return (EReference)uaNodeSetChangesTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUANodeSetChangesType_AcceptAllOrNothing() {
		return (EAttribute)uaNodeSetChangesTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUANodeSetChangesType_LastModified() {
		return (EAttribute)uaNodeSetChangesTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUANodeSetChangesType_TransactionId() {
		return (EAttribute)uaNodeSetChangesTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUANodeSetType() {
		return uaNodeSetTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUANodeSetType_NamespaceUris() {
		return (EReference)uaNodeSetTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUANodeSetType_ServerUris() {
		return (EReference)uaNodeSetTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUANodeSetType_Models() {
		return (EReference)uaNodeSetTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUANodeSetType_Aliases() {
		return (EReference)uaNodeSetTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUANodeSetType_Extensions() {
		return (EReference)uaNodeSetTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUANodeSetType_Group() {
		return (EAttribute)uaNodeSetTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUANodeSetType_UAObject() {
		return (EReference)uaNodeSetTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUANodeSetType_UAVariable() {
		return (EReference)uaNodeSetTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUANodeSetType_UAMethod() {
		return (EReference)uaNodeSetTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUANodeSetType_UAView() {
		return (EReference)uaNodeSetTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUANodeSetType_UAObjectType() {
		return (EReference)uaNodeSetTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUANodeSetType_UAVariableType() {
		return (EReference)uaNodeSetTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUANodeSetType_UADataType() {
		return (EReference)uaNodeSetTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUANodeSetType_UAReferenceType() {
		return (EReference)uaNodeSetTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUANodeSetType_LastModified() {
		return (EAttribute)uaNodeSetTypeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUAObject() {
		return uaObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUAObject_EventNotifier() {
		return (EAttribute)uaObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUAObjectType() {
		return uaObjectTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUAReferenceType() {
		return uaReferenceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUAReferenceType_InverseName() {
		return (EReference)uaReferenceTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUAReferenceType_Symmetric() {
		return (EAttribute)uaReferenceTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUAType() {
		return uaTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUAType_IsAbstract() {
		return (EAttribute)uaTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUAVariable() {
		return uaVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUAVariable_Value() {
		return (EReference)uaVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUAVariable_Translation() {
		return (EReference)uaVariableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUAVariable_AccessLevel() {
		return (EAttribute)uaVariableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUAVariable_ArrayDimensions() {
		return (EAttribute)uaVariableEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUAVariable_DataType() {
		return (EAttribute)uaVariableEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUAVariable_Historizing() {
		return (EAttribute)uaVariableEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUAVariable_MinimumSamplingInterval() {
		return (EAttribute)uaVariableEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUAVariable_UserAccessLevel() {
		return (EAttribute)uaVariableEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUAVariable_ValueRank() {
		return (EAttribute)uaVariableEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUAVariableType() {
		return uaVariableTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUAVariableType_Value() {
		return (EReference)uaVariableTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUAVariableType_ArrayDimensions() {
		return (EAttribute)uaVariableTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUAVariableType_DataType() {
		return (EAttribute)uaVariableTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUAVariableType_ValueRank() {
		return (EAttribute)uaVariableTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUAView() {
		return uaViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUAView_ContainsNoLoops() {
		return (EAttribute)uaViewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUAView_EventNotifier() {
		return (EAttribute)uaViewEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUriTable() {
		return uriTableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUriTable_Uri() {
		return (EAttribute)uriTableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueType() {
		return valueTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueType_Any() {
		return (EAttribute)valueTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueType1() {
		return valueType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueType1_Any() {
		return (EAttribute)valueType1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDataTypePurpose() {
		return dataTypePurposeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getReleaseStatus() {
		return releaseStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAccessLevel() {
		return accessLevelEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAccessLevelObject() {
		return accessLevelObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAccessRestriction() {
		return accessRestrictionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAccessRestrictionObject() {
		return accessRestrictionObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getArrayDimensions() {
		return arrayDimensionsEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCardinalityType() {
		return cardinalityTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCardinalityTypeItem() {
		return cardinalityTypeItemEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDataTypePurposeObject() {
		return dataTypePurposeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDuration() {
		return durationEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDurationObject() {
		return durationObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEventNotifier() {
		return eventNotifierEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEventNotifierObject() {
		return eventNotifierObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getLocale() {
		return localeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNodeId() {
		return nodeIdEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getQualifiedName() {
		return qualifiedNameEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getReleaseStatusObject() {
		return releaseStatusObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSymbolicName() {
		return symbolicNameEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSymbolicNameItem() {
		return symbolicNameItemEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getValueRank() {
		return valueRankEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getValueRankObject() {
		return valueRankObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getWriteMask() {
		return writeMaskEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getWriteMaskObject() {
		return writeMaskObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetFactory getSetFactory() {
		return (SetFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		aliasTableEClass = createEClass(ALIAS_TABLE);
		createEReference(aliasTableEClass, ALIAS_TABLE__ALIAS);

		dataTypeDefinitionEClass = createEClass(DATA_TYPE_DEFINITION);
		createEReference(dataTypeDefinitionEClass, DATA_TYPE_DEFINITION__FIELD);
		createEAttribute(dataTypeDefinitionEClass, DATA_TYPE_DEFINITION__BASE_TYPE);
		createEAttribute(dataTypeDefinitionEClass, DATA_TYPE_DEFINITION__IS_OPTION_SET);
		createEAttribute(dataTypeDefinitionEClass, DATA_TYPE_DEFINITION__IS_UNION);
		createEAttribute(dataTypeDefinitionEClass, DATA_TYPE_DEFINITION__NAME);
		createEAttribute(dataTypeDefinitionEClass, DATA_TYPE_DEFINITION__SYMBOLIC_NAME);

		dataTypeFieldEClass = createEClass(DATA_TYPE_FIELD);
		createEReference(dataTypeFieldEClass, DATA_TYPE_FIELD__DISPLAY_NAME);
		createEReference(dataTypeFieldEClass, DATA_TYPE_FIELD__DESCRIPTION);
		createEAttribute(dataTypeFieldEClass, DATA_TYPE_FIELD__ARRAY_DIMENSIONS);
		createEAttribute(dataTypeFieldEClass, DATA_TYPE_FIELD__DATA_TYPE);
		createEAttribute(dataTypeFieldEClass, DATA_TYPE_FIELD__IS_OPTIONAL);
		createEAttribute(dataTypeFieldEClass, DATA_TYPE_FIELD__MAX_STRING_LENGTH);
		createEAttribute(dataTypeFieldEClass, DATA_TYPE_FIELD__NAME);
		createEAttribute(dataTypeFieldEClass, DATA_TYPE_FIELD__SYMBOLIC_NAME);
		createEAttribute(dataTypeFieldEClass, DATA_TYPE_FIELD__VALUE);
		createEAttribute(dataTypeFieldEClass, DATA_TYPE_FIELD__VALUE_RANK);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__UA_NODE_SET);
		createEReference(documentRootEClass, DOCUMENT_ROOT__UA_NODE_SET_CHANGES);
		createEReference(documentRootEClass, DOCUMENT_ROOT__UA_NODE_SET_CHANGES_STATUS);

		extensionTypeEClass = createEClass(EXTENSION_TYPE);
		createEAttribute(extensionTypeEClass, EXTENSION_TYPE__ANY);

		listOfExtensionsEClass = createEClass(LIST_OF_EXTENSIONS);
		createEReference(listOfExtensionsEClass, LIST_OF_EXTENSIONS__EXTENSION);

		listOfReferencesEClass = createEClass(LIST_OF_REFERENCES);
		createEReference(listOfReferencesEClass, LIST_OF_REFERENCES__REFERENCE);

		listOfRolePermissionsEClass = createEClass(LIST_OF_ROLE_PERMISSIONS);
		createEReference(listOfRolePermissionsEClass, LIST_OF_ROLE_PERMISSIONS__ROLE_PERMISSION);

		localizedTextEClass = createEClass(LOCALIZED_TEXT);
		createEAttribute(localizedTextEClass, LOCALIZED_TEXT__VALUE);
		createEAttribute(localizedTextEClass, LOCALIZED_TEXT__LOCALE);

		modelTableEClass = createEClass(MODEL_TABLE);
		createEReference(modelTableEClass, MODEL_TABLE__MODEL);

		modelTableEntryEClass = createEClass(MODEL_TABLE_ENTRY);
		createEReference(modelTableEntryEClass, MODEL_TABLE_ENTRY__ROLE_PERMISSIONS);
		createEReference(modelTableEntryEClass, MODEL_TABLE_ENTRY__REQUIRED_MODEL);
		createEAttribute(modelTableEntryEClass, MODEL_TABLE_ENTRY__ACCESS_RESTRICTIONS);
		createEAttribute(modelTableEntryEClass, MODEL_TABLE_ENTRY__MODEL_URI);
		createEAttribute(modelTableEntryEClass, MODEL_TABLE_ENTRY__PUBLICATION_DATE);
		createEAttribute(modelTableEntryEClass, MODEL_TABLE_ENTRY__VERSION);

		nodeIdAliasEClass = createEClass(NODE_ID_ALIAS);
		createEAttribute(nodeIdAliasEClass, NODE_ID_ALIAS__VALUE);
		createEAttribute(nodeIdAliasEClass, NODE_ID_ALIAS__ALIAS);

		nodeSetStatusEClass = createEClass(NODE_SET_STATUS);
		createEAttribute(nodeSetStatusEClass, NODE_SET_STATUS__VALUE);
		createEAttribute(nodeSetStatusEClass, NODE_SET_STATUS__CODE);

		nodeSetStatusListEClass = createEClass(NODE_SET_STATUS_LIST);
		createEReference(nodeSetStatusListEClass, NODE_SET_STATUS_LIST__STATUS);

		nodesToAddEClass = createEClass(NODES_TO_ADD);
		createEAttribute(nodesToAddEClass, NODES_TO_ADD__GROUP);
		createEReference(nodesToAddEClass, NODES_TO_ADD__UA_OBJECT);
		createEReference(nodesToAddEClass, NODES_TO_ADD__UA_VARIABLE);
		createEReference(nodesToAddEClass, NODES_TO_ADD__UA_METHOD);
		createEReference(nodesToAddEClass, NODES_TO_ADD__UA_VIEW);
		createEReference(nodesToAddEClass, NODES_TO_ADD__UA_OBJECT_TYPE);
		createEReference(nodesToAddEClass, NODES_TO_ADD__UA_VARIABLE_TYPE);
		createEReference(nodesToAddEClass, NODES_TO_ADD__UA_DATA_TYPE);
		createEReference(nodesToAddEClass, NODES_TO_ADD__UA_REFERENCE_TYPE);

		nodesToDeleteEClass = createEClass(NODES_TO_DELETE);
		createEReference(nodesToDeleteEClass, NODES_TO_DELETE__NODE);

		nodeToDeleteEClass = createEClass(NODE_TO_DELETE);
		createEAttribute(nodeToDeleteEClass, NODE_TO_DELETE__VALUE);
		createEAttribute(nodeToDeleteEClass, NODE_TO_DELETE__DELETE_REVERSE_REFERENCES);

		referenceEClass = createEClass(REFERENCE);
		createEAttribute(referenceEClass, REFERENCE__VALUE);
		createEAttribute(referenceEClass, REFERENCE__IS_FORWARD);
		createEAttribute(referenceEClass, REFERENCE__REFERENCE_TYPE);

		referenceChangeEClass = createEClass(REFERENCE_CHANGE);
		createEAttribute(referenceChangeEClass, REFERENCE_CHANGE__VALUE);
		createEAttribute(referenceChangeEClass, REFERENCE_CHANGE__IS_FORWARD);
		createEAttribute(referenceChangeEClass, REFERENCE_CHANGE__REFERENCE_TYPE);
		createEAttribute(referenceChangeEClass, REFERENCE_CHANGE__SOURCE);

		referencesToChangeEClass = createEClass(REFERENCES_TO_CHANGE);
		createEReference(referencesToChangeEClass, REFERENCES_TO_CHANGE__REFERENCE);

		rolePermissionEClass = createEClass(ROLE_PERMISSION);
		createEAttribute(rolePermissionEClass, ROLE_PERMISSION__VALUE);
		createEAttribute(rolePermissionEClass, ROLE_PERMISSION__PERMISSIONS);

		structureTranslationTypeEClass = createEClass(STRUCTURE_TRANSLATION_TYPE);
		createEReference(structureTranslationTypeEClass, STRUCTURE_TRANSLATION_TYPE__TEXT);
		createEAttribute(structureTranslationTypeEClass, STRUCTURE_TRANSLATION_TYPE__NAME);

		translationTypeEClass = createEClass(TRANSLATION_TYPE);
		createEReference(translationTypeEClass, TRANSLATION_TYPE__TEXT);
		createEReference(translationTypeEClass, TRANSLATION_TYPE__FIELD);

		uaDataTypeEClass = createEClass(UA_DATA_TYPE);
		createEReference(uaDataTypeEClass, UA_DATA_TYPE__DEFINITION);
		createEAttribute(uaDataTypeEClass, UA_DATA_TYPE__PURPOSE);

		uaInstanceEClass = createEClass(UA_INSTANCE);
		createEAttribute(uaInstanceEClass, UA_INSTANCE__PARENT_NODE_ID);

		uaMethodEClass = createEClass(UA_METHOD);
		createEReference(uaMethodEClass, UA_METHOD__ARGUMENT_DESCRIPTION);
		createEAttribute(uaMethodEClass, UA_METHOD__EXECUTABLE);
		createEAttribute(uaMethodEClass, UA_METHOD__METHOD_DECLARATION_ID);
		createEAttribute(uaMethodEClass, UA_METHOD__USER_EXECUTABLE);

		uaMethodArgumentEClass = createEClass(UA_METHOD_ARGUMENT);
		createEAttribute(uaMethodArgumentEClass, UA_METHOD_ARGUMENT__NAME);
		createEReference(uaMethodArgumentEClass, UA_METHOD_ARGUMENT__DESCRIPTION);

		uaNodeEClass = createEClass(UA_NODE);
		createEReference(uaNodeEClass, UA_NODE__DISPLAY_NAME);
		createEReference(uaNodeEClass, UA_NODE__DESCRIPTION);
		createEAttribute(uaNodeEClass, UA_NODE__CATEGORY);
		createEAttribute(uaNodeEClass, UA_NODE__DOCUMENTATION);
		createEReference(uaNodeEClass, UA_NODE__REFERENCES);
		createEReference(uaNodeEClass, UA_NODE__ROLE_PERMISSIONS);
		createEReference(uaNodeEClass, UA_NODE__EXTENSIONS);
		createEAttribute(uaNodeEClass, UA_NODE__ACCESS_RESTRICTIONS);
		createEAttribute(uaNodeEClass, UA_NODE__BROWSE_NAME);
		createEAttribute(uaNodeEClass, UA_NODE__NODE_ID);
		createEAttribute(uaNodeEClass, UA_NODE__RELEASE_STATUS);
		createEAttribute(uaNodeEClass, UA_NODE__SYMBOLIC_NAME);
		createEAttribute(uaNodeEClass, UA_NODE__USER_WRITE_MASK);
		createEAttribute(uaNodeEClass, UA_NODE__WRITE_MASK);

		uaNodeSetChangesStatusTypeEClass = createEClass(UA_NODE_SET_CHANGES_STATUS_TYPE);
		createEReference(uaNodeSetChangesStatusTypeEClass, UA_NODE_SET_CHANGES_STATUS_TYPE__NODES_TO_ADD);
		createEReference(uaNodeSetChangesStatusTypeEClass, UA_NODE_SET_CHANGES_STATUS_TYPE__REFERENCES_TO_ADD);
		createEReference(uaNodeSetChangesStatusTypeEClass, UA_NODE_SET_CHANGES_STATUS_TYPE__NODES_TO_DELETE);
		createEReference(uaNodeSetChangesStatusTypeEClass, UA_NODE_SET_CHANGES_STATUS_TYPE__REFERENCES_TO_DELETE);
		createEAttribute(uaNodeSetChangesStatusTypeEClass, UA_NODE_SET_CHANGES_STATUS_TYPE__LAST_MODIFIED);
		createEAttribute(uaNodeSetChangesStatusTypeEClass, UA_NODE_SET_CHANGES_STATUS_TYPE__TRANSACTION_ID);

		uaNodeSetChangesTypeEClass = createEClass(UA_NODE_SET_CHANGES_TYPE);
		createEReference(uaNodeSetChangesTypeEClass, UA_NODE_SET_CHANGES_TYPE__NAMESPACE_URIS);
		createEReference(uaNodeSetChangesTypeEClass, UA_NODE_SET_CHANGES_TYPE__SERVER_URIS);
		createEReference(uaNodeSetChangesTypeEClass, UA_NODE_SET_CHANGES_TYPE__ALIASES);
		createEReference(uaNodeSetChangesTypeEClass, UA_NODE_SET_CHANGES_TYPE__EXTENSIONS);
		createEReference(uaNodeSetChangesTypeEClass, UA_NODE_SET_CHANGES_TYPE__NODES_TO_ADD);
		createEReference(uaNodeSetChangesTypeEClass, UA_NODE_SET_CHANGES_TYPE__REFERENCES_TO_ADD);
		createEReference(uaNodeSetChangesTypeEClass, UA_NODE_SET_CHANGES_TYPE__NODES_TO_DELETE);
		createEReference(uaNodeSetChangesTypeEClass, UA_NODE_SET_CHANGES_TYPE__REFERENCES_TO_DELETE);
		createEAttribute(uaNodeSetChangesTypeEClass, UA_NODE_SET_CHANGES_TYPE__ACCEPT_ALL_OR_NOTHING);
		createEAttribute(uaNodeSetChangesTypeEClass, UA_NODE_SET_CHANGES_TYPE__LAST_MODIFIED);
		createEAttribute(uaNodeSetChangesTypeEClass, UA_NODE_SET_CHANGES_TYPE__TRANSACTION_ID);

		uaNodeSetTypeEClass = createEClass(UA_NODE_SET_TYPE);
		createEReference(uaNodeSetTypeEClass, UA_NODE_SET_TYPE__NAMESPACE_URIS);
		createEReference(uaNodeSetTypeEClass, UA_NODE_SET_TYPE__SERVER_URIS);
		createEReference(uaNodeSetTypeEClass, UA_NODE_SET_TYPE__MODELS);
		createEReference(uaNodeSetTypeEClass, UA_NODE_SET_TYPE__ALIASES);
		createEReference(uaNodeSetTypeEClass, UA_NODE_SET_TYPE__EXTENSIONS);
		createEAttribute(uaNodeSetTypeEClass, UA_NODE_SET_TYPE__GROUP);
		createEReference(uaNodeSetTypeEClass, UA_NODE_SET_TYPE__UA_OBJECT);
		createEReference(uaNodeSetTypeEClass, UA_NODE_SET_TYPE__UA_VARIABLE);
		createEReference(uaNodeSetTypeEClass, UA_NODE_SET_TYPE__UA_METHOD);
		createEReference(uaNodeSetTypeEClass, UA_NODE_SET_TYPE__UA_VIEW);
		createEReference(uaNodeSetTypeEClass, UA_NODE_SET_TYPE__UA_OBJECT_TYPE);
		createEReference(uaNodeSetTypeEClass, UA_NODE_SET_TYPE__UA_VARIABLE_TYPE);
		createEReference(uaNodeSetTypeEClass, UA_NODE_SET_TYPE__UA_DATA_TYPE);
		createEReference(uaNodeSetTypeEClass, UA_NODE_SET_TYPE__UA_REFERENCE_TYPE);
		createEAttribute(uaNodeSetTypeEClass, UA_NODE_SET_TYPE__LAST_MODIFIED);

		uaObjectEClass = createEClass(UA_OBJECT);
		createEAttribute(uaObjectEClass, UA_OBJECT__EVENT_NOTIFIER);

		uaObjectTypeEClass = createEClass(UA_OBJECT_TYPE);

		uaReferenceTypeEClass = createEClass(UA_REFERENCE_TYPE);
		createEReference(uaReferenceTypeEClass, UA_REFERENCE_TYPE__INVERSE_NAME);
		createEAttribute(uaReferenceTypeEClass, UA_REFERENCE_TYPE__SYMMETRIC);

		uaTypeEClass = createEClass(UA_TYPE);
		createEAttribute(uaTypeEClass, UA_TYPE__IS_ABSTRACT);

		uaVariableEClass = createEClass(UA_VARIABLE);
		createEReference(uaVariableEClass, UA_VARIABLE__VALUE);
		createEReference(uaVariableEClass, UA_VARIABLE__TRANSLATION);
		createEAttribute(uaVariableEClass, UA_VARIABLE__ACCESS_LEVEL);
		createEAttribute(uaVariableEClass, UA_VARIABLE__ARRAY_DIMENSIONS);
		createEAttribute(uaVariableEClass, UA_VARIABLE__DATA_TYPE);
		createEAttribute(uaVariableEClass, UA_VARIABLE__HISTORIZING);
		createEAttribute(uaVariableEClass, UA_VARIABLE__MINIMUM_SAMPLING_INTERVAL);
		createEAttribute(uaVariableEClass, UA_VARIABLE__USER_ACCESS_LEVEL);
		createEAttribute(uaVariableEClass, UA_VARIABLE__VALUE_RANK);

		uaVariableTypeEClass = createEClass(UA_VARIABLE_TYPE);
		createEReference(uaVariableTypeEClass, UA_VARIABLE_TYPE__VALUE);
		createEAttribute(uaVariableTypeEClass, UA_VARIABLE_TYPE__ARRAY_DIMENSIONS);
		createEAttribute(uaVariableTypeEClass, UA_VARIABLE_TYPE__DATA_TYPE);
		createEAttribute(uaVariableTypeEClass, UA_VARIABLE_TYPE__VALUE_RANK);

		uaViewEClass = createEClass(UA_VIEW);
		createEAttribute(uaViewEClass, UA_VIEW__CONTAINS_NO_LOOPS);
		createEAttribute(uaViewEClass, UA_VIEW__EVENT_NOTIFIER);

		uriTableEClass = createEClass(URI_TABLE);
		createEAttribute(uriTableEClass, URI_TABLE__URI);

		valueTypeEClass = createEClass(VALUE_TYPE);
		createEAttribute(valueTypeEClass, VALUE_TYPE__ANY);

		valueType1EClass = createEClass(VALUE_TYPE1);
		createEAttribute(valueType1EClass, VALUE_TYPE1__ANY);

		// Create enums
		dataTypePurposeEEnum = createEEnum(DATA_TYPE_PURPOSE);
		releaseStatusEEnum = createEEnum(RELEASE_STATUS);

		// Create data types
		accessLevelEDataType = createEDataType(ACCESS_LEVEL);
		accessLevelObjectEDataType = createEDataType(ACCESS_LEVEL_OBJECT);
		accessRestrictionEDataType = createEDataType(ACCESS_RESTRICTION);
		accessRestrictionObjectEDataType = createEDataType(ACCESS_RESTRICTION_OBJECT);
		arrayDimensionsEDataType = createEDataType(ARRAY_DIMENSIONS);
		cardinalityTypeEDataType = createEDataType(CARDINALITY_TYPE);
		cardinalityTypeItemEDataType = createEDataType(CARDINALITY_TYPE_ITEM);
		dataTypePurposeObjectEDataType = createEDataType(DATA_TYPE_PURPOSE_OBJECT);
		durationEDataType = createEDataType(DURATION);
		durationObjectEDataType = createEDataType(DURATION_OBJECT);
		eventNotifierEDataType = createEDataType(EVENT_NOTIFIER);
		eventNotifierObjectEDataType = createEDataType(EVENT_NOTIFIER_OBJECT);
		localeEDataType = createEDataType(LOCALE);
		nodeIdEDataType = createEDataType(NODE_ID);
		qualifiedNameEDataType = createEDataType(QUALIFIED_NAME);
		releaseStatusObjectEDataType = createEDataType(RELEASE_STATUS_OBJECT);
		symbolicNameEDataType = createEDataType(SYMBOLIC_NAME);
		symbolicNameItemEDataType = createEDataType(SYMBOLIC_NAME_ITEM);
		valueRankEDataType = createEDataType(VALUE_RANK);
		valueRankObjectEDataType = createEDataType(VALUE_RANK_OBJECT);
		writeMaskEDataType = createEDataType(WRITE_MASK);
		writeMaskObjectEDataType = createEDataType(WRITE_MASK_OBJECT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		uaDataTypeEClass.getESuperTypes().add(this.getUAType());
		uaInstanceEClass.getESuperTypes().add(this.getUANode());
		uaMethodEClass.getESuperTypes().add(this.getUAInstance());
		uaObjectEClass.getESuperTypes().add(this.getUAInstance());
		uaObjectTypeEClass.getESuperTypes().add(this.getUAType());
		uaReferenceTypeEClass.getESuperTypes().add(this.getUAType());
		uaTypeEClass.getESuperTypes().add(this.getUANode());
		uaVariableEClass.getESuperTypes().add(this.getUAInstance());
		uaVariableTypeEClass.getESuperTypes().add(this.getUAType());
		uaViewEClass.getESuperTypes().add(this.getUAInstance());

		// Initialize classes, features, and operations; add parameters
		initEClass(aliasTableEClass, AliasTable.class, "AliasTable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAliasTable_Alias(), this.getNodeIdAlias(), null, "alias", null, 0, -1, AliasTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataTypeDefinitionEClass, DataTypeDefinition.class, "DataTypeDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataTypeDefinition_Field(), this.getDataTypeField(), null, "field", null, 0, -1, DataTypeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataTypeDefinition_BaseType(), this.getQualifiedName(), "baseType", "", 0, 1, DataTypeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataTypeDefinition_IsOptionSet(), theXMLTypePackage.getBoolean(), "isOptionSet", "false", 0, 1, DataTypeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataTypeDefinition_IsUnion(), theXMLTypePackage.getBoolean(), "isUnion", "false", 0, 1, DataTypeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataTypeDefinition_Name(), this.getQualifiedName(), "name", null, 1, 1, DataTypeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataTypeDefinition_SymbolicName(), this.getSymbolicName(), "symbolicName", "", 0, 1, DataTypeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataTypeFieldEClass, DataTypeField.class, "DataTypeField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataTypeField_DisplayName(), this.getLocalizedText(), null, "displayName", null, 0, -1, DataTypeField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataTypeField_Description(), this.getLocalizedText(), null, "description", null, 0, -1, DataTypeField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataTypeField_ArrayDimensions(), this.getArrayDimensions(), "arrayDimensions", "", 0, 1, DataTypeField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataTypeField_DataType(), this.getNodeId(), "dataType", "i=24", 0, 1, DataTypeField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataTypeField_IsOptional(), theXMLTypePackage.getBoolean(), "isOptional", "false", 0, 1, DataTypeField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataTypeField_MaxStringLength(), theXMLTypePackage.getUnsignedInt(), "maxStringLength", "0", 0, 1, DataTypeField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataTypeField_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, DataTypeField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataTypeField_SymbolicName(), this.getSymbolicName(), "symbolicName", null, 0, 1, DataTypeField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataTypeField_Value(), theXMLTypePackage.getInt(), "value", "-1", 0, 1, DataTypeField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataTypeField_ValueRank(), this.getValueRank(), "valueRank", "-1", 0, 1, DataTypeField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_UANodeSet(), this.getUANodeSetType(), null, "uANodeSet", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_UANodeSetChanges(), this.getUANodeSetChangesType(), null, "uANodeSetChanges", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_UANodeSetChangesStatus(), this.getUANodeSetChangesStatusType(), null, "uANodeSetChangesStatus", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(extensionTypeEClass, ExtensionType.class, "ExtensionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExtensionType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, 1, ExtensionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(listOfExtensionsEClass, ListOfExtensions.class, "ListOfExtensions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getListOfExtensions_Extension(), this.getExtensionType(), null, "extension", null, 0, -1, ListOfExtensions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(listOfReferencesEClass, ListOfReferences.class, "ListOfReferences", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getListOfReferences_Reference(), this.getReference(), null, "reference", null, 0, -1, ListOfReferences.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(listOfRolePermissionsEClass, ListOfRolePermissions.class, "ListOfRolePermissions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getListOfRolePermissions_RolePermission(), this.getRolePermission(), null, "rolePermission", null, 0, -1, ListOfRolePermissions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(localizedTextEClass, LocalizedText.class, "LocalizedText", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLocalizedText_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, LocalizedText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocalizedText_Locale(), this.getLocale(), "locale", "", 0, 1, LocalizedText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelTableEClass, ModelTable.class, "ModelTable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModelTable_Model(), this.getModelTableEntry(), null, "model", null, 0, -1, ModelTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelTableEntryEClass, ModelTableEntry.class, "ModelTableEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModelTableEntry_RolePermissions(), this.getListOfRolePermissions(), null, "rolePermissions", null, 0, 1, ModelTableEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelTableEntry_RequiredModel(), this.getModelTableEntry(), null, "requiredModel", null, 0, -1, ModelTableEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelTableEntry_AccessRestrictions(), this.getAccessRestriction(), "accessRestrictions", "0", 0, 1, ModelTableEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelTableEntry_ModelUri(), theXMLTypePackage.getString(), "modelUri", null, 1, 1, ModelTableEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelTableEntry_PublicationDate(), theXMLTypePackage.getDateTime(), "publicationDate", null, 0, 1, ModelTableEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelTableEntry_Version(), theXMLTypePackage.getString(), "version", null, 0, 1, ModelTableEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeIdAliasEClass, NodeIdAlias.class, "NodeIdAlias", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNodeIdAlias_Value(), this.getNodeId(), "value", null, 0, 1, NodeIdAlias.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNodeIdAlias_Alias(), theXMLTypePackage.getString(), "alias", null, 1, 1, NodeIdAlias.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeSetStatusEClass, NodeSetStatus.class, "NodeSetStatus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNodeSetStatus_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, NodeSetStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNodeSetStatus_Code(), theXMLTypePackage.getUnsignedInt(), "code", "0", 0, 1, NodeSetStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeSetStatusListEClass, NodeSetStatusList.class, "NodeSetStatusList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNodeSetStatusList_Status(), this.getNodeSetStatus(), null, "status", null, 0, -1, NodeSetStatusList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodesToAddEClass, NodesToAdd.class, "NodesToAdd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNodesToAdd_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, NodesToAdd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNodesToAdd_UAObject(), this.getUAObject(), null, "uAObject", null, 0, -1, NodesToAdd.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getNodesToAdd_UAVariable(), this.getUAVariable(), null, "uAVariable", null, 0, -1, NodesToAdd.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getNodesToAdd_UAMethod(), this.getUAMethod(), null, "uAMethod", null, 0, -1, NodesToAdd.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getNodesToAdd_UAView(), this.getUAView(), null, "uAView", null, 0, -1, NodesToAdd.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getNodesToAdd_UAObjectType(), this.getUAObjectType(), null, "uAObjectType", null, 0, -1, NodesToAdd.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getNodesToAdd_UAVariableType(), this.getUAVariableType(), null, "uAVariableType", null, 0, -1, NodesToAdd.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getNodesToAdd_UADataType(), this.getUADataType(), null, "uADataType", null, 0, -1, NodesToAdd.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getNodesToAdd_UAReferenceType(), this.getUAReferenceType(), null, "uAReferenceType", null, 0, -1, NodesToAdd.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(nodesToDeleteEClass, NodesToDelete.class, "NodesToDelete", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNodesToDelete_Node(), this.getNodeToDelete(), null, "node", null, 0, -1, NodesToDelete.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeToDeleteEClass, NodeToDelete.class, "NodeToDelete", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNodeToDelete_Value(), this.getNodeId(), "value", null, 0, 1, NodeToDelete.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNodeToDelete_DeleteReverseReferences(), theXMLTypePackage.getBoolean(), "deleteReverseReferences", "true", 0, 1, NodeToDelete.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(referenceEClass, Reference.class, "Reference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReference_Value(), this.getNodeId(), "value", null, 0, 1, Reference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReference_IsForward(), theXMLTypePackage.getBoolean(), "isForward", "true", 0, 1, Reference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReference_ReferenceType(), this.getNodeId(), "referenceType", null, 1, 1, Reference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(referenceChangeEClass, ReferenceChange.class, "ReferenceChange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReferenceChange_Value(), this.getNodeId(), "value", null, 0, 1, ReferenceChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReferenceChange_IsForward(), theXMLTypePackage.getBoolean(), "isForward", "true", 0, 1, ReferenceChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReferenceChange_ReferenceType(), this.getNodeId(), "referenceType", null, 1, 1, ReferenceChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReferenceChange_Source(), this.getNodeId(), "source", null, 1, 1, ReferenceChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(referencesToChangeEClass, ReferencesToChange.class, "ReferencesToChange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReferencesToChange_Reference(), this.getReferenceChange(), null, "reference", null, 0, -1, ReferencesToChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rolePermissionEClass, RolePermission.class, "RolePermission", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRolePermission_Value(), this.getNodeId(), "value", null, 0, 1, RolePermission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRolePermission_Permissions(), theXMLTypePackage.getUnsignedInt(), "permissions", "0", 0, 1, RolePermission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(structureTranslationTypeEClass, StructureTranslationType.class, "StructureTranslationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStructureTranslationType_Text(), this.getLocalizedText(), null, "text", null, 0, -1, StructureTranslationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStructureTranslationType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, StructureTranslationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(translationTypeEClass, TranslationType.class, "TranslationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTranslationType_Text(), this.getLocalizedText(), null, "text", null, 0, -1, TranslationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTranslationType_Field(), this.getStructureTranslationType(), null, "field", null, 0, -1, TranslationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uaDataTypeEClass, UADataType.class, "UADataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUADataType_Definition(), this.getDataTypeDefinition(), null, "definition", null, 0, 1, UADataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUADataType_Purpose(), this.getDataTypePurpose(), "purpose", "Normal", 0, 1, UADataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uaInstanceEClass, UAInstance.class, "UAInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUAInstance_ParentNodeId(), this.getNodeId(), "parentNodeId", null, 0, 1, UAInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uaMethodEClass, UAMethod.class, "UAMethod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUAMethod_ArgumentDescription(), this.getUAMethodArgument(), null, "argumentDescription", null, 0, -1, UAMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUAMethod_Executable(), theXMLTypePackage.getBoolean(), "executable", "true", 0, 1, UAMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUAMethod_MethodDeclarationId(), this.getNodeId(), "methodDeclarationId", null, 0, 1, UAMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUAMethod_UserExecutable(), theXMLTypePackage.getBoolean(), "userExecutable", "true", 0, 1, UAMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uaMethodArgumentEClass, UAMethodArgument.class, "UAMethodArgument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUAMethodArgument_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, UAMethodArgument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUAMethodArgument_Description(), this.getLocalizedText(), null, "description", null, 0, -1, UAMethodArgument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uaNodeEClass, UANode.class, "UANode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUANode_DisplayName(), this.getLocalizedText(), null, "displayName", null, 0, -1, UANode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUANode_Description(), this.getLocalizedText(), null, "description", null, 0, -1, UANode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUANode_Category(), theXMLTypePackage.getString(), "category", null, 0, -1, UANode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUANode_Documentation(), theXMLTypePackage.getString(), "documentation", null, 0, 1, UANode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUANode_References(), this.getListOfReferences(), null, "references", null, 0, 1, UANode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUANode_RolePermissions(), this.getListOfRolePermissions(), null, "rolePermissions", null, 0, 1, UANode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUANode_Extensions(), this.getListOfExtensions(), null, "extensions", null, 0, 1, UANode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUANode_AccessRestrictions(), this.getAccessRestriction(), "accessRestrictions", "0", 0, 1, UANode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUANode_BrowseName(), this.getQualifiedName(), "browseName", null, 1, 1, UANode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUANode_NodeId(), this.getNodeId(), "nodeId", null, 1, 1, UANode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUANode_ReleaseStatus(), this.getReleaseStatus(), "releaseStatus", "Released", 0, 1, UANode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUANode_SymbolicName(), this.getSymbolicName(), "symbolicName", null, 0, 1, UANode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUANode_UserWriteMask(), this.getWriteMask(), "userWriteMask", "0", 0, 1, UANode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUANode_WriteMask(), this.getWriteMask(), "writeMask", "0", 0, 1, UANode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uaNodeSetChangesStatusTypeEClass, UANodeSetChangesStatusType.class, "UANodeSetChangesStatusType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUANodeSetChangesStatusType_NodesToAdd(), this.getNodeSetStatusList(), null, "nodesToAdd", null, 0, 1, UANodeSetChangesStatusType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUANodeSetChangesStatusType_ReferencesToAdd(), this.getNodeSetStatusList(), null, "referencesToAdd", null, 0, 1, UANodeSetChangesStatusType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUANodeSetChangesStatusType_NodesToDelete(), this.getNodeSetStatusList(), null, "nodesToDelete", null, 0, 1, UANodeSetChangesStatusType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUANodeSetChangesStatusType_ReferencesToDelete(), this.getNodeSetStatusList(), null, "referencesToDelete", null, 0, 1, UANodeSetChangesStatusType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUANodeSetChangesStatusType_LastModified(), theXMLTypePackage.getDateTime(), "lastModified", null, 0, 1, UANodeSetChangesStatusType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUANodeSetChangesStatusType_TransactionId(), theXMLTypePackage.getString(), "transactionId", null, 1, 1, UANodeSetChangesStatusType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uaNodeSetChangesTypeEClass, UANodeSetChangesType.class, "UANodeSetChangesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUANodeSetChangesType_NamespaceUris(), this.getUriTable(), null, "namespaceUris", null, 0, 1, UANodeSetChangesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUANodeSetChangesType_ServerUris(), this.getUriTable(), null, "serverUris", null, 0, 1, UANodeSetChangesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUANodeSetChangesType_Aliases(), this.getAliasTable(), null, "aliases", null, 0, 1, UANodeSetChangesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUANodeSetChangesType_Extensions(), this.getListOfExtensions(), null, "extensions", null, 0, 1, UANodeSetChangesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUANodeSetChangesType_NodesToAdd(), this.getNodesToAdd(), null, "nodesToAdd", null, 0, 1, UANodeSetChangesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUANodeSetChangesType_ReferencesToAdd(), this.getReferencesToChange(), null, "referencesToAdd", null, 0, 1, UANodeSetChangesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUANodeSetChangesType_NodesToDelete(), this.getNodesToDelete(), null, "nodesToDelete", null, 0, 1, UANodeSetChangesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUANodeSetChangesType_ReferencesToDelete(), this.getReferencesToChange(), null, "referencesToDelete", null, 0, 1, UANodeSetChangesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUANodeSetChangesType_AcceptAllOrNothing(), theXMLTypePackage.getBoolean(), "acceptAllOrNothing", "false", 0, 1, UANodeSetChangesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUANodeSetChangesType_LastModified(), theXMLTypePackage.getDateTime(), "lastModified", null, 0, 1, UANodeSetChangesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUANodeSetChangesType_TransactionId(), theXMLTypePackage.getString(), "transactionId", null, 1, 1, UANodeSetChangesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uaNodeSetTypeEClass, UANodeSetType.class, "UANodeSetType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUANodeSetType_NamespaceUris(), this.getUriTable(), null, "namespaceUris", null, 0, 1, UANodeSetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUANodeSetType_ServerUris(), this.getUriTable(), null, "serverUris", null, 0, 1, UANodeSetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUANodeSetType_Models(), this.getModelTable(), null, "models", null, 0, 1, UANodeSetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUANodeSetType_Aliases(), this.getAliasTable(), null, "aliases", null, 0, 1, UANodeSetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUANodeSetType_Extensions(), this.getListOfExtensions(), null, "extensions", null, 0, 1, UANodeSetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUANodeSetType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, UANodeSetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUANodeSetType_UAObject(), this.getUAObject(), null, "uAObject", null, 0, -1, UANodeSetType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getUANodeSetType_UAVariable(), this.getUAVariable(), null, "uAVariable", null, 0, -1, UANodeSetType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getUANodeSetType_UAMethod(), this.getUAMethod(), null, "uAMethod", null, 0, -1, UANodeSetType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getUANodeSetType_UAView(), this.getUAView(), null, "uAView", null, 0, -1, UANodeSetType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getUANodeSetType_UAObjectType(), this.getUAObjectType(), null, "uAObjectType", null, 0, -1, UANodeSetType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getUANodeSetType_UAVariableType(), this.getUAVariableType(), null, "uAVariableType", null, 0, -1, UANodeSetType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getUANodeSetType_UADataType(), this.getUADataType(), null, "uADataType", null, 0, -1, UANodeSetType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getUANodeSetType_UAReferenceType(), this.getUAReferenceType(), null, "uAReferenceType", null, 0, -1, UANodeSetType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getUANodeSetType_LastModified(), theXMLTypePackage.getDateTime(), "lastModified", null, 0, 1, UANodeSetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uaObjectEClass, UAObject.class, "UAObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUAObject_EventNotifier(), this.getEventNotifier(), "eventNotifier", "0", 0, 1, UAObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uaObjectTypeEClass, UAObjectType.class, "UAObjectType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uaReferenceTypeEClass, UAReferenceType.class, "UAReferenceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUAReferenceType_InverseName(), this.getLocalizedText(), null, "inverseName", null, 0, -1, UAReferenceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUAReferenceType_Symmetric(), theXMLTypePackage.getBoolean(), "symmetric", "false", 0, 1, UAReferenceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uaTypeEClass, UAType.class, "UAType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUAType_IsAbstract(), theXMLTypePackage.getBoolean(), "isAbstract", "false", 0, 1, UAType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uaVariableEClass, UAVariable.class, "UAVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUAVariable_Value(), this.getValueType1(), null, "value", null, 0, 1, UAVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUAVariable_Translation(), this.getTranslationType(), null, "translation", null, 0, -1, UAVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUAVariable_AccessLevel(), this.getAccessLevel(), "accessLevel", "1", 0, 1, UAVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUAVariable_ArrayDimensions(), this.getArrayDimensions(), "arrayDimensions", "", 0, 1, UAVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUAVariable_DataType(), this.getNodeId(), "dataType", "i=24", 0, 1, UAVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUAVariable_Historizing(), theXMLTypePackage.getBoolean(), "historizing", "false", 0, 1, UAVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUAVariable_MinimumSamplingInterval(), this.getDuration(), "minimumSamplingInterval", "0", 0, 1, UAVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUAVariable_UserAccessLevel(), this.getAccessLevel(), "userAccessLevel", "1", 0, 1, UAVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUAVariable_ValueRank(), this.getValueRank(), "valueRank", "-1", 0, 1, UAVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uaVariableTypeEClass, UAVariableType.class, "UAVariableType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUAVariableType_Value(), this.getValueType(), null, "value", null, 0, 1, UAVariableType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUAVariableType_ArrayDimensions(), this.getArrayDimensions(), "arrayDimensions", "", 0, 1, UAVariableType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUAVariableType_DataType(), this.getNodeId(), "dataType", "i=24", 0, 1, UAVariableType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUAVariableType_ValueRank(), this.getValueRank(), "valueRank", "-1", 0, 1, UAVariableType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uaViewEClass, UAView.class, "UAView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUAView_ContainsNoLoops(), theXMLTypePackage.getBoolean(), "containsNoLoops", "false", 0, 1, UAView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUAView_EventNotifier(), this.getEventNotifier(), "eventNotifier", "0", 0, 1, UAView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uriTableEClass, UriTable.class, "UriTable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUriTable_Uri(), theXMLTypePackage.getString(), "uri", null, 0, -1, UriTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valueTypeEClass, ValueType.class, "ValueType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getValueType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, 1, ValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valueType1EClass, ValueType1.class, "ValueType1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getValueType1_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, 1, ValueType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(dataTypePurposeEEnum, DataTypePurpose.class, "DataTypePurpose");
		addEEnumLiteral(dataTypePurposeEEnum, DataTypePurpose.NORMAL);
		addEEnumLiteral(dataTypePurposeEEnum, DataTypePurpose.SERVICES_ONLY);
		addEEnumLiteral(dataTypePurposeEEnum, DataTypePurpose.CODE_GENERATOR);

		initEEnum(releaseStatusEEnum, ReleaseStatus.class, "ReleaseStatus");
		addEEnumLiteral(releaseStatusEEnum, ReleaseStatus.RELEASED);
		addEEnumLiteral(releaseStatusEEnum, ReleaseStatus.DRAFT);
		addEEnumLiteral(releaseStatusEEnum, ReleaseStatus.DEPRECATED);

		// Initialize data types
		initEDataType(accessLevelEDataType, long.class, "AccessLevel", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(accessLevelObjectEDataType, Long.class, "AccessLevelObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(accessRestrictionEDataType, short.class, "AccessRestriction", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(accessRestrictionObjectEDataType, Short.class, "AccessRestrictionObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(arrayDimensionsEDataType, String.class, "ArrayDimensions", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(cardinalityTypeEDataType, List.class, "CardinalityType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(cardinalityTypeItemEDataType, String.class, "CardinalityTypeItem", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(dataTypePurposeObjectEDataType, DataTypePurpose.class, "DataTypePurposeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(durationEDataType, double.class, "Duration", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(durationObjectEDataType, Double.class, "DurationObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(eventNotifierEDataType, short.class, "EventNotifier", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(eventNotifierObjectEDataType, Short.class, "EventNotifierObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(localeEDataType, String.class, "Locale", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(nodeIdEDataType, String.class, "NodeId", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(qualifiedNameEDataType, String.class, "QualifiedName", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(releaseStatusObjectEDataType, ReleaseStatus.class, "ReleaseStatusObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(symbolicNameEDataType, List.class, "SymbolicName", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(symbolicNameItemEDataType, String.class, "SymbolicNameItem", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(valueRankEDataType, int.class, "ValueRank", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(valueRankObjectEDataType, Integer.class, "ValueRankObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(writeMaskEDataType, long.class, "WriteMask", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(writeMaskObjectEDataType, Long.class, "WriteMaskObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";
		addAnnotation
		  (accessLevelEDataType,
		   source,
		   new String[] {
			   "name", "AccessLevel",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#unsignedInt"
		   });
		addAnnotation
		  (accessLevelObjectEDataType,
		   source,
		   new String[] {
			   "name", "AccessLevel:Object",
			   "baseType", "AccessLevel"
		   });
		addAnnotation
		  (accessRestrictionEDataType,
		   source,
		   new String[] {
			   "name", "AccessRestriction",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#unsignedByte"
		   });
		addAnnotation
		  (accessRestrictionObjectEDataType,
		   source,
		   new String[] {
			   "name", "AccessRestriction:Object",
			   "baseType", "AccessRestriction"
		   });
		addAnnotation
		  (aliasTableEClass,
		   source,
		   new String[] {
			   "name", "AliasTable",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAliasTable_Alias(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Alias",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (arrayDimensionsEDataType,
		   source,
		   new String[] {
			   "name", "ArrayDimensions",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#token",
			   "pattern", "(([0-9]+,)*[0-9]+)?"
		   });
		addAnnotation
		  (cardinalityTypeEDataType,
		   source,
		   new String[] {
			   "name", "CardinalityType",
			   "itemType", "CardinalityType_._item"
		   });
		addAnnotation
		  (cardinalityTypeItemEDataType,
		   source,
		   new String[] {
			   "name", "CardinalityType_._item",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			   "pattern", "(\\p{N})*|unbounded"
		   });
		addAnnotation
		  (dataTypeDefinitionEClass,
		   source,
		   new String[] {
			   "name", "DataTypeDefinition",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDataTypeDefinition_Field(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Field",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDataTypeDefinition_BaseType(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "BaseType"
		   });
		addAnnotation
		  (getDataTypeDefinition_IsOptionSet(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "IsOptionSet"
		   });
		addAnnotation
		  (getDataTypeDefinition_IsUnion(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "IsUnion"
		   });
		addAnnotation
		  (getDataTypeDefinition_Name(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "Name"
		   });
		addAnnotation
		  (getDataTypeDefinition_SymbolicName(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "SymbolicName"
		   });
		addAnnotation
		  (dataTypeFieldEClass,
		   source,
		   new String[] {
			   "name", "DataTypeField",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDataTypeField_DisplayName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DisplayName",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDataTypeField_Description(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Description",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDataTypeField_ArrayDimensions(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "ArrayDimensions"
		   });
		addAnnotation
		  (getDataTypeField_DataType(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "DataType"
		   });
		addAnnotation
		  (getDataTypeField_IsOptional(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "IsOptional"
		   });
		addAnnotation
		  (getDataTypeField_MaxStringLength(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "MaxStringLength"
		   });
		addAnnotation
		  (getDataTypeField_Name(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "Name"
		   });
		addAnnotation
		  (getDataTypeField_SymbolicName(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "SymbolicName"
		   });
		addAnnotation
		  (getDataTypeField_Value(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "Value"
		   });
		addAnnotation
		  (getDataTypeField_ValueRank(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "ValueRank"
		   });
		addAnnotation
		  (dataTypePurposeEEnum,
		   source,
		   new String[] {
			   "name", "DataTypePurpose"
		   });
		addAnnotation
		  (dataTypePurposeObjectEDataType,
		   source,
		   new String[] {
			   "name", "DataTypePurpose:Object",
			   "baseType", "DataTypePurpose"
		   });
		addAnnotation
		  (documentRootEClass,
		   source,
		   new String[] {
			   "name", "",
			   "kind", "mixed"
		   });
		addAnnotation
		  (getDocumentRoot_Mixed(),
		   source,
		   new String[] {
			   "kind", "elementWildcard",
			   "name", ":mixed"
		   });
		addAnnotation
		  (getDocumentRoot_XMLNSPrefixMap(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "xmlns:prefix"
		   });
		addAnnotation
		  (getDocumentRoot_XSISchemaLocation(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "xsi:schemaLocation"
		   });
		addAnnotation
		  (getDocumentRoot_UANodeSet(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "UANodeSet",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_UANodeSetChanges(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "UANodeSetChanges",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_UANodeSetChangesStatus(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "UANodeSetChangesStatus",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (durationEDataType,
		   source,
		   new String[] {
			   "name", "Duration",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#double"
		   });
		addAnnotation
		  (durationObjectEDataType,
		   source,
		   new String[] {
			   "name", "Duration:Object",
			   "baseType", "Duration"
		   });
		addAnnotation
		  (eventNotifierEDataType,
		   source,
		   new String[] {
			   "name", "EventNotifier",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#unsignedByte"
		   });
		addAnnotation
		  (eventNotifierObjectEDataType,
		   source,
		   new String[] {
			   "name", "EventNotifier:Object",
			   "baseType", "EventNotifier"
		   });
		addAnnotation
		  (extensionTypeEClass,
		   source,
		   new String[] {
			   "name", "Extension_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getExtensionType_Any(),
		   source,
		   new String[] {
			   "kind", "elementWildcard",
			   "wildcards", "##any",
			   "name", ":0",
			   "processing", "lax"
		   });
		addAnnotation
		  (listOfExtensionsEClass,
		   source,
		   new String[] {
			   "name", "ListOfExtensions",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getListOfExtensions_Extension(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Extension",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (listOfReferencesEClass,
		   source,
		   new String[] {
			   "name", "ListOfReferences",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getListOfReferences_Reference(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Reference",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (listOfRolePermissionsEClass,
		   source,
		   new String[] {
			   "name", "ListOfRolePermissions",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getListOfRolePermissions_RolePermission(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "RolePermission",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (localeEDataType,
		   source,
		   new String[] {
			   "name", "Locale",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#string"
		   });
		addAnnotation
		  (localizedTextEClass,
		   source,
		   new String[] {
			   "name", "LocalizedText",
			   "kind", "simple"
		   });
		addAnnotation
		  (getLocalizedText_Value(),
		   source,
		   new String[] {
			   "name", ":0",
			   "kind", "simple"
		   });
		addAnnotation
		  (getLocalizedText_Locale(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "Locale"
		   });
		addAnnotation
		  (modelTableEClass,
		   source,
		   new String[] {
			   "name", "ModelTable",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getModelTable_Model(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Model",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (modelTableEntryEClass,
		   source,
		   new String[] {
			   "name", "ModelTableEntry",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getModelTableEntry_RolePermissions(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "RolePermissions",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getModelTableEntry_RequiredModel(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "RequiredModel",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getModelTableEntry_AccessRestrictions(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "AccessRestrictions"
		   });
		addAnnotation
		  (getModelTableEntry_ModelUri(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "ModelUri"
		   });
		addAnnotation
		  (getModelTableEntry_PublicationDate(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "PublicationDate"
		   });
		addAnnotation
		  (getModelTableEntry_Version(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "Version"
		   });
		addAnnotation
		  (nodeIdEDataType,
		   source,
		   new String[] {
			   "name", "NodeId",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#string"
		   });
		addAnnotation
		  (nodeIdAliasEClass,
		   source,
		   new String[] {
			   "name", "NodeIdAlias",
			   "kind", "simple"
		   });
		addAnnotation
		  (getNodeIdAlias_Value(),
		   source,
		   new String[] {
			   "name", ":0",
			   "kind", "simple"
		   });
		addAnnotation
		  (getNodeIdAlias_Alias(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "Alias"
		   });
		addAnnotation
		  (nodeSetStatusEClass,
		   source,
		   new String[] {
			   "name", "NodeSetStatus",
			   "kind", "simple"
		   });
		addAnnotation
		  (getNodeSetStatus_Value(),
		   source,
		   new String[] {
			   "name", ":0",
			   "kind", "simple"
		   });
		addAnnotation
		  (getNodeSetStatus_Code(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "Code"
		   });
		addAnnotation
		  (nodeSetStatusListEClass,
		   source,
		   new String[] {
			   "name", "NodeSetStatusList",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getNodeSetStatusList_Status(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Status",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (nodesToAddEClass,
		   source,
		   new String[] {
			   "name", "NodesToAdd",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getNodesToAdd_Group(),
		   source,
		   new String[] {
			   "kind", "group",
			   "name", "group:0"
		   });
		addAnnotation
		  (getNodesToAdd_UAObject(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "UAObject",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getNodesToAdd_UAVariable(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "UAVariable",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getNodesToAdd_UAMethod(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "UAMethod",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getNodesToAdd_UAView(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "UAView",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getNodesToAdd_UAObjectType(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "UAObjectType",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getNodesToAdd_UAVariableType(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "UAVariableType",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getNodesToAdd_UADataType(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "UADataType",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getNodesToAdd_UAReferenceType(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "UAReferenceType",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (nodesToDeleteEClass,
		   source,
		   new String[] {
			   "name", "NodesToDelete",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getNodesToDelete_Node(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Node",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (nodeToDeleteEClass,
		   source,
		   new String[] {
			   "name", "NodeToDelete",
			   "kind", "simple"
		   });
		addAnnotation
		  (getNodeToDelete_Value(),
		   source,
		   new String[] {
			   "name", ":0",
			   "kind", "simple"
		   });
		addAnnotation
		  (getNodeToDelete_DeleteReverseReferences(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "DeleteReverseReferences"
		   });
		addAnnotation
		  (qualifiedNameEDataType,
		   source,
		   new String[] {
			   "name", "QualifiedName",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#string"
		   });
		addAnnotation
		  (referenceEClass,
		   source,
		   new String[] {
			   "name", "Reference",
			   "kind", "simple"
		   });
		addAnnotation
		  (getReference_Value(),
		   source,
		   new String[] {
			   "name", ":0",
			   "kind", "simple"
		   });
		addAnnotation
		  (getReference_IsForward(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "IsForward"
		   });
		addAnnotation
		  (getReference_ReferenceType(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "ReferenceType"
		   });
		addAnnotation
		  (referenceChangeEClass,
		   source,
		   new String[] {
			   "name", "ReferenceChange",
			   "kind", "simple"
		   });
		addAnnotation
		  (getReferenceChange_Value(),
		   source,
		   new String[] {
			   "name", ":0",
			   "kind", "simple"
		   });
		addAnnotation
		  (getReferenceChange_IsForward(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "IsForward"
		   });
		addAnnotation
		  (getReferenceChange_ReferenceType(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "ReferenceType"
		   });
		addAnnotation
		  (getReferenceChange_Source(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "Source"
		   });
		addAnnotation
		  (referencesToChangeEClass,
		   source,
		   new String[] {
			   "name", "ReferencesToChange",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getReferencesToChange_Reference(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Reference",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (releaseStatusEEnum,
		   source,
		   new String[] {
			   "name", "ReleaseStatus"
		   });
		addAnnotation
		  (releaseStatusObjectEDataType,
		   source,
		   new String[] {
			   "name", "ReleaseStatus:Object",
			   "baseType", "ReleaseStatus"
		   });
		addAnnotation
		  (rolePermissionEClass,
		   source,
		   new String[] {
			   "name", "RolePermission",
			   "kind", "simple"
		   });
		addAnnotation
		  (getRolePermission_Value(),
		   source,
		   new String[] {
			   "name", ":0",
			   "kind", "simple"
		   });
		addAnnotation
		  (getRolePermission_Permissions(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "Permissions"
		   });
		addAnnotation
		  (structureTranslationTypeEClass,
		   source,
		   new String[] {
			   "name", "StructureTranslationType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getStructureTranslationType_Text(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Text",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getStructureTranslationType_Name(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "Name"
		   });
		addAnnotation
		  (symbolicNameEDataType,
		   source,
		   new String[] {
			   "name", "SymbolicName",
			   "itemType", "SymbolicName_._item"
		   });
		addAnnotation
		  (symbolicNameItemEDataType,
		   source,
		   new String[] {
			   "name", "SymbolicName_._item",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			   "pattern", "[A-Za-z][A-Za-z0-9_]*"
		   });
		addAnnotation
		  (translationTypeEClass,
		   source,
		   new String[] {
			   "name", "TranslationType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTranslationType_Text(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Text",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTranslationType_Field(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Field",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (uaDataTypeEClass,
		   source,
		   new String[] {
			   "name", "UADataType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getUADataType_Definition(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Definition",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getUADataType_Purpose(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "Purpose"
		   });
		addAnnotation
		  (uaInstanceEClass,
		   source,
		   new String[] {
			   "name", "UAInstance",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getUAInstance_ParentNodeId(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "ParentNodeId"
		   });
		addAnnotation
		  (uaMethodEClass,
		   source,
		   new String[] {
			   "name", "UAMethod",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getUAMethod_ArgumentDescription(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ArgumentDescription",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getUAMethod_Executable(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "Executable"
		   });
		addAnnotation
		  (getUAMethod_MethodDeclarationId(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "MethodDeclarationId"
		   });
		addAnnotation
		  (getUAMethod_UserExecutable(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "UserExecutable"
		   });
		addAnnotation
		  (uaMethodArgumentEClass,
		   source,
		   new String[] {
			   "name", "UAMethodArgument",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getUAMethodArgument_Name(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Name",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getUAMethodArgument_Description(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Description",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (uaNodeEClass,
		   source,
		   new String[] {
			   "name", "UANode",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getUANode_DisplayName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DisplayName",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getUANode_Description(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Description",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getUANode_Category(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Category",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getUANode_Documentation(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Documentation",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getUANode_References(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "References",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getUANode_RolePermissions(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "RolePermissions",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getUANode_Extensions(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Extensions",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getUANode_AccessRestrictions(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "AccessRestrictions"
		   });
		addAnnotation
		  (getUANode_BrowseName(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "BrowseName"
		   });
		addAnnotation
		  (getUANode_NodeId(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "NodeId"
		   });
		addAnnotation
		  (getUANode_ReleaseStatus(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "ReleaseStatus"
		   });
		addAnnotation
		  (getUANode_SymbolicName(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "SymbolicName"
		   });
		addAnnotation
		  (getUANode_UserWriteMask(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "UserWriteMask"
		   });
		addAnnotation
		  (getUANode_WriteMask(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "WriteMask"
		   });
		addAnnotation
		  (uaNodeSetChangesStatusTypeEClass,
		   source,
		   new String[] {
			   "name", "UANodeSetChangesStatus_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getUANodeSetChangesStatusType_NodesToAdd(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "NodesToAdd",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getUANodeSetChangesStatusType_ReferencesToAdd(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ReferencesToAdd",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getUANodeSetChangesStatusType_NodesToDelete(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "NodesToDelete",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getUANodeSetChangesStatusType_ReferencesToDelete(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ReferencesToDelete",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getUANodeSetChangesStatusType_LastModified(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "LastModified"
		   });
		addAnnotation
		  (getUANodeSetChangesStatusType_TransactionId(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "TransactionId"
		   });
		addAnnotation
		  (uaNodeSetChangesTypeEClass,
		   source,
		   new String[] {
			   "name", "UANodeSetChanges_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getUANodeSetChangesType_NamespaceUris(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "NamespaceUris",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getUANodeSetChangesType_ServerUris(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ServerUris",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getUANodeSetChangesType_Aliases(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Aliases",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getUANodeSetChangesType_Extensions(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Extensions",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getUANodeSetChangesType_NodesToAdd(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "NodesToAdd",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getUANodeSetChangesType_ReferencesToAdd(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ReferencesToAdd",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getUANodeSetChangesType_NodesToDelete(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "NodesToDelete",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getUANodeSetChangesType_ReferencesToDelete(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ReferencesToDelete",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getUANodeSetChangesType_AcceptAllOrNothing(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "AcceptAllOrNothing"
		   });
		addAnnotation
		  (getUANodeSetChangesType_LastModified(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "LastModified"
		   });
		addAnnotation
		  (getUANodeSetChangesType_TransactionId(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "TransactionId"
		   });
		addAnnotation
		  (uaNodeSetTypeEClass,
		   source,
		   new String[] {
			   "name", "UANodeSet_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getUANodeSetType_NamespaceUris(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "NamespaceUris",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getUANodeSetType_ServerUris(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ServerUris",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getUANodeSetType_Models(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Models",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getUANodeSetType_Aliases(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Aliases",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getUANodeSetType_Extensions(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Extensions",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getUANodeSetType_Group(),
		   source,
		   new String[] {
			   "kind", "group",
			   "name", "group:5"
		   });
		addAnnotation
		  (getUANodeSetType_UAObject(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "UAObject",
			   "namespace", "##targetNamespace",
			   "group", "#group:5"
		   });
		addAnnotation
		  (getUANodeSetType_UAVariable(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "UAVariable",
			   "namespace", "##targetNamespace",
			   "group", "#group:5"
		   });
		addAnnotation
		  (getUANodeSetType_UAMethod(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "UAMethod",
			   "namespace", "##targetNamespace",
			   "group", "#group:5"
		   });
		addAnnotation
		  (getUANodeSetType_UAView(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "UAView",
			   "namespace", "##targetNamespace",
			   "group", "#group:5"
		   });
		addAnnotation
		  (getUANodeSetType_UAObjectType(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "UAObjectType",
			   "namespace", "##targetNamespace",
			   "group", "#group:5"
		   });
		addAnnotation
		  (getUANodeSetType_UAVariableType(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "UAVariableType",
			   "namespace", "##targetNamespace",
			   "group", "#group:5"
		   });
		addAnnotation
		  (getUANodeSetType_UADataType(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "UADataType",
			   "namespace", "##targetNamespace",
			   "group", "#group:5"
		   });
		addAnnotation
		  (getUANodeSetType_UAReferenceType(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "UAReferenceType",
			   "namespace", "##targetNamespace",
			   "group", "#group:5"
		   });
		addAnnotation
		  (getUANodeSetType_LastModified(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "LastModified"
		   });
		addAnnotation
		  (uaObjectEClass,
		   source,
		   new String[] {
			   "name", "UAObject",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getUAObject_EventNotifier(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "EventNotifier"
		   });
		addAnnotation
		  (uaObjectTypeEClass,
		   source,
		   new String[] {
			   "name", "UAObjectType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (uaReferenceTypeEClass,
		   source,
		   new String[] {
			   "name", "UAReferenceType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getUAReferenceType_InverseName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "InverseName",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getUAReferenceType_Symmetric(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "Symmetric"
		   });
		addAnnotation
		  (uaTypeEClass,
		   source,
		   new String[] {
			   "name", "UAType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getUAType_IsAbstract(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "IsAbstract"
		   });
		addAnnotation
		  (uaVariableEClass,
		   source,
		   new String[] {
			   "name", "UAVariable",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getUAVariable_Value(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Value",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getUAVariable_Translation(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Translation",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getUAVariable_AccessLevel(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "AccessLevel"
		   });
		addAnnotation
		  (getUAVariable_ArrayDimensions(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "ArrayDimensions"
		   });
		addAnnotation
		  (getUAVariable_DataType(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "DataType"
		   });
		addAnnotation
		  (getUAVariable_Historizing(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "Historizing"
		   });
		addAnnotation
		  (getUAVariable_MinimumSamplingInterval(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "MinimumSamplingInterval"
		   });
		addAnnotation
		  (getUAVariable_UserAccessLevel(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "UserAccessLevel"
		   });
		addAnnotation
		  (getUAVariable_ValueRank(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "ValueRank"
		   });
		addAnnotation
		  (uaVariableTypeEClass,
		   source,
		   new String[] {
			   "name", "UAVariableType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getUAVariableType_Value(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Value",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getUAVariableType_ArrayDimensions(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "ArrayDimensions"
		   });
		addAnnotation
		  (getUAVariableType_DataType(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "DataType"
		   });
		addAnnotation
		  (getUAVariableType_ValueRank(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "ValueRank"
		   });
		addAnnotation
		  (uaViewEClass,
		   source,
		   new String[] {
			   "name", "UAView",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getUAView_ContainsNoLoops(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "ContainsNoLoops"
		   });
		addAnnotation
		  (getUAView_EventNotifier(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "EventNotifier"
		   });
		addAnnotation
		  (uriTableEClass,
		   source,
		   new String[] {
			   "name", "UriTable",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getUriTable_Uri(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Uri",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (valueRankEDataType,
		   source,
		   new String[] {
			   "name", "ValueRank",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#int"
		   });
		addAnnotation
		  (valueRankObjectEDataType,
		   source,
		   new String[] {
			   "name", "ValueRank:Object",
			   "baseType", "ValueRank"
		   });
		addAnnotation
		  (valueTypeEClass,
		   source,
		   new String[] {
			   "name", "Value_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getValueType_Any(),
		   source,
		   new String[] {
			   "kind", "elementWildcard",
			   "wildcards", "##any",
			   "name", ":0",
			   "processing", "lax"
		   });
		addAnnotation
		  (valueType1EClass,
		   source,
		   new String[] {
			   "name", "Value_._1_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getValueType1_Any(),
		   source,
		   new String[] {
			   "kind", "elementWildcard",
			   "wildcards", "##any",
			   "name", ":0",
			   "processing", "lax"
		   });
		addAnnotation
		  (writeMaskEDataType,
		   source,
		   new String[] {
			   "name", "WriteMask",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#unsignedInt"
		   });
		addAnnotation
		  (writeMaskObjectEDataType,
		   source,
		   new String[] {
			   "name", "WriteMask:Object",
			   "baseType", "WriteMask"
		   });
	}

} //SetPackageImpl
