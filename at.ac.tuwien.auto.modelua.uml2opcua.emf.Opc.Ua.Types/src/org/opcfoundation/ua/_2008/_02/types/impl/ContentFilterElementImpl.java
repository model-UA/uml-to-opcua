/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.opcfoundation.ua._2008._02.types.ContentFilterElement;
import org.opcfoundation.ua._2008._02.types.FilterOperator;
import org.opcfoundation.ua._2008._02.types.ListOfExtensionObject;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Content Filter Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ContentFilterElementImpl#getFilterOperator <em>Filter Operator</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ContentFilterElementImpl#getFilterOperands <em>Filter Operands</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContentFilterElementImpl extends MinimalEObjectImpl.Container implements ContentFilterElement {
	/**
	 * The default value of the '{@link #getFilterOperator() <em>Filter Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilterOperator()
	 * @generated
	 * @ordered
	 */
	protected static final FilterOperator FILTER_OPERATOR_EDEFAULT = FilterOperator.EQUALS0;

	/**
	 * The cached value of the '{@link #getFilterOperator() <em>Filter Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilterOperator()
	 * @generated
	 * @ordered
	 */
	protected FilterOperator filterOperator = FILTER_OPERATOR_EDEFAULT;

	/**
	 * This is true if the Filter Operator attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean filterOperatorESet;

	/**
	 * The cached value of the '{@link #getFilterOperands() <em>Filter Operands</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilterOperands()
	 * @generated
	 * @ordered
	 */
	protected ListOfExtensionObject filterOperands;

	/**
	 * This is true if the Filter Operands containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean filterOperandsESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContentFilterElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getContentFilterElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterOperator getFilterOperator() {
		return filterOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilterOperator(FilterOperator newFilterOperator) {
		FilterOperator oldFilterOperator = filterOperator;
		filterOperator = newFilterOperator == null ? FILTER_OPERATOR_EDEFAULT : newFilterOperator;
		boolean oldFilterOperatorESet = filterOperatorESet;
		filterOperatorESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.CONTENT_FILTER_ELEMENT__FILTER_OPERATOR, oldFilterOperator, filterOperator, !oldFilterOperatorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFilterOperator() {
		FilterOperator oldFilterOperator = filterOperator;
		boolean oldFilterOperatorESet = filterOperatorESet;
		filterOperator = FILTER_OPERATOR_EDEFAULT;
		filterOperatorESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.CONTENT_FILTER_ELEMENT__FILTER_OPERATOR, oldFilterOperator, FILTER_OPERATOR_EDEFAULT, oldFilterOperatorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFilterOperator() {
		return filterOperatorESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfExtensionObject getFilterOperands() {
		return filterOperands;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFilterOperands(ListOfExtensionObject newFilterOperands, NotificationChain msgs) {
		ListOfExtensionObject oldFilterOperands = filterOperands;
		filterOperands = newFilterOperands;
		boolean oldFilterOperandsESet = filterOperandsESet;
		filterOperandsESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.CONTENT_FILTER_ELEMENT__FILTER_OPERANDS, oldFilterOperands, newFilterOperands, !oldFilterOperandsESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilterOperands(ListOfExtensionObject newFilterOperands) {
		if (newFilterOperands != filterOperands) {
			NotificationChain msgs = null;
			if (filterOperands != null)
				msgs = ((InternalEObject)filterOperands).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.CONTENT_FILTER_ELEMENT__FILTER_OPERANDS, null, msgs);
			if (newFilterOperands != null)
				msgs = ((InternalEObject)newFilterOperands).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.CONTENT_FILTER_ELEMENT__FILTER_OPERANDS, null, msgs);
			msgs = basicSetFilterOperands(newFilterOperands, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldFilterOperandsESet = filterOperandsESet;
			filterOperandsESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.CONTENT_FILTER_ELEMENT__FILTER_OPERANDS, newFilterOperands, newFilterOperands, !oldFilterOperandsESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetFilterOperands(NotificationChain msgs) {
		ListOfExtensionObject oldFilterOperands = filterOperands;
		filterOperands = null;
		boolean oldFilterOperandsESet = filterOperandsESet;
		filterOperandsESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.CONTENT_FILTER_ELEMENT__FILTER_OPERANDS, oldFilterOperands, null, oldFilterOperandsESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFilterOperands() {
		if (filterOperands != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)filterOperands).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.CONTENT_FILTER_ELEMENT__FILTER_OPERANDS, null, msgs);
			msgs = basicUnsetFilterOperands(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldFilterOperandsESet = filterOperandsESet;
			filterOperandsESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.CONTENT_FILTER_ELEMENT__FILTER_OPERANDS, null, null, oldFilterOperandsESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFilterOperands() {
		return filterOperandsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.CONTENT_FILTER_ELEMENT__FILTER_OPERANDS:
				return basicUnsetFilterOperands(msgs);
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
			case TypesPackage.CONTENT_FILTER_ELEMENT__FILTER_OPERATOR:
				return getFilterOperator();
			case TypesPackage.CONTENT_FILTER_ELEMENT__FILTER_OPERANDS:
				return getFilterOperands();
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
			case TypesPackage.CONTENT_FILTER_ELEMENT__FILTER_OPERATOR:
				setFilterOperator((FilterOperator)newValue);
				return;
			case TypesPackage.CONTENT_FILTER_ELEMENT__FILTER_OPERANDS:
				setFilterOperands((ListOfExtensionObject)newValue);
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
			case TypesPackage.CONTENT_FILTER_ELEMENT__FILTER_OPERATOR:
				unsetFilterOperator();
				return;
			case TypesPackage.CONTENT_FILTER_ELEMENT__FILTER_OPERANDS:
				unsetFilterOperands();
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
			case TypesPackage.CONTENT_FILTER_ELEMENT__FILTER_OPERATOR:
				return isSetFilterOperator();
			case TypesPackage.CONTENT_FILTER_ELEMENT__FILTER_OPERANDS:
				return isSetFilterOperands();
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
		result.append(" (filterOperator: ");
		if (filterOperatorESet) result.append(filterOperator); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ContentFilterElementImpl
