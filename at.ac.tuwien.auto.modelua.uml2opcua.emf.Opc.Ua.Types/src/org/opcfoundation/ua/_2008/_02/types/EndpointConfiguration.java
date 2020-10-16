/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Endpoint Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.EndpointConfiguration#getOperationTimeout <em>Operation Timeout</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.EndpointConfiguration#isUseBinaryEncoding <em>Use Binary Encoding</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.EndpointConfiguration#getMaxStringLength <em>Max String Length</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.EndpointConfiguration#getMaxByteStringLength <em>Max Byte String Length</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.EndpointConfiguration#getMaxArrayLength <em>Max Array Length</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.EndpointConfiguration#getMaxMessageSize <em>Max Message Size</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.EndpointConfiguration#getMaxBufferSize <em>Max Buffer Size</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.EndpointConfiguration#getChannelLifetime <em>Channel Lifetime</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.EndpointConfiguration#getSecurityTokenLifetime <em>Security Token Lifetime</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getEndpointConfiguration()
 * @model extendedMetaData="name='EndpointConfiguration' kind='elementOnly'"
 * @generated
 */
public interface EndpointConfiguration extends EObject {
	/**
	 * Returns the value of the '<em><b>Operation Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Timeout</em>' attribute.
	 * @see #isSetOperationTimeout()
	 * @see #unsetOperationTimeout()
	 * @see #setOperationTimeout(int)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getEndpointConfiguration_OperationTimeout()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='element' name='OperationTimeout' namespace='##targetNamespace'"
	 * @generated
	 */
	int getOperationTimeout();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.EndpointConfiguration#getOperationTimeout <em>Operation Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Timeout</em>' attribute.
	 * @see #isSetOperationTimeout()
	 * @see #unsetOperationTimeout()
	 * @see #getOperationTimeout()
	 * @generated
	 */
	void setOperationTimeout(int value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.EndpointConfiguration#getOperationTimeout <em>Operation Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOperationTimeout()
	 * @see #getOperationTimeout()
	 * @see #setOperationTimeout(int)
	 * @generated
	 */
	void unsetOperationTimeout();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.EndpointConfiguration#getOperationTimeout <em>Operation Timeout</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Operation Timeout</em>' attribute is set.
	 * @see #unsetOperationTimeout()
	 * @see #getOperationTimeout()
	 * @see #setOperationTimeout(int)
	 * @generated
	 */
	boolean isSetOperationTimeout();

	/**
	 * Returns the value of the '<em><b>Use Binary Encoding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Binary Encoding</em>' attribute.
	 * @see #isSetUseBinaryEncoding()
	 * @see #unsetUseBinaryEncoding()
	 * @see #setUseBinaryEncoding(boolean)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getEndpointConfiguration_UseBinaryEncoding()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='UseBinaryEncoding' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isUseBinaryEncoding();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.EndpointConfiguration#isUseBinaryEncoding <em>Use Binary Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Binary Encoding</em>' attribute.
	 * @see #isSetUseBinaryEncoding()
	 * @see #unsetUseBinaryEncoding()
	 * @see #isUseBinaryEncoding()
	 * @generated
	 */
	void setUseBinaryEncoding(boolean value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.EndpointConfiguration#isUseBinaryEncoding <em>Use Binary Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUseBinaryEncoding()
	 * @see #isUseBinaryEncoding()
	 * @see #setUseBinaryEncoding(boolean)
	 * @generated
	 */
	void unsetUseBinaryEncoding();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.EndpointConfiguration#isUseBinaryEncoding <em>Use Binary Encoding</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Use Binary Encoding</em>' attribute is set.
	 * @see #unsetUseBinaryEncoding()
	 * @see #isUseBinaryEncoding()
	 * @see #setUseBinaryEncoding(boolean)
	 * @generated
	 */
	boolean isSetUseBinaryEncoding();

	/**
	 * Returns the value of the '<em><b>Max String Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max String Length</em>' attribute.
	 * @see #isSetMaxStringLength()
	 * @see #unsetMaxStringLength()
	 * @see #setMaxStringLength(int)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getEndpointConfiguration_MaxStringLength()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='element' name='MaxStringLength' namespace='##targetNamespace'"
	 * @generated
	 */
	int getMaxStringLength();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.EndpointConfiguration#getMaxStringLength <em>Max String Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max String Length</em>' attribute.
	 * @see #isSetMaxStringLength()
	 * @see #unsetMaxStringLength()
	 * @see #getMaxStringLength()
	 * @generated
	 */
	void setMaxStringLength(int value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.EndpointConfiguration#getMaxStringLength <em>Max String Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaxStringLength()
	 * @see #getMaxStringLength()
	 * @see #setMaxStringLength(int)
	 * @generated
	 */
	void unsetMaxStringLength();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.EndpointConfiguration#getMaxStringLength <em>Max String Length</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Max String Length</em>' attribute is set.
	 * @see #unsetMaxStringLength()
	 * @see #getMaxStringLength()
	 * @see #setMaxStringLength(int)
	 * @generated
	 */
	boolean isSetMaxStringLength();

	/**
	 * Returns the value of the '<em><b>Max Byte String Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Byte String Length</em>' attribute.
	 * @see #isSetMaxByteStringLength()
	 * @see #unsetMaxByteStringLength()
	 * @see #setMaxByteStringLength(int)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getEndpointConfiguration_MaxByteStringLength()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='element' name='MaxByteStringLength' namespace='##targetNamespace'"
	 * @generated
	 */
	int getMaxByteStringLength();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.EndpointConfiguration#getMaxByteStringLength <em>Max Byte String Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Byte String Length</em>' attribute.
	 * @see #isSetMaxByteStringLength()
	 * @see #unsetMaxByteStringLength()
	 * @see #getMaxByteStringLength()
	 * @generated
	 */
	void setMaxByteStringLength(int value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.EndpointConfiguration#getMaxByteStringLength <em>Max Byte String Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaxByteStringLength()
	 * @see #getMaxByteStringLength()
	 * @see #setMaxByteStringLength(int)
	 * @generated
	 */
	void unsetMaxByteStringLength();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.EndpointConfiguration#getMaxByteStringLength <em>Max Byte String Length</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Max Byte String Length</em>' attribute is set.
	 * @see #unsetMaxByteStringLength()
	 * @see #getMaxByteStringLength()
	 * @see #setMaxByteStringLength(int)
	 * @generated
	 */
	boolean isSetMaxByteStringLength();

	/**
	 * Returns the value of the '<em><b>Max Array Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Array Length</em>' attribute.
	 * @see #isSetMaxArrayLength()
	 * @see #unsetMaxArrayLength()
	 * @see #setMaxArrayLength(int)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getEndpointConfiguration_MaxArrayLength()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='element' name='MaxArrayLength' namespace='##targetNamespace'"
	 * @generated
	 */
	int getMaxArrayLength();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.EndpointConfiguration#getMaxArrayLength <em>Max Array Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Array Length</em>' attribute.
	 * @see #isSetMaxArrayLength()
	 * @see #unsetMaxArrayLength()
	 * @see #getMaxArrayLength()
	 * @generated
	 */
	void setMaxArrayLength(int value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.EndpointConfiguration#getMaxArrayLength <em>Max Array Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaxArrayLength()
	 * @see #getMaxArrayLength()
	 * @see #setMaxArrayLength(int)
	 * @generated
	 */
	void unsetMaxArrayLength();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.EndpointConfiguration#getMaxArrayLength <em>Max Array Length</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Max Array Length</em>' attribute is set.
	 * @see #unsetMaxArrayLength()
	 * @see #getMaxArrayLength()
	 * @see #setMaxArrayLength(int)
	 * @generated
	 */
	boolean isSetMaxArrayLength();

	/**
	 * Returns the value of the '<em><b>Max Message Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Message Size</em>' attribute.
	 * @see #isSetMaxMessageSize()
	 * @see #unsetMaxMessageSize()
	 * @see #setMaxMessageSize(int)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getEndpointConfiguration_MaxMessageSize()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='element' name='MaxMessageSize' namespace='##targetNamespace'"
	 * @generated
	 */
	int getMaxMessageSize();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.EndpointConfiguration#getMaxMessageSize <em>Max Message Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Message Size</em>' attribute.
	 * @see #isSetMaxMessageSize()
	 * @see #unsetMaxMessageSize()
	 * @see #getMaxMessageSize()
	 * @generated
	 */
	void setMaxMessageSize(int value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.EndpointConfiguration#getMaxMessageSize <em>Max Message Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaxMessageSize()
	 * @see #getMaxMessageSize()
	 * @see #setMaxMessageSize(int)
	 * @generated
	 */
	void unsetMaxMessageSize();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.EndpointConfiguration#getMaxMessageSize <em>Max Message Size</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Max Message Size</em>' attribute is set.
	 * @see #unsetMaxMessageSize()
	 * @see #getMaxMessageSize()
	 * @see #setMaxMessageSize(int)
	 * @generated
	 */
	boolean isSetMaxMessageSize();

	/**
	 * Returns the value of the '<em><b>Max Buffer Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Buffer Size</em>' attribute.
	 * @see #isSetMaxBufferSize()
	 * @see #unsetMaxBufferSize()
	 * @see #setMaxBufferSize(int)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getEndpointConfiguration_MaxBufferSize()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='element' name='MaxBufferSize' namespace='##targetNamespace'"
	 * @generated
	 */
	int getMaxBufferSize();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.EndpointConfiguration#getMaxBufferSize <em>Max Buffer Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Buffer Size</em>' attribute.
	 * @see #isSetMaxBufferSize()
	 * @see #unsetMaxBufferSize()
	 * @see #getMaxBufferSize()
	 * @generated
	 */
	void setMaxBufferSize(int value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.EndpointConfiguration#getMaxBufferSize <em>Max Buffer Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaxBufferSize()
	 * @see #getMaxBufferSize()
	 * @see #setMaxBufferSize(int)
	 * @generated
	 */
	void unsetMaxBufferSize();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.EndpointConfiguration#getMaxBufferSize <em>Max Buffer Size</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Max Buffer Size</em>' attribute is set.
	 * @see #unsetMaxBufferSize()
	 * @see #getMaxBufferSize()
	 * @see #setMaxBufferSize(int)
	 * @generated
	 */
	boolean isSetMaxBufferSize();

	/**
	 * Returns the value of the '<em><b>Channel Lifetime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Channel Lifetime</em>' attribute.
	 * @see #isSetChannelLifetime()
	 * @see #unsetChannelLifetime()
	 * @see #setChannelLifetime(int)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getEndpointConfiguration_ChannelLifetime()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='element' name='ChannelLifetime' namespace='##targetNamespace'"
	 * @generated
	 */
	int getChannelLifetime();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.EndpointConfiguration#getChannelLifetime <em>Channel Lifetime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Channel Lifetime</em>' attribute.
	 * @see #isSetChannelLifetime()
	 * @see #unsetChannelLifetime()
	 * @see #getChannelLifetime()
	 * @generated
	 */
	void setChannelLifetime(int value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.EndpointConfiguration#getChannelLifetime <em>Channel Lifetime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetChannelLifetime()
	 * @see #getChannelLifetime()
	 * @see #setChannelLifetime(int)
	 * @generated
	 */
	void unsetChannelLifetime();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.EndpointConfiguration#getChannelLifetime <em>Channel Lifetime</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Channel Lifetime</em>' attribute is set.
	 * @see #unsetChannelLifetime()
	 * @see #getChannelLifetime()
	 * @see #setChannelLifetime(int)
	 * @generated
	 */
	boolean isSetChannelLifetime();

	/**
	 * Returns the value of the '<em><b>Security Token Lifetime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Token Lifetime</em>' attribute.
	 * @see #isSetSecurityTokenLifetime()
	 * @see #unsetSecurityTokenLifetime()
	 * @see #setSecurityTokenLifetime(int)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getEndpointConfiguration_SecurityTokenLifetime()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='element' name='SecurityTokenLifetime' namespace='##targetNamespace'"
	 * @generated
	 */
	int getSecurityTokenLifetime();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.EndpointConfiguration#getSecurityTokenLifetime <em>Security Token Lifetime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security Token Lifetime</em>' attribute.
	 * @see #isSetSecurityTokenLifetime()
	 * @see #unsetSecurityTokenLifetime()
	 * @see #getSecurityTokenLifetime()
	 * @generated
	 */
	void setSecurityTokenLifetime(int value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.EndpointConfiguration#getSecurityTokenLifetime <em>Security Token Lifetime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSecurityTokenLifetime()
	 * @see #getSecurityTokenLifetime()
	 * @see #setSecurityTokenLifetime(int)
	 * @generated
	 */
	void unsetSecurityTokenLifetime();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.EndpointConfiguration#getSecurityTokenLifetime <em>Security Token Lifetime</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Security Token Lifetime</em>' attribute is set.
	 * @see #unsetSecurityTokenLifetime()
	 * @see #getSecurityTokenLifetime()
	 * @see #setSecurityTokenLifetime(int)
	 * @generated
	 */
	boolean isSetSecurityTokenLifetime();

} // EndpointConfiguration
