/**
 */
package org.opcfoundation.ua._2011._03.ua.node.set.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.opcfoundation.ua._2011._03.ua.node.set.LocalizedText;
import org.opcfoundation.ua._2011._03.ua.node.set.SetPackage;
import org.opcfoundation.ua._2011._03.ua.node.set.StructureTranslationType;
import org.opcfoundation.ua._2011._03.ua.node.set.TranslationType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Translation Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.TranslationTypeImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.TranslationTypeImpl#getField <em>Field</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TranslationTypeImpl extends MinimalEObjectImpl.Container implements TranslationType {
	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected EList<LocalizedText> text;

	/**
	 * The cached value of the '{@link #getField() <em>Field</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getField()
	 * @generated
	 * @ordered
	 */
	protected EList<StructureTranslationType> field;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TranslationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SetPackage.Literals.TRANSLATION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LocalizedText> getText() {
		if (text == null) {
			text = new EObjectContainmentEList<LocalizedText>(LocalizedText.class, this, SetPackage.TRANSLATION_TYPE__TEXT);
		}
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StructureTranslationType> getField() {
		if (field == null) {
			field = new EObjectContainmentEList<StructureTranslationType>(StructureTranslationType.class, this, SetPackage.TRANSLATION_TYPE__FIELD);
		}
		return field;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SetPackage.TRANSLATION_TYPE__TEXT:
				return ((InternalEList<?>)getText()).basicRemove(otherEnd, msgs);
			case SetPackage.TRANSLATION_TYPE__FIELD:
				return ((InternalEList<?>)getField()).basicRemove(otherEnd, msgs);
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
			case SetPackage.TRANSLATION_TYPE__TEXT:
				return getText();
			case SetPackage.TRANSLATION_TYPE__FIELD:
				return getField();
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
			case SetPackage.TRANSLATION_TYPE__TEXT:
				getText().clear();
				getText().addAll((Collection<? extends LocalizedText>)newValue);
				return;
			case SetPackage.TRANSLATION_TYPE__FIELD:
				getField().clear();
				getField().addAll((Collection<? extends StructureTranslationType>)newValue);
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
			case SetPackage.TRANSLATION_TYPE__TEXT:
				getText().clear();
				return;
			case SetPackage.TRANSLATION_TYPE__FIELD:
				getField().clear();
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
			case SetPackage.TRANSLATION_TYPE__TEXT:
				return text != null && !text.isEmpty();
			case SetPackage.TRANSLATION_TYPE__FIELD:
				return field != null && !field.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TranslationTypeImpl
