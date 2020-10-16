/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.opcfoundation.ua._2008._02.types.AttributeOperand;
import org.opcfoundation.ua._2008._02.types.NodeId;
import org.opcfoundation.ua._2008._02.types.RelativePath;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Operand</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.AttributeOperandImpl#getNodeId <em>Node Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.AttributeOperandImpl#getAlias <em>Alias</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.AttributeOperandImpl#getBrowsePath <em>Browse Path</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.AttributeOperandImpl#getAttributeId <em>Attribute Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.AttributeOperandImpl#getIndexRange <em>Index Range</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributeOperandImpl extends FilterOperandImpl implements AttributeOperand {
	/**
	 * The cached value of the '{@link #getNodeId() <em>Node Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeId()
	 * @generated
	 * @ordered
	 */
	protected NodeId nodeId;

	/**
	 * This is true if the Node Id containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nodeIdESet;

	/**
	 * The default value of the '{@link #getAlias() <em>Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlias()
	 * @generated
	 * @ordered
	 */
	protected static final String ALIAS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlias() <em>Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlias()
	 * @generated
	 * @ordered
	 */
	protected String alias = ALIAS_EDEFAULT;

	/**
	 * This is true if the Alias attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean aliasESet;

	/**
	 * The cached value of the '{@link #getBrowsePath() <em>Browse Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBrowsePath()
	 * @generated
	 * @ordered
	 */
	protected RelativePath browsePath;

	/**
	 * This is true if the Browse Path containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean browsePathESet;

	/**
	 * The default value of the '{@link #getAttributeId() <em>Attribute Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeId()
	 * @generated
	 * @ordered
	 */
	protected static final long ATTRIBUTE_ID_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getAttributeId() <em>Attribute Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeId()
	 * @generated
	 * @ordered
	 */
	protected long attributeId = ATTRIBUTE_ID_EDEFAULT;

	/**
	 * This is true if the Attribute Id attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean attributeIdESet;

	/**
	 * The default value of the '{@link #getIndexRange() <em>Index Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndexRange()
	 * @generated
	 * @ordered
	 */
	protected static final String INDEX_RANGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIndexRange() <em>Index Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndexRange()
	 * @generated
	 * @ordered
	 */
	protected String indexRange = INDEX_RANGE_EDEFAULT;

	/**
	 * This is true if the Index Range attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean indexRangeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeOperandImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getAttributeOperand();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeId getNodeId() {
		return nodeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNodeId(NodeId newNodeId, NotificationChain msgs) {
		NodeId oldNodeId = nodeId;
		nodeId = newNodeId;
		boolean oldNodeIdESet = nodeIdESet;
		nodeIdESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.ATTRIBUTE_OPERAND__NODE_ID, oldNodeId, newNodeId, !oldNodeIdESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNodeId(NodeId newNodeId) {
		if (newNodeId != nodeId) {
			NotificationChain msgs = null;
			if (nodeId != null)
				msgs = ((InternalEObject)nodeId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.ATTRIBUTE_OPERAND__NODE_ID, null, msgs);
			if (newNodeId != null)
				msgs = ((InternalEObject)newNodeId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.ATTRIBUTE_OPERAND__NODE_ID, null, msgs);
			msgs = basicSetNodeId(newNodeId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldNodeIdESet = nodeIdESet;
			nodeIdESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.ATTRIBUTE_OPERAND__NODE_ID, newNodeId, newNodeId, !oldNodeIdESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetNodeId(NotificationChain msgs) {
		NodeId oldNodeId = nodeId;
		nodeId = null;
		boolean oldNodeIdESet = nodeIdESet;
		nodeIdESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.ATTRIBUTE_OPERAND__NODE_ID, oldNodeId, null, oldNodeIdESet);
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
			msgs = ((InternalEObject)nodeId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.ATTRIBUTE_OPERAND__NODE_ID, null, msgs);
			msgs = basicUnsetNodeId(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldNodeIdESet = nodeIdESet;
			nodeIdESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.ATTRIBUTE_OPERAND__NODE_ID, null, null, oldNodeIdESet));
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
	public String getAlias() {
		return alias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlias(String newAlias) {
		String oldAlias = alias;
		alias = newAlias;
		boolean oldAliasESet = aliasESet;
		aliasESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.ATTRIBUTE_OPERAND__ALIAS, oldAlias, alias, !oldAliasESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAlias() {
		String oldAlias = alias;
		boolean oldAliasESet = aliasESet;
		alias = ALIAS_EDEFAULT;
		aliasESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.ATTRIBUTE_OPERAND__ALIAS, oldAlias, ALIAS_EDEFAULT, oldAliasESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAlias() {
		return aliasESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelativePath getBrowsePath() {
		return browsePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBrowsePath(RelativePath newBrowsePath, NotificationChain msgs) {
		RelativePath oldBrowsePath = browsePath;
		browsePath = newBrowsePath;
		boolean oldBrowsePathESet = browsePathESet;
		browsePathESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.ATTRIBUTE_OPERAND__BROWSE_PATH, oldBrowsePath, newBrowsePath, !oldBrowsePathESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBrowsePath(RelativePath newBrowsePath) {
		if (newBrowsePath != browsePath) {
			NotificationChain msgs = null;
			if (browsePath != null)
				msgs = ((InternalEObject)browsePath).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.ATTRIBUTE_OPERAND__BROWSE_PATH, null, msgs);
			if (newBrowsePath != null)
				msgs = ((InternalEObject)newBrowsePath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.ATTRIBUTE_OPERAND__BROWSE_PATH, null, msgs);
			msgs = basicSetBrowsePath(newBrowsePath, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldBrowsePathESet = browsePathESet;
			browsePathESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.ATTRIBUTE_OPERAND__BROWSE_PATH, newBrowsePath, newBrowsePath, !oldBrowsePathESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetBrowsePath(NotificationChain msgs) {
		RelativePath oldBrowsePath = browsePath;
		browsePath = null;
		boolean oldBrowsePathESet = browsePathESet;
		browsePathESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.ATTRIBUTE_OPERAND__BROWSE_PATH, oldBrowsePath, null, oldBrowsePathESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBrowsePath() {
		if (browsePath != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)browsePath).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.ATTRIBUTE_OPERAND__BROWSE_PATH, null, msgs);
			msgs = basicUnsetBrowsePath(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldBrowsePathESet = browsePathESet;
			browsePathESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.ATTRIBUTE_OPERAND__BROWSE_PATH, null, null, oldBrowsePathESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBrowsePath() {
		return browsePathESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getAttributeId() {
		return attributeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributeId(long newAttributeId) {
		long oldAttributeId = attributeId;
		attributeId = newAttributeId;
		boolean oldAttributeIdESet = attributeIdESet;
		attributeIdESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.ATTRIBUTE_OPERAND__ATTRIBUTE_ID, oldAttributeId, attributeId, !oldAttributeIdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAttributeId() {
		long oldAttributeId = attributeId;
		boolean oldAttributeIdESet = attributeIdESet;
		attributeId = ATTRIBUTE_ID_EDEFAULT;
		attributeIdESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.ATTRIBUTE_OPERAND__ATTRIBUTE_ID, oldAttributeId, ATTRIBUTE_ID_EDEFAULT, oldAttributeIdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAttributeId() {
		return attributeIdESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIndexRange() {
		return indexRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndexRange(String newIndexRange) {
		String oldIndexRange = indexRange;
		indexRange = newIndexRange;
		boolean oldIndexRangeESet = indexRangeESet;
		indexRangeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.ATTRIBUTE_OPERAND__INDEX_RANGE, oldIndexRange, indexRange, !oldIndexRangeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIndexRange() {
		String oldIndexRange = indexRange;
		boolean oldIndexRangeESet = indexRangeESet;
		indexRange = INDEX_RANGE_EDEFAULT;
		indexRangeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.ATTRIBUTE_OPERAND__INDEX_RANGE, oldIndexRange, INDEX_RANGE_EDEFAULT, oldIndexRangeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIndexRange() {
		return indexRangeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.ATTRIBUTE_OPERAND__NODE_ID:
				return basicUnsetNodeId(msgs);
			case TypesPackage.ATTRIBUTE_OPERAND__BROWSE_PATH:
				return basicUnsetBrowsePath(msgs);
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
			case TypesPackage.ATTRIBUTE_OPERAND__NODE_ID:
				return getNodeId();
			case TypesPackage.ATTRIBUTE_OPERAND__ALIAS:
				return getAlias();
			case TypesPackage.ATTRIBUTE_OPERAND__BROWSE_PATH:
				return getBrowsePath();
			case TypesPackage.ATTRIBUTE_OPERAND__ATTRIBUTE_ID:
				return getAttributeId();
			case TypesPackage.ATTRIBUTE_OPERAND__INDEX_RANGE:
				return getIndexRange();
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
			case TypesPackage.ATTRIBUTE_OPERAND__NODE_ID:
				setNodeId((NodeId)newValue);
				return;
			case TypesPackage.ATTRIBUTE_OPERAND__ALIAS:
				setAlias((String)newValue);
				return;
			case TypesPackage.ATTRIBUTE_OPERAND__BROWSE_PATH:
				setBrowsePath((RelativePath)newValue);
				return;
			case TypesPackage.ATTRIBUTE_OPERAND__ATTRIBUTE_ID:
				setAttributeId((Long)newValue);
				return;
			case TypesPackage.ATTRIBUTE_OPERAND__INDEX_RANGE:
				setIndexRange((String)newValue);
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
			case TypesPackage.ATTRIBUTE_OPERAND__NODE_ID:
				unsetNodeId();
				return;
			case TypesPackage.ATTRIBUTE_OPERAND__ALIAS:
				unsetAlias();
				return;
			case TypesPackage.ATTRIBUTE_OPERAND__BROWSE_PATH:
				unsetBrowsePath();
				return;
			case TypesPackage.ATTRIBUTE_OPERAND__ATTRIBUTE_ID:
				unsetAttributeId();
				return;
			case TypesPackage.ATTRIBUTE_OPERAND__INDEX_RANGE:
				unsetIndexRange();
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
			case TypesPackage.ATTRIBUTE_OPERAND__NODE_ID:
				return isSetNodeId();
			case TypesPackage.ATTRIBUTE_OPERAND__ALIAS:
				return isSetAlias();
			case TypesPackage.ATTRIBUTE_OPERAND__BROWSE_PATH:
				return isSetBrowsePath();
			case TypesPackage.ATTRIBUTE_OPERAND__ATTRIBUTE_ID:
				return isSetAttributeId();
			case TypesPackage.ATTRIBUTE_OPERAND__INDEX_RANGE:
				return isSetIndexRange();
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
		result.append(" (alias: ");
		if (aliasESet) result.append(alias); else result.append("<unset>");
		result.append(", attributeId: ");
		if (attributeIdESet) result.append(attributeId); else result.append("<unset>");
		result.append(", indexRange: ");
		if (indexRangeESet) result.append(indexRange); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //AttributeOperandImpl
