/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Content Filter Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ContentFilterResult#getElementResults <em>Element Results</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ContentFilterResult#getElementDiagnosticInfos <em>Element Diagnostic Infos</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getContentFilterResult()
 * @model extendedMetaData="name='ContentFilterResult' kind='elementOnly'"
 * @generated
 */
public interface ContentFilterResult extends EObject {
	/**
	 * Returns the value of the '<em><b>Element Results</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Results</em>' containment reference.
	 * @see #isSetElementResults()
	 * @see #unsetElementResults()
	 * @see #setElementResults(ListOfContentFilterElementResult)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getContentFilterResult_ElementResults()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='ElementResults' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfContentFilterElementResult getElementResults();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.ContentFilterResult#getElementResults <em>Element Results</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Results</em>' containment reference.
	 * @see #isSetElementResults()
	 * @see #unsetElementResults()
	 * @see #getElementResults()
	 * @generated
	 */
	void setElementResults(ListOfContentFilterElementResult value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.ContentFilterResult#getElementResults <em>Element Results</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetElementResults()
	 * @see #getElementResults()
	 * @see #setElementResults(ListOfContentFilterElementResult)
	 * @generated
	 */
	void unsetElementResults();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.ContentFilterResult#getElementResults <em>Element Results</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Element Results</em>' containment reference is set.
	 * @see #unsetElementResults()
	 * @see #getElementResults()
	 * @see #setElementResults(ListOfContentFilterElementResult)
	 * @generated
	 */
	boolean isSetElementResults();

	/**
	 * Returns the value of the '<em><b>Element Diagnostic Infos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Diagnostic Infos</em>' containment reference.
	 * @see #isSetElementDiagnosticInfos()
	 * @see #unsetElementDiagnosticInfos()
	 * @see #setElementDiagnosticInfos(ListOfDiagnosticInfo)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getContentFilterResult_ElementDiagnosticInfos()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='ElementDiagnosticInfos' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfDiagnosticInfo getElementDiagnosticInfos();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.ContentFilterResult#getElementDiagnosticInfos <em>Element Diagnostic Infos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Diagnostic Infos</em>' containment reference.
	 * @see #isSetElementDiagnosticInfos()
	 * @see #unsetElementDiagnosticInfos()
	 * @see #getElementDiagnosticInfos()
	 * @generated
	 */
	void setElementDiagnosticInfos(ListOfDiagnosticInfo value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.ContentFilterResult#getElementDiagnosticInfos <em>Element Diagnostic Infos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetElementDiagnosticInfos()
	 * @see #getElementDiagnosticInfos()
	 * @see #setElementDiagnosticInfos(ListOfDiagnosticInfo)
	 * @generated
	 */
	void unsetElementDiagnosticInfos();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.ContentFilterResult#getElementDiagnosticInfos <em>Element Diagnostic Infos</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Element Diagnostic Infos</em>' containment reference is set.
	 * @see #unsetElementDiagnosticInfos()
	 * @see #getElementDiagnosticInfos()
	 * @see #setElementDiagnosticInfos(ListOfDiagnosticInfo)
	 * @generated
	 */
	boolean isSetElementDiagnosticInfos();

} // ContentFilterResult
