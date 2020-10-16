/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.opcfoundation.ua._2008._02.types.DataTypeDescription;
import org.opcfoundation.ua._2008._02.types.NodeId;
import org.opcfoundation.ua._2008._02.types.QualifiedName;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Type Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DataTypeDescriptionImpl#getDataTypeId <em>Data Type Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DataTypeDescriptionImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataTypeDescriptionImpl extends MinimalEObjectImpl.Container implements DataTypeDescription {
	/**
	 * The cached value of the '{@link #getDataTypeId() <em>Data Type Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataTypeId()
	 * @generated
	 * @ordered
	 */
	protected NodeId dataTypeId;

	/**
	 * This is true if the Data Type Id containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dataTypeIdESet;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected QualifiedName name;

	/**
	 * This is true if the Name containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nameESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataTypeDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getDataTypeDescription();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeId getDataTypeId() {
		return dataTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataTypeId(NodeId newDataTypeId, NotificationChain msgs) {
		NodeId oldDataTypeId = dataTypeId;
		dataTypeId = newDataTypeId;
		boolean oldDataTypeIdESet = dataTypeIdESet;
		dataTypeIdESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.DATA_TYPE_DESCRIPTION__DATA_TYPE_ID, oldDataTypeId, newDataTypeId, !oldDataTypeIdESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataTypeId(NodeId newDataTypeId) {
		if (newDataTypeId != dataTypeId) {
			NotificationChain msgs = null;
			if (dataTypeId != null)
				msgs = ((InternalEObject)dataTypeId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.DATA_TYPE_DESCRIPTION__DATA_TYPE_ID, null, msgs);
			if (newDataTypeId != null)
				msgs = ((InternalEObject)newDataTypeId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.DATA_TYPE_DESCRIPTION__DATA_TYPE_ID, null, msgs);
			msgs = basicSetDataTypeId(newDataTypeId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldDataTypeIdESet = dataTypeIdESet;
			dataTypeIdESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.DATA_TYPE_DESCRIPTION__DATA_TYPE_ID, newDataTypeId, newDataTypeId, !oldDataTypeIdESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetDataTypeId(NotificationChain msgs) {
		NodeId oldDataTypeId = dataTypeId;
		dataTypeId = null;
		boolean oldDataTypeIdESet = dataTypeIdESet;
		dataTypeIdESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.DATA_TYPE_DESCRIPTION__DATA_TYPE_ID, oldDataTypeId, null, oldDataTypeIdESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDataTypeId() {
		if (dataTypeId != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)dataTypeId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.DATA_TYPE_DESCRIPTION__DATA_TYPE_ID, null, msgs);
			msgs = basicUnsetDataTypeId(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldDataTypeIdESet = dataTypeIdESet;
			dataTypeIdESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.DATA_TYPE_DESCRIPTION__DATA_TYPE_ID, null, null, oldDataTypeIdESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDataTypeId() {
		return dataTypeIdESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualifiedName getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(QualifiedName newName, NotificationChain msgs) {
		QualifiedName oldName = name;
		name = newName;
		boolean oldNameESet = nameESet;
		nameESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.DATA_TYPE_DESCRIPTION__NAME, oldName, newName, !oldNameESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(QualifiedName newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.DATA_TYPE_DESCRIPTION__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.DATA_TYPE_DESCRIPTION__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldNameESet = nameESet;
			nameESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.DATA_TYPE_DESCRIPTION__NAME, newName, newName, !oldNameESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetName(NotificationChain msgs) {
		QualifiedName oldName = name;
		name = null;
		boolean oldNameESet = nameESet;
		nameESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.DATA_TYPE_DESCRIPTION__NAME, oldName, null, oldNameESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetName() {
		if (name != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.DATA_TYPE_DESCRIPTION__NAME, null, msgs);
			msgs = basicUnsetName(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldNameESet = nameESet;
			nameESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.DATA_TYPE_DESCRIPTION__NAME, null, null, oldNameESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetName() {
		return nameESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.DATA_TYPE_DESCRIPTION__DATA_TYPE_ID:
				return basicUnsetDataTypeId(msgs);
			case TypesPackage.DATA_TYPE_DESCRIPTION__NAME:
				return basicUnsetName(msgs);
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
			case TypesPackage.DATA_TYPE_DESCRIPTION__DATA_TYPE_ID:
				return getDataTypeId();
			case TypesPackage.DATA_TYPE_DESCRIPTION__NAME:
				return getName();
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
			case TypesPackage.DATA_TYPE_DESCRIPTION__DATA_TYPE_ID:
				setDataTypeId((NodeId)newValue);
				return;
			case TypesPackage.DATA_TYPE_DESCRIPTION__NAME:
				setName((QualifiedName)newValue);
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
			case TypesPackage.DATA_TYPE_DESCRIPTION__DATA_TYPE_ID:
				unsetDataTypeId();
				return;
			case TypesPackage.DATA_TYPE_DESCRIPTION__NAME:
				unsetName();
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
			case TypesPackage.DATA_TYPE_DESCRIPTION__DATA_TYPE_ID:
				return isSetDataTypeId();
			case TypesPackage.DATA_TYPE_DESCRIPTION__NAME:
				return isSetName();
		}
		return super.eIsSet(featureID);
	}

} //DataTypeDescriptionImpl
