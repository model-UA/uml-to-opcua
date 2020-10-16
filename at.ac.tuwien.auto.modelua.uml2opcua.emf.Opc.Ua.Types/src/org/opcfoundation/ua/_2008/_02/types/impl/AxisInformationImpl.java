/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.opcfoundation.ua._2008._02.types.AxisInformation;
import org.opcfoundation.ua._2008._02.types.AxisScaleEnumeration;
import org.opcfoundation.ua._2008._02.types.EUInformation;
import org.opcfoundation.ua._2008._02.types.ListOfDouble;
import org.opcfoundation.ua._2008._02.types.LocalizedText;
import org.opcfoundation.ua._2008._02.types.Range;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Axis Information</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.AxisInformationImpl#getEngineeringUnits <em>Engineering Units</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.AxisInformationImpl#getEURange <em>EU Range</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.AxisInformationImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.AxisInformationImpl#getAxisScaleType <em>Axis Scale Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.AxisInformationImpl#getAxisSteps <em>Axis Steps</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AxisInformationImpl extends MinimalEObjectImpl.Container implements AxisInformation {
	/**
	 * The cached value of the '{@link #getEngineeringUnits() <em>Engineering Units</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEngineeringUnits()
	 * @generated
	 * @ordered
	 */
	protected EUInformation engineeringUnits;

	/**
	 * This is true if the Engineering Units containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean engineeringUnitsESet;

	/**
	 * The cached value of the '{@link #getEURange() <em>EU Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEURange()
	 * @generated
	 * @ordered
	 */
	protected Range eURange;

	/**
	 * This is true if the EU Range containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean eURangeESet;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected LocalizedText title;

	/**
	 * This is true if the Title containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean titleESet;

	/**
	 * The default value of the '{@link #getAxisScaleType() <em>Axis Scale Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAxisScaleType()
	 * @generated
	 * @ordered
	 */
	protected static final AxisScaleEnumeration AXIS_SCALE_TYPE_EDEFAULT = AxisScaleEnumeration.LINEAR0;

	/**
	 * The cached value of the '{@link #getAxisScaleType() <em>Axis Scale Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAxisScaleType()
	 * @generated
	 * @ordered
	 */
	protected AxisScaleEnumeration axisScaleType = AXIS_SCALE_TYPE_EDEFAULT;

	/**
	 * This is true if the Axis Scale Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean axisScaleTypeESet;

	/**
	 * The cached value of the '{@link #getAxisSteps() <em>Axis Steps</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAxisSteps()
	 * @generated
	 * @ordered
	 */
	protected ListOfDouble axisSteps;

	/**
	 * This is true if the Axis Steps containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean axisStepsESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AxisInformationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getAxisInformation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EUInformation getEngineeringUnits() {
		return engineeringUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEngineeringUnits(EUInformation newEngineeringUnits, NotificationChain msgs) {
		EUInformation oldEngineeringUnits = engineeringUnits;
		engineeringUnits = newEngineeringUnits;
		boolean oldEngineeringUnitsESet = engineeringUnitsESet;
		engineeringUnitsESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.AXIS_INFORMATION__ENGINEERING_UNITS, oldEngineeringUnits, newEngineeringUnits, !oldEngineeringUnitsESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEngineeringUnits(EUInformation newEngineeringUnits) {
		if (newEngineeringUnits != engineeringUnits) {
			NotificationChain msgs = null;
			if (engineeringUnits != null)
				msgs = ((InternalEObject)engineeringUnits).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.AXIS_INFORMATION__ENGINEERING_UNITS, null, msgs);
			if (newEngineeringUnits != null)
				msgs = ((InternalEObject)newEngineeringUnits).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.AXIS_INFORMATION__ENGINEERING_UNITS, null, msgs);
			msgs = basicSetEngineeringUnits(newEngineeringUnits, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldEngineeringUnitsESet = engineeringUnitsESet;
			engineeringUnitsESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.AXIS_INFORMATION__ENGINEERING_UNITS, newEngineeringUnits, newEngineeringUnits, !oldEngineeringUnitsESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetEngineeringUnits(NotificationChain msgs) {
		EUInformation oldEngineeringUnits = engineeringUnits;
		engineeringUnits = null;
		boolean oldEngineeringUnitsESet = engineeringUnitsESet;
		engineeringUnitsESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.AXIS_INFORMATION__ENGINEERING_UNITS, oldEngineeringUnits, null, oldEngineeringUnitsESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEngineeringUnits() {
		if (engineeringUnits != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)engineeringUnits).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.AXIS_INFORMATION__ENGINEERING_UNITS, null, msgs);
			msgs = basicUnsetEngineeringUnits(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldEngineeringUnitsESet = engineeringUnitsESet;
			engineeringUnitsESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.AXIS_INFORMATION__ENGINEERING_UNITS, null, null, oldEngineeringUnitsESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEngineeringUnits() {
		return engineeringUnitsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Range getEURange() {
		return eURange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEURange(Range newEURange, NotificationChain msgs) {
		Range oldEURange = eURange;
		eURange = newEURange;
		boolean oldEURangeESet = eURangeESet;
		eURangeESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.AXIS_INFORMATION__EU_RANGE, oldEURange, newEURange, !oldEURangeESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEURange(Range newEURange) {
		if (newEURange != eURange) {
			NotificationChain msgs = null;
			if (eURange != null)
				msgs = ((InternalEObject)eURange).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.AXIS_INFORMATION__EU_RANGE, null, msgs);
			if (newEURange != null)
				msgs = ((InternalEObject)newEURange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.AXIS_INFORMATION__EU_RANGE, null, msgs);
			msgs = basicSetEURange(newEURange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldEURangeESet = eURangeESet;
			eURangeESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.AXIS_INFORMATION__EU_RANGE, newEURange, newEURange, !oldEURangeESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetEURange(NotificationChain msgs) {
		Range oldEURange = eURange;
		eURange = null;
		boolean oldEURangeESet = eURangeESet;
		eURangeESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.AXIS_INFORMATION__EU_RANGE, oldEURange, null, oldEURangeESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEURange() {
		if (eURange != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)eURange).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.AXIS_INFORMATION__EU_RANGE, null, msgs);
			msgs = basicUnsetEURange(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldEURangeESet = eURangeESet;
			eURangeESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.AXIS_INFORMATION__EU_RANGE, null, null, oldEURangeESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEURange() {
		return eURangeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalizedText getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTitle(LocalizedText newTitle, NotificationChain msgs) {
		LocalizedText oldTitle = title;
		title = newTitle;
		boolean oldTitleESet = titleESet;
		titleESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.AXIS_INFORMATION__TITLE, oldTitle, newTitle, !oldTitleESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(LocalizedText newTitle) {
		if (newTitle != title) {
			NotificationChain msgs = null;
			if (title != null)
				msgs = ((InternalEObject)title).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.AXIS_INFORMATION__TITLE, null, msgs);
			if (newTitle != null)
				msgs = ((InternalEObject)newTitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.AXIS_INFORMATION__TITLE, null, msgs);
			msgs = basicSetTitle(newTitle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldTitleESet = titleESet;
			titleESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.AXIS_INFORMATION__TITLE, newTitle, newTitle, !oldTitleESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetTitle(NotificationChain msgs) {
		LocalizedText oldTitle = title;
		title = null;
		boolean oldTitleESet = titleESet;
		titleESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.AXIS_INFORMATION__TITLE, oldTitle, null, oldTitleESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTitle() {
		if (title != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)title).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.AXIS_INFORMATION__TITLE, null, msgs);
			msgs = basicUnsetTitle(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldTitleESet = titleESet;
			titleESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.AXIS_INFORMATION__TITLE, null, null, oldTitleESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTitle() {
		return titleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AxisScaleEnumeration getAxisScaleType() {
		return axisScaleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAxisScaleType(AxisScaleEnumeration newAxisScaleType) {
		AxisScaleEnumeration oldAxisScaleType = axisScaleType;
		axisScaleType = newAxisScaleType == null ? AXIS_SCALE_TYPE_EDEFAULT : newAxisScaleType;
		boolean oldAxisScaleTypeESet = axisScaleTypeESet;
		axisScaleTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.AXIS_INFORMATION__AXIS_SCALE_TYPE, oldAxisScaleType, axisScaleType, !oldAxisScaleTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAxisScaleType() {
		AxisScaleEnumeration oldAxisScaleType = axisScaleType;
		boolean oldAxisScaleTypeESet = axisScaleTypeESet;
		axisScaleType = AXIS_SCALE_TYPE_EDEFAULT;
		axisScaleTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.AXIS_INFORMATION__AXIS_SCALE_TYPE, oldAxisScaleType, AXIS_SCALE_TYPE_EDEFAULT, oldAxisScaleTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAxisScaleType() {
		return axisScaleTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfDouble getAxisSteps() {
		return axisSteps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAxisSteps(ListOfDouble newAxisSteps, NotificationChain msgs) {
		ListOfDouble oldAxisSteps = axisSteps;
		axisSteps = newAxisSteps;
		boolean oldAxisStepsESet = axisStepsESet;
		axisStepsESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.AXIS_INFORMATION__AXIS_STEPS, oldAxisSteps, newAxisSteps, !oldAxisStepsESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAxisSteps(ListOfDouble newAxisSteps) {
		if (newAxisSteps != axisSteps) {
			NotificationChain msgs = null;
			if (axisSteps != null)
				msgs = ((InternalEObject)axisSteps).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.AXIS_INFORMATION__AXIS_STEPS, null, msgs);
			if (newAxisSteps != null)
				msgs = ((InternalEObject)newAxisSteps).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.AXIS_INFORMATION__AXIS_STEPS, null, msgs);
			msgs = basicSetAxisSteps(newAxisSteps, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldAxisStepsESet = axisStepsESet;
			axisStepsESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.AXIS_INFORMATION__AXIS_STEPS, newAxisSteps, newAxisSteps, !oldAxisStepsESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetAxisSteps(NotificationChain msgs) {
		ListOfDouble oldAxisSteps = axisSteps;
		axisSteps = null;
		boolean oldAxisStepsESet = axisStepsESet;
		axisStepsESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.AXIS_INFORMATION__AXIS_STEPS, oldAxisSteps, null, oldAxisStepsESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAxisSteps() {
		if (axisSteps != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)axisSteps).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.AXIS_INFORMATION__AXIS_STEPS, null, msgs);
			msgs = basicUnsetAxisSteps(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldAxisStepsESet = axisStepsESet;
			axisStepsESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.AXIS_INFORMATION__AXIS_STEPS, null, null, oldAxisStepsESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAxisSteps() {
		return axisStepsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.AXIS_INFORMATION__ENGINEERING_UNITS:
				return basicUnsetEngineeringUnits(msgs);
			case TypesPackage.AXIS_INFORMATION__EU_RANGE:
				return basicUnsetEURange(msgs);
			case TypesPackage.AXIS_INFORMATION__TITLE:
				return basicUnsetTitle(msgs);
			case TypesPackage.AXIS_INFORMATION__AXIS_STEPS:
				return basicUnsetAxisSteps(msgs);
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
			case TypesPackage.AXIS_INFORMATION__ENGINEERING_UNITS:
				return getEngineeringUnits();
			case TypesPackage.AXIS_INFORMATION__EU_RANGE:
				return getEURange();
			case TypesPackage.AXIS_INFORMATION__TITLE:
				return getTitle();
			case TypesPackage.AXIS_INFORMATION__AXIS_SCALE_TYPE:
				return getAxisScaleType();
			case TypesPackage.AXIS_INFORMATION__AXIS_STEPS:
				return getAxisSteps();
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
			case TypesPackage.AXIS_INFORMATION__ENGINEERING_UNITS:
				setEngineeringUnits((EUInformation)newValue);
				return;
			case TypesPackage.AXIS_INFORMATION__EU_RANGE:
				setEURange((Range)newValue);
				return;
			case TypesPackage.AXIS_INFORMATION__TITLE:
				setTitle((LocalizedText)newValue);
				return;
			case TypesPackage.AXIS_INFORMATION__AXIS_SCALE_TYPE:
				setAxisScaleType((AxisScaleEnumeration)newValue);
				return;
			case TypesPackage.AXIS_INFORMATION__AXIS_STEPS:
				setAxisSteps((ListOfDouble)newValue);
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
			case TypesPackage.AXIS_INFORMATION__ENGINEERING_UNITS:
				unsetEngineeringUnits();
				return;
			case TypesPackage.AXIS_INFORMATION__EU_RANGE:
				unsetEURange();
				return;
			case TypesPackage.AXIS_INFORMATION__TITLE:
				unsetTitle();
				return;
			case TypesPackage.AXIS_INFORMATION__AXIS_SCALE_TYPE:
				unsetAxisScaleType();
				return;
			case TypesPackage.AXIS_INFORMATION__AXIS_STEPS:
				unsetAxisSteps();
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
			case TypesPackage.AXIS_INFORMATION__ENGINEERING_UNITS:
				return isSetEngineeringUnits();
			case TypesPackage.AXIS_INFORMATION__EU_RANGE:
				return isSetEURange();
			case TypesPackage.AXIS_INFORMATION__TITLE:
				return isSetTitle();
			case TypesPackage.AXIS_INFORMATION__AXIS_SCALE_TYPE:
				return isSetAxisScaleType();
			case TypesPackage.AXIS_INFORMATION__AXIS_STEPS:
				return isSetAxisSteps();
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
		result.append(" (axisScaleType: ");
		if (axisScaleTypeESet) result.append(axisScaleType); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //AxisInformationImpl
