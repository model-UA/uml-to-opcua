/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.opcfoundation.ua._2008._02.types.ListOfStructureField;
import org.opcfoundation.ua._2008._02.types.NodeId;
import org.opcfoundation.ua._2008._02.types.StructureDefinition;
import org.opcfoundation.ua._2008._02.types.StructureType;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Structure Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.StructureDefinitionImpl#getDefaultEncodingId <em>Default Encoding Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.StructureDefinitionImpl#getBaseDataType <em>Base Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.StructureDefinitionImpl#getStructureType <em>Structure Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.StructureDefinitionImpl#getFields <em>Fields</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StructureDefinitionImpl extends DataTypeDefinitionImpl implements StructureDefinition {
	/**
	 * The cached value of the '{@link #getDefaultEncodingId() <em>Default Encoding Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultEncodingId()
	 * @generated
	 * @ordered
	 */
	protected NodeId defaultEncodingId;

	/**
	 * This is true if the Default Encoding Id containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean defaultEncodingIdESet;

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
	 * The default value of the '{@link #getStructureType() <em>Structure Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructureType()
	 * @generated
	 * @ordered
	 */
	protected static final StructureType STRUCTURE_TYPE_EDEFAULT = StructureType.STRUCTURE0;

	/**
	 * The cached value of the '{@link #getStructureType() <em>Structure Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructureType()
	 * @generated
	 * @ordered
	 */
	protected StructureType structureType = STRUCTURE_TYPE_EDEFAULT;

	/**
	 * This is true if the Structure Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean structureTypeESet;

	/**
	 * The cached value of the '{@link #getFields() <em>Fields</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFields()
	 * @generated
	 * @ordered
	 */
	protected ListOfStructureField fields;

	/**
	 * This is true if the Fields containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fieldsESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructureDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getStructureDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeId getDefaultEncodingId() {
		return defaultEncodingId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultEncodingId(NodeId newDefaultEncodingId, NotificationChain msgs) {
		NodeId oldDefaultEncodingId = defaultEncodingId;
		defaultEncodingId = newDefaultEncodingId;
		boolean oldDefaultEncodingIdESet = defaultEncodingIdESet;
		defaultEncodingIdESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.STRUCTURE_DEFINITION__DEFAULT_ENCODING_ID, oldDefaultEncodingId, newDefaultEncodingId, !oldDefaultEncodingIdESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultEncodingId(NodeId newDefaultEncodingId) {
		if (newDefaultEncodingId != defaultEncodingId) {
			NotificationChain msgs = null;
			if (defaultEncodingId != null)
				msgs = ((InternalEObject)defaultEncodingId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.STRUCTURE_DEFINITION__DEFAULT_ENCODING_ID, null, msgs);
			if (newDefaultEncodingId != null)
				msgs = ((InternalEObject)newDefaultEncodingId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.STRUCTURE_DEFINITION__DEFAULT_ENCODING_ID, null, msgs);
			msgs = basicSetDefaultEncodingId(newDefaultEncodingId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldDefaultEncodingIdESet = defaultEncodingIdESet;
			defaultEncodingIdESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.STRUCTURE_DEFINITION__DEFAULT_ENCODING_ID, newDefaultEncodingId, newDefaultEncodingId, !oldDefaultEncodingIdESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetDefaultEncodingId(NotificationChain msgs) {
		NodeId oldDefaultEncodingId = defaultEncodingId;
		defaultEncodingId = null;
		boolean oldDefaultEncodingIdESet = defaultEncodingIdESet;
		defaultEncodingIdESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.STRUCTURE_DEFINITION__DEFAULT_ENCODING_ID, oldDefaultEncodingId, null, oldDefaultEncodingIdESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDefaultEncodingId() {
		if (defaultEncodingId != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)defaultEncodingId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.STRUCTURE_DEFINITION__DEFAULT_ENCODING_ID, null, msgs);
			msgs = basicUnsetDefaultEncodingId(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldDefaultEncodingIdESet = defaultEncodingIdESet;
			defaultEncodingIdESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.STRUCTURE_DEFINITION__DEFAULT_ENCODING_ID, null, null, oldDefaultEncodingIdESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDefaultEncodingId() {
		return defaultEncodingIdESet;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.STRUCTURE_DEFINITION__BASE_DATA_TYPE, oldBaseDataType, newBaseDataType, !oldBaseDataTypeESet);
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
				msgs = ((InternalEObject)baseDataType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.STRUCTURE_DEFINITION__BASE_DATA_TYPE, null, msgs);
			if (newBaseDataType != null)
				msgs = ((InternalEObject)newBaseDataType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.STRUCTURE_DEFINITION__BASE_DATA_TYPE, null, msgs);
			msgs = basicSetBaseDataType(newBaseDataType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldBaseDataTypeESet = baseDataTypeESet;
			baseDataTypeESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.STRUCTURE_DEFINITION__BASE_DATA_TYPE, newBaseDataType, newBaseDataType, !oldBaseDataTypeESet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.STRUCTURE_DEFINITION__BASE_DATA_TYPE, oldBaseDataType, null, oldBaseDataTypeESet);
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
			msgs = ((InternalEObject)baseDataType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.STRUCTURE_DEFINITION__BASE_DATA_TYPE, null, msgs);
			msgs = basicUnsetBaseDataType(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldBaseDataTypeESet = baseDataTypeESet;
			baseDataTypeESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.STRUCTURE_DEFINITION__BASE_DATA_TYPE, null, null, oldBaseDataTypeESet));
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
	public StructureType getStructureType() {
		return structureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStructureType(StructureType newStructureType) {
		StructureType oldStructureType = structureType;
		structureType = newStructureType == null ? STRUCTURE_TYPE_EDEFAULT : newStructureType;
		boolean oldStructureTypeESet = structureTypeESet;
		structureTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.STRUCTURE_DEFINITION__STRUCTURE_TYPE, oldStructureType, structureType, !oldStructureTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStructureType() {
		StructureType oldStructureType = structureType;
		boolean oldStructureTypeESet = structureTypeESet;
		structureType = STRUCTURE_TYPE_EDEFAULT;
		structureTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.STRUCTURE_DEFINITION__STRUCTURE_TYPE, oldStructureType, STRUCTURE_TYPE_EDEFAULT, oldStructureTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStructureType() {
		return structureTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfStructureField getFields() {
		return fields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFields(ListOfStructureField newFields, NotificationChain msgs) {
		ListOfStructureField oldFields = fields;
		fields = newFields;
		boolean oldFieldsESet = fieldsESet;
		fieldsESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.STRUCTURE_DEFINITION__FIELDS, oldFields, newFields, !oldFieldsESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFields(ListOfStructureField newFields) {
		if (newFields != fields) {
			NotificationChain msgs = null;
			if (fields != null)
				msgs = ((InternalEObject)fields).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.STRUCTURE_DEFINITION__FIELDS, null, msgs);
			if (newFields != null)
				msgs = ((InternalEObject)newFields).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.STRUCTURE_DEFINITION__FIELDS, null, msgs);
			msgs = basicSetFields(newFields, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldFieldsESet = fieldsESet;
			fieldsESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.STRUCTURE_DEFINITION__FIELDS, newFields, newFields, !oldFieldsESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetFields(NotificationChain msgs) {
		ListOfStructureField oldFields = fields;
		fields = null;
		boolean oldFieldsESet = fieldsESet;
		fieldsESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.STRUCTURE_DEFINITION__FIELDS, oldFields, null, oldFieldsESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFields() {
		if (fields != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)fields).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.STRUCTURE_DEFINITION__FIELDS, null, msgs);
			msgs = basicUnsetFields(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldFieldsESet = fieldsESet;
			fieldsESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.STRUCTURE_DEFINITION__FIELDS, null, null, oldFieldsESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFields() {
		return fieldsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.STRUCTURE_DEFINITION__DEFAULT_ENCODING_ID:
				return basicUnsetDefaultEncodingId(msgs);
			case TypesPackage.STRUCTURE_DEFINITION__BASE_DATA_TYPE:
				return basicUnsetBaseDataType(msgs);
			case TypesPackage.STRUCTURE_DEFINITION__FIELDS:
				return basicUnsetFields(msgs);
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
			case TypesPackage.STRUCTURE_DEFINITION__DEFAULT_ENCODING_ID:
				return getDefaultEncodingId();
			case TypesPackage.STRUCTURE_DEFINITION__BASE_DATA_TYPE:
				return getBaseDataType();
			case TypesPackage.STRUCTURE_DEFINITION__STRUCTURE_TYPE:
				return getStructureType();
			case TypesPackage.STRUCTURE_DEFINITION__FIELDS:
				return getFields();
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
			case TypesPackage.STRUCTURE_DEFINITION__DEFAULT_ENCODING_ID:
				setDefaultEncodingId((NodeId)newValue);
				return;
			case TypesPackage.STRUCTURE_DEFINITION__BASE_DATA_TYPE:
				setBaseDataType((NodeId)newValue);
				return;
			case TypesPackage.STRUCTURE_DEFINITION__STRUCTURE_TYPE:
				setStructureType((StructureType)newValue);
				return;
			case TypesPackage.STRUCTURE_DEFINITION__FIELDS:
				setFields((ListOfStructureField)newValue);
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
			case TypesPackage.STRUCTURE_DEFINITION__DEFAULT_ENCODING_ID:
				unsetDefaultEncodingId();
				return;
			case TypesPackage.STRUCTURE_DEFINITION__BASE_DATA_TYPE:
				unsetBaseDataType();
				return;
			case TypesPackage.STRUCTURE_DEFINITION__STRUCTURE_TYPE:
				unsetStructureType();
				return;
			case TypesPackage.STRUCTURE_DEFINITION__FIELDS:
				unsetFields();
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
			case TypesPackage.STRUCTURE_DEFINITION__DEFAULT_ENCODING_ID:
				return isSetDefaultEncodingId();
			case TypesPackage.STRUCTURE_DEFINITION__BASE_DATA_TYPE:
				return isSetBaseDataType();
			case TypesPackage.STRUCTURE_DEFINITION__STRUCTURE_TYPE:
				return isSetStructureType();
			case TypesPackage.STRUCTURE_DEFINITION__FIELDS:
				return isSetFields();
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
		result.append(" (structureType: ");
		if (structureTypeESet) result.append(structureType); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //StructureDefinitionImpl
