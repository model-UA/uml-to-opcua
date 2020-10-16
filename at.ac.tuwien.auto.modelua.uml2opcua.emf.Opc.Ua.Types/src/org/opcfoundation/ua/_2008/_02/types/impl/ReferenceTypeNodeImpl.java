/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.opcfoundation.ua._2008._02.types.LocalizedText;
import org.opcfoundation.ua._2008._02.types.ReferenceTypeNode;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reference Type Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ReferenceTypeNodeImpl#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ReferenceTypeNodeImpl#isSymmetric <em>Symmetric</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ReferenceTypeNodeImpl#getInverseName <em>Inverse Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReferenceTypeNodeImpl extends TypeNodeImpl implements ReferenceTypeNode {
	/**
	 * The default value of the '{@link #isIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ABSTRACT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected boolean isAbstract = IS_ABSTRACT_EDEFAULT;

	/**
	 * This is true if the Is Abstract attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isAbstractESet;

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
	 * The cached value of the '{@link #getInverseName() <em>Inverse Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInverseName()
	 * @generated
	 * @ordered
	 */
	protected LocalizedText inverseName;

	/**
	 * This is true if the Inverse Name containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean inverseNameESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReferenceTypeNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getReferenceTypeNode();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsAbstract() {
		return isAbstract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAbstract(boolean newIsAbstract) {
		boolean oldIsAbstract = isAbstract;
		isAbstract = newIsAbstract;
		boolean oldIsAbstractESet = isAbstractESet;
		isAbstractESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.REFERENCE_TYPE_NODE__IS_ABSTRACT, oldIsAbstract, isAbstract, !oldIsAbstractESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsAbstract() {
		boolean oldIsAbstract = isAbstract;
		boolean oldIsAbstractESet = isAbstractESet;
		isAbstract = IS_ABSTRACT_EDEFAULT;
		isAbstractESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.REFERENCE_TYPE_NODE__IS_ABSTRACT, oldIsAbstract, IS_ABSTRACT_EDEFAULT, oldIsAbstractESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsAbstract() {
		return isAbstractESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.REFERENCE_TYPE_NODE__SYMMETRIC, oldSymmetric, symmetric, !oldSymmetricESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.REFERENCE_TYPE_NODE__SYMMETRIC, oldSymmetric, SYMMETRIC_EDEFAULT, oldSymmetricESet));
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
	public LocalizedText getInverseName() {
		return inverseName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInverseName(LocalizedText newInverseName, NotificationChain msgs) {
		LocalizedText oldInverseName = inverseName;
		inverseName = newInverseName;
		boolean oldInverseNameESet = inverseNameESet;
		inverseNameESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.REFERENCE_TYPE_NODE__INVERSE_NAME, oldInverseName, newInverseName, !oldInverseNameESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInverseName(LocalizedText newInverseName) {
		if (newInverseName != inverseName) {
			NotificationChain msgs = null;
			if (inverseName != null)
				msgs = ((InternalEObject)inverseName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.REFERENCE_TYPE_NODE__INVERSE_NAME, null, msgs);
			if (newInverseName != null)
				msgs = ((InternalEObject)newInverseName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.REFERENCE_TYPE_NODE__INVERSE_NAME, null, msgs);
			msgs = basicSetInverseName(newInverseName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldInverseNameESet = inverseNameESet;
			inverseNameESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.REFERENCE_TYPE_NODE__INVERSE_NAME, newInverseName, newInverseName, !oldInverseNameESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetInverseName(NotificationChain msgs) {
		LocalizedText oldInverseName = inverseName;
		inverseName = null;
		boolean oldInverseNameESet = inverseNameESet;
		inverseNameESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.REFERENCE_TYPE_NODE__INVERSE_NAME, oldInverseName, null, oldInverseNameESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetInverseName() {
		if (inverseName != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)inverseName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.REFERENCE_TYPE_NODE__INVERSE_NAME, null, msgs);
			msgs = basicUnsetInverseName(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldInverseNameESet = inverseNameESet;
			inverseNameESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.REFERENCE_TYPE_NODE__INVERSE_NAME, null, null, oldInverseNameESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInverseName() {
		return inverseNameESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.REFERENCE_TYPE_NODE__INVERSE_NAME:
				return basicUnsetInverseName(msgs);
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
			case TypesPackage.REFERENCE_TYPE_NODE__IS_ABSTRACT:
				return isIsAbstract();
			case TypesPackage.REFERENCE_TYPE_NODE__SYMMETRIC:
				return isSymmetric();
			case TypesPackage.REFERENCE_TYPE_NODE__INVERSE_NAME:
				return getInverseName();
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
			case TypesPackage.REFERENCE_TYPE_NODE__IS_ABSTRACT:
				setIsAbstract((Boolean)newValue);
				return;
			case TypesPackage.REFERENCE_TYPE_NODE__SYMMETRIC:
				setSymmetric((Boolean)newValue);
				return;
			case TypesPackage.REFERENCE_TYPE_NODE__INVERSE_NAME:
				setInverseName((LocalizedText)newValue);
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
			case TypesPackage.REFERENCE_TYPE_NODE__IS_ABSTRACT:
				unsetIsAbstract();
				return;
			case TypesPackage.REFERENCE_TYPE_NODE__SYMMETRIC:
				unsetSymmetric();
				return;
			case TypesPackage.REFERENCE_TYPE_NODE__INVERSE_NAME:
				unsetInverseName();
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
			case TypesPackage.REFERENCE_TYPE_NODE__IS_ABSTRACT:
				return isSetIsAbstract();
			case TypesPackage.REFERENCE_TYPE_NODE__SYMMETRIC:
				return isSetSymmetric();
			case TypesPackage.REFERENCE_TYPE_NODE__INVERSE_NAME:
				return isSetInverseName();
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
		result.append(" (isAbstract: ");
		if (isAbstractESet) result.append(isAbstract); else result.append("<unset>");
		result.append(", symmetric: ");
		if (symmetricESet) result.append(symmetric); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ReferenceTypeNodeImpl
