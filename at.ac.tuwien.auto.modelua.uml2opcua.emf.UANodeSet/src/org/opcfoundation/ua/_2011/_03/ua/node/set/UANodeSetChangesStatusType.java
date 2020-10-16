/**
 */
package org.opcfoundation.ua._2011._03.ua.node.set;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UA Node Set Changes Status Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.UANodeSetChangesStatusType#getNodesToAdd <em>Nodes To Add</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.UANodeSetChangesStatusType#getReferencesToAdd <em>References To Add</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.UANodeSetChangesStatusType#getNodesToDelete <em>Nodes To Delete</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.UANodeSetChangesStatusType#getReferencesToDelete <em>References To Delete</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.UANodeSetChangesStatusType#getLastModified <em>Last Modified</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.UANodeSetChangesStatusType#getTransactionId <em>Transaction Id</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2011._03.ua.node.set.SetPackage#getUANodeSetChangesStatusType()
 * @model extendedMetaData="name='UANodeSetChangesStatus_._type' kind='elementOnly'"
 * @generated
 */
public interface UANodeSetChangesStatusType extends EObject {
	/**
	 * Returns the value of the '<em><b>Nodes To Add</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes To Add</em>' containment reference.
	 * @see #setNodesToAdd(NodeSetStatusList)
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.SetPackage#getUANodeSetChangesStatusType_NodesToAdd()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='NodesToAdd' namespace='##targetNamespace'"
	 * @generated
	 */
	NodeSetStatusList getNodesToAdd();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.UANodeSetChangesStatusType#getNodesToAdd <em>Nodes To Add</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nodes To Add</em>' containment reference.
	 * @see #getNodesToAdd()
	 * @generated
	 */
	void setNodesToAdd(NodeSetStatusList value);

	/**
	 * Returns the value of the '<em><b>References To Add</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>References To Add</em>' containment reference.
	 * @see #setReferencesToAdd(NodeSetStatusList)
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.SetPackage#getUANodeSetChangesStatusType_ReferencesToAdd()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ReferencesToAdd' namespace='##targetNamespace'"
	 * @generated
	 */
	NodeSetStatusList getReferencesToAdd();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.UANodeSetChangesStatusType#getReferencesToAdd <em>References To Add</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>References To Add</em>' containment reference.
	 * @see #getReferencesToAdd()
	 * @generated
	 */
	void setReferencesToAdd(NodeSetStatusList value);

	/**
	 * Returns the value of the '<em><b>Nodes To Delete</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes To Delete</em>' containment reference.
	 * @see #setNodesToDelete(NodeSetStatusList)
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.SetPackage#getUANodeSetChangesStatusType_NodesToDelete()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='NodesToDelete' namespace='##targetNamespace'"
	 * @generated
	 */
	NodeSetStatusList getNodesToDelete();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.UANodeSetChangesStatusType#getNodesToDelete <em>Nodes To Delete</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nodes To Delete</em>' containment reference.
	 * @see #getNodesToDelete()
	 * @generated
	 */
	void setNodesToDelete(NodeSetStatusList value);

	/**
	 * Returns the value of the '<em><b>References To Delete</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>References To Delete</em>' containment reference.
	 * @see #setReferencesToDelete(NodeSetStatusList)
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.SetPackage#getUANodeSetChangesStatusType_ReferencesToDelete()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ReferencesToDelete' namespace='##targetNamespace'"
	 * @generated
	 */
	NodeSetStatusList getReferencesToDelete();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.UANodeSetChangesStatusType#getReferencesToDelete <em>References To Delete</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>References To Delete</em>' containment reference.
	 * @see #getReferencesToDelete()
	 * @generated
	 */
	void setReferencesToDelete(NodeSetStatusList value);

	/**
	 * Returns the value of the '<em><b>Last Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Modified</em>' attribute.
	 * @see #setLastModified(XMLGregorianCalendar)
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.SetPackage#getUANodeSetChangesStatusType_LastModified()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='attribute' name='LastModified'"
	 * @generated
	 */
	XMLGregorianCalendar getLastModified();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.UANodeSetChangesStatusType#getLastModified <em>Last Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Modified</em>' attribute.
	 * @see #getLastModified()
	 * @generated
	 */
	void setLastModified(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Transaction Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transaction Id</em>' attribute.
	 * @see #setTransactionId(String)
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.SetPackage#getUANodeSetChangesStatusType_TransactionId()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='TransactionId'"
	 * @generated
	 */
	String getTransactionId();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.UANodeSetChangesStatusType#getTransactionId <em>Transaction Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transaction Id</em>' attribute.
	 * @see #getTransactionId()
	 * @generated
	 */
	void setTransactionId(String value);

} // UANodeSetChangesStatusType
