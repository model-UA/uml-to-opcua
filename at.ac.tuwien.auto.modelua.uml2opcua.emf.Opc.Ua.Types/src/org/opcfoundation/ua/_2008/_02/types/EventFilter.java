/**
 */
package org.opcfoundation.ua._2008._02.types;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.EventFilter#getSelectClauses <em>Select Clauses</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.EventFilter#getWhereClause <em>Where Clause</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getEventFilter()
 * @model extendedMetaData="name='EventFilter' kind='elementOnly'"
 * @generated
 */
public interface EventFilter extends MonitoringFilter {
	/**
	 * Returns the value of the '<em><b>Select Clauses</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Select Clauses</em>' containment reference.
	 * @see #isSetSelectClauses()
	 * @see #unsetSelectClauses()
	 * @see #setSelectClauses(ListOfSimpleAttributeOperand)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getEventFilter_SelectClauses()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='SelectClauses' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfSimpleAttributeOperand getSelectClauses();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.EventFilter#getSelectClauses <em>Select Clauses</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Select Clauses</em>' containment reference.
	 * @see #isSetSelectClauses()
	 * @see #unsetSelectClauses()
	 * @see #getSelectClauses()
	 * @generated
	 */
	void setSelectClauses(ListOfSimpleAttributeOperand value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.EventFilter#getSelectClauses <em>Select Clauses</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSelectClauses()
	 * @see #getSelectClauses()
	 * @see #setSelectClauses(ListOfSimpleAttributeOperand)
	 * @generated
	 */
	void unsetSelectClauses();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.EventFilter#getSelectClauses <em>Select Clauses</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Select Clauses</em>' containment reference is set.
	 * @see #unsetSelectClauses()
	 * @see #getSelectClauses()
	 * @see #setSelectClauses(ListOfSimpleAttributeOperand)
	 * @generated
	 */
	boolean isSetSelectClauses();

	/**
	 * Returns the value of the '<em><b>Where Clause</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Where Clause</em>' containment reference.
	 * @see #isSetWhereClause()
	 * @see #unsetWhereClause()
	 * @see #setWhereClause(ContentFilter)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getEventFilter_WhereClause()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='WhereClause' namespace='##targetNamespace'"
	 * @generated
	 */
	ContentFilter getWhereClause();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.EventFilter#getWhereClause <em>Where Clause</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Where Clause</em>' containment reference.
	 * @see #isSetWhereClause()
	 * @see #unsetWhereClause()
	 * @see #getWhereClause()
	 * @generated
	 */
	void setWhereClause(ContentFilter value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.EventFilter#getWhereClause <em>Where Clause</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWhereClause()
	 * @see #getWhereClause()
	 * @see #setWhereClause(ContentFilter)
	 * @generated
	 */
	void unsetWhereClause();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.EventFilter#getWhereClause <em>Where Clause</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Where Clause</em>' containment reference is set.
	 * @see #unsetWhereClause()
	 * @see #getWhereClause()
	 * @see #setWhereClause(ContentFilter)
	 * @generated
	 */
	boolean isSetWhereClause();

} // EventFilter
