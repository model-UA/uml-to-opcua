/**
 */
package org.opcfoundation.ua._2008._02.types;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Modification Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ModificationInfo#getModificationTime <em>Modification Time</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ModificationInfo#getUpdateType <em>Update Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ModificationInfo#getUserName <em>User Name</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getModificationInfo()
 * @model extendedMetaData="name='ModificationInfo' kind='elementOnly'"
 * @generated
 */
public interface ModificationInfo extends EObject {
	/**
	 * Returns the value of the '<em><b>Modification Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modification Time</em>' attribute.
	 * @see #setModificationTime(XMLGregorianCalendar)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getModificationInfo_ModificationTime()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='ModificationTime' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getModificationTime();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.ModificationInfo#getModificationTime <em>Modification Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modification Time</em>' attribute.
	 * @see #getModificationTime()
	 * @generated
	 */
	void setModificationTime(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Update Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.opcfoundation.ua._2008._02.types.HistoryUpdateType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update Type</em>' attribute.
	 * @see org.opcfoundation.ua._2008._02.types.HistoryUpdateType
	 * @see #isSetUpdateType()
	 * @see #unsetUpdateType()
	 * @see #setUpdateType(HistoryUpdateType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getModificationInfo_UpdateType()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='UpdateType' namespace='##targetNamespace'"
	 * @generated
	 */
	HistoryUpdateType getUpdateType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.ModificationInfo#getUpdateType <em>Update Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update Type</em>' attribute.
	 * @see org.opcfoundation.ua._2008._02.types.HistoryUpdateType
	 * @see #isSetUpdateType()
	 * @see #unsetUpdateType()
	 * @see #getUpdateType()
	 * @generated
	 */
	void setUpdateType(HistoryUpdateType value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.ModificationInfo#getUpdateType <em>Update Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUpdateType()
	 * @see #getUpdateType()
	 * @see #setUpdateType(HistoryUpdateType)
	 * @generated
	 */
	void unsetUpdateType();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.ModificationInfo#getUpdateType <em>Update Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Update Type</em>' attribute is set.
	 * @see #unsetUpdateType()
	 * @see #getUpdateType()
	 * @see #setUpdateType(HistoryUpdateType)
	 * @generated
	 */
	boolean isSetUpdateType();

	/**
	 * Returns the value of the '<em><b>User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Name</em>' attribute.
	 * @see #isSetUserName()
	 * @see #unsetUserName()
	 * @see #setUserName(String)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getModificationInfo_UserName()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='UserName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUserName();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.ModificationInfo#getUserName <em>User Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Name</em>' attribute.
	 * @see #isSetUserName()
	 * @see #unsetUserName()
	 * @see #getUserName()
	 * @generated
	 */
	void setUserName(String value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.ModificationInfo#getUserName <em>User Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUserName()
	 * @see #getUserName()
	 * @see #setUserName(String)
	 * @generated
	 */
	void unsetUserName();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.ModificationInfo#getUserName <em>User Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>User Name</em>' attribute is set.
	 * @see #unsetUserName()
	 * @see #getUserName()
	 * @see #setUserName(String)
	 * @generated
	 */
	boolean isSetUserName();

} // ModificationInfo
