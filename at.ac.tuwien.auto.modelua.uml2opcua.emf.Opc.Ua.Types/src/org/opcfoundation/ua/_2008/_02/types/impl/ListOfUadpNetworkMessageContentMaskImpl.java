/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.opcfoundation.ua._2008._02.types.ListOfUadpNetworkMessageContentMask;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Of Uadp Network Message Content Mask</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ListOfUadpNetworkMessageContentMaskImpl#getUadpNetworkMessageContentMask <em>Uadp Network Message Content Mask</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListOfUadpNetworkMessageContentMaskImpl extends MinimalEObjectImpl.Container implements ListOfUadpNetworkMessageContentMask {
	/**
	 * The cached value of the '{@link #getUadpNetworkMessageContentMask() <em>Uadp Network Message Content Mask</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUadpNetworkMessageContentMask()
	 * @generated
	 * @ordered
	 */
	protected EList<Long> uadpNetworkMessageContentMask;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListOfUadpNetworkMessageContentMaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getListOfUadpNetworkMessageContentMask();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Long> getUadpNetworkMessageContentMask() {
		if (uadpNetworkMessageContentMask == null) {
			uadpNetworkMessageContentMask = new EDataTypeEList<Long>(Long.class, this, TypesPackage.LIST_OF_UADP_NETWORK_MESSAGE_CONTENT_MASK__UADP_NETWORK_MESSAGE_CONTENT_MASK);
		}
		return uadpNetworkMessageContentMask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TypesPackage.LIST_OF_UADP_NETWORK_MESSAGE_CONTENT_MASK__UADP_NETWORK_MESSAGE_CONTENT_MASK:
				return getUadpNetworkMessageContentMask();
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
			case TypesPackage.LIST_OF_UADP_NETWORK_MESSAGE_CONTENT_MASK__UADP_NETWORK_MESSAGE_CONTENT_MASK:
				getUadpNetworkMessageContentMask().clear();
				getUadpNetworkMessageContentMask().addAll((Collection<? extends Long>)newValue);
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
			case TypesPackage.LIST_OF_UADP_NETWORK_MESSAGE_CONTENT_MASK__UADP_NETWORK_MESSAGE_CONTENT_MASK:
				getUadpNetworkMessageContentMask().clear();
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
			case TypesPackage.LIST_OF_UADP_NETWORK_MESSAGE_CONTENT_MASK__UADP_NETWORK_MESSAGE_CONTENT_MASK:
				return uadpNetworkMessageContentMask != null && !uadpNetworkMessageContentMask.isEmpty();
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
		result.append(" (uadpNetworkMessageContentMask: ");
		result.append(uadpNetworkMessageContentMask);
		result.append(')');
		return result.toString();
	}

} //ListOfUadpNetworkMessageContentMaskImpl
