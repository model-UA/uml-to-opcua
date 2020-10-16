/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.opcfoundation.ua._2008._02.types.ListOfOpenFileMode;
import org.opcfoundation.ua._2008._02.types.OpenFileMode;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Of Open File Mode</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ListOfOpenFileModeImpl#getOpenFileMode <em>Open File Mode</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListOfOpenFileModeImpl extends MinimalEObjectImpl.Container implements ListOfOpenFileMode {
	/**
	 * The cached value of the '{@link #getOpenFileMode() <em>Open File Mode</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpenFileMode()
	 * @generated
	 * @ordered
	 */
	protected EList<OpenFileMode> openFileMode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListOfOpenFileModeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getListOfOpenFileMode();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OpenFileMode> getOpenFileMode() {
		if (openFileMode == null) {
			openFileMode = new EDataTypeEList<OpenFileMode>(OpenFileMode.class, this, TypesPackage.LIST_OF_OPEN_FILE_MODE__OPEN_FILE_MODE);
		}
		return openFileMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TypesPackage.LIST_OF_OPEN_FILE_MODE__OPEN_FILE_MODE:
				return getOpenFileMode();
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
			case TypesPackage.LIST_OF_OPEN_FILE_MODE__OPEN_FILE_MODE:
				getOpenFileMode().clear();
				getOpenFileMode().addAll((Collection<? extends OpenFileMode>)newValue);
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
			case TypesPackage.LIST_OF_OPEN_FILE_MODE__OPEN_FILE_MODE:
				getOpenFileMode().clear();
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
			case TypesPackage.LIST_OF_OPEN_FILE_MODE__OPEN_FILE_MODE:
				return openFileMode != null && !openFileMode.isEmpty();
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
		result.append(" (openFileMode: ");
		result.append(openFileMode);
		result.append(')');
		return result.toString();
	}

} //ListOfOpenFileModeImpl
