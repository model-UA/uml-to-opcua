/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.opcfoundation.ua._2008._02.types.BrowseRequest;
import org.opcfoundation.ua._2008._02.types.ListOfBrowseDescription;
import org.opcfoundation.ua._2008._02.types.RequestHeader;
import org.opcfoundation.ua._2008._02.types.TypesPackage;
import org.opcfoundation.ua._2008._02.types.ViewDescription;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Browse Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.BrowseRequestImpl#getRequestHeader <em>Request Header</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.BrowseRequestImpl#getView <em>View</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.BrowseRequestImpl#getRequestedMaxReferencesPerNode <em>Requested Max References Per Node</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.BrowseRequestImpl#getNodesToBrowse <em>Nodes To Browse</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BrowseRequestImpl extends MinimalEObjectImpl.Container implements BrowseRequest {
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
	 * The default value of the '{@link #getRequestedMaxReferencesPerNode() <em>Requested Max References Per Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestedMaxReferencesPerNode()
	 * @generated
	 * @ordered
	 */
	protected static final long REQUESTED_MAX_REFERENCES_PER_NODE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getRequestedMaxReferencesPerNode() <em>Requested Max References Per Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestedMaxReferencesPerNode()
	 * @generated
	 * @ordered
	 */
	protected long requestedMaxReferencesPerNode = REQUESTED_MAX_REFERENCES_PER_NODE_EDEFAULT;

	/**
	 * This is true if the Requested Max References Per Node attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean requestedMaxReferencesPerNodeESet;

	/**
	 * The cached value of the '{@link #getNodesToBrowse() <em>Nodes To Browse</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodesToBrowse()
	 * @generated
	 * @ordered
	 */
	protected ListOfBrowseDescription nodesToBrowse;

	/**
	 * This is true if the Nodes To Browse containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nodesToBrowseESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BrowseRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getBrowseRequest();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.BROWSE_REQUEST__REQUEST_HEADER, oldRequestHeader, newRequestHeader, !oldRequestHeaderESet);
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
				msgs = ((InternalEObject)requestHeader).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.BROWSE_REQUEST__REQUEST_HEADER, null, msgs);
			if (newRequestHeader != null)
				msgs = ((InternalEObject)newRequestHeader).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.BROWSE_REQUEST__REQUEST_HEADER, null, msgs);
			msgs = basicSetRequestHeader(newRequestHeader, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldRequestHeaderESet = requestHeaderESet;
			requestHeaderESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.BROWSE_REQUEST__REQUEST_HEADER, newRequestHeader, newRequestHeader, !oldRequestHeaderESet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.BROWSE_REQUEST__REQUEST_HEADER, oldRequestHeader, null, oldRequestHeaderESet);
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
			msgs = ((InternalEObject)requestHeader).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.BROWSE_REQUEST__REQUEST_HEADER, null, msgs);
			msgs = basicUnsetRequestHeader(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldRequestHeaderESet = requestHeaderESet;
			requestHeaderESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.BROWSE_REQUEST__REQUEST_HEADER, null, null, oldRequestHeaderESet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.BROWSE_REQUEST__VIEW, oldView, newView, !oldViewESet);
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
				msgs = ((InternalEObject)view).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.BROWSE_REQUEST__VIEW, null, msgs);
			if (newView != null)
				msgs = ((InternalEObject)newView).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.BROWSE_REQUEST__VIEW, null, msgs);
			msgs = basicSetView(newView, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldViewESet = viewESet;
			viewESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.BROWSE_REQUEST__VIEW, newView, newView, !oldViewESet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.BROWSE_REQUEST__VIEW, oldView, null, oldViewESet);
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
			msgs = ((InternalEObject)view).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.BROWSE_REQUEST__VIEW, null, msgs);
			msgs = basicUnsetView(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldViewESet = viewESet;
			viewESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.BROWSE_REQUEST__VIEW, null, null, oldViewESet));
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
	public long getRequestedMaxReferencesPerNode() {
		return requestedMaxReferencesPerNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequestedMaxReferencesPerNode(long newRequestedMaxReferencesPerNode) {
		long oldRequestedMaxReferencesPerNode = requestedMaxReferencesPerNode;
		requestedMaxReferencesPerNode = newRequestedMaxReferencesPerNode;
		boolean oldRequestedMaxReferencesPerNodeESet = requestedMaxReferencesPerNodeESet;
		requestedMaxReferencesPerNodeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.BROWSE_REQUEST__REQUESTED_MAX_REFERENCES_PER_NODE, oldRequestedMaxReferencesPerNode, requestedMaxReferencesPerNode, !oldRequestedMaxReferencesPerNodeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRequestedMaxReferencesPerNode() {
		long oldRequestedMaxReferencesPerNode = requestedMaxReferencesPerNode;
		boolean oldRequestedMaxReferencesPerNodeESet = requestedMaxReferencesPerNodeESet;
		requestedMaxReferencesPerNode = REQUESTED_MAX_REFERENCES_PER_NODE_EDEFAULT;
		requestedMaxReferencesPerNodeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.BROWSE_REQUEST__REQUESTED_MAX_REFERENCES_PER_NODE, oldRequestedMaxReferencesPerNode, REQUESTED_MAX_REFERENCES_PER_NODE_EDEFAULT, oldRequestedMaxReferencesPerNodeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRequestedMaxReferencesPerNode() {
		return requestedMaxReferencesPerNodeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfBrowseDescription getNodesToBrowse() {
		return nodesToBrowse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNodesToBrowse(ListOfBrowseDescription newNodesToBrowse, NotificationChain msgs) {
		ListOfBrowseDescription oldNodesToBrowse = nodesToBrowse;
		nodesToBrowse = newNodesToBrowse;
		boolean oldNodesToBrowseESet = nodesToBrowseESet;
		nodesToBrowseESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.BROWSE_REQUEST__NODES_TO_BROWSE, oldNodesToBrowse, newNodesToBrowse, !oldNodesToBrowseESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNodesToBrowse(ListOfBrowseDescription newNodesToBrowse) {
		if (newNodesToBrowse != nodesToBrowse) {
			NotificationChain msgs = null;
			if (nodesToBrowse != null)
				msgs = ((InternalEObject)nodesToBrowse).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.BROWSE_REQUEST__NODES_TO_BROWSE, null, msgs);
			if (newNodesToBrowse != null)
				msgs = ((InternalEObject)newNodesToBrowse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.BROWSE_REQUEST__NODES_TO_BROWSE, null, msgs);
			msgs = basicSetNodesToBrowse(newNodesToBrowse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldNodesToBrowseESet = nodesToBrowseESet;
			nodesToBrowseESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.BROWSE_REQUEST__NODES_TO_BROWSE, newNodesToBrowse, newNodesToBrowse, !oldNodesToBrowseESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetNodesToBrowse(NotificationChain msgs) {
		ListOfBrowseDescription oldNodesToBrowse = nodesToBrowse;
		nodesToBrowse = null;
		boolean oldNodesToBrowseESet = nodesToBrowseESet;
		nodesToBrowseESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.BROWSE_REQUEST__NODES_TO_BROWSE, oldNodesToBrowse, null, oldNodesToBrowseESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNodesToBrowse() {
		if (nodesToBrowse != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)nodesToBrowse).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.BROWSE_REQUEST__NODES_TO_BROWSE, null, msgs);
			msgs = basicUnsetNodesToBrowse(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldNodesToBrowseESet = nodesToBrowseESet;
			nodesToBrowseESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.BROWSE_REQUEST__NODES_TO_BROWSE, null, null, oldNodesToBrowseESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNodesToBrowse() {
		return nodesToBrowseESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.BROWSE_REQUEST__REQUEST_HEADER:
				return basicUnsetRequestHeader(msgs);
			case TypesPackage.BROWSE_REQUEST__VIEW:
				return basicUnsetView(msgs);
			case TypesPackage.BROWSE_REQUEST__NODES_TO_BROWSE:
				return basicUnsetNodesToBrowse(msgs);
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
			case TypesPackage.BROWSE_REQUEST__REQUEST_HEADER:
				return getRequestHeader();
			case TypesPackage.BROWSE_REQUEST__VIEW:
				return getView();
			case TypesPackage.BROWSE_REQUEST__REQUESTED_MAX_REFERENCES_PER_NODE:
				return getRequestedMaxReferencesPerNode();
			case TypesPackage.BROWSE_REQUEST__NODES_TO_BROWSE:
				return getNodesToBrowse();
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
			case TypesPackage.BROWSE_REQUEST__REQUEST_HEADER:
				setRequestHeader((RequestHeader)newValue);
				return;
			case TypesPackage.BROWSE_REQUEST__VIEW:
				setView((ViewDescription)newValue);
				return;
			case TypesPackage.BROWSE_REQUEST__REQUESTED_MAX_REFERENCES_PER_NODE:
				setRequestedMaxReferencesPerNode((Long)newValue);
				return;
			case TypesPackage.BROWSE_REQUEST__NODES_TO_BROWSE:
				setNodesToBrowse((ListOfBrowseDescription)newValue);
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
			case TypesPackage.BROWSE_REQUEST__REQUEST_HEADER:
				unsetRequestHeader();
				return;
			case TypesPackage.BROWSE_REQUEST__VIEW:
				unsetView();
				return;
			case TypesPackage.BROWSE_REQUEST__REQUESTED_MAX_REFERENCES_PER_NODE:
				unsetRequestedMaxReferencesPerNode();
				return;
			case TypesPackage.BROWSE_REQUEST__NODES_TO_BROWSE:
				unsetNodesToBrowse();
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
			case TypesPackage.BROWSE_REQUEST__REQUEST_HEADER:
				return isSetRequestHeader();
			case TypesPackage.BROWSE_REQUEST__VIEW:
				return isSetView();
			case TypesPackage.BROWSE_REQUEST__REQUESTED_MAX_REFERENCES_PER_NODE:
				return isSetRequestedMaxReferencesPerNode();
			case TypesPackage.BROWSE_REQUEST__NODES_TO_BROWSE:
				return isSetNodesToBrowse();
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
		result.append(" (requestedMaxReferencesPerNode: ");
		if (requestedMaxReferencesPerNodeESet) result.append(requestedMaxReferencesPerNode); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //BrowseRequestImpl
