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

import org.opcfoundation.ua._2008._02.types.ContentFilterElementResult;
import org.opcfoundation.ua._2008._02.types.ListOfContentFilterElementResult;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Of Content Filter Element Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ListOfContentFilterElementResultImpl#getContentFilterElementResult <em>Content Filter Element Result</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListOfContentFilterElementResultImpl extends MinimalEObjectImpl.Container implements ListOfContentFilterElementResult {
	/**
	 * The cached value of the '{@link #getContentFilterElementResult() <em>Content Filter Element Result</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentFilterElementResult()
	 * @generated
	 * @ordered
	 */
	protected EList<ContentFilterElementResult> contentFilterElementResult;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListOfContentFilterElementResultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getListOfContentFilterElementResult();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContentFilterElementResult> getContentFilterElementResult() {
		if (contentFilterElementResult == null) {
			contentFilterElementResult = new EObjectContainmentEList<ContentFilterElementResult>(ContentFilterElementResult.class, this, TypesPackage.LIST_OF_CONTENT_FILTER_ELEMENT_RESULT__CONTENT_FILTER_ELEMENT_RESULT);
		}
		return contentFilterElementResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.LIST_OF_CONTENT_FILTER_ELEMENT_RESULT__CONTENT_FILTER_ELEMENT_RESULT:
				return ((InternalEList<?>)getContentFilterElementResult()).basicRemove(otherEnd, msgs);
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
			case TypesPackage.LIST_OF_CONTENT_FILTER_ELEMENT_RESULT__CONTENT_FILTER_ELEMENT_RESULT:
				return getContentFilterElementResult();
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
			case TypesPackage.LIST_OF_CONTENT_FILTER_ELEMENT_RESULT__CONTENT_FILTER_ELEMENT_RESULT:
				getContentFilterElementResult().clear();
				getContentFilterElementResult().addAll((Collection<? extends ContentFilterElementResult>)newValue);
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
			case TypesPackage.LIST_OF_CONTENT_FILTER_ELEMENT_RESULT__CONTENT_FILTER_ELEMENT_RESULT:
				getContentFilterElementResult().clear();
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
			case TypesPackage.LIST_OF_CONTENT_FILTER_ELEMENT_RESULT__CONTENT_FILTER_ELEMENT_RESULT:
				return contentFilterElementResult != null && !contentFilterElementResult.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ListOfContentFilterElementResultImpl
