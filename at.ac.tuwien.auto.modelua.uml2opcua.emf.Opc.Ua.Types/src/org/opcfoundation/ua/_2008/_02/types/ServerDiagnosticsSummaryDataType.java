/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Server Diagnostics Summary Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ServerDiagnosticsSummaryDataType#getServerViewCount <em>Server View Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ServerDiagnosticsSummaryDataType#getCurrentSessionCount <em>Current Session Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ServerDiagnosticsSummaryDataType#getCumulatedSessionCount <em>Cumulated Session Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ServerDiagnosticsSummaryDataType#getSecurityRejectedSessionCount <em>Security Rejected Session Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ServerDiagnosticsSummaryDataType#getRejectedSessionCount <em>Rejected Session Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ServerDiagnosticsSummaryDataType#getSessionTimeoutCount <em>Session Timeout Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ServerDiagnosticsSummaryDataType#getSessionAbortCount <em>Session Abort Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ServerDiagnosticsSummaryDataType#getCurrentSubscriptionCount <em>Current Subscription Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ServerDiagnosticsSummaryDataType#getCumulatedSubscriptionCount <em>Cumulated Subscription Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ServerDiagnosticsSummaryDataType#getPublishingIntervalCount <em>Publishing Interval Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ServerDiagnosticsSummaryDataType#getSecurityRejectedRequestsCount <em>Security Rejected Requests Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ServerDiagnosticsSummaryDataType#getRejectedRequestsCount <em>Rejected Requests Count</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getServerDiagnosticsSummaryDataType()
 * @model extendedMetaData="name='ServerDiagnosticsSummaryDataType' kind='elementOnly'"
 * @generated
 */
