/**
 */
package org.opcfoundation.ua._2011._03.ua.node.set;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.DocumentRoot#getUANodeSet <em>UA Node Set</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.DocumentRoot#getUANodeSetChanges <em>UA Node Set Changes</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.DocumentRoot#getUANodeSetChangesStatus <em>UA Node Set Changes Status</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2011._03.ua.node.set.SetPackage#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
public interface DocumentRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.SetPackage#getDocumentRoot_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XMLNS Prefix Map</em>' map.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.SetPackage#getDocumentRoot_XMLNSPrefixMap()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;" transient="true"
	 *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
	 * @generated
	 */
	EMap<String, String> getXMLNSPrefixMap();

	/**
	 * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XSI Schema Location</em>' map.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.SetPackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>UA Node Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UA Node Set</em>' containment reference.
	 * @see #setUANodeSet(UANodeSetType)
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.SetPackage#getDocumentRoot_UANodeSet()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='UANodeSet' namespace='##targetNamespace'"
	 * @generated
	 */
	UANodeSetType getUANodeSet();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.DocumentRoot#getUANodeSet <em>UA Node Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UA Node Set</em>' containment reference.
	 * @see #getUANodeSet()
	 * @generated
	 */
	void setUANodeSet(UANodeSetType value);

	/**
	 * Returns the value of the '<em><b>UA Node Set Changes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UA Node Set Changes</em>' containment reference.
	 * @see #setUANodeSetChanges(UANodeSetChangesType)
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.SetPackage#getDocumentRoot_UANodeSetChanges()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='UANodeSetChanges' namespace='##targetNamespace'"
	 * @generated
	 */
	UANodeSetChangesType getUANodeSetChanges();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.DocumentRoot#getUANodeSetChanges <em>UA Node Set Changes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UA Node Set Changes</em>' containment reference.
	 * @see #getUANodeSetChanges()
	 * @generated
	 */
	void setUANodeSetChanges(UANodeSetChangesType value);

	/**
	 * Returns the value of the '<em><b>UA Node Set Changes Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UA Node Set Changes Status</em>' containment reference.
	 * @see #setUANodeSetChangesStatus(UANodeSetChangesStatusType)
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.SetPackage#getDocumentRoot_UANodeSetChangesStatus()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='UANodeSetChangesStatus' namespace='##targetNamespace'"
	 * @generated
	 */
	UANodeSetChangesStatusType getUANodeSetChangesStatus();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.DocumentRoot#getUANodeSetChangesStatus <em>UA Node Set Changes Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UA Node Set Changes Status</em>' containment reference.
	 * @see #getUANodeSetChangesStatus()
	 * @generated
	 */
	void setUANodeSetChangesStatus(UANodeSetChangesStatusType value);

} // DocumentRoot
