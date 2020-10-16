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

import org.opcfoundation.ua._2008._02.types.ListOfLocalizedText;
import org.opcfoundation.ua._2008._02.types.LocalizedText;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Of Localized Text</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ListOfLocalizedTextImpl#getLocalizedText <em>Localized Text</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListOfLocalizedTextImpl extends MinimalEObjectImpl.Container implements ListOfLocalizedText {
	/**
	 * The cached value of the '{@link #getLocalizedText() <em>Localized Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalizedText()
	 * @generated
	 * @ordered
	 */
	protected EList<LocalizedText> localizedText;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListOfLocalizedTextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getListOfLocalizedText();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LocalizedText> getLocalizedText() {
		if (localizedText == null) {
			localizedText = new EObjectContainmentEList<LocalizedText>(LocalizedText.class, this, TypesPackage.LIST_OF_LOCALIZED_TEXT__LOCALIZED_TEXT);
		}
		return localizedText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.LIST_OF_LOCALIZED_TEXT__LOCALIZED_TEXT:
				return ((InternalEList<?>)getLocalizedText()).basicRemove(otherEnd, msgs);
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
			case TypesPackage.LIST_OF_LOCALIZED_TEXT__LOCALIZED_TEXT:
				return getLocalizedText();
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
			case TypesPackage.LIST_OF_LOCALIZED_TEXT__LOCALIZED_TEXT:
				getLocalizedText().clear();
				getLocalizedText().addAll((Collection<? extends LocalizedText>)newValue);
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
			case TypesPackage.LIST_OF_LOCALIZED_TEXT__LOCALIZED_TEXT:
				getLocalizedText().clear();
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
			case TypesPackage.LIST_OF_LOCALIZED_TEXT__LOCALIZED_TEXT:
				return localizedText != null && !localizedText.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ListOfLocalizedTextImpl
