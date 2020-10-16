/**
 */
package org.opcfoundation.ua._2008._02.types;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program Diagnostic2 Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ProgramDiagnostic2DataType#getCreateSessionId <em>Create Session Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ProgramDiagnostic2DataType#getCreateClientName <em>Create Client Name</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ProgramDiagnostic2DataType#getInvocationCreationTime <em>Invocation Creation Time</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ProgramDiagnostic2DataType#getLastTransitionTime <em>Last Transition Time</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ProgramDiagnostic2DataType#getLastMethodCall <em>Last Method Call</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ProgramDiagnostic2DataType#getLastMethodSessionId <em>Last Method Session Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ProgramDiagnostic2DataType#getLastMethodInputArguments <em>Last Method Input Arguments</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ProgramDiagnostic2DataType#getLastMethodOutputArguments <em>Last Method Output Arguments</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ProgramDiagnostic2DataType#getLastMethodInputValues <em>Last Method Input Values</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ProgramDiagnostic2DataType#getLastMethodOutputValues <em>Last Method Output Values</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ProgramDiagnostic2DataType#getLastMethodCallTime <em>Last Method Call Time</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ProgramDiagnostic2DataType#getLastMethodReturnStatus <em>Last Method Return Status</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getProgramDiagnostic2DataType()
 * @model extendedMetaData="name='ProgramDiagnostic2DataType' kind='elementOnly'"
 * @generated
 */
