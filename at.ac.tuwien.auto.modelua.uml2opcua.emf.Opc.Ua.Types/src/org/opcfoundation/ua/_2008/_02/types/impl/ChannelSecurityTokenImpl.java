/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.opcfoundation.ua._2008._02.types.ChannelSecurityToken;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Channel Security Token</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ChannelSecurityTokenImpl#getChannelId <em>Channel Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ChannelSecurityTokenImpl#getTokenId <em>Token Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ChannelSecurityTokenImpl#getCreatedAt <em>Created At</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ChannelSecurityTokenImpl#getRevisedLifetime <em>Revised Lifetime</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChannelSecurityTokenImpl extends MinimalEObjectImpl.Container implements ChannelSecurityToken {
	/**
	 * The default value of the '{@link #getChannelId() <em>Channel Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChannelId()
	 * @generated
	 * @ordered
	 */
	protected static final long CHANNEL_ID_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getChannelId() <em>Channel Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChannelId()
	 * @generated
	 * @ordered
	 */
	protected long channelId = CHANNEL_ID_EDEFAULT;

	/**
	 * This is true if the Channel Id attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean channelIdESet;

	/**
	 * The default value of the '{@link #getTokenId() <em>Token Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTokenId()
	 * @generated
	 * @ordered
	 */
	protected static final long TOKEN_ID_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getTokenId() <em>Token Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTokenId()
	 * @generated
	 * @ordered
	 */
	protected long tokenId = TOKEN_ID_EDEFAULT;

	/**
	 * This is true if the Token Id attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean tokenIdESet;

	/**
	 * The default value of the '{@link #getCreatedAt() <em>Created At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedAt()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar CREATED_AT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreatedAt() <em>Created At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedAt()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar createdAt = CREATED_AT_EDEFAULT;

	/**
	 * The default value of the '{@link #getRevisedLifetime() <em>Revised Lifetime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevisedLifetime()
	 * @generated
	 * @ordered
	 */
	protected static final long REVISED_LIFETIME_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getRevisedLifetime() <em>Revised Lifetime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevisedLifetime()
	 * @generated
	 * @ordered
	 */
	protected long revisedLifetime = REVISED_LIFETIME_EDEFAULT;

	/**
	 * This is true if the Revised Lifetime attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean revisedLifetimeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChannelSecurityTokenImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getChannelSecurityToken();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getChannelId() {
		return channelId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChannelId(long newChannelId) {
		long oldChannelId = channelId;
		channelId = newChannelId;
		boolean oldChannelIdESet = channelIdESet;
		channelIdESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.CHANNEL_SECURITY_TOKEN__CHANNEL_ID, oldChannelId, channelId, !oldChannelIdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetChannelId() {
		long oldChannelId = channelId;
		boolean oldChannelIdESet = channelIdESet;
		channelId = CHANNEL_ID_EDEFAULT;
		channelIdESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.CHANNEL_SECURITY_TOKEN__CHANNEL_ID, oldChannelId, CHANNEL_ID_EDEFAULT, oldChannelIdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetChannelId() {
		return channelIdESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getTokenId() {
		return tokenId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTokenId(long newTokenId) {
		long oldTokenId = tokenId;
		tokenId = newTokenId;
		boolean oldTokenIdESet = tokenIdESet;
		tokenIdESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.CHANNEL_SECURITY_TOKEN__TOKEN_ID, oldTokenId, tokenId, !oldTokenIdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTokenId() {
		long oldTokenId = tokenId;
		boolean oldTokenIdESet = tokenIdESet;
		tokenId = TOKEN_ID_EDEFAULT;
		tokenIdESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.CHANNEL_SECURITY_TOKEN__TOKEN_ID, oldTokenId, TOKEN_ID_EDEFAULT, oldTokenIdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTokenId() {
		return tokenIdESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getCreatedAt() {
		return createdAt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreatedAt(XMLGregorianCalendar newCreatedAt) {
		XMLGregorianCalendar oldCreatedAt = createdAt;
		createdAt = newCreatedAt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.CHANNEL_SECURITY_TOKEN__CREATED_AT, oldCreatedAt, createdAt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getRevisedLifetime() {
		return revisedLifetime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRevisedLifetime(long newRevisedLifetime) {
		long oldRevisedLifetime = revisedLifetime;
		revisedLifetime = newRevisedLifetime;
		boolean oldRevisedLifetimeESet = revisedLifetimeESet;
		revisedLifetimeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.CHANNEL_SECURITY_TOKEN__REVISED_LIFETIME, oldRevisedLifetime, revisedLifetime, !oldRevisedLifetimeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRevisedLifetime() {
		long oldRevisedLifetime = revisedLifetime;
		boolean oldRevisedLifetimeESet = revisedLifetimeESet;
		revisedLifetime = REVISED_LIFETIME_EDEFAULT;
		revisedLifetimeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.CHANNEL_SECURITY_TOKEN__REVISED_LIFETIME, oldRevisedLifetime, REVISED_LIFETIME_EDEFAULT, oldRevisedLifetimeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRevisedLifetime() {
		return revisedLifetimeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TypesPackage.CHANNEL_SECURITY_TOKEN__CHANNEL_ID:
				return getChannelId();
			case TypesPackage.CHANNEL_SECURITY_TOKEN__TOKEN_ID:
				return getTokenId();
			case TypesPackage.CHANNEL_SECURITY_TOKEN__CREATED_AT:
				return getCreatedAt();
			case TypesPackage.CHANNEL_SECURITY_TOKEN__REVISED_LIFETIME:
				return getRevisedLifetime();
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
			case TypesPackage.CHANNEL_SECURITY_TOKEN__CHANNEL_ID:
				setChannelId((Long)newValue);
				return;
			case TypesPackage.CHANNEL_SECURITY_TOKEN__TOKEN_ID:
				setTokenId((Long)newValue);
				return;
			case TypesPackage.CHANNEL_SECURITY_TOKEN__CREATED_AT:
				setCreatedAt((XMLGregorianCalendar)newValue);
				return;
			case TypesPackage.CHANNEL_SECURITY_TOKEN__REVISED_LIFETIME:
				setRevisedLifetime((Long)newValue);
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
			case TypesPackage.CHANNEL_SECURITY_TOKEN__CHANNEL_ID:
				unsetChannelId();
				return;
			case TypesPackage.CHANNEL_SECURITY_TOKEN__TOKEN_ID:
				unsetTokenId();
				return;
			case TypesPackage.CHANNEL_SECURITY_TOKEN__CREATED_AT:
				setCreatedAt(CREATED_AT_EDEFAULT);
				return;
			case TypesPackage.CHANNEL_SECURITY_TOKEN__REVISED_LIFETIME:
				unsetRevisedLifetime();
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
			case TypesPackage.CHANNEL_SECURITY_TOKEN__CHANNEL_ID:
				return isSetChannelId();
			case TypesPackage.CHANNEL_SECURITY_TOKEN__TOKEN_ID:
				return isSetTokenId();
			case TypesPackage.CHANNEL_SECURITY_TOKEN__CREATED_AT:
				return CREATED_AT_EDEFAULT == null ? createdAt != null : !CREATED_AT_EDEFAULT.equals(createdAt);
			case TypesPackage.CHANNEL_SECURITY_TOKEN__REVISED_LIFETIME:
				return isSetRevisedLifetime();
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
		result.append(" (channelId: ");
		if (channelIdESet) result.append(channelId); else result.append("<unset>");
		result.append(", tokenId: ");
		if (tokenIdESet) result.append(tokenId); else result.append("<unset>");
		result.append(", createdAt: ");
		result.append(createdAt);
		result.append(", revisedLifetime: ");
		if (revisedLifetimeESet) result.append(revisedLifetime); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ChannelSecurityTokenImpl
