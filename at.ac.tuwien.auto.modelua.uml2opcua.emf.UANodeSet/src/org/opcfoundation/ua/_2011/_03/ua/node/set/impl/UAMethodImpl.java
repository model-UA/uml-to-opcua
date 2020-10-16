/**
 */
package org.opcfoundation.ua._2011._03.ua.node.set.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.opcfoundation.ua._2011._03.ua.node.set.SetPackage;
import org.opcfoundation.ua._2011._03.ua.node.set.UAMethod;
import org.opcfoundation.ua._2011._03.ua.node.set.UAMethodArgument;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UA Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.UAMethodImpl#getArgumentDescription <em>Argument Description</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.UAMethodImpl#isExecutable <em>Executable</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.UAMethodImpl#getMethodDeclarationId <em>Method Declaration Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.UAMethodImpl#isUserExecutable <em>User Executable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UAMethodImpl extends UAInstanceImpl implements UAMethod {
	/**
	 * The cached value of the '{@link #getArgumentDescription() <em>Argument Description</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgumentDescription()
	 * @generated
	 * @ordered
	 */
	protected EList<UAMethodArgument> argumentDescription;

	/**
	 * The default value of the '{@link #isExecutable() <em>Executable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExecutable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EXECUTABLE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isExecutable() <em>Executable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExecutable()
	 * @generated
	 * @ordered
	 */
	protected boolean executable = EXECUTABLE_EDEFAULT;

	/**
	 * This is true if the Executable attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean executableESet;

	/**
	 * The default value of the '{@link #getMethodDeclarationId() <em>Method Declaration Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodDeclarationId()
	 * @generated
	 * @ordered
	 */
	protected static final String METHOD_DECLARATION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMethodDeclarationId() <em>Method Declaration Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodDeclarationId()
	 * @generated
	 * @ordered
	 */
	protected String methodDeclarationId = METHOD_DECLARATION_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #isUserExecutable() <em>User Executable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUserExecutable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USER_EXECUTABLE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isUserExecutable() <em>User Executable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUserExecutable()
	 * @generated
	 * @ordered
	 */
	protected boolean userExecutable = USER_EXECUTABLE_EDEFAULT;

	/**
	 * This is true if the User Executable attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean userExecutableESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UAMethodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SetPackage.Literals.UA_METHOD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UAMethodArgument> getArgumentDescription() {
		if (argumentDescription == null) {
			argumentDescription = new EObjectContainmentEList<UAMethodArgument>(UAMethodArgument.class, this, SetPackage.UA_METHOD__ARGUMENT_DESCRIPTION);
		}
		return argumentDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isExecutable() {
		return executable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExecutable(boolean newExecutable) {
		boolean oldExecutable = executable;
		executable = newExecutable;
		boolean oldExecutableESet = executableESet;
		executableESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SetPackage.UA_METHOD__EXECUTABLE, oldExecutable, executable, !oldExecutableESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetExecutable() {
		boolean oldExecutable = executable;
		boolean oldExecutableESet = executableESet;
		executable = EXECUTABLE_EDEFAULT;
		executableESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SetPackage.UA_METHOD__EXECUTABLE, oldExecutable, EXECUTABLE_EDEFAULT, oldExecutableESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetExecutable() {
		return executableESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMethodDeclarationId() {
		return methodDeclarationId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethodDeclarationId(String newMethodDeclarationId) {
		String oldMethodDeclarationId = methodDeclarationId;
		methodDeclarationId = newMethodDeclarationId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SetPackage.UA_METHOD__METHOD_DECLARATION_ID, oldMethodDeclarationId, methodDeclarationId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUserExecutable() {
		return userExecutable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserExecutable(boolean newUserExecutable) {
		boolean oldUserExecutable = userExecutable;
		userExecutable = newUserExecutable;
		boolean oldUserExecutableESet = userExecutableESet;
		userExecutableESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SetPackage.UA_METHOD__USER_EXECUTABLE, oldUserExecutable, userExecutable, !oldUserExecutableESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUserExecutable() {
		boolean oldUserExecutable = userExecutable;
		boolean oldUserExecutableESet = userExecutableESet;
		userExecutable = USER_EXECUTABLE_EDEFAULT;
		userExecutableESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SetPackage.UA_METHOD__USER_EXECUTABLE, oldUserExecutable, USER_EXECUTABLE_EDEFAULT, oldUserExecutableESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUserExecutable() {
		return userExecutableESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SetPackage.UA_METHOD__ARGUMENT_DESCRIPTION:
				return ((InternalEList<?>)getArgumentDescription()).basicRemove(otherEnd, msgs);
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
			case SetPackage.UA_METHOD__ARGUMENT_DESCRIPTION:
				return getArgumentDescription();
			case SetPackage.UA_METHOD__EXECUTABLE:
				return isExecutable();
			case SetPackage.UA_METHOD__METHOD_DECLARATION_ID:
				return getMethodDeclarationId();
			case SetPackage.UA_METHOD__USER_EXECUTABLE:
				return isUserExecutable();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SetPackage.UA_METHOD__ARGUMENT_DESCRIPTION:
				getArgumentDescription().clear();
				getArgumentDescription().addAll((Collection<? extends UAMethodArgument>)newValue);
				return;
			case SetPackage.UA_METHOD__EXECUTABLE:
				setExecutable((Boolean)newValue);
				return;
			case SetPackage.UA_METHOD__METHOD_DECLARATION_ID:
				setMethodDeclarationId((String)newValue);
				return;
			case SetPackage.UA_METHOD__USER_EXECUTABLE:
				setUserExecutable((Boolean)newValue);
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
			case SetPackage.UA_METHOD__ARGUMENT_DESCRIPTION:
				getArgumentDescription().clear();
				return;
			case SetPackage.UA_METHOD__EXECUTABLE:
				unsetExecutable();
				return;
			case SetPackage.UA_METHOD__METHOD_DECLARATION_ID:
				setMethodDeclarationId(METHOD_DECLARATION_ID_EDEFAULT);
				return;
			case SetPackage.UA_METHOD__USER_EXECUTABLE:
				unsetUserExecutable();
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
			case SetPackage.UA_METHOD__ARGUMENT_DESCRIPTION:
				return argumentDescription != null && !argumentDescription.isEmpty();
			case SetPackage.UA_METHOD__EXECUTABLE:
				return isSetExecutable();
			case SetPackage.UA_METHOD__METHOD_DECLARATION_ID:
				return METHOD_DECLARATION_ID_EDEFAULT == null ? methodDeclarationId != null : !METHOD_DECLARATION_ID_EDEFAULT.equals(methodDeclarationId);
			case SetPackage.UA_METHOD__USER_EXECUTABLE:
				return isSetUserExecutable();
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
		result.append(" (executable: ");
		if (executableESet) result.append(executable); else result.append("<unset>");
		result.append(", methodDeclarationId: ");
		result.append(methodDeclarationId);
		result.append(", userExecutable: ");
		if (userExecutableESet) result.append(userExecutable); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //UAMethodImpl
