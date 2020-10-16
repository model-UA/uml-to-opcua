/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.opcfoundation.ua._2008._02.types.ListOfQueryDataSet;
import org.opcfoundation.ua._2008._02.types.QueryNextResponse;
import org.opcfoundation.ua._2008._02.types.ResponseHeader;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Query Next Response</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.QueryNextResponseImpl#getResponseHeader <em>Response Header</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.QueryNextResponseImpl#getQueryDataSets <em>Query Data Sets</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.QueryNextResponseImpl#getRevisedContinuationPoint <em>Revised Continuation Point</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QueryNextResponseImpl extends MinimalEObjectImpl.Container implements QueryNextResponse {
	/**
	 * The cached value of the '{@link #getResponseHeader() <em>Response Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseHeader()
	 * @generated
	 * @ordered
	 */
	protected ResponseHeader responseHeader;

	/**
	 * This is true if the Response Header containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean responseHeaderESet;

	/**
	 * The cached value of the '{@link #getQueryDataSets() <em>Query Data Sets</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueryDataSets()
	 * @generated
	 * @ordered
	 */
	protected ListOfQueryDataSet queryDataSets;

	/**
	 * This is true if the Query Data Sets containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean queryDataSetsESet;

	/**
	 * The default value of the '{@link #getRevisedContinuationPoint() <em>Revised Continuation Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevisedContinuationPoint()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] REVISED_CONTINUATION_POINT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRevisedContinuationPoint() <em>Revised Continuation Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevisedContinuationPoint()
	 * @generated
	 * @ordered
	 */
	protected byte[] revisedContinuationPoint = REVISED_CONTINUATION_POINT_EDEFAULT;

	/**
	 * This is true if the Revised Continuation Point attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean revisedContinuationPointESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QueryNextResponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getQueryNextResponse();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseHeader getResponseHeader() {
		return responseHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResponseHeader(ResponseHeader newResponseHeader, NotificationChain msgs) {
		ResponseHeader oldResponseHeader = responseHeader;
		responseHeader = newResponseHeader;
		boolean oldResponseHeaderESet = responseHeaderESet;
		responseHeaderESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.QUERY_NEXT_RESPONSE__RESPONSE_HEADER, oldResponseHeader, newResponseHeader, !oldResponseHeaderESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponseHeader(ResponseHeader newResponseHeader) {
		if (newResponseHeader != responseHeader) {
			NotificationChain msgs = null;
			if (responseHeader != null)
				msgs = ((InternalEObject)responseHeader).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.QUERY_NEXT_RESPONSE__RESPONSE_HEADER, null, msgs);
			if (newResponseHeader != null)
				msgs = ((InternalEObject)newResponseHeader).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.QUERY_NEXT_RESPONSE__RESPONSE_HEADER, null, msgs);
			msgs = basicSetResponseHeader(newResponseHeader, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldResponseHeaderESet = responseHeaderESet;
			responseHeaderESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.QUERY_NEXT_RESPONSE__RESPONSE_HEADER, newResponseHeader, newResponseHeader, !oldResponseHeaderESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetResponseHeader(NotificationChain msgs) {
		ResponseHeader oldResponseHeader = responseHeader;
		responseHeader = null;
		boolean oldResponseHeaderESet = responseHeaderESet;
		responseHeaderESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.QUERY_NEXT_RESPONSE__RESPONSE_HEADER, oldResponseHeader, null, oldResponseHeaderESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetResponseHeader() {
		if (responseHeader != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)responseHeader).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.QUERY_NEXT_RESPONSE__RESPONSE_HEADER, null, msgs);
			msgs = basicUnsetResponseHeader(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldResponseHeaderESet = responseHeaderESet;
			responseHeaderESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.QUERY_NEXT_RESPONSE__RESPONSE_HEADER, null, null, oldResponseHeaderESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetResponseHeader() {
		return responseHeaderESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfQueryDataSet getQueryDataSets() {
		return queryDataSets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQueryDataSets(ListOfQueryDataSet newQueryDataSets, NotificationChain msgs) {
		ListOfQueryDataSet oldQueryDataSets = queryDataSets;
		queryDataSets = newQueryDataSets;
		boolean oldQueryDataSetsESet = queryDataSetsESet;
		queryDataSetsESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.QUERY_NEXT_RESPONSE__QUERY_DATA_SETS, oldQueryDataSets, newQueryDataSets, !oldQueryDataSetsESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQueryDataSets(ListOfQueryDataSet newQueryDataSets) {
		if (newQueryDataSets != queryDataSets) {
			NotificationChain msgs = null;
			if (queryDataSets != null)
				msgs = ((InternalEObject)queryDataSets).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.QUERY_NEXT_RESPONSE__QUERY_DATA_SETS, null, msgs);
			if (newQueryDataSets != null)
				msgs = ((InternalEObject)newQueryDataSets).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.QUERY_NEXT_RESPONSE__QUERY_DATA_SETS, null, msgs);
			msgs = basicSetQueryDataSets(newQueryDataSets, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldQueryDataSetsESet = queryDataSetsESet;
			queryDataSetsESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.QUERY_NEXT_RESPONSE__QUERY_DATA_SETS, newQueryDataSets, newQueryDataSets, !oldQueryDataSetsESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetQueryDataSets(NotificationChain msgs) {
		ListOfQueryDataSet oldQueryDataSets = queryDataSets;
		queryDataSets = null;
		boolean oldQueryDataSetsESet = queryDataSetsESet;
		queryDataSetsESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.QUERY_NEXT_RESPONSE__QUERY_DATA_SETS, oldQueryDataSets, null, oldQueryDataSetsESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetQueryDataSets() {
		if (queryDataSets != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)queryDataSets).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.QUERY_NEXT_RESPONSE__QUERY_DATA_SETS, null, msgs);
			msgs = basicUnsetQueryDataSets(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldQueryDataSetsESet = queryDataSetsESet;
			queryDataSetsESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.QUERY_NEXT_RESPONSE__QUERY_DATA_SETS, null, null, oldQueryDataSetsESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetQueryDataSets() {
		return queryDataSetsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getRevisedContinuationPoint() {
		return revisedContinuationPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRevisedContinuationPoint(byte[] newRevisedContinuationPoint) {
		byte[] oldRevisedContinuationPoint = revisedContinuationPoint;
		revisedContinuationPoint = newRevisedContinuationPoint;
		boolean oldRevisedContinuationPointESet = revisedContinuationPointESet;
		revisedContinuationPointESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.QUERY_NEXT_RESPONSE__REVISED_CONTINUATION_POINT, oldRevisedContinuationPoint, revisedContinuationPoint, !oldRevisedContinuationPointESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRevisedContinuationPoint() {
		byte[] oldRevisedContinuationPoint = revisedContinuationPoint;
		boolean oldRevisedContinuationPointESet = revisedContinuationPointESet;
		revisedContinuationPoint = REVISED_CONTINUATION_POINT_EDEFAULT;
		revisedContinuationPointESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.QUERY_NEXT_RESPONSE__REVISED_CONTINUATION_POINT, oldRevisedContinuationPoint, REVISED_CONTINUATION_POINT_EDEFAULT, oldRevisedContinuationPointESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRevisedContinuationPoint() {
		return revisedContinuationPointESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.QUERY_NEXT_RESPONSE__RESPONSE_HEADER:
				return basicUnsetResponseHeader(msgs);
			case TypesPackage.QUERY_NEXT_RESPONSE__QUERY_DATA_SETS:
				return basicUnsetQueryDataSets(msgs);
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
			case TypesPackage.QUERY_NEXT_RESPONSE__RESPONSE_HEADER:
				return getResponseHeader();
			case TypesPackage.QUERY_NEXT_RESPONSE__QUERY_DATA_SETS:
				return getQueryDataSets();
			case TypesPackage.QUERY_NEXT_RESPONSE__REVISED_CONTINUATION_POINT:
				return getRevisedContinuationPoint();
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
			case TypesPackage.QUERY_NEXT_RESPONSE__RESPONSE_HEADER:
				setResponseHeader((ResponseHeader)newValue);
				return;
			case TypesPackage.QUERY_NEXT_RESPONSE__QUERY_DATA_SETS:
				setQueryDataSets((ListOfQueryDataSet)newValue);
				return;
			case TypesPackage.QUERY_NEXT_RESPONSE__REVISED_CONTINUATION_POINT:
				setRevisedContinuationPoint((byte[])newValue);
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
			case TypesPackage.QUERY_NEXT_RESPONSE__RESPONSE_HEADER:
				unsetResponseHeader();
				return;
			case TypesPackage.QUERY_NEXT_RESPONSE__QUERY_DATA_SETS:
				unsetQueryDataSets();
				return;
			case TypesPackage.QUERY_NEXT_RESPONSE__REVISED_CONTINUATION_POINT:
				unsetRevisedContinuationPoint();
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
			case TypesPackage.QUERY_NEXT_RESPONSE__RESPONSE_HEADER:
				return isSetResponseHeader();
			case TypesPackage.QUERY_NEXT_RESPONSE__QUERY_DATA_SETS:
				return isSetQueryDataSets();
			case TypesPackage.QUERY_NEXT_RESPONSE__REVISED_CONTINUATION_POINT:
				return isSetRevisedContinuationPoint();
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
		result.append(" (revisedContinuationPoint: ");
		if (revisedContinuationPointESet) result.append(revisedContinuationPoint); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //QueryNextResponseImpl