public interface ServerDiagnosticsSummaryDataType extends EObject {
	/**
	 * Returns the value of the '<em><b>Server View Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server View Count</em>' attribute.
	 * @see #isSetServerViewCount()
	 * @see #unsetServerViewCount()
	 * @see #setServerViewCount(long)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getServerDiagnosticsSummaryDataType_ServerViewCount()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='element' name='ServerViewCount' namespace='##targetNamespace'"
	 * @generated
	 */
	long getServerViewCount();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.ServerDiagnosticsSummaryDataType#getServerViewCount <em>Server View Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server View Count</em>' attribute.
	 * @see #isSetServerViewCount()
	 * @see #unsetServerViewCount()
	 * @see #getServerViewCount()
	 * @generated
	 */
	void setServerViewCount(long value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.ServerDiagnosticsSummaryDataType#getServerViewCount <em>Server View Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetServerViewCount()
	 * @see #getServerViewCount()
	 * @see #setServerViewCount(long)
	 * @generated
	 */
	void unsetServerViewCount();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.ServerDiagnosticsSummaryDataType#getServerViewCount <em>Server View Count</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Server View Count</em>' attribute is set.
	 * @see #unsetServerViewCount()
	 * @see #getServerViewCount()
	 * @see #setServerViewCount(long)
	 * @generated
	 */
	boolean isSetServerViewCount();

	/**
	 * Returns the value of the '<em><b>Current Session Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Session Count</em>' attribute.
	 * @see #isSetCurrentSessionCount()
	 * @see #unsetCurrentSessionCount()
	 * @see #setCurrentSessionCount(long)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getServerDiagnosticsSummaryDataType_CurrentSessionCount()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='element' name='CurrentSessionCount' namespace='##targetNamespace'"
	 * @generated
	 */
	long getCurrentSessionCount();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.ServerDiagnosticsSummaryDataType#getCurrentSessionCount <em>Current Session Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Session Count</em>' attribute.
	 * @see #isSetCurrentSessionCount()
	 * @see #unsetCurrentSessionCount()
	 * @see #getCurrentSessionCount()
	 * @generated
	 */
	void setCurrentSessionCount(long value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.ServerDiagnosticsSummaryDataType#getCurrentSessionCount <em>Current Session Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCurrentSessionCount()
	 * @see #getCurrentSessionCount()
	 * @see #setCurrentSessionCount(long)
	 * @generated
	 */
	void unsetCurrentSessionCount();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.ServerDiagnosticsSummaryDataType#getCurrentSessionCount <em>Current Session Count</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Current Session Count</em>' attribute is set.
	 * @see #unsetCurrentSessionCount()
	 * @see #getCurrentSessionCount()
	 * @see #setCurrentSessionCount(long)
	 * @generated
	 */
	boolean isSetCurrentSessionCount();

	/**
	 * Returns the value of the '<em><b>Cumulated Session Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cumulated Session Count</em>' attribute.
	 * @see #isSetCumulatedSessionCount()
	 * @see #unsetCumulatedSessionCount()
	 * @see #setCumulatedSessionCount(long)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getServerDiagnosticsSummaryDataType_CumulatedSessionCount()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='element' name='CumulatedSessionCount' namespace='##targetNamespace'"
	 * @generated
	 */
	long getCumulatedSessionCount();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.ServerDiagnosticsSummaryDataType#getCumulatedSessionCount <em>Cumulated Session Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cumulated Session Count</em>' attribute.
	 * @see #isSetCumulatedSessionCount()
	 * @see #unsetCumulatedSessionCount()
	 * @see #getCumulatedSessionCount()
	 * @generated
	 */
	void setCumulatedSessionCount(long value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.ServerDiagnosticsSummaryDataType#getCumulatedSessionCount <em>Cumulated Session Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCumulatedSessionCount()
	 * @see #getCumulatedSessionCount()
	 * @see #setCumulatedSessionCount(long)
	 * @generated
	 */
	void unsetCumulatedSessionCount();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.ServerDiagnosticsSummaryDataType#getCumulatedSessionCount <em>Cumulated Session Count</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Cumulated Session Count</em>' attribute is set.
	 * @see #unsetCumulatedSessionCount()
	 * @see #getCumulatedSessionCount()
	 * @see #setCumulatedSessionCount(long)
	 * @generated
	 */
	boolean isSetCumulatedSessionCount();

	/**
	 * Returns the value of the '<em><b>Security Rejected Session Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Rejected Session Count</em>' attribute.
	 * @see #isSetSecurityRejectedSessionCount()
	 * @see #unsetSecurityRejectedSessionCount()
	 * @see #setSecurityRejectedSessionCount(long)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getServerDiagnosticsSummaryDataType_SecurityRejectedSessionCount()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='element' name='SecurityRejectedSessionCount' namespace='##targetNamespace'"
	 * @generated
	 */
	long getSecurityRejectedSessionCount();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.ServerDiagnosticsSummaryDataType#getSecurityRejectedSessionCount <em>Security Rejected Session Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security Rejected Session Count</em>' attribute.
	 * @see #isSetSecurityRejectedSessionCount()
	 * @see #unsetSecurityRejectedSessionCount()
	 * @see #getSecurityRejectedSessionCount()
	 * @generated
	 */
	void setSecurityRejectedSessionCount(long value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.ServerDiagnosticsSummaryDataType#getSecurityRejectedSessionCount <em>Security Rejected Session Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSecurityRejectedSessionCount()
	 * @see #getSecurityRejectedSessionCount()
	 * @see #setSecurityRejectedSessionCount(long)
	 * @generated
	 */
	void unsetSecurityRejectedSessionCount();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.ServerDiagnosticsSummaryDataType#getSecurityRejectedSessionCount <em>Security Rejected Session Count</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Security Rejected Session Count</em>' attribute is set.
	 * @see #unsetSecurityRejectedSessionCount()
	 * @see #getSecurityRejectedSessionCount()
	 * @see #setSecurityRejectedSessionCount(long)
	 * @generated
	 */
	boolean isSetSecurityRejectedSessionCount();

	/**
	 * Returns the value of the '<em><b>Rejected Session Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rejected Session Count</em>' attribute.
	 * @see #isSetRejectedSessionCount()
	 * @see #unsetRejectedSessionCount()
	 * @see #setRejectedSessionCount(long)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getServerDiagnosticsSummaryDataType_RejectedSessionCount()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='element' name='RejectedSessionCount' namespace='##targetNamespace'"
	 * @generated
	 */
	long getRejectedSessionCount();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.ServerDiagnosticsSummaryDataType#getRejectedSessionCount <em>Rejected Session Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rejected Session Count</em>' attribute.
	 * @see #isSetRejectedSessionCount()
	 * @see #unsetRejectedSessionCount()
	 * @see #getRejectedSessionCount()
	 * @generated
	 */
	void setRejectedSessionCount(long value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.ServerDiagnosticsSummaryDataType#getRejectedSessionCount <em>Rejected Session Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRejectedSessionCount()
	 * @see #getRejectedSessionCount()
	 * @see #setRejectedSessionCount(long)
	 * @generated
	 */
	void unsetRejectedSessionCount();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.ServerDiagnosticsSummaryDataType#getRejectedSessionCount <em>Rejected Session Count</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Rejected Session Count</em>' attribute is set.
	 * @see #unsetRejectedSessionCount()
	 * @see #getRejectedSessionCount()
	 * @see #setRejectedSessionCount(long)
	 * @generated
	 */
	boolean isSetRejectedSessionCount();

	/**
	 * Returns the value of the '<em><b>Session Timeout Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Session Timeout Count</em>' attribute.
	 * @see #isSetSessionTimeoutCount()
	 * @see #unsetSessionTimeoutCount()
	 * @see #setSessionTimeoutCount(long)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getServerDiagnosticsSummaryDataType_SessionTimeoutCount()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='element' name='SessionTimeoutCount' namespace='##targetNamespace'"
	 * @generated
	 */
	long getSessionTimeoutCount();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.ServerDiagnosticsSummaryDataType#getSessionTimeoutCount <em>Session Timeout Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Session Timeout Count</em>' attribute.
	 * @see #isSetSessionTimeoutCount()
	 * @see #unsetSessionTimeoutCount()
	 * @see #getSessionTimeoutCount()
	 * @generated
	 */
	void setSessionTimeoutCount(long value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.ServerDiagnosticsSummaryDataType#getSessionTimeoutCount <em>Session Timeout Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSessionTimeoutCount()
	 * @see #getSessionTimeoutCount()
	 * @see #setSessionTimeoutCount(long)
	 * @generated
	 */
	void unsetSessionTimeoutCount();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.ServerDiagnosticsSummaryDataType#getSessionTimeoutCount <em>Session Timeout Count</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Session Timeout Count</em>' attribute is set.
	 * @see #unsetSessionTimeoutCount()
	 * @see #getSessionTimeoutCount()
	 * @see #setSessionTimeoutCount(long)
	 * @generated
	 */
	boolean isSetSessionTimeoutCount();

	/**
	 * Returns the value of the '<em><b>Session Abort Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Session Abort Count</em>' attribute.
	 * @see #isSetSessionAbortCount()
	 * @see #unsetSessionAbortCount()
	 * @see #setSessionAbortCount(long)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getServerDiagnosticsSummaryDataType_SessionAbortCount()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='element' name='SessionAbortCount' namespace='##targetNamespace'"
	 * @generated
	 */
	long getSessionAbortCount();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.ServerDiagnosticsSummaryDataType#getSessionAbortCount <em>Session Abort Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Session Abort Count</em>' attribute.
	 * @see #isSetSessionAbortCount()
	 * @see #unsetSessionAbortCount()
	 * @see #getSessionAbortCount()
	 * @generated
	 */
	void setSessionAbortCount(long value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.ServerDiagnosticsSummaryDataType#getSessionAbortCount <em>Session Abort Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSessionAbortCount()
	 * @see #getSessionAbortCount()
	 * @see #setSessionAbortCount(long)
	 * @generated
	 */
	void unsetSessionAbortCount();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.ServerDiagnosticsSummaryDataType#getSessionAbortCount <em>Session Abort Count</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Session Abort Count</em>' attribute is set.
	 * @see #unsetSessionAbortCount()
	 * @see #getSessionAbortCount()
	 * @see #setSessionAbortCount(long)
	 * @generated
	 */
	boolean isSetSessionAbortCount();

	/**
	 * Returns the value of the '<em><b>Current Subscription Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Subscription Count</em>' attribute.
	 * @see #isSetCurrentSubscriptionCount()
	 * @see #unsetCurrentSubscriptionCount()
	 * @see #setCurrentSubscriptionCount(long)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getServerDiagnosticsSummaryDataType_CurrentSubscriptionCount()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='element' name='CurrentSubscriptionCount' namespace='##targetNamespace'"
	 * @generated
	 */
	long getCurrentSubscriptionCount();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.ServerDiagnosticsSummaryDataType#getCurrentSubscriptionCount <em>Current Subscription Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Subscription Count</em>' attribute.
	 * @see #isSetCurrentSubscriptionCount()
	 * @see #unsetCurrentSubscriptionCount()
	 * @see #getCurrentSubscriptionCount()
	 * @generated
	 */
	void setCurrentSubscriptionCount(long value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.ServerDiagnosticsSummaryDataType#getCurrentSubscriptionCount <em>Current Subscription Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCurrentSubscriptionCount()
	 * @see #getCurrentSubscriptionCount()
	 * @see #setCurrentSubscriptionCount(long)
	 * @generated
	 */
	void unsetCurrentSubscriptionCount();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.ServerDiagnosticsSummaryDataType#getCurrentSubscriptionCount <em>Current Subscription Count</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Current Subscription Count</em>' attribute is set.
	 * @see #unsetCurrentSubscriptionCount()
	 * @see #getCurrentSubscriptionCount()
	 * @see #setCurrentSubscriptionCount(long)
	 * @generated
	 */
	boolean isSetCurrentSubscriptionCount();

	/**
	 * Returns the value of the '<em><b>Cumulated Subscription Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cumulated Subscription Count</em>' attribute.
	 * @see #isSetCumulatedSubscriptionCount()
	 * @see #unsetCumulatedSubscriptionCount()
	 * @see #setCumulatedSubscriptionCount(long)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getServerDiagnosticsSummaryDataType_CumulatedSubscriptionCount()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='element' name='CumulatedSubscriptionCount' namespace='##targetNamespace'"
	 * @generated
	 */
	long getCumulatedSubscriptionCount();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.ServerDiagnosticsSummaryDataType#getCumulatedSubscriptionCount <em>Cumulated Subscription Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cumulated Subscription Count</em>' attribute.
	 * @see #isSetCumulatedSubscriptionCount()
	 * @see #unsetCumulatedSubscriptionCount()
	 * @see #getCumulatedSubscriptionCount()
	 * @generated
	 */
	void setCumulatedSubscriptionCount(long value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.ServerDiagnosticsSummaryDataType#getCumulatedSubscriptionCount <em>Cumulated Subscription Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCumulatedSubscriptionCount()
	 * @see #getCumulatedSubscriptionCount()
	 * @see #setCumulatedSubscriptionCount(long)
	 * @generated
	 */
	void unsetCumulatedSubscriptionCount();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.ServerDiagnosticsSummaryDataType#getCumulatedSubscriptionCount <em>Cumulated Subscription Count</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Cumulated Subscription Count</em>' attribute is set.
	 * @see #unsetCumulatedSubscriptionCount()
	 * @see #getCumulatedSubscriptionCount()
	 * @see #setCumulatedSubscriptionCount(long)
	 * @generated
	 */
	boolean isSetCumulatedSubscriptionCount();

	/**
	 * Returns the value of the '<em><b>Publishing Interval Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publishing Interval Count</em>' attribute.
	 * @see #isSetPublishingIntervalCount()
	 * @see #unsetPublishingIntervalCount()
	 * @see #setPublishingIntervalCount(long)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getServerDiagnosticsSummaryDataType_PublishingIntervalCount()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='element' name='PublishingIntervalCount' namespace='##targetNamespace'"
	 * @generated
	 */
	long getPublishingIntervalCount();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.ServerDiagnosticsSummaryDataType#getPublishingIntervalCount <em>Publishing Interval Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publishing Interval Count</em>' attribute.
	 * @see #isSetPublishingIntervalCount()
	 * @see #unsetPublishingIntervalCount()
	 * @see #getPublishingIntervalCount()
	 * @generated
	 */
	void setPublishingIntervalCount(long value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.ServerDiagnosticsSummaryDataType#getPublishingIntervalCount <em>Publishing Interval Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPublishingIntervalCount()
	 * @see #getPublishingIntervalCount()
	 * @see #setPublishingIntervalCount(long)
	 * @generated
	 */
	void unsetPublishingIntervalCount();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.ServerDiagnosticsSummaryDataType#getPublishingIntervalCount <em>Publishing Interval Count</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Publishing Interval Count</em>' attribute is set.
	 * @see #unsetPublishingIntervalCount()
	 * @see #getPublishingIntervalCount()
	 * @see #setPublishingIntervalCount(long)
	 * @generated
	 */
	boolean isSetPublishingIntervalCount();

	/**
	 * Returns the value of the '<em><b>Security Rejected Requests Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Rejected Requests Count</em>' attribute.
	 * @see #isSetSecurityRejectedRequestsCount()
	 * @see #unsetSecurityRejectedRequestsCount()
	 * @see #setSecurityRejectedRequestsCount(long)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getServerDiagnosticsSummaryDataType_SecurityRejectedRequestsCount()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='element' name='SecurityRejectedRequestsCount' namespace='##targetNamespace'"
	 * @generated
	 */
	long getSecurityRejectedRequestsCount();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.ServerDiagnosticsSummaryDataType#getSecurityRejectedRequestsCount <em>Security Rejected Requests Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security Rejected Requests Count</em>' attribute.
	 * @see #isSetSecurityRejectedRequestsCount()
	 * @see #unsetSecurityRejectedRequestsCount()
	 * @see #getSecurityRejectedRequestsCount()
	 * @generated
	 */
	void setSecurityRejectedRequestsCount(long value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.ServerDiagnosticsSummaryDataType#getSecurityRejectedRequestsCount <em>Security Rejected Requests Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSecurityRejectedRequestsCount()
	 * @see #getSecurityRejectedRequestsCount()
	 * @see #setSecurityRejectedRequestsCount(long)
	 * @generated
	 */
	void unsetSecurityRejectedRequestsCount();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.ServerDiagnosticsSummaryDataType#getSecurityRejectedRequestsCount <em>Security Rejected Requests Count</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Security Rejected Requests Count</em>' attribute is set.
	 * @see #unsetSecurityRejectedRequestsCount()
	 * @see #getSecurityRejectedRequestsCount()
	 * @see #setSecurityRejectedRequestsCount(long)
	 * @generated
	 */
	boolean isSetSecurityRejectedRequestsCount();

	/**
	 * Returns the value of the '<em><b>Rejected Requests Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rejected Requests Count</em>' attribute.
	 * @see #isSetRejectedRequestsCount()
	 * @see #unsetRejectedRequestsCount()
	 * @see #setRejectedRequestsCount(long)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getServerDiagnosticsSummaryDataType_RejectedRequestsCount()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='element' name='RejectedRequestsCount' namespace='##targetNamespace'"
	 * @generated
	 */
	long getRejectedRequestsCount();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.ServerDiagnosticsSummaryDataType#getRejectedRequestsCount <em>Rejected Requests Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rejected Requests Count</em>' attribute.
	 * @see #isSetRejectedRequestsCount()
	 * @see #unsetRejectedRequestsCount()
	 * @see #getRejectedRequestsCount()
	 * @generated
	 */
	void setRejectedRequestsCount(long value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.ServerDiagnosticsSummaryDataType#getRejectedRequestsCount <em>Rejected Requests Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRejectedRequestsCount()
	 * @see #getRejectedRequestsCount()
	 * @see #setRejectedRequestsCount(long)
	 * @generated
	 */
	void unsetRejectedRequestsCount();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.ServerDiagnosticsSummaryDataType#getRejectedRequestsCount <em>Rejected Requests Count</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Rejected Requests Count</em>' attribute is set.
	 * @see #unsetRejectedRequestsCount()
	 * @see #getRejectedRequestsCount()
	 * @see #setRejectedRequestsCount(long)
	 * @generated
	 */
	boolean isSetRejectedRequestsCount();

} // ServerDiagnosticsSummaryDataType
