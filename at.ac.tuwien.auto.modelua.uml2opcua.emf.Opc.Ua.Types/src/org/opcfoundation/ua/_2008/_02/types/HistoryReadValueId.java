/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>History Read Value Id</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.HistoryReadValueId#getNodeId <em>Node Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.HistoryReadValueId#getIndexRange <em>Index Range</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.HistoryReadValueId#getDataEncoding <em>Data Encoding</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.HistoryReadValueId#getContinuationPoint <em>Continuation Point</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getHistoryReadValueId()
 * @model extendedMetaData="name='HistoryReadValueId' kind='elementOnly'"
 * @generated
 */
public interface HistoryReadValueId extends EObject {
	/**
	 * Returns the value of the '<em><b>Node Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Id</em>' containment reference.
	 * @see #isSetNodeId()
	 * @see #unsetNodeId()
	 * @see #setNodeId(NodeId)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getHistoryReadValueId_NodeId()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='NodeId' namespace='##targetNamespace'"
	 * @generated
	 */
	NodeId getNodeId();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.HistoryReadValueId#getNodeId <em>Node Id</em>}' containment reference.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.HistoryReadValueId#getNodeId <em>Node Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNodeId()
	 * @see #getNodeId()
	 * @see #setNodeId(NodeId)
	 * @generated
	 */
	void unsetNodeId();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.HistoryReadValueId#getNodeId <em>Node Id</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Node Id</em>' containment reference is set.
	 * @see #unsetNodeId()
	 * @see #getNodeId()
	 * @see #setNodeId(NodeId)
	 * @generated
	 */
	boolean isSetNodeId();

	/**
	 * Returns the value of the '<em><b>Index Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index Range</em>' attribute.
	 * @see #isSetIndexRange()
	 * @see #unsetIndexRange()
	 * @see #setIndexRange(String)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getHistoryReadValueId_IndexRange()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='IndexRange' namespace='##targetNamespace'"
	 * @generated
	 */
	String getIndexRange();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.HistoryReadValueId#getIndexRange <em>Index Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index Range</em>' attribute.
	 * @see #isSetIndexRange()
	 * @see #unsetIndexRange()
	 * @see #getIndexRange()
	 * @generated
	 */
	void setIndexRange(String value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.HistoryReadValueId#getIndexRange <em>Index Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIndexRange()
	 * @see #getIndexRange()
	 * @see #setIndexRange(String)
	 * @generated
	 */
	void unsetIndexRange();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.HistoryReadValueId#getIndexRange <em>Index Range</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Index Range</em>' attribute is set.
	 * @see #unsetIndexRange()
	 * @see #getIndexRange()
	 * @see #setIndexRange(String)
	 * @generated
	 */
	boolean isSetIndexRange();

	/**
	 * Returns the value of the '<em><b>Data Encoding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Encoding</em>' containment reference.
	 * @see #isSetDataEncoding()
	 * @see #unsetDataEncoding()
	 * @see #setDataEncoding(QualifiedName)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getHistoryReadValueId_DataEncoding()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='DataEncoding' namespace='##targetNamespace'"
	 * @generated
	 */
	QualifiedName getDataEncoding();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.HistoryReadValueId#getDataEncoding <em>Data Encoding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Encoding</em>' containment reference.
	 * @see #isSetDataEncoding()
	 * @see #unsetDataEncoding()
	 * @see #getDataEncoding()
	 * @generated
	 */
	void setDataEncoding(QualifiedName value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.HistoryReadValueId#getDataEncoding <em>Data Encoding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDataEncoding()
	 * @see #getDataEncoding()
	 * @see #setDataEncoding(QualifiedName)
	 * @generated
	 */
	void unsetDataEncoding();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.HistoryReadValueId#getDataEncoding <em>Data Encoding</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Data Encoding</em>' containment reference is set.
	 * @see #unsetDataEncoding()
	 * @see #getDataEncoding()
	 * @see #setDataEncoding(QualifiedName)
	 * @generated
	 */
	boolean isSetDataEncoding();

	/**
	 * Returns the value of the '<em><b>Continuation Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Continuation Point</em>' attribute.
	 * @see #isSetContinuationPoint()
	 * @see #unsetContinuationPoint()
	 * @see #setContinuationPoint(byte[])
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getHistoryReadValueId_ContinuationPoint()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Base64Binary"
	 *        extendedMetaData="kind='element' name='ContinuationPoint' namespace='##targetNamespace'"
	 * @generated
	 */
	byte[] getContinuationPoint();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.HistoryReadValueId#getContinuationPoint <em>Continuation Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Continuation Point</em>' attribute.
	 * @see #isSetContinuationPoint()
	 * @see #unsetContinuationPoint()
	 * @see #getContinuationPoint()
	 * @generated
	 */
	void setContinuationPoint(byte[] value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.HistoryReadValueId#getContinuationPoint <em>Continuation Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetContinuationPoint()
	 * @see #getContinuationPoint()
	 * @see #setContinuationPoint(byte[])
	 * @generated
	 */
	void unsetContinuationPoint();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.HistoryReadValueId#getContinuationPoint <em>Continuation Point</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Continuation Point</em>' attribute is set.
	 * @see #unsetContinuationPoint()
	 * @see #getContinuationPoint()
	 * @see #setContinuationPoint(byte[])
	 * @generated
	 */
	boolean isSetContinuationPoint();

} // HistoryReadValueId
