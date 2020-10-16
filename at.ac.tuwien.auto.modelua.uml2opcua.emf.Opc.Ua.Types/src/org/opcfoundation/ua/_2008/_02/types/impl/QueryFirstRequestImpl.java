/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.opcfoundation.ua._2008._02.types.ContentFilter;
import org.opcfoundation.ua._2008._02.types.ListOfNodeTypeDescription;
import org.opcfoundation.ua._2008._02.types.QueryFirstRequest;
import org.opcfoundation.ua._2008._02.types.RequestHeader;
import org.opcfoundation.ua._2008._02.types.TypesPackage;
import org.opcfoundation.ua._2008._02.types.ViewDescription;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Query First Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.QueryFirstRequestImpl#getRequestHeader <em>Request Header</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.QueryFirstRequestImpl#getView <em>View</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.QueryFirstRequestImpl#getNodeTypes <em>Node Types</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.QueryFirstRequestImpl#getFilter <em>Filter</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.QueryFirstRequestImpl#getMaxDataSetsToReturn <em>Max Data Sets To Return</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.QueryFirstRequestImpl#getMaxReferencesToReturn <em>Max References To Return</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QueryFirstRequestImpl extends MinimalEObjectImpl.Container implements QueryFirstRequest {
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
	 * The cached value of the '{@link #getView() <em>View</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getView()
	 * @generated
	 * @ordered
	 */
	protected ViewDescription view;

	/**
	 * This is true if the View containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean viewESet;

	/**
	 * The cached value of the '{@link #getNodeTypes() <em>Node Types</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeTypes()
	 * @generated
	 * @ordered
	 */
	protected ListOfNodeTypeDescription nodeTypes;

	/**
	 * This is true if the Node Types containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nodeTypesESet;

	/**
	 * The cached value of the '{@link #getFilter() <em>Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilter()
	 * @generated
	 * @ordered
	 */
	protected ContentFilter filter;

	/**
	 * This is true if the Filter containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean filterESet;

	/**
	 * The default value of the '{@link #getMaxDataSetsToReturn() <em>Max Data Sets To Return</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxDataSetsToReturn()
	 * @generated
	 * @ordered
	 */
	protected static final long MAX_DATA_SETS_TO_RETURN_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getMaxDataSetsToReturn() <em>Max Data Sets To Return</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxDataSetsToReturn()
	 * @generated
	 * @ordered
	 */
	protected long maxDataSetsToReturn = MAX_DATA_SETS_TO_RETURN_EDEFAULT;

	/**
	 * This is true if the Max Data Sets To Return attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maxDataSetsToReturnESet;

	/**
	 * The default value of the '{@link #getMaxReferencesToReturn() <em>Max References To Return</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxReferencesToReturn()
	 * @generated
	 * @ordered
	 */
	protected static final long MAX_REFERENCES_TO_RETURN_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getMaxReferencesToReturn() <em>Max References To Return</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxReferencesToReturn()
	 * @generated
	 * @ordered
	 */
	protected long maxReferencesToReturn = MAX_REFERENCES_TO_RETURN_EDEFAULT;

	/**
	 * This is true if the Max References To Return attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maxReferencesToReturnESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QueryFirstRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getQueryFirstRequest();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.QUERY_FIRST_REQUEST__REQUEST_HEADER, oldRequestHeader, newRequestHeader, !oldRequestHeaderESet);
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
				msgs = ((InternalEObject)requestHeader).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.QUERY_FIRST_REQUEST__REQUEST_HEADER, null, msgs);
			if (newRequestHeader != null)
				msgs = ((InternalEObject)newRequestHeader).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.QUERY_FIRST_REQUEST__REQUEST_HEADER, null, msgs);
			msgs = basicSetRequestHeader(newRequestHeader, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldRequestHeaderESet = requestHeaderESet;
			requestHeaderESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.QUERY_FIRST_REQUEST__REQUEST_HEADER, newRequestHeader, newRequestHeader, !oldRequestHeaderESet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.QUERY_FIRST_REQUEST__REQUEST_HEADER, oldRequestHeader, null, oldRequestHeaderESet);
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
			msgs = ((InternalEObject)requestHeader).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.QUERY_FIRST_REQUEST__REQUEST_HEADER, null, msgs);
			msgs = basicUnsetRequestHeader(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldRequestHeaderESet = requestHeaderESet;
			requestHeaderESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.QUERY_FIRST_REQUEST__REQUEST_HEADER, null, null, oldRequestHeaderESet));
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
	public ViewDescription getView() {
		return view;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetView(ViewDescription newView, NotificationChain msgs) {
		ViewDescription oldView = view;
		view = newView;
		boolean oldViewESet = viewESet;
		viewESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.QUERY_FIRST_REQUEST__VIEW, oldView, newView, !oldViewESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setView(ViewDescription newView) {
		if (newView != view) {
			NotificationChain msgs = null;
			if (view != null)
				msgs = ((InternalEObject)view).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.QUERY_FIRST_REQUEST__VIEW, null, msgs);
			if (newView != null)
				msgs = ((InternalEObject)newView).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.QUERY_FIRST_REQUEST__VIEW, null, msgs);
			msgs = basicSetView(newView, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldViewESet = viewESet;
			viewESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.QUERY_FIRST_REQUEST__VIEW, newView, newView, !oldViewESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetView(NotificationChain msgs) {
		ViewDescription oldView = view;
		view = null;
		boolean oldViewESet = viewESet;
		viewESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.QUERY_FIRST_REQUEST__VIEW, oldView, null, oldViewESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetView() {
		if (view != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)view).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.QUERY_FIRST_REQUEST__VIEW, null, msgs);
			msgs = basicUnsetView(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldViewESet = viewESet;
			viewESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.QUERY_FIRST_REQUEST__VIEW, null, null, oldViewESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetView() {
		return viewESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfNodeTypeDescription getNodeTypes() {
		return nodeTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNodeTypes(ListOfNodeTypeDescription newNodeTypes, NotificationChain msgs) {
		ListOfNodeTypeDescription oldNodeTypes = nodeTypes;
		nodeTypes = newNodeTypes;
		boolean oldNodeTypesESet = nodeTypesESet;
		nodeTypesESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.QUERY_FIRST_REQUEST__NODE_TYPES, oldNodeTypes, newNodeTypes, !oldNodeTypesESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNodeTypes(ListOfNodeTypeDescription newNodeTypes) {
		if (newNodeTypes != nodeTypes) {
			NotificationChain msgs = null;
			if (nodeTypes != null)
				msgs = ((InternalEObject)nodeTypes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.QUERY_FIRST_REQUEST__NODE_TYPES, null, msgs);
			if (newNodeTypes != null)
				msgs = ((InternalEObject)newNodeTypes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.QUERY_FIRST_REQUEST__NODE_TYPES, null, msgs);
			msgs = basicSetNodeTypes(newNodeTypes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldNodeTypesESet = nodeTypesESet;
			nodeTypesESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.QUERY_FIRST_REQUEST__NODE_TYPES, newNodeTypes, newNodeTypes, !oldNodeTypesESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetNodeTypes(NotificationChain msgs) {
		ListOfNodeTypeDescription oldNodeTypes = nodeTypes;
		nodeTypes = null;
		boolean oldNodeTypesESet = nodeTypesESet;
		nodeTypesESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.QUERY_FIRST_REQUEST__NODE_TYPES, oldNodeTypes, null, oldNodeTypesESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNodeTypes() {
		if (nodeTypes != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)nodeTypes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.QUERY_FIRST_REQUEST__NODE_TYPES, null, msgs);
			msgs = basicUnsetNodeTypes(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldNodeTypesESet = nodeTypesESet;
			nodeTypesESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.QUERY_FIRST_REQUEST__NODE_TYPES, null, null, oldNodeTypesESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNodeTypes() {
		return nodeTypesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentFilter getFilter() {
		return filter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFilter(ContentFilter newFilter, NotificationChain msgs) {
		ContentFilter oldFilter = filter;
		filter = newFilter;
		boolean oldFilterESet = filterESet;
		filterESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.QUERY_FIRST_REQUEST__FILTER, oldFilter, newFilter, !oldFilterESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilter(ContentFilter newFilter) {
		if (newFilter != filter) {
			NotificationChain msgs = null;
			if (filter != null)
				msgs = ((InternalEObject)filter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.QUERY_FIRST_REQUEST__FILTER, null, msgs);
			if (newFilter != null)
				msgs = ((InternalEObject)newFilter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.QUERY_FIRST_REQUEST__FILTER, null, msgs);
			msgs = basicSetFilter(newFilter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldFilterESet = filterESet;
			filterESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.QUERY_FIRST_REQUEST__FILTER, newFilter, newFilter, !oldFilterESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetFilter(NotificationChain msgs) {
		ContentFilter oldFilter = filter;
		filter = null;
		boolean oldFilterESet = filterESet;
		filterESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.QUERY_FIRST_REQUEST__FILTER, oldFilter, null, oldFilterESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFilter() {
		if (filter != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)filter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.QUERY_FIRST_REQUEST__FILTER, null, msgs);
			msgs = basicUnsetFilter(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldFilterESet = filterESet;
			filterESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.QUERY_FIRST_REQUEST__FILTER, null, null, oldFilterESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFilter() {
		return filterESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getMaxDataSetsToReturn() {
		return maxDataSetsToReturn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxDataSetsToReturn(long newMaxDataSetsToReturn) {
		long oldMaxDataSetsToReturn = maxDataSetsToReturn;
		maxDataSetsToReturn = newMaxDataSetsToReturn;
		boolean oldMaxDataSetsToReturnESet = maxDataSetsToReturnESet;
		maxDataSetsToReturnESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.QUERY_FIRST_REQUEST__MAX_DATA_SETS_TO_RETURN, oldMaxDataSetsToReturn, maxDataSetsToReturn, !oldMaxDataSetsToReturnESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMaxDataSetsToReturn() {
		long oldMaxDataSetsToReturn = maxDataSetsToReturn;
		boolean oldMaxDataSetsToReturnESet = maxDataSetsToReturnESet;
		maxDataSetsToReturn = MAX_DATA_SETS_TO_RETURN_EDEFAULT;
		maxDataSetsToReturnESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.QUERY_FIRST_REQUEST__MAX_DATA_SETS_TO_RETURN, oldMaxDataSetsToReturn, MAX_DATA_SETS_TO_RETURN_EDEFAULT, oldMaxDataSetsToReturnESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMaxDataSetsToReturn() {
		return maxDataSetsToReturnESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getMaxReferencesToReturn() {
		return maxReferencesToReturn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxReferencesToReturn(long newMaxReferencesToReturn) {
		long oldMaxReferencesToReturn = maxReferencesToReturn;
		maxReferencesToReturn = newMaxReferencesToReturn;
		boolean oldMaxReferencesToReturnESet = maxReferencesToReturnESet;
		maxReferencesToReturnESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.QUERY_FIRST_REQUEST__MAX_REFERENCES_TO_RETURN, oldMaxReferencesToReturn, maxReferencesToReturn, !oldMaxReferencesToReturnESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMaxReferencesToReturn() {
		long oldMaxReferencesToReturn = maxReferencesToReturn;
		boolean oldMaxReferencesToReturnESet = maxReferencesToReturnESet;
		maxReferencesToReturn = MAX_REFERENCES_TO_RETURN_EDEFAULT;
		maxReferencesToReturnESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.QUERY_FIRST_REQUEST__MAX_REFERENCES_TO_RETURN, oldMaxReferencesToReturn, MAX_REFERENCES_TO_RETURN_EDEFAULT, oldMaxReferencesToReturnESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMaxReferencesToReturn() {
		return maxReferencesToReturnESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.QUERY_FIRST_REQUEST__REQUEST_HEADER:
				return basicUnsetRequestHeader(msgs);
			case TypesPackage.QUERY_FIRST_REQUEST__VIEW:
				return basicUnsetView(msgs);
			case TypesPackage.QUERY_FIRST_REQUEST__NODE_TYPES:
				return basicUnsetNodeTypes(msgs);
			case TypesPackage.QUERY_FIRST_REQUEST__FILTER:
				return basicUnsetFilter(msgs);
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
			case TypesPackage.QUERY_FIRST_REQUEST__REQUEST_HEADER:
				return getRequestHeader();
			case TypesPackage.QUERY_FIRST_REQUEST__VIEW:
				return getView();
			case TypesPackage.QUERY_FIRST_REQUEST__NODE_TYPES:
				return getNodeTypes();
			case TypesPackage.QUERY_FIRST_REQUEST__FILTER:
				return getFilter();
			case TypesPackage.QUERY_FIRST_REQUEST__MAX_DATA_SETS_TO_RETURN:
				return getMaxDataSetsToReturn();
			case TypesPackage.QUERY_FIRST_REQUEST__MAX_REFERENCES_TO_RETURN:
				return getMaxReferencesToReturn();
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
			case TypesPackage.QUERY_FIRST_REQUEST__REQUEST_HEADER:
				setRequestHeader((RequestHeader)newValue);
				return;
			case TypesPackage.QUERY_FIRST_REQUEST__VIEW:
				setView((ViewDescription)newValue);
				return;
			case TypesPackage.QUERY_FIRST_REQUEST__NODE_TYPES:
				setNodeTypes((ListOfNodeTypeDescription)newValue);
				return;
			case TypesPackage.QUERY_FIRST_REQUEST__FILTER:
				setFilter((ContentFilter)newValue);
				return;
			case TypesPackage.QUERY_FIRST_REQUEST__MAX_DATA_SETS_TO_RETURN:
				setMaxDataSetsToReturn((Long)newValue);
				return;
			case TypesPackage.QUERY_FIRST_REQUEST__MAX_REFERENCES_TO_RETURN:
				setMaxReferencesToReturn((Long)newValue);
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
			case TypesPackage.QUERY_FIRST_REQUEST__REQUEST_HEADER:
				unsetRequestHeader();
				return;
			case TypesPackage.QUERY_FIRST_REQUEST__VIEW:
				unsetView();
				return;
			case TypesPackage.QUERY_FIRST_REQUEST__NODE_TYPES:
				unsetNodeTypes();
				return;
			case TypesPackage.QUERY_FIRST_REQUEST__FILTER:
				unsetFilter();
				return;
			case TypesPackage.QUERY_FIRST_REQUEST__MAX_DATA_SETS_TO_RETURN:
				unsetMaxDataSetsToReturn();
				return;
			case TypesPackage.QUERY_FIRST_REQUEST__MAX_REFERENCES_TO_RETURN:
				unsetMaxReferencesToReturn();
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
			case TypesPackage.QUERY_FIRST_REQUEST__REQUEST_HEADER:
				return isSetRequestHeader();
			case TypesPackage.QUERY_FIRST_REQUEST__VIEW:
				return isSetView();
			case TypesPackage.QUERY_FIRST_REQUEST__NODE_TYPES:
				return isSetNodeTypes();
			case TypesPackage.QUERY_FIRST_REQUEST__FILTER:
				return isSetFilter();
			case TypesPackage.QUERY_FIRST_REQUEST__MAX_DATA_SETS_TO_RETURN:
				return isSetMaxDataSetsToReturn();
			case TypesPackage.QUERY_FIRST_REQUEST__MAX_REFERENCES_TO_RETURN:
				return isSetMaxReferencesToReturn();
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
		result.append(" (maxDataSetsToReturn: ");
		if (maxDataSetsToReturnESet) result.append(maxDataSetsToReturn); else result.append("<unset>");
		result.append(", maxReferencesToReturn: ");
		if (maxReferencesToReturnESet) result.append(maxReferencesToReturn); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //QueryFirstRequestImpl
