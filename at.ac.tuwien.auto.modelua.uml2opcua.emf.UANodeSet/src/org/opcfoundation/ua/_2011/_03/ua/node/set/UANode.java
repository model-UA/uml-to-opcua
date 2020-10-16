/**
 */
package org.opcfoundation.ua._2011._03.ua.node.set;

import java.util.List;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UA Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.UANode#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.UANode#getDescription <em>Description</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.UANode#getCategory <em>Category</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.UANode#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.UANode#getReferences <em>References</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.UANode#getRolePermissions <em>Role Permissions</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.UANode#getExtensions <em>Extensions</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.UANode#getAccessRestrictions <em>Access Restrictions</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.UANode#getBrowseName <em>Browse Name</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.UANode#getNodeId <em>Node Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.UANode#getReleaseStatus <em>Release Status</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.UANode#getSymbolicName <em>Symbolic Name</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.UANode#getUserWriteMask <em>User Write Mask</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.UANode#getWriteMask <em>Write Mask</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2011._03.ua.node.set.SetPackage#getUANode()
 * @model extendedMetaData="name='UANode' kind='elementOnly'"
 * @generated
 */
public interface UANode extends EObject {
	/**
	 * Returns the value of the '<em><b>Display Name</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2011._03.ua.node.set.LocalizedText}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Name</em>' containment reference list.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.SetPackage#getUANode_DisplayName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DisplayName' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<LocalizedText> getDisplayName();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2011._03.ua.node.set.LocalizedText}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' containment reference list.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.SetPackage#getUANode_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Description' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<LocalizedText> getDescription();

	/**
	 * Returns the value of the '<em><b>Category</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' attribute list.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.SetPackage#getUANode_Category()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Category' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getCategory();

	/**
	 * Returns the value of the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documentation</em>' attribute.
	 * @see #setDocumentation(String)
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.SetPackage#getUANode_Documentation()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Documentation' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDocumentation();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.UANode#getDocumentation <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Documentation</em>' attribute.
	 * @see #getDocumentation()
	 * @generated
	 */
	void setDocumentation(String value);

	/**
	 * Returns the value of the '<em><b>References</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>References</em>' containment reference.
	 * @see #setReferences(ListOfReferences)
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.SetPackage#getUANode_References()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='References' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfReferences getReferences();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.UANode#getReferences <em>References</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>References</em>' containment reference.
	 * @see #getReferences()
	 * @generated
	 */
	void setReferences(ListOfReferences value);

	/**
	 * Returns the value of the '<em><b>Role Permissions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Permissions</em>' containment reference.
	 * @see #setRolePermissions(ListOfRolePermissions)
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.SetPackage#getUANode_RolePermissions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RolePermissions' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfRolePermissions getRolePermissions();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.UANode#getRolePermissions <em>Role Permissions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Permissions</em>' containment reference.
	 * @see #getRolePermissions()
	 * @generated
	 */
	void setRolePermissions(ListOfRolePermissions value);

	/**
	 * Returns the value of the '<em><b>Extensions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extensions</em>' containment reference.
	 * @see #setExtensions(ListOfExtensions)
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.SetPackage#getUANode_Extensions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Extensions' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfExtensions getExtensions();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.UANode#getExtensions <em>Extensions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extensions</em>' containment reference.
	 * @see #getExtensions()
	 * @generated
	 */
	void setExtensions(ListOfExtensions value);

