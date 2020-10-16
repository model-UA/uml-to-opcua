/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Counter Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ServiceCounterDataType#getTotalCount <em>Total Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ServiceCounterDataType#getErrorCount <em>Error Count</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getServiceCounterDataType()
 * @model extendedMetaData="name='ServiceCounterDataType' kind='elementOnly'"
 * @generated
 */
public interface ServiceCounterDataType extends EObject {
	/**
	 * Returns the value of the '<em><b>Total Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Count</em>' attribute.
	 * @see #isSetTotalCount()
	 * @see #unsetTotalCount()
	 * @see #setTotalCount(long)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getServiceCounterDataType_TotalCount()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='element' name='TotalCount' namespace='##targetNamespace'"
	 * @generated
	 */
	long getTotalCount();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.ServiceCounterDataType#getTotalCount <em>Total Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Count</em>' attribute.
	 * @see #isSetTotalCount()
	 * @see #unsetTotalCount()
	 * @see #getTotalCount()
	 * @generated
	 */
	void setTotalCount(long value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.ServiceCounterDataType#getTotalCount <em>Total Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTotalCount()
	 * @see #getTotalCount()
	 * @see #setTotalCount(long)
	 * @generated
	 */
	void unsetTotalCount();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.ServiceCounterDataType#getTotalCount <em>Total Count</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Total Count</em>' attribute is set.
	 * @see #unsetTotalCount()
	 * @see #getTotalCount()
	 * @see #setTotalCount(long)
	 * @generated
	 */
	boolean isSetTotalCount();

	/**
	 * Returns the value of the '<em><b>Error Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error Count</em>' attribute.
	 * @see #isSetErrorCount()
	 * @see #unsetErrorCount()
	 * @see #setErrorCount(long)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getServiceCounterDataType_ErrorCount()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='element' name='ErrorCount' namespace='##targetNamespace'"
	 * @generated
	 */
	long getErrorCount();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.ServiceCounterDataType#getErrorCount <em>Error Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Count</em>' attribute.
	 * @see #isSetErrorCount()
	 * @see #unsetErrorCount()
	 * @see #getErrorCount()
	 * @generated
	 */
	void setErrorCount(long value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.ServiceCounterDataType#getErrorCount <em>Error Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetErrorCount()
	 * @see #getErrorCount()
	 * @see #setErrorCount(long)
	 * @generated
	 */
	void unsetErrorCount();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.ServiceCounterDataType#getErrorCount <em>Error Count</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Error Count</em>' attribute is set.
	 * @see #unsetErrorCount()
	 * @see #getErrorCount()
	 * @see #setErrorCount(long)
	 * @generated
	 */
	boolean isSetErrorCount();

} // ServiceCounterDataType
