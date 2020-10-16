/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.opcfoundation.ua._2008._02.types.ContentFilterResult;
import org.opcfoundation.ua._2008._02.types.ListOfContentFilterElementResult;
import org.opcfoundation.ua._2008._02.types.ListOfDiagnosticInfo;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Content Filter Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ContentFilterResultImpl#getElementResults <em>Element Results</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ContentFilterResultImpl#getElementDiagnosticInfos <em>Element Diagnostic Infos</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContentFilterResultImpl extends MinimalEObjectImpl.Container implements ContentFilterResult {
	/**
	 * The cached value of the '{@link #getElementResults() <em>Element Results</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementResults()
	 * @generated
	 * @ordered
	 */
	protected ListOfContentFilterElementResult elementResults;

	/**
	 * This is true if the Element Results containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean elementResultsESet;

	/**
	 * The cached value of the '{@link #getElementDiagnosticInfos() <em>Element Diagnostic Infos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementDiagnosticInfos()
	 * @generated
	 * @ordered
	 */
	protected ListOfDiagnosticInfo elementDiagnosticInfos;

	/**
	 * This is true if the Element Diagnostic Infos containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean elementDiagnosticInfosESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContentFilterResultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getContentFilterResult();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfContentFilterElementResult getElementResults() {
		return elementResults;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElementResults(ListOfContentFilterElementResult newElementResults, NotificationChain msgs) {
		ListOfContentFilterElementResult oldElementResults = elementResults;
		elementResults = newElementResults;
		boolean oldElementResultsESet = elementResultsESet;
		elementResultsESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.CONTENT_FILTER_RESULT__ELEMENT_RESULTS, oldElementResults, newElementResults, !oldElementResultsESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElementResults(ListOfContentFilterElementResult newElementResults) {
		if (newElementResults != elementResults) {
			NotificationChain msgs = null;
			if (elementResults != null)
				msgs = ((InternalEObject)elementResults).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.CONTENT_FILTER_RESULT__ELEMENT_RESULTS, null, msgs);
			if (newElementResults != null)
				msgs = ((InternalEObject)newElementResults).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.CONTENT_FILTER_RESULT__ELEMENT_RESULTS, null, msgs);
			msgs = basicSetElementResults(newElementResults, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldElementResultsESet = elementResultsESet;
			elementResultsESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.CONTENT_FILTER_RESULT__ELEMENT_RESULTS, newElementResults, newElementResults, !oldElementResultsESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetElementResults(NotificationChain msgs) {
		ListOfContentFilterElementResult oldElementResults = elementResults;
		elementResults = null;
		boolean oldElementResultsESet = elementResultsESet;
		elementResultsESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.CONTENT_FILTER_RESULT__ELEMENT_RESULTS, oldElementResults, null, oldElementResultsESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetElementResults() {
		if (elementResults != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)elementResults).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.CONTENT_FILTER_RESULT__ELEMENT_RESULTS, null, msgs);
			msgs = basicUnsetElementResults(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldElementResultsESet = elementResultsESet;
			elementResultsESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.CONTENT_FILTER_RESULT__ELEMENT_RESULTS, null, null, oldElementResultsESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetElementResults() {
		return elementResultsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfDiagnosticInfo getElementDiagnosticInfos() {
		return elementDiagnosticInfos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElementDiagnosticInfos(ListOfDiagnosticInfo newElementDiagnosticInfos, NotificationChain msgs) {
		ListOfDiagnosticInfo oldElementDiagnosticInfos = elementDiagnosticInfos;
		elementDiagnosticInfos = newElementDiagnosticInfos;
		boolean oldElementDiagnosticInfosESet = elementDiagnosticInfosESet;
		elementDiagnosticInfosESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.CONTENT_FILTER_RESULT__ELEMENT_DIAGNOSTIC_INFOS, oldElementDiagnosticInfos, newElementDiagnosticInfos, !oldElementDiagnosticInfosESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElementDiagnosticInfos(ListOfDiagnosticInfo newElementDiagnosticInfos) {
		if (newElementDiagnosticInfos != elementDiagnosticInfos) {
			NotificationChain msgs = null;
			if (elementDiagnosticInfos != null)
				msgs = ((InternalEObject)elementDiagnosticInfos).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.CONTENT_FILTER_RESULT__ELEMENT_DIAGNOSTIC_INFOS, null, msgs);
			if (newElementDiagnosticInfos != null)
				msgs = ((InternalEObject)newElementDiagnosticInfos).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.CONTENT_FILTER_RESULT__ELEMENT_DIAGNOSTIC_INFOS, null, msgs);
			msgs = basicSetElementDiagnosticInfos(newElementDiagnosticInfos, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldElementDiagnosticInfosESet = elementDiagnosticInfosESet;
			elementDiagnosticInfosESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.CONTENT_FILTER_RESULT__ELEMENT_DIAGNOSTIC_INFOS, newElementDiagnosticInfos, newElementDiagnosticInfos, !oldElementDiagnosticInfosESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetElementDiagnosticInfos(NotificationChain msgs) {
		ListOfDiagnosticInfo oldElementDiagnosticInfos = elementDiagnosticInfos;
		elementDiagnosticInfos = null;
		boolean oldElementDiagnosticInfosESet = elementDiagnosticInfosESet;
		elementDiagnosticInfosESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.CONTENT_FILTER_RESULT__ELEMENT_DIAGNOSTIC_INFOS, oldElementDiagnosticInfos, null, oldElementDiagnosticInfosESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetElementDiagnosticInfos() {
		if (elementDiagnosticInfos != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)elementDiagnosticInfos).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.CONTENT_FILTER_RESULT__ELEMENT_DIAGNOSTIC_INFOS, null, msgs);
			msgs = basicUnsetElementDiagnosticInfos(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldElementDiagnosticInfosESet = elementDiagnosticInfosESet;
			elementDiagnosticInfosESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.CONTENT_FILTER_RESULT__ELEMENT_DIAGNOSTIC_INFOS, null, null, oldElementDiagnosticInfosESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetElementDiagnosticInfos() {
		return elementDiagnosticInfosESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.CONTENT_FILTER_RESULT__ELEMENT_RESULTS:
				return basicUnsetElementResults(msgs);
			case TypesPackage.CONTENT_FILTER_RESULT__ELEMENT_DIAGNOSTIC_INFOS:
				return basicUnsetElementDiagnosticInfos(msgs);
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
			case TypesPackage.CONTENT_FILTER_RESULT__ELEMENT_RESULTS:
				return getElementResults();
			case TypesPackage.CONTENT_FILTER_RESULT__ELEMENT_DIAGNOSTIC_INFOS:
				return getElementDiagnosticInfos();
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
			case TypesPackage.CONTENT_FILTER_RESULT__ELEMENT_RESULTS:
				setElementResults((ListOfContentFilterElementResult)newValue);
				return;
			case TypesPackage.CONTENT_FILTER_RESULT__ELEMENT_DIAGNOSTIC_INFOS:
				setElementDiagnosticInfos((ListOfDiagnosticInfo)newValue);
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
			case TypesPackage.CONTENT_FILTER_RESULT__ELEMENT_RESULTS:
				unsetElementResults();
				return;
			case TypesPackage.CONTENT_FILTER_RESULT__ELEMENT_DIAGNOSTIC_INFOS:
				unsetElementDiagnosticInfos();
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
			case TypesPackage.CONTENT_FILTER_RESULT__ELEMENT_RESULTS:
				return isSetElementResults();
			case TypesPackage.CONTENT_FILTER_RESULT__ELEMENT_DIAGNOSTIC_INFOS:
				return isSetElementDiagnosticInfos();
		}
		return super.eIsSet(featureID);
	}

} //ContentFilterResultImpl
