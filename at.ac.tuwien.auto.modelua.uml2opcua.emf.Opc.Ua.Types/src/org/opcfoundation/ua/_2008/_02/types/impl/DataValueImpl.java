/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.opcfoundation.ua._2008._02.types.DataValue;
import org.opcfoundation.ua._2008._02.types.StatusCode;
import org.opcfoundation.ua._2008._02.types.TypesPackage;
import org.opcfoundation.ua._2008._02.types.Variant;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DataValueImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DataValueImpl#getStatusCode <em>Status Code</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DataValueImpl#getSourceTimestamp <em>Source Timestamp</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DataValueImpl#getSourcePicoseconds <em>Source Picoseconds</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DataValueImpl#getServerTimestamp <em>Server Timestamp</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DataValueImpl#getServerPicoseconds <em>Server Picoseconds</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataValueImpl extends MinimalEObjectImpl.Container implements DataValue {
	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected Variant value;

	/**
	 * The cached value of the '{@link #getStatusCode() <em>Status Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusCode()
	 * @generated
	 * @ordered
	 */
	protected StatusCode statusCode;

	/**
	 * The default value of the '{@link #getSourceTimestamp() <em>Source Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceTimestamp()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar SOURCE_TIMESTAMP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceTimestamp() <em>Source Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceTimestamp()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar sourceTimestamp = SOURCE_TIMESTAMP_EDEFAULT;

	/**
	 * The default value of the '{@link #getSourcePicoseconds() <em>Source Picoseconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourcePicoseconds()
	 * @generated
	 * @ordered
	 */
	protected static final int SOURCE_PICOSECONDS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSourcePicoseconds() <em>Source Picoseconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourcePicoseconds()
	 * @generated
	 * @ordered
	 */
	protected int sourcePicoseconds = SOURCE_PICOSECONDS_EDEFAULT;

	/**
	 * This is true if the Source Picoseconds attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sourcePicosecondsESet;

	/**
	 * The default value of the '{@link #getServerTimestamp() <em>Server Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerTimestamp()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar SERVER_TIMESTAMP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServerTimestamp() <em>Server Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerTimestamp()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar serverTimestamp = SERVER_TIMESTAMP_EDEFAULT;

	/**
	 * The default value of the '{@link #getServerPicoseconds() <em>Server Picoseconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerPicoseconds()
	 * @generated
	 * @ordered
	 */
	protected static final int SERVER_PICOSECONDS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getServerPicoseconds() <em>Server Picoseconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerPicoseconds()
	 * @generated
	 * @ordered
	 */
	protected int serverPicoseconds = SERVER_PICOSECONDS_EDEFAULT;

	/**
	 * This is true if the Server Picoseconds attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean serverPicosecondsESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getDataValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variant getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValue(Variant newValue, NotificationChain msgs) {
		Variant oldValue = value;
		value = newValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.DATA_VALUE__VALUE, oldValue, newValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(Variant newValue) {
		if (newValue != value) {
			NotificationChain msgs = null;
			if (value != null)
				msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.DATA_VALUE__VALUE, null, msgs);
			if (newValue != null)
				msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.DATA_VALUE__VALUE, null, msgs);
			msgs = basicSetValue(newValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.DATA_VALUE__VALUE, newValue, newValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatusCode getStatusCode() {
		return statusCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatusCode(StatusCode newStatusCode, NotificationChain msgs) {
		StatusCode oldStatusCode = statusCode;
		statusCode = newStatusCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.DATA_VALUE__STATUS_CODE, oldStatusCode, newStatusCode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatusCode(StatusCode newStatusCode) {
		if (newStatusCode != statusCode) {
			NotificationChain msgs = null;
			if (statusCode != null)
				msgs = ((InternalEObject)statusCode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.DATA_VALUE__STATUS_CODE, null, msgs);
			if (newStatusCode != null)
				msgs = ((InternalEObject)newStatusCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.DATA_VALUE__STATUS_CODE, null, msgs);
			msgs = basicSetStatusCode(newStatusCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.DATA_VALUE__STATUS_CODE, newStatusCode, newStatusCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getSourceTimestamp() {
		return sourceTimestamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceTimestamp(XMLGregorianCalendar newSourceTimestamp) {
		XMLGregorianCalendar oldSourceTimestamp = sourceTimestamp;
		sourceTimestamp = newSourceTimestamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.DATA_VALUE__SOURCE_TIMESTAMP, oldSourceTimestamp, sourceTimestamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSourcePicoseconds() {
		return sourcePicoseconds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourcePicoseconds(int newSourcePicoseconds) {
		int oldSourcePicoseconds = sourcePicoseconds;
		sourcePicoseconds = newSourcePicoseconds;
		boolean oldSourcePicosecondsESet = sourcePicosecondsESet;
		sourcePicosecondsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.DATA_VALUE__SOURCE_PICOSECONDS, oldSourcePicoseconds, sourcePicoseconds, !oldSourcePicosecondsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSourcePicoseconds() {
		int oldSourcePicoseconds = sourcePicoseconds;
		boolean oldSourcePicosecondsESet = sourcePicosecondsESet;
		sourcePicoseconds = SOURCE_PICOSECONDS_EDEFAULT;
		sourcePicosecondsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.DATA_VALUE__SOURCE_PICOSECONDS, oldSourcePicoseconds, SOURCE_PICOSECONDS_EDEFAULT, oldSourcePicosecondsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSourcePicoseconds() {
		return sourcePicosecondsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getServerTimestamp() {
		return serverTimestamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServerTimestamp(XMLGregorianCalendar newServerTimestamp) {
		XMLGregorianCalendar oldServerTimestamp = serverTimestamp;
		serverTimestamp = newServerTimestamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.DATA_VALUE__SERVER_TIMESTAMP, oldServerTimestamp, serverTimestamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getServerPicoseconds() {
		return serverPicoseconds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServerPicoseconds(int newServerPicoseconds) {
		int oldServerPicoseconds = serverPicoseconds;
		serverPicoseconds = newServerPicoseconds;
		boolean oldServerPicosecondsESet = serverPicosecondsESet;
		serverPicosecondsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.DATA_VALUE__SERVER_PICOSECONDS, oldServerPicoseconds, serverPicoseconds, !oldServerPicosecondsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetServerPicoseconds() {
		int oldServerPicoseconds = serverPicoseconds;
		boolean oldServerPicosecondsESet = serverPicosecondsESet;
		serverPicoseconds = SERVER_PICOSECONDS_EDEFAULT;
		serverPicosecondsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.DATA_VALUE__SERVER_PICOSECONDS, oldServerPicoseconds, SERVER_PICOSECONDS_EDEFAULT, oldServerPicosecondsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetServerPicoseconds() {
		return serverPicosecondsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.DATA_VALUE__VALUE:
				return basicSetValue(null, msgs);
			case TypesPackage.DATA_VALUE__STATUS_CODE:
				return basicSetStatusCode(null, msgs);
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
			case TypesPackage.DATA_VALUE__VALUE:
				return getValue();
			case TypesPackage.DATA_VALUE__STATUS_CODE:
				return getStatusCode();
			case TypesPackage.DATA_VALUE__SOURCE_TIMESTAMP:
				return getSourceTimestamp();
			case TypesPackage.DATA_VALUE__SOURCE_PICOSECONDS:
				return getSourcePicoseconds();
			case TypesPackage.DATA_VALUE__SERVER_TIMESTAMP:
				return getServerTimestamp();
			case TypesPackage.DATA_VALUE__SERVER_PICOSECONDS:
				return getServerPicoseconds();
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
			case TypesPackage.DATA_VALUE__VALUE:
				setValue((Variant)newValue);
				return;
			case TypesPackage.DATA_VALUE__STATUS_CODE:
				setStatusCode((StatusCode)newValue);
				return;
			case TypesPackage.DATA_VALUE__SOURCE_TIMESTAMP:
				setSourceTimestamp((XMLGregorianCalendar)newValue);
				return;
			case TypesPackage.DATA_VALUE__SOURCE_PICOSECONDS:
				setSourcePicoseconds((Integer)newValue);
				return;
			case TypesPackage.DATA_VALUE__SERVER_TIMESTAMP:
				setServerTimestamp((XMLGregorianCalendar)newValue);
				return;
			case TypesPackage.DATA_VALUE__SERVER_PICOSECONDS:
				setServerPicoseconds((Integer)newValue);
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
			case TypesPackage.DATA_VALUE__VALUE:
				setValue((Variant)null);
				return;
			case TypesPackage.DATA_VALUE__STATUS_CODE:
				setStatusCode((StatusCode)null);
				return;
			case TypesPackage.DATA_VALUE__SOURCE_TIMESTAMP:
				setSourceTimestamp(SOURCE_TIMESTAMP_EDEFAULT);
				return;
			case TypesPackage.DATA_VALUE__SOURCE_PICOSECONDS:
				unsetSourcePicoseconds();
				return;
			case TypesPackage.DATA_VALUE__SERVER_TIMESTAMP:
				setServerTimestamp(SERVER_TIMESTAMP_EDEFAULT);
				return;
			case TypesPackage.DATA_VALUE__SERVER_PICOSECONDS:
				unsetServerPicoseconds();
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
			case TypesPackage.DATA_VALUE__VALUE:
				return value != null;
			case TypesPackage.DATA_VALUE__STATUS_CODE:
				return statusCode != null;
			case TypesPackage.DATA_VALUE__SOURCE_TIMESTAMP:
				return SOURCE_TIMESTAMP_EDEFAULT == null ? sourceTimestamp != null : !SOURCE_TIMESTAMP_EDEFAULT.equals(sourceTimestamp);
			case TypesPackage.DATA_VALUE__SOURCE_PICOSECONDS:
				return isSetSourcePicoseconds();
			case TypesPackage.DATA_VALUE__SERVER_TIMESTAMP:
				return SERVER_TIMESTAMP_EDEFAULT == null ? serverTimestamp != null : !SERVER_TIMESTAMP_EDEFAULT.equals(serverTimestamp);
			case TypesPackage.DATA_VALUE__SERVER_PICOSECONDS:
				return isSetServerPicoseconds();
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
		result.append(" (sourceTimestamp: ");
		result.append(sourceTimestamp);
		result.append(", sourcePicoseconds: ");
		if (sourcePicosecondsESet) result.append(sourcePicoseconds); else result.append("<unset>");
		result.append(", serverTimestamp: ");
		result.append(serverTimestamp);
		result.append(", serverPicoseconds: ");
		if (serverPicosecondsESet) result.append(serverPicoseconds); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //DataValueImpl
