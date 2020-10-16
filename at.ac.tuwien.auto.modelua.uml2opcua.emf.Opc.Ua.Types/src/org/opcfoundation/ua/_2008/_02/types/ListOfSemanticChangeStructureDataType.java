/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Semantic Change Structure Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfSemanticChangeStructureDataType#getSemanticChangeStructureDataType <em>Semantic Change Structure Data Type</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfSemanticChangeStructureDataType()
 * @model extendedMetaData="name='ListOfSemanticChangeStructureDataType' kind='elementOnly'"
 * @generated
 */
public interface ListOfSemanticChangeStructureDataType extends EObject {
	/**
	 * Returns the value of the '<em><b>Semantic Change Structure Data Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2008._02.types.SemanticChangeStructureDataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Change Structure Data Type</em>' containment reference list.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfSemanticChangeStructureDataType_SemanticChangeStructureDataType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SemanticChangeStructureDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SemanticChangeStructureDataType> getSemanticChangeStructureDataType();

} // ListOfSemanticChangeStructureDataType
