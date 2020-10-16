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

import org.opcfoundation.ua._2008._02.types.DeleteReferencesItem;
import org.opcfoundation.ua._2008._02.types.ListOfDeleteReferencesItem;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Of Delete References Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ListOfDeleteReferencesItemImpl#getDeleteReferencesItem <em>Delete References Item</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListOfDeleteReferencesItemImpl extends MinimalEObjectImpl.Container implements ListOfDeleteReferencesItem {
	/**
	 * The cached value of the '{@link #getDeleteReferencesItem() <em>Delete References Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeleteReferencesItem()
	 * @generated
	 * @ordered
	 */
	protected EList<DeleteReferencesItem> deleteReferencesItem;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListOfDeleteReferencesItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getListOfDeleteReferencesItem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DeleteReferencesItem> getDeleteReferencesItem() {
		if (deleteReferencesItem == null) {
			deleteReferencesItem = new EObjectContainmentEList<DeleteReferencesItem>(DeleteReferencesItem.class, this, TypesPackage.LIST_OF_DELETE_REFERENCES_ITEM__DELETE_REFERENCES_ITEM);
		}
		return deleteReferencesItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.LIST_OF_DELETE_REFERENCES_ITEM__DELETE_REFERENCES_ITEM:
				return ((InternalEList<?>)getDeleteReferencesItem()).basicRemove(otherEnd, msgs);
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
			case TypesPackage.LIST_OF_DELETE_REFERENCES_ITEM__DELETE_REFERENCES_ITEM:
				return getDeleteReferencesItem();
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
			case TypesPackage.LIST_OF_DELETE_REFERENCES_ITEM__DELETE_REFERENCES_ITEM:
				getDeleteReferencesItem().clear();
				getDeleteReferencesItem().addAll((Collection<? extends DeleteReferencesItem>)newValue);
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
			case TypesPackage.LIST_OF_DELETE_REFERENCES_ITEM__DELETE_REFERENCES_ITEM:
				getDeleteReferencesItem().clear();
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
			case TypesPackage.LIST_OF_DELETE_REFERENCES_ITEM__DELETE_REFERENCES_ITEM:
				return deleteReferencesItem != null && !deleteReferencesItem.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ListOfDeleteReferencesItemImpl
