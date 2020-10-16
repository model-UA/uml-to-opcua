/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.opcfoundation.ua._2008._02.types.DiagnosticsLevel;
import org.opcfoundation.ua._2008._02.types.ListOfDiagnosticsLevel;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Of Diagnostics Level</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ListOfDiagnosticsLevelImpl#getDiagnosticsLevel <em>Diagnostics Level</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListOfDiagnosticsLevelImpl extends MinimalEObjectImpl.Container implements ListOfDiagnosticsLevel {
	/**
	 * The cached value of the '{@link #getDiagnosticsLevel() <em>Diagnostics Level</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagnosticsLevel()
	 * @generated
	 * @ordered
	 */
	protected EList<DiagnosticsLevel> diagnosticsLevel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListOfDiagnosticsLevelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getListOfDiagnosticsLevel();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiagnosticsLevel> getDiagnosticsLevel() {
		if (diagnosticsLevel == null) {
			diagnosticsLevel = new EDataTypeEList<DiagnosticsLevel>(DiagnosticsLevel.class, this, TypesPackage.LIST_OF_DIAGNOSTICS_LEVEL__DIAGNOSTICS_LEVEL);
		}
		return diagnosticsLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TypesPackage.LIST_OF_DIAGNOSTICS_LEVEL__DIAGNOSTICS_LEVEL:
				return getDiagnosticsLevel();
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
			case TypesPackage.LIST_OF_DIAGNOSTICS_LEVEL__DIAGNOSTICS_LEVEL:
				getDiagnosticsLevel().clear();
				getDiagnosticsLevel().addAll((Collection<? extends DiagnosticsLevel>)newValue);
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
			case TypesPackage.LIST_OF_DIAGNOSTICS_LEVEL__DIAGNOSTICS_LEVEL:
				getDiagnosticsLevel().clear();
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
			case TypesPackage.LIST_OF_DIAGNOSTICS_LEVEL__DIAGNOSTICS_LEVEL:
				return diagnosticsLevel != null && !diagnosticsLevel.isEmpty();
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
		result.append(" (diagnosticsLevel: ");
		result.append(diagnosticsLevel);
		result.append(')');
		return result.toString();
	}

} //ListOfDiagnosticsLevelImpl
