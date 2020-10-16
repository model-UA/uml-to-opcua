/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.opcfoundation.ua._2008._02.types.ContentFilter;
import org.opcfoundation.ua._2008._02.types.EventFilter;
import org.opcfoundation.ua._2008._02.types.ListOfSimpleAttributeOperand;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event Filter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.EventFilterImpl#getSelectClauses <em>Select Clauses</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.EventFilterImpl#getWhereClause <em>Where Clause</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EventFilterImpl extends MonitoringFilterImpl implements EventFilter {
	/**
	 * The cached value of the '{@link #getSelectClauses() <em>Select Clauses</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectClauses()
	 * @generated
	 * @ordered
	 */
	protected ListOfSimpleAttributeOperand selectClauses;

	/**
	 * This is true if the Select Clauses containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean selectClausesESet;

	/**
	 * The cached value of the '{@link #getWhereClause() <em>Where Clause</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhereClause()
	 * @generated
	 * @ordered
	 */
	protected ContentFilter whereClause;

	/**
	 * This is true if the Where Clause containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean whereClauseESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventFilterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getEventFilter();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfSimpleAttributeOperand getSelectClauses() {
		return selectClauses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSelectClauses(ListOfSimpleAttributeOperand newSelectClauses, NotificationChain msgs) {
		ListOfSimpleAttributeOperand oldSelectClauses = selectClauses;
		selectClauses = newSelectClauses;
		boolean oldSelectClausesESet = selectClausesESet;
		selectClausesESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.EVENT_FILTER__SELECT_CLAUSES, oldSelectClauses, newSelectClauses, !oldSelectClausesESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelectClauses(ListOfSimpleAttributeOperand newSelectClauses) {
		if (newSelectClauses != selectClauses) {
			NotificationChain msgs = null;
			if (selectClauses != null)
				msgs = ((InternalEObject)selectClauses).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.EVENT_FILTER__SELECT_CLAUSES, null, msgs);
			if (newSelectClauses != null)
				msgs = ((InternalEObject)newSelectClauses).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.EVENT_FILTER__SELECT_CLAUSES, null, msgs);
			msgs = basicSetSelectClauses(newSelectClauses, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldSelectClausesESet = selectClausesESet;
			selectClausesESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.EVENT_FILTER__SELECT_CLAUSES, newSelectClauses, newSelectClauses, !oldSelectClausesESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetSelectClauses(NotificationChain msgs) {
		ListOfSimpleAttributeOperand oldSelectClauses = selectClauses;
		selectClauses = null;
		boolean oldSelectClausesESet = selectClausesESet;
		selectClausesESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.EVENT_FILTER__SELECT_CLAUSES, oldSelectClauses, null, oldSelectClausesESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSelectClauses() {
		if (selectClauses != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)selectClauses).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.EVENT_FILTER__SELECT_CLAUSES, null, msgs);
			msgs = basicUnsetSelectClauses(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldSelectClausesESet = selectClausesESet;
			selectClausesESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.EVENT_FILTER__SELECT_CLAUSES, null, null, oldSelectClausesESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSelectClauses() {
		return selectClausesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentFilter getWhereClause() {
		return whereClause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWhereClause(ContentFilter newWhereClause, NotificationChain msgs) {
		ContentFilter oldWhereClause = whereClause;
		whereClause = newWhereClause;
		boolean oldWhereClauseESet = whereClauseESet;
		whereClauseESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.EVENT_FILTER__WHERE_CLAUSE, oldWhereClause, newWhereClause, !oldWhereClauseESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhereClause(ContentFilter newWhereClause) {
		if (newWhereClause != whereClause) {
			NotificationChain msgs = null;
			if (whereClause != null)
				msgs = ((InternalEObject)whereClause).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.EVENT_FILTER__WHERE_CLAUSE, null, msgs);
			if (newWhereClause != null)
				msgs = ((InternalEObject)newWhereClause).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.EVENT_FILTER__WHERE_CLAUSE, null, msgs);
			msgs = basicSetWhereClause(newWhereClause, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldWhereClauseESet = whereClauseESet;
			whereClauseESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.EVENT_FILTER__WHERE_CLAUSE, newWhereClause, newWhereClause, !oldWhereClauseESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetWhereClause(NotificationChain msgs) {
		ContentFilter oldWhereClause = whereClause;
		whereClause = null;
		boolean oldWhereClauseESet = whereClauseESet;
		whereClauseESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.EVENT_FILTER__WHERE_CLAUSE, oldWhereClause, null, oldWhereClauseESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetWhereClause() {
		if (whereClause != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)whereClause).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.EVENT_FILTER__WHERE_CLAUSE, null, msgs);
			msgs = basicUnsetWhereClause(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldWhereClauseESet = whereClauseESet;
			whereClauseESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.EVENT_FILTER__WHERE_CLAUSE, null, null, oldWhereClauseESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetWhereClause() {
		return whereClauseESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.EVENT_FILTER__SELECT_CLAUSES:
				return basicUnsetSelectClauses(msgs);
			case TypesPackage.EVENT_FILTER__WHERE_CLAUSE:
				return basicUnsetWhereClause(msgs);
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
			case TypesPackage.EVENT_FILTER__SELECT_CLAUSES:
				return getSelectClauses();
			case TypesPackage.EVENT_FILTER__WHERE_CLAUSE:
				return getWhereClause();
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
			case TypesPackage.EVENT_FILTER__SELECT_CLAUSES:
				setSelectClauses((ListOfSimpleAttributeOperand)newValue);
				return;
			case TypesPackage.EVENT_FILTER__WHERE_CLAUSE:
				setWhereClause((ContentFilter)newValue);
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
			case TypesPackage.EVENT_FILTER__SELECT_CLAUSES:
				unsetSelectClauses();
				return;
			case TypesPackage.EVENT_FILTER__WHERE_CLAUSE:
				unsetWhereClause();
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
			case TypesPackage.EVENT_FILTER__SELECT_CLAUSES:
				return isSetSelectClauses();
			case TypesPackage.EVENT_FILTER__WHERE_CLAUSE:
				return isSetWhereClause();
		}
		return super.eIsSet(featureID);
	}

} //EventFilterImpl
