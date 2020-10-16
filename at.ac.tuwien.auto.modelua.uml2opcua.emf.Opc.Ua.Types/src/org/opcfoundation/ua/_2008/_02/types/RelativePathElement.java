/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relative Path Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.RelativePathElement#getReferenceTypeId <em>Reference Type Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.RelativePathElement#isIsInverse <em>Is Inverse</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.RelativePathElement#isIncludeSubtypes <em>Include Subtypes</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.RelativePathElement#getTargetName <em>Target Name</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getRelativePathElement()
 * @model extendedMetaData="name='RelativePathElement' kind='elementOnly'"
 * @generated
 */
public interface RelativePathElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Reference Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Type Id</em>' containment reference.
	 * @see #isSetReferenceTypeId()
	 * @see #unsetReferenceTypeId()
	 * @see #setReferenceTypeId(NodeId)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getRelativePathElement_ReferenceTypeId()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='ReferenceTypeId' namespace='##targetNamespace'"
	 * @generated
	 */
	NodeId getReferenceTypeId();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.RelativePathElement#getReferenceTypeId <em>Reference Type Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Type Id</em>' containment reference.
	 * @see #isSetReferenceTypeId()
	 * @see #unsetReferenceTypeId()
	 * @see #getReferenceTypeId()
	 * @generated
	 */
	void setReferenceTypeId(NodeId value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.RelativePathElement#getReferenceTypeId <em>Reference Type Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReferenceTypeId()
	 * @see #getReferenceTypeId()
	 * @see #setReferenceTypeId(NodeId)
	 * @generated
	 */
	void unsetReferenceTypeId();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.RelativePathElement#getReferenceTypeId <em>Reference Type Id</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Reference Type Id</em>' containment reference is set.
	 * @see #unsetReferenceTypeId()
	 * @see #getReferenceTypeId()
	 * @see #setReferenceTypeId(NodeId)
	 * @generated
	 */
	boolean isSetReferenceTypeId();

	/**
	 * Returns the value of the '<em><b>Is Inverse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Inverse</em>' attribute.
	 * @see #isSetIsInverse()
	 * @see #unsetIsInverse()
	 * @see #setIsInverse(boolean)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getRelativePathElement_IsInverse()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='IsInverse' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isIsInverse();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.RelativePathElement#isIsInverse <em>Is Inverse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Inverse</em>' attribute.
	 * @see #isSetIsInverse()
	 * @see #unsetIsInverse()
	 * @see #isIsInverse()
	 * @generated
	 */
	void setIsInverse(boolean value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.RelativePathElement#isIsInverse <em>Is Inverse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsInverse()
	 * @see #isIsInverse()
	 * @see #setIsInverse(boolean)
	 * @generated
	 */
	void unsetIsInverse();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.RelativePathElement#isIsInverse <em>Is Inverse</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Inverse</em>' attribute is set.
	 * @see #unsetIsInverse()
	 * @see #isIsInverse()
	 * @see #setIsInverse(boolean)
	 * @generated
	 */
	boolean isSetIsInverse();

	/**
	 * Returns the value of the '<em><b>Include Subtypes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Include Subtypes</em>' attribute.
	 * @see #isSetIncludeSubtypes()
	 * @see #unsetIncludeSubtypes()
	 * @see #setIncludeSubtypes(boolean)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getRelativePathElement_IncludeSubtypes()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='IncludeSubtypes' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isIncludeSubtypes();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.RelativePathElement#isIncludeSubtypes <em>Include Subtypes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Subtypes</em>' attribute.
	 * @see #isSetIncludeSubtypes()
	 * @see #unsetIncludeSubtypes()
	 * @see #isIncludeSubtypes()
	 * @generated
	 */
	void setIncludeSubtypes(boolean value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.RelativePathElement#isIncludeSubtypes <em>Include Subtypes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIncludeSubtypes()
	 * @see #isIncludeSubtypes()
	 * @see #setIncludeSubtypes(boolean)
	 * @generated
	 */
	void unsetIncludeSubtypes();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.RelativePathElement#isIncludeSubtypes <em>Include Subtypes</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Include Subtypes</em>' attribute is set.
	 * @see #unsetIncludeSubtypes()
	 * @see #isIncludeSubtypes()
	 * @see #setIncludeSubtypes(boolean)
	 * @generated
	 */
	boolean isSetIncludeSubtypes();

	/**
	 * Returns the value of the '<em><b>Target Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Name</em>' containment reference.
	 * @see #isSetTargetName()
	 * @see #unsetTargetName()
	 * @see #setTargetName(QualifiedName)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getRelativePathElement_TargetName()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='TargetName' namespace='##targetNamespace'"
	 * @generated
	 */
	QualifiedName getTargetName();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.RelativePathElement#getTargetName <em>Target Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Name</em>' containment reference.
	 * @see #isSetTargetName()
	 * @see #unsetTargetName()
	 * @see #getTargetName()
	 * @generated
	 */
	void setTargetName(QualifiedName value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.RelativePathElement#getTargetName <em>Target Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTargetName()
	 * @see #getTargetName()
	 * @see #setTargetName(QualifiedName)
	 * @generated
	 */
	void unsetTargetName();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.RelativePathElement#getTargetName <em>Target Name</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Target Name</em>' containment reference is set.
	 * @see #unsetTargetName()
	 * @see #getTargetName()
	 * @see #setTargetName(QualifiedName)
	 * @generated
	 */
	boolean isSetTargetName();

} // RelativePathElement
