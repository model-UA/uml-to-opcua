/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.opcfoundation.ua._2008._02.types.BrowsePath;
import org.opcfoundation.ua._2008._02.types.NodeId;
import org.opcfoundation.ua._2008._02.types.RelativePath;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Browse Path</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.BrowsePathImpl#getStartingNode <em>Starting Node</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.BrowsePathImpl#getRelativePath <em>Relative Path</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BrowsePathImpl extends MinimalEObjectImpl.Container implements BrowsePath {
	/**
	 * The cached value of the '{@link #getStartingNode() <em>Starting Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartingNode()
	 * @generated
	 * @ordered
	 */
	protected NodeId startingNode;

	/**
	 * This is true if the Starting Node containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean startingNodeESet;

	/**
	 * The cached value of the '{@link #getRelativePath() <em>Relative Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelativePath()
	 * @generated
	 * @ordered
	 */
	protected RelativePath relativePath;

	/**
	 * This is true if the Relative Path containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean relativePathESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BrowsePathImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getBrowsePath();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeId getStartingNode() {
		return startingNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStartingNode(NodeId newStartingNode, NotificationChain msgs) {
		NodeId oldStartingNode = startingNode;
		startingNode = newStartingNode;
		boolean oldStartingNodeESet = startingNodeESet;
		startingNodeESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.BROWSE_PATH__STARTING_NODE, oldStartingNode, newStartingNode, !oldStartingNodeESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartingNode(NodeId newStartingNode) {
		if (newStartingNode != startingNode) {
			NotificationChain msgs = null;
			if (startingNode != null)
				msgs = ((InternalEObject)startingNode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.BROWSE_PATH__STARTING_NODE, null, msgs);
			if (newStartingNode != null)
				msgs = ((InternalEObject)newStartingNode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.BROWSE_PATH__STARTING_NODE, null, msgs);
			msgs = basicSetStartingNode(newStartingNode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldStartingNodeESet = startingNodeESet;
			startingNodeESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.BROWSE_PATH__STARTING_NODE, newStartingNode, newStartingNode, !oldStartingNodeESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetStartingNode(NotificationChain msgs) {
		NodeId oldStartingNode = startingNode;
		startingNode = null;
		boolean oldStartingNodeESet = startingNodeESet;
		startingNodeESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.BROWSE_PATH__STARTING_NODE, oldStartingNode, null, oldStartingNodeESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStartingNode() {
		if (startingNode != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)startingNode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.BROWSE_PATH__STARTING_NODE, null, msgs);
			msgs = basicUnsetStartingNode(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldStartingNodeESet = startingNodeESet;
			startingNodeESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.BROWSE_PATH__STARTING_NODE, null, null, oldStartingNodeESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStartingNode() {
		return startingNodeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelativePath getRelativePath() {
		return relativePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelativePath(RelativePath newRelativePath, NotificationChain msgs) {
		RelativePath oldRelativePath = relativePath;
		relativePath = newRelativePath;
		boolean oldRelativePathESet = relativePathESet;
		relativePathESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.BROWSE_PATH__RELATIVE_PATH, oldRelativePath, newRelativePath, !oldRelativePathESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelativePath(RelativePath newRelativePath) {
		if (newRelativePath != relativePath) {
			NotificationChain msgs = null;
			if (relativePath != null)
				msgs = ((InternalEObject)relativePath).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.BROWSE_PATH__RELATIVE_PATH, null, msgs);
			if (newRelativePath != null)
				msgs = ((InternalEObject)newRelativePath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.BROWSE_PATH__RELATIVE_PATH, null, msgs);
			msgs = basicSetRelativePath(newRelativePath, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldRelativePathESet = relativePathESet;
			relativePathESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.BROWSE_PATH__RELATIVE_PATH, newRelativePath, newRelativePath, !oldRelativePathESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetRelativePath(NotificationChain msgs) {
		RelativePath oldRelativePath = relativePath;
		relativePath = null;
		boolean oldRelativePathESet = relativePathESet;
		relativePathESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.BROWSE_PATH__RELATIVE_PATH, oldRelativePath, null, oldRelativePathESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRelativePath() {
		if (relativePath != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)relativePath).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.BROWSE_PATH__RELATIVE_PATH, null, msgs);
			msgs = basicUnsetRelativePath(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldRelativePathESet = relativePathESet;
			relativePathESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.BROWSE_PATH__RELATIVE_PATH, null, null, oldRelativePathESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRelativePath() {
		return relativePathESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.BROWSE_PATH__STARTING_NODE:
				return basicUnsetStartingNode(msgs);
			case TypesPackage.BROWSE_PATH__RELATIVE_PATH:
				return basicUnsetRelativePath(msgs);
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
			case TypesPackage.BROWSE_PATH__STARTING_NODE:
				return getStartingNode();
			case TypesPackage.BROWSE_PATH__RELATIVE_PATH:
				return getRelativePath();
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
			case TypesPackage.BROWSE_PATH__STARTING_NODE:
				setStartingNode((NodeId)newValue);
				return;
			case TypesPackage.BROWSE_PATH__RELATIVE_PATH:
				setRelativePath((RelativePath)newValue);
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
			case TypesPackage.BROWSE_PATH__STARTING_NODE:
				unsetStartingNode();
				return;
			case TypesPackage.BROWSE_PATH__RELATIVE_PATH:
				unsetRelativePath();
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
			case TypesPackage.BROWSE_PATH__STARTING_NODE:
				return isSetStartingNode();
			case TypesPackage.BROWSE_PATH__RELATIVE_PATH:
				return isSetRelativePath();
		}
		return super.eIsSet(featureID);
	}

} //BrowsePathImpl
