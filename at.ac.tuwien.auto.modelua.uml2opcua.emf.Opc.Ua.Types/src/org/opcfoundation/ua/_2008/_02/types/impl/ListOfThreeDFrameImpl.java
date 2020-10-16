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

import org.opcfoundation.ua._2008._02.types.ListOfThreeDFrame;
import org.opcfoundation.ua._2008._02.types.ThreeDFrame;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Of Three DFrame</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ListOfThreeDFrameImpl#getThreeDFrame <em>Three DFrame</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListOfThreeDFrameImpl extends MinimalEObjectImpl.Container implements ListOfThreeDFrame {
	/**
	 * The cached value of the '{@link #getThreeDFrame() <em>Three DFrame</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreeDFrame()
	 * @generated
	 * @ordered
	 */
	protected EList<ThreeDFrame> threeDFrame;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListOfThreeDFrameImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getListOfThreeDFrame();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ThreeDFrame> getThreeDFrame() {
		if (threeDFrame == null) {
			threeDFrame = new EObjectContainmentEList<ThreeDFrame>(ThreeDFrame.class, this, TypesPackage.LIST_OF_THREE_DFRAME__THREE_DFRAME);
		}
		return threeDFrame;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.LIST_OF_THREE_DFRAME__THREE_DFRAME:
				return ((InternalEList<?>)getThreeDFrame()).basicRemove(otherEnd, msgs);
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
			case TypesPackage.LIST_OF_THREE_DFRAME__THREE_DFRAME:
				return getThreeDFrame();
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
			case TypesPackage.LIST_OF_THREE_DFRAME__THREE_DFRAME:
				getThreeDFrame().clear();
				getThreeDFrame().addAll((Collection<? extends ThreeDFrame>)newValue);
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
			case TypesPackage.LIST_OF_THREE_DFRAME__THREE_DFRAME:
				getThreeDFrame().clear();
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
			case TypesPackage.LIST_OF_THREE_DFRAME__THREE_DFRAME:
				return threeDFrame != null && !threeDFrame.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ListOfThreeDFrameImpl
