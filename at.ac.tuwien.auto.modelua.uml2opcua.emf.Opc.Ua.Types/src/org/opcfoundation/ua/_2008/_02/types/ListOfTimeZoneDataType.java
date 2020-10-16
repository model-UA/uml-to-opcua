/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Time Zone Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfTimeZoneDataType#getTimeZoneDataType <em>Time Zone Data Type</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfTimeZoneDataType()
 * @model extendedMetaData="name='ListOfTimeZoneDataType' kind='elementOnly'"
 * @generated
 */
public interface ListOfTimeZoneDataType extends EObject {
	/**
	 * Returns the value of the '<em><b>Time Zone Data Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2008._02.types.TimeZoneDataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Zone Data Type</em>' containment reference list.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfTimeZoneDataType_TimeZoneDataType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='TimeZoneDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TimeZoneDataType> getTimeZoneDataType();

} // ListOfTimeZoneDataType
