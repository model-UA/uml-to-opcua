/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.opcfoundation.ua._2008._02.types.EndpointConfiguration;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Endpoint Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.EndpointConfigurationImpl#getOperationTimeout <em>Operation Timeout</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.EndpointConfigurationImpl#isUseBinaryEncoding <em>Use Binary Encoding</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.EndpointConfigurationImpl#getMaxStringLength <em>Max String Length</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.EndpointConfigurationImpl#getMaxByteStringLength <em>Max Byte String Length</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.EndpointConfigurationImpl#getMaxArrayLength <em>Max Array Length</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.EndpointConfigurationImpl#getMaxMessageSize <em>Max Message Size</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.EndpointConfigurationImpl#getMaxBufferSize <em>Max Buffer Size</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.EndpointConfigurationImpl#getChannelLifetime <em>Channel Lifetime</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.EndpointConfigurationImpl#getSecurityTokenLifetime <em>Security Token Lifetime</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EndpointConfigurationImpl extends MinimalEObjectImpl.Container implements EndpointConfiguration {
	/**
	 * The default value of the '{@link #getOperationTimeout() <em>Operation Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationTimeout()
	 * @generated
	 * @ordered
	 */
	protected static final int OPERATION_TIMEOUT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getOperationTimeout() <em>Operation Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationTimeout()
	 * @generated
	 * @ordered
	 */
	protected int operationTimeout = OPERATION_TIMEOUT_EDEFAULT;

	/**
	 * This is true if the Operation Timeout attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean operationTimeoutESet;

	/**
	 * The default value of the '{@link #isUseBinaryEncoding() <em>Use Binary Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseBinaryEncoding()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USE_BINARY_ENCODING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUseBinaryEncoding() <em>Use Binary Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseBinaryEncoding()
	 * @generated
	 * @ordered
	 */
	protected boolean useBinaryEncoding = USE_BINARY_ENCODING_EDEFAULT;

	/**
	 * This is true if the Use Binary Encoding attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean useBinaryEncodingESet;

	/**
	 * The default value of the '{@link #getMaxStringLength() <em>Max String Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxStringLength()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_STRING_LENGTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxStringLength() <em>Max String Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxStringLength()
	 * @generated
	 * @ordered
	 */
	protected int maxStringLength = MAX_STRING_LENGTH_EDEFAULT;

	/**
	 * This is true if the Max String Length attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maxStringLengthESet;

	/**
	 * The default value of the '{@link #getMaxByteStringLength() <em>Max Byte String Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxByteStringLength()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_BYTE_STRING_LENGTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxByteStringLength() <em>Max Byte String Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxByteStringLength()
	 * @generated
	 * @ordered
	 */
	protected int maxByteStringLength = MAX_BYTE_STRING_LENGTH_EDEFAULT;

	/**
	 * This is true if the Max Byte String Length attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maxByteStringLengthESet;

	/**
	 * The default value of the '{@link #getMaxArrayLength() <em>Max Array Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxArrayLength()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_ARRAY_LENGTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxArrayLength() <em>Max Array Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxArrayLength()
	 * @generated
	 * @ordered
	 */
	protected int maxArrayLength = MAX_ARRAY_LENGTH_EDEFAULT;

	/**
	 * This is true if the Max Array Length attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maxArrayLengthESet;

	/**
	 * The default value of the '{@link #getMaxMessageSize() <em>Max Message Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxMessageSize()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_MESSAGE_SIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxMessageSize() <em>Max Message Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxMessageSize()
	 * @generated
	 * @ordered
	 */
	protected int maxMessageSize = MAX_MESSAGE_SIZE_EDEFAULT;

	/**
	 * This is true if the Max Message Size attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maxMessageSizeESet;

	/**
	 * The default value of the '{@link #getMaxBufferSize() <em>Max Buffer Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxBufferSize()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_BUFFER_SIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxBufferSize() <em>Max Buffer Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxBufferSize()
	 * @generated
	 * @ordered
	 */
	protected int maxBufferSize = MAX_BUFFER_SIZE_EDEFAULT;

	/**
	 * This is true if the Max Buffer Size attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maxBufferSizeESet;

	/**
	 * The default value of the '{@link #getChannelLifetime() <em>Channel Lifetime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChannelLifetime()
	 * @generated
	 * @ordered
	 */
	protected static final int CHANNEL_LIFETIME_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getChannelLifetime() <em>Channel Lifetime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChannelLifetime()
	 * @generated
	 * @ordered
	 */
	protected int channelLifetime = CHANNEL_LIFETIME_EDEFAULT;

	/**
	 * This is true if the Channel Lifetime attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean channelLifetimeESet;

	/**
	 * The default value of the '{@link #getSecurityTokenLifetime() <em>Security Token Lifetime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityTokenLifetime()
	 * @generated
	 * @ordered
	 */
	protected static final int SECURITY_TOKEN_LIFETIME_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSecurityTokenLifetime() <em>Security Token Lifetime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityTokenLifetime()
	 * @generated
	 * @ordered
	 */
	protected int securityTokenLifetime = SECURITY_TOKEN_LIFETIME_EDEFAULT;

	/**
	 * This is true if the Security Token Lifetime attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean securityTokenLifetimeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EndpointConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getEndpointConfiguration();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getOperationTimeout() {
		return operationTimeout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperationTimeout(int newOperationTimeout) {
		int oldOperationTimeout = operationTimeout;
		operationTimeout = newOperationTimeout;
		boolean oldOperationTimeoutESet = operationTimeoutESet;
		operationTimeoutESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.ENDPOINT_CONFIGURATION__OPERATION_TIMEOUT, oldOperationTimeout, operationTimeout, !oldOperationTimeoutESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetOperationTimeout() {
		int oldOperationTimeout = operationTimeout;
		boolean oldOperationTimeoutESet = operationTimeoutESet;
		operationTimeout = OPERATION_TIMEOUT_EDEFAULT;
		operationTimeoutESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.ENDPOINT_CONFIGURATION__OPERATION_TIMEOUT, oldOperationTimeout, OPERATION_TIMEOUT_EDEFAULT, oldOperationTimeoutESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOperationTimeout() {
		return operationTimeoutESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUseBinaryEncoding() {
		return useBinaryEncoding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUseBinaryEncoding(boolean newUseBinaryEncoding) {
		boolean oldUseBinaryEncoding = useBinaryEncoding;
		useBinaryEncoding = newUseBinaryEncoding;
		boolean oldUseBinaryEncodingESet = useBinaryEncodingESet;
		useBinaryEncodingESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.ENDPOINT_CONFIGURATION__USE_BINARY_ENCODING, oldUseBinaryEncoding, useBinaryEncoding, !oldUseBinaryEncodingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUseBinaryEncoding() {
		boolean oldUseBinaryEncoding = useBinaryEncoding;
		boolean oldUseBinaryEncodingESet = useBinaryEncodingESet;
		useBinaryEncoding = USE_BINARY_ENCODING_EDEFAULT;
		useBinaryEncodingESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.ENDPOINT_CONFIGURATION__USE_BINARY_ENCODING, oldUseBinaryEncoding, USE_BINARY_ENCODING_EDEFAULT, oldUseBinaryEncodingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUseBinaryEncoding() {
		return useBinaryEncodingESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxStringLength() {
		return maxStringLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxStringLength(int newMaxStringLength) {
		int oldMaxStringLength = maxStringLength;
		maxStringLength = newMaxStringLength;
		boolean oldMaxStringLengthESet = maxStringLengthESet;
		maxStringLengthESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.ENDPOINT_CONFIGURATION__MAX_STRING_LENGTH, oldMaxStringLength, maxStringLength, !oldMaxStringLengthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMaxStringLength() {
		int oldMaxStringLength = maxStringLength;
		boolean oldMaxStringLengthESet = maxStringLengthESet;
		maxStringLength = MAX_STRING_LENGTH_EDEFAULT;
		maxStringLengthESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.ENDPOINT_CONFIGURATION__MAX_STRING_LENGTH, oldMaxStringLength, MAX_STRING_LENGTH_EDEFAULT, oldMaxStringLengthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMaxStringLength() {
		return maxStringLengthESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxByteStringLength() {
		return maxByteStringLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxByteStringLength(int newMaxByteStringLength) {
		int oldMaxByteStringLength = maxByteStringLength;
		maxByteStringLength = newMaxByteStringLength;
		boolean oldMaxByteStringLengthESet = maxByteStringLengthESet;
		maxByteStringLengthESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.ENDPOINT_CONFIGURATION__MAX_BYTE_STRING_LENGTH, oldMaxByteStringLength, maxByteStringLength, !oldMaxByteStringLengthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMaxByteStringLength() {
		int oldMaxByteStringLength = maxByteStringLength;
		boolean oldMaxByteStringLengthESet = maxByteStringLengthESet;
		maxByteStringLength = MAX_BYTE_STRING_LENGTH_EDEFAULT;
		maxByteStringLengthESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.ENDPOINT_CONFIGURATION__MAX_BYTE_STRING_LENGTH, oldMaxByteStringLength, MAX_BYTE_STRING_LENGTH_EDEFAULT, oldMaxByteStringLengthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMaxByteStringLength() {
		return maxByteStringLengthESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxArrayLength() {
		return maxArrayLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxArrayLength(int newMaxArrayLength) {
		int oldMaxArrayLength = maxArrayLength;
		maxArrayLength = newMaxArrayLength;
		boolean oldMaxArrayLengthESet = maxArrayLengthESet;
		maxArrayLengthESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.ENDPOINT_CONFIGURATION__MAX_ARRAY_LENGTH, oldMaxArrayLength, maxArrayLength, !oldMaxArrayLengthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMaxArrayLength() {
		int oldMaxArrayLength = maxArrayLength;
		boolean oldMaxArrayLengthESet = maxArrayLengthESet;
		maxArrayLength = MAX_ARRAY_LENGTH_EDEFAULT;
		maxArrayLengthESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.ENDPOINT_CONFIGURATION__MAX_ARRAY_LENGTH, oldMaxArrayLength, MAX_ARRAY_LENGTH_EDEFAULT, oldMaxArrayLengthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMaxArrayLength() {
		return maxArrayLengthESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxMessageSize() {
		return maxMessageSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxMessageSize(int newMaxMessageSize) {
		int oldMaxMessageSize = maxMessageSize;
		maxMessageSize = newMaxMessageSize;
		boolean oldMaxMessageSizeESet = maxMessageSizeESet;
		maxMessageSizeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.ENDPOINT_CONFIGURATION__MAX_MESSAGE_SIZE, oldMaxMessageSize, maxMessageSize, !oldMaxMessageSizeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMaxMessageSize() {
		int oldMaxMessageSize = maxMessageSize;
		boolean oldMaxMessageSizeESet = maxMessageSizeESet;
		maxMessageSize = MAX_MESSAGE_SIZE_EDEFAULT;
		maxMessageSizeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.ENDPOINT_CONFIGURATION__MAX_MESSAGE_SIZE, oldMaxMessageSize, MAX_MESSAGE_SIZE_EDEFAULT, oldMaxMessageSizeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMaxMessageSize() {
		return maxMessageSizeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxBufferSize() {
		return maxBufferSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxBufferSize(int newMaxBufferSize) {
		int oldMaxBufferSize = maxBufferSize;
		maxBufferSize = newMaxBufferSize;
		boolean oldMaxBufferSizeESet = maxBufferSizeESet;
		maxBufferSizeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.ENDPOINT_CONFIGURATION__MAX_BUFFER_SIZE, oldMaxBufferSize, maxBufferSize, !oldMaxBufferSizeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMaxBufferSize() {
		int oldMaxBufferSize = maxBufferSize;
		boolean oldMaxBufferSizeESet = maxBufferSizeESet;
		maxBufferSize = MAX_BUFFER_SIZE_EDEFAULT;
		maxBufferSizeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.ENDPOINT_CONFIGURATION__MAX_BUFFER_SIZE, oldMaxBufferSize, MAX_BUFFER_SIZE_EDEFAULT, oldMaxBufferSizeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMaxBufferSize() {
		return maxBufferSizeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getChannelLifetime() {
		return channelLifetime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChannelLifetime(int newChannelLifetime) {
		int oldChannelLifetime = channelLifetime;
		channelLifetime = newChannelLifetime;
		boolean oldChannelLifetimeESet = channelLifetimeESet;
		channelLifetimeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.ENDPOINT_CONFIGURATION__CHANNEL_LIFETIME, oldChannelLifetime, channelLifetime, !oldChannelLifetimeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetChannelLifetime() {
		int oldChannelLifetime = channelLifetime;
		boolean oldChannelLifetimeESet = channelLifetimeESet;
		channelLifetime = CHANNEL_LIFETIME_EDEFAULT;
		channelLifetimeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.ENDPOINT_CONFIGURATION__CHANNEL_LIFETIME, oldChannelLifetime, CHANNEL_LIFETIME_EDEFAULT, oldChannelLifetimeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetChannelLifetime() {
		return channelLifetimeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSecurityTokenLifetime() {
		return securityTokenLifetime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecurityTokenLifetime(int newSecurityTokenLifetime) {
		int oldSecurityTokenLifetime = securityTokenLifetime;
		securityTokenLifetime = newSecurityTokenLifetime;
		boolean oldSecurityTokenLifetimeESet = securityTokenLifetimeESet;
		securityTokenLifetimeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.ENDPOINT_CONFIGURATION__SECURITY_TOKEN_LIFETIME, oldSecurityTokenLifetime, securityTokenLifetime, !oldSecurityTokenLifetimeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSecurityTokenLifetime() {
		int oldSecurityTokenLifetime = securityTokenLifetime;
		boolean oldSecurityTokenLifetimeESet = securityTokenLifetimeESet;
		securityTokenLifetime = SECURITY_TOKEN_LIFETIME_EDEFAULT;
		securityTokenLifetimeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.ENDPOINT_CONFIGURATION__SECURITY_TOKEN_LIFETIME, oldSecurityTokenLifetime, SECURITY_TOKEN_LIFETIME_EDEFAULT, oldSecurityTokenLifetimeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSecurityTokenLifetime() {
		return securityTokenLifetimeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TypesPackage.ENDPOINT_CONFIGURATION__OPERATION_TIMEOUT:
				return getOperationTimeout();
			case TypesPackage.ENDPOINT_CONFIGURATION__USE_BINARY_ENCODING:
				return isUseBinaryEncoding();
			case TypesPackage.ENDPOINT_CONFIGURATION__MAX_STRING_LENGTH:
				return getMaxStringLength();
			case TypesPackage.ENDPOINT_CONFIGURATION__MAX_BYTE_STRING_LENGTH:
				return getMaxByteStringLength();
			case TypesPackage.ENDPOINT_CONFIGURATION__MAX_ARRAY_LENGTH:
				return getMaxArrayLength();
			case TypesPackage.ENDPOINT_CONFIGURATION__MAX_MESSAGE_SIZE:
				return getMaxMessageSize();
			case TypesPackage.ENDPOINT_CONFIGURATION__MAX_BUFFER_SIZE:
				return getMaxBufferSize();
			case TypesPackage.ENDPOINT_CONFIGURATION__CHANNEL_LIFETIME:
				return getChannelLifetime();
			case TypesPackage.ENDPOINT_CONFIGURATION__SECURITY_TOKEN_LIFETIME:
				return getSecurityTokenLifetime();
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
			case TypesPackage.ENDPOINT_CONFIGURATION__OPERATION_TIMEOUT:
				setOperationTimeout((Integer)newValue);
				return;
			case TypesPackage.ENDPOINT_CONFIGURATION__USE_BINARY_ENCODING:
				setUseBinaryEncoding((Boolean)newValue);
				return;
			case TypesPackage.ENDPOINT_CONFIGURATION__MAX_STRING_LENGTH:
				setMaxStringLength((Integer)newValue);
				return;
			case TypesPackage.ENDPOINT_CONFIGURATION__MAX_BYTE_STRING_LENGTH:
				setMaxByteStringLength((Integer)newValue);
				return;
			case TypesPackage.ENDPOINT_CONFIGURATION__MAX_ARRAY_LENGTH:
				setMaxArrayLength((Integer)newValue);
				return;
			case TypesPackage.ENDPOINT_CONFIGURATION__MAX_MESSAGE_SIZE:
				setMaxMessageSize((Integer)newValue);
				return;
			case TypesPackage.ENDPOINT_CONFIGURATION__MAX_BUFFER_SIZE:
				setMaxBufferSize((Integer)newValue);
				return;
			case TypesPackage.ENDPOINT_CONFIGURATION__CHANNEL_LIFETIME:
				setChannelLifetime((Integer)newValue);
				return;
			case TypesPackage.ENDPOINT_CONFIGURATION__SECURITY_TOKEN_LIFETIME:
				setSecurityTokenLifetime((Integer)newValue);
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
			case TypesPackage.ENDPOINT_CONFIGURATION__OPERATION_TIMEOUT:
				unsetOperationTimeout();
				return;
			case TypesPackage.ENDPOINT_CONFIGURATION__USE_BINARY_ENCODING:
				unsetUseBinaryEncoding();
				return;
			case TypesPackage.ENDPOINT_CONFIGURATION__MAX_STRING_LENGTH:
				unsetMaxStringLength();
				return;
			case TypesPackage.ENDPOINT_CONFIGURATION__MAX_BYTE_STRING_LENGTH:
				unsetMaxByteStringLength();
				return;
			case TypesPackage.ENDPOINT_CONFIGURATION__MAX_ARRAY_LENGTH:
				unsetMaxArrayLength();
				return;
			case TypesPackage.ENDPOINT_CONFIGURATION__MAX_MESSAGE_SIZE:
				unsetMaxMessageSize();
				return;
			case TypesPackage.ENDPOINT_CONFIGURATION__MAX_BUFFER_SIZE:
				unsetMaxBufferSize();
				return;
			case TypesPackage.ENDPOINT_CONFIGURATION__CHANNEL_LIFETIME:
				unsetChannelLifetime();
				return;
			case TypesPackage.ENDPOINT_CONFIGURATION__SECURITY_TOKEN_LIFETIME:
				unsetSecurityTokenLifetime();
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
			case TypesPackage.ENDPOINT_CONFIGURATION__OPERATION_TIMEOUT:
				return isSetOperationTimeout();
			case TypesPackage.ENDPOINT_CONFIGURATION__USE_BINARY_ENCODING:
				return isSetUseBinaryEncoding();
			case TypesPackage.ENDPOINT_CONFIGURATION__MAX_STRING_LENGTH:
				return isSetMaxStringLength();
			case TypesPackage.ENDPOINT_CONFIGURATION__MAX_BYTE_STRING_LENGTH:
				return isSetMaxByteStringLength();
			case TypesPackage.ENDPOINT_CONFIGURATION__MAX_ARRAY_LENGTH:
				return isSetMaxArrayLength();
			case TypesPackage.ENDPOINT_CONFIGURATION__MAX_MESSAGE_SIZE:
				return isSetMaxMessageSize();
			case TypesPackage.ENDPOINT_CONFIGURATION__MAX_BUFFER_SIZE:
				return isSetMaxBufferSize();
			case TypesPackage.ENDPOINT_CONFIGURATION__CHANNEL_LIFETIME:
				return isSetChannelLifetime();
			case TypesPackage.ENDPOINT_CONFIGURATION__SECURITY_TOKEN_LIFETIME:
				return isSetSecurityTokenLifetime();
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
		result.append(" (operationTimeout: ");
		if (operationTimeoutESet) result.append(operationTimeout); else result.append("<unset>");
		result.append(", useBinaryEncoding: ");
		if (useBinaryEncodingESet) result.append(useBinaryEncoding); else result.append("<unset>");
		result.append(", maxStringLength: ");
		if (maxStringLengthESet) result.append(maxStringLength); else result.append("<unset>");
		result.append(", maxByteStringLength: ");
		if (maxByteStringLengthESet) result.append(maxByteStringLength); else result.append("<unset>");
		result.append(", maxArrayLength: ");
		if (maxArrayLengthESet) result.append(maxArrayLength); else result.append("<unset>");
		result.append(", maxMessageSize: ");
		if (maxMessageSizeESet) result.append(maxMessageSize); else result.append("<unset>");
		result.append(", maxBufferSize: ");
		if (maxBufferSizeESet) result.append(maxBufferSize); else result.append("<unset>");
		result.append(", channelLifetime: ");
		if (channelLifetimeESet) result.append(channelLifetime); else result.append("<unset>");
		result.append(", securityTokenLifetime: ");
		if (securityTokenLifetimeESet) result.append(securityTokenLifetime); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //EndpointConfigurationImpl
