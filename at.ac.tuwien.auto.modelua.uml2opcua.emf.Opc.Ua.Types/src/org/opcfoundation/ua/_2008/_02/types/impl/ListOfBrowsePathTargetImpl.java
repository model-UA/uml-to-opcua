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

import org.opcfoundation.ua._2008._02.types.BrowsePathTarget;
import org.opcfoundation.ua._2008._02.types.ListOfBrowsePathTarget;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Of Browse Path Target</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ListOfBrowsePathTargetImpl#getBrowsePathTarget <em>Browse Path Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListOfBrowsePathTargetImpl extends MinimalEObjectImpl.Container implements ListOfBrowsePathTarget {
	/**
	 * The cached value of the '{@link #getBrowsePathTarget() <em>Browse Path Target</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBrowsePathTarget()
	 * @generated
	 * @ordered
	 */
	protected EList<BrowsePathTarget> browsePathTarget;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListOfBrowsePathTargetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getListOfBrowsePathTarget();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BrowsePathTarget> getBrowsePathTarget() {
		if (browsePathTarget == null) {
			browsePathTarget = new EObjectContainmentEList<BrowsePathTarget>(BrowsePathTarget.class, this, TypesPackage.LIST_OF_BROWSE_PATH_TARGET__BROWSE_PATH_TARGET);
		}
		return browsePathTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.LIST_OF_BROWSE_PATH_TARGET__BROWSE_PATH_TARGET:
				return ((InternalEList<?>)getBrowsePathTarget()).basicRemove(otherEnd, msgs);
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
			case TypesPackage.LIST_OF_BROWSE_PATH_TARGET__BROWSE_PATH_TARGET:
				return getBrowsePathTarget();
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
			case TypesPackage.LIST_OF_BROWSE_PATH_TARGET__BROWSE_PATH_TARGET:
				getBrowsePathTarget().clear();
				getBrowsePathTarget().addAll((Collection<? extends BrowsePathTarget>)newValue);
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
			case TypesPackage.LIST_OF_BROWSE_PATH_TARGET__BROWSE_PATH_TARGET:
				getBrowsePathTarget().clear();
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
			case TypesPackage.LIST_OF_BROWSE_PATH_TARGET__BROWSE_PATH_TARGET:
				return browsePathTarget != null && !browsePathTarget.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ListOfBrowsePathTargetImpl
