/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Query First Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.QueryFirstRequest#getRequestHeader <em>Request Header</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.QueryFirstRequest#getView <em>View</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.QueryFirstRequest#getNodeTypes <em>Node Types</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.QueryFirstRequest#getFilter <em>Filter</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.QueryFirstRequest#getMaxDataSetsToReturn <em>Max Data Sets To Return</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.QueryFirstRequest#getMaxReferencesToReturn <em>Max References To Return</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getQueryFirstRequest()
 * @model extendedMetaData="name='QueryFirstRequest' kind='elementOnly'"
 * @generated
 */
public interface QueryFirstRequest extends EObject {
	/**
	 * Returns the value of the '<em><b>Request Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Header</em>' containment reference.
	 * @see #isSetRequestHeader()
	 * @see #unsetRequestHeader()
	 * @see #setRequestHeader(RequestHeader)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getQueryFirstRequest_RequestHeader()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='RequestHeader' namespace='##targetNamespace'"
	 * @generated
	 */
	RequestHeader getRequestHeader();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.QueryFirstRequest#getRequestHeader <em>Request Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request Header</em>' containment reference.
	 * @see #isSetRequestHeader()
	 * @see #unsetRequestHeader()
	 * @see #getRequestHeader()
	 * @generated
	 */
	void setRequestHeader(RequestHeader value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.QueryFirstRequest#getRequestHeader <em>Request Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRequestHeader()
	 * @see #getRequestHeader()
	 * @see #setRequestHeader(RequestHeader)
	 * @generated
	 */
	void unsetRequestHeader();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.QueryFirstRequest#getRequestHeader <em>Request Header</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Request Header</em>' containment reference is set.
	 * @see #unsetRequestHeader()
	 * @see #getRequestHeader()
	 * @see #setRequestHeader(RequestHeader)
	 * @generated
	 */
	boolean isSetRequestHeader();

	/**
	 * Returns the value of the '<em><b>View</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View</em>' containment reference.
	 * @see #isSetView()
	 * @see #unsetView()
	 * @see #setView(ViewDescription)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getQueryFirstRequest_View()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='View' namespace='##targetNamespace'"
	 * @generated
	 */
	ViewDescription getView();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.QueryFirstRequest#getView <em>View</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>View</em>' containment reference.
	 * @see #isSetView()
	 * @see #unsetView()
	 * @see #getView()
	 * @generated
	 */
	void setView(ViewDescription value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.QueryFirstRequest#getView <em>View</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetView()
	 * @see #getView()
	 * @see #setView(ViewDescription)
	 * @generated
	 */
	void unsetView();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.QueryFirstRequest#getView <em>View</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>View</em>' containment reference is set.
	 * @see #unsetView()
	 * @see #getView()
	 * @see #setView(ViewDescription)
	 * @generated
	 */
	boolean isSetView();

	/**
	 * Returns the value of the '<em><b>Node Types</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Types</em>' containment reference.
	 * @see #isSetNodeTypes()
	 * @see #unsetNodeTypes()
	 * @see #setNodeTypes(ListOfNodeTypeDescription)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getQueryFirstRequest_NodeTypes()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='NodeTypes' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfNodeTypeDescription getNodeTypes();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.QueryFirstRequest#getNodeTypes <em>Node Types</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node Types</em>' containment reference.
	 * @see #isSetNodeTypes()
	 * @see #unsetNodeTypes()
	 * @see #getNodeTypes()
	 * @generated
	 */
	void setNodeTypes(ListOfNodeTypeDescription value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.QueryFirstRequest#getNodeTypes <em>Node Types</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNodeTypes()
	 * @see #getNodeTypes()
	 * @see #setNodeTypes(ListOfNodeTypeDescription)
	 * @generated
	 */
	void unsetNodeTypes();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.QueryFirstRequest#getNodeTypes <em>Node Types</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Node Types</em>' containment reference is set.
	 * @see #unsetNodeTypes()
	 * @see #getNodeTypes()
	 * @see #setNodeTypes(ListOfNodeTypeDescription)
	 * @generated
	 */
	boolean isSetNodeTypes();

	/**
	 * Returns the value of the '<em><b>Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter</em>' containment reference.
	 * @see #isSetFilter()
	 * @see #unsetFilter()
	 * @see #setFilter(ContentFilter)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getQueryFirstRequest_Filter()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='Filter' namespace='##targetNamespace'"
	 * @generated
	 */
	ContentFilter getFilter();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.QueryFirstRequest#getFilter <em>Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter</em>' containment reference.
	 * @see #isSetFilter()
	 * @see #unsetFilter()
	 * @see #getFilter()
	 * @generated
	 */
	void setFilter(ContentFilter value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.QueryFirstRequest#getFilter <em>Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFilter()
	 * @see #getFilter()
	 * @see #setFilter(ContentFilter)
	 * @generated
	 */
	void unsetFilter();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.QueryFirstRequest#getFilter <em>Filter</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Filter</em>' containment reference is set.
	 * @see #unsetFilter()
	 * @see #getFilter()
	 * @see #setFilter(ContentFilter)
	 * @generated
	 */
	boolean isSetFilter();

	/**
	 * Returns the value of the '<em><b>Max Data Sets To Return</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Data Sets To Return</em>' attribute.
	 * @see #isSetMaxDataSetsToReturn()
	 * @see #unsetMaxDataSetsToReturn()
	 * @see #setMaxDataSetsToReturn(long)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getQueryFirstRequest_MaxDataSetsToReturn()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='element' name='MaxDataSetsToReturn' namespace='##targetNamespace'"
	 * @generated
	 */
	long getMaxDataSetsToReturn();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.QueryFirstRequest#getMaxDataSetsToReturn <em>Max Data Sets To Return</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Data Sets To Return</em>' attribute.
	 * @see #isSetMaxDataSetsToReturn()
	 * @see #unsetMaxDataSetsToReturn()
	 * @see #getMaxDataSetsToReturn()
	 * @generated
	 */
	void setMaxDataSetsToReturn(long value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.QueryFirstRequest#getMaxDataSetsToReturn <em>Max Data Sets To Return</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaxDataSetsToReturn()
	 * @see #getMaxDataSetsToReturn()
	 * @see #setMaxDataSetsToReturn(long)
	 * @generated
	 */
	void unsetMaxDataSetsToReturn();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.QueryFirstRequest#getMaxDataSetsToReturn <em>Max Data Sets To Return</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Max Data Sets To Return</em>' attribute is set.
	 * @see #unsetMaxDataSetsToReturn()
	 * @see #getMaxDataSetsToReturn()
	 * @see #setMaxDataSetsToReturn(long)
	 * @generated
	 */
	boolean isSetMaxDataSetsToReturn();

	/**
	 * Returns the value of the '<em><b>Max References To Return</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max References To Return</em>' attribute.
	 * @see #isSetMaxReferencesToReturn()
	 * @see #unsetMaxReferencesToReturn()
	 * @see #setMaxReferencesToReturn(long)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getQueryFirstRequest_MaxReferencesToReturn()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='element' name='MaxReferencesToReturn' namespace='##targetNamespace'"
	 * @generated
	 */
	long getMaxReferencesToReturn();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.QueryFirstRequest#getMaxReferencesToReturn <em>Max References To Return</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max References To Return</em>' attribute.
	 * @see #isSetMaxReferencesToReturn()
	 * @see #unsetMaxReferencesToReturn()
	 * @see #getMaxReferencesToReturn()
	 * @generated
	 */
	void setMaxReferencesToReturn(long value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.QueryFirstRequest#getMaxReferencesToReturn <em>Max References To Return</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaxReferencesToReturn()
	 * @see #getMaxReferencesToReturn()
	 * @see #setMaxReferencesToReturn(long)
	 * @generated
	 */
	void unsetMaxReferencesToReturn();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.QueryFirstRequest#getMaxReferencesToReturn <em>Max References To Return</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Max References To Return</em>' attribute is set.
	 * @see #unsetMaxReferencesToReturn()
	 * @see #getMaxReferencesToReturn()
	 * @see #setMaxReferencesToReturn(long)
	 * @generated
	 */
	boolean isSetMaxReferencesToReturn();

} // QueryFirstRequest
