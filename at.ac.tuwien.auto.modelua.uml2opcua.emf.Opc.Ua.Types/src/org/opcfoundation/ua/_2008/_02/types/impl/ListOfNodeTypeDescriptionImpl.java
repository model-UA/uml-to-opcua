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

import org.opcfoundation.ua._2008._02.types.ListOfNodeTypeDescription;
import org.opcfoundation.ua._2008._02.types.NodeTypeDescription;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Of Node Type Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ListOfNodeTypeDescriptionImpl#getNodeTypeDescription <em>Node Type Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListOfNodeTypeDescriptionImpl extends MinimalEObjectImpl.Container implements ListOfNodeTypeDescription {
	/**
	 * The cached value of the '{@link #getNodeTypeDescription() <em>Node Type Description</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeTypeDescription()
	 * @generated
	 * @ordered
	 */
	protected EList<NodeTypeDescription> nodeTypeDescription;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListOfNodeTypeDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getListOfNodeTypeDescription();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NodeTypeDescription> getNodeTypeDescription() {
		if (nodeTypeDescription == null) {
			nodeTypeDescription = new EObjectContainmentEList<NodeTypeDescription>(NodeTypeDescription.class, this, TypesPackage.LIST_OF_NODE_TYPE_DESCRIPTION__NODE_TYPE_DESCRIPTION);
		}
		return nodeTypeDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.LIST_OF_NODE_TYPE_DESCRIPTION__NODE_TYPE_DESCRIPTION:
				return ((InternalEList<?>)getNodeTypeDescription()).basicRemove(otherEnd, msgs);
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
			case TypesPackage.LIST_OF_NODE_TYPE_DESCRIPTION__NODE_TYPE_DESCRIPTION:
				return getNodeTypeDescription();
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
			case TypesPackage.LIST_OF_NODE_TYPE_DESCRIPTION__NODE_TYPE_DESCRIPTION:
				getNodeTypeDescription().clear();
				getNodeTypeDescription().addAll((Collection<? extends NodeTypeDescription>)newValue);
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
			case TypesPackage.LIST_OF_NODE_TYPE_DESCRIPTION__NODE_TYPE_DESCRIPTION:
				getNodeTypeDescription().clear();
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
			case TypesPackage.LIST_OF_NODE_TYPE_DESCRIPTION__NODE_TYPE_DESCRIPTION:
				return nodeTypeDescription != null && !nodeTypeDescription.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ListOfNodeTypeDescriptionImpl
