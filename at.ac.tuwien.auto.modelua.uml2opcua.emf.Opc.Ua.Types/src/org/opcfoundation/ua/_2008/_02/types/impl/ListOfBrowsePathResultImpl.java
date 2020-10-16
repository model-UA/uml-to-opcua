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

import org.opcfoundation.ua._2008._02.types.BrowsePathResult;
import org.opcfoundation.ua._2008._02.types.ListOfBrowsePathResult;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Of Browse Path Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ListOfBrowsePathResultImpl#getBrowsePathResult <em>Browse Path Result</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListOfBrowsePathResultImpl extends MinimalEObjectImpl.Container implements ListOfBrowsePathResult {
	/**
	 * The cached value of the '{@link #getBrowsePathResult() <em>Browse Path Result</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBrowsePathResult()
	 * @generated
	 * @ordered
	 */
	protected EList<BrowsePathResult> browsePathResult;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListOfBrowsePathResultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getListOfBrowsePathResult();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BrowsePathResult> getBrowsePathResult() {
		if (browsePathResult == null) {
			browsePathResult = new EObjectContainmentEList<BrowsePathResult>(BrowsePathResult.class, this, TypesPackage.LIST_OF_BROWSE_PATH_RESULT__BROWSE_PATH_RESULT);
		}
		return browsePathResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.LIST_OF_BROWSE_PATH_RESULT__BROWSE_PATH_RESULT:
				return ((InternalEList<?>)getBrowsePathResult()).basicRemove(otherEnd, msgs);
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
			case TypesPackage.LIST_OF_BROWSE_PATH_RESULT__BROWSE_PATH_RESULT:
				return getBrowsePathResult();
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
			case TypesPackage.LIST_OF_BROWSE_PATH_RESULT__BROWSE_PATH_RESULT:
				getBrowsePathResult().clear();
				getBrowsePathResult().addAll((Collection<? extends BrowsePathResult>)newValue);
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
			case TypesPackage.LIST_OF_BROWSE_PATH_RESULT__BROWSE_PATH_RESULT:
				getBrowsePathResult().clear();
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
			case TypesPackage.LIST_OF_BROWSE_PATH_RESULT__BROWSE_PATH_RESULT:
				return browsePathResult != null && !browsePathResult.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ListOfBrowsePathResultImpl
