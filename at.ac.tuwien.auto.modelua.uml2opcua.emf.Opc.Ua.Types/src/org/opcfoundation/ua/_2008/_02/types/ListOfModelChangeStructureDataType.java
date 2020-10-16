/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Model Change Structure Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfModelChangeStructureDataType#getModelChangeStructureDataType <em>Model Change Structure Data Type</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfModelChangeStructureDataType()
 * @model extendedMetaData="name='ListOfModelChangeStructureDataType' kind='elementOnly'"
 * @generated
 */
public interface ListOfModelChangeStructureDataType extends EObject {
	/**
	 * Returns the value of the '<em><b>Model Change Structure Data Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2008._02.types.ModelChangeStructureDataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Change Structure Data Type</em>' containment reference list.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfModelChangeStructureDataType_ModelChangeStructureDataType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ModelChangeStructureDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ModelChangeStructureDataType> getModelChangeStructureDataType();

} // ListOfModelChangeStructureDataType
