/**
 */
package org.opcfoundation.ua._2011._03.ua.node.set.util;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeUtil;
import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

import org.opcfoundation.ua._2011._03.ua.node.set.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.opcfoundation.ua._2011._03.ua.node.set.SetPackage
 * @generated
 */
public class SetValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final SetValidator INSTANCE = new SetValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.opcfoundation.ua._2011._03.ua.node.set";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMLTypeValidator xmlTypeValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetValidator() {
		super();
		xmlTypeValidator = XMLTypeValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return SetPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case SetPackage.ALIAS_TABLE:
				return validateAliasTable((AliasTable)value, diagnostics, context);
			case SetPackage.DATA_TYPE_DEFINITION:
				return validateDataTypeDefinition((DataTypeDefinition)value, diagnostics, context);
			case SetPackage.DATA_TYPE_FIELD:
				return validateDataTypeField((DataTypeField)value, diagnostics, context);
			case SetPackage.DOCUMENT_ROOT:
				return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
			case SetPackage.EXTENSION_TYPE:
				return validateExtensionType((ExtensionType)value, diagnostics, context);
			case SetPackage.LIST_OF_EXTENSIONS:
				return validateListOfExtensions((ListOfExtensions)value, diagnostics, context);
			case SetPackage.LIST_OF_REFERENCES:
				return validateListOfReferences((ListOfReferences)value, diagnostics, context);
			case SetPackage.LIST_OF_ROLE_PERMISSIONS:
				return validateListOfRolePermissions((ListOfRolePermissions)value, diagnostics, context);
			case SetPackage.LOCALIZED_TEXT:
				return validateLocalizedText((LocalizedText)value, diagnostics, context);
			case SetPackage.MODEL_TABLE:
				return validateModelTable((ModelTable)value, diagnostics, context);
			case SetPackage.MODEL_TABLE_ENTRY:
				return validateModelTableEntry((ModelTableEntry)value, diagnostics, context);
			case SetPackage.NODE_ID_ALIAS:
				return validateNodeIdAlias((NodeIdAlias)value, diagnostics, context);
			case SetPackage.NODE_SET_STATUS:
				return validateNodeSetStatus((NodeSetStatus)value, diagnostics, context);
			case SetPackage.NODE_SET_STATUS_LIST:
				return validateNodeSetStatusList((NodeSetStatusList)value, diagnostics, context);
			case SetPackage.NODES_TO_ADD:
				return validateNodesToAdd((NodesToAdd)value, diagnostics, context);
			case SetPackage.NODES_TO_DELETE:
				return validateNodesToDelete((NodesToDelete)value, diagnostics, context);
			case SetPackage.NODE_TO_DELETE:
				return validateNodeToDelete((NodeToDelete)value, diagnostics, context);
			case SetPackage.REFERENCE:
				return validateReference((Reference)value, diagnostics, context);
			case SetPackage.REFERENCE_CHANGE:
				return validateReferenceChange((ReferenceChange)value, diagnostics, context);
			case SetPackage.REFERENCES_TO_CHANGE:
				return validateReferencesToChange((ReferencesToChange)value, diagnostics, context);
			case SetPackage.ROLE_PERMISSION:
				return validateRolePermission((RolePermission)value, diagnostics, context);
			case SetPackage.STRUCTURE_TRANSLATION_TYPE:
				return validateStructureTranslationType((StructureTranslationType)value, diagnostics, context);
			case SetPackage.TRANSLATION_TYPE:
				return validateTranslationType((TranslationType)value, diagnostics, context);
			case SetPackage.UA_DATA_TYPE:
				return validateUADataType((UADataType)value, diagnostics, context);
			case SetPackage.UA_INSTANCE:
				return validateUAInstance((UAInstance)value, diagnostics, context);
			case SetPackage.UA_METHOD:
				return validateUAMethod((UAMethod)value, diagnostics, context);
			case SetPackage.UA_METHOD_ARGUMENT:
				return validateUAMethodArgument((UAMethodArgument)value, diagnostics, context);
			case SetPackage.UA_NODE:
				return validateUANode((UANode)value, diagnostics, context);
			case SetPackage.UA_NODE_SET_CHANGES_STATUS_TYPE:
				return validateUANodeSetChangesStatusType((UANodeSetChangesStatusType)value, diagnostics, context);
			case SetPackage.UA_NODE_SET_CHANGES_TYPE:
				return validateUANodeSetChangesType((UANodeSetChangesType)value, diagnostics, context);
			case SetPackage.UA_NODE_SET_TYPE:
				return validateUANodeSetType((UANodeSetType)value, diagnostics, context);
			case SetPackage.UA_OBJECT:
				return validateUAObject((UAObject)value, diagnostics, context);
			case SetPackage.UA_OBJECT_TYPE:
				return validateUAObjectType((UAObjectType)value, diagnostics, context);
			case SetPackage.UA_REFERENCE_TYPE:
				return validateUAReferenceType((UAReferenceType)value, diagnostics, context);
			case SetPackage.UA_TYPE:
				return validateUAType((UAType)value, diagnostics, context);
			case SetPackage.UA_VARIABLE:
				return validateUAVariable((UAVariable)value, diagnostics, context);
			case SetPackage.UA_VARIABLE_TYPE:
				return validateUAVariableType((UAVariableType)value, diagnostics, context);
			case SetPackage.UA_VIEW:
				return validateUAView((UAView)value, diagnostics, context);
			case SetPackage.URI_TABLE:
				return validateUriTable((UriTable)value, diagnostics, context);
			case SetPackage.VALUE_TYPE:
				return validateValueType((ValueType)value, diagnostics, context);
			case SetPackage.VALUE_TYPE1:
				return validateValueType1((ValueType1)value, diagnostics, context);
			case SetPackage.DATA_TYPE_PURPOSE:
				return validateDataTypePurpose((DataTypePurpose)value, diagnostics, context);
			case SetPackage.RELEASE_STATUS:
				return validateReleaseStatus((ReleaseStatus)value, diagnostics, context);
			case SetPackage.ACCESS_LEVEL:
				return validateAccessLevel((Long)value, diagnostics, context);
			case SetPackage.ACCESS_LEVEL_OBJECT:
				return validateAccessLevelObject((Long)value, diagnostics, context);
			case SetPackage.ACCESS_RESTRICTION:
				return validateAccessRestriction((Short)value, diagnostics, context);
			case SetPackage.ACCESS_RESTRICTION_OBJECT:
				return validateAccessRestrictionObject((Short)value, diagnostics, context);
			case SetPackage.ARRAY_DIMENSIONS:
				return validateArrayDimensions((String)value, diagnostics, context);
			case SetPackage.CARDINALITY_TYPE:
				return validateCardinalityType((List<?>)value, diagnostics, context);
			case SetPackage.CARDINALITY_TYPE_ITEM:
				return validateCardinalityTypeItem((String)value, diagnostics, context);
			case SetPackage.DATA_TYPE_PURPOSE_OBJECT:
				return validateDataTypePurposeObject((DataTypePurpose)value, diagnostics, context);
			case SetPackage.DURATION:
				return validateDuration((Double)value, diagnostics, context);
			case SetPackage.DURATION_OBJECT:
				return validateDurationObject((Double)value, diagnostics, context);
			case SetPackage.EVENT_NOTIFIER:
				return validateEventNotifier((Short)value, diagnostics, context);
			case SetPackage.EVENT_NOTIFIER_OBJECT:
				return validateEventNotifierObject((Short)value, diagnostics, context);
			case SetPackage.LOCALE:
				return validateLocale((String)value, diagnostics, context);
			case SetPackage.NODE_ID:
				return validateNodeId((String)value, diagnostics, context);
			case SetPackage.QUALIFIED_NAME:
				return validateQualifiedName((String)value, diagnostics, context);
			case SetPackage.RELEASE_STATUS_OBJECT:
				return validateReleaseStatusObject((ReleaseStatus)value, diagnostics, context);
			case SetPackage.SYMBOLIC_NAME:
				return validateSymbolicName((List<?>)value, diagnostics, context);
			case SetPackage.SYMBOLIC_NAME_ITEM:
				return validateSymbolicNameItem((String)value, diagnostics, context);
			case SetPackage.VALUE_RANK:
				return validateValueRank((Integer)value, diagnostics, context);
			case SetPackage.VALUE_RANK_OBJECT:
				return validateValueRankObject((Integer)value, diagnostics, context);
			case SetPackage.WRITE_MASK:
				return validateWriteMask((Long)value, diagnostics, context);
			case SetPackage.WRITE_MASK_OBJECT:
				return validateWriteMaskObject((Long)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAliasTable(AliasTable aliasTable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(aliasTable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataTypeDefinition(DataTypeDefinition dataTypeDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataTypeDefinition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataTypeField(DataTypeField dataTypeField, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataTypeField, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentRoot(DocumentRoot documentRoot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentRoot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtensionType(ExtensionType extensionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(extensionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateListOfExtensions(ListOfExtensions listOfExtensions, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(listOfExtensions, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateListOfReferences(ListOfReferences listOfReferences, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(listOfReferences, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateListOfRolePermissions(ListOfRolePermissions listOfRolePermissions, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(listOfRolePermissions, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocalizedText(LocalizedText localizedText, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(localizedText, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModelTable(ModelTable modelTable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(modelTable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModelTableEntry(ModelTableEntry modelTableEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(modelTableEntry, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNodeIdAlias(NodeIdAlias nodeIdAlias, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nodeIdAlias, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNodeSetStatus(NodeSetStatus nodeSetStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nodeSetStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNodeSetStatusList(NodeSetStatusList nodeSetStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nodeSetStatusList, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNodesToAdd(NodesToAdd nodesToAdd, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nodesToAdd, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNodesToDelete(NodesToDelete nodesToDelete, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nodesToDelete, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNodeToDelete(NodeToDelete nodeToDelete, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nodeToDelete, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReference(Reference reference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(reference, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferenceChange(ReferenceChange referenceChange, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(referenceChange, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferencesToChange(ReferencesToChange referencesToChange, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(referencesToChange, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRolePermission(RolePermission rolePermission, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rolePermission, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructureTranslationType(StructureTranslationType structureTranslationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(structureTranslationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTranslationType(TranslationType translationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(translationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUADataType(UADataType uaDataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(uaDataType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUAInstance(UAInstance uaInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(uaInstance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUAMethod(UAMethod uaMethod, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(uaMethod, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUAMethodArgument(UAMethodArgument uaMethodArgument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(uaMethodArgument, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUANode(UANode uaNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(uaNode, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUANodeSetChangesStatusType(UANodeSetChangesStatusType uaNodeSetChangesStatusType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(uaNodeSetChangesStatusType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUANodeSetChangesType(UANodeSetChangesType uaNodeSetChangesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(uaNodeSetChangesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUANodeSetType(UANodeSetType uaNodeSetType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(uaNodeSetType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUAObject(UAObject uaObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(uaObject, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUAObjectType(UAObjectType uaObjectType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(uaObjectType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUAReferenceType(UAReferenceType uaReferenceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(uaReferenceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUAType(UAType uaType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(uaType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUAVariable(UAVariable uaVariable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(uaVariable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUAVariableType(UAVariableType uaVariableType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(uaVariableType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUAView(UAView uaView, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(uaView, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUriTable(UriTable uriTable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(uriTable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValueType(ValueType valueType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(valueType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValueType1(ValueType1 valueType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(valueType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataTypePurpose(DataTypePurpose dataTypePurpose, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReleaseStatus(ReleaseStatus releaseStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAccessLevel(long accessLevel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = xmlTypeValidator.validateUnsignedInt_Min(accessLevel, diagnostics, context);
		if (result || diagnostics != null) result &= xmlTypeValidator.validateUnsignedInt_Max(accessLevel, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAccessLevelObject(Long accessLevelObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = xmlTypeValidator.validateUnsignedInt_Min(accessLevelObject, diagnostics, context);
		if (result || diagnostics != null) result &= xmlTypeValidator.validateUnsignedInt_Max(accessLevelObject, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAccessRestriction(short accessRestriction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = xmlTypeValidator.validateUnsignedByte_Min(accessRestriction, diagnostics, context);
		if (result || diagnostics != null) result &= xmlTypeValidator.validateUnsignedByte_Max(accessRestriction, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAccessRestrictionObject(Short accessRestrictionObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = xmlTypeValidator.validateUnsignedByte_Min(accessRestrictionObject, diagnostics, context);
		if (result || diagnostics != null) result &= xmlTypeValidator.validateUnsignedByte_Max(accessRestrictionObject, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArrayDimensions(String arrayDimensions, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateArrayDimensions_Pattern(arrayDimensions, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateArrayDimensions_Pattern
	 */
	public static final  PatternMatcher [][] ARRAY_DIMENSIONS__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("(([0-9]+,)*[0-9]+)?")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Array Dimensions</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArrayDimensions_Pattern(String arrayDimensions, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(SetPackage.Literals.ARRAY_DIMENSIONS, arrayDimensions, ARRAY_DIMENSIONS__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCardinalityType(List<?> cardinalityType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateCardinalityType_ItemType(cardinalityType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ItemType constraint of '<em>Cardinality Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCardinalityType_ItemType(List<?> cardinalityType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		for (Iterator<?> i = cardinalityType.iterator(); i.hasNext() && (result || diagnostics != null); ) {
			Object item = i.next();
			if (SetPackage.Literals.CARDINALITY_TYPE_ITEM.isInstance(item)) {
				result &= validateCardinalityTypeItem((String)item, diagnostics, context);
			}
			else {
				result = false;
				reportDataValueTypeViolation(SetPackage.Literals.CARDINALITY_TYPE_ITEM, item, diagnostics, context);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCardinalityTypeItem(String cardinalityTypeItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateCardinalityTypeItem_Pattern(cardinalityTypeItem, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateCardinalityTypeItem_Pattern
	 */
	public static final  PatternMatcher [][] CARDINALITY_TYPE_ITEM__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("(\\p{N})*|unbounded")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Cardinality Type Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCardinalityTypeItem_Pattern(String cardinalityTypeItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(SetPackage.Literals.CARDINALITY_TYPE_ITEM, cardinalityTypeItem, CARDINALITY_TYPE_ITEM__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataTypePurposeObject(DataTypePurpose dataTypePurposeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDuration(double duration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDurationObject(Double durationObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEventNotifier(short eventNotifier, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = xmlTypeValidator.validateUnsignedByte_Min(eventNotifier, diagnostics, context);
		if (result || diagnostics != null) result &= xmlTypeValidator.validateUnsignedByte_Max(eventNotifier, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEventNotifierObject(Short eventNotifierObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = xmlTypeValidator.validateUnsignedByte_Min(eventNotifierObject, diagnostics, context);
		if (result || diagnostics != null) result &= xmlTypeValidator.validateUnsignedByte_Max(eventNotifierObject, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocale(String locale, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNodeId(String nodeId, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQualifiedName(String qualifiedName, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReleaseStatusObject(ReleaseStatus releaseStatusObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSymbolicName(List<?> symbolicName, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateSymbolicName_ItemType(symbolicName, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ItemType constraint of '<em>Symbolic Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSymbolicName_ItemType(List<?> symbolicName, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		for (Iterator<?> i = symbolicName.iterator(); i.hasNext() && (result || diagnostics != null); ) {
			Object item = i.next();
			if (SetPackage.Literals.SYMBOLIC_NAME_ITEM.isInstance(item)) {
				result &= validateSymbolicNameItem((String)item, diagnostics, context);
			}
			else {
				result = false;
				reportDataValueTypeViolation(SetPackage.Literals.SYMBOLIC_NAME_ITEM, item, diagnostics, context);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSymbolicNameItem(String symbolicNameItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateSymbolicNameItem_Pattern(symbolicNameItem, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateSymbolicNameItem_Pattern
	 */
	public static final  PatternMatcher [][] SYMBOLIC_NAME_ITEM__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[A-Za-z][A-Za-z0-9_]*")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Symbolic Name Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSymbolicNameItem_Pattern(String symbolicNameItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(SetPackage.Literals.SYMBOLIC_NAME_ITEM, symbolicNameItem, SYMBOLIC_NAME_ITEM__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValueRank(int valueRank, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValueRankObject(Integer valueRankObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWriteMask(long writeMask, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = xmlTypeValidator.validateUnsignedInt_Min(writeMask, diagnostics, context);
		if (result || diagnostics != null) result &= xmlTypeValidator.validateUnsignedInt_Max(writeMask, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWriteMaskObject(Long writeMaskObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = xmlTypeValidator.validateUnsignedInt_Min(writeMaskObject, diagnostics, context);
		if (result || diagnostics != null) result &= xmlTypeValidator.validateUnsignedInt_Max(writeMaskObject, diagnostics, context);
		return result;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //SetValidator
