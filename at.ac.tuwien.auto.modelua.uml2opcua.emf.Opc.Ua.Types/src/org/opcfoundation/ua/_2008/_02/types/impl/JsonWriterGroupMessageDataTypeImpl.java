/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.opcfoundation.ua._2008._02.types.JsonWriterGroupMessageDataType;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Json Writer Group Message Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.JsonWriterGroupMessageDataTypeImpl#getNetworkMessageContentMask <em>Network Message Content Mask</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JsonWriterGroupMessageDataTypeImpl extends WriterGroupMessageDataTypeImpl implements JsonWriterGroupMessageDataType {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JsonWriterGroupMessageDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getJsonWriterGroupMessageDataType();
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
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.JSON_WRITER_GROUP_MESSAGE_DATA_TYPE__NETWORK_MESSAGE_CONTENT_MASK, oldNetworkMessageContentMask, networkMessageContentMask, !oldNetworkMessageContentMaskESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.JSON_WRITER_GROUP_MESSAGE_DATA_TYPE__NETWORK_MESSAGE_CONTENT_MASK, oldNetworkMessageContentMask, NETWORK_MESSAGE_CONTENT_MASK_EDEFAULT, oldNetworkMessageContentMaskESet));
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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TypesPackage.JSON_WRITER_GROUP_MESSAGE_DATA_TYPE__NETWORK_MESSAGE_CONTENT_MASK:
				return getNetworkMessageContentMask();
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
			case TypesPackage.JSON_WRITER_GROUP_MESSAGE_DATA_TYPE__NETWORK_MESSAGE_CONTENT_MASK:
				setNetworkMessageContentMask((Long)newValue);
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
			case TypesPackage.JSON_WRITER_GROUP_MESSAGE_DATA_TYPE__NETWORK_MESSAGE_CONTENT_MASK:
				unsetNetworkMessageContentMask();
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
			case TypesPackage.JSON_WRITER_GROUP_MESSAGE_DATA_TYPE__NETWORK_MESSAGE_CONTENT_MASK:
				return isSetNetworkMessageContentMask();
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
		result.append(')');
		return result.toString();
	}

} //JsonWriterGroupMessageDataTypeImpl
