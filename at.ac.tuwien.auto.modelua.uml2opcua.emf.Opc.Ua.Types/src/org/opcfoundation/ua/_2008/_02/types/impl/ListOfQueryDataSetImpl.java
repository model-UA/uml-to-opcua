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

import org.opcfoundation.ua._2008._02.types.ListOfQueryDataSet;
import org.opcfoundation.ua._2008._02.types.QueryDataSet;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Of Query Data Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ListOfQueryDataSetImpl#getQueryDataSet <em>Query Data Set</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListOfQueryDataSetImpl extends MinimalEObjectImpl.Container implements ListOfQueryDataSet {
	/**
	 * The cached value of the '{@link #getQueryDataSet() <em>Query Data Set</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueryDataSet()
	 * @generated
	 * @ordered
	 */
	protected EList<QueryDataSet> queryDataSet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListOfQueryDataSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getListOfQueryDataSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QueryDataSet> getQueryDataSet() {
		if (queryDataSet == null) {
			queryDataSet = new EObjectContainmentEList<QueryDataSet>(QueryDataSet.class, this, TypesPackage.LIST_OF_QUERY_DATA_SET__QUERY_DATA_SET);
		}
		return queryDataSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.LIST_OF_QUERY_DATA_SET__QUERY_DATA_SET:
				return ((InternalEList<?>)getQueryDataSet()).basicRemove(otherEnd, msgs);
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
			case TypesPackage.LIST_OF_QUERY_DATA_SET__QUERY_DATA_SET:
				return getQueryDataSet();
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
			case TypesPackage.LIST_OF_QUERY_DATA_SET__QUERY_DATA_SET:
				getQueryDataSet().clear();
				getQueryDataSet().addAll((Collection<? extends QueryDataSet>)newValue);
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
			case TypesPackage.LIST_OF_QUERY_DATA_SET__QUERY_DATA_SET:
				getQueryDataSet().clear();
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
			case TypesPackage.LIST_OF_QUERY_DATA_SET__QUERY_DATA_SET:
				return queryDataSet != null && !queryDataSet.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ListOfQueryDataSetImpl
