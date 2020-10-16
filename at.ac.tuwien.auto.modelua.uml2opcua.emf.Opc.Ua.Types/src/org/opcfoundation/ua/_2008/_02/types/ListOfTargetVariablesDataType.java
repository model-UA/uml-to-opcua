/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Target Variables Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfTargetVariablesDataType#getTargetVariablesDataType <em>Target Variables Data Type</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfTargetVariablesDataType()
 * @model extendedMetaData="name='ListOfTargetVariablesDataType' kind='elementOnly'"
 * @generated
 */
public interface ListOfTargetVariablesDataType extends EObject {
	/**
	 * Returns the value of the '<em><b>Target Variables Data Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2008._02.types.TargetVariablesDataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Variables Data Type</em>' containment reference list.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfTargetVariablesDataType_TargetVariablesDataType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='TargetVariablesDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TargetVariablesDataType> getTargetVariablesDataType();

} // ListOfTargetVariablesDataType
