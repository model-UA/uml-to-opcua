/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Pub Sub Diagnostics Counter Classification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfPubSubDiagnosticsCounterClassification#getPubSubDiagnosticsCounterClassification <em>Pub Sub Diagnostics Counter Classification</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfPubSubDiagnosticsCounterClassification()
 * @model extendedMetaData="name='ListOfPubSubDiagnosticsCounterClassification' kind='elementOnly'"
 * @generated
 */
public interface ListOfPubSubDiagnosticsCounterClassification extends EObject {
	/**
	 * Returns the value of the '<em><b>Pub Sub Diagnostics Counter Classification</b></em>' attribute list.
	 * The list contents are of type {@link org.opcfoundation.ua._2008._02.types.PubSubDiagnosticsCounterClassification}.
	 * The literals are from the enumeration {@link org.opcfoundation.ua._2008._02.types.PubSubDiagnosticsCounterClassification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pub Sub Diagnostics Counter Classification</em>' attribute list.
	 * @see org.opcfoundation.ua._2008._02.types.PubSubDiagnosticsCounterClassification
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfPubSubDiagnosticsCounterClassification_PubSubDiagnosticsCounterClassification()
	 * @model unique="false"
	 *        extendedMetaData="kind='element' name='PubSubDiagnosticsCounterClassification' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PubSubDiagnosticsCounterClassification> getPubSubDiagnosticsCounterClassification();

} // ListOfPubSubDiagnosticsCounterClassification
