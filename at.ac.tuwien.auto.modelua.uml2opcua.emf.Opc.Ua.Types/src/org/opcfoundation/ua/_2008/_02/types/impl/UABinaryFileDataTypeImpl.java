/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.opcfoundation.ua._2008._02.types.ListOfKeyValuePair;
import org.opcfoundation.ua._2008._02.types.TypesPackage;
import org.opcfoundation.ua._2008._02.types.UABinaryFileDataType;
import org.opcfoundation.ua._2008._02.types.Variant;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UA Binary File Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.UABinaryFileDataTypeImpl#getSchemaLocation <em>Schema Location</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.UABinaryFileDataTypeImpl#getFileHeader <em>File Header</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.UABinaryFileDataTypeImpl#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UABinaryFileDataTypeImpl extends DataTypeSchemaHeaderImpl implements UABinaryFileDataType {
	/**
	 * The default value of the '{@link #getSchemaLocation() <em>Schema Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String SCHEMA_LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSchemaLocation() <em>Schema Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected String schemaLocation = SCHEMA_LOCATION_EDEFAULT;

	/**
	 * This is true if the Schema Location attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean schemaLocationESet;

	/**
	 * The cached value of the '{@link #getFileHeader() <em>File Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileHeader()
	 * @generated
	 * @ordered
	 */
	protected ListOfKeyValuePair fileHeader;

	/**
	 * This is true if the File Header containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fileHeaderESet;

	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected Variant body;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UABinaryFileDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getUABinaryFileDataType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSchemaLocation() {
		return schemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchemaLocation(String newSchemaLocation) {
		String oldSchemaLocation = schemaLocation;
		schemaLocation = newSchemaLocation;
		boolean oldSchemaLocationESet = schemaLocationESet;
		schemaLocationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.UA_BINARY_FILE_DATA_TYPE__SCHEMA_LOCATION, oldSchemaLocation, schemaLocation, !oldSchemaLocationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSchemaLocation() {
		String oldSchemaLocation = schemaLocation;
		boolean oldSchemaLocationESet = schemaLocationESet;
		schemaLocation = SCHEMA_LOCATION_EDEFAULT;
		schemaLocationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.UA_BINARY_FILE_DATA_TYPE__SCHEMA_LOCATION, oldSchemaLocation, SCHEMA_LOCATION_EDEFAULT, oldSchemaLocationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSchemaLocation() {
		return schemaLocationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfKeyValuePair getFileHeader() {
		return fileHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFileHeader(ListOfKeyValuePair newFileHeader, NotificationChain msgs) {
		ListOfKeyValuePair oldFileHeader = fileHeader;
		fileHeader = newFileHeader;
		boolean oldFileHeaderESet = fileHeaderESet;
		fileHeaderESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.UA_BINARY_FILE_DATA_TYPE__FILE_HEADER, oldFileHeader, newFileHeader, !oldFileHeaderESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFileHeader(ListOfKeyValuePair newFileHeader) {
		if (newFileHeader != fileHeader) {
			NotificationChain msgs = null;
			if (fileHeader != null)
				msgs = ((InternalEObject)fileHeader).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.UA_BINARY_FILE_DATA_TYPE__FILE_HEADER, null, msgs);
			if (newFileHeader != null)
				msgs = ((InternalEObject)newFileHeader).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.UA_BINARY_FILE_DATA_TYPE__FILE_HEADER, null, msgs);
			msgs = basicSetFileHeader(newFileHeader, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldFileHeaderESet = fileHeaderESet;
			fileHeaderESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.UA_BINARY_FILE_DATA_TYPE__FILE_HEADER, newFileHeader, newFileHeader, !oldFileHeaderESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetFileHeader(NotificationChain msgs) {
		ListOfKeyValuePair oldFileHeader = fileHeader;
		fileHeader = null;
		boolean oldFileHeaderESet = fileHeaderESet;
		fileHeaderESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.UA_BINARY_FILE_DATA_TYPE__FILE_HEADER, oldFileHeader, null, oldFileHeaderESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFileHeader() {
		if (fileHeader != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)fileHeader).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.UA_BINARY_FILE_DATA_TYPE__FILE_HEADER, null, msgs);
			msgs = basicUnsetFileHeader(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldFileHeaderESet = fileHeaderESet;
			fileHeaderESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.UA_BINARY_FILE_DATA_TYPE__FILE_HEADER, null, null, oldFileHeaderESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFileHeader() {
		return fileHeaderESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variant getBody() {
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBody(Variant newBody, NotificationChain msgs) {
		Variant oldBody = body;
		body = newBody;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.UA_BINARY_FILE_DATA_TYPE__BODY, oldBody, newBody);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBody(Variant newBody) {
		if (newBody != body) {
			NotificationChain msgs = null;
			if (body != null)
				msgs = ((InternalEObject)body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.UA_BINARY_FILE_DATA_TYPE__BODY, null, msgs);
			if (newBody != null)
				msgs = ((InternalEObject)newBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.UA_BINARY_FILE_DATA_TYPE__BODY, null, msgs);
			msgs = basicSetBody(newBody, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.UA_BINARY_FILE_DATA_TYPE__BODY, newBody, newBody));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.UA_BINARY_FILE_DATA_TYPE__FILE_HEADER:
				return basicUnsetFileHeader(msgs);
			case TypesPackage.UA_BINARY_FILE_DATA_TYPE__BODY:
				return basicSetBody(null, msgs);
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
			case TypesPackage.UA_BINARY_FILE_DATA_TYPE__SCHEMA_LOCATION:
				return getSchemaLocation();
			case TypesPackage.UA_BINARY_FILE_DATA_TYPE__FILE_HEADER:
				return getFileHeader();
			case TypesPackage.UA_BINARY_FILE_DATA_TYPE__BODY:
				return getBody();
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
			case TypesPackage.UA_BINARY_FILE_DATA_TYPE__SCHEMA_LOCATION:
				setSchemaLocation((String)newValue);
				return;
			case TypesPackage.UA_BINARY_FILE_DATA_TYPE__FILE_HEADER:
				setFileHeader((ListOfKeyValuePair)newValue);
				return;
			case TypesPackage.UA_BINARY_FILE_DATA_TYPE__BODY:
				setBody((Variant)newValue);
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
			case TypesPackage.UA_BINARY_FILE_DATA_TYPE__SCHEMA_LOCATION:
				unsetSchemaLocation();
				return;
			case TypesPackage.UA_BINARY_FILE_DATA_TYPE__FILE_HEADER:
				unsetFileHeader();
				return;
			case TypesPackage.UA_BINARY_FILE_DATA_TYPE__BODY:
				setBody((Variant)null);
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
			case TypesPackage.UA_BINARY_FILE_DATA_TYPE__SCHEMA_LOCATION:
				return isSetSchemaLocation();
			case TypesPackage.UA_BINARY_FILE_DATA_TYPE__FILE_HEADER:
				return isSetFileHeader();
			case TypesPackage.UA_BINARY_FILE_DATA_TYPE__BODY:
				return body != null;
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
		result.append(" (schemaLocation: ");
		if (schemaLocationESet) result.append(schemaLocation); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //UABinaryFileDataTypeImpl
