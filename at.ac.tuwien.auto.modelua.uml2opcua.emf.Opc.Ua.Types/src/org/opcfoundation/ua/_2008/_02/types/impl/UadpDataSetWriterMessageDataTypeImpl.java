/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.opcfoundation.ua._2008._02.types.TypesPackage;
import org.opcfoundation.ua._2008._02.types.UadpDataSetWriterMessageDataType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Uadp Data Set Writer Message Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.UadpDataSetWriterMessageDataTypeImpl#getDataSetMessageContentMask <em>Data Set Message Content Mask</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.UadpDataSetWriterMessageDataTypeImpl#getConfiguredSize <em>Configured Size</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.UadpDataSetWriterMessageDataTypeImpl#getNetworkMessageNumber <em>Network Message Number</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.UadpDataSetWriterMessageDataTypeImpl#getDataSetOffset <em>Data Set Offset</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UadpDataSetWriterMessageDataTypeImpl extends DataSetWriterMessageDataTypeImpl implements UadpDataSetWriterMessageDataType {
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
	 * The default value of the '{@link #getConfiguredSize() <em>Configured Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfiguredSize()
	 * @generated
	 * @ordered
	 */
	protected static final int CONFIGURED_SIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getConfiguredSize() <em>Configured Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfiguredSize()
	 * @generated
	 * @ordered
	 */
	protected int configuredSize = CONFIGURED_SIZE_EDEFAULT;

	/**
	 * This is true if the Configured Size attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean configuredSizeESet;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UadpDataSetWriterMessageDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getUadpDataSetWriterMessageDataType();
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
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.UADP_DATA_SET_WRITER_MESSAGE_DATA_TYPE__DATA_SET_MESSAGE_CONTENT_MASK, oldDataSetMessageContentMask, dataSetMessageContentMask, !oldDataSetMessageContentMaskESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.UADP_DATA_SET_WRITER_MESSAGE_DATA_TYPE__DATA_SET_MESSAGE_CONTENT_MASK, oldDataSetMessageContentMask, DATA_SET_MESSAGE_CONTENT_MASK_EDEFAULT, oldDataSetMessageContentMaskESet));
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
	public int getConfiguredSize() {
		return configuredSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfiguredSize(int newConfiguredSize) {
		int oldConfiguredSize = configuredSize;
		configuredSize = newConfiguredSize;
		boolean oldConfiguredSizeESet = configuredSizeESet;
		configuredSizeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.UADP_DATA_SET_WRITER_MESSAGE_DATA_TYPE__CONFIGURED_SIZE, oldConfiguredSize, configuredSize, !oldConfiguredSizeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetConfiguredSize() {
		int oldConfiguredSize = configuredSize;
		boolean oldConfiguredSizeESet = configuredSizeESet;
		configuredSize = CONFIGURED_SIZE_EDEFAULT;
		configuredSizeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.UADP_DATA_SET_WRITER_MESSAGE_DATA_TYPE__CONFIGURED_SIZE, oldConfiguredSize, CONFIGURED_SIZE_EDEFAULT, oldConfiguredSizeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetConfiguredSize() {
		return configuredSizeESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.UADP_DATA_SET_WRITER_MESSAGE_DATA_TYPE__NETWORK_MESSAGE_NUMBER, oldNetworkMessageNumber, networkMessageNumber, !oldNetworkMessageNumberESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.UADP_DATA_SET_WRITER_MESSAGE_DATA_TYPE__NETWORK_MESSAGE_NUMBER, oldNetworkMessageNumber, NETWORK_MESSAGE_NUMBER_EDEFAULT, oldNetworkMessageNumberESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.UADP_DATA_SET_WRITER_MESSAGE_DATA_TYPE__DATA_SET_OFFSET, oldDataSetOffset, dataSetOffset, !oldDataSetOffsetESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.UADP_DATA_SET_WRITER_MESSAGE_DATA_TYPE__DATA_SET_OFFSET, oldDataSetOffset, DATA_SET_OFFSET_EDEFAULT, oldDataSetOffsetESet));
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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TypesPackage.UADP_DATA_SET_WRITER_MESSAGE_DATA_TYPE__DATA_SET_MESSAGE_CONTENT_MASK:
				return getDataSetMessageContentMask();
			case TypesPackage.UADP_DATA_SET_WRITER_MESSAGE_DATA_TYPE__CONFIGURED_SIZE:
				return getConfiguredSize();
			case TypesPackage.UADP_DATA_SET_WRITER_MESSAGE_DATA_TYPE__NETWORK_MESSAGE_NUMBER:
				return getNetworkMessageNumber();
			case TypesPackage.UADP_DATA_SET_WRITER_MESSAGE_DATA_TYPE__DATA_SET_OFFSET:
				return getDataSetOffset();
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
			case TypesPackage.UADP_DATA_SET_WRITER_MESSAGE_DATA_TYPE__DATA_SET_MESSAGE_CONTENT_MASK:
				setDataSetMessageContentMask((Long)newValue);
				return;
			case TypesPackage.UADP_DATA_SET_WRITER_MESSAGE_DATA_TYPE__CONFIGURED_SIZE:
				setConfiguredSize((Integer)newValue);
				return;
			case TypesPackage.UADP_DATA_SET_WRITER_MESSAGE_DATA_TYPE__NETWORK_MESSAGE_NUMBER:
				setNetworkMessageNumber((Integer)newValue);
				return;
			case TypesPackage.UADP_DATA_SET_WRITER_MESSAGE_DATA_TYPE__DATA_SET_OFFSET:
				setDataSetOffset((Integer)newValue);
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
			case TypesPackage.UADP_DATA_SET_WRITER_MESSAGE_DATA_TYPE__DATA_SET_MESSAGE_CONTENT_MASK:
				unsetDataSetMessageContentMask();
				return;
			case TypesPackage.UADP_DATA_SET_WRITER_MESSAGE_DATA_TYPE__CONFIGURED_SIZE:
				unsetConfiguredSize();
				return;
			case TypesPackage.UADP_DATA_SET_WRITER_MESSAGE_DATA_TYPE__NETWORK_MESSAGE_NUMBER:
				unsetNetworkMessageNumber();
				return;
			case TypesPackage.UADP_DATA_SET_WRITER_MESSAGE_DATA_TYPE__DATA_SET_OFFSET:
				unsetDataSetOffset();
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
			case TypesPackage.UADP_DATA_SET_WRITER_MESSAGE_DATA_TYPE__DATA_SET_MESSAGE_CONTENT_MASK:
				return isSetDataSetMessageContentMask();
			case TypesPackage.UADP_DATA_SET_WRITER_MESSAGE_DATA_TYPE__CONFIGURED_SIZE:
				return isSetConfiguredSize();
			case TypesPackage.UADP_DATA_SET_WRITER_MESSAGE_DATA_TYPE__NETWORK_MESSAGE_NUMBER:
				return isSetNetworkMessageNumber();
			case TypesPackage.UADP_DATA_SET_WRITER_MESSAGE_DATA_TYPE__DATA_SET_OFFSET:
				return isSetDataSetOffset();
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
		result.append(" (dataSetMessageContentMask: ");
		if (dataSetMessageContentMaskESet) result.append(dataSetMessageContentMask); else result.append("<unset>");
		result.append(", configuredSize: ");
		if (configuredSizeESet) result.append(configuredSize); else result.append("<unset>");
		result.append(", networkMessageNumber: ");
		if (networkMessageNumberESet) result.append(networkMessageNumber); else result.append("<unset>");
		result.append(", dataSetOffset: ");
		if (dataSetOffsetESet) result.append(dataSetOffset); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //UadpDataSetWriterMessageDataTypeImpl
