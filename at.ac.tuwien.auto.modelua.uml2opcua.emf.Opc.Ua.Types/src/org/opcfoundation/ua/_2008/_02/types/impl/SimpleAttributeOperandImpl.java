/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.opcfoundation.ua._2008._02.types.ListOfQualifiedName;
import org.opcfoundation.ua._2008._02.types.NodeId;
import org.opcfoundation.ua._2008._02.types.SimpleAttributeOperand;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Attribute Operand</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.SimpleAttributeOperandImpl#getTypeDefinitionId <em>Type Definition Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.SimpleAttributeOperandImpl#getBrowsePath <em>Browse Path</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.SimpleAttributeOperandImpl#getAttributeId <em>Attribute Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.SimpleAttributeOperandImpl#getIndexRange <em>Index Range</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SimpleAttributeOperandImpl extends FilterOperandImpl implements SimpleAttributeOperand {
	/**
	 * The cached value of the '{@link #getTypeDefinitionId() <em>Type Definition Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeDefinitionId()
	 * @generated
	 * @ordered
	 */
	protected NodeId typeDefinitionId;

	/**
	 * This is true if the Type Definition Id containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeDefinitionIdESet;

	/**
	 * The cached value of the '{@link #getBrowsePath() <em>Browse Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBrowsePath()
	 * @generated
	 * @ordered
	 */
	protected ListOfQualifiedName browsePath;

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
	protected SimpleAttributeOperandImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getSimpleAttributeOperand();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeId getTypeDefinitionId() {
		return typeDefinitionId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTypeDefinitionId(NodeId newTypeDefinitionId, NotificationChain msgs) {
		NodeId oldTypeDefinitionId = typeDefinitionId;
		typeDefinitionId = newTypeDefinitionId;
		boolean oldTypeDefinitionIdESet = typeDefinitionIdESet;
		typeDefinitionIdESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.SIMPLE_ATTRIBUTE_OPERAND__TYPE_DEFINITION_ID, oldTypeDefinitionId, newTypeDefinitionId, !oldTypeDefinitionIdESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeDefinitionId(NodeId newTypeDefinitionId) {
		if (newTypeDefinitionId != typeDefinitionId) {
			NotificationChain msgs = null;
			if (typeDefinitionId != null)
				msgs = ((InternalEObject)typeDefinitionId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SIMPLE_ATTRIBUTE_OPERAND__TYPE_DEFINITION_ID, null, msgs);
			if (newTypeDefinitionId != null)
				msgs = ((InternalEObject)newTypeDefinitionId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SIMPLE_ATTRIBUTE_OPERAND__TYPE_DEFINITION_ID, null, msgs);
			msgs = basicSetTypeDefinitionId(newTypeDefinitionId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldTypeDefinitionIdESet = typeDefinitionIdESet;
			typeDefinitionIdESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SIMPLE_ATTRIBUTE_OPERAND__TYPE_DEFINITION_ID, newTypeDefinitionId, newTypeDefinitionId, !oldTypeDefinitionIdESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetTypeDefinitionId(NotificationChain msgs) {
		NodeId oldTypeDefinitionId = typeDefinitionId;
		typeDefinitionId = null;
		boolean oldTypeDefinitionIdESet = typeDefinitionIdESet;
		typeDefinitionIdESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.SIMPLE_ATTRIBUTE_OPERAND__TYPE_DEFINITION_ID, oldTypeDefinitionId, null, oldTypeDefinitionIdESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTypeDefinitionId() {
		if (typeDefinitionId != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)typeDefinitionId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SIMPLE_ATTRIBUTE_OPERAND__TYPE_DEFINITION_ID, null, msgs);
			msgs = basicUnsetTypeDefinitionId(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldTypeDefinitionIdESet = typeDefinitionIdESet;
			typeDefinitionIdESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.SIMPLE_ATTRIBUTE_OPERAND__TYPE_DEFINITION_ID, null, null, oldTypeDefinitionIdESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTypeDefinitionId() {
		return typeDefinitionIdESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfQualifiedName getBrowsePath() {
		return browsePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBrowsePath(ListOfQualifiedName newBrowsePath, NotificationChain msgs) {
		ListOfQualifiedName oldBrowsePath = browsePath;
		browsePath = newBrowsePath;
		boolean oldBrowsePathESet = browsePathESet;
		browsePathESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.SIMPLE_ATTRIBUTE_OPERAND__BROWSE_PATH, oldBrowsePath, newBrowsePath, !oldBrowsePathESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBrowsePath(ListOfQualifiedName newBrowsePath) {
		if (newBrowsePath != browsePath) {
			NotificationChain msgs = null;
			if (browsePath != null)
				msgs = ((InternalEObject)browsePath).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SIMPLE_ATTRIBUTE_OPERAND__BROWSE_PATH, null, msgs);
			if (newBrowsePath != null)
				msgs = ((InternalEObject)newBrowsePath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SIMPLE_ATTRIBUTE_OPERAND__BROWSE_PATH, null, msgs);
			msgs = basicSetBrowsePath(newBrowsePath, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldBrowsePathESet = browsePathESet;
			browsePathESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SIMPLE_ATTRIBUTE_OPERAND__BROWSE_PATH, newBrowsePath, newBrowsePath, !oldBrowsePathESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetBrowsePath(NotificationChain msgs) {
		ListOfQualifiedName oldBrowsePath = browsePath;
		browsePath = null;
		boolean oldBrowsePathESet = browsePathESet;
		browsePathESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.SIMPLE_ATTRIBUTE_OPERAND__BROWSE_PATH, oldBrowsePath, null, oldBrowsePathESet);
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
			msgs = ((InternalEObject)browsePath).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SIMPLE_ATTRIBUTE_OPERAND__BROWSE_PATH, null, msgs);
			msgs = basicUnsetBrowsePath(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldBrowsePathESet = browsePathESet;
			browsePathESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.SIMPLE_ATTRIBUTE_OPERAND__BROWSE_PATH, null, null, oldBrowsePathESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SIMPLE_ATTRIBUTE_OPERAND__ATTRIBUTE_ID, oldAttributeId, attributeId, !oldAttributeIdESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.SIMPLE_ATTRIBUTE_OPERAND__ATTRIBUTE_ID, oldAttributeId, ATTRIBUTE_ID_EDEFAULT, oldAttributeIdESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SIMPLE_ATTRIBUTE_OPERAND__INDEX_RANGE, oldIndexRange, indexRange, !oldIndexRangeESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.SIMPLE_ATTRIBUTE_OPERAND__INDEX_RANGE, oldIndexRange, INDEX_RANGE_EDEFAULT, oldIndexRangeESet));
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
			case TypesPackage.SIMPLE_ATTRIBUTE_OPERAND__TYPE_DEFINITION_ID:
				return basicUnsetTypeDefinitionId(msgs);
			case TypesPackage.SIMPLE_ATTRIBUTE_OPERAND__BROWSE_PATH:
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
			case TypesPackage.SIMPLE_ATTRIBUTE_OPERAND__TYPE_DEFINITION_ID:
				return getTypeDefinitionId();
			case TypesPackage.SIMPLE_ATTRIBUTE_OPERAND__BROWSE_PATH:
				return getBrowsePath();
			case TypesPackage.SIMPLE_ATTRIBUTE_OPERAND__ATTRIBUTE_ID:
				return getAttributeId();
			case TypesPackage.SIMPLE_ATTRIBUTE_OPERAND__INDEX_RANGE:
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
			case TypesPackage.SIMPLE_ATTRIBUTE_OPERAND__TYPE_DEFINITION_ID:
				setTypeDefinitionId((NodeId)newValue);
				return;
			case TypesPackage.SIMPLE_ATTRIBUTE_OPERAND__BROWSE_PATH:
				setBrowsePath((ListOfQualifiedName)newValue);
				return;
			case TypesPackage.SIMPLE_ATTRIBUTE_OPERAND__ATTRIBUTE_ID:
				setAttributeId((Long)newValue);
				return;
			case TypesPackage.SIMPLE_ATTRIBUTE_OPERAND__INDEX_RANGE:
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
			case TypesPackage.SIMPLE_ATTRIBUTE_OPERAND__TYPE_DEFINITION_ID:
				unsetTypeDefinitionId();
				return;
			case TypesPackage.SIMPLE_ATTRIBUTE_OPERAND__BROWSE_PATH:
				unsetBrowsePath();
				return;
			case TypesPackage.SIMPLE_ATTRIBUTE_OPERAND__ATTRIBUTE_ID:
				unsetAttributeId();
				return;
			case TypesPackage.SIMPLE_ATTRIBUTE_OPERAND__INDEX_RANGE:
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
			case TypesPackage.SIMPLE_ATTRIBUTE_OPERAND__TYPE_DEFINITION_ID:
				return isSetTypeDefinitionId();
			case TypesPackage.SIMPLE_ATTRIBUTE_OPERAND__BROWSE_PATH:
				return isSetBrowsePath();
			case TypesPackage.SIMPLE_ATTRIBUTE_OPERAND__ATTRIBUTE_ID:
				return isSetAttributeId();
			case TypesPackage.SIMPLE_ATTRIBUTE_OPERAND__INDEX_RANGE:
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
		result.append(" (attributeId: ");
		if (attributeIdESet) result.append(attributeId); else result.append("<unset>");
		result.append(", indexRange: ");
		if (indexRangeESet) result.append(indexRange); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //SimpleAttributeOperandImpl
