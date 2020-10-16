/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node Attributes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.NodeAttributes#getSpecifiedAttributes <em>Specified Attributes</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.NodeAttributes#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.NodeAttributes#getDescription <em>Description</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.NodeAttributes#getWriteMask <em>Write Mask</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.NodeAttributes#getUserWriteMask <em>User Write Mask</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getNodeAttributes()
 * @model extendedMetaData="name='NodeAttributes' kind='elementOnly'"
 * @generated
 */
public interface NodeAttributes extends EObject {
	/**
	 * Returns the value of the '<em><b>Specified Attributes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specified Attributes</em>' attribute.
	 * @see #isSetSpecifiedAttributes()
	 * @see #unsetSpecifiedAttributes()
	 * @see #setSpecifiedAttributes(long)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getNodeAttributes_SpecifiedAttributes()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='element' name='SpecifiedAttributes' namespace='##targetNamespace'"
	 * @generated
	 */
	long getSpecifiedAttributes();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.NodeAttributes#getSpecifiedAttributes <em>Specified Attributes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specified Attributes</em>' attribute.
	 * @see #isSetSpecifiedAttributes()
	 * @see #unsetSpecifiedAttributes()
	 * @see #getSpecifiedAttributes()
	 * @generated
	 */
	void setSpecifiedAttributes(long value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.NodeAttributes#getSpecifiedAttributes <em>Specified Attributes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSpecifiedAttributes()
	 * @see #getSpecifiedAttributes()
	 * @see #setSpecifiedAttributes(long)
	 * @generated
	 */
	void unsetSpecifiedAttributes();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.NodeAttributes#getSpecifiedAttributes <em>Specified Attributes</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Specified Attributes</em>' attribute is set.
	 * @see #unsetSpecifiedAttributes()
	 * @see #getSpecifiedAttributes()
	 * @see #setSpecifiedAttributes(long)
	 * @generated
	 */
	boolean isSetSpecifiedAttributes();

	/**
	 * Returns the value of the '<em><b>Display Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Name</em>' containment reference.
	 * @see #isSetDisplayName()
	 * @see #unsetDisplayName()
	 * @see #setDisplayName(LocalizedText)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getNodeAttributes_DisplayName()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='DisplayName' namespace='##targetNamespace'"
	 * @generated
	 */
	LocalizedText getDisplayName();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.NodeAttributes#getDisplayName <em>Display Name</em>}' containment reference.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.NodeAttributes#getDisplayName <em>Display Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDisplayName()
	 * @see #getDisplayName()
	 * @see #setDisplayName(LocalizedText)
	 * @generated
	 */
	void unsetDisplayName();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.NodeAttributes#getDisplayName <em>Display Name</em>}' containment reference is set.
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
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getNodeAttributes_Description()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='Description' namespace='##targetNamespace'"
	 * @generated
	 */
	LocalizedText getDescription();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.NodeAttributes#getDescription <em>Description</em>}' containment reference.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.NodeAttributes#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDescription()
	 * @see #getDescription()
	 * @see #setDescription(LocalizedText)
	 * @generated
	 */
	void unsetDescription();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.NodeAttributes#getDescription <em>Description</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Description</em>' containment reference is set.
	 * @see #unsetDescription()
	 * @see #getDescription()
	 * @see #setDescription(LocalizedText)
	 * @generated
	 */
	boolean isSetDescription();

	/**
	 * Returns the value of the '<em><b>Write Mask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Write Mask</em>' attribute.
	 * @see #isSetWriteMask()
	 * @see #unsetWriteMask()
	 * @see #setWriteMask(long)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getNodeAttributes_WriteMask()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='element' name='WriteMask' namespace='##targetNamespace'"
	 * @generated
	 */
	long getWriteMask();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.NodeAttributes#getWriteMask <em>Write Mask</em>}' attribute.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.NodeAttributes#getWriteMask <em>Write Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWriteMask()
	 * @see #getWriteMask()
	 * @see #setWriteMask(long)
	 * @generated
	 */
	void unsetWriteMask();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.NodeAttributes#getWriteMask <em>Write Mask</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Write Mask</em>' attribute is set.
	 * @see #unsetWriteMask()
	 * @see #getWriteMask()
	 * @see #setWriteMask(long)
	 * @generated
	 */
	boolean isSetWriteMask();

	/**
	 * Returns the value of the '<em><b>User Write Mask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Write Mask</em>' attribute.
	 * @see #isSetUserWriteMask()
	 * @see #unsetUserWriteMask()
	 * @see #setUserWriteMask(long)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getNodeAttributes_UserWriteMask()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='element' name='UserWriteMask' namespace='##targetNamespace'"
	 * @generated
	 */
	long getUserWriteMask();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.NodeAttributes#getUserWriteMask <em>User Write Mask</em>}' attribute.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.NodeAttributes#getUserWriteMask <em>User Write Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUserWriteMask()
	 * @see #getUserWriteMask()
	 * @see #setUserWriteMask(long)
	 * @generated
	 */
	void unsetUserWriteMask();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.NodeAttributes#getUserWriteMask <em>User Write Mask</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>User Write Mask</em>' attribute is set.
	 * @see #unsetUserWriteMask()
	 * @see #getUserWriteMask()
	 * @see #setUserWriteMask(long)
	 * @generated
	 */
	boolean isSetUserWriteMask();

} // NodeAttributes
