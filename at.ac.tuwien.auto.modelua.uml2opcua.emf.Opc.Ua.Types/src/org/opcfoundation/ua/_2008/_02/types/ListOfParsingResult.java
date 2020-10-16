/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Parsing Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfParsingResult#getParsingResult <em>Parsing Result</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfParsingResult()
 * @model extendedMetaData="name='ListOfParsingResult' kind='elementOnly'"
 * @generated
 */
public interface ListOfParsingResult extends EObject {
	/**
	 * Returns the value of the '<em><b>Parsing Result</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2008._02.types.ParsingResult}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parsing Result</em>' containment reference list.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfParsingResult_ParsingResult()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ParsingResult' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ParsingResult> getParsingResult();

} // ListOfParsingResult
