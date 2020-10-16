/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.opcfoundation.ua._2008._02.types.ListOfDateTime;
import org.opcfoundation.ua._2008._02.types.ReadAnnotationDataDetails;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Read Annotation Data Details</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ReadAnnotationDataDetailsImpl#getReqTimes <em>Req Times</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReadAnnotationDataDetailsImpl extends HistoryReadDetailsImpl implements ReadAnnotationDataDetails {
	/**
	 * The cached value of the '{@link #getReqTimes() <em>Req Times</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReqTimes()
	 * @generated
	 * @ordered
	 */
	protected ListOfDateTime reqTimes;

	/**
	 * This is true if the Req Times containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean reqTimesESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReadAnnotationDataDetailsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getReadAnnotationDataDetails();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfDateTime getReqTimes() {
		return reqTimes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReqTimes(ListOfDateTime newReqTimes, NotificationChain msgs) {
		ListOfDateTime oldReqTimes = reqTimes;
		reqTimes = newReqTimes;
		boolean oldReqTimesESet = reqTimesESet;
		reqTimesESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.READ_ANNOTATION_DATA_DETAILS__REQ_TIMES, oldReqTimes, newReqTimes, !oldReqTimesESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReqTimes(ListOfDateTime newReqTimes) {
		if (newReqTimes != reqTimes) {
			NotificationChain msgs = null;
			if (reqTimes != null)
				msgs = ((InternalEObject)reqTimes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.READ_ANNOTATION_DATA_DETAILS__REQ_TIMES, null, msgs);
			if (newReqTimes != null)
				msgs = ((InternalEObject)newReqTimes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.READ_ANNOTATION_DATA_DETAILS__REQ_TIMES, null, msgs);
			msgs = basicSetReqTimes(newReqTimes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldReqTimesESet = reqTimesESet;
			reqTimesESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.READ_ANNOTATION_DATA_DETAILS__REQ_TIMES, newReqTimes, newReqTimes, !oldReqTimesESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetReqTimes(NotificationChain msgs) {
		ListOfDateTime oldReqTimes = reqTimes;
		reqTimes = null;
		boolean oldReqTimesESet = reqTimesESet;
		reqTimesESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.READ_ANNOTATION_DATA_DETAILS__REQ_TIMES, oldReqTimes, null, oldReqTimesESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetReqTimes() {
		if (reqTimes != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)reqTimes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.READ_ANNOTATION_DATA_DETAILS__REQ_TIMES, null, msgs);
			msgs = basicUnsetReqTimes(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldReqTimesESet = reqTimesESet;
			reqTimesESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.READ_ANNOTATION_DATA_DETAILS__REQ_TIMES, null, null, oldReqTimesESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetReqTimes() {
		return reqTimesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.READ_ANNOTATION_DATA_DETAILS__REQ_TIMES:
				return basicUnsetReqTimes(msgs);
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
			case TypesPackage.READ_ANNOTATION_DATA_DETAILS__REQ_TIMES:
				return getReqTimes();
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
			case TypesPackage.READ_ANNOTATION_DATA_DETAILS__REQ_TIMES:
				setReqTimes((ListOfDateTime)newValue);
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
			case TypesPackage.READ_ANNOTATION_DATA_DETAILS__REQ_TIMES:
				unsetReqTimes();
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
			case TypesPackage.READ_ANNOTATION_DATA_DETAILS__REQ_TIMES:
				return isSetReqTimes();
		}
		return super.eIsSet(featureID);
	}

} //ReadAnnotationDataDetailsImpl
