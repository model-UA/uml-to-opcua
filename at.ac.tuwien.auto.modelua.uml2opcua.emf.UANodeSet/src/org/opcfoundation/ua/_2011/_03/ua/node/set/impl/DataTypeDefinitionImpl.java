/**
 */
package org.opcfoundation.ua._2011._03.ua.node.set.impl;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.opcfoundation.ua._2011._03.ua.node.set.DataTypeDefinition;
import org.opcfoundation.ua._2011._03.ua.node.set.DataTypeField;
import org.opcfoundation.ua._2011._03.ua.node.set.SetFactory;
import org.opcfoundation.ua._2011._03.ua.node.set.SetPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Type Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.DataTypeDefinitionImpl#getField <em>Field</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.DataTypeDefinitionImpl#getBaseType <em>Base Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.DataTypeDefinitionImpl#isIsOptionSet <em>Is Option Set</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.DataTypeDefinitionImpl#isIsUnion <em>Is Union</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.DataTypeDefinitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.DataTypeDefinitionImpl#getSymbolicName <em>Symbolic Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataTypeDefinitionImpl extends MinimalEObjectImpl.Container implements DataTypeDefinition {
	/**
	 * The cached value of the '{@link #getField() <em>Field</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getField()
	 * @generated
	 * @ordered
	 */
	protected EList<DataTypeField> field;

	/**
	 * The default value of the '{@link #getBaseType() <em>Base Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseType()
	 * @generated
	 * @ordered
	 */
	protected static final String BASE_TYPE_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getBaseType() <em>Base Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseType()
	 * @generated
	 * @ordered
	 */
	protected String baseType = BASE_TYPE_EDEFAULT;

	/**
	 * This is true if the Base Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean baseTypeESet;

	/**
	 * The default value of the '{@link #isIsOptionSet() <em>Is Option Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsOptionSet()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_OPTION_SET_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsOptionSet() <em>Is Option Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsOptionSet()
	 * @generated
	 * @ordered
	 */
	protected boolean isOptionSet = IS_OPTION_SET_EDEFAULT;

	/**
	 * This is true if the Is Option Set attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isOptionSetESet;

	/**
	 * The default value of the '{@link #isIsUnion() <em>Is Union</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsUnion()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_UNION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsUnion() <em>Is Union</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsUnion()
	 * @generated
	 * @ordered
	 */
	protected boolean isUnion = IS_UNION_EDEFAULT;

	/**
	 * This is true if the Is Union attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isUnionESet;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSymbolicName() <em>Symbolic Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymbolicName()
	 * @generated
	 * @ordered
	 */
	@SuppressWarnings("unchecked")
	protected static final List<String> SYMBOLIC_NAME_EDEFAULT = (List<String>)SetFactory.eINSTANCE.createFromString(SetPackage.eINSTANCE.getSymbolicName(), "");

	/**
	 * The cached value of the '{@link #getSymbolicName() <em>Symbolic Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymbolicName()
	 * @generated
	 * @ordered
	 */
	protected List<String> symbolicName = SYMBOLIC_NAME_EDEFAULT;

	/**
	 * This is true if the Symbolic Name attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean symbolicNameESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataTypeDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SetPackage.Literals.DATA_TYPE_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataTypeField> getField() {
		if (field == null) {
			field = new EObjectContainmentEList<DataTypeField>(DataTypeField.class, this, SetPackage.DATA_TYPE_DEFINITION__FIELD);
		}
		return field;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBaseType() {
		return baseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseType(String newBaseType) {
		String oldBaseType = baseType;
		baseType = newBaseType;
		boolean oldBaseTypeESet = baseTypeESet;
		baseTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SetPackage.DATA_TYPE_DEFINITION__BASE_TYPE, oldBaseType, baseType, !oldBaseTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBaseType() {
		String oldBaseType = baseType;
		boolean oldBaseTypeESet = baseTypeESet;
		baseType = BASE_TYPE_EDEFAULT;
		baseTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SetPackage.DATA_TYPE_DEFINITION__BASE_TYPE, oldBaseType, BASE_TYPE_EDEFAULT, oldBaseTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBaseType() {
		return baseTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsOptionSet() {
		return isOptionSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsOptionSet(boolean newIsOptionSet) {
		boolean oldIsOptionSet = isOptionSet;
		isOptionSet = newIsOptionSet;
		boolean oldIsOptionSetESet = isOptionSetESet;
		isOptionSetESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SetPackage.DATA_TYPE_DEFINITION__IS_OPTION_SET, oldIsOptionSet, isOptionSet, !oldIsOptionSetESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsOptionSet() {
		boolean oldIsOptionSet = isOptionSet;
		boolean oldIsOptionSetESet = isOptionSetESet;
		isOptionSet = IS_OPTION_SET_EDEFAULT;
		isOptionSetESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SetPackage.DATA_TYPE_DEFINITION__IS_OPTION_SET, oldIsOptionSet, IS_OPTION_SET_EDEFAULT, oldIsOptionSetESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsOptionSet() {
		return isOptionSetESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsUnion() {
		return isUnion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsUnion(boolean newIsUnion) {
		boolean oldIsUnion = isUnion;
		isUnion = newIsUnion;
		boolean oldIsUnionESet = isUnionESet;
		isUnionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SetPackage.DATA_TYPE_DEFINITION__IS_UNION, oldIsUnion, isUnion, !oldIsUnionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsUnion() {
		boolean oldIsUnion = isUnion;
		boolean oldIsUnionESet = isUnionESet;
		isUnion = IS_UNION_EDEFAULT;
		isUnionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SetPackage.DATA_TYPE_DEFINITION__IS_UNION, oldIsUnion, IS_UNION_EDEFAULT, oldIsUnionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsUnion() {
		return isUnionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SetPackage.DATA_TYPE_DEFINITION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> getSymbolicName() {
		return symbolicName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSymbolicName(List<String> newSymbolicName) {
		List<String> oldSymbolicName = symbolicName;
		symbolicName = newSymbolicName;
		boolean oldSymbolicNameESet = symbolicNameESet;
		symbolicNameESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SetPackage.DATA_TYPE_DEFINITION__SYMBOLIC_NAME, oldSymbolicName, symbolicName, !oldSymbolicNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSymbolicName() {
		List<String> oldSymbolicName = symbolicName;
		boolean oldSymbolicNameESet = symbolicNameESet;
		symbolicName = SYMBOLIC_NAME_EDEFAULT;
		symbolicNameESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SetPackage.DATA_TYPE_DEFINITION__SYMBOLIC_NAME, oldSymbolicName, SYMBOLIC_NAME_EDEFAULT, oldSymbolicNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSymbolicName() {
		return symbolicNameESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SetPackage.DATA_TYPE_DEFINITION__FIELD:
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
			case SetPackage.DATA_TYPE_DEFINITION__FIELD:
				return getField();
			case SetPackage.DATA_TYPE_DEFINITION__BASE_TYPE:
				return getBaseType();
			case SetPackage.DATA_TYPE_DEFINITION__IS_OPTION_SET:
				return isIsOptionSet();
			case SetPackage.DATA_TYPE_DEFINITION__IS_UNION:
				return isIsUnion();
			case SetPackage.DATA_TYPE_DEFINITION__NAME:
				return getName();
			case SetPackage.DATA_TYPE_DEFINITION__SYMBOLIC_NAME:
				return getSymbolicName();
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
			case SetPackage.DATA_TYPE_DEFINITION__FIELD:
				getField().clear();
				getField().addAll((Collection<? extends DataTypeField>)newValue);
				return;
			case SetPackage.DATA_TYPE_DEFINITION__BASE_TYPE:
				setBaseType((String)newValue);
				return;
			case SetPackage.DATA_TYPE_DEFINITION__IS_OPTION_SET:
				setIsOptionSet((Boolean)newValue);
				return;
			case SetPackage.DATA_TYPE_DEFINITION__IS_UNION:
				setIsUnion((Boolean)newValue);
				return;
			case SetPackage.DATA_TYPE_DEFINITION__NAME:
				setName((String)newValue);
				return;
			case SetPackage.DATA_TYPE_DEFINITION__SYMBOLIC_NAME:
				setSymbolicName((List<String>)newValue);
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
			case SetPackage.DATA_TYPE_DEFINITION__FIELD:
				getField().clear();
				return;
			case SetPackage.DATA_TYPE_DEFINITION__BASE_TYPE:
				unsetBaseType();
				return;
			case SetPackage.DATA_TYPE_DEFINITION__IS_OPTION_SET:
				unsetIsOptionSet();
				return;
			case SetPackage.DATA_TYPE_DEFINITION__IS_UNION:
				unsetIsUnion();
				return;
			case SetPackage.DATA_TYPE_DEFINITION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SetPackage.DATA_TYPE_DEFINITION__SYMBOLIC_NAME:
				unsetSymbolicName();
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
			case SetPackage.DATA_TYPE_DEFINITION__FIELD:
				return field != null && !field.isEmpty();
			case SetPackage.DATA_TYPE_DEFINITION__BASE_TYPE:
				return isSetBaseType();
			case SetPackage.DATA_TYPE_DEFINITION__IS_OPTION_SET:
				return isSetIsOptionSet();
			case SetPackage.DATA_TYPE_DEFINITION__IS_UNION:
				return isSetIsUnion();
			case SetPackage.DATA_TYPE_DEFINITION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SetPackage.DATA_TYPE_DEFINITION__SYMBOLIC_NAME:
				return isSetSymbolicName();
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
		result.append(" (baseType: ");
		if (baseTypeESet) result.append(baseType); else result.append("<unset>");
		result.append(", isOptionSet: ");
		if (isOptionSetESet) result.append(isOptionSet); else result.append("<unset>");
		result.append(", isUnion: ");
		if (isUnionESet) result.append(isUnion); else result.append("<unset>");
		result.append(", name: ");
		result.append(name);
		result.append(", symbolicName: ");
		if (symbolicNameESet) result.append(symbolicName); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //DataTypeDefinitionImpl
