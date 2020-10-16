/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.opcfoundation.ua._2008._02.types.ListOfUInt32;
import org.opcfoundation.ua._2008._02.types.StatusCode;
import org.opcfoundation.ua._2008._02.types.TransferResult;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transfer Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.TransferResultImpl#getStatusCode <em>Status Code</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.TransferResultImpl#getAvailableSequenceNumbers <em>Available Sequence Numbers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransferResultImpl extends MinimalEObjectImpl.Container implements TransferResult {
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
	 * The cached value of the '{@link #getAvailableSequenceNumbers() <em>Available Sequence Numbers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableSequenceNumbers()
	 * @generated
	 * @ordered
	 */
	protected ListOfUInt32 availableSequenceNumbers;

	/**
	 * This is true if the Available Sequence Numbers containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean availableSequenceNumbersESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransferResultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getTransferResult();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.TRANSFER_RESULT__STATUS_CODE, oldStatusCode, newStatusCode);
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
				msgs = ((InternalEObject)statusCode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.TRANSFER_RESULT__STATUS_CODE, null, msgs);
			if (newStatusCode != null)
				msgs = ((InternalEObject)newStatusCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.TRANSFER_RESULT__STATUS_CODE, null, msgs);
			msgs = basicSetStatusCode(newStatusCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.TRANSFER_RESULT__STATUS_CODE, newStatusCode, newStatusCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfUInt32 getAvailableSequenceNumbers() {
		return availableSequenceNumbers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAvailableSequenceNumbers(ListOfUInt32 newAvailableSequenceNumbers, NotificationChain msgs) {
		ListOfUInt32 oldAvailableSequenceNumbers = availableSequenceNumbers;
		availableSequenceNumbers = newAvailableSequenceNumbers;
		boolean oldAvailableSequenceNumbersESet = availableSequenceNumbersESet;
		availableSequenceNumbersESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.TRANSFER_RESULT__AVAILABLE_SEQUENCE_NUMBERS, oldAvailableSequenceNumbers, newAvailableSequenceNumbers, !oldAvailableSequenceNumbersESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAvailableSequenceNumbers(ListOfUInt32 newAvailableSequenceNumbers) {
		if (newAvailableSequenceNumbers != availableSequenceNumbers) {
			NotificationChain msgs = null;
			if (availableSequenceNumbers != null)
				msgs = ((InternalEObject)availableSequenceNumbers).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.TRANSFER_RESULT__AVAILABLE_SEQUENCE_NUMBERS, null, msgs);
			if (newAvailableSequenceNumbers != null)
				msgs = ((InternalEObject)newAvailableSequenceNumbers).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.TRANSFER_RESULT__AVAILABLE_SEQUENCE_NUMBERS, null, msgs);
			msgs = basicSetAvailableSequenceNumbers(newAvailableSequenceNumbers, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldAvailableSequenceNumbersESet = availableSequenceNumbersESet;
			availableSequenceNumbersESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.TRANSFER_RESULT__AVAILABLE_SEQUENCE_NUMBERS, newAvailableSequenceNumbers, newAvailableSequenceNumbers, !oldAvailableSequenceNumbersESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetAvailableSequenceNumbers(NotificationChain msgs) {
		ListOfUInt32 oldAvailableSequenceNumbers = availableSequenceNumbers;
		availableSequenceNumbers = null;
		boolean oldAvailableSequenceNumbersESet = availableSequenceNumbersESet;
		availableSequenceNumbersESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.TRANSFER_RESULT__AVAILABLE_SEQUENCE_NUMBERS, oldAvailableSequenceNumbers, null, oldAvailableSequenceNumbersESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAvailableSequenceNumbers() {
		if (availableSequenceNumbers != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)availableSequenceNumbers).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.TRANSFER_RESULT__AVAILABLE_SEQUENCE_NUMBERS, null, msgs);
			msgs = basicUnsetAvailableSequenceNumbers(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldAvailableSequenceNumbersESet = availableSequenceNumbersESet;
			availableSequenceNumbersESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.TRANSFER_RESULT__AVAILABLE_SEQUENCE_NUMBERS, null, null, oldAvailableSequenceNumbersESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAvailableSequenceNumbers() {
		return availableSequenceNumbersESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.TRANSFER_RESULT__STATUS_CODE:
				return basicSetStatusCode(null, msgs);
			case TypesPackage.TRANSFER_RESULT__AVAILABLE_SEQUENCE_NUMBERS:
				return basicUnsetAvailableSequenceNumbers(msgs);
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
			case TypesPackage.TRANSFER_RESULT__STATUS_CODE:
				return getStatusCode();
			case TypesPackage.TRANSFER_RESULT__AVAILABLE_SEQUENCE_NUMBERS:
				return getAvailableSequenceNumbers();
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
			case TypesPackage.TRANSFER_RESULT__STATUS_CODE:
				setStatusCode((StatusCode)newValue);
				return;
			case TypesPackage.TRANSFER_RESULT__AVAILABLE_SEQUENCE_NUMBERS:
				setAvailableSequenceNumbers((ListOfUInt32)newValue);
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
			case TypesPackage.TRANSFER_RESULT__STATUS_CODE:
				setStatusCode((StatusCode)null);
				return;
			case TypesPackage.TRANSFER_RESULT__AVAILABLE_SEQUENCE_NUMBERS:
				unsetAvailableSequenceNumbers();
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
			case TypesPackage.TRANSFER_RESULT__STATUS_CODE:
				return statusCode != null;
			case TypesPackage.TRANSFER_RESULT__AVAILABLE_SEQUENCE_NUMBERS:
				return isSetAvailableSequenceNumbers();
		}
		return super.eIsSet(featureID);
	}

} //TransferResultImpl
