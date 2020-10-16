/**
 */
package org.opcfoundation.ua._2008._02.types;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>View Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ViewDescription#getViewId <em>View Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ViewDescription#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ViewDescription#getViewVersion <em>View Version</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getViewDescription()
 * @model extendedMetaData="name='ViewDescription' kind='elementOnly'"
 * @generated
 */
public interface ViewDescription extends EObject {
	/**
	 * Returns the value of the '<em><b>View Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View Id</em>' containment reference.
	 * @see #isSetViewId()
	 * @see #unsetViewId()
	 * @see #setViewId(NodeId)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getViewDescription_ViewId()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='ViewId' namespace='##targetNamespace'"
	 * @generated
	 */
	NodeId getViewId();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.ViewDescription#getViewId <em>View Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>View Id</em>' containment reference.
	 * @see #isSetViewId()
	 * @see #unsetViewId()
	 * @see #getViewId()
	 * @generated
	 */
	void setViewId(NodeId value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.ViewDescription#getViewId <em>View Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetViewId()
	 * @see #getViewId()
	 * @see #setViewId(NodeId)
	 * @generated
	 */
	void unsetViewId();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.ViewDescription#getViewId <em>View Id</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>View Id</em>' containment reference is set.
	 * @see #unsetViewId()
	 * @see #getViewId()
	 * @see #setViewId(NodeId)
	 * @generated
	 */
	boolean isSetViewId();

	/**
	 * Returns the value of the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timestamp</em>' attribute.
	 * @see #setTimestamp(XMLGregorianCalendar)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getViewDescription_Timestamp()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='Timestamp' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getTimestamp();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.ViewDescription#getTimestamp <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timestamp</em>' attribute.
	 * @see #getTimestamp()
	 * @generated
	 */
	void setTimestamp(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>View Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View Version</em>' attribute.
	 * @see #isSetViewVersion()
	 * @see #unsetViewVersion()
	 * @see #setViewVersion(long)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getViewDescription_ViewVersion()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='element' name='ViewVersion' namespace='##targetNamespace'"
	 * @generated
	 */
	long getViewVersion();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.ViewDescription#getViewVersion <em>View Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>View Version</em>' attribute.
	 * @see #isSetViewVersion()
	 * @see #unsetViewVersion()
	 * @see #getViewVersion()
	 * @generated
	 */
	void setViewVersion(long value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.ViewDescription#getViewVersion <em>View Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetViewVersion()
	 * @see #getViewVersion()
	 * @see #setViewVersion(long)
	 * @generated
	 */
	void unsetViewVersion();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.ViewDescription#getViewVersion <em>View Version</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>View Version</em>' attribute is set.
	 * @see #unsetViewVersion()
	 * @see #getViewVersion()
	 * @see #setViewVersion(long)
	 * @generated
	 */
	boolean isSetViewVersion();

} // ViewDescription
