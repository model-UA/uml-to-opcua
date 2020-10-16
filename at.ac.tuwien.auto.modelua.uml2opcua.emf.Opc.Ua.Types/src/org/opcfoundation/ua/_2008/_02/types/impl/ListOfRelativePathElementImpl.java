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

import org.opcfoundation.ua._2008._02.types.ListOfRelativePathElement;
import org.opcfoundation.ua._2008._02.types.RelativePathElement;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Of Relative Path Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ListOfRelativePathElementImpl#getRelativePathElement <em>Relative Path Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListOfRelativePathElementImpl extends MinimalEObjectImpl.Container implements ListOfRelativePathElement {
	/**
	 * The cached value of the '{@link #getRelativePathElement() <em>Relative Path Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelativePathElement()
	 * @generated
	 * @ordered
	 */
	protected EList<RelativePathElement> relativePathElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListOfRelativePathElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getListOfRelativePathElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RelativePathElement> getRelativePathElement() {
		if (relativePathElement == null) {
			relativePathElement = new EObjectContainmentEList<RelativePathElement>(RelativePathElement.class, this, TypesPackage.LIST_OF_RELATIVE_PATH_ELEMENT__RELATIVE_PATH_ELEMENT);
		}
		return relativePathElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.LIST_OF_RELATIVE_PATH_ELEMENT__RELATIVE_PATH_ELEMENT:
				return ((InternalEList<?>)getRelativePathElement()).basicRemove(otherEnd, msgs);
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
			case TypesPackage.LIST_OF_RELATIVE_PATH_ELEMENT__RELATIVE_PATH_ELEMENT:
				return getRelativePathElement();
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
			case TypesPackage.LIST_OF_RELATIVE_PATH_ELEMENT__RELATIVE_PATH_ELEMENT:
				getRelativePathElement().clear();
				getRelativePathElement().addAll((Collection<? extends RelativePathElement>)newValue);
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
			case TypesPackage.LIST_OF_RELATIVE_PATH_ELEMENT__RELATIVE_PATH_ELEMENT:
				getRelativePathElement().clear();
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
			case TypesPackage.LIST_OF_RELATIVE_PATH_ELEMENT__RELATIVE_PATH_ELEMENT:
				return relativePathElement != null && !relativePathElement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ListOfRelativePathElementImpl
