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

import org.opcfoundation.ua._2011._03.ua.node.set.LocalizedText;
import org.opcfoundation.ua._2011._03.ua.node.set.SetPackage;
import org.opcfoundation.ua._2011._03.ua.node.set.UAReferenceType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UA Reference Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.UAReferenceTypeImpl#getInverseName <em>Inverse Name</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.UAReferenceTypeImpl#isSymmetric <em>Symmetric</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UAReferenceTypeImpl extends UATypeImpl implements UAReferenceType {
	/**
	 * The cached value of the '{@link #getInverseName() <em>Inverse Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInverseName()
	 * @generated
	 * @ordered
	 */
	protected EList<LocalizedText> inverseName;

	/**
	 * The default value of the '{@link #isSymmetric() <em>Symmetric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSymmetric()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SYMMETRIC_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSymmetric() <em>Symmetric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSymmetric()
	 * @generated
	 * @ordered
	 */
	protected boolean symmetric = SYMMETRIC_EDEFAULT;

	/**
	 * This is true if the Symmetric attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean symmetricESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UAReferenceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SetPackage.Literals.UA_REFERENCE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LocalizedText> getInverseName() {
		if (inverseName == null) {
			inverseName = new EObjectContainmentEList<LocalizedText>(LocalizedText.class, this, SetPackage.UA_REFERENCE_TYPE__INVERSE_NAME);
		}
		return inverseName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSymmetric() {
		return symmetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSymmetric(boolean newSymmetric) {
		boolean oldSymmetric = symmetric;
		symmetric = newSymmetric;
		boolean oldSymmetricESet = symmetricESet;
		symmetricESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SetPackage.UA_REFERENCE_TYPE__SYMMETRIC, oldSymmetric, symmetric, !oldSymmetricESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSymmetric() {
		boolean oldSymmetric = symmetric;
		boolean oldSymmetricESet = symmetricESet;
		symmetric = SYMMETRIC_EDEFAULT;
		symmetricESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SetPackage.UA_REFERENCE_TYPE__SYMMETRIC, oldSymmetric, SYMMETRIC_EDEFAULT, oldSymmetricESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSymmetric() {
		return symmetricESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SetPackage.UA_REFERENCE_TYPE__INVERSE_NAME:
				return ((InternalEList<?>)getInverseName()).basicRemove(otherEnd, msgs);
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
			case SetPackage.UA_REFERENCE_TYPE__INVERSE_NAME:
				return getInverseName();
			case SetPackage.UA_REFERENCE_TYPE__SYMMETRIC:
				return isSymmetric();
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
			case SetPackage.UA_REFERENCE_TYPE__INVERSE_NAME:
				getInverseName().clear();
				getInverseName().addAll((Collection<? extends LocalizedText>)newValue);
				return;
			case SetPackage.UA_REFERENCE_TYPE__SYMMETRIC:
				setSymmetric((Boolean)newValue);
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
			case SetPackage.UA_REFERENCE_TYPE__INVERSE_NAME:
				getInverseName().clear();
				return;
			case SetPackage.UA_REFERENCE_TYPE__SYMMETRIC:
				unsetSymmetric();
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
			case SetPackage.UA_REFERENCE_TYPE__INVERSE_NAME:
				return inverseName != null && !inverseName.isEmpty();
			case SetPackage.UA_REFERENCE_TYPE__SYMMETRIC:
				return isSetSymmetric();
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
		result.append(" (symmetric: ");
		if (symmetricESet) result.append(symmetric); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //UAReferenceTypeImpl
