/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.opcfoundation.ua._2008._02.types.ListOfPubSubConnectionDataType;
import org.opcfoundation.ua._2008._02.types.ListOfPublishedDataSetDataType;
import org.opcfoundation.ua._2008._02.types.PubSubConfigurationDataType;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pub Sub Configuration Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.PubSubConfigurationDataTypeImpl#getPublishedDataSets <em>Published Data Sets</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.PubSubConfigurationDataTypeImpl#getConnections <em>Connections</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.PubSubConfigurationDataTypeImpl#isEnabled <em>Enabled</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PubSubConfigurationDataTypeImpl extends MinimalEObjectImpl.Container implements PubSubConfigurationDataType {
	/**
	 * The cached value of the '{@link #getPublishedDataSets() <em>Published Data Sets</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublishedDataSets()
	 * @generated
	 * @ordered
	 */
	protected ListOfPublishedDataSetDataType publishedDataSets;

	/**
	 * This is true if the Published Data Sets containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean publishedDataSetsESet;

	/**
	 * The cached value of the '{@link #getConnections() <em>Connections</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnections()
	 * @generated
	 * @ordered
	 */
	protected ListOfPubSubConnectionDataType connections;

	/**
	 * This is true if the Connections containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean connectionsESet;

	/**
	 * The default value of the '{@link #isEnabled() <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENABLED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEnabled() <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnabled()
	 * @generated
	 * @ordered
	 */
	protected boolean enabled = ENABLED_EDEFAULT;

	/**
	 * This is true if the Enabled attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean enabledESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PubSubConfigurationDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getPubSubConfigurationDataType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfPublishedDataSetDataType getPublishedDataSets() {
		return publishedDataSets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPublishedDataSets(ListOfPublishedDataSetDataType newPublishedDataSets, NotificationChain msgs) {
		ListOfPublishedDataSetDataType oldPublishedDataSets = publishedDataSets;
		publishedDataSets = newPublishedDataSets;
		boolean oldPublishedDataSetsESet = publishedDataSetsESet;
		publishedDataSetsESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.PUB_SUB_CONFIGURATION_DATA_TYPE__PUBLISHED_DATA_SETS, oldPublishedDataSets, newPublishedDataSets, !oldPublishedDataSetsESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublishedDataSets(ListOfPublishedDataSetDataType newPublishedDataSets) {
		if (newPublishedDataSets != publishedDataSets) {
			NotificationChain msgs = null;
			if (publishedDataSets != null)
				msgs = ((InternalEObject)publishedDataSets).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.PUB_SUB_CONFIGURATION_DATA_TYPE__PUBLISHED_DATA_SETS, null, msgs);
			if (newPublishedDataSets != null)
				msgs = ((InternalEObject)newPublishedDataSets).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.PUB_SUB_CONFIGURATION_DATA_TYPE__PUBLISHED_DATA_SETS, null, msgs);
			msgs = basicSetPublishedDataSets(newPublishedDataSets, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldPublishedDataSetsESet = publishedDataSetsESet;
			publishedDataSetsESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.PUB_SUB_CONFIGURATION_DATA_TYPE__PUBLISHED_DATA_SETS, newPublishedDataSets, newPublishedDataSets, !oldPublishedDataSetsESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetPublishedDataSets(NotificationChain msgs) {
		ListOfPublishedDataSetDataType oldPublishedDataSets = publishedDataSets;
		publishedDataSets = null;
		boolean oldPublishedDataSetsESet = publishedDataSetsESet;
		publishedDataSetsESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.PUB_SUB_CONFIGURATION_DATA_TYPE__PUBLISHED_DATA_SETS, oldPublishedDataSets, null, oldPublishedDataSetsESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPublishedDataSets() {
		if (publishedDataSets != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)publishedDataSets).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.PUB_SUB_CONFIGURATION_DATA_TYPE__PUBLISHED_DATA_SETS, null, msgs);
			msgs = basicUnsetPublishedDataSets(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldPublishedDataSetsESet = publishedDataSetsESet;
			publishedDataSetsESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.PUB_SUB_CONFIGURATION_DATA_TYPE__PUBLISHED_DATA_SETS, null, null, oldPublishedDataSetsESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPublishedDataSets() {
		return publishedDataSetsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfPubSubConnectionDataType getConnections() {
		return connections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConnections(ListOfPubSubConnectionDataType newConnections, NotificationChain msgs) {
		ListOfPubSubConnectionDataType oldConnections = connections;
		connections = newConnections;
		boolean oldConnectionsESet = connectionsESet;
		connectionsESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.PUB_SUB_CONFIGURATION_DATA_TYPE__CONNECTIONS, oldConnections, newConnections, !oldConnectionsESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnections(ListOfPubSubConnectionDataType newConnections) {
		if (newConnections != connections) {
			NotificationChain msgs = null;
			if (connections != null)
				msgs = ((InternalEObject)connections).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.PUB_SUB_CONFIGURATION_DATA_TYPE__CONNECTIONS, null, msgs);
			if (newConnections != null)
				msgs = ((InternalEObject)newConnections).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.PUB_SUB_CONFIGURATION_DATA_TYPE__CONNECTIONS, null, msgs);
			msgs = basicSetConnections(newConnections, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldConnectionsESet = connectionsESet;
			connectionsESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.PUB_SUB_CONFIGURATION_DATA_TYPE__CONNECTIONS, newConnections, newConnections, !oldConnectionsESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetConnections(NotificationChain msgs) {
		ListOfPubSubConnectionDataType oldConnections = connections;
		connections = null;
		boolean oldConnectionsESet = connectionsESet;
		connectionsESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.PUB_SUB_CONFIGURATION_DATA_TYPE__CONNECTIONS, oldConnections, null, oldConnectionsESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetConnections() {
		if (connections != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)connections).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.PUB_SUB_CONFIGURATION_DATA_TYPE__CONNECTIONS, null, msgs);
			msgs = basicUnsetConnections(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldConnectionsESet = connectionsESet;
			connectionsESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.PUB_SUB_CONFIGURATION_DATA_TYPE__CONNECTIONS, null, null, oldConnectionsESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetConnections() {
		return connectionsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEnabled() {
		return enabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnabled(boolean newEnabled) {
		boolean oldEnabled = enabled;
		enabled = newEnabled;
		boolean oldEnabledESet = enabledESet;
		enabledESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.PUB_SUB_CONFIGURATION_DATA_TYPE__ENABLED, oldEnabled, enabled, !oldEnabledESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEnabled() {
		boolean oldEnabled = enabled;
		boolean oldEnabledESet = enabledESet;
		enabled = ENABLED_EDEFAULT;
		enabledESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.PUB_SUB_CONFIGURATION_DATA_TYPE__ENABLED, oldEnabled, ENABLED_EDEFAULT, oldEnabledESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEnabled() {
		return enabledESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.PUB_SUB_CONFIGURATION_DATA_TYPE__PUBLISHED_DATA_SETS:
				return basicUnsetPublishedDataSets(msgs);
			case TypesPackage.PUB_SUB_CONFIGURATION_DATA_TYPE__CONNECTIONS:
				return basicUnsetConnections(msgs);
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
			case TypesPackage.PUB_SUB_CONFIGURATION_DATA_TYPE__PUBLISHED_DATA_SETS:
				return getPublishedDataSets();
			case TypesPackage.PUB_SUB_CONFIGURATION_DATA_TYPE__CONNECTIONS:
				return getConnections();
			case TypesPackage.PUB_SUB_CONFIGURATION_DATA_TYPE__ENABLED:
				return isEnabled();
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
			case TypesPackage.PUB_SUB_CONFIGURATION_DATA_TYPE__PUBLISHED_DATA_SETS:
				setPublishedDataSets((ListOfPublishedDataSetDataType)newValue);
				return;
			case TypesPackage.PUB_SUB_CONFIGURATION_DATA_TYPE__CONNECTIONS:
				setConnections((ListOfPubSubConnectionDataType)newValue);
				return;
			case TypesPackage.PUB_SUB_CONFIGURATION_DATA_TYPE__ENABLED:
				setEnabled((Boolean)newValue);
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
			case TypesPackage.PUB_SUB_CONFIGURATION_DATA_TYPE__PUBLISHED_DATA_SETS:
				unsetPublishedDataSets();
				return;
			case TypesPackage.PUB_SUB_CONFIGURATION_DATA_TYPE__CONNECTIONS:
				unsetConnections();
				return;
			case TypesPackage.PUB_SUB_CONFIGURATION_DATA_TYPE__ENABLED:
				unsetEnabled();
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
			case TypesPackage.PUB_SUB_CONFIGURATION_DATA_TYPE__PUBLISHED_DATA_SETS:
				return isSetPublishedDataSets();
			case TypesPackage.PUB_SUB_CONFIGURATION_DATA_TYPE__CONNECTIONS:
				return isSetConnections();
			case TypesPackage.PUB_SUB_CONFIGURATION_DATA_TYPE__ENABLED:
				return isSetEnabled();
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
		result.append(" (enabled: ");
		if (enabledESet) result.append(enabled); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //PubSubConfigurationDataTypeImpl
