/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.opcfoundation.ua._2008._02.types.ListOfSamplingIntervalDiagnosticsDataType;
import org.opcfoundation.ua._2008._02.types.SamplingIntervalDiagnosticsDataType;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Of Sampling Interval Diagnostics Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ListOfSamplingIntervalDiagnosticsDataTypeImpl#getSamplingIntervalDiagnosticsDataType <em>Sampling Interval Diagnostics Data Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListOfSamplingIntervalDiagnosticsDataTypeImpl extends MinimalEObjectImpl.Container implements ListOfSamplingIntervalDiagnosticsDataType {
	/**
	 * The cached value of the '{@link #getSamplingIntervalDiagnosticsDataType() <em>Sampling Interval Diagnostics Data Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSamplingIntervalDiagnosticsDataType()
	 * @generated
	 * @ordered
	 */
	protected EList<SamplingIntervalDiagnosticsDataType> samplingIntervalDiagnosticsDataType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListOfSamplingIntervalDiagnosticsDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getListOfSamplingIntervalDiagnosticsDataType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SamplingIntervalDiagnosticsDataType> getSamplingIntervalDiagnosticsDataType() {
		if (samplingIntervalDiagnosticsDataType == null) {
			samplingIntervalDiagnosticsDataType = new EObjectContainmentEList<SamplingIntervalDiagnosticsDataType>(SamplingIntervalDiagnosticsDataType.class, this, TypesPackage.LIST_OF_SAMPLING_INTERVAL_DIAGNOSTICS_DATA_TYPE__SAMPLING_INTERVAL_DIAGNOSTICS_DATA_TYPE);
		}
		return samplingIntervalDiagnosticsDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.LIST_OF_SAMPLING_INTERVAL_DIAGNOSTICS_DATA_TYPE__SAMPLING_INTERVAL_DIAGNOSTICS_DATA_TYPE:
				return ((InternalEList<?>)getSamplingIntervalDiagnosticsDataType()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TypesPackage.LIST_OF_SAMPLING_INTERVAL_DIAGNOSTICS_DATA_TYPE__SAMPLING_INTERVAL_DIAGNOSTICS_DATA_TYPE:
				return getSamplingIntervalDiagnosticsDataType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TypesPackage.LIST_OF_SAMPLING_INTERVAL_DIAGNOSTICS_DATA_TYPE__SAMPLING_INTERVAL_DIAGNOSTICS_DATA_TYPE:
				getSamplingIntervalDiagnosticsDataType().clear();
				getSamplingIntervalDiagnosticsDataType().addAll((Collection<? extends SamplingIntervalDiagnosticsDataType>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TypesPackage.LIST_OF_SAMPLING_INTERVAL_DIAGNOSTICS_DATA_TYPE__SAMPLING_INTERVAL_DIAGNOSTICS_DATA_TYPE:
				getSamplingIntervalDiagnosticsDataType().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TypesPackage.LIST_OF_SAMPLING_INTERVAL_DIAGNOSTICS_DATA_TYPE__SAMPLING_INTERVAL_DIAGNOSTICS_DATA_TYPE:
				return samplingIntervalDiagnosticsDataType != null && !samplingIntervalDiagnosticsDataType.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ListOfSamplingIntervalDiagnosticsDataTypeImpl
