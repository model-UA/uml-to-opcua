/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.opcfoundation.ua._2008._02.types.ExtensionObject;
import org.opcfoundation.ua._2008._02.types.ListOfDataSetReaderDataType;
import org.opcfoundation.ua._2008._02.types.ReaderGroupDataType;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reader Group Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ReaderGroupDataTypeImpl#getTransportSettings <em>Transport Settings</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ReaderGroupDataTypeImpl#getMessageSettings <em>Message Settings</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ReaderGroupDataTypeImpl#getDataSetReaders <em>Data Set Readers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReaderGroupDataTypeImpl extends PubSubGroupDataTypeImpl implements ReaderGroupDataType {
	/**
	 * The cached value of the '{@link #getTransportSettings() <em>Transport Settings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransportSettings()
	 * @generated
	 * @ordered
	 */
	protected ExtensionObject transportSettings;

	/**
	 * This is true if the Transport Settings containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean transportSettingsESet;

	/**
	 * The cached value of the '{@link #getMessageSettings() <em>Message Settings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageSettings()
	 * @generated
	 * @ordered
	 */
	protected ExtensionObject messageSettings;

	/**
	 * This is true if the Message Settings containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean messageSettingsESet;

	/**
	 * The cached value of the '{@link #getDataSetReaders() <em>Data Set Readers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSetReaders()
	 * @generated
	 * @ordered
	 */
	protected ListOfDataSetReaderDataType dataSetReaders;

	/**
	 * This is true if the Data Set Readers containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dataSetReadersESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReaderGroupDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getReaderGroupDataType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionObject getTransportSettings() {
		return transportSettings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransportSettings(ExtensionObject newTransportSettings, NotificationChain msgs) {
		ExtensionObject oldTransportSettings = transportSettings;
		transportSettings = newTransportSettings;
		boolean oldTransportSettingsESet = transportSettingsESet;
		transportSettingsESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.READER_GROUP_DATA_TYPE__TRANSPORT_SETTINGS, oldTransportSettings, newTransportSettings, !oldTransportSettingsESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransportSettings(ExtensionObject newTransportSettings) {
		if (newTransportSettings != transportSettings) {
			NotificationChain msgs = null;
			if (transportSettings != null)
				msgs = ((InternalEObject)transportSettings).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.READER_GROUP_DATA_TYPE__TRANSPORT_SETTINGS, null, msgs);
			if (newTransportSettings != null)
				msgs = ((InternalEObject)newTransportSettings).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.READER_GROUP_DATA_TYPE__TRANSPORT_SETTINGS, null, msgs);
			msgs = basicSetTransportSettings(newTransportSettings, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldTransportSettingsESet = transportSettingsESet;
			transportSettingsESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.READER_GROUP_DATA_TYPE__TRANSPORT_SETTINGS, newTransportSettings, newTransportSettings, !oldTransportSettingsESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetTransportSettings(NotificationChain msgs) {
		ExtensionObject oldTransportSettings = transportSettings;
		transportSettings = null;
		boolean oldTransportSettingsESet = transportSettingsESet;
		transportSettingsESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.READER_GROUP_DATA_TYPE__TRANSPORT_SETTINGS, oldTransportSettings, null, oldTransportSettingsESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTransportSettings() {
		if (transportSettings != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)transportSettings).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.READER_GROUP_DATA_TYPE__TRANSPORT_SETTINGS, null, msgs);
			msgs = basicUnsetTransportSettings(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldTransportSettingsESet = transportSettingsESet;
			transportSettingsESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.READER_GROUP_DATA_TYPE__TRANSPORT_SETTINGS, null, null, oldTransportSettingsESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTransportSettings() {
		return transportSettingsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionObject getMessageSettings() {
		return messageSettings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMessageSettings(ExtensionObject newMessageSettings, NotificationChain msgs) {
		ExtensionObject oldMessageSettings = messageSettings;
		messageSettings = newMessageSettings;
		boolean oldMessageSettingsESet = messageSettingsESet;
		messageSettingsESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.READER_GROUP_DATA_TYPE__MESSAGE_SETTINGS, oldMessageSettings, newMessageSettings, !oldMessageSettingsESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageSettings(ExtensionObject newMessageSettings) {
		if (newMessageSettings != messageSettings) {
			NotificationChain msgs = null;
			if (messageSettings != null)
				msgs = ((InternalEObject)messageSettings).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.READER_GROUP_DATA_TYPE__MESSAGE_SETTINGS, null, msgs);
			if (newMessageSettings != null)
				msgs = ((InternalEObject)newMessageSettings).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.READER_GROUP_DATA_TYPE__MESSAGE_SETTINGS, null, msgs);
			msgs = basicSetMessageSettings(newMessageSettings, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldMessageSettingsESet = messageSettingsESet;
			messageSettingsESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.READER_GROUP_DATA_TYPE__MESSAGE_SETTINGS, newMessageSettings, newMessageSettings, !oldMessageSettingsESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetMessageSettings(NotificationChain msgs) {
		ExtensionObject oldMessageSettings = messageSettings;
		messageSettings = null;
		boolean oldMessageSettingsESet = messageSettingsESet;
		messageSettingsESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.READER_GROUP_DATA_TYPE__MESSAGE_SETTINGS, oldMessageSettings, null, oldMessageSettingsESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMessageSettings() {
		if (messageSettings != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)messageSettings).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.READER_GROUP_DATA_TYPE__MESSAGE_SETTINGS, null, msgs);
			msgs = basicUnsetMessageSettings(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldMessageSettingsESet = messageSettingsESet;
			messageSettingsESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.READER_GROUP_DATA_TYPE__MESSAGE_SETTINGS, null, null, oldMessageSettingsESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMessageSettings() {
		return messageSettingsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfDataSetReaderDataType getDataSetReaders() {
		return dataSetReaders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataSetReaders(ListOfDataSetReaderDataType newDataSetReaders, NotificationChain msgs) {
		ListOfDataSetReaderDataType oldDataSetReaders = dataSetReaders;
		dataSetReaders = newDataSetReaders;
		boolean oldDataSetReadersESet = dataSetReadersESet;
		dataSetReadersESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.READER_GROUP_DATA_TYPE__DATA_SET_READERS, oldDataSetReaders, newDataSetReaders, !oldDataSetReadersESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataSetReaders(ListOfDataSetReaderDataType newDataSetReaders) {
		if (newDataSetReaders != dataSetReaders) {
			NotificationChain msgs = null;
			if (dataSetReaders != null)
				msgs = ((InternalEObject)dataSetReaders).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.READER_GROUP_DATA_TYPE__DATA_SET_READERS, null, msgs);
			if (newDataSetReaders != null)
				msgs = ((InternalEObject)newDataSetReaders).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.READER_GROUP_DATA_TYPE__DATA_SET_READERS, null, msgs);
			msgs = basicSetDataSetReaders(newDataSetReaders, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldDataSetReadersESet = dataSetReadersESet;
			dataSetReadersESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.READER_GROUP_DATA_TYPE__DATA_SET_READERS, newDataSetReaders, newDataSetReaders, !oldDataSetReadersESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetDataSetReaders(NotificationChain msgs) {
		ListOfDataSetReaderDataType oldDataSetReaders = dataSetReaders;
		dataSetReaders = null;
		boolean oldDataSetReadersESet = dataSetReadersESet;
		dataSetReadersESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.READER_GROUP_DATA_TYPE__DATA_SET_READERS, oldDataSetReaders, null, oldDataSetReadersESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDataSetReaders() {
		if (dataSetReaders != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)dataSetReaders).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.READER_GROUP_DATA_TYPE__DATA_SET_READERS, null, msgs);
			msgs = basicUnsetDataSetReaders(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldDataSetReadersESet = dataSetReadersESet;
			dataSetReadersESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.READER_GROUP_DATA_TYPE__DATA_SET_READERS, null, null, oldDataSetReadersESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDataSetReaders() {
		return dataSetReadersESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.READER_GROUP_DATA_TYPE__TRANSPORT_SETTINGS:
				return basicUnsetTransportSettings(msgs);
			case TypesPackage.READER_GROUP_DATA_TYPE__MESSAGE_SETTINGS:
				return basicUnsetMessageSettings(msgs);
			case TypesPackage.READER_GROUP_DATA_TYPE__DATA_SET_READERS:
				return basicUnsetDataSetReaders(msgs);
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
			case TypesPackage.READER_GROUP_DATA_TYPE__TRANSPORT_SETTINGS:
				return getTransportSettings();
			case TypesPackage.READER_GROUP_DATA_TYPE__MESSAGE_SETTINGS:
				return getMessageSettings();
			case TypesPackage.READER_GROUP_DATA_TYPE__DATA_SET_READERS:
				return getDataSetReaders();
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
			case TypesPackage.READER_GROUP_DATA_TYPE__TRANSPORT_SETTINGS:
				setTransportSettings((ExtensionObject)newValue);
				return;
			case TypesPackage.READER_GROUP_DATA_TYPE__MESSAGE_SETTINGS:
				setMessageSettings((ExtensionObject)newValue);
				return;
			case TypesPackage.READER_GROUP_DATA_TYPE__DATA_SET_READERS:
				setDataSetReaders((ListOfDataSetReaderDataType)newValue);
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
			case TypesPackage.READER_GROUP_DATA_TYPE__TRANSPORT_SETTINGS:
				unsetTransportSettings();
				return;
			case TypesPackage.READER_GROUP_DATA_TYPE__MESSAGE_SETTINGS:
				unsetMessageSettings();
				return;
			case TypesPackage.READER_GROUP_DATA_TYPE__DATA_SET_READERS:
				unsetDataSetReaders();
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
			case TypesPackage.READER_GROUP_DATA_TYPE__TRANSPORT_SETTINGS:
				return isSetTransportSettings();
			case TypesPackage.READER_GROUP_DATA_TYPE__MESSAGE_SETTINGS:
				return isSetMessageSettings();
			case TypesPackage.READER_GROUP_DATA_TYPE__DATA_SET_READERS:
				return isSetDataSetReaders();
		}
		return super.eIsSet(featureID);
	}

} //ReaderGroupDataTypeImpl
