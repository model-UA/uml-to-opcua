/**
 */
package org.opcfoundation.ua._2008._02.types;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Date Time</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfDateTime#getDateTime <em>Date Time</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfDateTime()
 * @model extendedMetaData="name='ListOfDateTime' kind='elementOnly'"
 * @generated
 */
public interface ListOfDateTime extends EObject {
	/**
	 * Returns the value of the '<em><b>Date Time</b></em>' attribute list.
	 * The list contents are of type {@link javax.xml.datatype.XMLGregorianCalendar}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Time</em>' attribute list.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfDateTime_DateTime()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='DateTime' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<XMLGregorianCalendar> getDateTime();

} // ListOfDateTime
