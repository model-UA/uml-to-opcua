/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.opcfoundation.ua._2008._02.types.FieldTargetDataType;
import org.opcfoundation.ua._2008._02.types.Guid;
import org.opcfoundation.ua._2008._02.types.NodeId;
import org.opcfoundation.ua._2008._02.types.OverrideValueHandling;
import org.opcfoundation.ua._2008._02.types.TypesPackage;
import org.opcfoundation.ua._2008._02.types.Variant;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Field Target Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.FieldTargetDataTypeImpl#getDataSetFieldId <em>Data Set Field Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.FieldTargetDataTypeImpl#getReceiverIndexRange <em>Receiver Index Range</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.FieldTargetDataTypeImpl#getTargetNodeId <em>Target Node Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.FieldTargetDataTypeImpl#getAttributeId <em>Attribute Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.FieldTargetDataTypeImpl#getWriteIndexRange <em>Write Index Range</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.FieldTargetDataTypeImpl#getOverrideValueHandling <em>Override Value Handling</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.FieldTargetDataTypeImpl#getOverrideValue <em>Override Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FieldTargetDataTypeImpl extends MinimalEObjectImpl.Container implements FieldTargetDataType {
	/**
	 * The cached value of the '{@link #getDataSetFieldId() <em>Data Set Field Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSetFieldId()
	 * @generated
	 * @ordered
	 */
	protected Guid dataSetFieldId;

	/**
	 * The default value of the '{@link #getReceiverIndexRange() <em>Receiver Index Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiverIndexRange()
	 * @generated
	 * @ordered
	 */
	protected static final String RECEIVER_INDEX_RANGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReceiverIndexRange() <em>Receiver Index Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiverIndexRange()
	 * @generated
	 * @ordered
	 */
	protected String receiverIndexRange = RECEIVER_INDEX_RANGE_EDEFAULT;

	/**
	 * This is true if the Receiver Index Range attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean receiverIndexRangeESet;

	/**
	 * The cached value of the '{@link #getTargetNodeId() <em>Target Node Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetNodeId()
	 * @generated
	 * @ordered
	 */
	protected NodeId targetNodeId;

	/**
	 * This is true if the Target Node Id containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean targetNodeIdESet;

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
	 * The default value of the '{@link #getWriteIndexRange() <em>Write Index Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWriteIndexRange()
	 * @generated
	 * @ordered
	 */
	protected static final String WRITE_INDEX_RANGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWriteIndexRange() <em>Write Index Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWriteIndexRange()
	 * @generated
	 * @ordered
	 */
	protected String writeIndexRange = WRITE_INDEX_RANGE_EDEFAULT;

	/**
	 * This is true if the Write Index Range attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean writeIndexRangeESet;

	/**
	 * The default value of the '{@link #getOverrideValueHandling() <em>Override Value Handling</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverrideValueHandling()
	 * @generated
	 * @ordered
	 */
	protected static final OverrideValueHandling OVERRIDE_VALUE_HANDLING_EDEFAULT = OverrideValueHandling.DISABLED0;

	/**
	 * The cached value of the '{@link #getOverrideValueHandling() <em>Override Value Handling</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverrideValueHandling()
	 * @generated
	 * @ordered
	 */
	protected OverrideValueHandling overrideValueHandling = OVERRIDE_VALUE_HANDLING_EDEFAULT;

	/**
	 * This is true if the Override Value Handling attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean overrideValueHandlingESet;

	/**
	 * The cached value of the '{@link #getOverrideValue() <em>Override Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverrideValue()
	 * @generated
	 * @ordered
	 */
	protected Variant overrideValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FieldTargetDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getFieldTargetDataType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Guid getDataSetFieldId() {
		return dataSetFieldId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataSetFieldId(Guid newDataSetFieldId, NotificationChain msgs) {
		Guid oldDataSetFieldId = dataSetFieldId;
		dataSetFieldId = newDataSetFieldId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.FIELD_TARGET_DATA_TYPE__DATA_SET_FIELD_ID, oldDataSetFieldId, newDataSetFieldId);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataSetFieldId(Guid newDataSetFieldId) {
		if (newDataSetFieldId != dataSetFieldId) {
			NotificationChain msgs = null;
			if (dataSetFieldId != null)
				msgs = ((InternalEObject)dataSetFieldId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.FIELD_TARGET_DATA_TYPE__DATA_SET_FIELD_ID, null, msgs);
			if (newDataSetFieldId != null)
				msgs = ((InternalEObject)newDataSetFieldId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.FIELD_TARGET_DATA_TYPE__DATA_SET_FIELD_ID, null, msgs);
			msgs = basicSetDataSetFieldId(newDataSetFieldId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.FIELD_TARGET_DATA_TYPE__DATA_SET_FIELD_ID, newDataSetFieldId, newDataSetFieldId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReceiverIndexRange() {
		return receiverIndexRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReceiverIndexRange(String newReceiverIndexRange) {
		String oldReceiverIndexRange = receiverIndexRange;
		receiverIndexRange = newReceiverIndexRange;
		boolean oldReceiverIndexRangeESet = receiverIndexRangeESet;
		receiverIndexRangeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.FIELD_TARGET_DATA_TYPE__RECEIVER_INDEX_RANGE, oldReceiverIndexRange, receiverIndexRange, !oldReceiverIndexRangeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetReceiverIndexRange() {
		String oldReceiverIndexRange = receiverIndexRange;
		boolean oldReceiverIndexRangeESet = receiverIndexRangeESet;
		receiverIndexRange = RECEIVER_INDEX_RANGE_EDEFAULT;
		receiverIndexRangeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.FIELD_TARGET_DATA_TYPE__RECEIVER_INDEX_RANGE, oldReceiverIndexRange, RECEIVER_INDEX_RANGE_EDEFAULT, oldReceiverIndexRangeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetReceiverIndexRange() {
		return receiverIndexRangeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeId getTargetNodeId() {
		return targetNodeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetNodeId(NodeId newTargetNodeId, NotificationChain msgs) {
		NodeId oldTargetNodeId = targetNodeId;
		targetNodeId = newTargetNodeId;
		boolean oldTargetNodeIdESet = targetNodeIdESet;
		targetNodeIdESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.FIELD_TARGET_DATA_TYPE__TARGET_NODE_ID, oldTargetNodeId, newTargetNodeId, !oldTargetNodeIdESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetNodeId(NodeId newTargetNodeId) {
		if (newTargetNodeId != targetNodeId) {
			NotificationChain msgs = null;
			if (targetNodeId != null)
				msgs = ((InternalEObject)targetNodeId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.FIELD_TARGET_DATA_TYPE__TARGET_NODE_ID, null, msgs);
			if (newTargetNodeId != null)
				msgs = ((InternalEObject)newTargetNodeId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.FIELD_TARGET_DATA_TYPE__TARGET_NODE_ID, null, msgs);
			msgs = basicSetTargetNodeId(newTargetNodeId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldTargetNodeIdESet = targetNodeIdESet;
			targetNodeIdESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.FIELD_TARGET_DATA_TYPE__TARGET_NODE_ID, newTargetNodeId, newTargetNodeId, !oldTargetNodeIdESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetTargetNodeId(NotificationChain msgs) {
		NodeId oldTargetNodeId = targetNodeId;
		targetNodeId = null;
		boolean oldTargetNodeIdESet = targetNodeIdESet;
		targetNodeIdESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.FIELD_TARGET_DATA_TYPE__TARGET_NODE_ID, oldTargetNodeId, null, oldTargetNodeIdESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTargetNodeId() {
		if (targetNodeId != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)targetNodeId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.FIELD_TARGET_DATA_TYPE__TARGET_NODE_ID, null, msgs);
			msgs = basicUnsetTargetNodeId(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldTargetNodeIdESet = targetNodeIdESet;
			targetNodeIdESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.FIELD_TARGET_DATA_TYPE__TARGET_NODE_ID, null, null, oldTargetNodeIdESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTargetNodeId() {
		return targetNodeIdESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.FIELD_TARGET_DATA_TYPE__ATTRIBUTE_ID, oldAttributeId, attributeId, !oldAttributeIdESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.FIELD_TARGET_DATA_TYPE__ATTRIBUTE_ID, oldAttributeId, ATTRIBUTE_ID_EDEFAULT, oldAttributeIdESet));
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
	public String getWriteIndexRange() {
		return writeIndexRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWriteIndexRange(String newWriteIndexRange) {
		String oldWriteIndexRange = writeIndexRange;
		writeIndexRange = newWriteIndexRange;
		boolean oldWriteIndexRangeESet = writeIndexRangeESet;
		writeIndexRangeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.FIELD_TARGET_DATA_TYPE__WRITE_INDEX_RANGE, oldWriteIndexRange, writeIndexRange, !oldWriteIndexRangeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetWriteIndexRange() {
		String oldWriteIndexRange = writeIndexRange;
		boolean oldWriteIndexRangeESet = writeIndexRangeESet;
		writeIndexRange = WRITE_INDEX_RANGE_EDEFAULT;
		writeIndexRangeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.FIELD_TARGET_DATA_TYPE__WRITE_INDEX_RANGE, oldWriteIndexRange, WRITE_INDEX_RANGE_EDEFAULT, oldWriteIndexRangeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetWriteIndexRange() {
		return writeIndexRangeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OverrideValueHandling getOverrideValueHandling() {
		return overrideValueHandling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOverrideValueHandling(OverrideValueHandling newOverrideValueHandling) {
		OverrideValueHandling oldOverrideValueHandling = overrideValueHandling;
		overrideValueHandling = newOverrideValueHandling == null ? OVERRIDE_VALUE_HANDLING_EDEFAULT : newOverrideValueHandling;
		boolean oldOverrideValueHandlingESet = overrideValueHandlingESet;
		overrideValueHandlingESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.FIELD_TARGET_DATA_TYPE__OVERRIDE_VALUE_HANDLING, oldOverrideValueHandling, overrideValueHandling, !oldOverrideValueHandlingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetOverrideValueHandling() {
		OverrideValueHandling oldOverrideValueHandling = overrideValueHandling;
		boolean oldOverrideValueHandlingESet = overrideValueHandlingESet;
		overrideValueHandling = OVERRIDE_VALUE_HANDLING_EDEFAULT;
		overrideValueHandlingESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.FIELD_TARGET_DATA_TYPE__OVERRIDE_VALUE_HANDLING, oldOverrideValueHandling, OVERRIDE_VALUE_HANDLING_EDEFAULT, oldOverrideValueHandlingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOverrideValueHandling() {
		return overrideValueHandlingESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variant getOverrideValue() {
		return overrideValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOverrideValue(Variant newOverrideValue, NotificationChain msgs) {
		Variant oldOverrideValue = overrideValue;
		overrideValue = newOverrideValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.FIELD_TARGET_DATA_TYPE__OVERRIDE_VALUE, oldOverrideValue, newOverrideValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOverrideValue(Variant newOverrideValue) {
		if (newOverrideValue != overrideValue) {
			NotificationChain msgs = null;
			if (overrideValue != null)
				msgs = ((InternalEObject)overrideValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.FIELD_TARGET_DATA_TYPE__OVERRIDE_VALUE, null, msgs);
			if (newOverrideValue != null)
				msgs = ((InternalEObject)newOverrideValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.FIELD_TARGET_DATA_TYPE__OVERRIDE_VALUE, null, msgs);
			msgs = basicSetOverrideValue(newOverrideValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.FIELD_TARGET_DATA_TYPE__OVERRIDE_VALUE, newOverrideValue, newOverrideValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.FIELD_TARGET_DATA_TYPE__DATA_SET_FIELD_ID:
				return basicSetDataSetFieldId(null, msgs);
			case TypesPackage.FIELD_TARGET_DATA_TYPE__TARGET_NODE_ID:
				return basicUnsetTargetNodeId(msgs);
			case TypesPackage.FIELD_TARGET_DATA_TYPE__OVERRIDE_VALUE:
				return basicSetOverrideValue(null, msgs);
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
			case TypesPackage.FIELD_TARGET_DATA_TYPE__DATA_SET_FIELD_ID:
				return getDataSetFieldId();
			case TypesPackage.FIELD_TARGET_DATA_TYPE__RECEIVER_INDEX_RANGE:
				return getReceiverIndexRange();
			case TypesPackage.FIELD_TARGET_DATA_TYPE__TARGET_NODE_ID:
				return getTargetNodeId();
			case TypesPackage.FIELD_TARGET_DATA_TYPE__ATTRIBUTE_ID:
				return getAttributeId();
			case TypesPackage.FIELD_TARGET_DATA_TYPE__WRITE_INDEX_RANGE:
				return getWriteIndexRange();
			case TypesPackage.FIELD_TARGET_DATA_TYPE__OVERRIDE_VALUE_HANDLING:
				return getOverrideValueHandling();
			case TypesPackage.FIELD_TARGET_DATA_TYPE__OVERRIDE_VALUE:
				return getOverrideValue();
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
			case TypesPackage.FIELD_TARGET_DATA_TYPE__DATA_SET_FIELD_ID:
				setDataSetFieldId((Guid)newValue);
				return;
			case TypesPackage.FIELD_TARGET_DATA_TYPE__RECEIVER_INDEX_RANGE:
				setReceiverIndexRange((String)newValue);
				return;
			case TypesPackage.FIELD_TARGET_DATA_TYPE__TARGET_NODE_ID:
				setTargetNodeId((NodeId)newValue);
				return;
			case TypesPackage.FIELD_TARGET_DATA_TYPE__ATTRIBUTE_ID:
				setAttributeId((Long)newValue);
				return;
			case TypesPackage.FIELD_TARGET_DATA_TYPE__WRITE_INDEX_RANGE:
				setWriteIndexRange((String)newValue);
				return;
			case TypesPackage.FIELD_TARGET_DATA_TYPE__OVERRIDE_VALUE_HANDLING:
				setOverrideValueHandling((OverrideValueHandling)newValue);
				return;
			case TypesPackage.FIELD_TARGET_DATA_TYPE__OVERRIDE_VALUE:
				setOverrideValue((Variant)newValue);
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
			case TypesPackage.FIELD_TARGET_DATA_TYPE__DATA_SET_FIELD_ID:
				setDataSetFieldId((Guid)null);
				return;
			case TypesPackage.FIELD_TARGET_DATA_TYPE__RECEIVER_INDEX_RANGE:
				unsetReceiverIndexRange();
				return;
			case TypesPackage.FIELD_TARGET_DATA_TYPE__TARGET_NODE_ID:
				unsetTargetNodeId();
				return;
			case TypesPackage.FIELD_TARGET_DATA_TYPE__ATTRIBUTE_ID:
				unsetAttributeId();
				return;
			case TypesPackage.FIELD_TARGET_DATA_TYPE__WRITE_INDEX_RANGE:
				unsetWriteIndexRange();
				return;
			case TypesPackage.FIELD_TARGET_DATA_TYPE__OVERRIDE_VALUE_HANDLING:
				unsetOverrideValueHandling();
				return;
			case TypesPackage.FIELD_TARGET_DATA_TYPE__OVERRIDE_VALUE:
				setOverrideValue((Variant)null);
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
			case TypesPackage.FIELD_TARGET_DATA_TYPE__DATA_SET_FIELD_ID:
				return dataSetFieldId != null;
			case TypesPackage.FIELD_TARGET_DATA_TYPE__RECEIVER_INDEX_RANGE:
				return isSetReceiverIndexRange();
			case TypesPackage.FIELD_TARGET_DATA_TYPE__TARGET_NODE_ID:
				return isSetTargetNodeId();
			case TypesPackage.FIELD_TARGET_DATA_TYPE__ATTRIBUTE_ID:
				return isSetAttributeId();
			case TypesPackage.FIELD_TARGET_DATA_TYPE__WRITE_INDEX_RANGE:
				return isSetWriteIndexRange();
			case TypesPackage.FIELD_TARGET_DATA_TYPE__OVERRIDE_VALUE_HANDLING:
				return isSetOverrideValueHandling();
			case TypesPackage.FIELD_TARGET_DATA_TYPE__OVERRIDE_VALUE:
				return overrideValue != null;
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
		result.append(" (receiverIndexRange: ");
		if (receiverIndexRangeESet) result.append(receiverIndexRange); else result.append("<unset>");
		result.append(", attributeId: ");
		if (attributeIdESet) result.append(attributeId); else result.append("<unset>");
		result.append(", writeIndexRange: ");
		if (writeIndexRangeESet) result.append(writeIndexRange); else result.append("<unset>");
		result.append(", overrideValueHandling: ");
		if (overrideValueHandlingESet) result.append(overrideValueHandling); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //FieldTargetDataTypeImpl
