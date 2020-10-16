/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Browse Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.BrowseRequest#getRequestHeader <em>Request Header</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.BrowseRequest#getView <em>View</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.BrowseRequest#getRequestedMaxReferencesPerNode <em>Requested Max References Per Node</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.BrowseRequest#getNodesToBrowse <em>Nodes To Browse</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getBrowseRequest()
 * @model extendedMetaData="name='BrowseRequest' kind='elementOnly'"
 * @generated
 */
public interface BrowseRequest extends EObject {
	/**
	 * Returns the value of the '<em><b>Request Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Header</em>' containment reference.
	 * @see #isSetRequestHeader()
	 * @see #unsetRequestHeader()
	 * @see #setRequestHeader(RequestHeader)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getBrowseRequest_RequestHeader()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='RequestHeader' namespace='##targetNamespace'"
	 * @generated
	 */
	RequestHeader getRequestHeader();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.BrowseRequest#getRequestHeader <em>Request Header</em>}' containment reference.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.BrowseRequest#getRequestHeader <em>Request Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRequestHeader()
	 * @see #getRequestHeader()
	 * @see #setRequestHeader(RequestHeader)
	 * @generated
	 */
	void unsetRequestHeader();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.BrowseRequest#getRequestHeader <em>Request Header</em>}' containment reference is set.
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
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getBrowseRequest_View()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='View' namespace='##targetNamespace'"
	 * @generated
	 */
	ViewDescription getView();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.BrowseRequest#getView <em>View</em>}' containment reference.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.BrowseRequest#getView <em>View</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetView()
	 * @see #getView()
	 * @see #setView(ViewDescription)
	 * @generated
	 */
	void unsetView();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.BrowseRequest#getView <em>View</em>}' containment reference is set.
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
	 * Returns the value of the '<em><b>Requested Max References Per Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requested Max References Per Node</em>' attribute.
	 * @see #isSetRequestedMaxReferencesPerNode()
	 * @see #unsetRequestedMaxReferencesPerNode()
	 * @see #setRequestedMaxReferencesPerNode(long)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getBrowseRequest_RequestedMaxReferencesPerNode()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='element' name='RequestedMaxReferencesPerNode' namespace='##targetNamespace'"
	 * @generated
	 */
	long getRequestedMaxReferencesPerNode();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.BrowseRequest#getRequestedMaxReferencesPerNode <em>Requested Max References Per Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requested Max References Per Node</em>' attribute.
	 * @see #isSetRequestedMaxReferencesPerNode()
	 * @see #unsetRequestedMaxReferencesPerNode()
	 * @see #getRequestedMaxReferencesPerNode()
	 * @generated
	 */
	void setRequestedMaxReferencesPerNode(long value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.BrowseRequest#getRequestedMaxReferencesPerNode <em>Requested Max References Per Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRequestedMaxReferencesPerNode()
	 * @see #getRequestedMaxReferencesPerNode()
	 * @see #setRequestedMaxReferencesPerNode(long)
	 * @generated
	 */
	void unsetRequestedMaxReferencesPerNode();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.BrowseRequest#getRequestedMaxReferencesPerNode <em>Requested Max References Per Node</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Requested Max References Per Node</em>' attribute is set.
	 * @see #unsetRequestedMaxReferencesPerNode()
	 * @see #getRequestedMaxReferencesPerNode()
	 * @see #setRequestedMaxReferencesPerNode(long)
	 * @generated
	 */
	boolean isSetRequestedMaxReferencesPerNode();

	/**
	 * Returns the value of the '<em><b>Nodes To Browse</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes To Browse</em>' containment reference.
	 * @see #isSetNodesToBrowse()
	 * @see #unsetNodesToBrowse()
	 * @see #setNodesToBrowse(ListOfBrowseDescription)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getBrowseRequest_NodesToBrowse()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='NodesToBrowse' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfBrowseDescription getNodesToBrowse();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.BrowseRequest#getNodesToBrowse <em>Nodes To Browse</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nodes To Browse</em>' containment reference.
	 * @see #isSetNodesToBrowse()
	 * @see #unsetNodesToBrowse()
	 * @see #getNodesToBrowse()
	 * @generated
	 */
	void setNodesToBrowse(ListOfBrowseDescription value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.BrowseRequest#getNodesToBrowse <em>Nodes To Browse</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNodesToBrowse()
	 * @see #getNodesToBrowse()
	 * @see #setNodesToBrowse(ListOfBrowseDescription)
	 * @generated
	 */
	void unsetNodesToBrowse();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.BrowseRequest#getNodesToBrowse <em>Nodes To Browse</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nodes To Browse</em>' containment reference is set.
	 * @see #unsetNodesToBrowse()
	 * @see #getNodesToBrowse()
	 * @see #setNodesToBrowse(ListOfBrowseDescription)
	 * @generated
	 */
	boolean isSetNodesToBrowse();

} // BrowseRequest
