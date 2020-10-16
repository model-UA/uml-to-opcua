/**
 */
package org.opcfoundation.ua._2011._03.ua.node.set.impl;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.opcfoundation.ua._2011._03.ua.node.set.NodeSetStatusList;
import org.opcfoundation.ua._2011._03.ua.node.set.SetPackage;
import org.opcfoundation.ua._2011._03.ua.node.set.UANodeSetChangesStatusType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UA Node Set Changes Status Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.UANodeSetChangesStatusTypeImpl#getNodesToAdd <em>Nodes To Add</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.UANodeSetChangesStatusTypeImpl#getReferencesToAdd <em>References To Add</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.UANodeSetChangesStatusTypeImpl#getNodesToDelete <em>Nodes To Delete</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.UANodeSetChangesStatusTypeImpl#getReferencesToDelete <em>References To Delete</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.UANodeSetChangesStatusTypeImpl#getLastModified <em>Last Modified</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.UANodeSetChangesStatusTypeImpl#getTransactionId <em>Transaction Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UANodeSetChangesStatusTypeImpl extends MinimalEObjectImpl.Container implements UANodeSetChangesStatusType {
	/**
	 * The cached value of the '{@link #getNodesToAdd() <em>Nodes To Add</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodesToAdd()
	 * @generated
	 * @ordered
	 */
	protected NodeSetStatusList nodesToAdd;

	/**
	 * The cached value of the '{@link #getReferencesToAdd() <em>References To Add</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencesToAdd()
	 * @generated
	 * @ordered
	 */
	protected NodeSetStatusList referencesToAdd;

	/**
	 * The cached value of the '{@link #getNodesToDelete() <em>Nodes To Delete</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodesToDelete()
	 * @generated
	 * @ordered
	 */
	protected NodeSetStatusList nodesToDelete;

	/**
	 * The cached value of the '{@link #getReferencesToDelete() <em>References To Delete</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencesToDelete()
	 * @generated
	 * @ordered
	 */
	protected NodeSetStatusList referencesToDelete;

	/**
	 * The default value of the '{@link #getLastModified() <em>Last Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastModified()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar LAST_MODIFIED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastModified() <em>Last Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastModified()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar lastModified = LAST_MODIFIED_EDEFAULT;

	/**
	 * The default value of the '{@link #getTransactionId() <em>Transaction Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactionId()
	 * @generated
	 * @ordered
	 */
	protected static final String TRANSACTION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTransactionId() <em>Transaction Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactionId()
	 * @generated
	 * @ordered
	 */
	protected String transactionId = TRANSACTION_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UANodeSetChangesStatusTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SetPackage.Literals.UA_NODE_SET_CHANGES_STATUS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeSetStatusList getNodesToAdd() {
		return nodesToAdd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNodesToAdd(NodeSetStatusList newNodesToAdd, NotificationChain msgs) {
		NodeSetStatusList oldNodesToAdd = nodesToAdd;
		nodesToAdd = newNodesToAdd;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SetPackage.UA_NODE_SET_CHANGES_STATUS_TYPE__NODES_TO_ADD, oldNodesToAdd, newNodesToAdd);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNodesToAdd(NodeSetStatusList newNodesToAdd) {
		if (newNodesToAdd != nodesToAdd) {
			NotificationChain msgs = null;
			if (nodesToAdd != null)
				msgs = ((InternalEObject)nodesToAdd).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SetPackage.UA_NODE_SET_CHANGES_STATUS_TYPE__NODES_TO_ADD, null, msgs);
			if (newNodesToAdd != null)
				msgs = ((InternalEObject)newNodesToAdd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SetPackage.UA_NODE_SET_CHANGES_STATUS_TYPE__NODES_TO_ADD, null, msgs);
			msgs = basicSetNodesToAdd(newNodesToAdd, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SetPackage.UA_NODE_SET_CHANGES_STATUS_TYPE__NODES_TO_ADD, newNodesToAdd, newNodesToAdd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeSetStatusList getReferencesToAdd() {
		return referencesToAdd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferencesToAdd(NodeSetStatusList newReferencesToAdd, NotificationChain msgs) {
		NodeSetStatusList oldReferencesToAdd = referencesToAdd;
		referencesToAdd = newReferencesToAdd;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SetPackage.UA_NODE_SET_CHANGES_STATUS_TYPE__REFERENCES_TO_ADD, oldReferencesToAdd, newReferencesToAdd);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferencesToAdd(NodeSetStatusList newReferencesToAdd) {
		if (newReferencesToAdd != referencesToAdd) {
			NotificationChain msgs = null;
			if (referencesToAdd != null)
				msgs = ((InternalEObject)referencesToAdd).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SetPackage.UA_NODE_SET_CHANGES_STATUS_TYPE__REFERENCES_TO_ADD, null, msgs);
			if (newReferencesToAdd != null)
				msgs = ((InternalEObject)newReferencesToAdd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SetPackage.UA_NODE_SET_CHANGES_STATUS_TYPE__REFERENCES_TO_ADD, null, msgs);
			msgs = basicSetReferencesToAdd(newReferencesToAdd, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SetPackage.UA_NODE_SET_CHANGES_STATUS_TYPE__REFERENCES_TO_ADD, newReferencesToAdd, newReferencesToAdd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeSetStatusList getNodesToDelete() {
		return nodesToDelete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNodesToDelete(NodeSetStatusList newNodesToDelete, NotificationChain msgs) {
		NodeSetStatusList oldNodesToDelete = nodesToDelete;
		nodesToDelete = newNodesToDelete;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SetPackage.UA_NODE_SET_CHANGES_STATUS_TYPE__NODES_TO_DELETE, oldNodesToDelete, newNodesToDelete);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNodesToDelete(NodeSetStatusList newNodesToDelete) {
		if (newNodesToDelete != nodesToDelete) {
			NotificationChain msgs = null;
			if (nodesToDelete != null)
				msgs = ((InternalEObject)nodesToDelete).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SetPackage.UA_NODE_SET_CHANGES_STATUS_TYPE__NODES_TO_DELETE, null, msgs);
			if (newNodesToDelete != null)
				msgs = ((InternalEObject)newNodesToDelete).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SetPackage.UA_NODE_SET_CHANGES_STATUS_TYPE__NODES_TO_DELETE, null, msgs);
			msgs = basicSetNodesToDelete(newNodesToDelete, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SetPackage.UA_NODE_SET_CHANGES_STATUS_TYPE__NODES_TO_DELETE, newNodesToDelete, newNodesToDelete));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeSetStatusList getReferencesToDelete() {
		return referencesToDelete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferencesToDelete(NodeSetStatusList newReferencesToDelete, NotificationChain msgs) {
		NodeSetStatusList oldReferencesToDelete = referencesToDelete;
		referencesToDelete = newReferencesToDelete;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SetPackage.UA_NODE_SET_CHANGES_STATUS_TYPE__REFERENCES_TO_DELETE, oldReferencesToDelete, newReferencesToDelete);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferencesToDelete(NodeSetStatusList newReferencesToDelete) {
		if (newReferencesToDelete != referencesToDelete) {
			NotificationChain msgs = null;
			if (referencesToDelete != null)
				msgs = ((InternalEObject)referencesToDelete).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SetPackage.UA_NODE_SET_CHANGES_STATUS_TYPE__REFERENCES_TO_DELETE, null, msgs);
			if (newReferencesToDelete != null)
				msgs = ((InternalEObject)newReferencesToDelete).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SetPackage.UA_NODE_SET_CHANGES_STATUS_TYPE__REFERENCES_TO_DELETE, null, msgs);
			msgs = basicSetReferencesToDelete(newReferencesToDelete, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SetPackage.UA_NODE_SET_CHANGES_STATUS_TYPE__REFERENCES_TO_DELETE, newReferencesToDelete, newReferencesToDelete));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getLastModified() {
		return lastModified;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastModified(XMLGregorianCalendar newLastModified) {
		XMLGregorianCalendar oldLastModified = lastModified;
		lastModified = newLastModified;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SetPackage.UA_NODE_SET_CHANGES_STATUS_TYPE__LAST_MODIFIED, oldLastModified, lastModified));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTransactionId() {
		return transactionId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransactionId(String newTransactionId) {
		String oldTransactionId = transactionId;
		transactionId = newTransactionId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SetPackage.UA_NODE_SET_CHANGES_STATUS_TYPE__TRANSACTION_ID, oldTransactionId, transactionId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SetPackage.UA_NODE_SET_CHANGES_STATUS_TYPE__NODES_TO_ADD:
				return basicSetNodesToAdd(null, msgs);
			case SetPackage.UA_NODE_SET_CHANGES_STATUS_TYPE__REFERENCES_TO_ADD:
				return basicSetReferencesToAdd(null, msgs);
			case SetPackage.UA_NODE_SET_CHANGES_STATUS_TYPE__NODES_TO_DELETE:
				return basicSetNodesToDelete(null, msgs);
			case SetPackage.UA_NODE_SET_CHANGES_STATUS_TYPE__REFERENCES_TO_DELETE:
				return basicSetReferencesToDelete(null, msgs);
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
			case SetPackage.UA_NODE_SET_CHANGES_STATUS_TYPE__NODES_TO_ADD:
				return getNodesToAdd();
			case SetPackage.UA_NODE_SET_CHANGES_STATUS_TYPE__REFERENCES_TO_ADD:
				return getReferencesToAdd();
			case SetPackage.UA_NODE_SET_CHANGES_STATUS_TYPE__NODES_TO_DELETE:
				return getNodesToDelete();
			case SetPackage.UA_NODE_SET_CHANGES_STATUS_TYPE__REFERENCES_TO_DELETE:
				return getReferencesToDelete();
			case SetPackage.UA_NODE_SET_CHANGES_STATUS_TYPE__LAST_MODIFIED:
				return getLastModified();
			case SetPackage.UA_NODE_SET_CHANGES_STATUS_TYPE__TRANSACTION_ID:
				return getTransactionId();
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
			case SetPackage.UA_NODE_SET_CHANGES_STATUS_TYPE__NODES_TO_ADD:
				setNodesToAdd((NodeSetStatusList)newValue);
				return;
			case SetPackage.UA_NODE_SET_CHANGES_STATUS_TYPE__REFERENCES_TO_ADD:
				setReferencesToAdd((NodeSetStatusList)newValue);
				return;
			case SetPackage.UA_NODE_SET_CHANGES_STATUS_TYPE__NODES_TO_DELETE:
				setNodesToDelete((NodeSetStatusList)newValue);
				return;
			case SetPackage.UA_NODE_SET_CHANGES_STATUS_TYPE__REFERENCES_TO_DELETE:
				setReferencesToDelete((NodeSetStatusList)newValue);
				return;
			case SetPackage.UA_NODE_SET_CHANGES_STATUS_TYPE__LAST_MODIFIED:
				setLastModified((XMLGregorianCalendar)newValue);
				return;
			case SetPackage.UA_NODE_SET_CHANGES_STATUS_TYPE__TRANSACTION_ID:
				setTransactionId((String)newValue);
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
			case SetPackage.UA_NODE_SET_CHANGES_STATUS_TYPE__NODES_TO_ADD:
				setNodesToAdd((NodeSetStatusList)null);
				return;
			case SetPackage.UA_NODE_SET_CHANGES_STATUS_TYPE__REFERENCES_TO_ADD:
				setReferencesToAdd((NodeSetStatusList)null);
				return;
			case SetPackage.UA_NODE_SET_CHANGES_STATUS_TYPE__NODES_TO_DELETE:
				setNodesToDelete((NodeSetStatusList)null);
				return;
			case SetPackage.UA_NODE_SET_CHANGES_STATUS_TYPE__REFERENCES_TO_DELETE:
				setReferencesToDelete((NodeSetStatusList)null);
				return;
			case SetPackage.UA_NODE_SET_CHANGES_STATUS_TYPE__LAST_MODIFIED:
				setLastModified(LAST_MODIFIED_EDEFAULT);
				return;
			case SetPackage.UA_NODE_SET_CHANGES_STATUS_TYPE__TRANSACTION_ID:
				setTransactionId(TRANSACTION_ID_EDEFAULT);
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
			case SetPackage.UA_NODE_SET_CHANGES_STATUS_TYPE__NODES_TO_ADD:
				return nodesToAdd != null;
			case SetPackage.UA_NODE_SET_CHANGES_STATUS_TYPE__REFERENCES_TO_ADD:
				return referencesToAdd != null;
			case SetPackage.UA_NODE_SET_CHANGES_STATUS_TYPE__NODES_TO_DELETE:
				return nodesToDelete != null;
			case SetPackage.UA_NODE_SET_CHANGES_STATUS_TYPE__REFERENCES_TO_DELETE:
				return referencesToDelete != null;
			case SetPackage.UA_NODE_SET_CHANGES_STATUS_TYPE__LAST_MODIFIED:
				return LAST_MODIFIED_EDEFAULT == null ? lastModified != null : !LAST_MODIFIED_EDEFAULT.equals(lastModified);
			case SetPackage.UA_NODE_SET_CHANGES_STATUS_TYPE__TRANSACTION_ID:
				return TRANSACTION_ID_EDEFAULT == null ? transactionId != null : !TRANSACTION_ID_EDEFAULT.equals(transactionId);
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
		result.append(" (lastModified: ");
		result.append(lastModified);
		result.append(", transactionId: ");
		result.append(transactionId);
		result.append(')');
		return result.toString();
	}

} //UANodeSetChangesStatusTypeImpl
