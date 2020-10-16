/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>History Update Details</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.HistoryUpdateDetails#getNodeId <em>Node Id</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getHistoryUpdateDetails()
 * @model extendedMetaData="name='HistoryUpdateDetails' kind='elementOnly'"
 * @generated
 */
public interface HistoryUpdateDetails extends EObject {
	/**
	 * Returns the value of the '<em><b>Node Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Id</em>' containment reference.
	 * @see #isSetNodeId()
	 * @see #unsetNodeId()
	 * @see #setNodeId(NodeId)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getHistoryUpdateDetails_NodeId()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='NodeId' namespace='##targetNamespace'"
	 * @generated
	 */
	NodeId getNodeId();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.HistoryUpdateDetails#getNodeId <em>Node Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node Id</em>' containment reference.
	 * @see #isSetNodeId()
	 * @see #unsetNodeId()
	 * @see #getNodeId()
	 * @generated
	 */
	void setNodeId(NodeId value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.HistoryUpdateDetails#getNodeId <em>Node Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNodeId()
	 * @see #getNodeId()
	 * @see #setNodeId(NodeId)
	 * @generated
	 */
	void unsetNodeId();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.HistoryUpdateDetails#getNodeId <em>Node Id</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Node Id</em>' containment reference is set.
	 * @see #unsetNodeId()
	 * @see #getNodeId()
	 * @see #setNodeId(NodeId)
	 * @generated
	 */
	boolean isSetNodeId();

} // HistoryUpdateDetails