	/**
	 * Returns the value of the '<em><b>Access Restrictions</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Restrictions</em>' attribute.
	 * @see #isSetAccessRestrictions()
	 * @see #unsetAccessRestrictions()
	 * @see #setAccessRestrictions(short)
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.SetPackage#getUANode_AccessRestrictions()
	 * @model default="0" unsettable="true" dataType="org.opcfoundation.ua._2011._03.ua.node.set.AccessRestriction"
	 *        extendedMetaData="kind='attribute' name='AccessRestrictions'"
	 * @generated
	 */
	short getAccessRestrictions();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.UANode#getAccessRestrictions <em>Access Restrictions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Restrictions</em>' attribute.
	 * @see #isSetAccessRestrictions()
	 * @see #unsetAccessRestrictions()
	 * @see #getAccessRestrictions()
	 * @generated
	 */
	void setAccessRestrictions(short value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.UANode#getAccessRestrictions <em>Access Restrictions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAccessRestrictions()
	 * @see #getAccessRestrictions()
	 * @see #setAccessRestrictions(short)
	 * @generated
	 */
	void unsetAccessRestrictions();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.UANode#getAccessRestrictions <em>Access Restrictions</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Access Restrictions</em>' attribute is set.
	 * @see #unsetAccessRestrictions()
	 * @see #getAccessRestrictions()
	 * @see #setAccessRestrictions(short)
	 * @generated
	 */
	boolean isSetAccessRestrictions();

	/**
	 * Returns the value of the '<em><b>Browse Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Browse Name</em>' attribute.
	 * @see #setBrowseName(String)
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.SetPackage#getUANode_BrowseName()
	 * @model dataType="org.opcfoundation.ua._2011._03.ua.node.set.QualifiedName" required="true"
	 *        extendedMetaData="kind='attribute' name='BrowseName'"
	 * @generated
	 */
	String getBrowseName();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.UANode#getBrowseName <em>Browse Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Browse Name</em>' attribute.
	 * @see #getBrowseName()
	 * @generated
	 */
	void setBrowseName(String value);

	/**
	 * Returns the value of the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Id</em>' attribute.
	 * @see #setNodeId(String)
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.SetPackage#getUANode_NodeId()
	 * @model dataType="org.opcfoundation.ua._2011._03.ua.node.set.NodeId" required="true"
	 *        extendedMetaData="kind='attribute' name='NodeId'"
	 * @generated
	 */
	String getNodeId();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.UANode#getNodeId <em>Node Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node Id</em>' attribute.
	 * @see #getNodeId()
	 * @generated
	 */
	void setNodeId(String value);

	/**
	 * Returns the value of the '<em><b>Release Status</b></em>' attribute.
	 * The default value is <code>"Released"</code>.
	 * The literals are from the enumeration {@link org.opcfoundation.ua._2011._03.ua.node.set.ReleaseStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Release Status</em>' attribute.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.ReleaseStatus
	 * @see #isSetReleaseStatus()
	 * @see #unsetReleaseStatus()
	 * @see #setReleaseStatus(ReleaseStatus)
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.SetPackage#getUANode_ReleaseStatus()
	 * @model default="Released" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='ReleaseStatus'"
	 * @generated
	 */
	ReleaseStatus getReleaseStatus();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.UANode#getReleaseStatus <em>Release Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Release Status</em>' attribute.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.ReleaseStatus
	 * @see #isSetReleaseStatus()
	 * @see #unsetReleaseStatus()
	 * @see #getReleaseStatus()
	 * @generated
	 */
	void setReleaseStatus(ReleaseStatus value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.UANode#getReleaseStatus <em>Release Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReleaseStatus()
	 * @see #getReleaseStatus()
	 * @see #setReleaseStatus(ReleaseStatus)
	 * @generated
	 */
	void unsetReleaseStatus();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.UANode#getReleaseStatus <em>Release Status</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Release Status</em>' attribute is set.
	 * @see #unsetReleaseStatus()
	 * @see #getReleaseStatus()
	 * @see #setReleaseStatus(ReleaseStatus)
	 * @generated
	 */
	boolean isSetReleaseStatus();

	/**
	 * Returns the value of the '<em><b>Symbolic Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Symbolic Name</em>' attribute.
	 * @see #setSymbolicName(List)
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.SetPackage#getUANode_SymbolicName()
	 * @model dataType="org.opcfoundation.ua._2011._03.ua.node.set.SymbolicName" many="false"
	 *        extendedMetaData="kind='attribute' name='SymbolicName'"
	 * @generated
	 */
	List<String> getSymbolicName();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.UANode#getSymbolicName <em>Symbolic Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Symbolic Name</em>' attribute.
	 * @see #getSymbolicName()
	 * @generated
	 */
	void setSymbolicName(List<String> value);

	/**
	 * Returns the value of the '<em><b>User Write Mask</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Write Mask</em>' attribute.
	 * @see #isSetUserWriteMask()
	 * @see #unsetUserWriteMask()
	 * @see #setUserWriteMask(long)
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.SetPackage#getUANode_UserWriteMask()
	 * @model default="0" unsettable="true" dataType="org.opcfoundation.ua._2011._03.ua.node.set.WriteMask"
	 *        extendedMetaData="kind='attribute' name='UserWriteMask'"
	 * @generated
	 */
	long getUserWriteMask();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.UANode#getUserWriteMask <em>User Write Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Write Mask</em>' attribute.
	 * @see #isSetUserWriteMask()
	 * @see #unsetUserWriteMask()
	 * @see #getUserWriteMask()
	 * @generated
	 */
	void setUserWriteMask(long value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.UANode#getUserWriteMask <em>User Write Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUserWriteMask()
	 * @see #getUserWriteMask()
	 * @see #setUserWriteMask(long)
	 * @generated
	 */
	void unsetUserWriteMask();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.UANode#getUserWriteMask <em>User Write Mask</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>User Write Mask</em>' attribute is set.
	 * @see #unsetUserWriteMask()
	 * @see #getUserWriteMask()
	 * @see #setUserWriteMask(long)
	 * @generated
	 */
	boolean isSetUserWriteMask();

	/**
	 * Returns the value of the '<em><b>Write Mask</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Write Mask</em>' attribute.
	 * @see #isSetWriteMask()
	 * @see #unsetWriteMask()
	 * @see #setWriteMask(long)
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.SetPackage#getUANode_WriteMask()
	 * @model default="0" unsettable="true" dataType="org.opcfoundation.ua._2011._03.ua.node.set.WriteMask"
	 *        extendedMetaData="kind='attribute' name='WriteMask'"
	 * @generated
	 */
	long getWriteMask();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.UANode#getWriteMask <em>Write Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Write Mask</em>' attribute.
	 * @see #isSetWriteMask()
	 * @see #unsetWriteMask()
	 * @see #getWriteMask()
	 * @generated
	 */
	void setWriteMask(long value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.UANode#getWriteMask <em>Write Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWriteMask()
	 * @see #getWriteMask()
	 * @see #setWriteMask(long)
	 * @generated
	 */
	void unsetWriteMask();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.UANode#getWriteMask <em>Write Mask</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Write Mask</em>' attribute is set.
	 * @see #unsetWriteMask()
	 * @see #getWriteMask()
	 * @see #setWriteMask(long)
	 * @generated
	 */
	boolean isSetWriteMask();

} // UANode