public interface ProgramDiagnostic2DataType extends EObject {
	/**
	 * Returns the value of the '<em><b>Create Session Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Create Session Id</em>' containment reference.
	 * @see #isSetCreateSessionId()
	 * @see #unsetCreateSessionId()
	 * @see #setCreateSessionId(NodeId)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getProgramDiagnostic2DataType_CreateSessionId()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='CreateSessionId' namespace='##targetNamespace'"
	 * @generated
	 */
	NodeId getCreateSessionId();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.ProgramDiagnostic2DataType#getCreateSessionId <em>Create Session Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Create Session Id</em>' containment reference.
	 * @see #isSetCreateSessionId()
	 * @see #unsetCreateSessionId()
	 * @see #getCreateSessionId()
	 * @generated
	 */
	void setCreateSessionId(NodeId value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.ProgramDiagnostic2DataType#getCreateSessionId <em>Create Session Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCreateSessionId()
	 * @see #getCreateSessionId()
	 * @see #setCreateSessionId(NodeId)
	 * @generated
	 */
	void unsetCreateSessionId();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.ProgramDiagnostic2DataType#getCreateSessionId <em>Create Session Id</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Create Session Id</em>' containment reference is set.
	 * @see #unsetCreateSessionId()
	 * @see #getCreateSessionId()
	 * @see #setCreateSessionId(NodeId)
	 * @generated
	 */
	boolean isSetCreateSessionId();

	/**
	 * Returns the value of the '<em><b>Create Client Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Create Client Name</em>' attribute.
	 * @see #isSetCreateClientName()
	 * @see #unsetCreateClientName()
	 * @see #setCreateClientName(String)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getProgramDiagnostic2DataType_CreateClientName()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='CreateClientName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCreateClientName();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.ProgramDiagnostic2DataType#getCreateClientName <em>Create Client Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Create Client Name</em>' attribute.
	 * @see #isSetCreateClientName()
	 * @see #unsetCreateClientName()
	 * @see #getCreateClientName()
	 * @generated
	 */
	void setCreateClientName(String value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.ProgramDiagnostic2DataType#getCreateClientName <em>Create Client Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCreateClientName()
	 * @see #getCreateClientName()
	 * @see #setCreateClientName(String)
	 * @generated
	 */
	void unsetCreateClientName();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.ProgramDiagnostic2DataType#getCreateClientName <em>Create Client Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Create Client Name</em>' attribute is set.
	 * @see #unsetCreateClientName()
	 * @see #getCreateClientName()
	 * @see #setCreateClientName(String)
	 * @generated
	 */
	boolean isSetCreateClientName();

	/**
	 * Returns the value of the '<em><b>Invocation Creation Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invocation Creation Time</em>' attribute.
	 * @see #setInvocationCreationTime(XMLGregorianCalendar)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getProgramDiagnostic2DataType_InvocationCreationTime()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='InvocationCreationTime' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getInvocationCreationTime();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.ProgramDiagnostic2DataType#getInvocationCreationTime <em>Invocation Creation Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invocation Creation Time</em>' attribute.
	 * @see #getInvocationCreationTime()
	 * @generated
	 */
	void setInvocationCreationTime(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Last Transition Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Transition Time</em>' attribute.
	 * @see #setLastTransitionTime(XMLGregorianCalendar)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getProgramDiagnostic2DataType_LastTransitionTime()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='LastTransitionTime' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getLastTransitionTime();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.ProgramDiagnostic2DataType#getLastTransitionTime <em>Last Transition Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Transition Time</em>' attribute.
	 * @see #getLastTransitionTime()
	 * @generated
	 */
	void setLastTransitionTime(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Last Method Call</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Method Call</em>' attribute.
	 * @see #isSetLastMethodCall()
	 * @see #unsetLastMethodCall()
	 * @see #setLastMethodCall(String)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getProgramDiagnostic2DataType_LastMethodCall()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='LastMethodCall' namespace='##targetNamespace'"
	 * @generated
	 */
	String getLastMethodCall();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.ProgramDiagnostic2DataType#getLastMethodCall <em>Last Method Call</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Method Call</em>' attribute.
	 * @see #isSetLastMethodCall()
	 * @see #unsetLastMethodCall()
	 * @see #getLastMethodCall()
	 * @generated
	 */
	void setLastMethodCall(String value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.ProgramDiagnostic2DataType#getLastMethodCall <em>Last Method Call</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLastMethodCall()
	 * @see #getLastMethodCall()
	 * @see #setLastMethodCall(String)
	 * @generated
	 */
	void unsetLastMethodCall();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.ProgramDiagnostic2DataType#getLastMethodCall <em>Last Method Call</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Last Method Call</em>' attribute is set.
	 * @see #unsetLastMethodCall()
	 * @see #getLastMethodCall()
	 * @see #setLastMethodCall(String)
	 * @generated
	 */
	boolean isSetLastMethodCall();

	/**
	 * Returns the value of the '<em><b>Last Method Session Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Method Session Id</em>' containment reference.
	 * @see #isSetLastMethodSessionId()
	 * @see #unsetLastMethodSessionId()
	 * @see #setLastMethodSessionId(NodeId)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getProgramDiagnostic2DataType_LastMethodSessionId()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='LastMethodSessionId' namespace='##targetNamespace'"
	 * @generated
	 */
	NodeId getLastMethodSessionId();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.ProgramDiagnostic2DataType#getLastMethodSessionId <em>Last Method Session Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Method Session Id</em>' containment reference.
	 * @see #isSetLastMethodSessionId()
	 * @see #unsetLastMethodSessionId()
	 * @see #getLastMethodSessionId()
	 * @generated
	 */
	void setLastMethodSessionId(NodeId value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.ProgramDiagnostic2DataType#getLastMethodSessionId <em>Last Method Session Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLastMethodSessionId()
	 * @see #getLastMethodSessionId()
	 * @see #setLastMethodSessionId(NodeId)
	 * @generated
	 */
	void unsetLastMethodSessionId();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.ProgramDiagnostic2DataType#getLastMethodSessionId <em>Last Method Session Id</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Last Method Session Id</em>' containment reference is set.
	 * @see #unsetLastMethodSessionId()
	 * @see #getLastMethodSessionId()
	 * @see #setLastMethodSessionId(NodeId)
	 * @generated
	 */
	boolean isSetLastMethodSessionId();

	/**
	 * Returns the value of the '<em><b>Last Method Input Arguments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Method Input Arguments</em>' containment reference.
	 * @see #isSetLastMethodInputArguments()
	 * @see #unsetLastMethodInputArguments()
	 * @see #setLastMethodInputArguments(ListOfArgument)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getProgramDiagnostic2DataType_LastMethodInputArguments()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='LastMethodInputArguments' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfArgument getLastMethodInputArguments();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.ProgramDiagnostic2DataType#getLastMethodInputArguments <em>Last Method Input Arguments</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Method Input Arguments</em>' containment reference.
	 * @see #isSetLastMethodInputArguments()
	 * @see #unsetLastMethodInputArguments()
	 * @see #getLastMethodInputArguments()
	 * @generated
	 */
	void setLastMethodInputArguments(ListOfArgument value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.ProgramDiagnostic2DataType#getLastMethodInputArguments <em>Last Method Input Arguments</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLastMethodInputArguments()
	 * @see #getLastMethodInputArguments()
	 * @see #setLastMethodInputArguments(ListOfArgument)
	 * @generated
	 */
	void unsetLastMethodInputArguments();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.ProgramDiagnostic2DataType#getLastMethodInputArguments <em>Last Method Input Arguments</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Last Method Input Arguments</em>' containment reference is set.
	 * @see #unsetLastMethodInputArguments()
	 * @see #getLastMethodInputArguments()
	 * @see #setLastMethodInputArguments(ListOfArgument)
	 * @generated
	 */
	boolean isSetLastMethodInputArguments();

	/**
	 * Returns the value of the '<em><b>Last Method Output Arguments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Method Output Arguments</em>' containment reference.
	 * @see #isSetLastMethodOutputArguments()
	 * @see #unsetLastMethodOutputArguments()
	 * @see #setLastMethodOutputArguments(ListOfArgument)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getProgramDiagnostic2DataType_LastMethodOutputArguments()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='LastMethodOutputArguments' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfArgument getLastMethodOutputArguments();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.ProgramDiagnostic2DataType#getLastMethodOutputArguments <em>Last Method Output Arguments</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Method Output Arguments</em>' containment reference.
	 * @see #isSetLastMethodOutputArguments()
	 * @see #unsetLastMethodOutputArguments()
	 * @see #getLastMethodOutputArguments()
	 * @generated
	 */
	void setLastMethodOutputArguments(ListOfArgument value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.ProgramDiagnostic2DataType#getLastMethodOutputArguments <em>Last Method Output Arguments</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLastMethodOutputArguments()
	 * @see #getLastMethodOutputArguments()
	 * @see #setLastMethodOutputArguments(ListOfArgument)
	 * @generated
	 */
	void unsetLastMethodOutputArguments();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.ProgramDiagnostic2DataType#getLastMethodOutputArguments <em>Last Method Output Arguments</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Last Method Output Arguments</em>' containment reference is set.
	 * @see #unsetLastMethodOutputArguments()
	 * @see #getLastMethodOutputArguments()
	 * @see #setLastMethodOutputArguments(ListOfArgument)
	 * @generated
	 */
	boolean isSetLastMethodOutputArguments();

	/**
	 * Returns the value of the '<em><b>Last Method Input Values</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Method Input Values</em>' containment reference.
	 * @see #isSetLastMethodInputValues()
	 * @see #unsetLastMethodInputValues()
	 * @see #setLastMethodInputValues(ListOfVariant)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getProgramDiagnostic2DataType_LastMethodInputValues()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='LastMethodInputValues' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfVariant getLastMethodInputValues();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.ProgramDiagnostic2DataType#getLastMethodInputValues <em>Last Method Input Values</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Method Input Values</em>' containment reference.
	 * @see #isSetLastMethodInputValues()
	 * @see #unsetLastMethodInputValues()
	 * @see #getLastMethodInputValues()
	 * @generated
	 */
	void setLastMethodInputValues(ListOfVariant value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.ProgramDiagnostic2DataType#getLastMethodInputValues <em>Last Method Input Values</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLastMethodInputValues()
	 * @see #getLastMethodInputValues()
	 * @see #setLastMethodInputValues(ListOfVariant)
	 * @generated
	 */
	void unsetLastMethodInputValues();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.ProgramDiagnostic2DataType#getLastMethodInputValues <em>Last Method Input Values</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Last Method Input Values</em>' containment reference is set.
	 * @see #unsetLastMethodInputValues()
	 * @see #getLastMethodInputValues()
	 * @see #setLastMethodInputValues(ListOfVariant)
	 * @generated
	 */
	boolean isSetLastMethodInputValues();

	/**
	 * Returns the value of the '<em><b>Last Method Output Values</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Method Output Values</em>' containment reference.
	 * @see #isSetLastMethodOutputValues()
	 * @see #unsetLastMethodOutputValues()
	 * @see #setLastMethodOutputValues(ListOfVariant)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getProgramDiagnostic2DataType_LastMethodOutputValues()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='LastMethodOutputValues' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfVariant getLastMethodOutputValues();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.ProgramDiagnostic2DataType#getLastMethodOutputValues <em>Last Method Output Values</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Method Output Values</em>' containment reference.
	 * @see #isSetLastMethodOutputValues()
	 * @see #unsetLastMethodOutputValues()
	 * @see #getLastMethodOutputValues()
	 * @generated
	 */
	void setLastMethodOutputValues(ListOfVariant value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.ProgramDiagnostic2DataType#getLastMethodOutputValues <em>Last Method Output Values</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLastMethodOutputValues()
	 * @see #getLastMethodOutputValues()
	 * @see #setLastMethodOutputValues(ListOfVariant)
	 * @generated
	 */
	void unsetLastMethodOutputValues();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.ProgramDiagnostic2DataType#getLastMethodOutputValues <em>Last Method Output Values</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Last Method Output Values</em>' containment reference is set.
	 * @see #unsetLastMethodOutputValues()
	 * @see #getLastMethodOutputValues()
	 * @see #setLastMethodOutputValues(ListOfVariant)
	 * @generated
	 */
	boolean isSetLastMethodOutputValues();

	/**
	 * Returns the value of the '<em><b>Last Method Call Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Method Call Time</em>' attribute.
	 * @see #setLastMethodCallTime(XMLGregorianCalendar)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getProgramDiagnostic2DataType_LastMethodCallTime()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='LastMethodCallTime' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getLastMethodCallTime();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.ProgramDiagnostic2DataType#getLastMethodCallTime <em>Last Method Call Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Method Call Time</em>' attribute.
	 * @see #getLastMethodCallTime()
	 * @generated
	 */
	void setLastMethodCallTime(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Last Method Return Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Method Return Status</em>' containment reference.
	 * @see #isSetLastMethodReturnStatus()
	 * @see #unsetLastMethodReturnStatus()
	 * @see #setLastMethodReturnStatus(StatusResult)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getProgramDiagnostic2DataType_LastMethodReturnStatus()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='LastMethodReturnStatus' namespace='##targetNamespace'"
	 * @generated
	 */
	StatusResult getLastMethodReturnStatus();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.ProgramDiagnostic2DataType#getLastMethodReturnStatus <em>Last Method Return Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Method Return Status</em>' containment reference.
	 * @see #isSetLastMethodReturnStatus()
	 * @see #unsetLastMethodReturnStatus()
	 * @see #getLastMethodReturnStatus()
	 * @generated
	 */
	void setLastMethodReturnStatus(StatusResult value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.ProgramDiagnostic2DataType#getLastMethodReturnStatus <em>Last Method Return Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLastMethodReturnStatus()
	 * @see #getLastMethodReturnStatus()
	 * @see #setLastMethodReturnStatus(StatusResult)
	 * @generated
	 */
	void unsetLastMethodReturnStatus();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.ProgramDiagnostic2DataType#getLastMethodReturnStatus <em>Last Method Return Status</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Last Method Return Status</em>' containment reference is set.
	 * @see #unsetLastMethodReturnStatus()
	 * @see #getLastMethodReturnStatus()
	 * @see #setLastMethodReturnStatus(StatusResult)
	 * @generated
	 */
	boolean isSetLastMethodReturnStatus();

} // ProgramDiagnostic2DataType
