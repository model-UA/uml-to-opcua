/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagnostic Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DiagnosticInfo#getSymbolicId <em>Symbolic Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DiagnosticInfo#getNamespaceUri <em>Namespace Uri</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DiagnosticInfo#getLocale <em>Locale</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DiagnosticInfo#getLocalizedText <em>Localized Text</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DiagnosticInfo#getAdditionalInfo <em>Additional Info</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DiagnosticInfo#getInnerStatusCode <em>Inner Status Code</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DiagnosticInfo#getInnerDiagnosticInfo <em>Inner Diagnostic Info</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDiagnosticInfo()
 * @model extendedMetaData="name='DiagnosticInfo' kind='elementOnly'"
 * @generated
 */
public interface DiagnosticInfo extends EObject {
	/**
	 * Returns the value of the '<em><b>Symbolic Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Symbolic Id</em>' attribute.
	 * @see #isSetSymbolicId()
	 * @see #unsetSymbolicId()
	 * @see #setSymbolicId(int)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDiagnosticInfo_SymbolicId()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='element' name='SymbolicId' namespace='##targetNamespace'"
	 * @generated
	 */
	int getSymbolicId();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DiagnosticInfo#getSymbolicId <em>Symbolic Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Symbolic Id</em>' attribute.
	 * @see #isSetSymbolicId()
	 * @see #unsetSymbolicId()
	 * @see #getSymbolicId()
	 * @generated
	 */
	void setSymbolicId(int value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.DiagnosticInfo#getSymbolicId <em>Symbolic Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSymbolicId()
	 * @see #getSymbolicId()
	 * @see #setSymbolicId(int)
	 * @generated
	 */
	void unsetSymbolicId();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.DiagnosticInfo#getSymbolicId <em>Symbolic Id</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Symbolic Id</em>' attribute is set.
	 * @see #unsetSymbolicId()
	 * @see #getSymbolicId()
	 * @see #setSymbolicId(int)
	 * @generated
	 */
	boolean isSetSymbolicId();

	/**
	 * Returns the value of the '<em><b>Namespace Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Namespace Uri</em>' attribute.
	 * @see #isSetNamespaceUri()
	 * @see #unsetNamespaceUri()
	 * @see #setNamespaceUri(int)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDiagnosticInfo_NamespaceUri()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='element' name='NamespaceUri' namespace='##targetNamespace'"
	 * @generated
	 */
	int getNamespaceUri();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DiagnosticInfo#getNamespaceUri <em>Namespace Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Namespace Uri</em>' attribute.
	 * @see #isSetNamespaceUri()
	 * @see #unsetNamespaceUri()
	 * @see #getNamespaceUri()
	 * @generated
	 */
	void setNamespaceUri(int value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.DiagnosticInfo#getNamespaceUri <em>Namespace Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNamespaceUri()
	 * @see #getNamespaceUri()
	 * @see #setNamespaceUri(int)
	 * @generated
	 */
	void unsetNamespaceUri();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.DiagnosticInfo#getNamespaceUri <em>Namespace Uri</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Namespace Uri</em>' attribute is set.
	 * @see #unsetNamespaceUri()
	 * @see #getNamespaceUri()
	 * @see #setNamespaceUri(int)
	 * @generated
	 */
	boolean isSetNamespaceUri();

	/**
	 * Returns the value of the '<em><b>Locale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locale</em>' attribute.
	 * @see #isSetLocale()
	 * @see #unsetLocale()
	 * @see #setLocale(int)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDiagnosticInfo_Locale()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='element' name='Locale' namespace='##targetNamespace'"
	 * @generated
	 */
	int getLocale();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DiagnosticInfo#getLocale <em>Locale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Locale</em>' attribute.
	 * @see #isSetLocale()
	 * @see #unsetLocale()
	 * @see #getLocale()
	 * @generated
	 */
	void setLocale(int value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.DiagnosticInfo#getLocale <em>Locale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLocale()
	 * @see #getLocale()
	 * @see #setLocale(int)
	 * @generated
	 */
	void unsetLocale();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.DiagnosticInfo#getLocale <em>Locale</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Locale</em>' attribute is set.
	 * @see #unsetLocale()
	 * @see #getLocale()
	 * @see #setLocale(int)
	 * @generated
	 */
	boolean isSetLocale();

	/**
	 * Returns the value of the '<em><b>Localized Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Localized Text</em>' attribute.
	 * @see #isSetLocalizedText()
	 * @see #unsetLocalizedText()
	 * @see #setLocalizedText(int)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDiagnosticInfo_LocalizedText()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='element' name='LocalizedText' namespace='##targetNamespace'"
	 * @generated
	 */
	int getLocalizedText();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DiagnosticInfo#getLocalizedText <em>Localized Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Localized Text</em>' attribute.
	 * @see #isSetLocalizedText()
	 * @see #unsetLocalizedText()
	 * @see #getLocalizedText()
	 * @generated
	 */
	void setLocalizedText(int value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.DiagnosticInfo#getLocalizedText <em>Localized Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLocalizedText()
	 * @see #getLocalizedText()
	 * @see #setLocalizedText(int)
	 * @generated
	 */
	void unsetLocalizedText();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.DiagnosticInfo#getLocalizedText <em>Localized Text</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Localized Text</em>' attribute is set.
	 * @see #unsetLocalizedText()
	 * @see #getLocalizedText()
	 * @see #setLocalizedText(int)
	 * @generated
	 */
	boolean isSetLocalizedText();

	/**
	 * Returns the value of the '<em><b>Additional Info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional Info</em>' attribute.
	 * @see #setAdditionalInfo(String)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDiagnosticInfo_AdditionalInfo()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='AdditionalInfo' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAdditionalInfo();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DiagnosticInfo#getAdditionalInfo <em>Additional Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Info</em>' attribute.
	 * @see #getAdditionalInfo()
	 * @generated
	 */
	void setAdditionalInfo(String value);

	/**
	 * Returns the value of the '<em><b>Inner Status Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inner Status Code</em>' containment reference.
	 * @see #setInnerStatusCode(StatusCode)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDiagnosticInfo_InnerStatusCode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='InnerStatusCode' namespace='##targetNamespace'"
	 * @generated
	 */
	StatusCode getInnerStatusCode();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DiagnosticInfo#getInnerStatusCode <em>Inner Status Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inner Status Code</em>' containment reference.
	 * @see #getInnerStatusCode()
	 * @generated
	 */
	void setInnerStatusCode(StatusCode value);

	/**
	 * Returns the value of the '<em><b>Inner Diagnostic Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inner Diagnostic Info</em>' containment reference.
	 * @see #setInnerDiagnosticInfo(DiagnosticInfo)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDiagnosticInfo_InnerDiagnosticInfo()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='InnerDiagnosticInfo' namespace='##targetNamespace'"
	 * @generated
	 */
	DiagnosticInfo getInnerDiagnosticInfo();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DiagnosticInfo#getInnerDiagnosticInfo <em>Inner Diagnostic Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inner Diagnostic Info</em>' containment reference.
	 * @see #getInnerDiagnosticInfo()
	 * @generated
	 */
	void setInnerDiagnosticInfo(DiagnosticInfo value);

} // DiagnosticInfo
