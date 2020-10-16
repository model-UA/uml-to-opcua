/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.opcfoundation.ua._2008._02.types.EnumDefinition;
import org.opcfoundation.ua._2008._02.types.ListOfEnumField;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enum Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.EnumDefinitionImpl#getFields <em>Fields</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnumDefinitionImpl extends DataTypeDefinitionImpl implements EnumDefinition {
	/**
	 * The cached value of the '{@link #getFields() <em>Fields</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFields()
	 * @generated
	 * @ordered
	 */
	protected ListOfEnumField fields;

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
	protected EnumDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getEnumDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfEnumField getFields() {
		return fields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFields(ListOfEnumField newFields, NotificationChain msgs) {
		ListOfEnumField oldFields = fields;
		fields = newFields;
		boolean oldFieldsESet = fieldsESet;
		fieldsESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.ENUM_DEFINITION__FIELDS, oldFields, newFields, !oldFieldsESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFields(ListOfEnumField newFields) {
		if (newFields != fields) {
			NotificationChain msgs = null;
			if (fields != null)
				msgs = ((InternalEObject)fields).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.ENUM_DEFINITION__FIELDS, null, msgs);
			if (newFields != null)
				msgs = ((InternalEObject)newFields).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.ENUM_DEFINITION__FIELDS, null, msgs);
			msgs = basicSetFields(newFields, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldFieldsESet = fieldsESet;
			fieldsESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.ENUM_DEFINITION__FIELDS, newFields, newFields, !oldFieldsESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetFields(NotificationChain msgs) {
		ListOfEnumField oldFields = fields;
		fields = null;
		boolean oldFieldsESet = fieldsESet;
		fieldsESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.ENUM_DEFINITION__FIELDS, oldFields, null, oldFieldsESet);
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
			msgs = ((InternalEObject)fields).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.ENUM_DEFINITION__FIELDS, null, msgs);
			msgs = basicUnsetFields(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldFieldsESet = fieldsESet;
			fieldsESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.ENUM_DEFINITION__FIELDS, null, null, oldFieldsESet));
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
			case TypesPackage.ENUM_DEFINITION__FIELDS:
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
			case TypesPackage.ENUM_DEFINITION__FIELDS:
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
			case TypesPackage.ENUM_DEFINITION__FIELDS:
				setFields((ListOfEnumField)newValue);
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
			case TypesPackage.ENUM_DEFINITION__FIELDS:
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
			case TypesPackage.ENUM_DEFINITION__FIELDS:
				return isSetFields();
		}
		return super.eIsSet(featureID);
	}

} //EnumDefinitionImpl
