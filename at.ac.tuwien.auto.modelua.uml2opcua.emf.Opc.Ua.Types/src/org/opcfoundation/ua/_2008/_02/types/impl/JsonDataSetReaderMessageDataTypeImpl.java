/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.opcfoundation.ua._2008._02.types.JsonDataSetReaderMessageDataType;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Json Data Set Reader Message Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.JsonDataSetReaderMessageDataTypeImpl#getNetworkMessageContentMask <em>Network Message Content Mask</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.JsonDataSetReaderMessageDataTypeImpl#getDataSetMessageContentMask <em>Data Set Message Content Mask</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JsonDataSetReaderMessageDataTypeImpl extends DataSetReaderMessageDataTypeImpl implements JsonDataSetReaderMessageDataType {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JsonDataSetReaderMessageDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getJsonDataSetReaderMessageDataType();
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
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.JSON_DATA_SET_READER_MESSAGE_DATA_TYPE__NETWORK_MESSAGE_CONTENT_MASK, oldNetworkMessageContentMask, networkMessageContentMask, !oldNetworkMessageContentMaskESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.JSON_DATA_SET_READER_MESSAGE_DATA_TYPE__NETWORK_MESSAGE_CONTENT_MASK, oldNetworkMessageContentMask, NETWORK_MESSAGE_CONTENT_MASK_EDEFAULT, oldNetworkMessageContentMaskESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.JSON_DATA_SET_READER_MESSAGE_DATA_TYPE__DATA_SET_MESSAGE_CONTENT_MASK, oldDataSetMessageContentMask, dataSetMessageContentMask, !oldDataSetMessageContentMaskESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.JSON_DATA_SET_READER_MESSAGE_DATA_TYPE__DATA_SET_MESSAGE_CONTENT_MASK, oldDataSetMessageContentMask, DATA_SET_MESSAGE_CONTENT_MASK_EDEFAULT, oldDataSetMessageContentMaskESet));
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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TypesPackage.JSON_DATA_SET_READER_MESSAGE_DATA_TYPE__NETWORK_MESSAGE_CONTENT_MASK:
				return getNetworkMessageContentMask();
			case TypesPackage.JSON_DATA_SET_READER_MESSAGE_DATA_TYPE__DATA_SET_MESSAGE_CONTENT_MASK:
				return getDataSetMessageContentMask();
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
			case TypesPackage.JSON_DATA_SET_READER_MESSAGE_DATA_TYPE__NETWORK_MESSAGE_CONTENT_MASK:
				setNetworkMessageContentMask((Long)newValue);
				return;
			case TypesPackage.JSON_DATA_SET_READER_MESSAGE_DATA_TYPE__DATA_SET_MESSAGE_CONTENT_MASK:
				setDataSetMessageContentMask((Long)newValue);
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
			case TypesPackage.JSON_DATA_SET_READER_MESSAGE_DATA_TYPE__NETWORK_MESSAGE_CONTENT_MASK:
				unsetNetworkMessageContentMask();
				return;
			case TypesPackage.JSON_DATA_SET_READER_MESSAGE_DATA_TYPE__DATA_SET_MESSAGE_CONTENT_MASK:
				unsetDataSetMessageContentMask();
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
			case TypesPackage.JSON_DATA_SET_READER_MESSAGE_DATA_TYPE__NETWORK_MESSAGE_CONTENT_MASK:
				return isSetNetworkMessageContentMask();
			case TypesPackage.JSON_DATA_SET_READER_MESSAGE_DATA_TYPE__DATA_SET_MESSAGE_CONTENT_MASK:
				return isSetDataSetMessageContentMask();
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
		result.append(" (networkMessageContentMask: ");
		if (networkMessageContentMaskESet) result.append(networkMessageContentMask); else result.append("<unset>");
		result.append(", dataSetMessageContentMask: ");
		if (dataSetMessageContentMaskESet) result.append(dataSetMessageContentMask); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //JsonDataSetReaderMessageDataTypeImpl
