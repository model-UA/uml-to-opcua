/**
 */
package org.opcfoundation.ua._2008._02.types;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference Type Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ReferenceTypeNode#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ReferenceTypeNode#isSymmetric <em>Symmetric</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ReferenceTypeNode#getInverseName <em>Inverse Name</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getReferenceTypeNode()
 * @model extendedMetaData="name='ReferenceTypeNode' kind='elementOnly'"
 * @generated
 */
public interface ReferenceTypeNode extends TypeNode {
	/**
	 * Returns the value of the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Abstract</em>' attribute.
	 * @see #isSetIsAbstract()
	 * @see #unsetIsAbstract()
	 * @see #setIsAbstract(boolean)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getReferenceTypeNode_IsAbstract()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='IsAbstract' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isIsAbstract();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.ReferenceTypeNode#isIsAbstract <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Abstract</em>' attribute.
	 * @see #isSetIsAbstract()
	 * @see #unsetIsAbstract()
	 * @see #isIsAbstract()
	 * @generated
	 */
	void setIsAbstract(boolean value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.ReferenceTypeNode#isIsAbstract <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsAbstract()
	 * @see #isIsAbstract()
	 * @see #setIsAbstract(boolean)
	 * @generated
	 */
	void unsetIsAbstract();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.ReferenceTypeNode#isIsAbstract <em>Is Abstract</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Abstract</em>' attribute is set.
	 * @see #unsetIsAbstract()
	 * @see #isIsAbstract()
	 * @see #setIsAbstract(boolean)
	 * @generated
	 */
	boolean isSetIsAbstract();

	/**
	 * Returns the value of the '<em><b>Symmetric</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Symmetric</em>' attribute.
	 * @see #isSetSymmetric()
	 * @see #unsetSymmetric()
	 * @see #setSymmetric(boolean)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getReferenceTypeNode_Symmetric()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='Symmetric' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isSymmetric();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.ReferenceTypeNode#isSymmetric <em>Symmetric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Symmetric</em>' attribute.
	 * @see #isSetSymmetric()
	 * @see #unsetSymmetric()
	 * @see #isSymmetric()
	 * @generated
	 */
	void setSymmetric(boolean value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.ReferenceTypeNode#isSymmetric <em>Symmetric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSymmetric()
	 * @see #isSymmetric()
	 * @see #setSymmetric(boolean)
	 * @generated
	 */
	void unsetSymmetric();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.ReferenceTypeNode#isSymmetric <em>Symmetric</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Symmetric</em>' attribute is set.
	 * @see #unsetSymmetric()
	 * @see #isSymmetric()
	 * @see #setSymmetric(boolean)
	 * @generated
	 */
	boolean isSetSymmetric();

	/**
	 * Returns the value of the '<em><b>Inverse Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inverse Name</em>' containment reference.
	 * @see #isSetInverseName()
	 * @see #unsetInverseName()
	 * @see #setInverseName(LocalizedText)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getReferenceTypeNode_InverseName()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='InverseName' namespace='##targetNamespace'"
	 * @generated
	 */
	LocalizedText getInverseName();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.ReferenceTypeNode#getInverseName <em>Inverse Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inverse Name</em>' containment reference.
	 * @see #isSetInverseName()
	 * @see #unsetInverseName()
	 * @see #getInverseName()
	 * @generated
	 */
	void setInverseName(LocalizedText value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.ReferenceTypeNode#getInverseName <em>Inverse Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInverseName()
	 * @see #getInverseName()
	 * @see #setInverseName(LocalizedText)
	 * @generated
	 */
	void unsetInverseName();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.ReferenceTypeNode#getInverseName <em>Inverse Name</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Inverse Name</em>' containment reference is set.
	 * @see #unsetInverseName()
	 * @see #getInverseName()
	 * @see #setInverseName(LocalizedText)
	 * @generated
	 */
	boolean isSetInverseName();

} // ReferenceTypeNode
