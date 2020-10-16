/**
 */
package org.opcfoundation.ua._2011._03.ua.node.set.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.opcfoundation.ua._2011._03.ua.node.set.NodeToDelete;
import org.opcfoundation.ua._2011._03.ua.node.set.SetPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node To Delete</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.NodeToDeleteImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.NodeToDeleteImpl#isDeleteReverseReferences <em>Delete Reverse References</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NodeToDeleteImpl extends MinimalEObjectImpl.Container implements NodeToDelete {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #isDeleteReverseReferences() <em>Delete Reverse References</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDeleteReverseReferences()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DELETE_REVERSE_REFERENCES_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isDeleteReverseReferences() <em>Delete Reverse References</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDeleteReverseReferences()
	 * @generated
	 * @ordered
	 */
	protected boolean deleteReverseReferences = DELETE_REVERSE_REFERENCES_EDEFAULT;

	/**
	 * This is true if the Delete Reverse References attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean deleteReverseReferencesESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeToDeleteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SetPackage.Literals.NODE_TO_DELETE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SetPackage.NODE_TO_DELETE__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDeleteReverseReferences() {
		return deleteReverseReferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeleteReverseReferences(boolean newDeleteReverseReferences) {
		boolean oldDeleteReverseReferences = deleteReverseReferences;
		deleteReverseReferences = newDeleteReverseReferences;
		boolean oldDeleteReverseReferencesESet = deleteReverseReferencesESet;
		deleteReverseReferencesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SetPackage.NODE_TO_DELETE__DELETE_REVERSE_REFERENCES, oldDeleteReverseReferences, deleteReverseReferences, !oldDeleteReverseReferencesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDeleteReverseReferences() {
		boolean oldDeleteReverseReferences = deleteReverseReferences;
		boolean oldDeleteReverseReferencesESet = deleteReverseReferencesESet;
		deleteReverseReferences = DELETE_REVERSE_REFERENCES_EDEFAULT;
		deleteReverseReferencesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SetPackage.NODE_TO_DELETE__DELETE_REVERSE_REFERENCES, oldDeleteReverseReferences, DELETE_REVERSE_REFERENCES_EDEFAULT, oldDeleteReverseReferencesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDeleteReverseReferences() {
		return deleteReverseReferencesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SetPackage.NODE_TO_DELETE__VALUE:
				return getValue();
			case SetPackage.NODE_TO_DELETE__DELETE_REVERSE_REFERENCES:
				return isDeleteReverseReferences();
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
			case SetPackage.NODE_TO_DELETE__VALUE:
				setValue((String)newValue);
				return;
			case SetPackage.NODE_TO_DELETE__DELETE_REVERSE_REFERENCES:
				setDeleteReverseReferences((Boolean)newValue);
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
			case SetPackage.NODE_TO_DELETE__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case SetPackage.NODE_TO_DELETE__DELETE_REVERSE_REFERENCES:
				unsetDeleteReverseReferences();
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
			case SetPackage.NODE_TO_DELETE__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case SetPackage.NODE_TO_DELETE__DELETE_REVERSE_REFERENCES:
				return isSetDeleteReverseReferences();
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
		result.append(" (value: ");
		result.append(value);
		result.append(", deleteReverseReferences: ");
		if (deleteReverseReferencesESet) result.append(deleteReverseReferences); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //NodeToDeleteImpl
