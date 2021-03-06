/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Sampling Interval Diagnostics Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfSamplingIntervalDiagnosticsDataType#getSamplingIntervalDiagnosticsDataType <em>Sampling Interval Diagnostics Data Type</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfSamplingIntervalDiagnosticsDataType()
 * @model extendedMetaData="name='ListOfSamplingIntervalDiagnosticsDataType' kind='elementOnly'"
 * @generated
 */
public interface ListOfSamplingIntervalDiagnosticsDataType extends EObject {
	/**
	 * Returns the value of the '<em><b>Sampling Interval Diagnostics Data Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2008._02.types.SamplingIntervalDiagnosticsDataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sampling Interval Diagnostics Data Type</em>' containment reference list.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfSamplingIntervalDiagnosticsDataType_SamplingIntervalDiagnosticsDataType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SamplingIntervalDiagnosticsDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SamplingIntervalDiagnosticsDataType> getSamplingIntervalDiagnosticsDataType();

} // ListOfSamplingIntervalDiagnosticsDataType
