/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.opcfoundation.ua._2008._02.types.StructureDefinition;
import org.opcfoundation.ua._2008._02.types.StructureDescription;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Structure Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.StructureDescriptionImpl#getStructureDefinition <em>Structure Definition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StructureDescriptionImpl extends DataTypeDescriptionImpl implements StructureDescription {
	/**
	 * The cached value of the '{@link #getStructureDefinition() <em>Structure Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructureDefinition()
	 * @generated
	 * @ordered
	 */
	protected StructureDefinition structureDefinition;

	/**
	 * This is true if the Structure Definition containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean structureDefinitionESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructureDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getStructureDescription();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureDefinition getStructureDefinition() {
		return structureDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStructureDefinition(StructureDefinition newStructureDefinition, NotificationChain msgs) {
		StructureDefinition oldStructureDefinition = structureDefinition;
		structureDefinition = newStructureDefinition;
		boolean oldStructureDefinitionESet = structureDefinitionESet;
		structureDefinitionESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.STRUCTURE_DESCRIPTION__STRUCTURE_DEFINITION, oldStructureDefinition, newStructureDefinition, !oldStructureDefinitionESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStructureDefinition(StructureDefinition newStructureDefinition) {
		if (newStructureDefinition != structureDefinition) {
			NotificationChain msgs = null;
			if (structureDefinition != null)
				msgs = ((InternalEObject)structureDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.STRUCTURE_DESCRIPTION__STRUCTURE_DEFINITION, null, msgs);
			if (newStructureDefinition != null)
				msgs = ((InternalEObject)newStructureDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.STRUCTURE_DESCRIPTION__STRUCTURE_DEFINITION, null, msgs);
			msgs = basicSetStructureDefinition(newStructureDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldStructureDefinitionESet = structureDefinitionESet;
			structureDefinitionESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.STRUCTURE_DESCRIPTION__STRUCTURE_DEFINITION, newStructureDefinition, newStructureDefinition, !oldStructureDefinitionESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetStructureDefinition(NotificationChain msgs) {
		StructureDefinition oldStructureDefinition = structureDefinition;
		structureDefinition = null;
		boolean oldStructureDefinitionESet = structureDefinitionESet;
		structureDefinitionESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.STRUCTURE_DESCRIPTION__STRUCTURE_DEFINITION, oldStructureDefinition, null, oldStructureDefinitionESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStructureDefinition() {
		if (structureDefinition != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)structureDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.STRUCTURE_DESCRIPTION__STRUCTURE_DEFINITION, null, msgs);
			msgs = basicUnsetStructureDefinition(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldStructureDefinitionESet = structureDefinitionESet;
			structureDefinitionESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.STRUCTURE_DESCRIPTION__STRUCTURE_DEFINITION, null, null, oldStructureDefinitionESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStructureDefinition() {
		return structureDefinitionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.STRUCTURE_DESCRIPTION__STRUCTURE_DEFINITION:
				return basicUnsetStructureDefinition(msgs);
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
			case TypesPackage.STRUCTURE_DESCRIPTION__STRUCTURE_DEFINITION:
				return getStructureDefinition();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TypesPackage.STRUCTURE_DESCRIPTION__STRUCTURE_DEFINITION:
				setStructureDefinition((StructureDefinition)newValue);
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
			case TypesPackage.STRUCTURE_DESCRIPTION__STRUCTURE_DEFINITION:
				unsetStructureDefinition();
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
			case TypesPackage.STRUCTURE_DESCRIPTION__STRUCTURE_DEFINITION:
				return isSetStructureDefinition();
		}
		return super.eIsSet(featureID);
	}

} //StructureDescriptionImpl
