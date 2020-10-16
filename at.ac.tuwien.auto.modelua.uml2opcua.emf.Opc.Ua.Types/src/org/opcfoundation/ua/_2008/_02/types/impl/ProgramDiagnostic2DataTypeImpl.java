/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.opcfoundation.ua._2008._02.types.ListOfArgument;
import org.opcfoundation.ua._2008._02.types.ListOfVariant;
import org.opcfoundation.ua._2008._02.types.NodeId;
import org.opcfoundation.ua._2008._02.types.ProgramDiagnostic2DataType;
import org.opcfoundation.ua._2008._02.types.StatusResult;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Program Diagnostic2 Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ProgramDiagnostic2DataTypeImpl#getCreateSessionId <em>Create Session Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ProgramDiagnostic2DataTypeImpl#getCreateClientName <em>Create Client Name</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ProgramDiagnostic2DataTypeImpl#getInvocationCreationTime <em>Invocation Creation Time</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ProgramDiagnostic2DataTypeImpl#getLastTransitionTime <em>Last Transition Time</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ProgramDiagnostic2DataTypeImpl#getLastMethodCall <em>Last Method Call</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ProgramDiagnostic2DataTypeImpl#getLastMethodSessionId <em>Last Method Session Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ProgramDiagnostic2DataTypeImpl#getLastMethodInputArguments <em>Last Method Input Arguments</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ProgramDiagnostic2DataTypeImpl#getLastMethodOutputArguments <em>Last Method Output Arguments</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ProgramDiagnostic2DataTypeImpl#getLastMethodInputValues <em>Last Method Input Values</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ProgramDiagnostic2DataTypeImpl#getLastMethodOutputValues <em>Last Method Output Values</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ProgramDiagnostic2DataTypeImpl#getLastMethodCallTime <em>Last Method Call Time</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ProgramDiagnostic2DataTypeImpl#getLastMethodReturnStatus <em>Last Method Return Status</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProgramDiagnostic2DataTypeImpl extends MinimalEObjectImpl.Container implements ProgramDiagnostic2DataType {
	/**
	 * The cached value of the '{@link #getCreateSessionId() <em>Create Session Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreateSessionId()
	 * @generated
	 * @ordered
	 */
	protected NodeId createSessionId;

	/**
	 * This is true if the Create Session Id containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean createSessionIdESet;

	/**
	 * The default value of the '{@link #getCreateClientName() <em>Create Client Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreateClientName()
	 * @generated
	 * @ordered
	 */
	protected static final String CREATE_CLIENT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreateClientName() <em>Create Client Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreateClientName()
	 * @generated
	 * @ordered
	 */
	protected String createClientName = CREATE_CLIENT_NAME_EDEFAULT;

	/**
	 * This is true if the Create Client Name attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean createClientNameESet;

	/**
	 * The default value of the '{@link #getInvocationCreationTime() <em>Invocation Creation Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvocationCreationTime()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar INVOCATION_CREATION_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInvocationCreationTime() <em>Invocation Creation Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvocationCreationTime()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar invocationCreationTime = INVOCATION_CREATION_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastTransitionTime() <em>Last Transition Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastTransitionTime()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar LAST_TRANSITION_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastTransitionTime() <em>Last Transition Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastTransitionTime()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar lastTransitionTime = LAST_TRANSITION_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastMethodCall() <em>Last Method Call</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastMethodCall()
	 * @generated
	 * @ordered
	 */
	protected static final String LAST_METHOD_CALL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastMethodCall() <em>Last Method Call</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastMethodCall()
	 * @generated
	 * @ordered
	 */
	protected String lastMethodCall = LAST_METHOD_CALL_EDEFAULT;

	/**
	 * This is true if the Last Method Call attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean lastMethodCallESet;

	/**
	 * The cached value of the '{@link #getLastMethodSessionId() <em>Last Method Session Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastMethodSessionId()
	 * @generated
	 * @ordered
	 */
	protected NodeId lastMethodSessionId;

	/**
	 * This is true if the Last Method Session Id containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean lastMethodSessionIdESet;

	/**
	 * The cached value of the '{@link #getLastMethodInputArguments() <em>Last Method Input Arguments</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastMethodInputArguments()
	 * @generated
	 * @ordered
	 */
	protected ListOfArgument lastMethodInputArguments;

	/**
	 * This is true if the Last Method Input Arguments containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean lastMethodInputArgumentsESet;

	/**
	 * The cached value of the '{@link #getLastMethodOutputArguments() <em>Last Method Output Arguments</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastMethodOutputArguments()
	 * @generated
	 * @ordered
	 */
	protected ListOfArgument lastMethodOutputArguments;

	/**
	 * This is true if the Last Method Output Arguments containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean lastMethodOutputArgumentsESet;

	/**
	 * The cached value of the '{@link #getLastMethodInputValues() <em>Last Method Input Values</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastMethodInputValues()
	 * @generated
	 * @ordered
	 */
	protected ListOfVariant lastMethodInputValues;

	/**
	 * This is true if the Last Method Input Values containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean lastMethodInputValuesESet;

	/**
	 * The cached value of the '{@link #getLastMethodOutputValues() <em>Last Method Output Values</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastMethodOutputValues()
	 * @generated
	 * @ordered
	 */
	protected ListOfVariant lastMethodOutputValues;

	/**
	 * This is true if the Last Method Output Values containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean lastMethodOutputValuesESet;

	/**
	 * The default value of the '{@link #getLastMethodCallTime() <em>Last Method Call Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastMethodCallTime()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar LAST_METHOD_CALL_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastMethodCallTime() <em>Last Method Call Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastMethodCallTime()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar lastMethodCallTime = LAST_METHOD_CALL_TIME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLastMethodReturnStatus() <em>Last Method Return Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastMethodReturnStatus()
	 * @generated
	 * @ordered
	 */
	protected StatusResult lastMethodReturnStatus;

	/**
	 * This is true if the Last Method Return Status containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean lastMethodReturnStatusESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgramDiagnostic2DataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getProgramDiagnostic2DataType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeId getCreateSessionId() {
		return createSessionId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCreateSessionId(NodeId newCreateSessionId, NotificationChain msgs) {
		NodeId oldCreateSessionId = createSessionId;
		createSessionId = newCreateSessionId;
		boolean oldCreateSessionIdESet = createSessionIdESet;
		createSessionIdESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.PROGRAM_DIAGNOSTIC2_DATA_TYPE__CREATE_SESSION_ID, oldCreateSessionId, newCreateSessionId, !oldCreateSessionIdESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreateSessionId(NodeId newCreateSessionId) {
		if (newCreateSessionId != createSessionId) {
			NotificationChain msgs = null;
			if (createSessionId != null)
				msgs = ((InternalEObject)createSessionId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.PROGRAM_DIAGNOSTIC2_DATA_TYPE__CREATE_SESSION_ID, null, msgs);
			if (newCreateSessionId != null)
				msgs = ((InternalEObject)newCreateSessionId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.PROGRAM_DIAGNOSTIC2_DATA_TYPE__CREATE_SESSION_ID, null, msgs);
			msgs = basicSetCreateSessionId(newCreateSessionId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldCreateSessionIdESet = createSessionIdESet;
			createSessionIdESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.PROGRAM_DIAGNOSTIC2_DATA_TYPE__CREATE_SESSION_ID, newCreateSessionId, newCreateSessionId, !oldCreateSessionIdESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetCreateSessionId(NotificationChain msgs) {
		NodeId oldCreateSessionId = createSessionId;
		createSessionId = null;
		boolean oldCreateSessionIdESet = createSessionIdESet;
		createSessionIdESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.PROGRAM_DIAGNOSTIC2_DATA_TYPE__CREATE_SESSION_ID, oldCreateSessionId, null, oldCreateSessionIdESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCreateSessionId() {
		if (createSessionId != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)createSessionId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.PROGRAM_DIAGNOSTIC2_DATA_TYPE__CREATE_SESSION_ID, null, msgs);
			msgs = basicUnsetCreateSessionId(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldCreateSessionIdESet = createSessionIdESet;
			createSessionIdESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.PROGRAM_DIAGNOSTIC2_DATA_TYPE__CREATE_SESSION_ID, null, null, oldCreateSessionIdESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCreateSessionId() {
		return createSessionIdESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCreateClientName() {
		return createClientName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreateClientName(String newCreateClientName) {
		String oldCreateClientName = createClientName;
		createClientName = newCreateClientName;
		boolean oldCreateClientNameESet = createClientNameESet;
		createClientNameESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.PROGRAM_DIAGNOSTIC2_DATA_TYPE__CREATE_CLIENT_NAME, oldCreateClientName, createClientName, !oldCreateClientNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCreateClientName() {
		String oldCreateClientName = createClientName;
		boolean oldCreateClientNameESet = createClientNameESet;
		createClientName = CREATE_CLIENT_NAME_EDEFAULT;
		createClientNameESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.PROGRAM_DIAGNOSTIC2_DATA_TYPE__CREATE_CLIENT_NAME, oldCreateClientName, CREATE_CLIENT_NAME_EDEFAULT, oldCreateClientNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCreateClientName() {
		return createClientNameESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getInvocationCreationTime() {
		return invocationCreationTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInvocationCreationTime(XMLGregorianCalendar newInvocationCreationTime) {
		XMLGregorianCalendar oldInvocationCreationTime = invocationCreationTime;
		invocationCreationTime = newInvocationCreationTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.PROGRAM_DIAGNOSTIC2_DATA_TYPE__INVOCATION_CREATION_TIME, oldInvocationCreationTime, invocationCreationTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getLastTransitionTime() {
		return lastTransitionTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastTransitionTime(XMLGregorianCalendar newLastTransitionTime) {
		XMLGregorianCalendar oldLastTransitionTime = lastTransitionTime;
		lastTransitionTime = newLastTransitionTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.PROGRAM_DIAGNOSTIC2_DATA_TYPE__LAST_TRANSITION_TIME, oldLastTransitionTime, lastTransitionTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLastMethodCall() {
		return lastMethodCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastMethodCall(String newLastMethodCall) {
		String oldLastMethodCall = lastMethodCall;
		lastMethodCall = newLastMethodCall;
		boolean oldLastMethodCallESet = lastMethodCallESet;
		lastMethodCallESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.PROGRAM_DIAGNOSTIC2_DATA_TYPE__LAST_METHOD_CALL, oldLastMethodCall, lastMethodCall, !oldLastMethodCallESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLastMethodCall() {
		String oldLastMethodCall = lastMethodCall;
		boolean oldLastMethodCallESet = lastMethodCallESet;
		lastMethodCall = LAST_METHOD_CALL_EDEFAULT;
		lastMethodCallESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.PROGRAM_DIAGNOSTIC2_DATA_TYPE__LAST_METHOD_CALL, oldLastMethodCall, LAST_METHOD_CALL_EDEFAULT, oldLastMethodCallESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLastMethodCall() {
		return lastMethodCallESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeId getLastMethodSessionId() {
		return lastMethodSessionId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLastMethodSessionId(NodeId newLastMethodSessionId, NotificationChain msgs) {
		NodeId oldLastMethodSessionId = lastMethodSessionId;
		lastMethodSessionId = newLastMethodSessionId;
		boolean oldLastMethodSessionIdESet = lastMethodSessionIdESet;
		lastMethodSessionIdESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.PROGRAM_DIAGNOSTIC2_DATA_TYPE__LAST_METHOD_SESSION_ID, oldLastMethodSessionId, newLastMethodSessionId, !oldLastMethodSessionIdESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastMethodSessionId(NodeId newLastMethodSessionId) {
		if (newLastMethodSessionId != lastMethodSessionId) {
			NotificationChain msgs = null;
			if (lastMethodSessionId != null)
				msgs = ((InternalEObject)lastMethodSessionId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.PROGRAM_DIAGNOSTIC2_DATA_TYPE__LAST_METHOD_SESSION_ID, null, msgs);
			if (newLastMethodSessionId != null)
				msgs = ((InternalEObject)newLastMethodSessionId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.PROGRAM_DIAGNOSTIC2_DATA_TYPE__LAST_METHOD_SESSION_ID, null, msgs);
			msgs = basicSetLastMethodSessionId(newLastMethodSessionId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldLastMethodSessionIdESet = lastMethodSessionIdESet;
			lastMethodSessionIdESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.PROGRAM_DIAGNOSTIC2_DATA_TYPE__LAST_METHOD_SESSION_ID, newLastMethodSessionId, newLastMethodSessionId, !oldLastMethodSessionIdESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetLastMethodSessionId(NotificationChain msgs) {
		NodeId oldLastMethodSessionId = lastMethodSessionId;
		lastMethodSessionId = null;
		boolean oldLastMethodSessionIdESet = lastMethodSessionIdESet;
		lastMethodSessionIdESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.PROGRAM_DIAGNOSTIC2_DATA_TYPE__LAST_METHOD_SESSION_ID, oldLastMethodSessionId, null, oldLastMethodSessionIdESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLastMethodSessionId() {
		if (lastMethodSessionId != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)lastMethodSessionId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.PROGRAM_DIAGNOSTIC2_DATA_TYPE__LAST_METHOD_SESSION_ID, null, msgs);
			msgs = basicUnsetLastMethodSessionId(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldLastMethodSessionIdESet = lastMethodSessionIdESet;
			lastMethodSessionIdESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.PROGRAM_DIAGNOSTIC2_DATA_TYPE__LAST_METHOD_SESSION_ID, null, null, oldLastMethodSessionIdESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLastMethodSessionId() {
		return lastMethodSessionIdESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfArgument getLastMethodInputArguments() {
		return lastMethodInputArguments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLastMethodInputArguments(ListOfArgument newLastMethodInputArguments, NotificationChain msgs) {
		ListOfArgument oldLastMethodInputArguments = lastMethodInputArguments;
		lastMethodInputArguments = newLastMethodInputArguments;
		boolean oldLastMethodInputArgumentsESet = lastMethodInputArgumentsESet;
		lastMethodInputArgumentsESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.PROGRAM_DIAGNOSTIC2_DATA_TYPE__LAST_METHOD_INPUT_ARGUMENTS, oldLastMethodInputArguments, newLastMethodInputArguments, !oldLastMethodInputArgumentsESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastMethodInputArguments(ListOfArgument newLastMethodInputArguments) {
		if (newLastMethodInputArguments != lastMethodInputArguments) {
			NotificationChain msgs = null;
			if (lastMethodInputArguments != null)
				msgs = ((InternalEObject)lastMethodInputArguments).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.PROGRAM_DIAGNOSTIC2_DATA_TYPE__LAST_METHOD_INPUT_ARGUMENTS, null, msgs);
			if (newLastMethodInputArguments != null)
				msgs = ((InternalEObject)newLastMethodInputArguments).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.PROGRAM_DIAGNOSTIC2_DATA_TYPE__LAST_METHOD_INPUT_ARGUMENTS, null, msgs);
			msgs = basicSetLastMethodInputArguments(newLastMethodInputArguments, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldLastMethodInputArgumentsESet = lastMethodInputArgumentsESet;
			lastMethodInputArgumentsESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.PROGRAM_DIAGNOSTIC2_DATA_TYPE__LAST_METHOD_INPUT_ARGUMENTS, newLastMethodInputArguments, newLastMethodInputArguments, !oldLastMethodInputArgumentsESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetLastMethodInputArguments(NotificationChain msgs) {
		ListOfArgument oldLastMethodInputArguments = lastMethodInputArguments;
		lastMethodInputArguments = null;
		boolean oldLastMethodInputArgumentsESet = lastMethodInputArgumentsESet;
		lastMethodInputArgumentsESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.PROGRAM_DIAGNOSTIC2_DATA_TYPE__LAST_METHOD_INPUT_ARGUMENTS, oldLastMethodInputArguments, null, oldLastMethodInputArgumentsESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLastMethodInputArguments() {
		if (lastMethodInputArguments != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)lastMethodInputArguments).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.PROGRAM_DIAGNOSTIC2_DATA_TYPE__LAST_METHOD_INPUT_ARGUMENTS, null, msgs);
			msgs = basicUnsetLastMethodInputArguments(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldLastMethodInputArgumentsESet = lastMethodInputArgumentsESet;
			lastMethodInputArgumentsESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.PROGRAM_DIAGNOSTIC2_DATA_TYPE__LAST_METHOD_INPUT_ARGUMENTS, null, null, oldLastMethodInputArgumentsESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLastMethodInputArguments() {
		return lastMethodInputArgumentsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfArgument getLastMethodOutputArguments() {
		return lastMethodOutputArguments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLastMethodOutputArguments(ListOfArgument newLastMethodOutputArguments, NotificationChain msgs) {
		ListOfArgument oldLastMethodOutputArguments = lastMethodOutputArguments;
		lastMethodOutputArguments = newLastMethodOutputArguments;
		boolean oldLastMethodOutputArgumentsESet = lastMethodOutputArgumentsESet;
		lastMethodOutputArgumentsESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.PROGRAM_DIAGNOSTIC2_DATA_TYPE__LAST_METHOD_OUTPUT_ARGUMENTS, oldLastMethodOutputArguments, newLastMethodOutputArguments, !oldLastMethodOutputArgumentsESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastMethodOutputArguments(ListOfArgument newLastMethodOutputArguments) {
		if (newLastMethodOutputArguments != lastMethodOutputArguments) {
			NotificationChain msgs = null;
			if (lastMethodOutputArguments != null)
				msgs = ((InternalEObject)lastMethodOutputArguments).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.PROGRAM_DIAGNOSTIC2_DATA_TYPE__LAST_METHOD_OUTPUT_ARGUMENTS, null, msgs);
			if (newLastMethodOutputArguments != null)
				msgs = ((InternalEObject)newLastMethodOutputArguments).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.PROGRAM_DIAGNOSTIC2_DATA_TYPE__LAST_METHOD_OUTPUT_ARGUMENTS, null, msgs);
			msgs = basicSetLastMethodOutputArguments(newLastMethodOutputArguments, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldLastMethodOutputArgumentsESet = lastMethodOutputArgumentsESet;
			lastMethodOutputArgumentsESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.PROGRAM_DIAGNOSTIC2_DATA_TYPE__LAST_METHOD_OUTPUT_ARGUMENTS, newLastMethodOutputArguments, newLastMethodOutputArguments, !oldLastMethodOutputArgumentsESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetLastMethodOutputArguments(NotificationChain msgs) {
		ListOfArgument oldLastMethodOutputArguments = lastMethodOutputArguments;
		lastMethodOutputArguments = null;
		boolean oldLastMethodOutputArgumentsESet = lastMethodOutputArgumentsESet;
		lastMethodOutputArgumentsESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.PROGRAM_DIAGNOSTIC2_DATA_TYPE__LAST_METHOD_OUTPUT_ARGUMENTS, oldLastMethodOutputArguments, null, oldLastMethodOutputArgumentsESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLastMethodOutputArguments() {
		if (lastMethodOutputArguments != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)lastMethodOutputArguments).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.PROGRAM_DIAGNOSTIC2_DATA_TYPE__LAST_METHOD_OUTPUT_ARGUMENTS, null, msgs);
			msgs = basicUnsetLastMethodOutputArguments(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldLastMethodOutputArgumentsESet = lastMethodOutputArgumentsESet;
			lastMethodOutputArgumentsESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.PROGRAM_DIAGNOSTIC2_DATA_TYPE__LAST_METHOD_OUTPUT_ARGUMENTS, null, null, oldLastMethodOutputArgumentsESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLastMethodOutputArguments() {
		return lastMethodOutputArgumentsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfVariant getLastMethodInputValues() {
		return lastMethodInputValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLastMethodInputValues(ListOfVariant newLastMethodInputValues, NotificationChain msgs) {
		ListOfVariant oldLastMethodInputValues = lastMethodInputValues;
		lastMethodInputValues = newLastMethodInputValues;
		boolean oldLastMethodInputValuesESet = lastMethodInputValuesESet;
		lastMethodInputValuesESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.PROGRAM_DIAGNOSTIC2_DATA_TYPE__LAST_METHOD_INPUT_VALUES, oldLastMethodInputValues, newLastMethodInputValues, !oldLastMethodInputValuesESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastMethodInputValues(ListOfVariant newLastMethodInputValues) {
		if (newLastMethodInputValues != lastMethodInputValues) {
			NotificationChain msgs = null;
			if (lastMethodInputValues != null)
				msgs = ((InternalEObject)lastMethodInputValues).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.PROGRAM_DIAGNOSTIC2_DATA_TYPE__LAST_METHOD_INPUT_VALUES, null, msgs);
			if (newLastMethodInputValues != null)
				msgs = ((InternalEObject)newLastMethodInputValues).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.PROGRAM_DIAGNOSTIC2_DATA_TYPE__LAST_METHOD_INPUT_VALUES, null, msgs);
			msgs = basicSetLastMethodInputValues(newLastMethodInputValues, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldLastMethodInputValuesESet = lastMethodInputValuesESet;
			lastMethodInputValuesESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.PROGRAM_DIAGNOSTIC2_DATA_TYPE__LAST_METHOD_INPUT_VALUES, newLastMethodInputValues, newLastMethodInputValues, !oldLastMethodInputValuesESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetLastMethodInputValues(NotificationChain msgs) {
		ListOfVariant oldLastMethodInputValues = lastMethodInputValues;
		lastMethodInputValues = null;
		boolean oldLastMethodInputValuesESet = lastMethodInputValuesESet;
		lastMethodInputValuesESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.PROGRAM_DIAGNOSTIC2_DATA_TYPE__LAST_METHOD_INPUT_VALUES, oldLastMethodInputValues, null, oldLastMethodInputValuesESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLastMethodInputValues() {
		if (lastMethodInputValues != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)lastMethodInputValues).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.PROGRAM_DIAGNOSTIC2_DATA_TYPE__LAST_METHOD_INPUT_VALUES, null, msgs);
			msgs = basicUnsetLastMethodInputValues(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldLastMethodInputValuesESet = lastMethodInputValuesESet;
			lastMethodInputValuesESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.PROGRAM_DIAGNOSTIC2_DATA_TYPE__LAST_METHOD_INPUT_VALUES, null, null, oldLastMethodInputValuesESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLastMethodInputValues() {
		return lastMethodInputValuesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfVariant getLastMethodOutputValues() {
		return lastMethodOutputValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLastMethodOutputValues(ListOfVariant newLastMethodOutputValues, NotificationChain msgs) {
		ListOfVariant oldLastMethodOutputValues = lastMethodOutputValues;
		lastMethodOutputValues = newLastMethodOutputValues;
		boolean oldLastMethodOutputValuesESet = lastMethodOutputValuesESet;
		lastMethodOutputValuesESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.PROGRAM_DIAGNOSTIC2_DATA_TYPE__LAST_METHOD_OUTPUT_VALUES, oldLastMethodOutputValues, newLastMethodOutputValues, !oldLastMethodOutputValuesESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastMethodOutputValues(ListOfVariant newLastMethodOutputValues) {
		if (newLastMethodOutputValues != lastMethodOutputValues) {
			NotificationChain msgs = null;
			if (lastMethodOutputValues != null)
				msgs = ((InternalEObject)lastMethodOutputValues).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.PROGRAM_DIAGNOSTIC2_DATA_TYPE__LAST_METHOD_OUTPUT_VALUES, null, msgs);
			if (newLastMethodOutputValues != null)
				msgs = ((InternalEObject)newLastMethodOutputValues).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.PROGRAM_DIAGNOSTIC2_DATA_TYPE__LAST_METHOD_OUTPUT_VALUES, null, msgs);
			msgs = basicSetLastMethodOutputValues(newLastMethodOutputValues, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldLastMethodOutputValuesESet = lastMethodOutputValuesESet;
			lastMethodOutputValuesESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.PROGRAM_DIAGNOSTIC2_DATA_TYPE__LAST_METHOD_OUTPUT_VALUES, newLastMethodOutputValues, newLastMethodOutputValues, !oldLastMethodOutputValuesESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetLastMethodOutputValues(NotificationChain msgs) {
		ListOfVariant oldLastMethodOutputValues = lastMethodOutputValues;
		lastMethodOutputValues = null;
		boolean oldLastMethodOutputValuesESet = lastMethodOutputValuesESet;
		lastMethodOutputValuesESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.PROGRAM_DIAGNOSTIC2_DATA_TYPE__LAST_METHOD_OUTPUT_VALUES, oldLastMethodOutputValues, null, oldLastMethodOutputValuesESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLastMethodOutputValues() {
		if (lastMethodOutputValues != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)lastMethodOutputValues).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.PROGRAM_DIAGNOSTIC2_DATA_TYPE__LAST_METHOD_OUTPUT_VALUES, null, msgs);
			msgs = basicUnsetLastMethodOutputValues(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldLastMethodOutputValuesESet = lastMethodOutputValuesESet;
			lastMethodOutputValuesESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.PROGRAM_DIAGNOSTIC2_DATA_TYPE__LAST_METHOD_OUTPUT_VALUES, null, null, oldLastMethodOutputValuesESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLastMethodOutputValues() {
		return lastMethodOutputValuesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getLastMethodCallTime() {
		return lastMethodCallTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastMethodCallTime(XMLGregorianCalendar newLastMethodCallTime) {
		XMLGregorianCalendar oldLastMethodCallTime = lastMethodCallTime;
		lastMethodCallTime = newLastMethodCallTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.PROGRAM_DIAGNOSTIC2_DATA_TYPE__LAST_METHOD_CALL_TIME, oldLastMethodCallTime, lastMethodCallTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatusResult getLastMethodReturnStatus() {
		return lastMethodReturnStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLastMethodReturnStatus(StatusResult newLastMethodReturnStatus, NotificationChain msgs) {
		StatusResult oldLastMethodReturnStatus = lastMethodReturnStatus;
		lastMethodReturnStatus = newLastMethodReturnStatus;
		boolean oldLastMethodReturnStatusESet = lastMethodReturnStatusESet;
		lastMethodReturnStatusESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.PROGRAM_DIAGNOSTIC2_DATA_TYPE__LAST_METHOD_RETURN_STATUS, oldLastMethodReturnStatus, newLastMethodReturnStatus, !oldLastMethodReturnStatusESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastMethodReturnStatus(StatusResult newLastMethodReturnStatus) {
		if (newLastMethodReturnStatus != lastMethodReturnStatus) {
			NotificationChain msgs = null;
			if (lastMethodReturnStatus != null)
				msgs = ((InternalEObject)lastMethodReturnStatus).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.PROGRAM_DIAGNOSTIC2_DATA_TYPE__LAST_METHOD_RETURN_STATUS, null, msgs);
			if (newLastMethodReturnStatus != null)
				msgs = ((InternalEObject)newLastMethodReturnStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.PROGRAM_DIAGNOSTIC2_DATA_TYPE__LAST_METHOD_RETURN_STATUS, null, msgs);
			msgs = basicSetLastMethodReturnStatus(newLastMethodReturnStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldLastMethodReturnStatusESet = lastMethodReturnStatusESet;
			lastMethodReturnStatusESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.PROGRAM_DIAGNOSTIC2_DATA_TYPE__LAST_METHOD_RETURN_STATUS, newLastMethodReturnStatus, newLastMethodReturnStatus, !oldLastMethodReturnStatusESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetLastMethodReturnStatus(NotificationChain msgs) {
		StatusResult oldLastMethodReturnStatus = lastMethodReturnStatus;
		lastMethodReturnStatus = null;
		boolean oldLastMethodReturnStatusESet = lastMethodReturnStatusESet;
		lastMethodReturnStatusESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.PROGRAM_DIAGNOSTIC2_DATA_TYPE__LAST_METHOD_RETURN_STATUS, oldLastMethodReturnStatus, null, oldLastMethodReturnStatusESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLastMethodReturnStatus() {
		if (lastMethodReturnStatus != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)lastMethodReturnStatus).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.PROGRAM_DIAGNOSTIC2_DATA_TYPE__LAST_METHOD_RETURN_STATUS, null, msgs);
			msgs = basicUnsetLastMethodReturnStatus(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldLastMethodReturnStatusESet = lastMethodReturnStatusESet;
			lastMethodReturnStatusESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.PROGRAM_DIAGNOSTIC2_DATA_TYPE__LAST_METHOD_RETURN_STATUS, null, null, oldLastMethodReturnStatusESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLastMethodReturnStatus() {
		return lastMethodReturnStatusESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.PROGRAM_DIAGNOSTIC2_DATA_TYPE__CREATE_SESSION_ID:
				return basicUnsetCreateSessionId(msgs);
			case TypesPackage.PROGRAM_DIAGNOSTIC2_DATA_TYPE__LAST_METHOD_SESSION_ID:
				return basicUnsetLastMethodSessionId(msgs);
			case TypesPackage.PROGRAM_DIAGNOSTIC2_DATA_TYPE__LAST_METHOD_INPUT_ARGUMENTS:
				return basicUnsetLastMethodInputArguments(msgs);
			case TypesPackage.PROGRAM_DIAGNOSTIC2_DATA_TYPE__LAST_METHOD_OUTPUT_ARGUMENTS:
				return basicUnsetLastMethodOutputArguments(msgs);
			case TypesPackage.PROGRAM_DIAGNOSTIC2_DATA_TYPE__LAST_METHOD_INPUT_VALUES:
				return basicUnsetLastMethodInputValues(msgs);
			case TypesPackage.PROGRAM_DIAGNOSTIC2_DATA_TYPE__LAST_METHOD_OUTPUT_VALUES:
				return basicUnsetLastMethodOutputValues(msgs);
			case TypesPackage.PROGRAM_DIAGNOSTIC2_DATA_TYPE__LAST_METHOD_RETURN_STATUS:
				return basicUnsetLastMethodReturnStatus(msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TypesPackage.PROGRAM_DIAGNOSTIC2_DATA_TYPE__CREATE_SESSION_ID:
				return getCreateSessionId();
			case TypesPackage.PROGRAM_DIAGNOSTIC2_DATA_TYPE__CREATE_CLIENT_NAME:
				return getCreateClientName();
			case TypesPackage.PROGRAM_DIAGNOSTIC2_DATA_TYPE__INVOCATION_CREATION_TIME:
				return getInvocationCreationTime();
			case TypesPackage.PROGRAM_DIAGNOSTIC2_DATA_TYPE__LAST_TRANSITION_TIME:
				return getLastTransitionTime();
			case TypesPackage.PROGRAM_DIAGNOSTIC2_DATA_TYPE__LAST_METHOD_CALL:
				return getLastMethodCall();
			case TypesPackage.PROGRAM_DIAGNOSTIC2_DATA_TYPE__LAST_METHOD_SESSION_ID:
				return getLastMethodSessionId();
			case TypesPackage.PROGRAM_DIAGNOSTIC2_DATA_TYPE__LAST_METHOD_INPUT_ARGUMENTS:
				return getLastMethodInputArguments();
			case TypesPackage.PROGRAM_DIAGNOSTIC2_DATA_TYPE__LAST_METHOD_OUTPUT_ARGUMENTS:
				return getLastMethodOutputArguments();
			case TypesPackage.PROGRAM_DIAGNOSTIC2_DATA_TYPE__LAST_METHOD_INPUT_VALUES:
				return getLastMethodInputValues();
			case TypesPackage.PROGRAM_DIAGNOSTIC2_DATA_TYPE__LAST_METHOD_OUTPUT_VALUES:
				return getLastMethodOutputValues();
			case TypesPackage.PROGRAM_DIAGNOSTIC2_DATA_TYPE__LAST_METHOD_CALL_TIME:
				return getLastMethodCallTime();
			case TypesPackage.PROGRAM_DIAGNOSTIC2_DATA_TYPE__LAST_METHOD_RETURN_STATUS:
				return getLastMethodReturnStatus();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TypesPackage.PROGRAM_DIAGNOSTIC2_DATA_TYPE__CREATE_SESSION_ID:
				setCreateSessionId((NodeId)newValue);
				return;
			case TypesPackage.PROGRAM_DIAGNOSTIC2_DATA_TYPE__CREATE_CLIENT_NAME:
				setCreateClientName((String)newValue);
				return;
			case TypesPackage.PROGRAM_DIAGNOSTIC2_DATA_TYPE__INVOCATION_CREATION_TIME:
				setInvocationCreationTime((XMLGregorianCalendar)newValue);
				return;
			case TypesPackage.PROGRAM_DIAGNOSTIC2_DATA_TYPE__LAST_TRANSITION_TIME:
				setLastTransitionTime((XMLGregorianCalendar)newValue);
				return;
			case TypesPackage.PROGRAM_DIAGNOSTIC2_DATA_TYPE__LAST_METHOD_CALL:
				setLastMethodCall((String)newValue);
				return;
			case TypesPackage.PROGRAM_DIAGNOSTIC2_DATA_TYPE__LAST_METHOD_SESSION_ID:
				setLastMethodSessionId((NodeId)newValue);
				return;
			case TypesPackage.PROGRAM_DIAGNOSTIC2_DATA_TYPE__LAST_METHOD_INPUT_ARGUMENTS:
				setLastMethodInputArguments((ListOfArgument)newValue);
				return;
			case TypesPackage.PROGRAM_DIAGNOSTIC2_DATA_TYPE__LAST_METHOD_OUTPUT_ARGUMENTS:
				setLastMethodOutputArguments((ListOfArgument)newValue);
				return;
			case TypesPackage.PROGRAM_DIAGNOSTIC2_DATA_TYPE__LAST_METHOD_INPUT_VALUES:
				setLastMethodInputValues((ListOfVariant)newValue);
				return;
			case TypesPackage.PROGRAM_DIAGNOSTIC2_DATA_TYPE__LAST_METHOD_OUTPUT_VALUES:
				setLastMethodOutputValues((ListOfVariant)newValue);
				return;
			case TypesPackage.PROGRAM_DIAGNOSTIC2_DATA_TYPE__LAST_METHOD_CALL_TIME:
				setLastMethodCallTime((XMLGregorianCalendar)newValue);
				return;
			case TypesPackage.PROGRAM_DIAGNOSTIC2_DATA_TYPE__LAST_METHOD_RETURN_STATUS:
				setLastMethodReturnStatus((StatusResult)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TypesPackage.PROGRAM_DIAGNOSTIC2_DATA_TYPE__CREATE_SESSION_ID:
				unsetCreateSessionId();
				return;
			case TypesPackage.PROGRAM_DIAGNOSTIC2_DATA_TYPE__CREATE_CLIENT_NAME:
				unsetCreateClientName();
				return;
			case TypesPackage.PROGRAM_DIAGNOSTIC2_DATA_TYPE__INVOCATION_CREATION_TIME:
				setInvocationCreationTime(INVOCATION_CREATION_TIME_EDEFAULT);
				return;
			case TypesPackage.PROGRAM_DIAGNOSTIC2_DATA_TYPE__LAST_TRANSITION_TIME:
				setLastTransitionTime(LAST_TRANSITION_TIME_EDEFAULT);
				return;
			case TypesPackage.PROGRAM_DIAGNOSTIC2_DATA_TYPE__LAST_METHOD_CALL:
				unsetLastMethodCall();
				return;
			case TypesPackage.PROGRAM_DIAGNOSTIC2_DATA_TYPE__LAST_METHOD_SESSION_ID:
				unsetLastMethodSessionId();
				return;
			case TypesPackage.PROGRAM_DIAGNOSTIC2_DATA_TYPE__LAST_METHOD_INPUT_ARGUMENTS:
				unsetLastMethodInputArguments();
				return;
			case TypesPackage.PROGRAM_DIAGNOSTIC2_DATA_TYPE__LAST_METHOD_OUTPUT_ARGUMENTS:
				unsetLastMethodOutputArguments();
				return;
			case TypesPackage.PROGRAM_DIAGNOSTIC2_DATA_TYPE__LAST_METHOD_INPUT_VALUES:
				unsetLastMethodInputValues();
				return;
			case TypesPackage.PROGRAM_DIAGNOSTIC2_DATA_TYPE__LAST_METHOD_OUTPUT_VALUES:
				unsetLastMethodOutputValues();
				return;
			case TypesPackage.PROGRAM_DIAGNOSTIC2_DATA_TYPE__LAST_METHOD_CALL_TIME:
				setLastMethodCallTime(LAST_METHOD_CALL_TIME_EDEFAULT);
				return;
			case TypesPackage.PROGRAM_DIAGNOSTIC2_DATA_TYPE__LAST_METHOD_RETURN_STATUS:
				unsetLastMethodReturnStatus();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TypesPackage.PROGRAM_DIAGNOSTIC2_DATA_TYPE__CREATE_SESSION_ID:
				return isSetCreateSessionId();
			case TypesPackage.PROGRAM_DIAGNOSTIC2_DATA_TYPE__CREATE_CLIENT_NAME:
				return isSetCreateClientName();
			case TypesPackage.PROGRAM_DIAGNOSTIC2_DATA_TYPE__INVOCATION_CREATION_TIME:
				return INVOCATION_CREATION_TIME_EDEFAULT == null ? invocationCreationTime != null : !INVOCATION_CREATION_TIME_EDEFAULT.equals(invocationCreationTime);
			case TypesPackage.PROGRAM_DIAGNOSTIC2_DATA_TYPE__LAST_TRANSITION_TIME:
				return LAST_TRANSITION_TIME_EDEFAULT == null ? lastTransitionTime != null : !LAST_TRANSITION_TIME_EDEFAULT.equals(lastTransitionTime);
			case TypesPackage.PROGRAM_DIAGNOSTIC2_DATA_TYPE__LAST_METHOD_CALL:
				return isSetLastMethodCall();
			case TypesPackage.PROGRAM_DIAGNOSTIC2_DATA_TYPE__LAST_METHOD_SESSION_ID:
				return isSetLastMethodSessionId();
			case TypesPackage.PROGRAM_DIAGNOSTIC2_DATA_TYPE__LAST_METHOD_INPUT_ARGUMENTS:
				return isSetLastMethodInputArguments();
			case TypesPackage.PROGRAM_DIAGNOSTIC2_DATA_TYPE__LAST_METHOD_OUTPUT_ARGUMENTS:
				return isSetLastMethodOutputArguments();
			case TypesPackage.PROGRAM_DIAGNOSTIC2_DATA_TYPE__LAST_METHOD_INPUT_VALUES:
				return isSetLastMethodInputValues();
			case TypesPackage.PROGRAM_DIAGNOSTIC2_DATA_TYPE__LAST_METHOD_OUTPUT_VALUES:
				return isSetLastMethodOutputValues();
			case TypesPackage.PROGRAM_DIAGNOSTIC2_DATA_TYPE__LAST_METHOD_CALL_TIME:
				return LAST_METHOD_CALL_TIME_EDEFAULT == null ? lastMethodCallTime != null : !LAST_METHOD_CALL_TIME_EDEFAULT.equals(lastMethodCallTime);
			case TypesPackage.PROGRAM_DIAGNOSTIC2_DATA_TYPE__LAST_METHOD_RETURN_STATUS:
				return isSetLastMethodReturnStatus();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (createClientName: ");
		if (createClientNameESet) result.append(createClientName); else result.append("<unset>");
		result.append(", invocationCreationTime: ");
		result.append(invocationCreationTime);
		result.append(", lastTransitionTime: ");
		result.append(lastTransitionTime);
		result.append(", lastMethodCall: ");
		if (lastMethodCallESet) result.append(lastMethodCall); else result.append("<unset>");
		result.append(", lastMethodCallTime: ");
		result.append(lastMethodCallTime);
		result.append(')');
		return result.toString();
	}

} //ProgramDiagnostic2DataTypeImpl
