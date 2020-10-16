/**
 */
package org.opcfoundation.ua._2008._02.types;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Server Status Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ServerStatusDataType#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ServerStatusDataType#getCurrentTime <em>Current Time</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ServerStatusDataType#getState <em>State</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ServerStatusDataType#getBuildInfo <em>Build Info</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ServerStatusDataType#getSecondsTillShutdown <em>Seconds Till Shutdown</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ServerStatusDataType#getShutdownReason <em>Shutdown Reason</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getServerStatusDataType()
 * @model extendedMetaData="name='ServerStatusDataType' kind='elementOnly'"
 * @generated
 */
public interface ServerStatusDataType extends EObject {
	/**
	 * Returns the value of the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Time</em>' attribute.
	 * @see #setStartTime(XMLGregorianCalendar)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getServerStatusDataType_StartTime()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='StartTime' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getStartTime();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.ServerStatusDataType#getStartTime <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Time</em>' attribute.
	 * @see #getStartTime()
	 * @generated
	 */
	void setStartTime(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Current Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Time</em>' attribute.
	 * @see #setCurrentTime(XMLGregorianCalendar)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getServerStatusDataType_CurrentTime()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='CurrentTime' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getCurrentTime();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.ServerStatusDataType#getCurrentTime <em>Current Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Time</em>' attribute.
	 * @see #getCurrentTime()
	 * @generated
	 */
	void setCurrentTime(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * The literals are from the enumeration {@link org.opcfoundation.ua._2008._02.types.ServerState}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see org.opcfoundation.ua._2008._02.types.ServerState
	 * @see #isSetState()
	 * @see #unsetState()
	 * @see #setState(ServerState)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getServerStatusDataType_State()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='State' namespace='##targetNamespace'"
	 * @generated
	 */
	ServerState getState();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.ServerStatusDataType#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see org.opcfoundation.ua._2008._02.types.ServerState
	 * @see #isSetState()
	 * @see #unsetState()
	 * @see #getState()
	 * @generated
	 */
	void setState(ServerState value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.ServerStatusDataType#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetState()
	 * @see #getState()
	 * @see #setState(ServerState)
	 * @generated
	 */
	void unsetState();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.ServerStatusDataType#getState <em>State</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>State</em>' attribute is set.
	 * @see #unsetState()
	 * @see #getState()
	 * @see #setState(ServerState)
	 * @generated
	 */
	boolean isSetState();

	/**
	 * Returns the value of the '<em><b>Build Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Build Info</em>' containment reference.
	 * @see #isSetBuildInfo()
	 * @see #unsetBuildInfo()
	 * @see #setBuildInfo(BuildInfo)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getServerStatusDataType_BuildInfo()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='BuildInfo' namespace='##targetNamespace'"
	 * @generated
	 */
	BuildInfo getBuildInfo();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.ServerStatusDataType#getBuildInfo <em>Build Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Build Info</em>' containment reference.
	 * @see #isSetBuildInfo()
	 * @see #unsetBuildInfo()
	 * @see #getBuildInfo()
	 * @generated
	 */
	void setBuildInfo(BuildInfo value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.ServerStatusDataType#getBuildInfo <em>Build Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBuildInfo()
	 * @see #getBuildInfo()
	 * @see #setBuildInfo(BuildInfo)
	 * @generated
	 */
	void unsetBuildInfo();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.ServerStatusDataType#getBuildInfo <em>Build Info</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Build Info</em>' containment reference is set.
	 * @see #unsetBuildInfo()
	 * @see #getBuildInfo()
	 * @see #setBuildInfo(BuildInfo)
	 * @generated
	 */
	boolean isSetBuildInfo();

	/**
	 * Returns the value of the '<em><b>Seconds Till Shutdown</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seconds Till Shutdown</em>' attribute.
	 * @see #isSetSecondsTillShutdown()
	 * @see #unsetSecondsTillShutdown()
	 * @see #setSecondsTillShutdown(long)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getServerStatusDataType_SecondsTillShutdown()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='element' name='SecondsTillShutdown' namespace='##targetNamespace'"
	 * @generated
	 */
	long getSecondsTillShutdown();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.ServerStatusDataType#getSecondsTillShutdown <em>Seconds Till Shutdown</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seconds Till Shutdown</em>' attribute.
	 * @see #isSetSecondsTillShutdown()
	 * @see #unsetSecondsTillShutdown()
	 * @see #getSecondsTillShutdown()
	 * @generated
	 */
	void setSecondsTillShutdown(long value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.ServerStatusDataType#getSecondsTillShutdown <em>Seconds Till Shutdown</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSecondsTillShutdown()
	 * @see #getSecondsTillShutdown()
	 * @see #setSecondsTillShutdown(long)
	 * @generated
	 */
	void unsetSecondsTillShutdown();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.ServerStatusDataType#getSecondsTillShutdown <em>Seconds Till Shutdown</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Seconds Till Shutdown</em>' attribute is set.
	 * @see #unsetSecondsTillShutdown()
	 * @see #getSecondsTillShutdown()
	 * @see #setSecondsTillShutdown(long)
	 * @generated
	 */
	boolean isSetSecondsTillShutdown();

	/**
	 * Returns the value of the '<em><b>Shutdown Reason</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shutdown Reason</em>' containment reference.
	 * @see #isSetShutdownReason()
	 * @see #unsetShutdownReason()
	 * @see #setShutdownReason(LocalizedText)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getServerStatusDataType_ShutdownReason()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='ShutdownReason' namespace='##targetNamespace'"
	 * @generated
	 */
	LocalizedText getShutdownReason();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.ServerStatusDataType#getShutdownReason <em>Shutdown Reason</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shutdown Reason</em>' containment reference.
	 * @see #isSetShutdownReason()
	 * @see #unsetShutdownReason()
	 * @see #getShutdownReason()
	 * @generated
	 */
	void setShutdownReason(LocalizedText value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.ServerStatusDataType#getShutdownReason <em>Shutdown Reason</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetShutdownReason()
	 * @see #getShutdownReason()
	 * @see #setShutdownReason(LocalizedText)
	 * @generated
	 */
	void unsetShutdownReason();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.ServerStatusDataType#getShutdownReason <em>Shutdown Reason</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Shutdown Reason</em>' containment reference is set.
	 * @see #unsetShutdownReason()
	 * @see #getShutdownReason()
	 * @see #setShutdownReason(LocalizedText)
	 * @generated
	 */
	boolean isSetShutdownReason();

} // ServerStatusDataType
