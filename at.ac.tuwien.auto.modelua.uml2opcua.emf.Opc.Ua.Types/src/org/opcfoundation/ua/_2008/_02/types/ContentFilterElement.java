/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Content Filter Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ContentFilterElement#getFilterOperator <em>Filter Operator</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ContentFilterElement#getFilterOperands <em>Filter Operands</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getContentFilterElement()
 * @model extendedMetaData="name='ContentFilterElement' kind='elementOnly'"
 * @generated
 */
public interface ContentFilterElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Filter Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link org.opcfoundation.ua._2008._02.types.FilterOperator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter Operator</em>' attribute.
	 * @see org.opcfoundation.ua._2008._02.types.FilterOperator
	 * @see #isSetFilterOperator()
	 * @see #unsetFilterOperator()
	 * @see #setFilterOperator(FilterOperator)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getContentFilterElement_FilterOperator()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='FilterOperator' namespace='##targetNamespace'"
	 * @generated
	 */
	FilterOperator getFilterOperator();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.ContentFilterElement#getFilterOperator <em>Filter Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter Operator</em>' attribute.
	 * @see org.opcfoundation.ua._2008._02.types.FilterOperator
	 * @see #isSetFilterOperator()
	 * @see #unsetFilterOperator()
	 * @see #getFilterOperator()
	 * @generated
	 */
	void setFilterOperator(FilterOperator value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.ContentFilterElement#getFilterOperator <em>Filter Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFilterOperator()
	 * @see #getFilterOperator()
	 * @see #setFilterOperator(FilterOperator)
	 * @generated
	 */
	void unsetFilterOperator();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.ContentFilterElement#getFilterOperator <em>Filter Operator</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Filter Operator</em>' attribute is set.
	 * @see #unsetFilterOperator()
	 * @see #getFilterOperator()
	 * @see #setFilterOperator(FilterOperator)
	 * @generated
	 */
	boolean isSetFilterOperator();

	/**
	 * Returns the value of the '<em><b>Filter Operands</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter Operands</em>' containment reference.
	 * @see #isSetFilterOperands()
	 * @see #unsetFilterOperands()
	 * @see #setFilterOperands(ListOfExtensionObject)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getContentFilterElement_FilterOperands()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='FilterOperands' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfExtensionObject getFilterOperands();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.ContentFilterElement#getFilterOperands <em>Filter Operands</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter Operands</em>' containment reference.
	 * @see #isSetFilterOperands()
	 * @see #unsetFilterOperands()
	 * @see #getFilterOperands()
	 * @generated
	 */
	void setFilterOperands(ListOfExtensionObject value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.ContentFilterElement#getFilterOperands <em>Filter Operands</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFilterOperands()
	 * @see #getFilterOperands()
	 * @see #setFilterOperands(ListOfExtensionObject)
	 * @generated
	 */
	void unsetFilterOperands();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.ContentFilterElement#getFilterOperands <em>Filter Operands</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Filter Operands</em>' containment reference is set.
	 * @see #unsetFilterOperands()
	 * @see #getFilterOperands()
	 * @see #setFilterOperands(ListOfExtensionObject)
	 * @generated
	 */
	boolean isSetFilterOperands();

} // ContentFilterElement
