/**
 */
package org.opcfoundation.ua._2011._03.ua.node.set;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UA Node Set Changes Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.UANodeSetChangesType#getNamespaceUris <em>Namespace Uris</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.UANodeSetChangesType#getServerUris <em>Server Uris</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.UANodeSetChangesType#getAliases <em>Aliases</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.UANodeSetChangesType#getExtensions <em>Extensions</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.UANodeSetChangesType#getNodesToAdd <em>Nodes To Add</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.UANodeSetChangesType#getReferencesToAdd <em>References To Add</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.UANodeSetChangesType#getNodesToDelete <em>Nodes To Delete</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.UANodeSetChangesType#getReferencesToDelete <em>References To Delete</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.UANodeSetChangesType#isAcceptAllOrNothing <em>Accept All Or Nothing</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.UANodeSetChangesType#getLastModified <em>Last Modified</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.UANodeSetChangesType#getTransactionId <em>Transaction Id</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2011._03.ua.node.set.SetPackage#getUANodeSetChangesType()
 * @model extendedMetaData="name='UANodeSetChanges_._type' kind='elementOnly'"
 * @generated
 */
public interface UANodeSetChangesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Namespace Uris</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Namespace Uris</em>' containment reference.
	 * @see #setNamespaceUris(UriTable)
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.SetPackage#getUANodeSetChangesType_NamespaceUris()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='NamespaceUris' namespace='##targetNamespace'"
	 * @generated
	 */
	UriTable getNamespaceUris();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.UANodeSetChangesType#getNamespaceUris <em>Namespace Uris</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Namespace Uris</em>' containment reference.
	 * @see #getNamespaceUris()
	 * @generated
	 */
	void setNamespaceUris(UriTable value);

	/**
	 * Returns the value of the '<em><b>Server Uris</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server Uris</em>' containment reference.
	 * @see #setServerUris(UriTable)
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.SetPackage#getUANodeSetChangesType_ServerUris()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ServerUris' namespace='##targetNamespace'"
	 * @generated
	 */
	UriTable getServerUris();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.UANodeSetChangesType#getServerUris <em>Server Uris</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server Uris</em>' containment reference.
	 * @see #getServerUris()
	 * @generated
	 */
	void setServerUris(UriTable value);

	/**
	 * Returns the value of the '<em><b>Aliases</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aliases</em>' containment reference.
	 * @see #setAliases(AliasTable)
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.SetPackage#getUANodeSetChangesType_Aliases()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Aliases' namespace='##targetNamespace'"
	 * @generated
	 */
	AliasTable getAliases();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.UANodeSetChangesType#getAliases <em>Aliases</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aliases</em>' containment reference.
	 * @see #getAliases()
	 * @generated
	 */
	void setAliases(AliasTable value);

	/**
	 * Returns the value of the '<em><b>Extensions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extensions</em>' containment reference.
	 * @see #setExtensions(ListOfExtensions)
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.SetPackage#getUANodeSetChangesType_Extensions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Extensions' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfExtensions getExtensions();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.UANodeSetChangesType#getExtensions <em>Extensions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extensions</em>' containment reference.
	 * @see #getExtensions()
	 * @generated
	 */
	void setExtensions(ListOfExtensions value);

	/**
	 * Returns the value of the '<em><b>Nodes To Add</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes To Add</em>' containment reference.
	 * @see #setNodesToAdd(NodesToAdd)
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.SetPackage#getUANodeSetChangesType_NodesToAdd()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='NodesToAdd' namespace='##targetNamespace'"
	 * @generated
	 */
	NodesToAdd getNodesToAdd();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.UANodeSetChangesType#getNodesToAdd <em>Nodes To Add</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nodes To Add</em>' containment reference.
	 * @see #getNodesToAdd()
	 * @generated
	 */
	void setNodesToAdd(NodesToAdd value);

	/**
	 * Returns the value of the '<em><b>References To Add</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>References To Add</em>' containment reference.
	 * @see #setReferencesToAdd(ReferencesToChange)
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.SetPackage#getUANodeSetChangesType_ReferencesToAdd()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ReferencesToAdd' namespace='##targetNamespace'"
	 * @generated
	 */
	ReferencesToChange getReferencesToAdd();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.UANodeSetChangesType#getReferencesToAdd <em>References To Add</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>References To Add</em>' containment reference.
	 * @see #getReferencesToAdd()
	 * @generated
	 */
	void setReferencesToAdd(ReferencesToChange value);

	/**
	 * Returns the value of the '<em><b>Nodes To Delete</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes To Delete</em>' containment reference.
	 * @see #setNodesToDelete(NodesToDelete)
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.SetPackage#getUANodeSetChangesType_NodesToDelete()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='NodesToDelete' namespace='##targetNamespace'"
	 * @generated
	 */
	NodesToDelete getNodesToDelete();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.UANodeSetChangesType#getNodesToDelete <em>Nodes To Delete</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nodes To Delete</em>' containment reference.
	 * @see #getNodesToDelete()
	 * @generated
	 */
	void setNodesToDelete(NodesToDelete value);

	/**
	 * Returns the value of the '<em><b>References To Delete</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>References To Delete</em>' containment reference.
	 * @see #setReferencesToDelete(ReferencesToChange)
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.SetPackage#getUANodeSetChangesType_ReferencesToDelete()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ReferencesToDelete' namespace='##targetNamespace'"
	 * @generated
	 */
	ReferencesToChange getReferencesToDelete();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.UANodeSetChangesType#getReferencesToDelete <em>References To Delete</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>References To Delete</em>' containment reference.
	 * @see #getReferencesToDelete()
	 * @generated
	 */
	void setReferencesToDelete(ReferencesToChange value);

	/**
	 * Returns the value of the '<em><b>Accept All Or Nothing</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accept All Or Nothing</em>' attribute.
	 * @see #isSetAcceptAllOrNothing()
	 * @see #unsetAcceptAllOrNothing()
	 * @see #setAcceptAllOrNothing(boolean)
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.SetPackage#getUANodeSetChangesType_AcceptAllOrNothing()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='AcceptAllOrNothing'"
	 * @generated
	 */
	boolean isAcceptAllOrNothing();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.UANodeSetChangesType#isAcceptAllOrNothing <em>Accept All Or Nothing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accept All Or Nothing</em>' attribute.
	 * @see #isSetAcceptAllOrNothing()
	 * @see #unsetAcceptAllOrNothing()
	 * @see #isAcceptAllOrNothing()
	 * @generated
	 */
	void setAcceptAllOrNothing(boolean value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.UANodeSetChangesType#isAcceptAllOrNothing <em>Accept All Or Nothing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAcceptAllOrNothing()
	 * @see #isAcceptAllOrNothing()
	 * @see #setAcceptAllOrNothing(boolean)
	 * @generated
	 */
	void unsetAcceptAllOrNothing();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.UANodeSetChangesType#isAcceptAllOrNothing <em>Accept All Or Nothing</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Accept All Or Nothing</em>' attribute is set.
	 * @see #unsetAcceptAllOrNothing()
	 * @see #isAcceptAllOrNothing()
	 * @see #setAcceptAllOrNothing(boolean)
	 * @generated
	 */
	boolean isSetAcceptAllOrNothing();

	/**
	 * Returns the value of the '<em><b>Last Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Modified</em>' attribute.
	 * @see #setLastModified(XMLGregorianCalendar)
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.SetPackage#getUANodeSetChangesType_LastModified()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='attribute' name='LastModified'"
	 * @generated
	 */
	XMLGregorianCalendar getLastModified();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.UANodeSetChangesType#getLastModified <em>Last Modified</em>}' attribute.
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
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.SetPackage#getUANodeSetChangesType_TransactionId()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='TransactionId'"
	 * @generated
	 */
	String getTransactionId();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.UANodeSetChangesType#getTransactionId <em>Transaction Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transaction Id</em>' attribute.
	 * @see #getTransactionId()
	 * @generated
	 */
	void setTransactionId(String value);

} // UANodeSetChangesType
