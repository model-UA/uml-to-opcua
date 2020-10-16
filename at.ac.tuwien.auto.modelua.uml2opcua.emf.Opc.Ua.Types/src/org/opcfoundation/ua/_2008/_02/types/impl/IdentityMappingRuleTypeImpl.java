/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.opcfoundation.ua._2008._02.types.IdentityCriteriaType;
import org.opcfoundation.ua._2008._02.types.IdentityMappingRuleType;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Identity Mapping Rule Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.IdentityMappingRuleTypeImpl#getCriteriaType <em>Criteria Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.IdentityMappingRuleTypeImpl#getCriteria <em>Criteria</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IdentityMappingRuleTypeImpl extends MinimalEObjectImpl.Container implements IdentityMappingRuleType {
	/**
	 * The default value of the '{@link #getCriteriaType() <em>Criteria Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCriteriaType()
	 * @generated
	 * @ordered
	 */
	protected static final IdentityCriteriaType CRITERIA_TYPE_EDEFAULT = IdentityCriteriaType.USER_NAME1;

	/**
	 * The cached value of the '{@link #getCriteriaType() <em>Criteria Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCriteriaType()
	 * @generated
	 * @ordered
	 */
	protected IdentityCriteriaType criteriaType = CRITERIA_TYPE_EDEFAULT;

	/**
	 * This is true if the Criteria Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean criteriaTypeESet;

	/**
	 * The default value of the '{@link #getCriteria() <em>Criteria</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCriteria()
	 * @generated
	 * @ordered
	 */
	protected static final String CRITERIA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCriteria() <em>Criteria</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCriteria()
	 * @generated
	 * @ordered
	 */
	protected String criteria = CRITERIA_EDEFAULT;

	/**
	 * This is true if the Criteria attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean criteriaESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IdentityMappingRuleTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getIdentityMappingRuleType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentityCriteriaType getCriteriaType() {
		return criteriaType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCriteriaType(IdentityCriteriaType newCriteriaType) {
		IdentityCriteriaType oldCriteriaType = criteriaType;
		criteriaType = newCriteriaType == null ? CRITERIA_TYPE_EDEFAULT : newCriteriaType;
		boolean oldCriteriaTypeESet = criteriaTypeESet;
		criteriaTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.IDENTITY_MAPPING_RULE_TYPE__CRITERIA_TYPE, oldCriteriaType, criteriaType, !oldCriteriaTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCriteriaType() {
		IdentityCriteriaType oldCriteriaType = criteriaType;
		boolean oldCriteriaTypeESet = criteriaTypeESet;
		criteriaType = CRITERIA_TYPE_EDEFAULT;
		criteriaTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.IDENTITY_MAPPING_RULE_TYPE__CRITERIA_TYPE, oldCriteriaType, CRITERIA_TYPE_EDEFAULT, oldCriteriaTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCriteriaType() {
		return criteriaTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCriteria() {
		return criteria;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCriteria(String newCriteria) {
		String oldCriteria = criteria;
		criteria = newCriteria;
		boolean oldCriteriaESet = criteriaESet;
		criteriaESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.IDENTITY_MAPPING_RULE_TYPE__CRITERIA, oldCriteria, criteria, !oldCriteriaESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCriteria() {
		String oldCriteria = criteria;
		boolean oldCriteriaESet = criteriaESet;
		criteria = CRITERIA_EDEFAULT;
		criteriaESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.IDENTITY_MAPPING_RULE_TYPE__CRITERIA, oldCriteria, CRITERIA_EDEFAULT, oldCriteriaESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCriteria() {
		return criteriaESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TypesPackage.IDENTITY_MAPPING_RULE_TYPE__CRITERIA_TYPE:
				return getCriteriaType();
			case TypesPackage.IDENTITY_MAPPING_RULE_TYPE__CRITERIA:
				return getCriteria();
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
			case TypesPackage.IDENTITY_MAPPING_RULE_TYPE__CRITERIA_TYPE:
				setCriteriaType((IdentityCriteriaType)newValue);
				return;
			case TypesPackage.IDENTITY_MAPPING_RULE_TYPE__CRITERIA:
				setCriteria((String)newValue);
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
			case TypesPackage.IDENTITY_MAPPING_RULE_TYPE__CRITERIA_TYPE:
				unsetCriteriaType();
				return;
			case TypesPackage.IDENTITY_MAPPING_RULE_TYPE__CRITERIA:
				unsetCriteria();
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
			case TypesPackage.IDENTITY_MAPPING_RULE_TYPE__CRITERIA_TYPE:
				return isSetCriteriaType();
			case TypesPackage.IDENTITY_MAPPING_RULE_TYPE__CRITERIA:
				return isSetCriteria();
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
		result.append(" (criteriaType: ");
		if (criteriaTypeESet) result.append(criteriaType); else result.append("<unset>");
		result.append(", criteria: ");
		if (criteriaESet) result.append(criteria); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IdentityMappingRuleTypeImpl
