/**
 */
package org.opcfoundation.ua._2008._02.types;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Channel Security Token</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ChannelSecurityToken#getChannelId <em>Channel Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ChannelSecurityToken#getTokenId <em>Token Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ChannelSecurityToken#getCreatedAt <em>Created At</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ChannelSecurityToken#getRevisedLifetime <em>Revised Lifetime</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getChannelSecurityToken()
 * @model extendedMetaData="name='ChannelSecurityToken' kind='elementOnly'"
 * @generated
 */
public interface ChannelSecurityToken extends EObject {
	/**
	 * Returns the value of the '<em><b>Channel Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Channel Id</em>' attribute.
	 * @see #isSetChannelId()
	 * @see #unsetChannelId()
	 * @see #setChannelId(long)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getChannelSecurityToken_ChannelId()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='element' name='ChannelId' namespace='##targetNamespace'"
	 * @generated
	 */
	long getChannelId();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.ChannelSecurityToken#getChannelId <em>Channel Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Channel Id</em>' attribute.
	 * @see #isSetChannelId()
	 * @see #unsetChannelId()
	 * @see #getChannelId()
	 * @generated
	 */
	void setChannelId(long value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.ChannelSecurityToken#getChannelId <em>Channel Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetChannelId()
	 * @see #getChannelId()
	 * @see #setChannelId(long)
	 * @generated
	 */
	void unsetChannelId();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.ChannelSecurityToken#getChannelId <em>Channel Id</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Channel Id</em>' attribute is set.
	 * @see #unsetChannelId()
	 * @see #getChannelId()
	 * @see #setChannelId(long)
	 * @generated
	 */
	boolean isSetChannelId();

	/**
	 * Returns the value of the '<em><b>Token Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Token Id</em>' attribute.
	 * @see #isSetTokenId()
	 * @see #unsetTokenId()
	 * @see #setTokenId(long)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getChannelSecurityToken_TokenId()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='element' name='TokenId' namespace='##targetNamespace'"
	 * @generated
	 */
	long getTokenId();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.ChannelSecurityToken#getTokenId <em>Token Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Token Id</em>' attribute.
	 * @see #isSetTokenId()
	 * @see #unsetTokenId()
	 * @see #getTokenId()
	 * @generated
	 */
	void setTokenId(long value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.ChannelSecurityToken#getTokenId <em>Token Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTokenId()
	 * @see #getTokenId()
	 * @see #setTokenId(long)
	 * @generated
	 */
	void unsetTokenId();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.ChannelSecurityToken#getTokenId <em>Token Id</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Token Id</em>' attribute is set.
	 * @see #unsetTokenId()
	 * @see #getTokenId()
	 * @see #setTokenId(long)
	 * @generated
	 */
	boolean isSetTokenId();

	/**
	 * Returns the value of the '<em><b>Created At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created At</em>' attribute.
	 * @see #setCreatedAt(XMLGregorianCalendar)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getChannelSecurityToken_CreatedAt()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='CreatedAt' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getCreatedAt();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.ChannelSecurityToken#getCreatedAt <em>Created At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created At</em>' attribute.
	 * @see #getCreatedAt()
	 * @generated
	 */
	void setCreatedAt(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Revised Lifetime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Revised Lifetime</em>' attribute.
	 * @see #isSetRevisedLifetime()
	 * @see #unsetRevisedLifetime()
	 * @see #setRevisedLifetime(long)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getChannelSecurityToken_RevisedLifetime()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='element' name='RevisedLifetime' namespace='##targetNamespace'"
	 * @generated
	 */
	long getRevisedLifetime();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.ChannelSecurityToken#getRevisedLifetime <em>Revised Lifetime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Revised Lifetime</em>' attribute.
	 * @see #isSetRevisedLifetime()
	 * @see #unsetRevisedLifetime()
	 * @see #getRevisedLifetime()
	 * @generated
	 */
	void setRevisedLifetime(long value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.ChannelSecurityToken#getRevisedLifetime <em>Revised Lifetime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRevisedLifetime()
	 * @see #getRevisedLifetime()
	 * @see #setRevisedLifetime(long)
	 * @generated
	 */
	void unsetRevisedLifetime();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.ChannelSecurityToken#getRevisedLifetime <em>Revised Lifetime</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Revised Lifetime</em>' attribute is set.
	 * @see #unsetRevisedLifetime()
	 * @see #getRevisedLifetime()
	 * @see #setRevisedLifetime(long)
	 * @generated
	 */
	boolean isSetRevisedLifetime();

} // ChannelSecurityToken
