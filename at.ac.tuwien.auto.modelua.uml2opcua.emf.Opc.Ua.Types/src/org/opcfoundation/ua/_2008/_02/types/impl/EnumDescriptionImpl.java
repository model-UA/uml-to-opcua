/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.opcfoundation.ua._2008._02.types.EnumDefinition;
import org.opcfoundation.ua._2008._02.types.EnumDescription;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enum Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.EnumDescriptionImpl#getEnumDefinition <em>Enum Definition</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.EnumDescriptionImpl#getBuiltInType <em>Built In Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnumDescriptionImpl extends DataTypeDescriptionImpl implements EnumDescription {
	/**
	 * The cached value of the '{@link #getEnumDefinition() <em>Enum Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnumDefinition()
	 * @generated
	 * @ordered
	 */
	protected EnumDefinition enumDefinition;

	/**
	 * This is true if the Enum Definition containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean enumDefinitionESet;

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
	protected EnumDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getEnumDescription();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumDefinition getEnumDefinition() {
		return enumDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnumDefinition(EnumDefinition newEnumDefinition, NotificationChain msgs) {
		EnumDefinition oldEnumDefinition = enumDefinition;
		enumDefinition = newEnumDefinition;
		boolean oldEnumDefinitionESet = enumDefinitionESet;
		enumDefinitionESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.ENUM_DESCRIPTION__ENUM_DEFINITION, oldEnumDefinition, newEnumDefinition, !oldEnumDefinitionESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnumDefinition(EnumDefinition newEnumDefinition) {
		if (newEnumDefinition != enumDefinition) {
			NotificationChain msgs = null;
			if (enumDefinition != null)
				msgs = ((InternalEObject)enumDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.ENUM_DESCRIPTION__ENUM_DEFINITION, null, msgs);
			if (newEnumDefinition != null)
				msgs = ((InternalEObject)newEnumDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.ENUM_DESCRIPTION__ENUM_DEFINITION, null, msgs);
			msgs = basicSetEnumDefinition(newEnumDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldEnumDefinitionESet = enumDefinitionESet;
			enumDefinitionESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.ENUM_DESCRIPTION__ENUM_DEFINITION, newEnumDefinition, newEnumDefinition, !oldEnumDefinitionESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetEnumDefinition(NotificationChain msgs) {
		EnumDefinition oldEnumDefinition = enumDefinition;
		enumDefinition = null;
		boolean oldEnumDefinitionESet = enumDefinitionESet;
		enumDefinitionESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.ENUM_DESCRIPTION__ENUM_DEFINITION, oldEnumDefinition, null, oldEnumDefinitionESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEnumDefinition() {
		if (enumDefinition != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)enumDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.ENUM_DESCRIPTION__ENUM_DEFINITION, null, msgs);
			msgs = basicUnsetEnumDefinition(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldEnumDefinitionESet = enumDefinitionESet;
			enumDefinitionESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.ENUM_DESCRIPTION__ENUM_DEFINITION, null, null, oldEnumDefinitionESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEnumDefinition() {
		return enumDefinitionESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.ENUM_DESCRIPTION__BUILT_IN_TYPE, oldBuiltInType, builtInType, !oldBuiltInTypeESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.ENUM_DESCRIPTION__BUILT_IN_TYPE, oldBuiltInType, BUILT_IN_TYPE_EDEFAULT, oldBuiltInTypeESet));
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
			case TypesPackage.ENUM_DESCRIPTION__ENUM_DEFINITION:
				return basicUnsetEnumDefinition(msgs);
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
			case TypesPackage.ENUM_DESCRIPTION__ENUM_DEFINITION:
				return getEnumDefinition();
			case TypesPackage.ENUM_DESCRIPTION__BUILT_IN_TYPE:
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
			case TypesPackage.ENUM_DESCRIPTION__ENUM_DEFINITION:
				setEnumDefinition((EnumDefinition)newValue);
				return;
			case TypesPackage.ENUM_DESCRIPTION__BUILT_IN_TYPE:
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
			case TypesPackage.ENUM_DESCRIPTION__ENUM_DEFINITION:
				unsetEnumDefinition();
				return;
			case TypesPackage.ENUM_DESCRIPTION__BUILT_IN_TYPE:
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
			case TypesPackage.ENUM_DESCRIPTION__ENUM_DEFINITION:
				return isSetEnumDefinition();
			case TypesPackage.ENUM_DESCRIPTION__BUILT_IN_TYPE:
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

} //EnumDescriptionImpl
