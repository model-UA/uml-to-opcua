/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.opcfoundation.ua._2008._02.types.ListOfPublishedVariableDataType;
import org.opcfoundation.ua._2008._02.types.PublishedDataItemsDataType;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Published Data Items Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.PublishedDataItemsDataTypeImpl#getPublishedData <em>Published Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PublishedDataItemsDataTypeImpl extends PublishedDataSetSourceDataTypeImpl implements PublishedDataItemsDataType {
	/**
	 * The cached value of the '{@link #getPublishedData() <em>Published Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublishedData()
	 * @generated
	 * @ordered
	 */
	protected ListOfPublishedVariableDataType publishedData;

	/**
	 * This is true if the Published Data containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean publishedDataESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PublishedDataItemsDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getPublishedDataItemsDataType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfPublishedVariableDataType getPublishedData() {
		return publishedData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPublishedData(ListOfPublishedVariableDataType newPublishedData, NotificationChain msgs) {
		ListOfPublishedVariableDataType oldPublishedData = publishedData;
		publishedData = newPublishedData;
		boolean oldPublishedDataESet = publishedDataESet;
		publishedDataESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.PUBLISHED_DATA_ITEMS_DATA_TYPE__PUBLISHED_DATA, oldPublishedData, newPublishedData, !oldPublishedDataESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublishedData(ListOfPublishedVariableDataType newPublishedData) {
		if (newPublishedData != publishedData) {
			NotificationChain msgs = null;
			if (publishedData != null)
				msgs = ((InternalEObject)publishedData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.PUBLISHED_DATA_ITEMS_DATA_TYPE__PUBLISHED_DATA, null, msgs);
			if (newPublishedData != null)
				msgs = ((InternalEObject)newPublishedData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.PUBLISHED_DATA_ITEMS_DATA_TYPE__PUBLISHED_DATA, null, msgs);
			msgs = basicSetPublishedData(newPublishedData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldPublishedDataESet = publishedDataESet;
			publishedDataESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.PUBLISHED_DATA_ITEMS_DATA_TYPE__PUBLISHED_DATA, newPublishedData, newPublishedData, !oldPublishedDataESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetPublishedData(NotificationChain msgs) {
		ListOfPublishedVariableDataType oldPublishedData = publishedData;
		publishedData = null;
		boolean oldPublishedDataESet = publishedDataESet;
		publishedDataESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.PUBLISHED_DATA_ITEMS_DATA_TYPE__PUBLISHED_DATA, oldPublishedData, null, oldPublishedDataESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPublishedData() {
		if (publishedData != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)publishedData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.PUBLISHED_DATA_ITEMS_DATA_TYPE__PUBLISHED_DATA, null, msgs);
			msgs = basicUnsetPublishedData(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldPublishedDataESet = publishedDataESet;
			publishedDataESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.PUBLISHED_DATA_ITEMS_DATA_TYPE__PUBLISHED_DATA, null, null, oldPublishedDataESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPublishedData() {
		return publishedDataESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.PUBLISHED_DATA_ITEMS_DATA_TYPE__PUBLISHED_DATA:
				return basicUnsetPublishedData(msgs);
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
			case TypesPackage.PUBLISHED_DATA_ITEMS_DATA_TYPE__PUBLISHED_DATA:
				return getPublishedData();
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
			case TypesPackage.PUBLISHED_DATA_ITEMS_DATA_TYPE__PUBLISHED_DATA:
				setPublishedData((ListOfPublishedVariableDataType)newValue);
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
			case TypesPackage.PUBLISHED_DATA_ITEMS_DATA_TYPE__PUBLISHED_DATA:
				unsetPublishedData();
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
			case TypesPackage.PUBLISHED_DATA_ITEMS_DATA_TYPE__PUBLISHED_DATA:
				return isSetPublishedData();
		}
		return super.eIsSet(featureID);
	}

} //PublishedDataItemsDataTypeImpl
