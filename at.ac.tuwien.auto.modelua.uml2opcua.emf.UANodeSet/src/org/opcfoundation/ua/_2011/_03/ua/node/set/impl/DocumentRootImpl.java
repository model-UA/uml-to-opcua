/**
 */
package org.opcfoundation.ua._2011._03.ua.node.set.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.opcfoundation.ua._2011._03.ua.node.set.DocumentRoot;
import org.opcfoundation.ua._2011._03.ua.node.set.SetPackage;
import org.opcfoundation.ua._2011._03.ua.node.set.UANodeSetChangesStatusType;
import org.opcfoundation.ua._2011._03.ua.node.set.UANodeSetChangesType;
import org.opcfoundation.ua._2011._03.ua.node.set.UANodeSetType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.DocumentRootImpl#getUANodeSet <em>UA Node Set</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.DocumentRootImpl#getUANodeSetChanges <em>UA Node Set Changes</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.DocumentRootImpl#getUANodeSetChangesStatus <em>UA Node Set Changes Status</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DocumentRootImpl extends MinimalEObjectImpl.Container implements DocumentRoot {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMLNSPrefixMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xMLNSPrefixMap;

	/**
	 * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSISchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xSISchemaLocation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SetPackage.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, SetPackage.DOCUMENT_ROOT__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXMLNSPrefixMap() {
		if (xMLNSPrefixMap == null) {
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, SetPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		}
		return xMLNSPrefixMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXSISchemaLocation() {
		if (xSISchemaLocation == null) {
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, SetPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UANodeSetType getUANodeSet() {
		return (UANodeSetType)getMixed().get(SetPackage.Literals.DOCUMENT_ROOT__UA_NODE_SET, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUANodeSet(UANodeSetType newUANodeSet, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SetPackage.Literals.DOCUMENT_ROOT__UA_NODE_SET, newUANodeSet, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUANodeSet(UANodeSetType newUANodeSet) {
		((FeatureMap.Internal)getMixed()).set(SetPackage.Literals.DOCUMENT_ROOT__UA_NODE_SET, newUANodeSet);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UANodeSetChangesType getUANodeSetChanges() {
		return (UANodeSetChangesType)getMixed().get(SetPackage.Literals.DOCUMENT_ROOT__UA_NODE_SET_CHANGES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUANodeSetChanges(UANodeSetChangesType newUANodeSetChanges, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SetPackage.Literals.DOCUMENT_ROOT__UA_NODE_SET_CHANGES, newUANodeSetChanges, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUANodeSetChanges(UANodeSetChangesType newUANodeSetChanges) {
		((FeatureMap.Internal)getMixed()).set(SetPackage.Literals.DOCUMENT_ROOT__UA_NODE_SET_CHANGES, newUANodeSetChanges);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UANodeSetChangesStatusType getUANodeSetChangesStatus() {
		return (UANodeSetChangesStatusType)getMixed().get(SetPackage.Literals.DOCUMENT_ROOT__UA_NODE_SET_CHANGES_STATUS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUANodeSetChangesStatus(UANodeSetChangesStatusType newUANodeSetChangesStatus, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SetPackage.Literals.DOCUMENT_ROOT__UA_NODE_SET_CHANGES_STATUS, newUANodeSetChangesStatus, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUANodeSetChangesStatus(UANodeSetChangesStatusType newUANodeSetChangesStatus) {
		((FeatureMap.Internal)getMixed()).set(SetPackage.Literals.DOCUMENT_ROOT__UA_NODE_SET_CHANGES_STATUS, newUANodeSetChangesStatus);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SetPackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case SetPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case SetPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case SetPackage.DOCUMENT_ROOT__UA_NODE_SET:
				return basicSetUANodeSet(null, msgs);
			case SetPackage.DOCUMENT_ROOT__UA_NODE_SET_CHANGES:
				return basicSetUANodeSetChanges(null, msgs);
			case SetPackage.DOCUMENT_ROOT__UA_NODE_SET_CHANGES_STATUS:
				return basicSetUANodeSetChangesStatus(null, msgs);
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
			case SetPackage.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case SetPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case SetPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case SetPackage.DOCUMENT_ROOT__UA_NODE_SET:
				return getUANodeSet();
			case SetPackage.DOCUMENT_ROOT__UA_NODE_SET_CHANGES:
				return getUANodeSetChanges();
			case SetPackage.DOCUMENT_ROOT__UA_NODE_SET_CHANGES_STATUS:
				return getUANodeSetChangesStatus();
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
			case SetPackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case SetPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case SetPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case SetPackage.DOCUMENT_ROOT__UA_NODE_SET:
				setUANodeSet((UANodeSetType)newValue);
				return;
			case SetPackage.DOCUMENT_ROOT__UA_NODE_SET_CHANGES:
				setUANodeSetChanges((UANodeSetChangesType)newValue);
				return;
			case SetPackage.DOCUMENT_ROOT__UA_NODE_SET_CHANGES_STATUS:
				setUANodeSetChangesStatus((UANodeSetChangesStatusType)newValue);
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
			case SetPackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case SetPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case SetPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case SetPackage.DOCUMENT_ROOT__UA_NODE_SET:
				setUANodeSet((UANodeSetType)null);
				return;
			case SetPackage.DOCUMENT_ROOT__UA_NODE_SET_CHANGES:
				setUANodeSetChanges((UANodeSetChangesType)null);
				return;
			case SetPackage.DOCUMENT_ROOT__UA_NODE_SET_CHANGES_STATUS:
				setUANodeSetChangesStatus((UANodeSetChangesStatusType)null);
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
			case SetPackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case SetPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case SetPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case SetPackage.DOCUMENT_ROOT__UA_NODE_SET:
				return getUANodeSet() != null;
			case SetPackage.DOCUMENT_ROOT__UA_NODE_SET_CHANGES:
				return getUANodeSetChanges() != null;
			case SetPackage.DOCUMENT_ROOT__UA_NODE_SET_CHANGES_STATUS:
				return getUANodeSetChangesStatus() != null;
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
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(')');
		return result.toString();
	}

} //DocumentRootImpl
