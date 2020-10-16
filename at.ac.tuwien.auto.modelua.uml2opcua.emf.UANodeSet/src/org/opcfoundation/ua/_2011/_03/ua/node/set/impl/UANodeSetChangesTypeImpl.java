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

import org.opcfoundation.ua._2011._03.ua.node.set.AliasTable;
import org.opcfoundation.ua._2011._03.ua.node.set.ListOfExtensions;
import org.opcfoundation.ua._2011._03.ua.node.set.NodesToAdd;
import org.opcfoundation.ua._2011._03.ua.node.set.NodesToDelete;
import org.opcfoundation.ua._2011._03.ua.node.set.ReferencesToChange;
import org.opcfoundation.ua._2011._03.ua.node.set.SetPackage;
import org.opcfoundation.ua._2011._03.ua.node.set.UANodeSetChangesType;
import org.opcfoundation.ua._2011._03.ua.node.set.UriTable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UA Node Set Changes Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.UANodeSetChangesTypeImpl#getNamespaceUris <em>Namespace Uris</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.UANodeSetChangesTypeImpl#getServerUris <em>Server Uris</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.UANodeSetChangesTypeImpl#getAliases <em>Aliases</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.UANodeSetChangesTypeImpl#getExtensions <em>Extensions</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.UANodeSetChangesTypeImpl#getNodesToAdd <em>Nodes To Add</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.UANodeSetChangesTypeImpl#getReferencesToAdd <em>References To Add</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.UANodeSetChangesTypeImpl#getNodesToDelete <em>Nodes To Delete</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.UANodeSetChangesTypeImpl#getReferencesToDelete <em>References To Delete</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.UANodeSetChangesTypeImpl#isAcceptAllOrNothing <em>Accept All Or Nothing</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.UANodeSetChangesTypeImpl#getLastModified <em>Last Modified</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.UANodeSetChangesTypeImpl#getTransactionId <em>Transaction Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UANodeSetChangesTypeImpl extends MinimalEObjectImpl.Container implements UANodeSetChangesType {
	/**
	 * The cached value of the '{@link #getNamespaceUris() <em>Namespace Uris</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespaceUris()
	 * @generated
	 * @ordered
	 */
	protected UriTable namespaceUris;

	/**
	 * The cached value of the '{@link #getServerUris() <em>Server Uris</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerUris()
	 * @generated
	 * @ordered
	 */
	protected UriTable serverUris;

	/**
	 * The cached value of the '{@link #getAliases() <em>Aliases</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAliases()
	 * @generated
	 * @ordered
	 */
	protected AliasTable aliases;

	/**
	 * The cached value of the '{@link #getExtensions() <em>Extensions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtensions()
	 * @generated
	 * @ordered
	 */
	protected ListOfExtensions extensions;

	/**
	 * The cached value of the '{@link #getNodesToAdd() <em>Nodes To Add</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodesToAdd()
	 * @generated
	 * @ordered
	 */
	protected NodesToAdd nodesToAdd;

	/**
	 * The cached value of the '{@link #getReferencesToAdd() <em>References To Add</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencesToAdd()
	 * @generated
	 * @ordered
	 */
	protected ReferencesToChange referencesToAdd;

	/**
	 * The cached value of the '{@link #getNodesToDelete() <em>Nodes To Delete</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodesToDelete()
	 * @generated
	 * @ordered
	 */
	protected NodesToDelete nodesToDelete;

	/**
	 * The cached value of the '{@link #getReferencesToDelete() <em>References To Delete</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencesToDelete()
	 * @generated
	 * @ordered
	 */
	protected ReferencesToChange referencesToDelete;

	/**
	 * The default value of the '{@link #isAcceptAllOrNothing() <em>Accept All Or Nothing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAcceptAllOrNothing()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ACCEPT_ALL_OR_NOTHING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAcceptAllOrNothing() <em>Accept All Or Nothing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAcceptAllOrNothing()
	 * @generated
	 * @ordered
	 */
	protected boolean acceptAllOrNothing = ACCEPT_ALL_OR_NOTHING_EDEFAULT;

	/**
	 * This is true if the Accept All Or Nothing attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean acceptAllOrNothingESet;

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
	protected UANodeSetChangesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SetPackage.Literals.UA_NODE_SET_CHANGES_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UriTable getNamespaceUris() {
		return namespaceUris;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNamespaceUris(UriTable newNamespaceUris, NotificationChain msgs) {
		UriTable oldNamespaceUris = namespaceUris;
		namespaceUris = newNamespaceUris;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SetPackage.UA_NODE_SET_CHANGES_TYPE__NAMESPACE_URIS, oldNamespaceUris, newNamespaceUris);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNamespaceUris(UriTable newNamespaceUris) {
		if (newNamespaceUris != namespaceUris) {
			NotificationChain msgs = null;
			if (namespaceUris != null)
				msgs = ((InternalEObject)namespaceUris).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SetPackage.UA_NODE_SET_CHANGES_TYPE__NAMESPACE_URIS, null, msgs);
			if (newNamespaceUris != null)
				msgs = ((InternalEObject)newNamespaceUris).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SetPackage.UA_NODE_SET_CHANGES_TYPE__NAMESPACE_URIS, null, msgs);
			msgs = basicSetNamespaceUris(newNamespaceUris, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SetPackage.UA_NODE_SET_CHANGES_TYPE__NAMESPACE_URIS, newNamespaceUris, newNamespaceUris));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UriTable getServerUris() {
		return serverUris;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServerUris(UriTable newServerUris, NotificationChain msgs) {
		UriTable oldServerUris = serverUris;
		serverUris = newServerUris;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SetPackage.UA_NODE_SET_CHANGES_TYPE__SERVER_URIS, oldServerUris, newServerUris);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServerUris(UriTable newServerUris) {
		if (newServerUris != serverUris) {
			NotificationChain msgs = null;
			if (serverUris != null)
				msgs = ((InternalEObject)serverUris).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SetPackage.UA_NODE_SET_CHANGES_TYPE__SERVER_URIS, null, msgs);
			if (newServerUris != null)
				msgs = ((InternalEObject)newServerUris).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SetPackage.UA_NODE_SET_CHANGES_TYPE__SERVER_URIS, null, msgs);
			msgs = basicSetServerUris(newServerUris, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SetPackage.UA_NODE_SET_CHANGES_TYPE__SERVER_URIS, newServerUris, newServerUris));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AliasTable getAliases() {
		return aliases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAliases(AliasTable newAliases, NotificationChain msgs) {
		AliasTable oldAliases = aliases;
		aliases = newAliases;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SetPackage.UA_NODE_SET_CHANGES_TYPE__ALIASES, oldAliases, newAliases);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAliases(AliasTable newAliases) {
		if (newAliases != aliases) {
			NotificationChain msgs = null;
			if (aliases != null)
				msgs = ((InternalEObject)aliases).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SetPackage.UA_NODE_SET_CHANGES_TYPE__ALIASES, null, msgs);
			if (newAliases != null)
				msgs = ((InternalEObject)newAliases).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SetPackage.UA_NODE_SET_CHANGES_TYPE__ALIASES, null, msgs);
			msgs = basicSetAliases(newAliases, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SetPackage.UA_NODE_SET_CHANGES_TYPE__ALIASES, newAliases, newAliases));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfExtensions getExtensions() {
		return extensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtensions(ListOfExtensions newExtensions, NotificationChain msgs) {
		ListOfExtensions oldExtensions = extensions;
		extensions = newExtensions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SetPackage.UA_NODE_SET_CHANGES_TYPE__EXTENSIONS, oldExtensions, newExtensions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtensions(ListOfExtensions newExtensions) {
		if (newExtensions != extensions) {
			NotificationChain msgs = null;
			if (extensions != null)
				msgs = ((InternalEObject)extensions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SetPackage.UA_NODE_SET_CHANGES_TYPE__EXTENSIONS, null, msgs);
			if (newExtensions != null)
				msgs = ((InternalEObject)newExtensions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SetPackage.UA_NODE_SET_CHANGES_TYPE__EXTENSIONS, null, msgs);
			msgs = basicSetExtensions(newExtensions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SetPackage.UA_NODE_SET_CHANGES_TYPE__EXTENSIONS, newExtensions, newExtensions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodesToAdd getNodesToAdd() {
		return nodesToAdd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNodesToAdd(NodesToAdd newNodesToAdd, NotificationChain msgs) {
		NodesToAdd oldNodesToAdd = nodesToAdd;
		nodesToAdd = newNodesToAdd;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SetPackage.UA_NODE_SET_CHANGES_TYPE__NODES_TO_ADD, oldNodesToAdd, newNodesToAdd);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNodesToAdd(NodesToAdd newNodesToAdd) {
		if (newNodesToAdd != nodesToAdd) {
			NotificationChain msgs = null;
			if (nodesToAdd != null)
				msgs = ((InternalEObject)nodesToAdd).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SetPackage.UA_NODE_SET_CHANGES_TYPE__NODES_TO_ADD, null, msgs);
			if (newNodesToAdd != null)
				msgs = ((InternalEObject)newNodesToAdd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SetPackage.UA_NODE_SET_CHANGES_TYPE__NODES_TO_ADD, null, msgs);
			msgs = basicSetNodesToAdd(newNodesToAdd, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SetPackage.UA_NODE_SET_CHANGES_TYPE__NODES_TO_ADD, newNodesToAdd, newNodesToAdd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferencesToChange getReferencesToAdd() {
		return referencesToAdd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferencesToAdd(ReferencesToChange newReferencesToAdd, NotificationChain msgs) {
		ReferencesToChange oldReferencesToAdd = referencesToAdd;
		referencesToAdd = newReferencesToAdd;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SetPackage.UA_NODE_SET_CHANGES_TYPE__REFERENCES_TO_ADD, oldReferencesToAdd, newReferencesToAdd);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferencesToAdd(ReferencesToChange newReferencesToAdd) {
		if (newReferencesToAdd != referencesToAdd) {
			NotificationChain msgs = null;
			if (referencesToAdd != null)
				msgs = ((InternalEObject)referencesToAdd).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SetPackage.UA_NODE_SET_CHANGES_TYPE__REFERENCES_TO_ADD, null, msgs);
			if (newReferencesToAdd != null)
				msgs = ((InternalEObject)newReferencesToAdd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SetPackage.UA_NODE_SET_CHANGES_TYPE__REFERENCES_TO_ADD, null, msgs);
			msgs = basicSetReferencesToAdd(newReferencesToAdd, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SetPackage.UA_NODE_SET_CHANGES_TYPE__REFERENCES_TO_ADD, newReferencesToAdd, newReferencesToAdd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodesToDelete getNodesToDelete() {
		return nodesToDelete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNodesToDelete(NodesToDelete newNodesToDelete, NotificationChain msgs) {
		NodesToDelete oldNodesToDelete = nodesToDelete;
		nodesToDelete = newNodesToDelete;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SetPackage.UA_NODE_SET_CHANGES_TYPE__NODES_TO_DELETE, oldNodesToDelete, newNodesToDelete);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNodesToDelete(NodesToDelete newNodesToDelete) {
		if (newNodesToDelete != nodesToDelete) {
			NotificationChain msgs = null;
			if (nodesToDelete != null)
				msgs = ((InternalEObject)nodesToDelete).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SetPackage.UA_NODE_SET_CHANGES_TYPE__NODES_TO_DELETE, null, msgs);
			if (newNodesToDelete != null)
				msgs = ((InternalEObject)newNodesToDelete).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SetPackage.UA_NODE_SET_CHANGES_TYPE__NODES_TO_DELETE, null, msgs);
			msgs = basicSetNodesToDelete(newNodesToDelete, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SetPackage.UA_NODE_SET_CHANGES_TYPE__NODES_TO_DELETE, newNodesToDelete, newNodesToDelete));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferencesToChange getReferencesToDelete() {
		return referencesToDelete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferencesToDelete(ReferencesToChange newReferencesToDelete, NotificationChain msgs) {
		ReferencesToChange oldReferencesToDelete = referencesToDelete;
		referencesToDelete = newReferencesToDelete;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SetPackage.UA_NODE_SET_CHANGES_TYPE__REFERENCES_TO_DELETE, oldReferencesToDelete, newReferencesToDelete);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferencesToDelete(ReferencesToChange newReferencesToDelete) {
		if (newReferencesToDelete != referencesToDelete) {
			NotificationChain msgs = null;
			if (referencesToDelete != null)
				msgs = ((InternalEObject)referencesToDelete).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SetPackage.UA_NODE_SET_CHANGES_TYPE__REFERENCES_TO_DELETE, null, msgs);
			if (newReferencesToDelete != null)
				msgs = ((InternalEObject)newReferencesToDelete).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SetPackage.UA_NODE_SET_CHANGES_TYPE__REFERENCES_TO_DELETE, null, msgs);
			msgs = basicSetReferencesToDelete(newReferencesToDelete, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SetPackage.UA_NODE_SET_CHANGES_TYPE__REFERENCES_TO_DELETE, newReferencesToDelete, newReferencesToDelete));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAcceptAllOrNothing() {
		return acceptAllOrNothing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAcceptAllOrNothing(boolean newAcceptAllOrNothing) {
		boolean oldAcceptAllOrNothing = acceptAllOrNothing;
		acceptAllOrNothing = newAcceptAllOrNothing;
		boolean oldAcceptAllOrNothingESet = acceptAllOrNothingESet;
		acceptAllOrNothingESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SetPackage.UA_NODE_SET_CHANGES_TYPE__ACCEPT_ALL_OR_NOTHING, oldAcceptAllOrNothing, acceptAllOrNothing, !oldAcceptAllOrNothingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAcceptAllOrNothing() {
		boolean oldAcceptAllOrNothing = acceptAllOrNothing;
		boolean oldAcceptAllOrNothingESet = acceptAllOrNothingESet;
		acceptAllOrNothing = ACCEPT_ALL_OR_NOTHING_EDEFAULT;
		acceptAllOrNothingESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SetPackage.UA_NODE_SET_CHANGES_TYPE__ACCEPT_ALL_OR_NOTHING, oldAcceptAllOrNothing, ACCEPT_ALL_OR_NOTHING_EDEFAULT, oldAcceptAllOrNothingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAcceptAllOrNothing() {
		return acceptAllOrNothingESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SetPackage.UA_NODE_SET_CHANGES_TYPE__LAST_MODIFIED, oldLastModified, lastModified));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SetPackage.UA_NODE_SET_CHANGES_TYPE__TRANSACTION_ID, oldTransactionId, transactionId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SetPackage.UA_NODE_SET_CHANGES_TYPE__NAMESPACE_URIS:
				return basicSetNamespaceUris(null, msgs);
			case SetPackage.UA_NODE_SET_CHANGES_TYPE__SERVER_URIS:
				return basicSetServerUris(null, msgs);
			case SetPackage.UA_NODE_SET_CHANGES_TYPE__ALIASES:
				return basicSetAliases(null, msgs);
			case SetPackage.UA_NODE_SET_CHANGES_TYPE__EXTENSIONS:
				return basicSetExtensions(null, msgs);
			case SetPackage.UA_NODE_SET_CHANGES_TYPE__NODES_TO_ADD:
				return basicSetNodesToAdd(null, msgs);
			case SetPackage.UA_NODE_SET_CHANGES_TYPE__REFERENCES_TO_ADD:
				return basicSetReferencesToAdd(null, msgs);
			case SetPackage.UA_NODE_SET_CHANGES_TYPE__NODES_TO_DELETE:
				return basicSetNodesToDelete(null, msgs);
			case SetPackage.UA_NODE_SET_CHANGES_TYPE__REFERENCES_TO_DELETE:
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
			case SetPackage.UA_NODE_SET_CHANGES_TYPE__NAMESPACE_URIS:
				return getNamespaceUris();
			case SetPackage.UA_NODE_SET_CHANGES_TYPE__SERVER_URIS:
				return getServerUris();
			case SetPackage.UA_NODE_SET_CHANGES_TYPE__ALIASES:
				return getAliases();
			case SetPackage.UA_NODE_SET_CHANGES_TYPE__EXTENSIONS:
				return getExtensions();
			case SetPackage.UA_NODE_SET_CHANGES_TYPE__NODES_TO_ADD:
				return getNodesToAdd();
			case SetPackage.UA_NODE_SET_CHANGES_TYPE__REFERENCES_TO_ADD:
				return getReferencesToAdd();
			case SetPackage.UA_NODE_SET_CHANGES_TYPE__NODES_TO_DELETE:
				return getNodesToDelete();
			case SetPackage.UA_NODE_SET_CHANGES_TYPE__REFERENCES_TO_DELETE:
				return getReferencesToDelete();
			case SetPackage.UA_NODE_SET_CHANGES_TYPE__ACCEPT_ALL_OR_NOTHING:
				return isAcceptAllOrNothing();
			case SetPackage.UA_NODE_SET_CHANGES_TYPE__LAST_MODIFIED:
				return getLastModified();
			case SetPackage.UA_NODE_SET_CHANGES_TYPE__TRANSACTION_ID:
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
			case SetPackage.UA_NODE_SET_CHANGES_TYPE__NAMESPACE_URIS:
				setNamespaceUris((UriTable)newValue);
				return;
			case SetPackage.UA_NODE_SET_CHANGES_TYPE__SERVER_URIS:
				setServerUris((UriTable)newValue);
				return;
			case SetPackage.UA_NODE_SET_CHANGES_TYPE__ALIASES:
				setAliases((AliasTable)newValue);
				return;
			case SetPackage.UA_NODE_SET_CHANGES_TYPE__EXTENSIONS:
				setExtensions((ListOfExtensions)newValue);
				return;
			case SetPackage.UA_NODE_SET_CHANGES_TYPE__NODES_TO_ADD:
				setNodesToAdd((NodesToAdd)newValue);
				return;
			case SetPackage.UA_NODE_SET_CHANGES_TYPE__REFERENCES_TO_ADD:
				setReferencesToAdd((ReferencesToChange)newValue);
				return;
			case SetPackage.UA_NODE_SET_CHANGES_TYPE__NODES_TO_DELETE:
				setNodesToDelete((NodesToDelete)newValue);
				return;
			case SetPackage.UA_NODE_SET_CHANGES_TYPE__REFERENCES_TO_DELETE:
				setReferencesToDelete((ReferencesToChange)newValue);
				return;
			case SetPackage.UA_NODE_SET_CHANGES_TYPE__ACCEPT_ALL_OR_NOTHING:
				setAcceptAllOrNothing((Boolean)newValue);
				return;
			case SetPackage.UA_NODE_SET_CHANGES_TYPE__LAST_MODIFIED:
				setLastModified((XMLGregorianCalendar)newValue);
				return;
			case SetPackage.UA_NODE_SET_CHANGES_TYPE__TRANSACTION_ID:
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
			case SetPackage.UA_NODE_SET_CHANGES_TYPE__NAMESPACE_URIS:
				setNamespaceUris((UriTable)null);
				return;
			case SetPackage.UA_NODE_SET_CHANGES_TYPE__SERVER_URIS:
				setServerUris((UriTable)null);
				return;
			case SetPackage.UA_NODE_SET_CHANGES_TYPE__ALIASES:
				setAliases((AliasTable)null);
				return;
			case SetPackage.UA_NODE_SET_CHANGES_TYPE__EXTENSIONS:
				setExtensions((ListOfExtensions)null);
				return;
			case SetPackage.UA_NODE_SET_CHANGES_TYPE__NODES_TO_ADD:
				setNodesToAdd((NodesToAdd)null);
				return;
			case SetPackage.UA_NODE_SET_CHANGES_TYPE__REFERENCES_TO_ADD:
				setReferencesToAdd((ReferencesToChange)null);
				return;
			case SetPackage.UA_NODE_SET_CHANGES_TYPE__NODES_TO_DELETE:
				setNodesToDelete((NodesToDelete)null);
				return;
			case SetPackage.UA_NODE_SET_CHANGES_TYPE__REFERENCES_TO_DELETE:
				setReferencesToDelete((ReferencesToChange)null);
				return;
			case SetPackage.UA_NODE_SET_CHANGES_TYPE__ACCEPT_ALL_OR_NOTHING:
				unsetAcceptAllOrNothing();
				return;
			case SetPackage.UA_NODE_SET_CHANGES_TYPE__LAST_MODIFIED:
				setLastModified(LAST_MODIFIED_EDEFAULT);
				return;
			case SetPackage.UA_NODE_SET_CHANGES_TYPE__TRANSACTION_ID:
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
			case SetPackage.UA_NODE_SET_CHANGES_TYPE__NAMESPACE_URIS:
				return namespaceUris != null;
			case SetPackage.UA_NODE_SET_CHANGES_TYPE__SERVER_URIS:
				return serverUris != null;
			case SetPackage.UA_NODE_SET_CHANGES_TYPE__ALIASES:
				return aliases != null;
			case SetPackage.UA_NODE_SET_CHANGES_TYPE__EXTENSIONS:
				return extensions != null;
			case SetPackage.UA_NODE_SET_CHANGES_TYPE__NODES_TO_ADD:
				return nodesToAdd != null;
			case SetPackage.UA_NODE_SET_CHANGES_TYPE__REFERENCES_TO_ADD:
				return referencesToAdd != null;
			case SetPackage.UA_NODE_SET_CHANGES_TYPE__NODES_TO_DELETE:
				return nodesToDelete != null;
			case SetPackage.UA_NODE_SET_CHANGES_TYPE__REFERENCES_TO_DELETE:
				return referencesToDelete != null;
			case SetPackage.UA_NODE_SET_CHANGES_TYPE__ACCEPT_ALL_OR_NOTHING:
				return isSetAcceptAllOrNothing();
			case SetPackage.UA_NODE_SET_CHANGES_TYPE__LAST_MODIFIED:
				return LAST_MODIFIED_EDEFAULT == null ? lastModified != null : !LAST_MODIFIED_EDEFAULT.equals(lastModified);
			case SetPackage.UA_NODE_SET_CHANGES_TYPE__TRANSACTION_ID:
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
		result.append(" (acceptAllOrNothing: ");
		if (acceptAllOrNothingESet) result.append(acceptAllOrNothing); else result.append("<unset>");
		result.append(", lastModified: ");
		result.append(lastModified);
		result.append(", transactionId: ");
		result.append(transactionId);
		result.append(')');
		return result.toString();
	}

} //UANodeSetChangesTypeImpl
