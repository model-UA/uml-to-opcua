/**
 */
package org.opcfoundation.ua._2008._02.types;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structure Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.StructureDescription#getStructureDefinition <em>Structure Definition</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getStructureDescription()
 * @model extendedMetaData="name='StructureDescription' kind='elementOnly'"
 * @generated
 */
public interface StructureDescription extends DataTypeDescription {
	/**
	 * Returns the value of the '<em><b>Structure Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structure Definition</em>' containment reference.
	 * @see #isSetStructureDefinition()
	 * @see #unsetStructureDefinition()
	 * @see #setStructureDefinition(StructureDefinition)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getStructureDescription_StructureDefinition()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='StructureDefinition' namespace='##targetNamespace'"
	 * @generated
	 */
	StructureDefinition getStructureDefinition();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.StructureDescription#getStructureDefinition <em>Structure Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Structure Definition</em>' containment reference.
	 * @see #isSetStructureDefinition()
	 * @see #unsetStructureDefinition()
	 * @see #getStructureDefinition()
	 * @generated
	 */
	void setStructureDefinition(StructureDefinition value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.StructureDescription#getStructureDefinition <em>Structure Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStructureDefinition()
	 * @see #getStructureDefinition()
	 * @see #setStructureDefinition(StructureDefinition)
	 * @generated
	 */
	void unsetStructureDefinition();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.StructureDescription#getStructureDefinition <em>Structure Definition</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Structure Definition</em>' containment reference is set.
	 * @see #unsetStructureDefinition()
	 * @see #getStructureDefinition()
	 * @see #setStructureDefinition(StructureDefinition)
	 * @generated
	 */
	boolean isSetStructureDefinition();

} // StructureDescription
