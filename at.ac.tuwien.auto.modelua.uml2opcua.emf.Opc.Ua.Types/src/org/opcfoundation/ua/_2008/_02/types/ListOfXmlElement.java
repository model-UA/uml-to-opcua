/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Xml Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfXmlElement#getXmlElement <em>Xml Element</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfXmlElement()
 * @model extendedMetaData="name='ListOfXmlElement' kind='elementOnly'"
 * @generated
 */
public interface ListOfXmlElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Xml Element</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2008._02.types.XmlElementType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xml Element</em>' containment reference list.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfXmlElement_XmlElement()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='XmlElement' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<XmlElementType> getXmlElement();

} // ListOfXmlElement
