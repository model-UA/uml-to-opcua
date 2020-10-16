/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.opcfoundation.ua._2008._02.types.DataTypeNode;
import org.opcfoundation.ua._2008._02.types.ExtensionObject;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Type Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DataTypeNodeImpl#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DataTypeNodeImpl#getDataTypeDefinition <em>Data Type Definition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataTypeNodeImpl extends TypeNodeImpl implements DataTypeNode {
	/**
	 * The default value of the '{@link #isIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ABSTRACT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected boolean isAbstract = IS_ABSTRACT_EDEFAULT;

	/**
	 * This is true if the Is Abstract attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isAbstractESet;

	/**
	 * The cached value of the '{@link #getDataTypeDefinition() <em>Data Type Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataTypeDefinition()
	 * @generated
	 * @ordered
	 */
	protected ExtensionObject dataTypeDefinition;

	/**
	 * This is true if the Data Type Definition containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dataTypeDefinitionESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataTypeNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getDataTypeNode();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsAbstract() {
		return isAbstract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAbstract(boolean newIsAbstract) {
		boolean oldIsAbstract = isAbstract;
		isAbstract = newIsAbstract;
		boolean oldIsAbstractESet = isAbstractESet;
		isAbstractESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.DATA_TYPE_NODE__IS_ABSTRACT, oldIsAbstract, isAbstract, !oldIsAbstractESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsAbstract() {
		boolean oldIsAbstract = isAbstract;
		boolean oldIsAbstractESet = isAbstractESet;
		isAbstract = IS_ABSTRACT_EDEFAULT;
		isAbstractESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.DATA_TYPE_NODE__IS_ABSTRACT, oldIsAbstract, IS_ABSTRACT_EDEFAULT, oldIsAbstractESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsAbstract() {
		return isAbstractESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionObject getDataTypeDefinition() {
		return dataTypeDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataTypeDefinition(ExtensionObject newDataTypeDefinition, NotificationChain msgs) {
		ExtensionObject oldDataTypeDefinition = dataTypeDefinition;
		dataTypeDefinition = newDataTypeDefinition;
		boolean oldDataTypeDefinitionESet = dataTypeDefinitionESet;
		dataTypeDefinitionESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.DATA_TYPE_NODE__DATA_TYPE_DEFINITION, oldDataTypeDefinition, newDataTypeDefinition, !oldDataTypeDefinitionESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataTypeDefinition(ExtensionObject newDataTypeDefinition) {
		if (newDataTypeDefinition != dataTypeDefinition) {
			NotificationChain msgs = null;
			if (dataTypeDefinition != null)
				msgs = ((InternalEObject)dataTypeDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.DATA_TYPE_NODE__DATA_TYPE_DEFINITION, null, msgs);
			if (newDataTypeDefinition != null)
				msgs = ((InternalEObject)newDataTypeDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.DATA_TYPE_NODE__DATA_TYPE_DEFINITION, null, msgs);
			msgs = basicSetDataTypeDefinition(newDataTypeDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldDataTypeDefinitionESet = dataTypeDefinitionESet;
			dataTypeDefinitionESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.DATA_TYPE_NODE__DATA_TYPE_DEFINITION, newDataTypeDefinition, newDataTypeDefinition, !oldDataTypeDefinitionESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetDataTypeDefinition(NotificationChain msgs) {
		ExtensionObject oldDataTypeDefinition = dataTypeDefinition;
		dataTypeDefinition = null;
		boolean oldDataTypeDefinitionESet = dataTypeDefinitionESet;
		dataTypeDefinitionESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.DATA_TYPE_NODE__DATA_TYPE_DEFINITION, oldDataTypeDefinition, null, oldDataTypeDefinitionESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDataTypeDefinition() {
		if (dataTypeDefinition != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)dataTypeDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.DATA_TYPE_NODE__DATA_TYPE_DEFINITION, null, msgs);
			msgs = basicUnsetDataTypeDefinition(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldDataTypeDefinitionESet = dataTypeDefinitionESet;
			dataTypeDefinitionESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.DATA_TYPE_NODE__DATA_TYPE_DEFINITION, null, null, oldDataTypeDefinitionESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDataTypeDefinition() {
		return dataTypeDefinitionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.DATA_TYPE_NODE__DATA_TYPE_DEFINITION:
				return basicUnsetDataTypeDefinition(msgs);
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
			case TypesPackage.DATA_TYPE_NODE__IS_ABSTRACT:
				return isIsAbstract();
			case TypesPackage.DATA_TYPE_NODE__DATA_TYPE_DEFINITION:
				return getDataTypeDefinition();
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
			case TypesPackage.DATA_TYPE_NODE__IS_ABSTRACT:
				setIsAbstract((Boolean)newValue);
				return;
			case TypesPackage.DATA_TYPE_NODE__DATA_TYPE_DEFINITION:
				setDataTypeDefinition((ExtensionObject)newValue);
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
			case TypesPackage.DATA_TYPE_NODE__IS_ABSTRACT:
				unsetIsAbstract();
				return;
			case TypesPackage.DATA_TYPE_NODE__DATA_TYPE_DEFINITION:
				unsetDataTypeDefinition();
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
			case TypesPackage.DATA_TYPE_NODE__IS_ABSTRACT:
				return isSetIsAbstract();
			case TypesPackage.DATA_TYPE_NODE__DATA_TYPE_DEFINITION:
				return isSetDataTypeDefinition();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (isAbstract: ");
		if (isAbstractESet) result.append(isAbstract); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //DataTypeNodeImpl
