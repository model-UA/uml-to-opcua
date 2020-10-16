/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EU Information</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.EUInformation#getNamespaceUri <em>Namespace Uri</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.EUInformation#getUnitId <em>Unit Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.EUInformation#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.EUInformation#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getEUInformation()
 * @model extendedMetaData="name='EUInformation' kind='elementOnly'"
 * @generated
 */
public interface EUInformation extends EObject {
	/**
	 * Returns the value of the '<em><b>Namespace Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Namespace Uri</em>' attribute.
	 * @see #isSetNamespaceUri()
	 * @see #unsetNamespaceUri()
	 * @see #setNamespaceUri(String)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getEUInformation_NamespaceUri()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='NamespaceUri' namespace='##targetNamespace'"
	 * @generated
	 */
	String getNamespaceUri();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.EUInformation#getNamespaceUri <em>Namespace Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Namespace Uri</em>' attribute.
	 * @see #isSetNamespaceUri()
	 * @see #unsetNamespaceUri()
	 * @see #getNamespaceUri()
	 * @generated
	 */
	void setNamespaceUri(String value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.EUInformation#getNamespaceUri <em>Namespace Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNamespaceUri()
	 * @see #getNamespaceUri()
	 * @see #setNamespaceUri(String)
	 * @generated
	 */
	void unsetNamespaceUri();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.EUInformation#getNamespaceUri <em>Namespace Uri</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Namespace Uri</em>' attribute is set.
	 * @see #unsetNamespaceUri()
	 * @see #getNamespaceUri()
	 * @see #setNamespaceUri(String)
	 * @generated
	 */
	boolean isSetNamespaceUri();

	/**
	 * Returns the value of the '<em><b>Unit Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit Id</em>' attribute.
	 * @see #isSetUnitId()
	 * @see #unsetUnitId()
	 * @see #setUnitId(int)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getEUInformation_UnitId()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='element' name='UnitId' namespace='##targetNamespace'"
	 * @generated
	 */
	int getUnitId();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.EUInformation#getUnitId <em>Unit Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit Id</em>' attribute.
	 * @see #isSetUnitId()
	 * @see #unsetUnitId()
	 * @see #getUnitId()
	 * @generated
	 */
	void setUnitId(int value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.EUInformation#getUnitId <em>Unit Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUnitId()
	 * @see #getUnitId()
	 * @see #setUnitId(int)
	 * @generated
	 */
	void unsetUnitId();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.EUInformation#getUnitId <em>Unit Id</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Unit Id</em>' attribute is set.
	 * @see #unsetUnitId()
	 * @see #getUnitId()
	 * @see #setUnitId(int)
	 * @generated
	 */
	boolean isSetUnitId();

	/**
	 * Returns the value of the '<em><b>Display Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Name</em>' containment reference.
	 * @see #isSetDisplayName()
	 * @see #unsetDisplayName()
	 * @see #setDisplayName(LocalizedText)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getEUInformation_DisplayName()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='DisplayName' namespace='##targetNamespace'"
	 * @generated
	 */
	LocalizedText getDisplayName();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.EUInformation#getDisplayName <em>Display Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Name</em>' containment reference.
	 * @see #isSetDisplayName()
	 * @see #unsetDisplayName()
	 * @see #getDisplayName()
	 * @generated
	 */
	void setDisplayName(LocalizedText value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.EUInformation#getDisplayName <em>Display Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDisplayName()
	 * @see #getDisplayName()
	 * @see #setDisplayName(LocalizedText)
	 * @generated
	 */
	void unsetDisplayName();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.EUInformation#getDisplayName <em>Display Name</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Display Name</em>' containment reference is set.
	 * @see #unsetDisplayName()
	 * @see #getDisplayName()
	 * @see #setDisplayName(LocalizedText)
	 * @generated
	 */
	boolean isSetDisplayName();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #isSetDescription()
	 * @see #unsetDescription()
	 * @see #setDescription(LocalizedText)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getEUInformation_Description()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='Description' namespace='##targetNamespace'"
	 * @generated
	 */
	LocalizedText getDescription();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.EUInformation#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #isSetDescription()
	 * @see #unsetDescription()
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(LocalizedText value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.EUInformation#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDescription()
	 * @see #getDescription()
	 * @see #setDescription(LocalizedText)
	 * @generated
	 */
	void unsetDescription();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.EUInformation#getDescription <em>Description</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Description</em>' containment reference is set.
	 * @see #unsetDescription()
	 * @see #getDescription()
	 * @see #setDescription(LocalizedText)
	 * @generated
	 */
	boolean isSetDescription();

} // EUInformation
