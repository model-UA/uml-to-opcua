/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.opcfoundation.ua._2008._02.types.NodeId;
import org.opcfoundation.ua._2008._02.types.SimpleTypeDescription;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Type Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.SimpleTypeDescriptionImpl#getBaseDataType <em>Base Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.SimpleTypeDescriptionImpl#getBuiltInType <em>Built In Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SimpleTypeDescriptionImpl extends DataTypeDescriptionImpl implements SimpleTypeDescription {
	/**
	 * The cached value of the '{@link #getBaseDataType() <em>Base Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseDataType()
	 * @generated
	 * @ordered
	 */
	protected NodeId baseDataType;

	/**
	 * This is true if the Base Data Type containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean baseDataTypeESet;

	/**
	 * The default value of the '{@link #getBuiltInType() <em>Built In Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuiltInType()
	 * @generated
	 * @ordered
	 */
	protected static final short BUILT_IN_TYPE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBuiltInType() <em>Built In Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuiltInType()
	 * @generated
	 * @ordered
	 */
	protected short builtInType = BUILT_IN_TYPE_EDEFAULT;

	/**
	 * This is true if the Built In Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean builtInTypeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleTypeDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getSimpleTypeDescription();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeId getBaseDataType() {
		return baseDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBaseDataType(NodeId newBaseDataType, NotificationChain msgs) {
		NodeId oldBaseDataType = baseDataType;
		baseDataType = newBaseDataType;
		boolean oldBaseDataTypeESet = baseDataTypeESet;
		baseDataTypeESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.SIMPLE_TYPE_DESCRIPTION__BASE_DATA_TYPE, oldBaseDataType, newBaseDataType, !oldBaseDataTypeESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseDataType(NodeId newBaseDataType) {
		if (newBaseDataType != baseDataType) {
			NotificationChain msgs = null;
			if (baseDataType != null)
				msgs = ((InternalEObject)baseDataType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SIMPLE_TYPE_DESCRIPTION__BASE_DATA_TYPE, null, msgs);
			if (newBaseDataType != null)
				msgs = ((InternalEObject)newBaseDataType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SIMPLE_TYPE_DESCRIPTION__BASE_DATA_TYPE, null, msgs);
			msgs = basicSetBaseDataType(newBaseDataType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldBaseDataTypeESet = baseDataTypeESet;
			baseDataTypeESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SIMPLE_TYPE_DESCRIPTION__BASE_DATA_TYPE, newBaseDataType, newBaseDataType, !oldBaseDataTypeESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetBaseDataType(NotificationChain msgs) {
		NodeId oldBaseDataType = baseDataType;
		baseDataType = null;
		boolean oldBaseDataTypeESet = baseDataTypeESet;
		baseDataTypeESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.SIMPLE_TYPE_DESCRIPTION__BASE_DATA_TYPE, oldBaseDataType, null, oldBaseDataTypeESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBaseDataType() {
		if (baseDataType != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)baseDataType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SIMPLE_TYPE_DESCRIPTION__BASE_DATA_TYPE, null, msgs);
			msgs = basicUnsetBaseDataType(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldBaseDataTypeESet = baseDataTypeESet;
			baseDataTypeESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.SIMPLE_TYPE_DESCRIPTION__BASE_DATA_TYPE, null, null, oldBaseDataTypeESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBaseDataType() {
		return baseDataTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public short getBuiltInType() {
		return builtInType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBuiltInType(short newBuiltInType) {
		short oldBuiltInType = builtInType;
		builtInType = newBuiltInType;
		boolean oldBuiltInTypeESet = builtInTypeESet;
		builtInTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SIMPLE_TYPE_DESCRIPTION__BUILT_IN_TYPE, oldBuiltInType, builtInType, !oldBuiltInTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBuiltInType() {
		short oldBuiltInType = builtInType;
		boolean oldBuiltInTypeESet = builtInTypeESet;
		builtInType = BUILT_IN_TYPE_EDEFAULT;
		builtInTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.SIMPLE_TYPE_DESCRIPTION__BUILT_IN_TYPE, oldBuiltInType, BUILT_IN_TYPE_EDEFAULT, oldBuiltInTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBuiltInType() {
		return builtInTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.SIMPLE_TYPE_DESCRIPTION__BASE_DATA_TYPE:
				return basicUnsetBaseDataType(msgs);
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
			case TypesPackage.SIMPLE_TYPE_DESCRIPTION__BASE_DATA_TYPE:
				return getBaseDataType();
			case TypesPackage.SIMPLE_TYPE_DESCRIPTION__BUILT_IN_TYPE:
				return getBuiltInType();
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
			case TypesPackage.SIMPLE_TYPE_DESCRIPTION__BASE_DATA_TYPE:
				setBaseDataType((NodeId)newValue);
				return;
			case TypesPackage.SIMPLE_TYPE_DESCRIPTION__BUILT_IN_TYPE:
				setBuiltInType((Short)newValue);
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
			case TypesPackage.SIMPLE_TYPE_DESCRIPTION__BASE_DATA_TYPE:
				unsetBaseDataType();
				return;
			case TypesPackage.SIMPLE_TYPE_DESCRIPTION__BUILT_IN_TYPE:
				unsetBuiltInType();
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
			case TypesPackage.SIMPLE_TYPE_DESCRIPTION__BASE_DATA_TYPE:
				return isSetBaseDataType();
			case TypesPackage.SIMPLE_TYPE_DESCRIPTION__BUILT_IN_TYPE:
				return isSetBuiltInType();
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
		result.append(" (builtInType: ");
		if (builtInTypeESet) result.append(builtInType); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //SimpleTypeDescriptionImpl
