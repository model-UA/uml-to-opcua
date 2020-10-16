/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.opcfoundation.ua._2008._02.types.NodeId;
import org.opcfoundation.ua._2008._02.types.QualifiedName;
import org.opcfoundation.ua._2008._02.types.ReadValueId;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Read Value Id</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ReadValueIdImpl#getNodeId <em>Node Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ReadValueIdImpl#getAttributeId <em>Attribute Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ReadValueIdImpl#getIndexRange <em>Index Range</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ReadValueIdImpl#getDataEncoding <em>Data Encoding</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReadValueIdImpl extends MinimalEObjectImpl.Container implements ReadValueId {
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
	 * The cached value of the '{@link #getDataEncoding() <em>Data Encoding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataEncoding()
	 * @generated
	 * @ordered
	 */
	protected QualifiedName dataEncoding;

	/**
	 * This is true if the Data Encoding containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dataEncodingESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReadValueIdImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getReadValueId();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.READ_VALUE_ID__NODE_ID, oldNodeId, newNodeId, !oldNodeIdESet);
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
				msgs = ((InternalEObject)nodeId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.READ_VALUE_ID__NODE_ID, null, msgs);
			if (newNodeId != null)
				msgs = ((InternalEObject)newNodeId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.READ_VALUE_ID__NODE_ID, null, msgs);
			msgs = basicSetNodeId(newNodeId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldNodeIdESet = nodeIdESet;
			nodeIdESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.READ_VALUE_ID__NODE_ID, newNodeId, newNodeId, !oldNodeIdESet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.READ_VALUE_ID__NODE_ID, oldNodeId, null, oldNodeIdESet);
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
			msgs = ((InternalEObject)nodeId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.READ_VALUE_ID__NODE_ID, null, msgs);
			msgs = basicUnsetNodeId(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldNodeIdESet = nodeIdESet;
			nodeIdESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.READ_VALUE_ID__NODE_ID, null, null, oldNodeIdESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.READ_VALUE_ID__ATTRIBUTE_ID, oldAttributeId, attributeId, !oldAttributeIdESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.READ_VALUE_ID__ATTRIBUTE_ID, oldAttributeId, ATTRIBUTE_ID_EDEFAULT, oldAttributeIdESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.READ_VALUE_ID__INDEX_RANGE, oldIndexRange, indexRange, !oldIndexRangeESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.READ_VALUE_ID__INDEX_RANGE, oldIndexRange, INDEX_RANGE_EDEFAULT, oldIndexRangeESet));
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
	public QualifiedName getDataEncoding() {
		return dataEncoding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataEncoding(QualifiedName newDataEncoding, NotificationChain msgs) {
		QualifiedName oldDataEncoding = dataEncoding;
		dataEncoding = newDataEncoding;
		boolean oldDataEncodingESet = dataEncodingESet;
		dataEncodingESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.READ_VALUE_ID__DATA_ENCODING, oldDataEncoding, newDataEncoding, !oldDataEncodingESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataEncoding(QualifiedName newDataEncoding) {
		if (newDataEncoding != dataEncoding) {
			NotificationChain msgs = null;
			if (dataEncoding != null)
				msgs = ((InternalEObject)dataEncoding).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.READ_VALUE_ID__DATA_ENCODING, null, msgs);
			if (newDataEncoding != null)
				msgs = ((InternalEObject)newDataEncoding).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.READ_VALUE_ID__DATA_ENCODING, null, msgs);
			msgs = basicSetDataEncoding(newDataEncoding, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldDataEncodingESet = dataEncodingESet;
			dataEncodingESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.READ_VALUE_ID__DATA_ENCODING, newDataEncoding, newDataEncoding, !oldDataEncodingESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetDataEncoding(NotificationChain msgs) {
		QualifiedName oldDataEncoding = dataEncoding;
		dataEncoding = null;
		boolean oldDataEncodingESet = dataEncodingESet;
		dataEncodingESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.READ_VALUE_ID__DATA_ENCODING, oldDataEncoding, null, oldDataEncodingESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDataEncoding() {
		if (dataEncoding != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)dataEncoding).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.READ_VALUE_ID__DATA_ENCODING, null, msgs);
			msgs = basicUnsetDataEncoding(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldDataEncodingESet = dataEncodingESet;
			dataEncodingESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.READ_VALUE_ID__DATA_ENCODING, null, null, oldDataEncodingESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDataEncoding() {
		return dataEncodingESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.READ_VALUE_ID__NODE_ID:
				return basicUnsetNodeId(msgs);
			case TypesPackage.READ_VALUE_ID__DATA_ENCODING:
				return basicUnsetDataEncoding(msgs);
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
			case TypesPackage.READ_VALUE_ID__NODE_ID:
				return getNodeId();
			case TypesPackage.READ_VALUE_ID__ATTRIBUTE_ID:
				return getAttributeId();
			case TypesPackage.READ_VALUE_ID__INDEX_RANGE:
				return getIndexRange();
			case TypesPackage.READ_VALUE_ID__DATA_ENCODING:
				return getDataEncoding();
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
			case TypesPackage.READ_VALUE_ID__NODE_ID:
				setNodeId((NodeId)newValue);
				return;
			case TypesPackage.READ_VALUE_ID__ATTRIBUTE_ID:
				setAttributeId((Long)newValue);
				return;
			case TypesPackage.READ_VALUE_ID__INDEX_RANGE:
				setIndexRange((String)newValue);
				return;
			case TypesPackage.READ_VALUE_ID__DATA_ENCODING:
				setDataEncoding((QualifiedName)newValue);
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
			case TypesPackage.READ_VALUE_ID__NODE_ID:
				unsetNodeId();
				return;
			case TypesPackage.READ_VALUE_ID__ATTRIBUTE_ID:
				unsetAttributeId();
				return;
			case TypesPackage.READ_VALUE_ID__INDEX_RANGE:
				unsetIndexRange();
				return;
			case TypesPackage.READ_VALUE_ID__DATA_ENCODING:
				unsetDataEncoding();
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
			case TypesPackage.READ_VALUE_ID__NODE_ID:
				return isSetNodeId();
			case TypesPackage.READ_VALUE_ID__ATTRIBUTE_ID:
				return isSetAttributeId();
			case TypesPackage.READ_VALUE_ID__INDEX_RANGE:
				return isSetIndexRange();
			case TypesPackage.READ_VALUE_ID__DATA_ENCODING:
				return isSetDataEncoding();
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

} //ReadValueIdImpl
