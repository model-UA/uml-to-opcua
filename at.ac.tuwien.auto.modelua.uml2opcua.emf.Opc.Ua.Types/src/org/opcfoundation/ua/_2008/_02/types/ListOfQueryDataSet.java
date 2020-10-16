/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Query Data Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfQueryDataSet#getQueryDataSet <em>Query Data Set</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfQueryDataSet()
 * @model extendedMetaData="name='ListOfQueryDataSet' kind='elementOnly'"
 * @generated
 */
public interface ListOfQueryDataSet extends EObject {
	/**
	 * Returns the value of the '<em><b>Query Data Set</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2008._02.types.QueryDataSet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query Data Set</em>' containment reference list.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfQueryDataSet_QueryDataSet()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='QueryDataSet' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<QueryDataSet> getQueryDataSet();

} // ListOfQueryDataSet
