/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.opcfoundation.ua._2008._02.types.CallMethodRequest;
import org.opcfoundation.ua._2008._02.types.ListOfVariant;
import org.opcfoundation.ua._2008._02.types.NodeId;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Call Method Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.CallMethodRequestImpl#getObjectId <em>Object Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.CallMethodRequestImpl#getMethodId <em>Method Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.CallMethodRequestImpl#getInputArguments <em>Input Arguments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CallMethodRequestImpl extends MinimalEObjectImpl.Container implements CallMethodRequest {
	/**
	 * The cached value of the '{@link #getObjectId() <em>Object Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectId()
	 * @generated
	 * @ordered
	 */
	protected NodeId objectId;

	/**
	 * This is true if the Object Id containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean objectIdESet;

	/**
	 * The cached value of the '{@link #getMethodId() <em>Method Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodId()
	 * @generated
	 * @ordered
	 */
	protected NodeId methodId;

	/**
	 * This is true if the Method Id containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean methodIdESet;

	/**
	 * The cached value of the '{@link #getInputArguments() <em>Input Arguments</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputArguments()
	 * @generated
	 * @ordered
	 */
	protected ListOfVariant inputArguments;

	/**
	 * This is true if the Input Arguments containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean inputArgumentsESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CallMethodRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getCallMethodRequest();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeId getObjectId() {
		return objectId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObjectId(NodeId newObjectId, NotificationChain msgs) {
		NodeId oldObjectId = objectId;
		objectId = newObjectId;
		boolean oldObjectIdESet = objectIdESet;
		objectIdESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.CALL_METHOD_REQUEST__OBJECT_ID, oldObjectId, newObjectId, !oldObjectIdESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectId(NodeId newObjectId) {
		if (newObjectId != objectId) {
			NotificationChain msgs = null;
			if (objectId != null)
				msgs = ((InternalEObject)objectId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.CALL_METHOD_REQUEST__OBJECT_ID, null, msgs);
			if (newObjectId != null)
				msgs = ((InternalEObject)newObjectId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.CALL_METHOD_REQUEST__OBJECT_ID, null, msgs);
			msgs = basicSetObjectId(newObjectId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldObjectIdESet = objectIdESet;
			objectIdESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.CALL_METHOD_REQUEST__OBJECT_ID, newObjectId, newObjectId, !oldObjectIdESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetObjectId(NotificationChain msgs) {
		NodeId oldObjectId = objectId;
		objectId = null;
		boolean oldObjectIdESet = objectIdESet;
		objectIdESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.CALL_METHOD_REQUEST__OBJECT_ID, oldObjectId, null, oldObjectIdESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetObjectId() {
		if (objectId != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)objectId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.CALL_METHOD_REQUEST__OBJECT_ID, null, msgs);
			msgs = basicUnsetObjectId(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldObjectIdESet = objectIdESet;
			objectIdESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.CALL_METHOD_REQUEST__OBJECT_ID, null, null, oldObjectIdESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetObjectId() {
		return objectIdESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeId getMethodId() {
		return methodId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMethodId(NodeId newMethodId, NotificationChain msgs) {
		NodeId oldMethodId = methodId;
		methodId = newMethodId;
		boolean oldMethodIdESet = methodIdESet;
		methodIdESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.CALL_METHOD_REQUEST__METHOD_ID, oldMethodId, newMethodId, !oldMethodIdESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethodId(NodeId newMethodId) {
		if (newMethodId != methodId) {
			NotificationChain msgs = null;
			if (methodId != null)
				msgs = ((InternalEObject)methodId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.CALL_METHOD_REQUEST__METHOD_ID, null, msgs);
			if (newMethodId != null)
				msgs = ((InternalEObject)newMethodId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.CALL_METHOD_REQUEST__METHOD_ID, null, msgs);
			msgs = basicSetMethodId(newMethodId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldMethodIdESet = methodIdESet;
			methodIdESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.CALL_METHOD_REQUEST__METHOD_ID, newMethodId, newMethodId, !oldMethodIdESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetMethodId(NotificationChain msgs) {
		NodeId oldMethodId = methodId;
		methodId = null;
		boolean oldMethodIdESet = methodIdESet;
		methodIdESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.CALL_METHOD_REQUEST__METHOD_ID, oldMethodId, null, oldMethodIdESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMethodId() {
		if (methodId != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)methodId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.CALL_METHOD_REQUEST__METHOD_ID, null, msgs);
			msgs = basicUnsetMethodId(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldMethodIdESet = methodIdESet;
			methodIdESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.CALL_METHOD_REQUEST__METHOD_ID, null, null, oldMethodIdESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMethodId() {
		return methodIdESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfVariant getInputArguments() {
		return inputArguments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInputArguments(ListOfVariant newInputArguments, NotificationChain msgs) {
		ListOfVariant oldInputArguments = inputArguments;
		inputArguments = newInputArguments;
		boolean oldInputArgumentsESet = inputArgumentsESet;
		inputArgumentsESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.CALL_METHOD_REQUEST__INPUT_ARGUMENTS, oldInputArguments, newInputArguments, !oldInputArgumentsESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputArguments(ListOfVariant newInputArguments) {
		if (newInputArguments != inputArguments) {
			NotificationChain msgs = null;
			if (inputArguments != null)
				msgs = ((InternalEObject)inputArguments).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.CALL_METHOD_REQUEST__INPUT_ARGUMENTS, null, msgs);
			if (newInputArguments != null)
				msgs = ((InternalEObject)newInputArguments).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.CALL_METHOD_REQUEST__INPUT_ARGUMENTS, null, msgs);
			msgs = basicSetInputArguments(newInputArguments, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldInputArgumentsESet = inputArgumentsESet;
			inputArgumentsESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.CALL_METHOD_REQUEST__INPUT_ARGUMENTS, newInputArguments, newInputArguments, !oldInputArgumentsESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetInputArguments(NotificationChain msgs) {
		ListOfVariant oldInputArguments = inputArguments;
		inputArguments = null;
		boolean oldInputArgumentsESet = inputArgumentsESet;
		inputArgumentsESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.CALL_METHOD_REQUEST__INPUT_ARGUMENTS, oldInputArguments, null, oldInputArgumentsESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetInputArguments() {
		if (inputArguments != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)inputArguments).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.CALL_METHOD_REQUEST__INPUT_ARGUMENTS, null, msgs);
			msgs = basicUnsetInputArguments(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldInputArgumentsESet = inputArgumentsESet;
			inputArgumentsESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.CALL_METHOD_REQUEST__INPUT_ARGUMENTS, null, null, oldInputArgumentsESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInputArguments() {
		return inputArgumentsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.CALL_METHOD_REQUEST__OBJECT_ID:
				return basicUnsetObjectId(msgs);
			case TypesPackage.CALL_METHOD_REQUEST__METHOD_ID:
				return basicUnsetMethodId(msgs);
			case TypesPackage.CALL_METHOD_REQUEST__INPUT_ARGUMENTS:
				return basicUnsetInputArguments(msgs);
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
			case TypesPackage.CALL_METHOD_REQUEST__OBJECT_ID:
				return getObjectId();
			case TypesPackage.CALL_METHOD_REQUEST__METHOD_ID:
				return getMethodId();
			case TypesPackage.CALL_METHOD_REQUEST__INPUT_ARGUMENTS:
				return getInputArguments();
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
			case TypesPackage.CALL_METHOD_REQUEST__OBJECT_ID:
				setObjectId((NodeId)newValue);
				return;
			case TypesPackage.CALL_METHOD_REQUEST__METHOD_ID:
				setMethodId((NodeId)newValue);
				return;
			case TypesPackage.CALL_METHOD_REQUEST__INPUT_ARGUMENTS:
				setInputArguments((ListOfVariant)newValue);
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
			case TypesPackage.CALL_METHOD_REQUEST__OBJECT_ID:
				unsetObjectId();
				return;
			case TypesPackage.CALL_METHOD_REQUEST__METHOD_ID:
				unsetMethodId();
				return;
			case TypesPackage.CALL_METHOD_REQUEST__INPUT_ARGUMENTS:
				unsetInputArguments();
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
			case TypesPackage.CALL_METHOD_REQUEST__OBJECT_ID:
				return isSetObjectId();
			case TypesPackage.CALL_METHOD_REQUEST__METHOD_ID:
				return isSetMethodId();
			case TypesPackage.CALL_METHOD_REQUEST__INPUT_ARGUMENTS:
				return isSetInputArguments();
		}
		return super.eIsSet(featureID);
	}

} //CallMethodRequestImpl
