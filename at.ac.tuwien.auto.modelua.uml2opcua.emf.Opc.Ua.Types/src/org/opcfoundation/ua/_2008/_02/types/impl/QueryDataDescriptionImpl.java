/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.opcfoundation.ua._2008._02.types.QueryDataDescription;
import org.opcfoundation.ua._2008._02.types.RelativePath;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Query Data Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.QueryDataDescriptionImpl#getRelativePath <em>Relative Path</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.QueryDataDescriptionImpl#getAttributeId <em>Attribute Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.QueryDataDescriptionImpl#getIndexRange <em>Index Range</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QueryDataDescriptionImpl extends MinimalEObjectImpl.Container implements QueryDataDescription {
	/**
	 * The cached value of the '{@link #getRelativePath() <em>Relative Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelativePath()
	 * @generated
	 * @ordered
	 */
	protected RelativePath relativePath;

	/**
	 * This is true if the Relative Path containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean relativePathESet;

	/**
	 * The default value of the '{@link #getAttributeId() <em>Attribute Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeId()
	 * @generated
	 * @ordered
	 */
	protected static final long ATTRIBUTE_ID_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getAttributeId() <em>Attribute Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeId()
	 * @generated
	 * @ordered
	 */
	protected long attributeId = ATTRIBUTE_ID_EDEFAULT;

	/**
	 * This is true if the Attribute Id attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean attributeIdESet;

	/**
	 * The default value of the '{@link #getIndexRange() <em>Index Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndexRange()
	 * @generated
	 * @ordered
	 */
	protected static final String INDEX_RANGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIndexRange() <em>Index Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndexRange()
	 * @generated
	 * @ordered
	 */
	protected String indexRange = INDEX_RANGE_EDEFAULT;

	/**
	 * This is true if the Index Range attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean indexRangeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QueryDataDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getQueryDataDescription();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelativePath getRelativePath() {
		return relativePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelativePath(RelativePath newRelativePath, NotificationChain msgs) {
		RelativePath oldRelativePath = relativePath;
		relativePath = newRelativePath;
		boolean oldRelativePathESet = relativePathESet;
		relativePathESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.QUERY_DATA_DESCRIPTION__RELATIVE_PATH, oldRelativePath, newRelativePath, !oldRelativePathESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelativePath(RelativePath newRelativePath) {
		if (newRelativePath != relativePath) {
			NotificationChain msgs = null;
			if (relativePath != null)
				msgs = ((InternalEObject)relativePath).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.QUERY_DATA_DESCRIPTION__RELATIVE_PATH, null, msgs);
			if (newRelativePath != null)
				msgs = ((InternalEObject)newRelativePath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.QUERY_DATA_DESCRIPTION__RELATIVE_PATH, null, msgs);
			msgs = basicSetRelativePath(newRelativePath, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldRelativePathESet = relativePathESet;
			relativePathESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.QUERY_DATA_DESCRIPTION__RELATIVE_PATH, newRelativePath, newRelativePath, !oldRelativePathESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetRelativePath(NotificationChain msgs) {
		RelativePath oldRelativePath = relativePath;
		relativePath = null;
		boolean oldRelativePathESet = relativePathESet;
		relativePathESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.QUERY_DATA_DESCRIPTION__RELATIVE_PATH, oldRelativePath, null, oldRelativePathESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRelativePath() {
		if (relativePath != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)relativePath).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.QUERY_DATA_DESCRIPTION__RELATIVE_PATH, null, msgs);
			msgs = basicUnsetRelativePath(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldRelativePathESet = relativePathESet;
			relativePathESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.QUERY_DATA_DESCRIPTION__RELATIVE_PATH, null, null, oldRelativePathESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRelativePath() {
		return relativePathESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getAttributeId() {
		return attributeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributeId(long newAttributeId) {
		long oldAttributeId = attributeId;
		attributeId = newAttributeId;
		boolean oldAttributeIdESet = attributeIdESet;
		attributeIdESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.QUERY_DATA_DESCRIPTION__ATTRIBUTE_ID, oldAttributeId, attributeId, !oldAttributeIdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAttributeId() {
		long oldAttributeId = attributeId;
		boolean oldAttributeIdESet = attributeIdESet;
		attributeId = ATTRIBUTE_ID_EDEFAULT;
		attributeIdESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.QUERY_DATA_DESCRIPTION__ATTRIBUTE_ID, oldAttributeId, ATTRIBUTE_ID_EDEFAULT, oldAttributeIdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAttributeId() {
		return attributeIdESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIndexRange() {
		return indexRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndexRange(String newIndexRange) {
		String oldIndexRange = indexRange;
		indexRange = newIndexRange;
		boolean oldIndexRangeESet = indexRangeESet;
		indexRangeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.QUERY_DATA_DESCRIPTION__INDEX_RANGE, oldIndexRange, indexRange, !oldIndexRangeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIndexRange() {
		String oldIndexRange = indexRange;
		boolean oldIndexRangeESet = indexRangeESet;
		indexRange = INDEX_RANGE_EDEFAULT;
		indexRangeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.QUERY_DATA_DESCRIPTION__INDEX_RANGE, oldIndexRange, INDEX_RANGE_EDEFAULT, oldIndexRangeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIndexRange() {
		return indexRangeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.QUERY_DATA_DESCRIPTION__RELATIVE_PATH:
				return basicUnsetRelativePath(msgs);
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
			case TypesPackage.QUERY_DATA_DESCRIPTION__RELATIVE_PATH:
				return getRelativePath();
			case TypesPackage.QUERY_DATA_DESCRIPTION__ATTRIBUTE_ID:
				return getAttributeId();
			case TypesPackage.QUERY_DATA_DESCRIPTION__INDEX_RANGE:
				return getIndexRange();
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
			case TypesPackage.QUERY_DATA_DESCRIPTION__RELATIVE_PATH:
				setRelativePath((RelativePath)newValue);
				return;
			case TypesPackage.QUERY_DATA_DESCRIPTION__ATTRIBUTE_ID:
				setAttributeId((Long)newValue);
				return;
			case TypesPackage.QUERY_DATA_DESCRIPTION__INDEX_RANGE:
				setIndexRange((String)newValue);
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
			case TypesPackage.QUERY_DATA_DESCRIPTION__RELATIVE_PATH:
				unsetRelativePath();
				return;
			case TypesPackage.QUERY_DATA_DESCRIPTION__ATTRIBUTE_ID:
				unsetAttributeId();
				return;
			case TypesPackage.QUERY_DATA_DESCRIPTION__INDEX_RANGE:
				unsetIndexRange();
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
			case TypesPackage.QUERY_DATA_DESCRIPTION__RELATIVE_PATH:
				return isSetRelativePath();
			case TypesPackage.QUERY_DATA_DESCRIPTION__ATTRIBUTE_ID:
				return isSetAttributeId();
			case TypesPackage.QUERY_DATA_DESCRIPTION__INDEX_RANGE:
				return isSetIndexRange();
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
		result.append(" (attributeId: ");
		if (attributeIdESet) result.append(attributeId); else result.append("<unset>");
		result.append(", indexRange: ");
		if (indexRangeESet) result.append(indexRange); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //QueryDataDescriptionImpl
