/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.opcfoundation.ua._2008._02.types.ListOfQualifiedName;
import org.opcfoundation.ua._2008._02.types.NodeId;
import org.opcfoundation.ua._2008._02.types.PublishedVariableDataType;
import org.opcfoundation.ua._2008._02.types.TypesPackage;
import org.opcfoundation.ua._2008._02.types.Variant;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Published Variable Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.PublishedVariableDataTypeImpl#getPublishedVariable <em>Published Variable</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.PublishedVariableDataTypeImpl#getAttributeId <em>Attribute Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.PublishedVariableDataTypeImpl#getSamplingIntervalHint <em>Sampling Interval Hint</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.PublishedVariableDataTypeImpl#getDeadbandType <em>Deadband Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.PublishedVariableDataTypeImpl#getDeadbandValue <em>Deadband Value</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.PublishedVariableDataTypeImpl#getIndexRange <em>Index Range</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.PublishedVariableDataTypeImpl#getSubstituteValue <em>Substitute Value</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.PublishedVariableDataTypeImpl#getMetaDataProperties <em>Meta Data Properties</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PublishedVariableDataTypeImpl extends MinimalEObjectImpl.Container implements PublishedVariableDataType {
	/**
	 * The cached value of the '{@link #getPublishedVariable() <em>Published Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublishedVariable()
	 * @generated
	 * @ordered
	 */
	protected NodeId publishedVariable;

	/**
	 * This is true if the Published Variable containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean publishedVariableESet;

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
	 * The default value of the '{@link #getSamplingIntervalHint() <em>Sampling Interval Hint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSamplingIntervalHint()
	 * @generated
	 * @ordered
	 */
	protected static final double SAMPLING_INTERVAL_HINT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSamplingIntervalHint() <em>Sampling Interval Hint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSamplingIntervalHint()
	 * @generated
	 * @ordered
	 */
	protected double samplingIntervalHint = SAMPLING_INTERVAL_HINT_EDEFAULT;

	/**
	 * This is true if the Sampling Interval Hint attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean samplingIntervalHintESet;

	/**
	 * The default value of the '{@link #getDeadbandType() <em>Deadband Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeadbandType()
	 * @generated
	 * @ordered
	 */
	protected static final long DEADBAND_TYPE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getDeadbandType() <em>Deadband Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeadbandType()
	 * @generated
	 * @ordered
	 */
	protected long deadbandType = DEADBAND_TYPE_EDEFAULT;

	/**
	 * This is true if the Deadband Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean deadbandTypeESet;

	/**
	 * The default value of the '{@link #getDeadbandValue() <em>Deadband Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeadbandValue()
	 * @generated
	 * @ordered
	 */
	protected static final double DEADBAND_VALUE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDeadbandValue() <em>Deadband Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeadbandValue()
	 * @generated
	 * @ordered
	 */
	protected double deadbandValue = DEADBAND_VALUE_EDEFAULT;

	/**
	 * This is true if the Deadband Value attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean deadbandValueESet;

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
	 * The cached value of the '{@link #getSubstituteValue() <em>Substitute Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubstituteValue()
	 * @generated
	 * @ordered
	 */
	protected Variant substituteValue;

	/**
	 * The cached value of the '{@link #getMetaDataProperties() <em>Meta Data Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetaDataProperties()
	 * @generated
	 * @ordered
	 */
	protected ListOfQualifiedName metaDataProperties;

	/**
	 * This is true if the Meta Data Properties containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean metaDataPropertiesESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PublishedVariableDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getPublishedVariableDataType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeId getPublishedVariable() {
		return publishedVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPublishedVariable(NodeId newPublishedVariable, NotificationChain msgs) {
		NodeId oldPublishedVariable = publishedVariable;
		publishedVariable = newPublishedVariable;
		boolean oldPublishedVariableESet = publishedVariableESet;
		publishedVariableESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.PUBLISHED_VARIABLE_DATA_TYPE__PUBLISHED_VARIABLE, oldPublishedVariable, newPublishedVariable, !oldPublishedVariableESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublishedVariable(NodeId newPublishedVariable) {
		if (newPublishedVariable != publishedVariable) {
			NotificationChain msgs = null;
			if (publishedVariable != null)
				msgs = ((InternalEObject)publishedVariable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.PUBLISHED_VARIABLE_DATA_TYPE__PUBLISHED_VARIABLE, null, msgs);
			if (newPublishedVariable != null)
				msgs = ((InternalEObject)newPublishedVariable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.PUBLISHED_VARIABLE_DATA_TYPE__PUBLISHED_VARIABLE, null, msgs);
			msgs = basicSetPublishedVariable(newPublishedVariable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldPublishedVariableESet = publishedVariableESet;
			publishedVariableESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.PUBLISHED_VARIABLE_DATA_TYPE__PUBLISHED_VARIABLE, newPublishedVariable, newPublishedVariable, !oldPublishedVariableESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetPublishedVariable(NotificationChain msgs) {
		NodeId oldPublishedVariable = publishedVariable;
		publishedVariable = null;
		boolean oldPublishedVariableESet = publishedVariableESet;
		publishedVariableESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.PUBLISHED_VARIABLE_DATA_TYPE__PUBLISHED_VARIABLE, oldPublishedVariable, null, oldPublishedVariableESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPublishedVariable() {
		if (publishedVariable != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)publishedVariable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.PUBLISHED_VARIABLE_DATA_TYPE__PUBLISHED_VARIABLE, null, msgs);
			msgs = basicUnsetPublishedVariable(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldPublishedVariableESet = publishedVariableESet;
			publishedVariableESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.PUBLISHED_VARIABLE_DATA_TYPE__PUBLISHED_VARIABLE, null, null, oldPublishedVariableESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPublishedVariable() {
		return publishedVariableESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.PUBLISHED_VARIABLE_DATA_TYPE__ATTRIBUTE_ID, oldAttributeId, attributeId, !oldAttributeIdESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.PUBLISHED_VARIABLE_DATA_TYPE__ATTRIBUTE_ID, oldAttributeId, ATTRIBUTE_ID_EDEFAULT, oldAttributeIdESet));
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
	public double getSamplingIntervalHint() {
		return samplingIntervalHint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSamplingIntervalHint(double newSamplingIntervalHint) {
		double oldSamplingIntervalHint = samplingIntervalHint;
		samplingIntervalHint = newSamplingIntervalHint;
		boolean oldSamplingIntervalHintESet = samplingIntervalHintESet;
		samplingIntervalHintESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.PUBLISHED_VARIABLE_DATA_TYPE__SAMPLING_INTERVAL_HINT, oldSamplingIntervalHint, samplingIntervalHint, !oldSamplingIntervalHintESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSamplingIntervalHint() {
		double oldSamplingIntervalHint = samplingIntervalHint;
		boolean oldSamplingIntervalHintESet = samplingIntervalHintESet;
		samplingIntervalHint = SAMPLING_INTERVAL_HINT_EDEFAULT;
		samplingIntervalHintESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.PUBLISHED_VARIABLE_DATA_TYPE__SAMPLING_INTERVAL_HINT, oldSamplingIntervalHint, SAMPLING_INTERVAL_HINT_EDEFAULT, oldSamplingIntervalHintESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSamplingIntervalHint() {
		return samplingIntervalHintESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getDeadbandType() {
		return deadbandType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeadbandType(long newDeadbandType) {
		long oldDeadbandType = deadbandType;
		deadbandType = newDeadbandType;
		boolean oldDeadbandTypeESet = deadbandTypeESet;
		deadbandTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.PUBLISHED_VARIABLE_DATA_TYPE__DEADBAND_TYPE, oldDeadbandType, deadbandType, !oldDeadbandTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDeadbandType() {
		long oldDeadbandType = deadbandType;
		boolean oldDeadbandTypeESet = deadbandTypeESet;
		deadbandType = DEADBAND_TYPE_EDEFAULT;
		deadbandTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.PUBLISHED_VARIABLE_DATA_TYPE__DEADBAND_TYPE, oldDeadbandType, DEADBAND_TYPE_EDEFAULT, oldDeadbandTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDeadbandType() {
		return deadbandTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDeadbandValue() {
		return deadbandValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeadbandValue(double newDeadbandValue) {
		double oldDeadbandValue = deadbandValue;
		deadbandValue = newDeadbandValue;
		boolean oldDeadbandValueESet = deadbandValueESet;
		deadbandValueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.PUBLISHED_VARIABLE_DATA_TYPE__DEADBAND_VALUE, oldDeadbandValue, deadbandValue, !oldDeadbandValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDeadbandValue() {
		double oldDeadbandValue = deadbandValue;
		boolean oldDeadbandValueESet = deadbandValueESet;
		deadbandValue = DEADBAND_VALUE_EDEFAULT;
		deadbandValueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.PUBLISHED_VARIABLE_DATA_TYPE__DEADBAND_VALUE, oldDeadbandValue, DEADBAND_VALUE_EDEFAULT, oldDeadbandValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDeadbandValue() {
		return deadbandValueESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.PUBLISHED_VARIABLE_DATA_TYPE__INDEX_RANGE, oldIndexRange, indexRange, !oldIndexRangeESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.PUBLISHED_VARIABLE_DATA_TYPE__INDEX_RANGE, oldIndexRange, INDEX_RANGE_EDEFAULT, oldIndexRangeESet));
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
	public Variant getSubstituteValue() {
		return substituteValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubstituteValue(Variant newSubstituteValue, NotificationChain msgs) {
		Variant oldSubstituteValue = substituteValue;
		substituteValue = newSubstituteValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.PUBLISHED_VARIABLE_DATA_TYPE__SUBSTITUTE_VALUE, oldSubstituteValue, newSubstituteValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubstituteValue(Variant newSubstituteValue) {
		if (newSubstituteValue != substituteValue) {
			NotificationChain msgs = null;
			if (substituteValue != null)
				msgs = ((InternalEObject)substituteValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.PUBLISHED_VARIABLE_DATA_TYPE__SUBSTITUTE_VALUE, null, msgs);
			if (newSubstituteValue != null)
				msgs = ((InternalEObject)newSubstituteValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.PUBLISHED_VARIABLE_DATA_TYPE__SUBSTITUTE_VALUE, null, msgs);
			msgs = basicSetSubstituteValue(newSubstituteValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.PUBLISHED_VARIABLE_DATA_TYPE__SUBSTITUTE_VALUE, newSubstituteValue, newSubstituteValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfQualifiedName getMetaDataProperties() {
		return metaDataProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMetaDataProperties(ListOfQualifiedName newMetaDataProperties, NotificationChain msgs) {
		ListOfQualifiedName oldMetaDataProperties = metaDataProperties;
		metaDataProperties = newMetaDataProperties;
		boolean oldMetaDataPropertiesESet = metaDataPropertiesESet;
		metaDataPropertiesESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.PUBLISHED_VARIABLE_DATA_TYPE__META_DATA_PROPERTIES, oldMetaDataProperties, newMetaDataProperties, !oldMetaDataPropertiesESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetaDataProperties(ListOfQualifiedName newMetaDataProperties) {
		if (newMetaDataProperties != metaDataProperties) {
			NotificationChain msgs = null;
			if (metaDataProperties != null)
				msgs = ((InternalEObject)metaDataProperties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.PUBLISHED_VARIABLE_DATA_TYPE__META_DATA_PROPERTIES, null, msgs);
			if (newMetaDataProperties != null)
				msgs = ((InternalEObject)newMetaDataProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.PUBLISHED_VARIABLE_DATA_TYPE__META_DATA_PROPERTIES, null, msgs);
			msgs = basicSetMetaDataProperties(newMetaDataProperties, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldMetaDataPropertiesESet = metaDataPropertiesESet;
			metaDataPropertiesESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.PUBLISHED_VARIABLE_DATA_TYPE__META_DATA_PROPERTIES, newMetaDataProperties, newMetaDataProperties, !oldMetaDataPropertiesESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetMetaDataProperties(NotificationChain msgs) {
		ListOfQualifiedName oldMetaDataProperties = metaDataProperties;
		metaDataProperties = null;
		boolean oldMetaDataPropertiesESet = metaDataPropertiesESet;
		metaDataPropertiesESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.PUBLISHED_VARIABLE_DATA_TYPE__META_DATA_PROPERTIES, oldMetaDataProperties, null, oldMetaDataPropertiesESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMetaDataProperties() {
		if (metaDataProperties != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)metaDataProperties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.PUBLISHED_VARIABLE_DATA_TYPE__META_DATA_PROPERTIES, null, msgs);
			msgs = basicUnsetMetaDataProperties(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldMetaDataPropertiesESet = metaDataPropertiesESet;
			metaDataPropertiesESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.PUBLISHED_VARIABLE_DATA_TYPE__META_DATA_PROPERTIES, null, null, oldMetaDataPropertiesESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMetaDataProperties() {
		return metaDataPropertiesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.PUBLISHED_VARIABLE_DATA_TYPE__PUBLISHED_VARIABLE:
				return basicUnsetPublishedVariable(msgs);
			case TypesPackage.PUBLISHED_VARIABLE_DATA_TYPE__SUBSTITUTE_VALUE:
				return basicSetSubstituteValue(null, msgs);
			case TypesPackage.PUBLISHED_VARIABLE_DATA_TYPE__META_DATA_PROPERTIES:
				return basicUnsetMetaDataProperties(msgs);
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
			case TypesPackage.PUBLISHED_VARIABLE_DATA_TYPE__PUBLISHED_VARIABLE:
				return getPublishedVariable();
			case TypesPackage.PUBLISHED_VARIABLE_DATA_TYPE__ATTRIBUTE_ID:
				return getAttributeId();
			case TypesPackage.PUBLISHED_VARIABLE_DATA_TYPE__SAMPLING_INTERVAL_HINT:
				return getSamplingIntervalHint();
			case TypesPackage.PUBLISHED_VARIABLE_DATA_TYPE__DEADBAND_TYPE:
				return getDeadbandType();
			case TypesPackage.PUBLISHED_VARIABLE_DATA_TYPE__DEADBAND_VALUE:
				return getDeadbandValue();
			case TypesPackage.PUBLISHED_VARIABLE_DATA_TYPE__INDEX_RANGE:
				return getIndexRange();
			case TypesPackage.PUBLISHED_VARIABLE_DATA_TYPE__SUBSTITUTE_VALUE:
				return getSubstituteValue();
			case TypesPackage.PUBLISHED_VARIABLE_DATA_TYPE__META_DATA_PROPERTIES:
				return getMetaDataProperties();
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
			case TypesPackage.PUBLISHED_VARIABLE_DATA_TYPE__PUBLISHED_VARIABLE:
				setPublishedVariable((NodeId)newValue);
				return;
			case TypesPackage.PUBLISHED_VARIABLE_DATA_TYPE__ATTRIBUTE_ID:
				setAttributeId((Long)newValue);
				return;
			case TypesPackage.PUBLISHED_VARIABLE_DATA_TYPE__SAMPLING_INTERVAL_HINT:
				setSamplingIntervalHint((Double)newValue);
				return;
			case TypesPackage.PUBLISHED_VARIABLE_DATA_TYPE__DEADBAND_TYPE:
				setDeadbandType((Long)newValue);
				return;
			case TypesPackage.PUBLISHED_VARIABLE_DATA_TYPE__DEADBAND_VALUE:
				setDeadbandValue((Double)newValue);
				return;
			case TypesPackage.PUBLISHED_VARIABLE_DATA_TYPE__INDEX_RANGE:
				setIndexRange((String)newValue);
				return;
			case TypesPackage.PUBLISHED_VARIABLE_DATA_TYPE__SUBSTITUTE_VALUE:
				setSubstituteValue((Variant)newValue);
				return;
			case TypesPackage.PUBLISHED_VARIABLE_DATA_TYPE__META_DATA_PROPERTIES:
				setMetaDataProperties((ListOfQualifiedName)newValue);
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
			case TypesPackage.PUBLISHED_VARIABLE_DATA_TYPE__PUBLISHED_VARIABLE:
				unsetPublishedVariable();
				return;
			case TypesPackage.PUBLISHED_VARIABLE_DATA_TYPE__ATTRIBUTE_ID:
				unsetAttributeId();
				return;
			case TypesPackage.PUBLISHED_VARIABLE_DATA_TYPE__SAMPLING_INTERVAL_HINT:
				unsetSamplingIntervalHint();
				return;
			case TypesPackage.PUBLISHED_VARIABLE_DATA_TYPE__DEADBAND_TYPE:
				unsetDeadbandType();
				return;
			case TypesPackage.PUBLISHED_VARIABLE_DATA_TYPE__DEADBAND_VALUE:
				unsetDeadbandValue();
				return;
			case TypesPackage.PUBLISHED_VARIABLE_DATA_TYPE__INDEX_RANGE:
				unsetIndexRange();
				return;
			case TypesPackage.PUBLISHED_VARIABLE_DATA_TYPE__SUBSTITUTE_VALUE:
				setSubstituteValue((Variant)null);
				return;
			case TypesPackage.PUBLISHED_VARIABLE_DATA_TYPE__META_DATA_PROPERTIES:
				unsetMetaDataProperties();
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
			case TypesPackage.PUBLISHED_VARIABLE_DATA_TYPE__PUBLISHED_VARIABLE:
				return isSetPublishedVariable();
			case TypesPackage.PUBLISHED_VARIABLE_DATA_TYPE__ATTRIBUTE_ID:
				return isSetAttributeId();
			case TypesPackage.PUBLISHED_VARIABLE_DATA_TYPE__SAMPLING_INTERVAL_HINT:
				return isSetSamplingIntervalHint();
			case TypesPackage.PUBLISHED_VARIABLE_DATA_TYPE__DEADBAND_TYPE:
				return isSetDeadbandType();
			case TypesPackage.PUBLISHED_VARIABLE_DATA_TYPE__DEADBAND_VALUE:
				return isSetDeadbandValue();
			case TypesPackage.PUBLISHED_VARIABLE_DATA_TYPE__INDEX_RANGE:
				return isSetIndexRange();
			case TypesPackage.PUBLISHED_VARIABLE_DATA_TYPE__SUBSTITUTE_VALUE:
				return substituteValue != null;
			case TypesPackage.PUBLISHED_VARIABLE_DATA_TYPE__META_DATA_PROPERTIES:
				return isSetMetaDataProperties();
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
		result.append(", samplingIntervalHint: ");
		if (samplingIntervalHintESet) result.append(samplingIntervalHint); else result.append("<unset>");
		result.append(", deadbandType: ");
		if (deadbandTypeESet) result.append(deadbandType); else result.append("<unset>");
		result.append(", deadbandValue: ");
		if (deadbandValueESet) result.append(deadbandValue); else result.append("<unset>");
		result.append(", indexRange: ");
		if (indexRangeESet) result.append(indexRange); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //PublishedVariableDataTypeImpl
