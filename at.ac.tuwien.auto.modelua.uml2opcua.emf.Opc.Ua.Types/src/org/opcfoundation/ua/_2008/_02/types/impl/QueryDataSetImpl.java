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
import org.opcfoundation.ua._2008._02.types.ListOfVariant;
import org.opcfoundation.ua._2008._02.types.QueryDataSet;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Query Data Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.QueryDataSetImpl#getNodeId <em>Node Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.QueryDataSetImpl#getTypeDefinitionNode <em>Type Definition Node</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.QueryDataSetImpl#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QueryDataSetImpl extends MinimalEObjectImpl.Container implements QueryDataSet {
	/**
	 * The cached value of the '{@link #getNodeId() <em>Node Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeId()
	 * @generated
	 * @ordered
	 */
	protected ExpandedNodeId nodeId;

	/**
	 * This is true if the Node Id containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nodeIdESet;

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
	 * The cached value of the '{@link #getValues() <em>Values</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValues()
	 * @generated
	 * @ordered
	 */
	protected ListOfVariant values;

	/**
	 * This is true if the Values containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean valuesESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QueryDataSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getQueryDataSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpandedNodeId getNodeId() {
		return nodeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNodeId(ExpandedNodeId newNodeId, NotificationChain msgs) {
		ExpandedNodeId oldNodeId = nodeId;
		nodeId = newNodeId;
		boolean oldNodeIdESet = nodeIdESet;
		nodeIdESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.QUERY_DATA_SET__NODE_ID, oldNodeId, newNodeId, !oldNodeIdESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNodeId(ExpandedNodeId newNodeId) {
		if (newNodeId != nodeId) {
			NotificationChain msgs = null;
			if (nodeId != null)
				msgs = ((InternalEObject)nodeId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.QUERY_DATA_SET__NODE_ID, null, msgs);
			if (newNodeId != null)
				msgs = ((InternalEObject)newNodeId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.QUERY_DATA_SET__NODE_ID, null, msgs);
			msgs = basicSetNodeId(newNodeId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldNodeIdESet = nodeIdESet;
			nodeIdESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.QUERY_DATA_SET__NODE_ID, newNodeId, newNodeId, !oldNodeIdESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetNodeId(NotificationChain msgs) {
		ExpandedNodeId oldNodeId = nodeId;
		nodeId = null;
		boolean oldNodeIdESet = nodeIdESet;
		nodeIdESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.QUERY_DATA_SET__NODE_ID, oldNodeId, null, oldNodeIdESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNodeId() {
		if (nodeId != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)nodeId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.QUERY_DATA_SET__NODE_ID, null, msgs);
			msgs = basicUnsetNodeId(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldNodeIdESet = nodeIdESet;
			nodeIdESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.QUERY_DATA_SET__NODE_ID, null, null, oldNodeIdESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNodeId() {
		return nodeIdESet;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.QUERY_DATA_SET__TYPE_DEFINITION_NODE, oldTypeDefinitionNode, newTypeDefinitionNode, !oldTypeDefinitionNodeESet);
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
				msgs = ((InternalEObject)typeDefinitionNode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.QUERY_DATA_SET__TYPE_DEFINITION_NODE, null, msgs);
			if (newTypeDefinitionNode != null)
				msgs = ((InternalEObject)newTypeDefinitionNode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.QUERY_DATA_SET__TYPE_DEFINITION_NODE, null, msgs);
			msgs = basicSetTypeDefinitionNode(newTypeDefinitionNode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldTypeDefinitionNodeESet = typeDefinitionNodeESet;
			typeDefinitionNodeESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.QUERY_DATA_SET__TYPE_DEFINITION_NODE, newTypeDefinitionNode, newTypeDefinitionNode, !oldTypeDefinitionNodeESet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.QUERY_DATA_SET__TYPE_DEFINITION_NODE, oldTypeDefinitionNode, null, oldTypeDefinitionNodeESet);
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
			msgs = ((InternalEObject)typeDefinitionNode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.QUERY_DATA_SET__TYPE_DEFINITION_NODE, null, msgs);
			msgs = basicUnsetTypeDefinitionNode(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldTypeDefinitionNodeESet = typeDefinitionNodeESet;
			typeDefinitionNodeESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.QUERY_DATA_SET__TYPE_DEFINITION_NODE, null, null, oldTypeDefinitionNodeESet));
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
	public ListOfVariant getValues() {
		return values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValues(ListOfVariant newValues, NotificationChain msgs) {
		ListOfVariant oldValues = values;
		values = newValues;
		boolean oldValuesESet = valuesESet;
		valuesESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.QUERY_DATA_SET__VALUES, oldValues, newValues, !oldValuesESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValues(ListOfVariant newValues) {
		if (newValues != values) {
			NotificationChain msgs = null;
			if (values != null)
				msgs = ((InternalEObject)values).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.QUERY_DATA_SET__VALUES, null, msgs);
			if (newValues != null)
				msgs = ((InternalEObject)newValues).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.QUERY_DATA_SET__VALUES, null, msgs);
			msgs = basicSetValues(newValues, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldValuesESet = valuesESet;
			valuesESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.QUERY_DATA_SET__VALUES, newValues, newValues, !oldValuesESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetValues(NotificationChain msgs) {
		ListOfVariant oldValues = values;
		values = null;
		boolean oldValuesESet = valuesESet;
		valuesESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.QUERY_DATA_SET__VALUES, oldValues, null, oldValuesESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetValues() {
		if (values != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)values).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.QUERY_DATA_SET__VALUES, null, msgs);
			msgs = basicUnsetValues(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldValuesESet = valuesESet;
			valuesESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.QUERY_DATA_SET__VALUES, null, null, oldValuesESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetValues() {
		return valuesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.QUERY_DATA_SET__NODE_ID:
				return basicUnsetNodeId(msgs);
			case TypesPackage.QUERY_DATA_SET__TYPE_DEFINITION_NODE:
				return basicUnsetTypeDefinitionNode(msgs);
			case TypesPackage.QUERY_DATA_SET__VALUES:
				return basicUnsetValues(msgs);
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
			case TypesPackage.QUERY_DATA_SET__NODE_ID:
				return getNodeId();
			case TypesPackage.QUERY_DATA_SET__TYPE_DEFINITION_NODE:
				return getTypeDefinitionNode();
			case TypesPackage.QUERY_DATA_SET__VALUES:
				return getValues();
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
			case TypesPackage.QUERY_DATA_SET__NODE_ID:
				setNodeId((ExpandedNodeId)newValue);
				return;
			case TypesPackage.QUERY_DATA_SET__TYPE_DEFINITION_NODE:
				setTypeDefinitionNode((ExpandedNodeId)newValue);
				return;
			case TypesPackage.QUERY_DATA_SET__VALUES:
				setValues((ListOfVariant)newValue);
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
			case TypesPackage.QUERY_DATA_SET__NODE_ID:
				unsetNodeId();
				return;
			case TypesPackage.QUERY_DATA_SET__TYPE_DEFINITION_NODE:
				unsetTypeDefinitionNode();
				return;
			case TypesPackage.QUERY_DATA_SET__VALUES:
				unsetValues();
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
			case TypesPackage.QUERY_DATA_SET__NODE_ID:
				return isSetNodeId();
			case TypesPackage.QUERY_DATA_SET__TYPE_DEFINITION_NODE:
				return isSetTypeDefinitionNode();
			case TypesPackage.QUERY_DATA_SET__VALUES:
				return isSetValues();
		}
		return super.eIsSet(featureID);
	}

} //QueryDataSetImpl
