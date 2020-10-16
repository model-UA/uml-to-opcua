/**
 */
package org.opcfoundation.ua._2008._02.types;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.Annotation#getMessage <em>Message</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.Annotation#getUserName <em>User Name</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.Annotation#getAnnotationTime <em>Annotation Time</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getAnnotation()
 * @model extendedMetaData="name='Annotation' kind='elementOnly'"
 * @generated
 */
public interface Annotation extends EObject {
	/**
	 * Returns the value of the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message</em>' attribute.
	 * @see #isSetMessage()
	 * @see #unsetMessage()
	 * @see #setMessage(String)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getAnnotation_Message()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Message' namespace='##targetNamespace'"
	 * @generated
	 */
	String getMessage();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.Annotation#getMessage <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' attribute.
	 * @see #isSetMessage()
	 * @see #unsetMessage()
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(String value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.Annotation#getMessage <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMessage()
	 * @see #getMessage()
	 * @see #setMessage(String)
	 * @generated
	 */
	void unsetMessage();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.Annotation#getMessage <em>Message</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Message</em>' attribute is set.
	 * @see #unsetMessage()
	 * @see #getMessage()
	 * @see #setMessage(String)
	 * @generated
	 */
	boolean isSetMessage();

	/**
	 * Returns the value of the '<em><b>User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Name</em>' attribute.
	 * @see #isSetUserName()
	 * @see #unsetUserName()
	 * @see #setUserName(String)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getAnnotation_UserName()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='UserName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUserName();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.Annotation#getUserName <em>User Name</em>}' attribute.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.Annotation#getUserName <em>User Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUserName()
	 * @see #getUserName()
	 * @see #setUserName(String)
	 * @generated
	 */
	void unsetUserName();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.Annotation#getUserName <em>User Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>User Name</em>' attribute is set.
	 * @see #unsetUserName()
	 * @see #getUserName()
	 * @see #setUserName(String)
	 * @generated
	 */
	boolean isSetUserName();

	/**
	 * Returns the value of the '<em><b>Annotation Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation Time</em>' attribute.
	 * @see #setAnnotationTime(XMLGregorianCalendar)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getAnnotation_AnnotationTime()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='AnnotationTime' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getAnnotationTime();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.Annotation#getAnnotationTime <em>Annotation Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotation Time</em>' attribute.
	 * @see #getAnnotationTime()
	 * @generated
	 */
	void setAnnotationTime(XMLGregorianCalendar value);

} // Annotation
