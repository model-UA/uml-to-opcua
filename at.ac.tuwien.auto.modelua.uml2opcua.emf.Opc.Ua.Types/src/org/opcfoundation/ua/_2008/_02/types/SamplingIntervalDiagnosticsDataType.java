/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sampling Interval Diagnostics Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.SamplingIntervalDiagnosticsDataType#getSamplingInterval <em>Sampling Interval</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.SamplingIntervalDiagnosticsDataType#getMonitoredItemCount <em>Monitored Item Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.SamplingIntervalDiagnosticsDataType#getMaxMonitoredItemCount <em>Max Monitored Item Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.SamplingIntervalDiagnosticsDataType#getDisabledMonitoredItemCount <em>Disabled Monitored Item Count</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getSamplingIntervalDiagnosticsDataType()
 * @model extendedMetaData="name='SamplingIntervalDiagnosticsDataType' kind='elementOnly'"
 * @generated
 */
public interface SamplingIntervalDiagnosticsDataType extends EObject {
	/**
	 * Returns the value of the '<em><b>Sampling Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sampling Interval</em>' attribute.
	 * @see #isSetSamplingInterval()
	 * @see #unsetSamplingInterval()
	 * @see #setSamplingInterval(double)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getSamplingIntervalDiagnosticsDataType_SamplingInterval()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='element' name='SamplingInterval' namespace='##targetNamespace'"
	 * @generated
	 */
	double getSamplingInterval();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.SamplingIntervalDiagnosticsDataType#getSamplingInterval <em>Sampling Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sampling Interval</em>' attribute.
	 * @see #isSetSamplingInterval()
	 * @see #unsetSamplingInterval()
	 * @see #getSamplingInterval()
	 * @generated
	 */
	void setSamplingInterval(double value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.SamplingIntervalDiagnosticsDataType#getSamplingInterval <em>Sampling Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSamplingInterval()
	 * @see #getSamplingInterval()
	 * @see #setSamplingInterval(double)
	 * @generated
	 */
	void unsetSamplingInterval();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.SamplingIntervalDiagnosticsDataType#getSamplingInterval <em>Sampling Interval</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Sampling Interval</em>' attribute is set.
	 * @see #unsetSamplingInterval()
	 * @see #getSamplingInterval()
	 * @see #setSamplingInterval(double)
	 * @generated
	 */
	boolean isSetSamplingInterval();

	/**
	 * Returns the value of the '<em><b>Monitored Item Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Monitored Item Count</em>' attribute.
	 * @see #isSetMonitoredItemCount()
	 * @see #unsetMonitoredItemCount()
	 * @see #setMonitoredItemCount(long)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getSamplingIntervalDiagnosticsDataType_MonitoredItemCount()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='element' name='MonitoredItemCount' namespace='##targetNamespace'"
	 * @generated
	 */
	long getMonitoredItemCount();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.SamplingIntervalDiagnosticsDataType#getMonitoredItemCount <em>Monitored Item Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Monitored Item Count</em>' attribute.
	 * @see #isSetMonitoredItemCount()
	 * @see #unsetMonitoredItemCount()
	 * @see #getMonitoredItemCount()
	 * @generated
	 */
	void setMonitoredItemCount(long value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.SamplingIntervalDiagnosticsDataType#getMonitoredItemCount <em>Monitored Item Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMonitoredItemCount()
	 * @see #getMonitoredItemCount()
	 * @see #setMonitoredItemCount(long)
	 * @generated
	 */
	void unsetMonitoredItemCount();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.SamplingIntervalDiagnosticsDataType#getMonitoredItemCount <em>Monitored Item Count</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Monitored Item Count</em>' attribute is set.
	 * @see #unsetMonitoredItemCount()
	 * @see #getMonitoredItemCount()
	 * @see #setMonitoredItemCount(long)
	 * @generated
	 */
	boolean isSetMonitoredItemCount();

	/**
	 * Returns the value of the '<em><b>Max Monitored Item Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Monitored Item Count</em>' attribute.
	 * @see #isSetMaxMonitoredItemCount()
	 * @see #unsetMaxMonitoredItemCount()
	 * @see #setMaxMonitoredItemCount(long)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getSamplingIntervalDiagnosticsDataType_MaxMonitoredItemCount()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='element' name='MaxMonitoredItemCount' namespace='##targetNamespace'"
	 * @generated
	 */
	long getMaxMonitoredItemCount();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.SamplingIntervalDiagnosticsDataType#getMaxMonitoredItemCount <em>Max Monitored Item Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Monitored Item Count</em>' attribute.
	 * @see #isSetMaxMonitoredItemCount()
	 * @see #unsetMaxMonitoredItemCount()
	 * @see #getMaxMonitoredItemCount()
	 * @generated
	 */
	void setMaxMonitoredItemCount(long value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.SamplingIntervalDiagnosticsDataType#getMaxMonitoredItemCount <em>Max Monitored Item Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaxMonitoredItemCount()
	 * @see #getMaxMonitoredItemCount()
	 * @see #setMaxMonitoredItemCount(long)
	 * @generated
	 */
	void unsetMaxMonitoredItemCount();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.SamplingIntervalDiagnosticsDataType#getMaxMonitoredItemCount <em>Max Monitored Item Count</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Max Monitored Item Count</em>' attribute is set.
	 * @see #unsetMaxMonitoredItemCount()
	 * @see #getMaxMonitoredItemCount()
	 * @see #setMaxMonitoredItemCount(long)
	 * @generated
	 */
	boolean isSetMaxMonitoredItemCount();

	/**
	 * Returns the value of the '<em><b>Disabled Monitored Item Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disabled Monitored Item Count</em>' attribute.
	 * @see #isSetDisabledMonitoredItemCount()
	 * @see #unsetDisabledMonitoredItemCount()
	 * @see #setDisabledMonitoredItemCount(long)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getSamplingIntervalDiagnosticsDataType_DisabledMonitoredItemCount()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='element' name='DisabledMonitoredItemCount' namespace='##targetNamespace'"
	 * @generated
	 */
	long getDisabledMonitoredItemCount();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.SamplingIntervalDiagnosticsDataType#getDisabledMonitoredItemCount <em>Disabled Monitored Item Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disabled Monitored Item Count</em>' attribute.
	 * @see #isSetDisabledMonitoredItemCount()
	 * @see #unsetDisabledMonitoredItemCount()
	 * @see #getDisabledMonitoredItemCount()
	 * @generated
	 */
	void setDisabledMonitoredItemCount(long value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.SamplingIntervalDiagnosticsDataType#getDisabledMonitoredItemCount <em>Disabled Monitored Item Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDisabledMonitoredItemCount()
	 * @see #getDisabledMonitoredItemCount()
	 * @see #setDisabledMonitoredItemCount(long)
	 * @generated
	 */
	void unsetDisabledMonitoredItemCount();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.SamplingIntervalDiagnosticsDataType#getDisabledMonitoredItemCount <em>Disabled Monitored Item Count</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Disabled Monitored Item Count</em>' attribute is set.
	 * @see #unsetDisabledMonitoredItemCount()
	 * @see #getDisabledMonitoredItemCount()
	 * @see #setDisabledMonitoredItemCount(long)
	 * @generated
	 */
	boolean isSetDisabledMonitoredItemCount();

} // SamplingIntervalDiagnosticsDataType
