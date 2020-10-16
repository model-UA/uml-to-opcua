/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.opcfoundation.ua._2008._02.types.DataSetOrderingType;
import org.opcfoundation.ua._2008._02.types.ListOfDouble;
import org.opcfoundation.ua._2008._02.types.TypesPackage;
import org.opcfoundation.ua._2008._02.types.UadpWriterGroupMessageDataType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Uadp Writer Group Message Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.UadpWriterGroupMessageDataTypeImpl#getGroupVersion <em>Group Version</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.UadpWriterGroupMessageDataTypeImpl#getDataSetOrdering <em>Data Set Ordering</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.UadpWriterGroupMessageDataTypeImpl#getNetworkMessageContentMask <em>Network Message Content Mask</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.UadpWriterGroupMessageDataTypeImpl#getSamplingOffset <em>Sampling Offset</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.UadpWriterGroupMessageDataTypeImpl#getPublishingOffset <em>Publishing Offset</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UadpWriterGroupMessageDataTypeImpl extends WriterGroupMessageDataTypeImpl implements UadpWriterGroupMessageDataType {
	/**
	 * The default value of the '{@link #getGroupVersion() <em>Group Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupVersion()
	 * @generated
	 * @ordered
	 */
	protected static final long GROUP_VERSION_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getGroupVersion() <em>Group Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupVersion()
	 * @generated
	 * @ordered
	 */
	protected long groupVersion = GROUP_VERSION_EDEFAULT;

	/**
	 * This is true if the Group Version attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean groupVersionESet;

	/**
	 * The default value of the '{@link #getDataSetOrdering() <em>Data Set Ordering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSetOrdering()
	 * @generated
	 * @ordered
	 */
	protected static final DataSetOrderingType DATA_SET_ORDERING_EDEFAULT = DataSetOrderingType.UNDEFINED0;

	/**
	 * The cached value of the '{@link #getDataSetOrdering() <em>Data Set Ordering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSetOrdering()
	 * @generated
	 * @ordered
	 */
	protected DataSetOrderingType dataSetOrdering = DATA_SET_ORDERING_EDEFAULT;

	/**
	 * This is true if the Data Set Ordering attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dataSetOrderingESet;

	/**
	 * The default value of the '{@link #getNetworkMessageContentMask() <em>Network Message Content Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkMessageContentMask()
	 * @generated
	 * @ordered
	 */
	protected static final long NETWORK_MESSAGE_CONTENT_MASK_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNetworkMessageContentMask() <em>Network Message Content Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkMessageContentMask()
	 * @generated
	 * @ordered
	 */
	protected long networkMessageContentMask = NETWORK_MESSAGE_CONTENT_MASK_EDEFAULT;

	/**
	 * This is true if the Network Message Content Mask attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean networkMessageContentMaskESet;

	/**
	 * The default value of the '{@link #getSamplingOffset() <em>Sampling Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSamplingOffset()
	 * @generated
	 * @ordered
	 */
	protected static final double SAMPLING_OFFSET_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSamplingOffset() <em>Sampling Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSamplingOffset()
	 * @generated
	 * @ordered
	 */
	protected double samplingOffset = SAMPLING_OFFSET_EDEFAULT;

	/**
	 * This is true if the Sampling Offset attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean samplingOffsetESet;

	/**
	 * The cached value of the '{@link #getPublishingOffset() <em>Publishing Offset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublishingOffset()
	 * @generated
	 * @ordered
	 */
	protected ListOfDouble publishingOffset;

	/**
	 * This is true if the Publishing Offset containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean publishingOffsetESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UadpWriterGroupMessageDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getUadpWriterGroupMessageDataType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getGroupVersion() {
		return groupVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroupVersion(long newGroupVersion) {
		long oldGroupVersion = groupVersion;
		groupVersion = newGroupVersion;
		boolean oldGroupVersionESet = groupVersionESet;
		groupVersionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.UADP_WRITER_GROUP_MESSAGE_DATA_TYPE__GROUP_VERSION, oldGroupVersion, groupVersion, !oldGroupVersionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetGroupVersion() {
		long oldGroupVersion = groupVersion;
		boolean oldGroupVersionESet = groupVersionESet;
		groupVersion = GROUP_VERSION_EDEFAULT;
		groupVersionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.UADP_WRITER_GROUP_MESSAGE_DATA_TYPE__GROUP_VERSION, oldGroupVersion, GROUP_VERSION_EDEFAULT, oldGroupVersionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetGroupVersion() {
		return groupVersionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSetOrderingType getDataSetOrdering() {
		return dataSetOrdering;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataSetOrdering(DataSetOrderingType newDataSetOrdering) {
		DataSetOrderingType oldDataSetOrdering = dataSetOrdering;
		dataSetOrdering = newDataSetOrdering == null ? DATA_SET_ORDERING_EDEFAULT : newDataSetOrdering;
		boolean oldDataSetOrderingESet = dataSetOrderingESet;
		dataSetOrderingESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.UADP_WRITER_GROUP_MESSAGE_DATA_TYPE__DATA_SET_ORDERING, oldDataSetOrdering, dataSetOrdering, !oldDataSetOrderingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDataSetOrdering() {
		DataSetOrderingType oldDataSetOrdering = dataSetOrdering;
		boolean oldDataSetOrderingESet = dataSetOrderingESet;
		dataSetOrdering = DATA_SET_ORDERING_EDEFAULT;
		dataSetOrderingESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.UADP_WRITER_GROUP_MESSAGE_DATA_TYPE__DATA_SET_ORDERING, oldDataSetOrdering, DATA_SET_ORDERING_EDEFAULT, oldDataSetOrderingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDataSetOrdering() {
		return dataSetOrderingESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNetworkMessageContentMask() {
		return networkMessageContentMask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNetworkMessageContentMask(long newNetworkMessageContentMask) {
		long oldNetworkMessageContentMask = networkMessageContentMask;
		networkMessageContentMask = newNetworkMessageContentMask;
		boolean oldNetworkMessageContentMaskESet = networkMessageContentMaskESet;
		networkMessageContentMaskESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.UADP_WRITER_GROUP_MESSAGE_DATA_TYPE__NETWORK_MESSAGE_CONTENT_MASK, oldNetworkMessageContentMask, networkMessageContentMask, !oldNetworkMessageContentMaskESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNetworkMessageContentMask() {
		long oldNetworkMessageContentMask = networkMessageContentMask;
		boolean oldNetworkMessageContentMaskESet = networkMessageContentMaskESet;
		networkMessageContentMask = NETWORK_MESSAGE_CONTENT_MASK_EDEFAULT;
		networkMessageContentMaskESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.UADP_WRITER_GROUP_MESSAGE_DATA_TYPE__NETWORK_MESSAGE_CONTENT_MASK, oldNetworkMessageContentMask, NETWORK_MESSAGE_CONTENT_MASK_EDEFAULT, oldNetworkMessageContentMaskESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNetworkMessageContentMask() {
		return networkMessageContentMaskESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSamplingOffset() {
		return samplingOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSamplingOffset(double newSamplingOffset) {
		double oldSamplingOffset = samplingOffset;
		samplingOffset = newSamplingOffset;
		boolean oldSamplingOffsetESet = samplingOffsetESet;
		samplingOffsetESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.UADP_WRITER_GROUP_MESSAGE_DATA_TYPE__SAMPLING_OFFSET, oldSamplingOffset, samplingOffset, !oldSamplingOffsetESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSamplingOffset() {
		double oldSamplingOffset = samplingOffset;
		boolean oldSamplingOffsetESet = samplingOffsetESet;
		samplingOffset = SAMPLING_OFFSET_EDEFAULT;
		samplingOffsetESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.UADP_WRITER_GROUP_MESSAGE_DATA_TYPE__SAMPLING_OFFSET, oldSamplingOffset, SAMPLING_OFFSET_EDEFAULT, oldSamplingOffsetESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSamplingOffset() {
		return samplingOffsetESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfDouble getPublishingOffset() {
		return publishingOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPublishingOffset(ListOfDouble newPublishingOffset, NotificationChain msgs) {
		ListOfDouble oldPublishingOffset = publishingOffset;
		publishingOffset = newPublishingOffset;
		boolean oldPublishingOffsetESet = publishingOffsetESet;
		publishingOffsetESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.UADP_WRITER_GROUP_MESSAGE_DATA_TYPE__PUBLISHING_OFFSET, oldPublishingOffset, newPublishingOffset, !oldPublishingOffsetESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublishingOffset(ListOfDouble newPublishingOffset) {
		if (newPublishingOffset != publishingOffset) {
			NotificationChain msgs = null;
			if (publishingOffset != null)
				msgs = ((InternalEObject)publishingOffset).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.UADP_WRITER_GROUP_MESSAGE_DATA_TYPE__PUBLISHING_OFFSET, null, msgs);
			if (newPublishingOffset != null)
				msgs = ((InternalEObject)newPublishingOffset).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.UADP_WRITER_GROUP_MESSAGE_DATA_TYPE__PUBLISHING_OFFSET, null, msgs);
			msgs = basicSetPublishingOffset(newPublishingOffset, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldPublishingOffsetESet = publishingOffsetESet;
			publishingOffsetESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.UADP_WRITER_GROUP_MESSAGE_DATA_TYPE__PUBLISHING_OFFSET, newPublishingOffset, newPublishingOffset, !oldPublishingOffsetESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetPublishingOffset(NotificationChain msgs) {
		ListOfDouble oldPublishingOffset = publishingOffset;
		publishingOffset = null;
		boolean oldPublishingOffsetESet = publishingOffsetESet;
		publishingOffsetESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.UADP_WRITER_GROUP_MESSAGE_DATA_TYPE__PUBLISHING_OFFSET, oldPublishingOffset, null, oldPublishingOffsetESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPublishingOffset() {
		if (publishingOffset != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)publishingOffset).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.UADP_WRITER_GROUP_MESSAGE_DATA_TYPE__PUBLISHING_OFFSET, null, msgs);
			msgs = basicUnsetPublishingOffset(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldPublishingOffsetESet = publishingOffsetESet;
			publishingOffsetESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.UADP_WRITER_GROUP_MESSAGE_DATA_TYPE__PUBLISHING_OFFSET, null, null, oldPublishingOffsetESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPublishingOffset() {
		return publishingOffsetESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.UADP_WRITER_GROUP_MESSAGE_DATA_TYPE__PUBLISHING_OFFSET:
				return basicUnsetPublishingOffset(msgs);
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
			case TypesPackage.UADP_WRITER_GROUP_MESSAGE_DATA_TYPE__GROUP_VERSION:
				return getGroupVersion();
			case TypesPackage.UADP_WRITER_GROUP_MESSAGE_DATA_TYPE__DATA_SET_ORDERING:
				return getDataSetOrdering();
			case TypesPackage.UADP_WRITER_GROUP_MESSAGE_DATA_TYPE__NETWORK_MESSAGE_CONTENT_MASK:
				return getNetworkMessageContentMask();
			case TypesPackage.UADP_WRITER_GROUP_MESSAGE_DATA_TYPE__SAMPLING_OFFSET:
				return getSamplingOffset();
			case TypesPackage.UADP_WRITER_GROUP_MESSAGE_DATA_TYPE__PUBLISHING_OFFSET:
				return getPublishingOffset();
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
			case TypesPackage.UADP_WRITER_GROUP_MESSAGE_DATA_TYPE__GROUP_VERSION:
				setGroupVersion((Long)newValue);
				return;
			case TypesPackage.UADP_WRITER_GROUP_MESSAGE_DATA_TYPE__DATA_SET_ORDERING:
				setDataSetOrdering((DataSetOrderingType)newValue);
				return;
			case TypesPackage.UADP_WRITER_GROUP_MESSAGE_DATA_TYPE__NETWORK_MESSAGE_CONTENT_MASK:
				setNetworkMessageContentMask((Long)newValue);
				return;
			case TypesPackage.UADP_WRITER_GROUP_MESSAGE_DATA_TYPE__SAMPLING_OFFSET:
				setSamplingOffset((Double)newValue);
				return;
			case TypesPackage.UADP_WRITER_GROUP_MESSAGE_DATA_TYPE__PUBLISHING_OFFSET:
				setPublishingOffset((ListOfDouble)newValue);
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
			case TypesPackage.UADP_WRITER_GROUP_MESSAGE_DATA_TYPE__GROUP_VERSION:
				unsetGroupVersion();
				return;
			case TypesPackage.UADP_WRITER_GROUP_MESSAGE_DATA_TYPE__DATA_SET_ORDERING:
				unsetDataSetOrdering();
				return;
			case TypesPackage.UADP_WRITER_GROUP_MESSAGE_DATA_TYPE__NETWORK_MESSAGE_CONTENT_MASK:
				unsetNetworkMessageContentMask();
				return;
			case TypesPackage.UADP_WRITER_GROUP_MESSAGE_DATA_TYPE__SAMPLING_OFFSET:
				unsetSamplingOffset();
				return;
			case TypesPackage.UADP_WRITER_GROUP_MESSAGE_DATA_TYPE__PUBLISHING_OFFSET:
				unsetPublishingOffset();
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
			case TypesPackage.UADP_WRITER_GROUP_MESSAGE_DATA_TYPE__GROUP_VERSION:
				return isSetGroupVersion();
			case TypesPackage.UADP_WRITER_GROUP_MESSAGE_DATA_TYPE__DATA_SET_ORDERING:
				return isSetDataSetOrdering();
			case TypesPackage.UADP_WRITER_GROUP_MESSAGE_DATA_TYPE__NETWORK_MESSAGE_CONTENT_MASK:
				return isSetNetworkMessageContentMask();
			case TypesPackage.UADP_WRITER_GROUP_MESSAGE_DATA_TYPE__SAMPLING_OFFSET:
				return isSetSamplingOffset();
			case TypesPackage.UADP_WRITER_GROUP_MESSAGE_DATA_TYPE__PUBLISHING_OFFSET:
				return isSetPublishingOffset();
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
		result.append(" (groupVersion: ");
		if (groupVersionESet) result.append(groupVersion); else result.append("<unset>");
		result.append(", dataSetOrdering: ");
		if (dataSetOrderingESet) result.append(dataSetOrdering); else result.append("<unset>");
		result.append(", networkMessageContentMask: ");
		if (networkMessageContentMaskESet) result.append(networkMessageContentMask); else result.append("<unset>");
		result.append(", samplingOffset: ");
		if (samplingOffsetESet) result.append(samplingOffset); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //UadpWriterGroupMessageDataTypeImpl
