/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.opcfoundation.ua._2008._02.types.Guid;
import org.opcfoundation.ua._2008._02.types.TypesPackage;
import org.opcfoundation.ua._2008._02.types.UadpDataSetReaderMessageDataType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Uadp Data Set Reader Message Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.UadpDataSetReaderMessageDataTypeImpl#getGroupVersion <em>Group Version</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.UadpDataSetReaderMessageDataTypeImpl#getNetworkMessageNumber <em>Network Message Number</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.UadpDataSetReaderMessageDataTypeImpl#getDataSetOffset <em>Data Set Offset</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.UadpDataSetReaderMessageDataTypeImpl#getDataSetClassId <em>Data Set Class Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.UadpDataSetReaderMessageDataTypeImpl#getNetworkMessageContentMask <em>Network Message Content Mask</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.UadpDataSetReaderMessageDataTypeImpl#getDataSetMessageContentMask <em>Data Set Message Content Mask</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.UadpDataSetReaderMessageDataTypeImpl#getPublishingInterval <em>Publishing Interval</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.UadpDataSetReaderMessageDataTypeImpl#getReceiveOffset <em>Receive Offset</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.UadpDataSetReaderMessageDataTypeImpl#getProcessingOffset <em>Processing Offset</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UadpDataSetReaderMessageDataTypeImpl extends DataSetReaderMessageDataTypeImpl implements UadpDataSetReaderMessageDataType {
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
	 * The default value of the '{@link #getNetworkMessageNumber() <em>Network Message Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkMessageNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int NETWORK_MESSAGE_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNetworkMessageNumber() <em>Network Message Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkMessageNumber()
	 * @generated
	 * @ordered
	 */
	protected int networkMessageNumber = NETWORK_MESSAGE_NUMBER_EDEFAULT;

	/**
	 * This is true if the Network Message Number attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean networkMessageNumberESet;

	/**
	 * The default value of the '{@link #getDataSetOffset() <em>Data Set Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSetOffset()
	 * @generated
	 * @ordered
	 */
	protected static final int DATA_SET_OFFSET_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDataSetOffset() <em>Data Set Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSetOffset()
	 * @generated
	 * @ordered
	 */
	protected int dataSetOffset = DATA_SET_OFFSET_EDEFAULT;

	/**
	 * This is true if the Data Set Offset attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dataSetOffsetESet;

	/**
	 * The cached value of the '{@link #getDataSetClassId() <em>Data Set Class Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSetClassId()
	 * @generated
	 * @ordered
	 */
	protected Guid dataSetClassId;

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
	 * The default value of the '{@link #getDataSetMessageContentMask() <em>Data Set Message Content Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSetMessageContentMask()
	 * @generated
	 * @ordered
	 */
	protected static final long DATA_SET_MESSAGE_CONTENT_MASK_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getDataSetMessageContentMask() <em>Data Set Message Content Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSetMessageContentMask()
	 * @generated
	 * @ordered
	 */
	protected long dataSetMessageContentMask = DATA_SET_MESSAGE_CONTENT_MASK_EDEFAULT;

	/**
	 * This is true if the Data Set Message Content Mask attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dataSetMessageContentMaskESet;

	/**
	 * The default value of the '{@link #getPublishingInterval() <em>Publishing Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublishingInterval()
	 * @generated
	 * @ordered
	 */
	protected static final double PUBLISHING_INTERVAL_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPublishingInterval() <em>Publishing Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublishingInterval()
	 * @generated
	 * @ordered
	 */
	protected double publishingInterval = PUBLISHING_INTERVAL_EDEFAULT;

	/**
	 * This is true if the Publishing Interval attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean publishingIntervalESet;

	/**
	 * The default value of the '{@link #getReceiveOffset() <em>Receive Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiveOffset()
	 * @generated
	 * @ordered
	 */
	protected static final double RECEIVE_OFFSET_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getReceiveOffset() <em>Receive Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiveOffset()
	 * @generated
	 * @ordered
	 */
	protected double receiveOffset = RECEIVE_OFFSET_EDEFAULT;

	/**
	 * This is true if the Receive Offset attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean receiveOffsetESet;

	/**
	 * The default value of the '{@link #getProcessingOffset() <em>Processing Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessingOffset()
	 * @generated
	 * @ordered
	 */
	protected static final double PROCESSING_OFFSET_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getProcessingOffset() <em>Processing Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessingOffset()
	 * @generated
	 * @ordered
	 */
	protected double processingOffset = PROCESSING_OFFSET_EDEFAULT;

	/**
	 * This is true if the Processing Offset attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean processingOffsetESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UadpDataSetReaderMessageDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getUadpDataSetReaderMessageDataType();
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
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.UADP_DATA_SET_READER_MESSAGE_DATA_TYPE__GROUP_VERSION, oldGroupVersion, groupVersion, !oldGroupVersionESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.UADP_DATA_SET_READER_MESSAGE_DATA_TYPE__GROUP_VERSION, oldGroupVersion, GROUP_VERSION_EDEFAULT, oldGroupVersionESet));
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
	public int getNetworkMessageNumber() {
		return networkMessageNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNetworkMessageNumber(int newNetworkMessageNumber) {
		int oldNetworkMessageNumber = networkMessageNumber;
		networkMessageNumber = newNetworkMessageNumber;
		boolean oldNetworkMessageNumberESet = networkMessageNumberESet;
		networkMessageNumberESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.UADP_DATA_SET_READER_MESSAGE_DATA_TYPE__NETWORK_MESSAGE_NUMBER, oldNetworkMessageNumber, networkMessageNumber, !oldNetworkMessageNumberESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNetworkMessageNumber() {
		int oldNetworkMessageNumber = networkMessageNumber;
		boolean oldNetworkMessageNumberESet = networkMessageNumberESet;
		networkMessageNumber = NETWORK_MESSAGE_NUMBER_EDEFAULT;
		networkMessageNumberESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.UADP_DATA_SET_READER_MESSAGE_DATA_TYPE__NETWORK_MESSAGE_NUMBER, oldNetworkMessageNumber, NETWORK_MESSAGE_NUMBER_EDEFAULT, oldNetworkMessageNumberESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNetworkMessageNumber() {
		return networkMessageNumberESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDataSetOffset() {
		return dataSetOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataSetOffset(int newDataSetOffset) {
		int oldDataSetOffset = dataSetOffset;
		dataSetOffset = newDataSetOffset;
		boolean oldDataSetOffsetESet = dataSetOffsetESet;
		dataSetOffsetESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.UADP_DATA_SET_READER_MESSAGE_DATA_TYPE__DATA_SET_OFFSET, oldDataSetOffset, dataSetOffset, !oldDataSetOffsetESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDataSetOffset() {
		int oldDataSetOffset = dataSetOffset;
		boolean oldDataSetOffsetESet = dataSetOffsetESet;
		dataSetOffset = DATA_SET_OFFSET_EDEFAULT;
		dataSetOffsetESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.UADP_DATA_SET_READER_MESSAGE_DATA_TYPE__DATA_SET_OFFSET, oldDataSetOffset, DATA_SET_OFFSET_EDEFAULT, oldDataSetOffsetESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDataSetOffset() {
		return dataSetOffsetESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Guid getDataSetClassId() {
		return dataSetClassId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataSetClassId(Guid newDataSetClassId, NotificationChain msgs) {
		Guid oldDataSetClassId = dataSetClassId;
		dataSetClassId = newDataSetClassId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.UADP_DATA_SET_READER_MESSAGE_DATA_TYPE__DATA_SET_CLASS_ID, oldDataSetClassId, newDataSetClassId);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataSetClassId(Guid newDataSetClassId) {
		if (newDataSetClassId != dataSetClassId) {
			NotificationChain msgs = null;
			if (dataSetClassId != null)
				msgs = ((InternalEObject)dataSetClassId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.UADP_DATA_SET_READER_MESSAGE_DATA_TYPE__DATA_SET_CLASS_ID, null, msgs);
			if (newDataSetClassId != null)
				msgs = ((InternalEObject)newDataSetClassId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.UADP_DATA_SET_READER_MESSAGE_DATA_TYPE__DATA_SET_CLASS_ID, null, msgs);
			msgs = basicSetDataSetClassId(newDataSetClassId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.UADP_DATA_SET_READER_MESSAGE_DATA_TYPE__DATA_SET_CLASS_ID, newDataSetClassId, newDataSetClassId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.UADP_DATA_SET_READER_MESSAGE_DATA_TYPE__NETWORK_MESSAGE_CONTENT_MASK, oldNetworkMessageContentMask, networkMessageContentMask, !oldNetworkMessageContentMaskESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.UADP_DATA_SET_READER_MESSAGE_DATA_TYPE__NETWORK_MESSAGE_CONTENT_MASK, oldNetworkMessageContentMask, NETWORK_MESSAGE_CONTENT_MASK_EDEFAULT, oldNetworkMessageContentMaskESet));
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
	public long getDataSetMessageContentMask() {
		return dataSetMessageContentMask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataSetMessageContentMask(long newDataSetMessageContentMask) {
		long oldDataSetMessageContentMask = dataSetMessageContentMask;
		dataSetMessageContentMask = newDataSetMessageContentMask;
		boolean oldDataSetMessageContentMaskESet = dataSetMessageContentMaskESet;
		dataSetMessageContentMaskESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.UADP_DATA_SET_READER_MESSAGE_DATA_TYPE__DATA_SET_MESSAGE_CONTENT_MASK, oldDataSetMessageContentMask, dataSetMessageContentMask, !oldDataSetMessageContentMaskESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDataSetMessageContentMask() {
		long oldDataSetMessageContentMask = dataSetMessageContentMask;
		boolean oldDataSetMessageContentMaskESet = dataSetMessageContentMaskESet;
		dataSetMessageContentMask = DATA_SET_MESSAGE_CONTENT_MASK_EDEFAULT;
		dataSetMessageContentMaskESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.UADP_DATA_SET_READER_MESSAGE_DATA_TYPE__DATA_SET_MESSAGE_CONTENT_MASK, oldDataSetMessageContentMask, DATA_SET_MESSAGE_CONTENT_MASK_EDEFAULT, oldDataSetMessageContentMaskESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDataSetMessageContentMask() {
		return dataSetMessageContentMaskESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPublishingInterval() {
		return publishingInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublishingInterval(double newPublishingInterval) {
		double oldPublishingInterval = publishingInterval;
		publishingInterval = newPublishingInterval;
		boolean oldPublishingIntervalESet = publishingIntervalESet;
		publishingIntervalESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.UADP_DATA_SET_READER_MESSAGE_DATA_TYPE__PUBLISHING_INTERVAL, oldPublishingInterval, publishingInterval, !oldPublishingIntervalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPublishingInterval() {
		double oldPublishingInterval = publishingInterval;
		boolean oldPublishingIntervalESet = publishingIntervalESet;
		publishingInterval = PUBLISHING_INTERVAL_EDEFAULT;
		publishingIntervalESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.UADP_DATA_SET_READER_MESSAGE_DATA_TYPE__PUBLISHING_INTERVAL, oldPublishingInterval, PUBLISHING_INTERVAL_EDEFAULT, oldPublishingIntervalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPublishingInterval() {
		return publishingIntervalESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getReceiveOffset() {
		return receiveOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReceiveOffset(double newReceiveOffset) {
		double oldReceiveOffset = receiveOffset;
		receiveOffset = newReceiveOffset;
		boolean oldReceiveOffsetESet = receiveOffsetESet;
		receiveOffsetESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.UADP_DATA_SET_READER_MESSAGE_DATA_TYPE__RECEIVE_OFFSET, oldReceiveOffset, receiveOffset, !oldReceiveOffsetESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetReceiveOffset() {
		double oldReceiveOffset = receiveOffset;
		boolean oldReceiveOffsetESet = receiveOffsetESet;
		receiveOffset = RECEIVE_OFFSET_EDEFAULT;
		receiveOffsetESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.UADP_DATA_SET_READER_MESSAGE_DATA_TYPE__RECEIVE_OFFSET, oldReceiveOffset, RECEIVE_OFFSET_EDEFAULT, oldReceiveOffsetESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetReceiveOffset() {
		return receiveOffsetESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getProcessingOffset() {
		return processingOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessingOffset(double newProcessingOffset) {
		double oldProcessingOffset = processingOffset;
		processingOffset = newProcessingOffset;
		boolean oldProcessingOffsetESet = processingOffsetESet;
		processingOffsetESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.UADP_DATA_SET_READER_MESSAGE_DATA_TYPE__PROCESSING_OFFSET, oldProcessingOffset, processingOffset, !oldProcessingOffsetESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetProcessingOffset() {
		double oldProcessingOffset = processingOffset;
		boolean oldProcessingOffsetESet = processingOffsetESet;
		processingOffset = PROCESSING_OFFSET_EDEFAULT;
		processingOffsetESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.UADP_DATA_SET_READER_MESSAGE_DATA_TYPE__PROCESSING_OFFSET, oldProcessingOffset, PROCESSING_OFFSET_EDEFAULT, oldProcessingOffsetESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetProcessingOffset() {
		return processingOffsetESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.UADP_DATA_SET_READER_MESSAGE_DATA_TYPE__DATA_SET_CLASS_ID:
				return basicSetDataSetClassId(null, msgs);
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
			case TypesPackage.UADP_DATA_SET_READER_MESSAGE_DATA_TYPE__GROUP_VERSION:
				return getGroupVersion();
			case TypesPackage.UADP_DATA_SET_READER_MESSAGE_DATA_TYPE__NETWORK_MESSAGE_NUMBER:
				return getNetworkMessageNumber();
			case TypesPackage.UADP_DATA_SET_READER_MESSAGE_DATA_TYPE__DATA_SET_OFFSET:
				return getDataSetOffset();
			case TypesPackage.UADP_DATA_SET_READER_MESSAGE_DATA_TYPE__DATA_SET_CLASS_ID:
				return getDataSetClassId();
			case TypesPackage.UADP_DATA_SET_READER_MESSAGE_DATA_TYPE__NETWORK_MESSAGE_CONTENT_MASK:
				return getNetworkMessageContentMask();
			case TypesPackage.UADP_DATA_SET_READER_MESSAGE_DATA_TYPE__DATA_SET_MESSAGE_CONTENT_MASK:
				return getDataSetMessageContentMask();
			case TypesPackage.UADP_DATA_SET_READER_MESSAGE_DATA_TYPE__PUBLISHING_INTERVAL:
				return getPublishingInterval();
			case TypesPackage.UADP_DATA_SET_READER_MESSAGE_DATA_TYPE__RECEIVE_OFFSET:
				return getReceiveOffset();
			case TypesPackage.UADP_DATA_SET_READER_MESSAGE_DATA_TYPE__PROCESSING_OFFSET:
				return getProcessingOffset();
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
			case TypesPackage.UADP_DATA_SET_READER_MESSAGE_DATA_TYPE__GROUP_VERSION:
				setGroupVersion((Long)newValue);
				return;
			case TypesPackage.UADP_DATA_SET_READER_MESSAGE_DATA_TYPE__NETWORK_MESSAGE_NUMBER:
				setNetworkMessageNumber((Integer)newValue);
				return;
			case TypesPackage.UADP_DATA_SET_READER_MESSAGE_DATA_TYPE__DATA_SET_OFFSET:
				setDataSetOffset((Integer)newValue);
				return;
			case TypesPackage.UADP_DATA_SET_READER_MESSAGE_DATA_TYPE__DATA_SET_CLASS_ID:
				setDataSetClassId((Guid)newValue);
				return;
			case TypesPackage.UADP_DATA_SET_READER_MESSAGE_DATA_TYPE__NETWORK_MESSAGE_CONTENT_MASK:
				setNetworkMessageContentMask((Long)newValue);
				return;
			case TypesPackage.UADP_DATA_SET_READER_MESSAGE_DATA_TYPE__DATA_SET_MESSAGE_CONTENT_MASK:
				setDataSetMessageContentMask((Long)newValue);
				return;
			case TypesPackage.UADP_DATA_SET_READER_MESSAGE_DATA_TYPE__PUBLISHING_INTERVAL:
				setPublishingInterval((Double)newValue);
				return;
			case TypesPackage.UADP_DATA_SET_READER_MESSAGE_DATA_TYPE__RECEIVE_OFFSET:
				setReceiveOffset((Double)newValue);
				return;
			case TypesPackage.UADP_DATA_SET_READER_MESSAGE_DATA_TYPE__PROCESSING_OFFSET:
				setProcessingOffset((Double)newValue);
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
			case TypesPackage.UADP_DATA_SET_READER_MESSAGE_DATA_TYPE__GROUP_VERSION:
				unsetGroupVersion();
				return;
			case TypesPackage.UADP_DATA_SET_READER_MESSAGE_DATA_TYPE__NETWORK_MESSAGE_NUMBER:
				unsetNetworkMessageNumber();
				return;
			case TypesPackage.UADP_DATA_SET_READER_MESSAGE_DATA_TYPE__DATA_SET_OFFSET:
				unsetDataSetOffset();
				return;
			case TypesPackage.UADP_DATA_SET_READER_MESSAGE_DATA_TYPE__DATA_SET_CLASS_ID:
				setDataSetClassId((Guid)null);
				return;
			case TypesPackage.UADP_DATA_SET_READER_MESSAGE_DATA_TYPE__NETWORK_MESSAGE_CONTENT_MASK:
				unsetNetworkMessageContentMask();
				return;
			case TypesPackage.UADP_DATA_SET_READER_MESSAGE_DATA_TYPE__DATA_SET_MESSAGE_CONTENT_MASK:
				unsetDataSetMessageContentMask();
				return;
			case TypesPackage.UADP_DATA_SET_READER_MESSAGE_DATA_TYPE__PUBLISHING_INTERVAL:
				unsetPublishingInterval();
				return;
			case TypesPackage.UADP_DATA_SET_READER_MESSAGE_DATA_TYPE__RECEIVE_OFFSET:
				unsetReceiveOffset();
				return;
			case TypesPackage.UADP_DATA_SET_READER_MESSAGE_DATA_TYPE__PROCESSING_OFFSET:
				unsetProcessingOffset();
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
			case TypesPackage.UADP_DATA_SET_READER_MESSAGE_DATA_TYPE__GROUP_VERSION:
				return isSetGroupVersion();
			case TypesPackage.UADP_DATA_SET_READER_MESSAGE_DATA_TYPE__NETWORK_MESSAGE_NUMBER:
				return isSetNetworkMessageNumber();
			case TypesPackage.UADP_DATA_SET_READER_MESSAGE_DATA_TYPE__DATA_SET_OFFSET:
				return isSetDataSetOffset();
			case TypesPackage.UADP_DATA_SET_READER_MESSAGE_DATA_TYPE__DATA_SET_CLASS_ID:
				return dataSetClassId != null;
			case TypesPackage.UADP_DATA_SET_READER_MESSAGE_DATA_TYPE__NETWORK_MESSAGE_CONTENT_MASK:
				return isSetNetworkMessageContentMask();
			case TypesPackage.UADP_DATA_SET_READER_MESSAGE_DATA_TYPE__DATA_SET_MESSAGE_CONTENT_MASK:
				return isSetDataSetMessageContentMask();
			case TypesPackage.UADP_DATA_SET_READER_MESSAGE_DATA_TYPE__PUBLISHING_INTERVAL:
				return isSetPublishingInterval();
			case TypesPackage.UADP_DATA_SET_READER_MESSAGE_DATA_TYPE__RECEIVE_OFFSET:
				return isSetReceiveOffset();
			case TypesPackage.UADP_DATA_SET_READER_MESSAGE_DATA_TYPE__PROCESSING_OFFSET:
				return isSetProcessingOffset();
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
		result.append(", networkMessageNumber: ");
		if (networkMessageNumberESet) result.append(networkMessageNumber); else result.append("<unset>");
		result.append(", dataSetOffset: ");
		if (dataSetOffsetESet) result.append(dataSetOffset); else result.append("<unset>");
		result.append(", networkMessageContentMask: ");
		if (networkMessageContentMaskESet) result.append(networkMessageContentMask); else result.append("<unset>");
		result.append(", dataSetMessageContentMask: ");
		if (dataSetMessageContentMaskESet) result.append(dataSetMessageContentMask); else result.append("<unset>");
		result.append(", publishingInterval: ");
		if (publishingIntervalESet) result.append(publishingInterval); else result.append("<unset>");
		result.append(", receiveOffset: ");
		if (receiveOffsetESet) result.append(receiveOffset); else result.append("<unset>");
		result.append(", processingOffset: ");
		if (processingOffsetESet) result.append(processingOffset); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //UadpDataSetReaderMessageDataTypeImpl
