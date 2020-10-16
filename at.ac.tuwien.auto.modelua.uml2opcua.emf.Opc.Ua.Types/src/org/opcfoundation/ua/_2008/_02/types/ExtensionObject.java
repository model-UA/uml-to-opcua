/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extension Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ExtensionObject#getTypeId <em>Type Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ExtensionObject#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getExtensionObject()
 * @model extendedMetaData="name='ExtensionObject' kind='elementOnly'"
 * @generated
 */
public interface ExtensionObject extends EObject {
	/**
	 * Returns the value of the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Id</em>' containment reference.
	 * @see #isSetTypeId()
	 * @see #unsetTypeId()
	 * @see #setTypeId(NodeId)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getExtensionObject_TypeId()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='TypeId' namespace='##targetNamespace'"
	 * @generated
	 */
	NodeId getTypeId();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.ExtensionObject#getTypeId <em>Type Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Id</em>' containment reference.
	 * @see #isSetTypeId()
	 * @see #unsetTypeId()
	 * @see #getTypeId()
	 * @generated
	 */
	void setTypeId(NodeId value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.ExtensionObject#getTypeId <em>Type Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTypeId()
	 * @see #getTypeId()
	 * @see #setTypeId(NodeId)
	 * @generated
	 */
	void unsetTypeId();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.ExtensionObject#getTypeId <em>Type Id</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type Id</em>' containment reference is set.
	 * @see #unsetTypeId()
	 * @see #getTypeId()
	 * @see #setTypeId(NodeId)
	 * @generated
	 */
	boolean isSetTypeId();

	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference.
	 * @see #isSetBody()
	 * @see #unsetBody()
	 * @see #setBody(BodyType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getExtensionObject_Body()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='Body' namespace='##targetNamespace'"
	 * @generated
	 */
	BodyType getBody();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.ExtensionObject#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #isSetBody()
	 * @see #unsetBody()
	 * @see #getBody()
	 * @generated
	 */
	void setBody(BodyType value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.ExtensionObject#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBody()
	 * @see #getBody()
	 * @see #setBody(BodyType)
	 * @generated
	 */
	void unsetBody();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.ExtensionObject#getBody <em>Body</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Body</em>' containment reference is set.
	 * @see #unsetBody()
	 * @see #getBody()
	 * @see #setBody(BodyType)
	 * @generated
	 */
	boolean isSetBody();

} // ExtensionObject
