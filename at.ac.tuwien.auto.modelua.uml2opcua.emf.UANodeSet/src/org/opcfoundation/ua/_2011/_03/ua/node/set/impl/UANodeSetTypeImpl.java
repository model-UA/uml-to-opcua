/**
 */
package org.opcfoundation.ua._2011._03.ua.node.set.impl;

import java.util.Collection;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.opcfoundation.ua._2011._03.ua.node.set.AliasTable;
import org.opcfoundation.ua._2011._03.ua.node.set.ListOfExtensions;
import org.opcfoundation.ua._2011._03.ua.node.set.ModelTable;
import org.opcfoundation.ua._2011._03.ua.node.set.SetPackage;
import org.opcfoundation.ua._2011._03.ua.node.set.UADataType;
import org.opcfoundation.ua._2011._03.ua.node.set.UAMethod;
import org.opcfoundation.ua._2011._03.ua.node.set.UANodeSetType;
import org.opcfoundation.ua._2011._03.ua.node.set.UAObject;
import org.opcfoundation.ua._2011._03.ua.node.set.UAObjectType;
import org.opcfoundation.ua._2011._03.ua.node.set.UAReferenceType;
import org.opcfoundation.ua._2011._03.ua.node.set.UAVariable;
import org.opcfoundation.ua._2011._03.ua.node.set.UAVariableType;
import org.opcfoundation.ua._2011._03.ua.node.set.UAView;
import org.opcfoundation.ua._2011._03.ua.node.set.UriTable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UA Node Set Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.UANodeSetTypeImpl#getNamespaceUris <em>Namespace Uris</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.UANodeSetTypeImpl#getServerUris <em>Server Uris</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.UANodeSetTypeImpl#getModels <em>Models</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.UANodeSetTypeImpl#getAliases <em>Aliases</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.UANodeSetTypeImpl#getExtensions <em>Extensions</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.UANodeSetTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.UANodeSetTypeImpl#getUAObject <em>UA Object</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.UANodeSetTypeImpl#getUAVariable <em>UA Variable</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.UANodeSetTypeImpl#getUAMethod <em>UA Method</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.UANodeSetTypeImpl#getUAView <em>UA View</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.UANodeSetTypeImpl#getUAObjectType <em>UA Object Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.UANodeSetTypeImpl#getUAVariableType <em>UA Variable Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.UANodeSetTypeImpl#getUADataType <em>UA Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.UANodeSetTypeImpl#getUAReferenceType <em>UA Reference Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.UANodeSetTypeImpl#getLastModified <em>Last Modified</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UANodeSetTypeImpl extends MinimalEObjectImpl.Container implements UANodeSetType {
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
	 * The cached value of the '{@link #getModels() <em>Models</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModels()
	 * @generated
	 * @ordered
	 */
	protected ModelTable models;

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
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UANodeSetTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SetPackage.Literals.UA_NODE_SET_TYPE;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SetPackage.UA_NODE_SET_TYPE__NAMESPACE_URIS, oldNamespaceUris, newNamespaceUris);
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
				msgs = ((InternalEObject)namespaceUris).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SetPackage.UA_NODE_SET_TYPE__NAMESPACE_URIS, null, msgs);
			if (newNamespaceUris != null)
				msgs = ((InternalEObject)newNamespaceUris).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SetPackage.UA_NODE_SET_TYPE__NAMESPACE_URIS, null, msgs);
			msgs = basicSetNamespaceUris(newNamespaceUris, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SetPackage.UA_NODE_SET_TYPE__NAMESPACE_URIS, newNamespaceUris, newNamespaceUris));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SetPackage.UA_NODE_SET_TYPE__SERVER_URIS, oldServerUris, newServerUris);
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
				msgs = ((InternalEObject)serverUris).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SetPackage.UA_NODE_SET_TYPE__SERVER_URIS, null, msgs);
			if (newServerUris != null)
				msgs = ((InternalEObject)newServerUris).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SetPackage.UA_NODE_SET_TYPE__SERVER_URIS, null, msgs);
			msgs = basicSetServerUris(newServerUris, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SetPackage.UA_NODE_SET_TYPE__SERVER_URIS, newServerUris, newServerUris));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelTable getModels() {
		return models;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModels(ModelTable newModels, NotificationChain msgs) {
		ModelTable oldModels = models;
		models = newModels;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SetPackage.UA_NODE_SET_TYPE__MODELS, oldModels, newModels);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModels(ModelTable newModels) {
		if (newModels != models) {
			NotificationChain msgs = null;
			if (models != null)
				msgs = ((InternalEObject)models).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SetPackage.UA_NODE_SET_TYPE__MODELS, null, msgs);
			if (newModels != null)
				msgs = ((InternalEObject)newModels).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SetPackage.UA_NODE_SET_TYPE__MODELS, null, msgs);
			msgs = basicSetModels(newModels, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SetPackage.UA_NODE_SET_TYPE__MODELS, newModels, newModels));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SetPackage.UA_NODE_SET_TYPE__ALIASES, oldAliases, newAliases);
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
				msgs = ((InternalEObject)aliases).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SetPackage.UA_NODE_SET_TYPE__ALIASES, null, msgs);
			if (newAliases != null)
				msgs = ((InternalEObject)newAliases).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SetPackage.UA_NODE_SET_TYPE__ALIASES, null, msgs);
			msgs = basicSetAliases(newAliases, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SetPackage.UA_NODE_SET_TYPE__ALIASES, newAliases, newAliases));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SetPackage.UA_NODE_SET_TYPE__EXTENSIONS, oldExtensions, newExtensions);
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
				msgs = ((InternalEObject)extensions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SetPackage.UA_NODE_SET_TYPE__EXTENSIONS, null, msgs);
			if (newExtensions != null)
				msgs = ((InternalEObject)newExtensions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SetPackage.UA_NODE_SET_TYPE__EXTENSIONS, null, msgs);
			msgs = basicSetExtensions(newExtensions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SetPackage.UA_NODE_SET_TYPE__EXTENSIONS, newExtensions, newExtensions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, SetPackage.UA_NODE_SET_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UAObject> getUAObject() {
		return getGroup().list(SetPackage.Literals.UA_NODE_SET_TYPE__UA_OBJECT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UAVariable> getUAVariable() {
		return getGroup().list(SetPackage.Literals.UA_NODE_SET_TYPE__UA_VARIABLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UAMethod> getUAMethod() {
		return getGroup().list(SetPackage.Literals.UA_NODE_SET_TYPE__UA_METHOD);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UAView> getUAView() {
		return getGroup().list(SetPackage.Literals.UA_NODE_SET_TYPE__UA_VIEW);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UAObjectType> getUAObjectType() {
		return getGroup().list(SetPackage.Literals.UA_NODE_SET_TYPE__UA_OBJECT_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UAVariableType> getUAVariableType() {
		return getGroup().list(SetPackage.Literals.UA_NODE_SET_TYPE__UA_VARIABLE_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UADataType> getUADataType() {
		return getGroup().list(SetPackage.Literals.UA_NODE_SET_TYPE__UA_DATA_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UAReferenceType> getUAReferenceType() {
		return getGroup().list(SetPackage.Literals.UA_NODE_SET_TYPE__UA_REFERENCE_TYPE);
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
			eNotify(new ENotificationImpl(this, Notification.SET, SetPackage.UA_NODE_SET_TYPE__LAST_MODIFIED, oldLastModified, lastModified));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SetPackage.UA_NODE_SET_TYPE__NAMESPACE_URIS:
				return basicSetNamespaceUris(null, msgs);
			case SetPackage.UA_NODE_SET_TYPE__SERVER_URIS:
				return basicSetServerUris(null, msgs);
			case SetPackage.UA_NODE_SET_TYPE__MODELS:
				return basicSetModels(null, msgs);
			case SetPackage.UA_NODE_SET_TYPE__ALIASES:
				return basicSetAliases(null, msgs);
			case SetPackage.UA_NODE_SET_TYPE__EXTENSIONS:
				return basicSetExtensions(null, msgs);
			case SetPackage.UA_NODE_SET_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case SetPackage.UA_NODE_SET_TYPE__UA_OBJECT:
				return ((InternalEList<?>)getUAObject()).basicRemove(otherEnd, msgs);
			case SetPackage.UA_NODE_SET_TYPE__UA_VARIABLE:
				return ((InternalEList<?>)getUAVariable()).basicRemove(otherEnd, msgs);
			case SetPackage.UA_NODE_SET_TYPE__UA_METHOD:
				return ((InternalEList<?>)getUAMethod()).basicRemove(otherEnd, msgs);
			case SetPackage.UA_NODE_SET_TYPE__UA_VIEW:
				return ((InternalEList<?>)getUAView()).basicRemove(otherEnd, msgs);
			case SetPackage.UA_NODE_SET_TYPE__UA_OBJECT_TYPE:
				return ((InternalEList<?>)getUAObjectType()).basicRemove(otherEnd, msgs);
			case SetPackage.UA_NODE_SET_TYPE__UA_VARIABLE_TYPE:
				return ((InternalEList<?>)getUAVariableType()).basicRemove(otherEnd, msgs);
			case SetPackage.UA_NODE_SET_TYPE__UA_DATA_TYPE:
				return ((InternalEList<?>)getUADataType()).basicRemove(otherEnd, msgs);
			case SetPackage.UA_NODE_SET_TYPE__UA_REFERENCE_TYPE:
				return ((InternalEList<?>)getUAReferenceType()).basicRemove(otherEnd, msgs);
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
			case SetPackage.UA_NODE_SET_TYPE__NAMESPACE_URIS:
				return getNamespaceUris();
			case SetPackage.UA_NODE_SET_TYPE__SERVER_URIS:
				return getServerUris();
			case SetPackage.UA_NODE_SET_TYPE__MODELS:
				return getModels();
			case SetPackage.UA_NODE_SET_TYPE__ALIASES:
				return getAliases();
			case SetPackage.UA_NODE_SET_TYPE__EXTENSIONS:
				return getExtensions();
			case SetPackage.UA_NODE_SET_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case SetPackage.UA_NODE_SET_TYPE__UA_OBJECT:
				return getUAObject();
			case SetPackage.UA_NODE_SET_TYPE__UA_VARIABLE:
				return getUAVariable();
			case SetPackage.UA_NODE_SET_TYPE__UA_METHOD:
				return getUAMethod();
			case SetPackage.UA_NODE_SET_TYPE__UA_VIEW:
				return getUAView();
			case SetPackage.UA_NODE_SET_TYPE__UA_OBJECT_TYPE:
				return getUAObjectType();
			case SetPackage.UA_NODE_SET_TYPE__UA_VARIABLE_TYPE:
				return getUAVariableType();
			case SetPackage.UA_NODE_SET_TYPE__UA_DATA_TYPE:
				return getUADataType();
			case SetPackage.UA_NODE_SET_TYPE__UA_REFERENCE_TYPE:
				return getUAReferenceType();
			case SetPackage.UA_NODE_SET_TYPE__LAST_MODIFIED:
				return getLastModified();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SetPackage.UA_NODE_SET_TYPE__NAMESPACE_URIS:
				setNamespaceUris((UriTable)newValue);
				return;
			case SetPackage.UA_NODE_SET_TYPE__SERVER_URIS:
				setServerUris((UriTable)newValue);
				return;
			case SetPackage.UA_NODE_SET_TYPE__MODELS:
				setModels((ModelTable)newValue);
				return;
			case SetPackage.UA_NODE_SET_TYPE__ALIASES:
				setAliases((AliasTable)newValue);
				return;
			case SetPackage.UA_NODE_SET_TYPE__EXTENSIONS:
				setExtensions((ListOfExtensions)newValue);
				return;
			case SetPackage.UA_NODE_SET_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case SetPackage.UA_NODE_SET_TYPE__UA_OBJECT:
				getUAObject().clear();
				getUAObject().addAll((Collection<? extends UAObject>)newValue);
				return;
			case SetPackage.UA_NODE_SET_TYPE__UA_VARIABLE:
				getUAVariable().clear();
				getUAVariable().addAll((Collection<? extends UAVariable>)newValue);
				return;
			case SetPackage.UA_NODE_SET_TYPE__UA_METHOD:
				getUAMethod().clear();
				getUAMethod().addAll((Collection<? extends UAMethod>)newValue);
				return;
			case SetPackage.UA_NODE_SET_TYPE__UA_VIEW:
				getUAView().clear();
				getUAView().addAll((Collection<? extends UAView>)newValue);
				return;
			case SetPackage.UA_NODE_SET_TYPE__UA_OBJECT_TYPE:
				getUAObjectType().clear();
				getUAObjectType().addAll((Collection<? extends UAObjectType>)newValue);
				return;
			case SetPackage.UA_NODE_SET_TYPE__UA_VARIABLE_TYPE:
				getUAVariableType().clear();
				getUAVariableType().addAll((Collection<? extends UAVariableType>)newValue);
				return;
			case SetPackage.UA_NODE_SET_TYPE__UA_DATA_TYPE:
				getUADataType().clear();
				getUADataType().addAll((Collection<? extends UADataType>)newValue);
				return;
			case SetPackage.UA_NODE_SET_TYPE__UA_REFERENCE_TYPE:
				getUAReferenceType().clear();
				getUAReferenceType().addAll((Collection<? extends UAReferenceType>)newValue);
				return;
			case SetPackage.UA_NODE_SET_TYPE__LAST_MODIFIED:
				setLastModified((XMLGregorianCalendar)newValue);
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
			case SetPackage.UA_NODE_SET_TYPE__NAMESPACE_URIS:
				setNamespaceUris((UriTable)null);
				return;
			case SetPackage.UA_NODE_SET_TYPE__SERVER_URIS:
				setServerUris((UriTable)null);
				return;
			case SetPackage.UA_NODE_SET_TYPE__MODELS:
				setModels((ModelTable)null);
				return;
			case SetPackage.UA_NODE_SET_TYPE__ALIASES:
				setAliases((AliasTable)null);
				return;
			case SetPackage.UA_NODE_SET_TYPE__EXTENSIONS:
				setExtensions((ListOfExtensions)null);
				return;
			case SetPackage.UA_NODE_SET_TYPE__GROUP:
				getGroup().clear();
				return;
			case SetPackage.UA_NODE_SET_TYPE__UA_OBJECT:
				getUAObject().clear();
				return;
			case SetPackage.UA_NODE_SET_TYPE__UA_VARIABLE:
				getUAVariable().clear();
				return;
			case SetPackage.UA_NODE_SET_TYPE__UA_METHOD:
				getUAMethod().clear();
				return;
			case SetPackage.UA_NODE_SET_TYPE__UA_VIEW:
				getUAView().clear();
				return;
			case SetPackage.UA_NODE_SET_TYPE__UA_OBJECT_TYPE:
				getUAObjectType().clear();
				return;
			case SetPackage.UA_NODE_SET_TYPE__UA_VARIABLE_TYPE:
				getUAVariableType().clear();
				return;
			case SetPackage.UA_NODE_SET_TYPE__UA_DATA_TYPE:
				getUADataType().clear();
				return;
			case SetPackage.UA_NODE_SET_TYPE__UA_REFERENCE_TYPE:
				getUAReferenceType().clear();
				return;
			case SetPackage.UA_NODE_SET_TYPE__LAST_MODIFIED:
				setLastModified(LAST_MODIFIED_EDEFAULT);
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
			case SetPackage.UA_NODE_SET_TYPE__NAMESPACE_URIS:
				return namespaceUris != null;
			case SetPackage.UA_NODE_SET_TYPE__SERVER_URIS:
				return serverUris != null;
			case SetPackage.UA_NODE_SET_TYPE__MODELS:
				return models != null;
			case SetPackage.UA_NODE_SET_TYPE__ALIASES:
				return aliases != null;
			case SetPackage.UA_NODE_SET_TYPE__EXTENSIONS:
				return extensions != null;
			case SetPackage.UA_NODE_SET_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case SetPackage.UA_NODE_SET_TYPE__UA_OBJECT:
				return !getUAObject().isEmpty();
			case SetPackage.UA_NODE_SET_TYPE__UA_VARIABLE:
				return !getUAVariable().isEmpty();
			case SetPackage.UA_NODE_SET_TYPE__UA_METHOD:
				return !getUAMethod().isEmpty();
			case SetPackage.UA_NODE_SET_TYPE__UA_VIEW:
				return !getUAView().isEmpty();
			case SetPackage.UA_NODE_SET_TYPE__UA_OBJECT_TYPE:
				return !getUAObjectType().isEmpty();
			case SetPackage.UA_NODE_SET_TYPE__UA_VARIABLE_TYPE:
				return !getUAVariableType().isEmpty();
			case SetPackage.UA_NODE_SET_TYPE__UA_DATA_TYPE:
				return !getUADataType().isEmpty();
			case SetPackage.UA_NODE_SET_TYPE__UA_REFERENCE_TYPE:
				return !getUAReferenceType().isEmpty();
			case SetPackage.UA_NODE_SET_TYPE__LAST_MODIFIED:
				return LAST_MODIFIED_EDEFAULT == null ? lastModified != null : !LAST_MODIFIED_EDEFAULT.equals(lastModified);
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
		result.append(" (group: ");
		result.append(group);
		result.append(", lastModified: ");
		result.append(lastModified);
		result.append(')');
		return result.toString();
	}

} //UANodeSetTypeImpl
