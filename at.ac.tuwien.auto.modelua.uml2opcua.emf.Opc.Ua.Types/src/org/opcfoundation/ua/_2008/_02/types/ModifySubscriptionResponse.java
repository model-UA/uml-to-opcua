/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Modify Subscription Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ModifySubscriptionResponse#getResponseHeader <em>Response Header</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ModifySubscriptionResponse#getRevisedPublishingInterval <em>Revised Publishing Interval</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ModifySubscriptionResponse#getRevisedLifetimeCount <em>Revised Lifetime Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ModifySubscriptionResponse#getRevisedMaxKeepAliveCount <em>Revised Max Keep Alive Count</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getModifySubscriptionResponse()
 * @model extendedMetaData="name='ModifySubscriptionResponse' kind='elementOnly'"
 * @generated
 */
public interface ModifySubscriptionResponse extends EObject {
	/**
	 * Returns the value of the '<em><b>Response Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Response Header</em>' containment reference.
	 * @see #isSetResponseHeader()
	 * @see #unsetResponseHeader()
	 * @see #setResponseHeader(ResponseHeader)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getModifySubscriptionResponse_ResponseHeader()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='ResponseHeader' namespace='##targetNamespace'"
	 * @generated
	 */
	ResponseHeader getResponseHeader();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.ModifySubscriptionResponse#getResponseHeader <em>Response Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response Header</em>' containment reference.
	 * @see #isSetResponseHeader()
	 * @see #unsetResponseHeader()
	 * @see #getResponseHeader()
	 * @generated
	 */
	void setResponseHeader(ResponseHeader value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.ModifySubscriptionResponse#getResponseHeader <em>Response Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetResponseHeader()
	 * @see #getResponseHeader()
	 * @see #setResponseHeader(ResponseHeader)
	 * @generated
	 */
	void unsetResponseHeader();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.ModifySubscriptionResponse#getResponseHeader <em>Response Header</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Response Header</em>' containment reference is set.
	 * @see #unsetResponseHeader()
	 * @see #getResponseHeader()
	 * @see #setResponseHeader(ResponseHeader)
	 * @generated
	 */
	boolean isSetResponseHeader();

	/**
	 * Returns the value of the '<em><b>Revised Publishing Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Revised Publishing Interval</em>' attribute.
	 * @see #isSetRevisedPublishingInterval()
	 * @see #unsetRevisedPublishingInterval()
	 * @see #setRevisedPublishingInterval(double)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getModifySubscriptionResponse_RevisedPublishingInterval()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='element' name='RevisedPublishingInterval' namespace='##targetNamespace'"
	 * @generated
	 */
	double getRevisedPublishingInterval();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.ModifySubscriptionResponse#getRevisedPublishingInterval <em>Revised Publishing Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Revised Publishing Interval</em>' attribute.
	 * @see #isSetRevisedPublishingInterval()
	 * @see #unsetRevisedPublishingInterval()
	 * @see #getRevisedPublishingInterval()
	 * @generated
	 */
	void setRevisedPublishingInterval(double value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.ModifySubscriptionResponse#getRevisedPublishingInterval <em>Revised Publishing Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRevisedPublishingInterval()
	 * @see #getRevisedPublishingInterval()
	 * @see #setRevisedPublishingInterval(double)
	 * @generated
	 */
	void unsetRevisedPublishingInterval();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.ModifySubscriptionResponse#getRevisedPublishingInterval <em>Revised Publishing Interval</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Revised Publishing Interval</em>' attribute is set.
	 * @see #unsetRevisedPublishingInterval()
	 * @see #getRevisedPublishingInterval()
	 * @see #setRevisedPublishingInterval(double)
	 * @generated
	 */
	boolean isSetRevisedPublishingInterval();

	/**
	 * Returns the value of the '<em><b>Revised Lifetime Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Revised Lifetime Count</em>' attribute.
	 * @see #isSetRevisedLifetimeCount()
	 * @see #unsetRevisedLifetimeCount()
	 * @see #setRevisedLifetimeCount(long)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getModifySubscriptionResponse_RevisedLifetimeCount()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='element' name='RevisedLifetimeCount' namespace='##targetNamespace'"
	 * @generated
	 */
	long getRevisedLifetimeCount();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.ModifySubscriptionResponse#getRevisedLifetimeCount <em>Revised Lifetime Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Revised Lifetime Count</em>' attribute.
	 * @see #isSetRevisedLifetimeCount()
	 * @see #unsetRevisedLifetimeCount()
	 * @see #getRevisedLifetimeCount()
	 * @generated
	 */
	void setRevisedLifetimeCount(long value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.ModifySubscriptionResponse#getRevisedLifetimeCount <em>Revised Lifetime Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRevisedLifetimeCount()
	 * @see #getRevisedLifetimeCount()
	 * @see #setRevisedLifetimeCount(long)
	 * @generated
	 */
	void unsetRevisedLifetimeCount();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.ModifySubscriptionResponse#getRevisedLifetimeCount <em>Revised Lifetime Count</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Revised Lifetime Count</em>' attribute is set.
	 * @see #unsetRevisedLifetimeCount()
	 * @see #getRevisedLifetimeCount()
	 * @see #setRevisedLifetimeCount(long)
	 * @generated
	 */
	boolean isSetRevisedLifetimeCount();

	/**
	 * Returns the value of the '<em><b>Revised Max Keep Alive Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Revised Max Keep Alive Count</em>' attribute.
	 * @see #isSetRevisedMaxKeepAliveCount()
	 * @see #unsetRevisedMaxKeepAliveCount()
	 * @see #setRevisedMaxKeepAliveCount(long)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getModifySubscriptionResponse_RevisedMaxKeepAliveCount()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='element' name='RevisedMaxKeepAliveCount' namespace='##targetNamespace'"
	 * @generated
	 */
	long getRevisedMaxKeepAliveCount();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.ModifySubscriptionResponse#getRevisedMaxKeepAliveCount <em>Revised Max Keep Alive Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Revised Max Keep Alive Count</em>' attribute.
	 * @see #isSetRevisedMaxKeepAliveCount()
	 * @see #unsetRevisedMaxKeepAliveCount()
	 * @see #getRevisedMaxKeepAliveCount()
	 * @generated
	 */
	void setRevisedMaxKeepAliveCount(long value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.ModifySubscriptionResponse#getRevisedMaxKeepAliveCount <em>Revised Max Keep Alive Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRevisedMaxKeepAliveCount()
	 * @see #getRevisedMaxKeepAliveCount()
	 * @see #setRevisedMaxKeepAliveCount(long)
	 * @generated
	 */
	void unsetRevisedMaxKeepAliveCount();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.ModifySubscriptionResponse#getRevisedMaxKeepAliveCount <em>Revised Max Keep Alive Count</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Revised Max Keep Alive Count</em>' attribute is set.
	 * @see #unsetRevisedMaxKeepAliveCount()
	 * @see #getRevisedMaxKeepAliveCount()
	 * @see #setRevisedMaxKeepAliveCount(long)
	 * @generated
	 */
	boolean isSetRevisedMaxKeepAliveCount();

} // ModifySubscriptionResponse
