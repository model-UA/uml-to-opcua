/**
 */
package org.opcfoundation.ua._2008._02.types;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Attribute Operand</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.SimpleAttributeOperand#getTypeDefinitionId <em>Type Definition Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.SimpleAttributeOperand#getBrowsePath <em>Browse Path</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.SimpleAttributeOperand#getAttributeId <em>Attribute Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.SimpleAttributeOperand#getIndexRange <em>Index Range</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getSimpleAttributeOperand()
 * @model extendedMetaData="name='SimpleAttributeOperand' kind='elementOnly'"
 * @generated
 */
public interface SimpleAttributeOperand extends FilterOperand {
	/**
	 * Returns the value of the '<em><b>Type Definition Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Definition Id</em>' containment reference.
	 * @see #isSetTypeDefinitionId()
	 * @see #unsetTypeDefinitionId()
	 * @see #setTypeDefinitionId(NodeId)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getSimpleAttributeOperand_TypeDefinitionId()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='TypeDefinitionId' namespace='##targetNamespace'"
	 * @generated
	 */
	NodeId getTypeDefinitionId();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.SimpleAttributeOperand#getTypeDefinitionId <em>Type Definition Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Definition Id</em>' containment reference.
	 * @see #isSetTypeDefinitionId()
	 * @see #unsetTypeDefinitionId()
	 * @see #getTypeDefinitionId()
	 * @generated
	 */
	void setTypeDefinitionId(NodeId value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.SimpleAttributeOperand#getTypeDefinitionId <em>Type Definition Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTypeDefinitionId()
	 * @see #getTypeDefinitionId()
	 * @see #setTypeDefinitionId(NodeId)
	 * @generated
	 */
	void unsetTypeDefinitionId();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.SimpleAttributeOperand#getTypeDefinitionId <em>Type Definition Id</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type Definition Id</em>' containment reference is set.
	 * @see #unsetTypeDefinitionId()
	 * @see #getTypeDefinitionId()
	 * @see #setTypeDefinitionId(NodeId)
	 * @generated
	 */
	boolean isSetTypeDefinitionId();

	/**
	 * Returns the value of the '<em><b>Browse Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Browse Path</em>' containment reference.
	 * @see #isSetBrowsePath()
	 * @see #unsetBrowsePath()
	 * @see #setBrowsePath(ListOfQualifiedName)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getSimpleAttributeOperand_BrowsePath()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='BrowsePath' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfQualifiedName getBrowsePath();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.SimpleAttributeOperand#getBrowsePath <em>Browse Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Browse Path</em>' containment reference.
	 * @see #isSetBrowsePath()
	 * @see #unsetBrowsePath()
	 * @see #getBrowsePath()
	 * @generated
	 */
	void setBrowsePath(ListOfQualifiedName value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.SimpleAttributeOperand#getBrowsePath <em>Browse Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBrowsePath()
	 * @see #getBrowsePath()
	 * @see #setBrowsePath(ListOfQualifiedName)
	 * @generated
	 */
	void unsetBrowsePath();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.SimpleAttributeOperand#getBrowsePath <em>Browse Path</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Browse Path</em>' containment reference is set.
	 * @see #unsetBrowsePath()
	 * @see #getBrowsePath()
	 * @see #setBrowsePath(ListOfQualifiedName)
	 * @generated
	 */
	boolean isSetBrowsePath();

	/**
	 * Returns the value of the '<em><b>Attribute Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Id</em>' attribute.
	 * @see #isSetAttributeId()
	 * @see #unsetAttributeId()
	 * @see #setAttributeId(long)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getSimpleAttributeOperand_AttributeId()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='element' name='AttributeId' namespace='##targetNamespace'"
	 * @generated
	 */
	long getAttributeId();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.SimpleAttributeOperand#getAttributeId <em>Attribute Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute Id</em>' attribute.
	 * @see #isSetAttributeId()
	 * @see #unsetAttributeId()
	 * @see #getAttributeId()
	 * @generated
	 */
	void setAttributeId(long value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.SimpleAttributeOperand#getAttributeId <em>Attribute Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAttributeId()
	 * @see #getAttributeId()
	 * @see #setAttributeId(long)
	 * @generated
	 */
	void unsetAttributeId();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.SimpleAttributeOperand#getAttributeId <em>Attribute Id</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Attribute Id</em>' attribute is set.
	 * @see #unsetAttributeId()
	 * @see #getAttributeId()
	 * @see #setAttributeId(long)
	 * @generated
	 */
	boolean isSetAttributeId();

	/**
	 * Returns the value of the '<em><b>Index Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index Range</em>' attribute.
	 * @see #isSetIndexRange()
	 * @see #unsetIndexRange()
	 * @see #setIndexRange(String)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getSimpleAttributeOperand_IndexRange()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='IndexRange' namespace='##targetNamespace'"
	 * @generated
	 */
	String getIndexRange();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.SimpleAttributeOperand#getIndexRange <em>Index Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index Range</em>' attribute.
	 * @see #isSetIndexRange()
	 * @see #unsetIndexRange()
	 * @see #getIndexRange()
	 * @generated
	 */
	void setIndexRange(String value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.SimpleAttributeOperand#getIndexRange <em>Index Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIndexRange()
	 * @see #getIndexRange()
	 * @see #setIndexRange(String)
	 * @generated
	 */
	void unsetIndexRange();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.SimpleAttributeOperand#getIndexRange <em>Index Range</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Index Range</em>' attribute is set.
	 * @see #unsetIndexRange()
	 * @see #getIndexRange()
	 * @see #setIndexRange(String)
	 * @generated
	 */
	boolean isSetIndexRange();

} // SimpleAttributeOperand
