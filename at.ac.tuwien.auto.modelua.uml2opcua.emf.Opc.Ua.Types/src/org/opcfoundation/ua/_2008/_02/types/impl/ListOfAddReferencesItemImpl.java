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

import org.opcfoundation.ua._2008._02.types.AddReferencesItem;
import org.opcfoundation.ua._2008._02.types.ListOfAddReferencesItem;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Of Add References Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ListOfAddReferencesItemImpl#getAddReferencesItem <em>Add References Item</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListOfAddReferencesItemImpl extends MinimalEObjectImpl.Container implements ListOfAddReferencesItem {
	/**
	 * The cached value of the '{@link #getAddReferencesItem() <em>Add References Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddReferencesItem()
	 * @generated
	 * @ordered
	 */
	protected EList<AddReferencesItem> addReferencesItem;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListOfAddReferencesItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getListOfAddReferencesItem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AddReferencesItem> getAddReferencesItem() {
		if (addReferencesItem == null) {
			addReferencesItem = new EObjectContainmentEList<AddReferencesItem>(AddReferencesItem.class, this, TypesPackage.LIST_OF_ADD_REFERENCES_ITEM__ADD_REFERENCES_ITEM);
		}
		return addReferencesItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.LIST_OF_ADD_REFERENCES_ITEM__ADD_REFERENCES_ITEM:
				return ((InternalEList<?>)getAddReferencesItem()).basicRemove(otherEnd, msgs);
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
			case TypesPackage.LIST_OF_ADD_REFERENCES_ITEM__ADD_REFERENCES_ITEM:
				return getAddReferencesItem();
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
			case TypesPackage.LIST_OF_ADD_REFERENCES_ITEM__ADD_REFERENCES_ITEM:
				getAddReferencesItem().clear();
				getAddReferencesItem().addAll((Collection<? extends AddReferencesItem>)newValue);
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
			case TypesPackage.LIST_OF_ADD_REFERENCES_ITEM__ADD_REFERENCES_ITEM:
				getAddReferencesItem().clear();
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
			case TypesPackage.LIST_OF_ADD_REFERENCES_ITEM__ADD_REFERENCES_ITEM:
				return addReferencesItem != null && !addReferencesItem.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ListOfAddReferencesItemImpl
