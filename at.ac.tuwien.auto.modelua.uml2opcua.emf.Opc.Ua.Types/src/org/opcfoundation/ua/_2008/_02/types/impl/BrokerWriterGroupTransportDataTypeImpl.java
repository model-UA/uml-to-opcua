/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.opcfoundation.ua._2008._02.types.BrokerTransportQualityOfService;
import org.opcfoundation.ua._2008._02.types.BrokerWriterGroupTransportDataType;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Broker Writer Group Transport Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.BrokerWriterGroupTransportDataTypeImpl#getQueueName <em>Queue Name</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.BrokerWriterGroupTransportDataTypeImpl#getResourceUri <em>Resource Uri</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.BrokerWriterGroupTransportDataTypeImpl#getAuthenticationProfileUri <em>Authentication Profile Uri</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.BrokerWriterGroupTransportDataTypeImpl#getRequestedDeliveryGuarantee <em>Requested Delivery Guarantee</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BrokerWriterGroupTransportDataTypeImpl extends WriterGroupTransportDataTypeImpl implements BrokerWriterGroupTransportDataType {
	/**
	 * The default value of the '{@link #getQueueName() <em>Queue Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueueName()
	 * @generated
	 * @ordered
	 */
	protected static final String QUEUE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQueueName() <em>Queue Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueueName()
	 * @generated
	 * @ordered
	 */
	protected String queueName = QUEUE_NAME_EDEFAULT;

	/**
	 * This is true if the Queue Name attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean queueNameESet;

	/**
	 * The default value of the '{@link #getResourceUri() <em>Resource Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceUri()
	 * @generated
	 * @ordered
	 */
	protected static final String RESOURCE_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResourceUri() <em>Resource Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceUri()
	 * @generated
	 * @ordered
	 */
	protected String resourceUri = RESOURCE_URI_EDEFAULT;

	/**
	 * This is true if the Resource Uri attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean resourceUriESet;

	/**
	 * The default value of the '{@link #getAuthenticationProfileUri() <em>Authentication Profile Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthenticationProfileUri()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTHENTICATION_PROFILE_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuthenticationProfileUri() <em>Authentication Profile Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthenticationProfileUri()
	 * @generated
	 * @ordered
	 */
	protected String authenticationProfileUri = AUTHENTICATION_PROFILE_URI_EDEFAULT;

	/**
	 * This is true if the Authentication Profile Uri attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean authenticationProfileUriESet;

	/**
	 * The default value of the '{@link #getRequestedDeliveryGuarantee() <em>Requested Delivery Guarantee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestedDeliveryGuarantee()
	 * @generated
	 * @ordered
	 */
	protected static final BrokerTransportQualityOfService REQUESTED_DELIVERY_GUARANTEE_EDEFAULT = BrokerTransportQualityOfService.NOT_SPECIFIED0;

	/**
	 * The cached value of the '{@link #getRequestedDeliveryGuarantee() <em>Requested Delivery Guarantee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestedDeliveryGuarantee()
	 * @generated
	 * @ordered
	 */
	protected BrokerTransportQualityOfService requestedDeliveryGuarantee = REQUESTED_DELIVERY_GUARANTEE_EDEFAULT;

	/**
	 * This is true if the Requested Delivery Guarantee attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean requestedDeliveryGuaranteeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BrokerWriterGroupTransportDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getBrokerWriterGroupTransportDataType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQueueName() {
		return queueName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQueueName(String newQueueName) {
		String oldQueueName = queueName;
		queueName = newQueueName;
		boolean oldQueueNameESet = queueNameESet;
		queueNameESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.BROKER_WRITER_GROUP_TRANSPORT_DATA_TYPE__QUEUE_NAME, oldQueueName, queueName, !oldQueueNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetQueueName() {
		String oldQueueName = queueName;
		boolean oldQueueNameESet = queueNameESet;
		queueName = QUEUE_NAME_EDEFAULT;
		queueNameESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.BROKER_WRITER_GROUP_TRANSPORT_DATA_TYPE__QUEUE_NAME, oldQueueName, QUEUE_NAME_EDEFAULT, oldQueueNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetQueueName() {
		return queueNameESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResourceUri() {
		return resourceUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourceUri(String newResourceUri) {
		String oldResourceUri = resourceUri;
		resourceUri = newResourceUri;
		boolean oldResourceUriESet = resourceUriESet;
		resourceUriESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.BROKER_WRITER_GROUP_TRANSPORT_DATA_TYPE__RESOURCE_URI, oldResourceUri, resourceUri, !oldResourceUriESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetResourceUri() {
		String oldResourceUri = resourceUri;
		boolean oldResourceUriESet = resourceUriESet;
		resourceUri = RESOURCE_URI_EDEFAULT;
		resourceUriESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.BROKER_WRITER_GROUP_TRANSPORT_DATA_TYPE__RESOURCE_URI, oldResourceUri, RESOURCE_URI_EDEFAULT, oldResourceUriESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetResourceUri() {
		return resourceUriESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAuthenticationProfileUri() {
		return authenticationProfileUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthenticationProfileUri(String newAuthenticationProfileUri) {
		String oldAuthenticationProfileUri = authenticationProfileUri;
		authenticationProfileUri = newAuthenticationProfileUri;
		boolean oldAuthenticationProfileUriESet = authenticationProfileUriESet;
		authenticationProfileUriESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.BROKER_WRITER_GROUP_TRANSPORT_DATA_TYPE__AUTHENTICATION_PROFILE_URI, oldAuthenticationProfileUri, authenticationProfileUri, !oldAuthenticationProfileUriESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAuthenticationProfileUri() {
		String oldAuthenticationProfileUri = authenticationProfileUri;
		boolean oldAuthenticationProfileUriESet = authenticationProfileUriESet;
		authenticationProfileUri = AUTHENTICATION_PROFILE_URI_EDEFAULT;
		authenticationProfileUriESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.BROKER_WRITER_GROUP_TRANSPORT_DATA_TYPE__AUTHENTICATION_PROFILE_URI, oldAuthenticationProfileUri, AUTHENTICATION_PROFILE_URI_EDEFAULT, oldAuthenticationProfileUriESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAuthenticationProfileUri() {
		return authenticationProfileUriESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BrokerTransportQualityOfService getRequestedDeliveryGuarantee() {
		return requestedDeliveryGuarantee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequestedDeliveryGuarantee(BrokerTransportQualityOfService newRequestedDeliveryGuarantee) {
		BrokerTransportQualityOfService oldRequestedDeliveryGuarantee = requestedDeliveryGuarantee;
		requestedDeliveryGuarantee = newRequestedDeliveryGuarantee == null ? REQUESTED_DELIVERY_GUARANTEE_EDEFAULT : newRequestedDeliveryGuarantee;
		boolean oldRequestedDeliveryGuaranteeESet = requestedDeliveryGuaranteeESet;
		requestedDeliveryGuaranteeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.BROKER_WRITER_GROUP_TRANSPORT_DATA_TYPE__REQUESTED_DELIVERY_GUARANTEE, oldRequestedDeliveryGuarantee, requestedDeliveryGuarantee, !oldRequestedDeliveryGuaranteeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRequestedDeliveryGuarantee() {
		BrokerTransportQualityOfService oldRequestedDeliveryGuarantee = requestedDeliveryGuarantee;
		boolean oldRequestedDeliveryGuaranteeESet = requestedDeliveryGuaranteeESet;
		requestedDeliveryGuarantee = REQUESTED_DELIVERY_GUARANTEE_EDEFAULT;
		requestedDeliveryGuaranteeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.BROKER_WRITER_GROUP_TRANSPORT_DATA_TYPE__REQUESTED_DELIVERY_GUARANTEE, oldRequestedDeliveryGuarantee, REQUESTED_DELIVERY_GUARANTEE_EDEFAULT, oldRequestedDeliveryGuaranteeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRequestedDeliveryGuarantee() {
		return requestedDeliveryGuaranteeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TypesPackage.BROKER_WRITER_GROUP_TRANSPORT_DATA_TYPE__QUEUE_NAME:
				return getQueueName();
			case TypesPackage.BROKER_WRITER_GROUP_TRANSPORT_DATA_TYPE__RESOURCE_URI:
				return getResourceUri();
			case TypesPackage.BROKER_WRITER_GROUP_TRANSPORT_DATA_TYPE__AUTHENTICATION_PROFILE_URI:
				return getAuthenticationProfileUri();
			case TypesPackage.BROKER_WRITER_GROUP_TRANSPORT_DATA_TYPE__REQUESTED_DELIVERY_GUARANTEE:
				return getRequestedDeliveryGuarantee();
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
			case TypesPackage.BROKER_WRITER_GROUP_TRANSPORT_DATA_TYPE__QUEUE_NAME:
				setQueueName((String)newValue);
				return;
			case TypesPackage.BROKER_WRITER_GROUP_TRANSPORT_DATA_TYPE__RESOURCE_URI:
				setResourceUri((String)newValue);
				return;
			case TypesPackage.BROKER_WRITER_GROUP_TRANSPORT_DATA_TYPE__AUTHENTICATION_PROFILE_URI:
				setAuthenticationProfileUri((String)newValue);
				return;
			case TypesPackage.BROKER_WRITER_GROUP_TRANSPORT_DATA_TYPE__REQUESTED_DELIVERY_GUARANTEE:
				setRequestedDeliveryGuarantee((BrokerTransportQualityOfService)newValue);
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
			case TypesPackage.BROKER_WRITER_GROUP_TRANSPORT_DATA_TYPE__QUEUE_NAME:
				unsetQueueName();
				return;
			case TypesPackage.BROKER_WRITER_GROUP_TRANSPORT_DATA_TYPE__RESOURCE_URI:
				unsetResourceUri();
				return;
			case TypesPackage.BROKER_WRITER_GROUP_TRANSPORT_DATA_TYPE__AUTHENTICATION_PROFILE_URI:
				unsetAuthenticationProfileUri();
				return;
			case TypesPackage.BROKER_WRITER_GROUP_TRANSPORT_DATA_TYPE__REQUESTED_DELIVERY_GUARANTEE:
				unsetRequestedDeliveryGuarantee();
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
			case TypesPackage.BROKER_WRITER_GROUP_TRANSPORT_DATA_TYPE__QUEUE_NAME:
				return isSetQueueName();
			case TypesPackage.BROKER_WRITER_GROUP_TRANSPORT_DATA_TYPE__RESOURCE_URI:
				return isSetResourceUri();
			case TypesPackage.BROKER_WRITER_GROUP_TRANSPORT_DATA_TYPE__AUTHENTICATION_PROFILE_URI:
				return isSetAuthenticationProfileUri();
			case TypesPackage.BROKER_WRITER_GROUP_TRANSPORT_DATA_TYPE__REQUESTED_DELIVERY_GUARANTEE:
				return isSetRequestedDeliveryGuarantee();
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
		result.append(" (queueName: ");
		if (queueNameESet) result.append(queueName); else result.append("<unset>");
		result.append(", resourceUri: ");
		if (resourceUriESet) result.append(resourceUri); else result.append("<unset>");
		result.append(", authenticationProfileUri: ");
		if (authenticationProfileUriESet) result.append(authenticationProfileUri); else result.append("<unset>");
		result.append(", requestedDeliveryGuarantee: ");
		if (requestedDeliveryGuaranteeESet) result.append(requestedDeliveryGuarantee); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //BrokerWriterGroupTransportDataTypeImpl
