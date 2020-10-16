/**
 */
package org.opcfoundation.ua._2011._03.ua.node.set;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Table Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.ModelTableEntry#getRolePermissions <em>Role Permissions</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.ModelTableEntry#getRequiredModel <em>Required Model</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.ModelTableEntry#getAccessRestrictions <em>Access Restrictions</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.ModelTableEntry#getModelUri <em>Model Uri</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.ModelTableEntry#getPublicationDate <em>Publication Date</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.ModelTableEntry#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2011._03.ua.node.set.SetPackage#getModelTableEntry()
 * @model extendedMetaData="name='ModelTableEntry' kind='elementOnly'"
 * @generated
 */
public interface ModelTableEntry extends EObject {
	/**
	 * Returns the value of the '<em><b>Role Permissions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Permissions</em>' containment reference.
	 * @see #setRolePermissions(ListOfRolePermissions)
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.SetPackage#getModelTableEntry_RolePermissions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RolePermissions' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfRolePermissions getRolePermissions();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.ModelTableEntry#getRolePermissions <em>Role Permissions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Permissions</em>' containment reference.
	 * @see #getRolePermissions()
	 * @generated
	 */
	void setRolePermissions(ListOfRolePermissions value);

	/**
	 * Returns the value of the '<em><b>Required Model</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2011._03.ua.node.set.ModelTableEntry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Model</em>' containment reference list.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.SetPackage#getModelTableEntry_RequiredModel()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RequiredModel' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ModelTableEntry> getRequiredModel();

	/**
	 * Returns the value of the '<em><b>Access Restrictions</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Restrictions</em>' attribute.
	 * @see #isSetAccessRestrictions()
	 * @see #unsetAccessRestrictions()
	 * @see #setAccessRestrictions(short)
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.SetPackage#getModelTableEntry_AccessRestrictions()
	 * @model default="0" unsettable="true" dataType="org.opcfoundation.ua._2011._03.ua.node.set.AccessRestriction"
	 *        extendedMetaData="kind='attribute' name='AccessRestrictions'"
	 * @generated
	 */
	short getAccessRestrictions();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.ModelTableEntry#getAccessRestrictions <em>Access Restrictions</em>}' attribute.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.ModelTableEntry#getAccessRestrictions <em>Access Restrictions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAccessRestrictions()
	 * @see #getAccessRestrictions()
	 * @see #setAccessRestrictions(short)
	 * @generated
	 */
	void unsetAccessRestrictions();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.ModelTableEntry#getAccessRestrictions <em>Access Restrictions</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Model Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Uri</em>' attribute.
	 * @see #setModelUri(String)
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.SetPackage#getModelTableEntry_ModelUri()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='ModelUri'"
	 * @generated
	 */
	String getModelUri();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.ModelTableEntry#getModelUri <em>Model Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Uri</em>' attribute.
	 * @see #getModelUri()
	 * @generated
	 */
	void setModelUri(String value);

	/**
	 * Returns the value of the '<em><b>Publication Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publication Date</em>' attribute.
	 * @see #setPublicationDate(XMLGregorianCalendar)
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.SetPackage#getModelTableEntry_PublicationDate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='attribute' name='PublicationDate'"
	 * @generated
	 */
	XMLGregorianCalendar getPublicationDate();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.ModelTableEntry#getPublicationDate <em>Publication Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publication Date</em>' attribute.
	 * @see #getPublicationDate()
	 * @generated
	 */
	void setPublicationDate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.SetPackage#getModelTableEntry_Version()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='Version'"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.ModelTableEntry#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

} // ModelTableEntry
