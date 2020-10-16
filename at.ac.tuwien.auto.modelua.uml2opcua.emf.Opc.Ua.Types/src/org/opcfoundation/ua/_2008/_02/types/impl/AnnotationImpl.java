/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.opcfoundation.ua._2008._02.types.Annotation;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Annotation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.AnnotationImpl#getMessage <em>Message</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.AnnotationImpl#getUserName <em>User Name</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.AnnotationImpl#getAnnotationTime <em>Annotation Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnnotationImpl extends MinimalEObjectImpl.Container implements Annotation {
	/**
	 * The default value of the '{@link #getMessage() <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String MESSAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMessage() <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected String message = MESSAGE_EDEFAULT;

	/**
	 * This is true if the Message attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean messageESet;

	/**
	 * The default value of the '{@link #getUserName() <em>User Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserName()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUserName() <em>User Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserName()
	 * @generated
	 * @ordered
	 */
	protected String userName = USER_NAME_EDEFAULT;

	/**
	 * This is true if the User Name attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean userNameESet;

	/**
	 * The default value of the '{@link #getAnnotationTime() <em>Annotation Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotationTime()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar ANNOTATION_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAnnotationTime() <em>Annotation Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotationTime()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar annotationTime = ANNOTATION_TIME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnnotationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getAnnotation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessage(String newMessage) {
		String oldMessage = message;
		message = newMessage;
		boolean oldMessageESet = messageESet;
		messageESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.ANNOTATION__MESSAGE, oldMessage, message, !oldMessageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMessage() {
		String oldMessage = message;
		boolean oldMessageESet = messageESet;
		message = MESSAGE_EDEFAULT;
		messageESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.ANNOTATION__MESSAGE, oldMessage, MESSAGE_EDEFAULT, oldMessageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMessage() {
		return messageESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserName(String newUserName) {
		String oldUserName = userName;
		userName = newUserName;
		boolean oldUserNameESet = userNameESet;
		userNameESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.ANNOTATION__USER_NAME, oldUserName, userName, !oldUserNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUserName() {
		String oldUserName = userName;
		boolean oldUserNameESet = userNameESet;
		userName = USER_NAME_EDEFAULT;
		userNameESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.ANNOTATION__USER_NAME, oldUserName, USER_NAME_EDEFAULT, oldUserNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUserName() {
		return userNameESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getAnnotationTime() {
		return annotationTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnnotationTime(XMLGregorianCalendar newAnnotationTime) {
		XMLGregorianCalendar oldAnnotationTime = annotationTime;
		annotationTime = newAnnotationTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.ANNOTATION__ANNOTATION_TIME, oldAnnotationTime, annotationTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TypesPackage.ANNOTATION__MESSAGE:
				return getMessage();
			case TypesPackage.ANNOTATION__USER_NAME:
				return getUserName();
			case TypesPackage.ANNOTATION__ANNOTATION_TIME:
				return getAnnotationTime();
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
			case TypesPackage.ANNOTATION__MESSAGE:
				setMessage((String)newValue);
				return;
			case TypesPackage.ANNOTATION__USER_NAME:
				setUserName((String)newValue);
				return;
			case TypesPackage.ANNOTATION__ANNOTATION_TIME:
				setAnnotationTime((XMLGregorianCalendar)newValue);
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
			case TypesPackage.ANNOTATION__MESSAGE:
				unsetMessage();
				return;
			case TypesPackage.ANNOTATION__USER_NAME:
				unsetUserName();
				return;
			case TypesPackage.ANNOTATION__ANNOTATION_TIME:
				setAnnotationTime(ANNOTATION_TIME_EDEFAULT);
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
			case TypesPackage.ANNOTATION__MESSAGE:
				return isSetMessage();
			case TypesPackage.ANNOTATION__USER_NAME:
				return isSetUserName();
			case TypesPackage.ANNOTATION__ANNOTATION_TIME:
				return ANNOTATION_TIME_EDEFAULT == null ? annotationTime != null : !ANNOTATION_TIME_EDEFAULT.equals(annotationTime);
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
		result.append(" (message: ");
		if (messageESet) result.append(message); else result.append("<unset>");
		result.append(", userName: ");
		if (userNameESet) result.append(userName); else result.append("<unset>");
		result.append(", annotationTime: ");
		result.append(annotationTime);
		result.append(')');
		return result.toString();
	}

} //AnnotationImpl
