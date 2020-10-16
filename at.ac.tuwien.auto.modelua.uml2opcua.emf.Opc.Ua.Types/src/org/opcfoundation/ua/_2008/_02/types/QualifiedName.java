/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Qualified Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.QualifiedName#getNamespaceIndex <em>Namespace Index</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.QualifiedName#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getQualifiedName()
 * @model extendedMetaData="name='QualifiedName' kind='elementOnly'"
 * @generated
 */
public interface QualifiedName extends EObject {
	/**
	 * Returns the value of the '<em><b>Namespace Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Namespace Index</em>' attribute.
	 * @see #isSetNamespaceIndex()
	 * @see #unsetNamespaceIndex()
	 * @see #setNamespaceIndex(int)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getQualifiedName_NamespaceIndex()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedShort"
	 *        extendedMetaData="kind='element' name='NamespaceIndex' namespace='##targetNamespace'"
	 * @generated
	 */
	int getNamespaceIndex();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.QualifiedName#getNamespaceIndex <em>Namespace Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Namespace Index</em>' attribute.
	 * @see #isSetNamespaceIndex()
	 * @see #unsetNamespaceIndex()
	 * @see #getNamespaceIndex()
	 * @generated
	 */
	void setNamespaceIndex(int value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.QualifiedName#getNamespaceIndex <em>Namespace Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNamespaceIndex()
	 * @see #getNamespaceIndex()
	 * @see #setNamespaceIndex(int)
	 * @generated
	 */
	void unsetNamespaceIndex();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.QualifiedName#getNamespaceIndex <em>Namespace Index</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Namespace Index</em>' attribute is set.
	 * @see #unsetNamespaceIndex()
	 * @see #getNamespaceIndex()
	 * @see #setNamespaceIndex(int)
	 * @generated
	 */
	boolean isSetNamespaceIndex();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #isSetName()
	 * @see #unsetName()
	 * @see #setName(String)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getQualifiedName_Name()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.QualifiedName#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #isSetName()
	 * @see #unsetName()
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.QualifiedName#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetName()
	 * @see #getName()
	 * @see #setName(String)
	 * @generated
	 */
	void unsetName();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.QualifiedName#getName <em>Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Name</em>' attribute is set.
	 * @see #unsetName()
	 * @see #getName()
	 * @see #setName(String)
	 * @generated
	 */
	boolean isSetName();

} // QualifiedName
