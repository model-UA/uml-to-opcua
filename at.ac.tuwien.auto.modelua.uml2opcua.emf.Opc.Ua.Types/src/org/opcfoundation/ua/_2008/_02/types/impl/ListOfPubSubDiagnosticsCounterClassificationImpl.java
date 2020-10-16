/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.opcfoundation.ua._2008._02.types.ListOfPubSubDiagnosticsCounterClassification;
import org.opcfoundation.ua._2008._02.types.PubSubDiagnosticsCounterClassification;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Of Pub Sub Diagnostics Counter Classification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ListOfPubSubDiagnosticsCounterClassificationImpl#getPubSubDiagnosticsCounterClassification <em>Pub Sub Diagnostics Counter Classification</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListOfPubSubDiagnosticsCounterClassificationImpl extends MinimalEObjectImpl.Container implements ListOfPubSubDiagnosticsCounterClassification {
	/**
	 * The cached value of the '{@link #getPubSubDiagnosticsCounterClassification() <em>Pub Sub Diagnostics Counter Classification</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPubSubDiagnosticsCounterClassification()
	 * @generated
	 * @ordered
	 */
	protected EList<PubSubDiagnosticsCounterClassification> pubSubDiagnosticsCounterClassification;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListOfPubSubDiagnosticsCounterClassificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getListOfPubSubDiagnosticsCounterClassification();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PubSubDiagnosticsCounterClassification> getPubSubDiagnosticsCounterClassification() {
		if (pubSubDiagnosticsCounterClassification == null) {
			pubSubDiagnosticsCounterClassification = new EDataTypeEList<PubSubDiagnosticsCounterClassification>(PubSubDiagnosticsCounterClassification.class, this, TypesPackage.LIST_OF_PUB_SUB_DIAGNOSTICS_COUNTER_CLASSIFICATION__PUB_SUB_DIAGNOSTICS_COUNTER_CLASSIFICATION);
		}
		return pubSubDiagnosticsCounterClassification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TypesPackage.LIST_OF_PUB_SUB_DIAGNOSTICS_COUNTER_CLASSIFICATION__PUB_SUB_DIAGNOSTICS_COUNTER_CLASSIFICATION:
				return getPubSubDiagnosticsCounterClassification();
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
			case TypesPackage.LIST_OF_PUB_SUB_DIAGNOSTICS_COUNTER_CLASSIFICATION__PUB_SUB_DIAGNOSTICS_COUNTER_CLASSIFICATION:
				getPubSubDiagnosticsCounterClassification().clear();
				getPubSubDiagnosticsCounterClassification().addAll((Collection<? extends PubSubDiagnosticsCounterClassification>)newValue);
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
			case TypesPackage.LIST_OF_PUB_SUB_DIAGNOSTICS_COUNTER_CLASSIFICATION__PUB_SUB_DIAGNOSTICS_COUNTER_CLASSIFICATION:
				getPubSubDiagnosticsCounterClassification().clear();
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
			case TypesPackage.LIST_OF_PUB_SUB_DIAGNOSTICS_COUNTER_CLASSIFICATION__PUB_SUB_DIAGNOSTICS_COUNTER_CLASSIFICATION:
				return pubSubDiagnosticsCounterClassification != null && !pubSubDiagnosticsCounterClassification.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (pubSubDiagnosticsCounterClassification: ");
		result.append(pubSubDiagnosticsCounterClassification);
		result.append(')');
		return result.toString();
	}

} //ListOfPubSubDiagnosticsCounterClassificationImpl
