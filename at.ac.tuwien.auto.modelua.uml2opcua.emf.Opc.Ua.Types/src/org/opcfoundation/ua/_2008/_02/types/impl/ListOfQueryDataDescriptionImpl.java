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

import org.opcfoundation.ua._2008._02.types.ListOfQueryDataDescription;
import org.opcfoundation.ua._2008._02.types.QueryDataDescription;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Of Query Data Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ListOfQueryDataDescriptionImpl#getQueryDataDescription <em>Query Data Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListOfQueryDataDescriptionImpl extends MinimalEObjectImpl.Container implements ListOfQueryDataDescription {
	/**
	 * The cached value of the '{@link #getQueryDataDescription() <em>Query Data Description</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueryDataDescription()
	 * @generated
	 * @ordered
	 */
	protected EList<QueryDataDescription> queryDataDescription;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListOfQueryDataDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getListOfQueryDataDescription();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QueryDataDescription> getQueryDataDescription() {
		if (queryDataDescription == null) {
			queryDataDescription = new EObjectContainmentEList<QueryDataDescription>(QueryDataDescription.class, this, TypesPackage.LIST_OF_QUERY_DATA_DESCRIPTION__QUERY_DATA_DESCRIPTION);
		}
		return queryDataDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.LIST_OF_QUERY_DATA_DESCRIPTION__QUERY_DATA_DESCRIPTION:
				return ((InternalEList<?>)getQueryDataDescription()).basicRemove(otherEnd, msgs);
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
			case TypesPackage.LIST_OF_QUERY_DATA_DESCRIPTION__QUERY_DATA_DESCRIPTION:
				return getQueryDataDescription();
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
			case TypesPackage.LIST_OF_QUERY_DATA_DESCRIPTION__QUERY_DATA_DESCRIPTION:
				getQueryDataDescription().clear();
				getQueryDataDescription().addAll((Collection<? extends QueryDataDescription>)newValue);
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
			case TypesPackage.LIST_OF_QUERY_DATA_DESCRIPTION__QUERY_DATA_DESCRIPTION:
				getQueryDataDescription().clear();
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
			case TypesPackage.LIST_OF_QUERY_DATA_DESCRIPTION__QUERY_DATA_DESCRIPTION:
				return queryDataDescription != null && !queryDataDescription.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ListOfQueryDataDescriptionImpl
