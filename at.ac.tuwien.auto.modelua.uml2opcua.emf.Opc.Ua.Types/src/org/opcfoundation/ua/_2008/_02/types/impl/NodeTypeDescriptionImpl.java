/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.opcfoundation.ua._2008._02.types.ExpandedNodeId;
import org.opcfoundation.ua._2008._02.types.ListOfQueryDataDescription;
import org.opcfoundation.ua._2008._02.types.NodeTypeDescription;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node Type Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.NodeTypeDescriptionImpl#getTypeDefinitionNode <em>Type Definition Node</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.NodeTypeDescriptionImpl#isIncludeSubTypes <em>Include Sub Types</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.NodeTypeDescriptionImpl#getDataToReturn <em>Data To Return</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NodeTypeDescriptionImpl extends MinimalEObjectImpl.Container implements NodeTypeDescription {
	/**
	 * The cached value of the '{@link #getTypeDefinitionNode() <em>Type Definition Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeDefinitionNode()
	 * @generated
	 * @ordered
	 */
	protected ExpandedNodeId typeDefinitionNode;

	/**
	 * This is true if the Type Definition Node containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeDefinitionNodeESet;

	/**
	 * The default value of the '{@link #isIncludeSubTypes() <em>Include Sub Types</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIncludeSubTypes()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INCLUDE_SUB_TYPES_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIncludeSubTypes() <em>Include Sub Types</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIncludeSubTypes()
	 * @generated
	 * @ordered
	 */
	protected boolean includeSubTypes = INCLUDE_SUB_TYPES_EDEFAULT;

	/**
	 * This is true if the Include Sub Types attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean includeSubTypesESet;

	/**
	 * The cached value of the '{@link #getDataToReturn() <em>Data To Return</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataToReturn()
	 * @generated
	 * @ordered
	 */
	protected ListOfQueryDataDescription dataToReturn;

	/**
	 * This is true if the Data To Return containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dataToReturnESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeTypeDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getNodeTypeDescription();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpandedNodeId getTypeDefinitionNode() {
		return typeDefinitionNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTypeDefinitionNode(ExpandedNodeId newTypeDefinitionNode, NotificationChain msgs) {
		ExpandedNodeId oldTypeDefinitionNode = typeDefinitionNode;
		typeDefinitionNode = newTypeDefinitionNode;
		boolean oldTypeDefinitionNodeESet = typeDefinitionNodeESet;
		typeDefinitionNodeESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.NODE_TYPE_DESCRIPTION__TYPE_DEFINITION_NODE, oldTypeDefinitionNode, newTypeDefinitionNode, !oldTypeDefinitionNodeESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeDefinitionNode(ExpandedNodeId newTypeDefinitionNode) {
		if (newTypeDefinitionNode != typeDefinitionNode) {
			NotificationChain msgs = null;
			if (typeDefinitionNode != null)
				msgs = ((InternalEObject)typeDefinitionNode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.NODE_TYPE_DESCRIPTION__TYPE_DEFINITION_NODE, null, msgs);
			if (newTypeDefinitionNode != null)
				msgs = ((InternalEObject)newTypeDefinitionNode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.NODE_TYPE_DESCRIPTION__TYPE_DEFINITION_NODE, null, msgs);
			msgs = basicSetTypeDefinitionNode(newTypeDefinitionNode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldTypeDefinitionNodeESet = typeDefinitionNodeESet;
			typeDefinitionNodeESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.NODE_TYPE_DESCRIPTION__TYPE_DEFINITION_NODE, newTypeDefinitionNode, newTypeDefinitionNode, !oldTypeDefinitionNodeESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetTypeDefinitionNode(NotificationChain msgs) {
		ExpandedNodeId oldTypeDefinitionNode = typeDefinitionNode;
		typeDefinitionNode = null;
		boolean oldTypeDefinitionNodeESet = typeDefinitionNodeESet;
		typeDefinitionNodeESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.NODE_TYPE_DESCRIPTION__TYPE_DEFINITION_NODE, oldTypeDefinitionNode, null, oldTypeDefinitionNodeESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTypeDefinitionNode() {
		if (typeDefinitionNode != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)typeDefinitionNode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.NODE_TYPE_DESCRIPTION__TYPE_DEFINITION_NODE, null, msgs);
			msgs = basicUnsetTypeDefinitionNode(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldTypeDefinitionNodeESet = typeDefinitionNodeESet;
			typeDefinitionNodeESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.NODE_TYPE_DESCRIPTION__TYPE_DEFINITION_NODE, null, null, oldTypeDefinitionNodeESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTypeDefinitionNode() {
		return typeDefinitionNodeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIncludeSubTypes() {
		return includeSubTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncludeSubTypes(boolean newIncludeSubTypes) {
		boolean oldIncludeSubTypes = includeSubTypes;
		includeSubTypes = newIncludeSubTypes;
		boolean oldIncludeSubTypesESet = includeSubTypesESet;
		includeSubTypesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.NODE_TYPE_DESCRIPTION__INCLUDE_SUB_TYPES, oldIncludeSubTypes, includeSubTypes, !oldIncludeSubTypesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIncludeSubTypes() {
		boolean oldIncludeSubTypes = includeSubTypes;
		boolean oldIncludeSubTypesESet = includeSubTypesESet;
		includeSubTypes = INCLUDE_SUB_TYPES_EDEFAULT;
		includeSubTypesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.NODE_TYPE_DESCRIPTION__INCLUDE_SUB_TYPES, oldIncludeSubTypes, INCLUDE_SUB_TYPES_EDEFAULT, oldIncludeSubTypesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIncludeSubTypes() {
		return includeSubTypesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfQueryDataDescription getDataToReturn() {
		return dataToReturn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataToReturn(ListOfQueryDataDescription newDataToReturn, NotificationChain msgs) {
		ListOfQueryDataDescription oldDataToReturn = dataToReturn;
		dataToReturn = newDataToReturn;
		boolean oldDataToReturnESet = dataToReturnESet;
		dataToReturnESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.NODE_TYPE_DESCRIPTION__DATA_TO_RETURN, oldDataToReturn, newDataToReturn, !oldDataToReturnESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataToReturn(ListOfQueryDataDescription newDataToReturn) {
		if (newDataToReturn != dataToReturn) {
			NotificationChain msgs = null;
			if (dataToReturn != null)
				msgs = ((InternalEObject)dataToReturn).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.NODE_TYPE_DESCRIPTION__DATA_TO_RETURN, null, msgs);
			if (newDataToReturn != null)
				msgs = ((InternalEObject)newDataToReturn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.NODE_TYPE_DESCRIPTION__DATA_TO_RETURN, null, msgs);
			msgs = basicSetDataToReturn(newDataToReturn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldDataToReturnESet = dataToReturnESet;
			dataToReturnESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.NODE_TYPE_DESCRIPTION__DATA_TO_RETURN, newDataToReturn, newDataToReturn, !oldDataToReturnESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetDataToReturn(NotificationChain msgs) {
		ListOfQueryDataDescription oldDataToReturn = dataToReturn;
		dataToReturn = null;
		boolean oldDataToReturnESet = dataToReturnESet;
		dataToReturnESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.NODE_TYPE_DESCRIPTION__DATA_TO_RETURN, oldDataToReturn, null, oldDataToReturnESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDataToReturn() {
		if (dataToReturn != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)dataToReturn).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.NODE_TYPE_DESCRIPTION__DATA_TO_RETURN, null, msgs);
			msgs = basicUnsetDataToReturn(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldDataToReturnESet = dataToReturnESet;
			dataToReturnESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.NODE_TYPE_DESCRIPTION__DATA_TO_RETURN, null, null, oldDataToReturnESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDataToReturn() {
		return dataToReturnESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.NODE_TYPE_DESCRIPTION__TYPE_DEFINITION_NODE:
				return basicUnsetTypeDefinitionNode(msgs);
			case TypesPackage.NODE_TYPE_DESCRIPTION__DATA_TO_RETURN:
				return basicUnsetDataToReturn(msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TypesPackage.NODE_TYPE_DESCRIPTION__TYPE_DEFINITION_NODE:
				return getTypeDefinitionNode();
			case TypesPackage.NODE_TYPE_DESCRIPTION__INCLUDE_SUB_TYPES:
				return isIncludeSubTypes();
			case TypesPackage.NODE_TYPE_DESCRIPTION__DATA_TO_RETURN:
				return getDataToReturn();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TypesPackage.NODE_TYPE_DESCRIPTION__TYPE_DEFINITION_NODE:
				setTypeDefinitionNode((ExpandedNodeId)newValue);
				return;
			case TypesPackage.NODE_TYPE_DESCRIPTION__INCLUDE_SUB_TYPES:
				setIncludeSubTypes((Boolean)newValue);
				return;
			case TypesPackage.NODE_TYPE_DESCRIPTION__DATA_TO_RETURN:
				setDataToReturn((ListOfQueryDataDescription)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TypesPackage.NODE_TYPE_DESCRIPTION__TYPE_DEFINITION_NODE:
				unsetTypeDefinitionNode();
				return;
			case TypesPackage.NODE_TYPE_DESCRIPTION__INCLUDE_SUB_TYPES:
				unsetIncludeSubTypes();
				return;
			case TypesPackage.NODE_TYPE_DESCRIPTION__DATA_TO_RETURN:
				unsetDataToReturn();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TypesPackage.NODE_TYPE_DESCRIPTION__TYPE_DEFINITION_NODE:
				return isSetTypeDefinitionNode();
			case TypesPackage.NODE_TYPE_DESCRIPTION__INCLUDE_SUB_TYPES:
				return isSetIncludeSubTypes();
			case TypesPackage.NODE_TYPE_DESCRIPTION__DATA_TO_RETURN:
				return isSetDataToReturn();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (includeSubTypes: ");
		if (includeSubTypesESet) result.append(includeSubTypes); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //NodeTypeDescriptionImpl
