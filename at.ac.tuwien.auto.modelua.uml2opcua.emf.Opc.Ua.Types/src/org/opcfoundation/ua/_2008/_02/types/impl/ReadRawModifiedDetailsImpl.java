/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.opcfoundation.ua._2008._02.types.ReadRawModifiedDetails;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Read Raw Modified Details</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ReadRawModifiedDetailsImpl#isIsReadModified <em>Is Read Modified</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ReadRawModifiedDetailsImpl#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ReadRawModifiedDetailsImpl#getEndTime <em>End Time</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ReadRawModifiedDetailsImpl#getNumValuesPerNode <em>Num Values Per Node</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ReadRawModifiedDetailsImpl#isReturnBounds <em>Return Bounds</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReadRawModifiedDetailsImpl extends HistoryReadDetailsImpl implements ReadRawModifiedDetails {
	/**
	 * The default value of the '{@link #isIsReadModified() <em>Is Read Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsReadModified()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_READ_MODIFIED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsReadModified() <em>Is Read Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsReadModified()
	 * @generated
	 * @ordered
	 */
	protected boolean isReadModified = IS_READ_MODIFIED_EDEFAULT;

	/**
	 * This is true if the Is Read Modified attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isReadModifiedESet;

	/**
	 * The default value of the '{@link #getStartTime() <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartTime()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar START_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartTime() <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartTime()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar startTime = START_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndTime() <em>End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndTime()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar END_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndTime() <em>End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndTime()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar endTime = END_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumValuesPerNode() <em>Num Values Per Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumValuesPerNode()
	 * @generated
	 * @ordered
	 */
	protected static final long NUM_VALUES_PER_NODE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNumValuesPerNode() <em>Num Values Per Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumValuesPerNode()
	 * @generated
	 * @ordered
	 */
	protected long numValuesPerNode = NUM_VALUES_PER_NODE_EDEFAULT;

	/**
	 * This is true if the Num Values Per Node attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean numValuesPerNodeESet;

	/**
	 * The default value of the '{@link #isReturnBounds() <em>Return Bounds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReturnBounds()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RETURN_BOUNDS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isReturnBounds() <em>Return Bounds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReturnBounds()
	 * @generated
	 * @ordered
	 */
	protected boolean returnBounds = RETURN_BOUNDS_EDEFAULT;

	/**
	 * This is true if the Return Bounds attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean returnBoundsESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReadRawModifiedDetailsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getReadRawModifiedDetails();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsReadModified() {
		return isReadModified;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsReadModified(boolean newIsReadModified) {
		boolean oldIsReadModified = isReadModified;
		isReadModified = newIsReadModified;
		boolean oldIsReadModifiedESet = isReadModifiedESet;
		isReadModifiedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.READ_RAW_MODIFIED_DETAILS__IS_READ_MODIFIED, oldIsReadModified, isReadModified, !oldIsReadModifiedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsReadModified() {
		boolean oldIsReadModified = isReadModified;
		boolean oldIsReadModifiedESet = isReadModifiedESet;
		isReadModified = IS_READ_MODIFIED_EDEFAULT;
		isReadModifiedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.READ_RAW_MODIFIED_DETAILS__IS_READ_MODIFIED, oldIsReadModified, IS_READ_MODIFIED_EDEFAULT, oldIsReadModifiedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsReadModified() {
		return isReadModifiedESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getStartTime() {
		return startTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartTime(XMLGregorianCalendar newStartTime) {
		XMLGregorianCalendar oldStartTime = startTime;
		startTime = newStartTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.READ_RAW_MODIFIED_DETAILS__START_TIME, oldStartTime, startTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getEndTime() {
		return endTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndTime(XMLGregorianCalendar newEndTime) {
		XMLGregorianCalendar oldEndTime = endTime;
		endTime = newEndTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.READ_RAW_MODIFIED_DETAILS__END_TIME, oldEndTime, endTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNumValuesPerNode() {
		return numValuesPerNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumValuesPerNode(long newNumValuesPerNode) {
		long oldNumValuesPerNode = numValuesPerNode;
		numValuesPerNode = newNumValuesPerNode;
		boolean oldNumValuesPerNodeESet = numValuesPerNodeESet;
		numValuesPerNodeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.READ_RAW_MODIFIED_DETAILS__NUM_VALUES_PER_NODE, oldNumValuesPerNode, numValuesPerNode, !oldNumValuesPerNodeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNumValuesPerNode() {
		long oldNumValuesPerNode = numValuesPerNode;
		boolean oldNumValuesPerNodeESet = numValuesPerNodeESet;
		numValuesPerNode = NUM_VALUES_PER_NODE_EDEFAULT;
		numValuesPerNodeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.READ_RAW_MODIFIED_DETAILS__NUM_VALUES_PER_NODE, oldNumValuesPerNode, NUM_VALUES_PER_NODE_EDEFAULT, oldNumValuesPerNodeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNumValuesPerNode() {
		return numValuesPerNodeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isReturnBounds() {
		return returnBounds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnBounds(boolean newReturnBounds) {
		boolean oldReturnBounds = returnBounds;
		returnBounds = newReturnBounds;
		boolean oldReturnBoundsESet = returnBoundsESet;
		returnBoundsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.READ_RAW_MODIFIED_DETAILS__RETURN_BOUNDS, oldReturnBounds, returnBounds, !oldReturnBoundsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetReturnBounds() {
		boolean oldReturnBounds = returnBounds;
		boolean oldReturnBoundsESet = returnBoundsESet;
		returnBounds = RETURN_BOUNDS_EDEFAULT;
		returnBoundsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.READ_RAW_MODIFIED_DETAILS__RETURN_BOUNDS, oldReturnBounds, RETURN_BOUNDS_EDEFAULT, oldReturnBoundsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetReturnBounds() {
		return returnBoundsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TypesPackage.READ_RAW_MODIFIED_DETAILS__IS_READ_MODIFIED:
				return isIsReadModified();
			case TypesPackage.READ_RAW_MODIFIED_DETAILS__START_TIME:
				return getStartTime();
			case TypesPackage.READ_RAW_MODIFIED_DETAILS__END_TIME:
				return getEndTime();
			case TypesPackage.READ_RAW_MODIFIED_DETAILS__NUM_VALUES_PER_NODE:
				return getNumValuesPerNode();
			case TypesPackage.READ_RAW_MODIFIED_DETAILS__RETURN_BOUNDS:
				return isReturnBounds();
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
			case TypesPackage.READ_RAW_MODIFIED_DETAILS__IS_READ_MODIFIED:
				setIsReadModified((Boolean)newValue);
				return;
			case TypesPackage.READ_RAW_MODIFIED_DETAILS__START_TIME:
				setStartTime((XMLGregorianCalendar)newValue);
				return;
			case TypesPackage.READ_RAW_MODIFIED_DETAILS__END_TIME:
				setEndTime((XMLGregorianCalendar)newValue);
				return;
			case TypesPackage.READ_RAW_MODIFIED_DETAILS__NUM_VALUES_PER_NODE:
				setNumValuesPerNode((Long)newValue);
				return;
			case TypesPackage.READ_RAW_MODIFIED_DETAILS__RETURN_BOUNDS:
				setReturnBounds((Boolean)newValue);
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
			case TypesPackage.READ_RAW_MODIFIED_DETAILS__IS_READ_MODIFIED:
				unsetIsReadModified();
				return;
			case TypesPackage.READ_RAW_MODIFIED_DETAILS__START_TIME:
				setStartTime(START_TIME_EDEFAULT);
				return;
			case TypesPackage.READ_RAW_MODIFIED_DETAILS__END_TIME:
				setEndTime(END_TIME_EDEFAULT);
				return;
			case TypesPackage.READ_RAW_MODIFIED_DETAILS__NUM_VALUES_PER_NODE:
				unsetNumValuesPerNode();
				return;
			case TypesPackage.READ_RAW_MODIFIED_DETAILS__RETURN_BOUNDS:
				unsetReturnBounds();
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
			case TypesPackage.READ_RAW_MODIFIED_DETAILS__IS_READ_MODIFIED:
				return isSetIsReadModified();
			case TypesPackage.READ_RAW_MODIFIED_DETAILS__START_TIME:
				return START_TIME_EDEFAULT == null ? startTime != null : !START_TIME_EDEFAULT.equals(startTime);
			case TypesPackage.READ_RAW_MODIFIED_DETAILS__END_TIME:
				return END_TIME_EDEFAULT == null ? endTime != null : !END_TIME_EDEFAULT.equals(endTime);
			case TypesPackage.READ_RAW_MODIFIED_DETAILS__NUM_VALUES_PER_NODE:
				return isSetNumValuesPerNode();
			case TypesPackage.READ_RAW_MODIFIED_DETAILS__RETURN_BOUNDS:
				return isSetReturnBounds();
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
		result.append(" (isReadModified: ");
		if (isReadModifiedESet) result.append(isReadModified); else result.append("<unset>");
		result.append(", startTime: ");
		result.append(startTime);
		result.append(", endTime: ");
		result.append(endTime);
		result.append(", numValuesPerNode: ");
		if (numValuesPerNodeESet) result.append(numValuesPerNode); else result.append("<unset>");
		result.append(", returnBounds: ");
		if (returnBoundsESet) result.append(returnBounds); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ReadRawModifiedDetailsImpl
