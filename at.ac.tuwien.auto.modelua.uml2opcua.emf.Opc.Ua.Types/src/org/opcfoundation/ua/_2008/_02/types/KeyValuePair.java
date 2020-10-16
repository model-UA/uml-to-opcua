/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Key Value Pair</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.KeyValuePair#getKey <em>Key</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.KeyValuePair#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getKeyValuePair()
 * @model extendedMetaData="name='KeyValuePair' kind='elementOnly'"
 * @generated
 */
public interface KeyValuePair extends EObject {
	/**
	 * Returns the value of the '<em><b>Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' containment reference.
	 * @see #isSetKey()
	 * @see #unsetKey()
	 * @see #setKey(QualifiedName)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getKeyValuePair_Key()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='Key' namespace='##targetNamespace'"
	 * @generated
	 */
	QualifiedName getKey();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.KeyValuePair#getKey <em>Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' containment reference.
	 * @see #isSetKey()
	 * @see #unsetKey()
	 * @see #getKey()
	 * @generated
	 */
	void setKey(QualifiedName value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.KeyValuePair#getKey <em>Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetKey()
	 * @see #getKey()
	 * @see #setKey(QualifiedName)
	 * @generated
	 */
	void unsetKey();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.KeyValuePair#getKey <em>Key</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Key</em>' containment reference is set.
	 * @see #unsetKey()
	 * @see #getKey()
	 * @see #setKey(QualifiedName)
	 * @generated
	 */
	boolean isSetKey();

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(Variant)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getKeyValuePair_Value()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Value' namespace='##targetNamespace'"
	 * @generated
	 */
	Variant getValue();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.KeyValuePair#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Variant value);

} // KeyValuePair
