/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.opcfoundation.ua._2008._02.types.BrowseResult;
import org.opcfoundation.ua._2008._02.types.ListOfReferenceDescription;
import org.opcfoundation.ua._2008._02.types.StatusCode;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Browse Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.BrowseResultImpl#getStatusCode <em>Status Code</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.BrowseResultImpl#getContinuationPoint <em>Continuation Point</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.BrowseResultImpl#getReferences <em>References</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BrowseResultImpl extends MinimalEObjectImpl.Container implements BrowseResult {
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
	 * The default value of the '{@link #getContinuationPoint() <em>Continuation Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContinuationPoint()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] CONTINUATION_POINT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContinuationPoint() <em>Continuation Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContinuationPoint()
	 * @generated
	 * @ordered
	 */
	protected byte[] continuationPoint = CONTINUATION_POINT_EDEFAULT;

	/**
	 * This is true if the Continuation Point attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean continuationPointESet;

	/**
	 * The cached value of the '{@link #getReferences() <em>References</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferences()
	 * @generated
	 * @ordered
	 */
	protected ListOfReferenceDescription references;

	/**
	 * This is true if the References containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean referencesESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BrowseResultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getBrowseResult();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.BROWSE_RESULT__STATUS_CODE, oldStatusCode, newStatusCode);
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
				msgs = ((InternalEObject)statusCode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.BROWSE_RESULT__STATUS_CODE, null, msgs);
			if (newStatusCode != null)
				msgs = ((InternalEObject)newStatusCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.BROWSE_RESULT__STATUS_CODE, null, msgs);
			msgs = basicSetStatusCode(newStatusCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.BROWSE_RESULT__STATUS_CODE, newStatusCode, newStatusCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getContinuationPoint() {
		return continuationPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContinuationPoint(byte[] newContinuationPoint) {
		byte[] oldContinuationPoint = continuationPoint;
		continuationPoint = newContinuationPoint;
		boolean oldContinuationPointESet = continuationPointESet;
		continuationPointESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.BROWSE_RESULT__CONTINUATION_POINT, oldContinuationPoint, continuationPoint, !oldContinuationPointESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetContinuationPoint() {
		byte[] oldContinuationPoint = continuationPoint;
		boolean oldContinuationPointESet = continuationPointESet;
		continuationPoint = CONTINUATION_POINT_EDEFAULT;
		continuationPointESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.BROWSE_RESULT__CONTINUATION_POINT, oldContinuationPoint, CONTINUATION_POINT_EDEFAULT, oldContinuationPointESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetContinuationPoint() {
		return continuationPointESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfReferenceDescription getReferences() {
		return references;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferences(ListOfReferenceDescription newReferences, NotificationChain msgs) {
		ListOfReferenceDescription oldReferences = references;
		references = newReferences;
		boolean oldReferencesESet = referencesESet;
		referencesESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.BROWSE_RESULT__REFERENCES, oldReferences, newReferences, !oldReferencesESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferences(ListOfReferenceDescription newReferences) {
		if (newReferences != references) {
			NotificationChain msgs = null;
			if (references != null)
				msgs = ((InternalEObject)references).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.BROWSE_RESULT__REFERENCES, null, msgs);
			if (newReferences != null)
				msgs = ((InternalEObject)newReferences).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.BROWSE_RESULT__REFERENCES, null, msgs);
			msgs = basicSetReferences(newReferences, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldReferencesESet = referencesESet;
			referencesESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.BROWSE_RESULT__REFERENCES, newReferences, newReferences, !oldReferencesESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetReferences(NotificationChain msgs) {
		ListOfReferenceDescription oldReferences = references;
		references = null;
		boolean oldReferencesESet = referencesESet;
		referencesESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.BROWSE_RESULT__REFERENCES, oldReferences, null, oldReferencesESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetReferences() {
		if (references != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)references).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.BROWSE_RESULT__REFERENCES, null, msgs);
			msgs = basicUnsetReferences(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldReferencesESet = referencesESet;
			referencesESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.BROWSE_RESULT__REFERENCES, null, null, oldReferencesESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetReferences() {
		return referencesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.BROWSE_RESULT__STATUS_CODE:
				return basicSetStatusCode(null, msgs);
			case TypesPackage.BROWSE_RESULT__REFERENCES:
				return basicUnsetReferences(msgs);
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
			case TypesPackage.BROWSE_RESULT__STATUS_CODE:
				return getStatusCode();
			case TypesPackage.BROWSE_RESULT__CONTINUATION_POINT:
				return getContinuationPoint();
			case TypesPackage.BROWSE_RESULT__REFERENCES:
				return getReferences();
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
			case TypesPackage.BROWSE_RESULT__STATUS_CODE:
				setStatusCode((StatusCode)newValue);
				return;
			case TypesPackage.BROWSE_RESULT__CONTINUATION_POINT:
				setContinuationPoint((byte[])newValue);
				return;
			case TypesPackage.BROWSE_RESULT__REFERENCES:
				setReferences((ListOfReferenceDescription)newValue);
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
			case TypesPackage.BROWSE_RESULT__STATUS_CODE:
				setStatusCode((StatusCode)null);
				return;
			case TypesPackage.BROWSE_RESULT__CONTINUATION_POINT:
				unsetContinuationPoint();
				return;
			case TypesPackage.BROWSE_RESULT__REFERENCES:
				unsetReferences();
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
			case TypesPackage.BROWSE_RESULT__STATUS_CODE:
				return statusCode != null;
			case TypesPackage.BROWSE_RESULT__CONTINUATION_POINT:
				return isSetContinuationPoint();
			case TypesPackage.BROWSE_RESULT__REFERENCES:
				return isSetReferences();
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
		result.append(" (continuationPoint: ");
		if (continuationPointESet) result.append(continuationPoint); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //BrowseResultImpl
