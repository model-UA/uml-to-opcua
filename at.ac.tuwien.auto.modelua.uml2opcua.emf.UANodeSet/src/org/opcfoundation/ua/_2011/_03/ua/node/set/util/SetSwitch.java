/**
 */
package org.opcfoundation.ua._2011._03.ua.node.set.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.opcfoundation.ua._2011._03.ua.node.set.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.opcfoundation.ua._2011._03.ua.node.set.SetPackage
 * @generated
 */
public class SetSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SetPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetSwitch() {
		if (modelPackage == null) {
			modelPackage = SetPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case SetPackage.ALIAS_TABLE: {
				AliasTable aliasTable = (AliasTable)theEObject;
				T result = caseAliasTable(aliasTable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SetPackage.DATA_TYPE_DEFINITION: {
				DataTypeDefinition dataTypeDefinition = (DataTypeDefinition)theEObject;
				T result = caseDataTypeDefinition(dataTypeDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SetPackage.DATA_TYPE_FIELD: {
				DataTypeField dataTypeField = (DataTypeField)theEObject;
				T result = caseDataTypeField(dataTypeField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SetPackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SetPackage.EXTENSION_TYPE: {
				ExtensionType extensionType = (ExtensionType)theEObject;
				T result = caseExtensionType(extensionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SetPackage.LIST_OF_EXTENSIONS: {
				ListOfExtensions listOfExtensions = (ListOfExtensions)theEObject;
				T result = caseListOfExtensions(listOfExtensions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SetPackage.LIST_OF_REFERENCES: {
				ListOfReferences listOfReferences = (ListOfReferences)theEObject;
				T result = caseListOfReferences(listOfReferences);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SetPackage.LIST_OF_ROLE_PERMISSIONS: {
				ListOfRolePermissions listOfRolePermissions = (ListOfRolePermissions)theEObject;
				T result = caseListOfRolePermissions(listOfRolePermissions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SetPackage.LOCALIZED_TEXT: {
				LocalizedText localizedText = (LocalizedText)theEObject;
				T result = caseLocalizedText(localizedText);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SetPackage.MODEL_TABLE: {
				ModelTable modelTable = (ModelTable)theEObject;
				T result = caseModelTable(modelTable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SetPackage.MODEL_TABLE_ENTRY: {
				ModelTableEntry modelTableEntry = (ModelTableEntry)theEObject;
				T result = caseModelTableEntry(modelTableEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SetPackage.NODE_ID_ALIAS: {
				NodeIdAlias nodeIdAlias = (NodeIdAlias)theEObject;
				T result = caseNodeIdAlias(nodeIdAlias);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SetPackage.NODE_SET_STATUS: {
				NodeSetStatus nodeSetStatus = (NodeSetStatus)theEObject;
				T result = caseNodeSetStatus(nodeSetStatus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SetPackage.NODE_SET_STATUS_LIST: {
				NodeSetStatusList nodeSetStatusList = (NodeSetStatusList)theEObject;
				T result = caseNodeSetStatusList(nodeSetStatusList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SetPackage.NODES_TO_ADD: {
				NodesToAdd nodesToAdd = (NodesToAdd)theEObject;
				T result = caseNodesToAdd(nodesToAdd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SetPackage.NODES_TO_DELETE: {
				NodesToDelete nodesToDelete = (NodesToDelete)theEObject;
				T result = caseNodesToDelete(nodesToDelete);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SetPackage.NODE_TO_DELETE: {
				NodeToDelete nodeToDelete = (NodeToDelete)theEObject;
				T result = caseNodeToDelete(nodeToDelete);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SetPackage.REFERENCE: {
				Reference reference = (Reference)theEObject;
				T result = caseReference(reference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SetPackage.REFERENCE_CHANGE: {
				ReferenceChange referenceChange = (ReferenceChange)theEObject;
				T result = caseReferenceChange(referenceChange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SetPackage.REFERENCES_TO_CHANGE: {
				ReferencesToChange referencesToChange = (ReferencesToChange)theEObject;
				T result = caseReferencesToChange(referencesToChange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SetPackage.ROLE_PERMISSION: {
				RolePermission rolePermission = (RolePermission)theEObject;
				T result = caseRolePermission(rolePermission);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SetPackage.STRUCTURE_TRANSLATION_TYPE: {
				StructureTranslationType structureTranslationType = (StructureTranslationType)theEObject;
				T result = caseStructureTranslationType(structureTranslationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SetPackage.TRANSLATION_TYPE: {
				TranslationType translationType = (TranslationType)theEObject;
				T result = caseTranslationType(translationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SetPackage.UA_DATA_TYPE: {
				UADataType uaDataType = (UADataType)theEObject;
				T result = caseUADataType(uaDataType);
				if (result == null) result = caseUAType(uaDataType);
				if (result == null) result = caseUANode(uaDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SetPackage.UA_INSTANCE: {
				UAInstance uaInstance = (UAInstance)theEObject;
				T result = caseUAInstance(uaInstance);
				if (result == null) result = caseUANode(uaInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SetPackage.UA_METHOD: {
				UAMethod uaMethod = (UAMethod)theEObject;
				T result = caseUAMethod(uaMethod);
				if (result == null) result = caseUAInstance(uaMethod);
				if (result == null) result = caseUANode(uaMethod);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SetPackage.UA_METHOD_ARGUMENT: {
				UAMethodArgument uaMethodArgument = (UAMethodArgument)theEObject;
				T result = caseUAMethodArgument(uaMethodArgument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SetPackage.UA_NODE: {
				UANode uaNode = (UANode)theEObject;
				T result = caseUANode(uaNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SetPackage.UA_NODE_SET_CHANGES_STATUS_TYPE: {
				UANodeSetChangesStatusType uaNodeSetChangesStatusType = (UANodeSetChangesStatusType)theEObject;
				T result = caseUANodeSetChangesStatusType(uaNodeSetChangesStatusType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SetPackage.UA_NODE_SET_CHANGES_TYPE: {
				UANodeSetChangesType uaNodeSetChangesType = (UANodeSetChangesType)theEObject;
				T result = caseUANodeSetChangesType(uaNodeSetChangesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SetPackage.UA_NODE_SET_TYPE: {
				UANodeSetType uaNodeSetType = (UANodeSetType)theEObject;
				T result = caseUANodeSetType(uaNodeSetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SetPackage.UA_OBJECT: {
				UAObject uaObject = (UAObject)theEObject;
				T result = caseUAObject(uaObject);
				if (result == null) result = caseUAInstance(uaObject);
				if (result == null) result = caseUANode(uaObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SetPackage.UA_OBJECT_TYPE: {
				UAObjectType uaObjectType = (UAObjectType)theEObject;
				T result = caseUAObjectType(uaObjectType);
				if (result == null) result = caseUAType(uaObjectType);
				if (result == null) result = caseUANode(uaObjectType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SetPackage.UA_REFERENCE_TYPE: {
				UAReferenceType uaReferenceType = (UAReferenceType)theEObject;
				T result = caseUAReferenceType(uaReferenceType);
				if (result == null) result = caseUAType(uaReferenceType);
				if (result == null) result = caseUANode(uaReferenceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SetPackage.UA_TYPE: {
				UAType uaType = (UAType)theEObject;
				T result = caseUAType(uaType);
				if (result == null) result = caseUANode(uaType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SetPackage.UA_VARIABLE: {
				UAVariable uaVariable = (UAVariable)theEObject;
				T result = caseUAVariable(uaVariable);
				if (result == null) result = caseUAInstance(uaVariable);
				if (result == null) result = caseUANode(uaVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SetPackage.UA_VARIABLE_TYPE: {
				UAVariableType uaVariableType = (UAVariableType)theEObject;
				T result = caseUAVariableType(uaVariableType);
				if (result == null) result = caseUAType(uaVariableType);
				if (result == null) result = caseUANode(uaVariableType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SetPackage.UA_VIEW: {
				UAView uaView = (UAView)theEObject;
				T result = caseUAView(uaView);
				if (result == null) result = caseUAInstance(uaView);
				if (result == null) result = caseUANode(uaView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SetPackage.URI_TABLE: {
				UriTable uriTable = (UriTable)theEObject;
				T result = caseUriTable(uriTable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SetPackage.VALUE_TYPE: {
				ValueType valueType = (ValueType)theEObject;
				T result = caseValueType(valueType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SetPackage.VALUE_TYPE1: {
				ValueType1 valueType1 = (ValueType1)theEObject;
				T result = caseValueType1(valueType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alias Table</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alias Table</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAliasTable(AliasTable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Type Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Type Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataTypeDefinition(DataTypeDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Type Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Type Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataTypeField(DataTypeField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentRoot(DocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extension Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extension Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtensionType(ExtensionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Extensions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Extensions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfExtensions(ListOfExtensions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of References</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of References</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfReferences(ListOfReferences object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Role Permissions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Role Permissions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfRolePermissions(ListOfRolePermissions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Localized Text</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Localized Text</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocalizedText(LocalizedText object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Table</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Table</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelTable(ModelTable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Table Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Table Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelTableEntry(ModelTableEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node Id Alias</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node Id Alias</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNodeIdAlias(NodeIdAlias object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node Set Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node Set Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNodeSetStatus(NodeSetStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node Set Status List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node Set Status List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNodeSetStatusList(NodeSetStatusList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nodes To Add</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nodes To Add</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNodesToAdd(NodesToAdd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nodes To Delete</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nodes To Delete</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNodesToDelete(NodesToDelete object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node To Delete</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node To Delete</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNodeToDelete(NodeToDelete object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReference(Reference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference Change</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference Change</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferenceChange(ReferenceChange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>References To Change</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>References To Change</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferencesToChange(ReferencesToChange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Permission</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Permission</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRolePermission(RolePermission object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structure Translation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structure Translation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructureTranslationType(StructureTranslationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Translation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Translation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTranslationType(TranslationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UA Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UA Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUADataType(UADataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UA Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UA Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUAInstance(UAInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UA Method</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UA Method</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUAMethod(UAMethod object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UA Method Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UA Method Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUAMethodArgument(UAMethodArgument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UA Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UA Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUANode(UANode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UA Node Set Changes Status Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UA Node Set Changes Status Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUANodeSetChangesStatusType(UANodeSetChangesStatusType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UA Node Set Changes Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UA Node Set Changes Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUANodeSetChangesType(UANodeSetChangesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UA Node Set Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UA Node Set Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUANodeSetType(UANodeSetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UA Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UA Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUAObject(UAObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UA Object Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UA Object Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUAObjectType(UAObjectType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UA Reference Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UA Reference Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUAReferenceType(UAReferenceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UA Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UA Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUAType(UAType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UA Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UA Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUAVariable(UAVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UA Variable Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UA Variable Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUAVariableType(UAVariableType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UA View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UA View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUAView(UAView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Uri Table</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Uri Table</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUriTable(UriTable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueType(ValueType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueType1(ValueType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //SetSwitch
