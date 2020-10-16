/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.opcfoundation.ua._2008._02.types.DataTypeSchemaHeader;
import org.opcfoundation.ua._2008._02.types.ListOfEnumDescription;
import org.opcfoundation.ua._2008._02.types.ListOfSimpleTypeDescription;
import org.opcfoundation.ua._2008._02.types.ListOfString;
import org.opcfoundation.ua._2008._02.types.ListOfStructureDescription;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Type Schema Header</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DataTypeSchemaHeaderImpl#getNamespaces <em>Namespaces</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DataTypeSchemaHeaderImpl#getStructureDataTypes <em>Structure Data Types</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DataTypeSchemaHeaderImpl#getEnumDataTypes <em>Enum Data Types</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DataTypeSchemaHeaderImpl#getSimpleDataTypes <em>Simple Data Types</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataTypeSchemaHeaderImpl extends MinimalEObjectImpl.Container implements DataTypeSchemaHeader {
	/**
	 * The cached value of the '{@link #getNamespaces() <em>Namespaces</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespaces()
	 * @generated
	 * @ordered
	 */
	protected ListOfString namespaces;

	/**
	 * This is true if the Namespaces containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean namespacesESet;

	/**
	 * The cached value of the '{@link #getStructureDataTypes() <em>Structure Data Types</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructureDataTypes()
	 * @generated
	 * @ordered
	 */
	protected ListOfStructureDescription structureDataTypes;

	/**
	 * This is true if the Structure Data Types containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean structureDataTypesESet;

	/**
	 * The cached value of the '{@link #getEnumDataTypes() <em>Enum Data Types</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnumDataTypes()
	 * @generated
	 * @ordered
	 */
	protected ListOfEnumDescription enumDataTypes;

	/**
	 * This is true if the Enum Data Types containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean enumDataTypesESet;

	/**
	 * The cached value of the '{@link #getSimpleDataTypes() <em>Simple Data Types</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimpleDataTypes()
	 * @generated
	 * @ordered
	 */
	protected ListOfSimpleTypeDescription simpleDataTypes;

	/**
	 * This is true if the Simple Data Types containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean simpleDataTypesESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataTypeSchemaHeaderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getDataTypeSchemaHeader();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfString getNamespaces() {
		return namespaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNamespaces(ListOfString newNamespaces, NotificationChain msgs) {
		ListOfString oldNamespaces = namespaces;
		namespaces = newNamespaces;
		boolean oldNamespacesESet = namespacesESet;
		namespacesESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.DATA_TYPE_SCHEMA_HEADER__NAMESPACES, oldNamespaces, newNamespaces, !oldNamespacesESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNamespaces(ListOfString newNamespaces) {
		if (newNamespaces != namespaces) {
			NotificationChain msgs = null;
			if (namespaces != null)
				msgs = ((InternalEObject)namespaces).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.DATA_TYPE_SCHEMA_HEADER__NAMESPACES, null, msgs);
			if (newNamespaces != null)
				msgs = ((InternalEObject)newNamespaces).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.DATA_TYPE_SCHEMA_HEADER__NAMESPACES, null, msgs);
			msgs = basicSetNamespaces(newNamespaces, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldNamespacesESet = namespacesESet;
			namespacesESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.DATA_TYPE_SCHEMA_HEADER__NAMESPACES, newNamespaces, newNamespaces, !oldNamespacesESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetNamespaces(NotificationChain msgs) {
		ListOfString oldNamespaces = namespaces;
		namespaces = null;
		boolean oldNamespacesESet = namespacesESet;
		namespacesESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.DATA_TYPE_SCHEMA_HEADER__NAMESPACES, oldNamespaces, null, oldNamespacesESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNamespaces() {
		if (namespaces != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)namespaces).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.DATA_TYPE_SCHEMA_HEADER__NAMESPACES, null, msgs);
			msgs = basicUnsetNamespaces(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldNamespacesESet = namespacesESet;
			namespacesESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.DATA_TYPE_SCHEMA_HEADER__NAMESPACES, null, null, oldNamespacesESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNamespaces() {
		return namespacesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfStructureDescription getStructureDataTypes() {
		return structureDataTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStructureDataTypes(ListOfStructureDescription newStructureDataTypes, NotificationChain msgs) {
		ListOfStructureDescription oldStructureDataTypes = structureDataTypes;
		structureDataTypes = newStructureDataTypes;
		boolean oldStructureDataTypesESet = structureDataTypesESet;
		structureDataTypesESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.DATA_TYPE_SCHEMA_HEADER__STRUCTURE_DATA_TYPES, oldStructureDataTypes, newStructureDataTypes, !oldStructureDataTypesESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStructureDataTypes(ListOfStructureDescription newStructureDataTypes) {
		if (newStructureDataTypes != structureDataTypes) {
			NotificationChain msgs = null;
			if (structureDataTypes != null)
				msgs = ((InternalEObject)structureDataTypes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.DATA_TYPE_SCHEMA_HEADER__STRUCTURE_DATA_TYPES, null, msgs);
			if (newStructureDataTypes != null)
				msgs = ((InternalEObject)newStructureDataTypes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.DATA_TYPE_SCHEMA_HEADER__STRUCTURE_DATA_TYPES, null, msgs);
			msgs = basicSetStructureDataTypes(newStructureDataTypes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldStructureDataTypesESet = structureDataTypesESet;
			structureDataTypesESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.DATA_TYPE_SCHEMA_HEADER__STRUCTURE_DATA_TYPES, newStructureDataTypes, newStructureDataTypes, !oldStructureDataTypesESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetStructureDataTypes(NotificationChain msgs) {
		ListOfStructureDescription oldStructureDataTypes = structureDataTypes;
		structureDataTypes = null;
		boolean oldStructureDataTypesESet = structureDataTypesESet;
		structureDataTypesESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.DATA_TYPE_SCHEMA_HEADER__STRUCTURE_DATA_TYPES, oldStructureDataTypes, null, oldStructureDataTypesESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStructureDataTypes() {
		if (structureDataTypes != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)structureDataTypes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.DATA_TYPE_SCHEMA_HEADER__STRUCTURE_DATA_TYPES, null, msgs);
			msgs = basicUnsetStructureDataTypes(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldStructureDataTypesESet = structureDataTypesESet;
			structureDataTypesESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.DATA_TYPE_SCHEMA_HEADER__STRUCTURE_DATA_TYPES, null, null, oldStructureDataTypesESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStructureDataTypes() {
		return structureDataTypesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfEnumDescription getEnumDataTypes() {
		return enumDataTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnumDataTypes(ListOfEnumDescription newEnumDataTypes, NotificationChain msgs) {
		ListOfEnumDescription oldEnumDataTypes = enumDataTypes;
		enumDataTypes = newEnumDataTypes;
		boolean oldEnumDataTypesESet = enumDataTypesESet;
		enumDataTypesESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.DATA_TYPE_SCHEMA_HEADER__ENUM_DATA_TYPES, oldEnumDataTypes, newEnumDataTypes, !oldEnumDataTypesESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnumDataTypes(ListOfEnumDescription newEnumDataTypes) {
		if (newEnumDataTypes != enumDataTypes) {
			NotificationChain msgs = null;
			if (enumDataTypes != null)
				msgs = ((InternalEObject)enumDataTypes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.DATA_TYPE_SCHEMA_HEADER__ENUM_DATA_TYPES, null, msgs);
			if (newEnumDataTypes != null)
				msgs = ((InternalEObject)newEnumDataTypes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.DATA_TYPE_SCHEMA_HEADER__ENUM_DATA_TYPES, null, msgs);
			msgs = basicSetEnumDataTypes(newEnumDataTypes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldEnumDataTypesESet = enumDataTypesESet;
			enumDataTypesESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.DATA_TYPE_SCHEMA_HEADER__ENUM_DATA_TYPES, newEnumDataTypes, newEnumDataTypes, !oldEnumDataTypesESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetEnumDataTypes(NotificationChain msgs) {
		ListOfEnumDescription oldEnumDataTypes = enumDataTypes;
		enumDataTypes = null;
		boolean oldEnumDataTypesESet = enumDataTypesESet;
		enumDataTypesESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.DATA_TYPE_SCHEMA_HEADER__ENUM_DATA_TYPES, oldEnumDataTypes, null, oldEnumDataTypesESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEnumDataTypes() {
		if (enumDataTypes != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)enumDataTypes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.DATA_TYPE_SCHEMA_HEADER__ENUM_DATA_TYPES, null, msgs);
			msgs = basicUnsetEnumDataTypes(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldEnumDataTypesESet = enumDataTypesESet;
			enumDataTypesESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.DATA_TYPE_SCHEMA_HEADER__ENUM_DATA_TYPES, null, null, oldEnumDataTypesESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEnumDataTypes() {
		return enumDataTypesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfSimpleTypeDescription getSimpleDataTypes() {
		return simpleDataTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSimpleDataTypes(ListOfSimpleTypeDescription newSimpleDataTypes, NotificationChain msgs) {
		ListOfSimpleTypeDescription oldSimpleDataTypes = simpleDataTypes;
		simpleDataTypes = newSimpleDataTypes;
		boolean oldSimpleDataTypesESet = simpleDataTypesESet;
		simpleDataTypesESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.DATA_TYPE_SCHEMA_HEADER__SIMPLE_DATA_TYPES, oldSimpleDataTypes, newSimpleDataTypes, !oldSimpleDataTypesESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSimpleDataTypes(ListOfSimpleTypeDescription newSimpleDataTypes) {
		if (newSimpleDataTypes != simpleDataTypes) {
			NotificationChain msgs = null;
			if (simpleDataTypes != null)
				msgs = ((InternalEObject)simpleDataTypes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.DATA_TYPE_SCHEMA_HEADER__SIMPLE_DATA_TYPES, null, msgs);
			if (newSimpleDataTypes != null)
				msgs = ((InternalEObject)newSimpleDataTypes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.DATA_TYPE_SCHEMA_HEADER__SIMPLE_DATA_TYPES, null, msgs);
			msgs = basicSetSimpleDataTypes(newSimpleDataTypes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldSimpleDataTypesESet = simpleDataTypesESet;
			simpleDataTypesESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.DATA_TYPE_SCHEMA_HEADER__SIMPLE_DATA_TYPES, newSimpleDataTypes, newSimpleDataTypes, !oldSimpleDataTypesESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetSimpleDataTypes(NotificationChain msgs) {
		ListOfSimpleTypeDescription oldSimpleDataTypes = simpleDataTypes;
		simpleDataTypes = null;
		boolean oldSimpleDataTypesESet = simpleDataTypesESet;
		simpleDataTypesESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.DATA_TYPE_SCHEMA_HEADER__SIMPLE_DATA_TYPES, oldSimpleDataTypes, null, oldSimpleDataTypesESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSimpleDataTypes() {
		if (simpleDataTypes != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)simpleDataTypes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.DATA_TYPE_SCHEMA_HEADER__SIMPLE_DATA_TYPES, null, msgs);
			msgs = basicUnsetSimpleDataTypes(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldSimpleDataTypesESet = simpleDataTypesESet;
			simpleDataTypesESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.DATA_TYPE_SCHEMA_HEADER__SIMPLE_DATA_TYPES, null, null, oldSimpleDataTypesESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSimpleDataTypes() {
		return simpleDataTypesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.DATA_TYPE_SCHEMA_HEADER__NAMESPACES:
				return basicUnsetNamespaces(msgs);
			case TypesPackage.DATA_TYPE_SCHEMA_HEADER__STRUCTURE_DATA_TYPES:
				return basicUnsetStructureDataTypes(msgs);
			case TypesPackage.DATA_TYPE_SCHEMA_HEADER__ENUM_DATA_TYPES:
				return basicUnsetEnumDataTypes(msgs);
			case TypesPackage.DATA_TYPE_SCHEMA_HEADER__SIMPLE_DATA_TYPES:
				return basicUnsetSimpleDataTypes(msgs);
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
			case TypesPackage.DATA_TYPE_SCHEMA_HEADER__NAMESPACES:
				return getNamespaces();
			case TypesPackage.DATA_TYPE_SCHEMA_HEADER__STRUCTURE_DATA_TYPES:
				return getStructureDataTypes();
			case TypesPackage.DATA_TYPE_SCHEMA_HEADER__ENUM_DATA_TYPES:
				return getEnumDataTypes();
			case TypesPackage.DATA_TYPE_SCHEMA_HEADER__SIMPLE_DATA_TYPES:
				return getSimpleDataTypes();
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
			case TypesPackage.DATA_TYPE_SCHEMA_HEADER__NAMESPACES:
				setNamespaces((ListOfString)newValue);
				return;
			case TypesPackage.DATA_TYPE_SCHEMA_HEADER__STRUCTURE_DATA_TYPES:
				setStructureDataTypes((ListOfStructureDescription)newValue);
				return;
			case TypesPackage.DATA_TYPE_SCHEMA_HEADER__ENUM_DATA_TYPES:
				setEnumDataTypes((ListOfEnumDescription)newValue);
				return;
			case TypesPackage.DATA_TYPE_SCHEMA_HEADER__SIMPLE_DATA_TYPES:
				setSimpleDataTypes((ListOfSimpleTypeDescription)newValue);
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
			case TypesPackage.DATA_TYPE_SCHEMA_HEADER__NAMESPACES:
				unsetNamespaces();
				return;
			case TypesPackage.DATA_TYPE_SCHEMA_HEADER__STRUCTURE_DATA_TYPES:
				unsetStructureDataTypes();
				return;
			case TypesPackage.DATA_TYPE_SCHEMA_HEADER__ENUM_DATA_TYPES:
				unsetEnumDataTypes();
				return;
			case TypesPackage.DATA_TYPE_SCHEMA_HEADER__SIMPLE_DATA_TYPES:
				unsetSimpleDataTypes();
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
			case TypesPackage.DATA_TYPE_SCHEMA_HEADER__NAMESPACES:
				return isSetNamespaces();
			case TypesPackage.DATA_TYPE_SCHEMA_HEADER__STRUCTURE_DATA_TYPES:
				return isSetStructureDataTypes();
			case TypesPackage.DATA_TYPE_SCHEMA_HEADER__ENUM_DATA_TYPES:
				return isSetEnumDataTypes();
			case TypesPackage.DATA_TYPE_SCHEMA_HEADER__SIMPLE_DATA_TYPES:
				return isSetSimpleDataTypes();
		}
		return super.eIsSet(featureID);
	}

} //DataTypeSchemaHeaderImpl
