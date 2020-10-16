/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Query Data Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.QueryDataDescription#getRelativePath <em>Relative Path</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.QueryDataDescription#getAttributeId <em>Attribute Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.QueryDataDescription#getIndexRange <em>Index Range</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getQueryDataDescription()
 * @model extendedMetaData="name='QueryDataDescription' kind='elementOnly'"
 * @generated
 */
public interface QueryDataDescription extends EObject {
	/**
	 * Returns the value of the '<em><b>Relative Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relative Path</em>' containment reference.
	 * @see #isSetRelativePath()
	 * @see #unsetRelativePath()
	 * @see #setRelativePath(RelativePath)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getQueryDataDescription_RelativePath()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='RelativePath' namespace='##targetNamespace'"
	 * @generated
	 */
	RelativePath getRelativePath();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.QueryDataDescription#getRelativePath <em>Relative Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relative Path</em>' containment reference.
	 * @see #isSetRelativePath()
	 * @see #unsetRelativePath()
	 * @see #getRelativePath()
	 * @generated
	 */
	void setRelativePath(RelativePath value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.QueryDataDescription#getRelativePath <em>Relative Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRelativePath()
	 * @see #getRelativePath()
	 * @see #setRelativePath(RelativePath)
	 * @generated
	 */
	void unsetRelativePath();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.QueryDataDescription#getRelativePath <em>Relative Path</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Relative Path</em>' containment reference is set.
	 * @see #unsetRelativePath()
	 * @see #getRelativePath()
	 * @see #setRelativePath(RelativePath)
	 * @generated
	 */
	boolean isSetRelativePath();

	/**
	 * Returns the value of the '<em><b>Attribute Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Id</em>' attribute.
	 * @see #isSetAttributeId()
	 * @see #unsetAttributeId()
	 * @see #setAttributeId(long)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getQueryDataDescription_AttributeId()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='element' name='AttributeId' namespace='##targetNamespace'"
	 * @generated
	 */
	long getAttributeId();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.QueryDataDescription#getAttributeId <em>Attribute Id</em>}' attribute.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.QueryDataDescription#getAttributeId <em>Attribute Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAttributeId()
	 * @see #getAttributeId()
	 * @see #setAttributeId(long)
	 * @generated
	 */
	void unsetAttributeId();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.QueryDataDescription#getAttributeId <em>Attribute Id</em>}' attribute is set.
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
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getQueryDataDescription_IndexRange()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='IndexRange' namespace='##targetNamespace'"
	 * @generated
	 */
	String getIndexRange();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.QueryDataDescription#getIndexRange <em>Index Range</em>}' attribute.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.QueryDataDescription#getIndexRange <em>Index Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIndexRange()
	 * @see #getIndexRange()
	 * @see #setIndexRange(String)
	 * @generated
	 */
	void unsetIndexRange();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.QueryDataDescription#getIndexRange <em>Index Range</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Index Range</em>' attribute is set.
	 * @see #unsetIndexRange()
	 * @see #getIndexRange()
	 * @see #setIndexRange(String)
	 * @generated
	 */
	boolean isSetIndexRange();

} // QueryDataDescription
