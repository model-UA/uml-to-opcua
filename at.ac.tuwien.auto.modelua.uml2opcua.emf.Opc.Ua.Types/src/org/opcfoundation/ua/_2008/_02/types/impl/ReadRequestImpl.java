/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.opcfoundation.ua._2008._02.types.ListOfReadValueId;
import org.opcfoundation.ua._2008._02.types.ReadRequest;
import org.opcfoundation.ua._2008._02.types.RequestHeader;
import org.opcfoundation.ua._2008._02.types.TimestampsToReturn;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Read Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ReadRequestImpl#getRequestHeader <em>Request Header</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ReadRequestImpl#getMaxAge <em>Max Age</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ReadRequestImpl#getTimestampsToReturn <em>Timestamps To Return</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ReadRequestImpl#getNodesToRead <em>Nodes To Read</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReadRequestImpl extends MinimalEObjectImpl.Container implements ReadRequest {
	/**
	 * The cached value of the '{@link #getRequestHeader() <em>Request Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestHeader()
	 * @generated
	 * @ordered
	 */
	protected RequestHeader requestHeader;

	/**
	 * This is true if the Request Header containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean requestHeaderESet;

	/**
	 * The default value of the '{@link #getMaxAge() <em>Max Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxAge()
	 * @generated
	 * @ordered
	 */
	protected static final double MAX_AGE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMaxAge() <em>Max Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxAge()
	 * @generated
	 * @ordered
	 */
	protected double maxAge = MAX_AGE_EDEFAULT;

	/**
	 * This is true if the Max Age attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maxAgeESet;

	/**
	 * The default value of the '{@link #getTimestampsToReturn() <em>Timestamps To Return</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestampsToReturn()
	 * @generated
	 * @ordered
	 */
	protected static final TimestampsToReturn TIMESTAMPS_TO_RETURN_EDEFAULT = TimestampsToReturn.SOURCE0;

	/**
	 * The cached value of the '{@link #getTimestampsToReturn() <em>Timestamps To Return</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestampsToReturn()
	 * @generated
	 * @ordered
	 */
	protected TimestampsToReturn timestampsToReturn = TIMESTAMPS_TO_RETURN_EDEFAULT;

	/**
	 * This is true if the Timestamps To Return attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean timestampsToReturnESet;

	/**
	 * The cached value of the '{@link #getNodesToRead() <em>Nodes To Read</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodesToRead()
	 * @generated
	 * @ordered
	 */
	protected ListOfReadValueId nodesToRead;

	/**
	 * This is true if the Nodes To Read containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nodesToReadESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReadRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getReadRequest();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestHeader getRequestHeader() {
		return requestHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequestHeader(RequestHeader newRequestHeader, NotificationChain msgs) {
		RequestHeader oldRequestHeader = requestHeader;
		requestHeader = newRequestHeader;
		boolean oldRequestHeaderESet = requestHeaderESet;
		requestHeaderESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.READ_REQUEST__REQUEST_HEADER, oldRequestHeader, newRequestHeader, !oldRequestHeaderESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequestHeader(RequestHeader newRequestHeader) {
		if (newRequestHeader != requestHeader) {
			NotificationChain msgs = null;
			if (requestHeader != null)
				msgs = ((InternalEObject)requestHeader).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.READ_REQUEST__REQUEST_HEADER, null, msgs);
			if (newRequestHeader != null)
				msgs = ((InternalEObject)newRequestHeader).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.READ_REQUEST__REQUEST_HEADER, null, msgs);
			msgs = basicSetRequestHeader(newRequestHeader, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldRequestHeaderESet = requestHeaderESet;
			requestHeaderESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.READ_REQUEST__REQUEST_HEADER, newRequestHeader, newRequestHeader, !oldRequestHeaderESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetRequestHeader(NotificationChain msgs) {
		RequestHeader oldRequestHeader = requestHeader;
		requestHeader = null;
		boolean oldRequestHeaderESet = requestHeaderESet;
		requestHeaderESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.READ_REQUEST__REQUEST_HEADER, oldRequestHeader, null, oldRequestHeaderESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRequestHeader() {
		if (requestHeader != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)requestHeader).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.READ_REQUEST__REQUEST_HEADER, null, msgs);
			msgs = basicUnsetRequestHeader(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldRequestHeaderESet = requestHeaderESet;
			requestHeaderESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.READ_REQUEST__REQUEST_HEADER, null, null, oldRequestHeaderESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRequestHeader() {
		return requestHeaderESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMaxAge() {
		return maxAge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxAge(double newMaxAge) {
		double oldMaxAge = maxAge;
		maxAge = newMaxAge;
		boolean oldMaxAgeESet = maxAgeESet;
		maxAgeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.READ_REQUEST__MAX_AGE, oldMaxAge, maxAge, !oldMaxAgeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMaxAge() {
		double oldMaxAge = maxAge;
		boolean oldMaxAgeESet = maxAgeESet;
		maxAge = MAX_AGE_EDEFAULT;
		maxAgeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.READ_REQUEST__MAX_AGE, oldMaxAge, MAX_AGE_EDEFAULT, oldMaxAgeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMaxAge() {
		return maxAgeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimestampsToReturn getTimestampsToReturn() {
		return timestampsToReturn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimestampsToReturn(TimestampsToReturn newTimestampsToReturn) {
		TimestampsToReturn oldTimestampsToReturn = timestampsToReturn;
		timestampsToReturn = newTimestampsToReturn == null ? TIMESTAMPS_TO_RETURN_EDEFAULT : newTimestampsToReturn;
		boolean oldTimestampsToReturnESet = timestampsToReturnESet;
		timestampsToReturnESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.READ_REQUEST__TIMESTAMPS_TO_RETURN, oldTimestampsToReturn, timestampsToReturn, !oldTimestampsToReturnESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTimestampsToReturn() {
		TimestampsToReturn oldTimestampsToReturn = timestampsToReturn;
		boolean oldTimestampsToReturnESet = timestampsToReturnESet;
		timestampsToReturn = TIMESTAMPS_TO_RETURN_EDEFAULT;
		timestampsToReturnESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.READ_REQUEST__TIMESTAMPS_TO_RETURN, oldTimestampsToReturn, TIMESTAMPS_TO_RETURN_EDEFAULT, oldTimestampsToReturnESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTimestampsToReturn() {
		return timestampsToReturnESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfReadValueId getNodesToRead() {
		return nodesToRead;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNodesToRead(ListOfReadValueId newNodesToRead, NotificationChain msgs) {
		ListOfReadValueId oldNodesToRead = nodesToRead;
		nodesToRead = newNodesToRead;
		boolean oldNodesToReadESet = nodesToReadESet;
		nodesToReadESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.READ_REQUEST__NODES_TO_READ, oldNodesToRead, newNodesToRead, !oldNodesToReadESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNodesToRead(ListOfReadValueId newNodesToRead) {
		if (newNodesToRead != nodesToRead) {
			NotificationChain msgs = null;
			if (nodesToRead != null)
				msgs = ((InternalEObject)nodesToRead).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.READ_REQUEST__NODES_TO_READ, null, msgs);
			if (newNodesToRead != null)
				msgs = ((InternalEObject)newNodesToRead).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.READ_REQUEST__NODES_TO_READ, null, msgs);
			msgs = basicSetNodesToRead(newNodesToRead, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldNodesToReadESet = nodesToReadESet;
			nodesToReadESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.READ_REQUEST__NODES_TO_READ, newNodesToRead, newNodesToRead, !oldNodesToReadESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetNodesToRead(NotificationChain msgs) {
		ListOfReadValueId oldNodesToRead = nodesToRead;
		nodesToRead = null;
		boolean oldNodesToReadESet = nodesToReadESet;
		nodesToReadESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.READ_REQUEST__NODES_TO_READ, oldNodesToRead, null, oldNodesToReadESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNodesToRead() {
		if (nodesToRead != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)nodesToRead).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.READ_REQUEST__NODES_TO_READ, null, msgs);
			msgs = basicUnsetNodesToRead(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldNodesToReadESet = nodesToReadESet;
			nodesToReadESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.READ_REQUEST__NODES_TO_READ, null, null, oldNodesToReadESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNodesToRead() {
		return nodesToReadESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.READ_REQUEST__REQUEST_HEADER:
				return basicUnsetRequestHeader(msgs);
			case TypesPackage.READ_REQUEST__NODES_TO_READ:
				return basicUnsetNodesToRead(msgs);
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
			case TypesPackage.READ_REQUEST__REQUEST_HEADER:
				return getRequestHeader();
			case TypesPackage.READ_REQUEST__MAX_AGE:
				return getMaxAge();
			case TypesPackage.READ_REQUEST__TIMESTAMPS_TO_RETURN:
				return getTimestampsToReturn();
			case TypesPackage.READ_REQUEST__NODES_TO_READ:
				return getNodesToRead();
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
			case TypesPackage.READ_REQUEST__REQUEST_HEADER:
				setRequestHeader((RequestHeader)newValue);
				return;
			case TypesPackage.READ_REQUEST__MAX_AGE:
				setMaxAge((Double)newValue);
				return;
			case TypesPackage.READ_REQUEST__TIMESTAMPS_TO_RETURN:
				setTimestampsToReturn((TimestampsToReturn)newValue);
				return;
			case TypesPackage.READ_REQUEST__NODES_TO_READ:
				setNodesToRead((ListOfReadValueId)newValue);
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
			case TypesPackage.READ_REQUEST__REQUEST_HEADER:
				unsetRequestHeader();
				return;
			case TypesPackage.READ_REQUEST__MAX_AGE:
				unsetMaxAge();
				return;
			case TypesPackage.READ_REQUEST__TIMESTAMPS_TO_RETURN:
				unsetTimestampsToReturn();
				return;
			case TypesPackage.READ_REQUEST__NODES_TO_READ:
				unsetNodesToRead();
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
			case TypesPackage.READ_REQUEST__REQUEST_HEADER:
				return isSetRequestHeader();
			case TypesPackage.READ_REQUEST__MAX_AGE:
				return isSetMaxAge();
			case TypesPackage.READ_REQUEST__TIMESTAMPS_TO_RETURN:
				return isSetTimestampsToReturn();
			case TypesPackage.READ_REQUEST__NODES_TO_READ:
				return isSetNodesToRead();
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
		result.append(" (maxAge: ");
		if (maxAgeESet) result.append(maxAge); else result.append("<unset>");
		result.append(", timestampsToReturn: ");
		if (timestampsToReturnESet) result.append(timestampsToReturn); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ReadRequestImpl
