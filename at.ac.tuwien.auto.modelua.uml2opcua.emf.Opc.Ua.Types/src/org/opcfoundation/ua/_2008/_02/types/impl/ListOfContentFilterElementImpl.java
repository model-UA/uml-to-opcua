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

import org.opcfoundation.ua._2008._02.types.ContentFilterElement;
import org.opcfoundation.ua._2008._02.types.ListOfContentFilterElement;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Of Content Filter Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ListOfContentFilterElementImpl#getContentFilterElement <em>Content Filter Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListOfContentFilterElementImpl extends MinimalEObjectImpl.Container implements ListOfContentFilterElement {
	/**
	 * The cached value of the '{@link #getContentFilterElement() <em>Content Filter Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentFilterElement()
	 * @generated
	 * @ordered
	 */
	protected EList<ContentFilterElement> contentFilterElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListOfContentFilterElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getListOfContentFilterElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContentFilterElement> getContentFilterElement() {
		if (contentFilterElement == null) {
			contentFilterElement = new EObjectContainmentEList<ContentFilterElement>(ContentFilterElement.class, this, TypesPackage.LIST_OF_CONTENT_FILTER_ELEMENT__CONTENT_FILTER_ELEMENT);
		}
		return contentFilterElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.LIST_OF_CONTENT_FILTER_ELEMENT__CONTENT_FILTER_ELEMENT:
				return ((InternalEList<?>)getContentFilterElement()).basicRemove(otherEnd, msgs);
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
			case TypesPackage.LIST_OF_CONTENT_FILTER_ELEMENT__CONTENT_FILTER_ELEMENT:
				return getContentFilterElement();
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
			case TypesPackage.LIST_OF_CONTENT_FILTER_ELEMENT__CONTENT_FILTER_ELEMENT:
				getContentFilterElement().clear();
				getContentFilterElement().addAll((Collection<? extends ContentFilterElement>)newValue);
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
			case TypesPackage.LIST_OF_CONTENT_FILTER_ELEMENT__CONTENT_FILTER_ELEMENT:
				getContentFilterElement().clear();
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
			case TypesPackage.LIST_OF_CONTENT_FILTER_ELEMENT__CONTENT_FILTER_ELEMENT:
				return contentFilterElement != null && !contentFilterElement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ListOfContentFilterElementImpl
