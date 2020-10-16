/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aggregate Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.AggregateConfiguration#isUseServerCapabilitiesDefaults <em>Use Server Capabilities Defaults</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.AggregateConfiguration#isTreatUncertainAsBad <em>Treat Uncertain As Bad</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.AggregateConfiguration#getPercentDataBad <em>Percent Data Bad</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.AggregateConfiguration#getPercentDataGood <em>Percent Data Good</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.AggregateConfiguration#isUseSlopedExtrapolation <em>Use Sloped Extrapolation</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getAggregateConfiguration()
 * @model extendedMetaData="name='AggregateConfiguration' kind='elementOnly'"
 * @generated
 */
public interface AggregateConfiguration extends EObject {
	/**
	 * Returns the value of the '<em><b>Use Server Capabilities Defaults</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Server Capabilities Defaults</em>' attribute.
	 * @see #isSetUseServerCapabilitiesDefaults()
	 * @see #unsetUseServerCapabilitiesDefaults()
	 * @see #setUseServerCapabilitiesDefaults(boolean)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getAggregateConfiguration_UseServerCapabilitiesDefaults()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='UseServerCapabilitiesDefaults' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isUseServerCapabilitiesDefaults();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.AggregateConfiguration#isUseServerCapabilitiesDefaults <em>Use Server Capabilities Defaults</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Server Capabilities Defaults</em>' attribute.
	 * @see #isSetUseServerCapabilitiesDefaults()
	 * @see #unsetUseServerCapabilitiesDefaults()
	 * @see #isUseServerCapabilitiesDefaults()
	 * @generated
	 */
	void setUseServerCapabilitiesDefaults(boolean value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.AggregateConfiguration#isUseServerCapabilitiesDefaults <em>Use Server Capabilities Defaults</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUseServerCapabilitiesDefaults()
	 * @see #isUseServerCapabilitiesDefaults()
	 * @see #setUseServerCapabilitiesDefaults(boolean)
	 * @generated
	 */
	void unsetUseServerCapabilitiesDefaults();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.AggregateConfiguration#isUseServerCapabilitiesDefaults <em>Use Server Capabilities Defaults</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Use Server Capabilities Defaults</em>' attribute is set.
	 * @see #unsetUseServerCapabilitiesDefaults()
	 * @see #isUseServerCapabilitiesDefaults()
	 * @see #setUseServerCapabilitiesDefaults(boolean)
	 * @generated
	 */
	boolean isSetUseServerCapabilitiesDefaults();

	/**
	 * Returns the value of the '<em><b>Treat Uncertain As Bad</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Treat Uncertain As Bad</em>' attribute.
	 * @see #isSetTreatUncertainAsBad()
	 * @see #unsetTreatUncertainAsBad()
	 * @see #setTreatUncertainAsBad(boolean)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getAggregateConfiguration_TreatUncertainAsBad()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='TreatUncertainAsBad' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isTreatUncertainAsBad();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.AggregateConfiguration#isTreatUncertainAsBad <em>Treat Uncertain As Bad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Treat Uncertain As Bad</em>' attribute.
	 * @see #isSetTreatUncertainAsBad()
	 * @see #unsetTreatUncertainAsBad()
	 * @see #isTreatUncertainAsBad()
	 * @generated
	 */
	void setTreatUncertainAsBad(boolean value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.AggregateConfiguration#isTreatUncertainAsBad <em>Treat Uncertain As Bad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTreatUncertainAsBad()
	 * @see #isTreatUncertainAsBad()
	 * @see #setTreatUncertainAsBad(boolean)
	 * @generated
	 */
	void unsetTreatUncertainAsBad();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.AggregateConfiguration#isTreatUncertainAsBad <em>Treat Uncertain As Bad</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Treat Uncertain As Bad</em>' attribute is set.
	 * @see #unsetTreatUncertainAsBad()
	 * @see #isTreatUncertainAsBad()
	 * @see #setTreatUncertainAsBad(boolean)
	 * @generated
	 */
	boolean isSetTreatUncertainAsBad();

	/**
	 * Returns the value of the '<em><b>Percent Data Bad</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Percent Data Bad</em>' attribute.
	 * @see #isSetPercentDataBad()
	 * @see #unsetPercentDataBad()
	 * @see #setPercentDataBad(short)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getAggregateConfiguration_PercentDataBad()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedByte"
	 *        extendedMetaData="kind='element' name='PercentDataBad' namespace='##targetNamespace'"
	 * @generated
	 */
	short getPercentDataBad();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.AggregateConfiguration#getPercentDataBad <em>Percent Data Bad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Percent Data Bad</em>' attribute.
	 * @see #isSetPercentDataBad()
	 * @see #unsetPercentDataBad()
	 * @see #getPercentDataBad()
	 * @generated
	 */
	void setPercentDataBad(short value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.AggregateConfiguration#getPercentDataBad <em>Percent Data Bad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPercentDataBad()
	 * @see #getPercentDataBad()
	 * @see #setPercentDataBad(short)
	 * @generated
	 */
	void unsetPercentDataBad();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.AggregateConfiguration#getPercentDataBad <em>Percent Data Bad</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Percent Data Bad</em>' attribute is set.
	 * @see #unsetPercentDataBad()
	 * @see #getPercentDataBad()
	 * @see #setPercentDataBad(short)
	 * @generated
	 */
	boolean isSetPercentDataBad();

	/**
	 * Returns the value of the '<em><b>Percent Data Good</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Percent Data Good</em>' attribute.
	 * @see #isSetPercentDataGood()
	 * @see #unsetPercentDataGood()
	 * @see #setPercentDataGood(short)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getAggregateConfiguration_PercentDataGood()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedByte"
	 *        extendedMetaData="kind='element' name='PercentDataGood' namespace='##targetNamespace'"
	 * @generated
	 */
	short getPercentDataGood();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.AggregateConfiguration#getPercentDataGood <em>Percent Data Good</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Percent Data Good</em>' attribute.
	 * @see #isSetPercentDataGood()
	 * @see #unsetPercentDataGood()
	 * @see #getPercentDataGood()
	 * @generated
	 */
	void setPercentDataGood(short value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.AggregateConfiguration#getPercentDataGood <em>Percent Data Good</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPercentDataGood()
	 * @see #getPercentDataGood()
	 * @see #setPercentDataGood(short)
	 * @generated
	 */
	void unsetPercentDataGood();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.AggregateConfiguration#getPercentDataGood <em>Percent Data Good</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Percent Data Good</em>' attribute is set.
	 * @see #unsetPercentDataGood()
	 * @see #getPercentDataGood()
	 * @see #setPercentDataGood(short)
	 * @generated
	 */
	boolean isSetPercentDataGood();

	/**
	 * Returns the value of the '<em><b>Use Sloped Extrapolation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Sloped Extrapolation</em>' attribute.
	 * @see #isSetUseSlopedExtrapolation()
	 * @see #unsetUseSlopedExtrapolation()
	 * @see #setUseSlopedExtrapolation(boolean)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getAggregateConfiguration_UseSlopedExtrapolation()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='UseSlopedExtrapolation' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isUseSlopedExtrapolation();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.AggregateConfiguration#isUseSlopedExtrapolation <em>Use Sloped Extrapolation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Sloped Extrapolation</em>' attribute.
	 * @see #isSetUseSlopedExtrapolation()
	 * @see #unsetUseSlopedExtrapolation()
	 * @see #isUseSlopedExtrapolation()
	 * @generated
	 */
	void setUseSlopedExtrapolation(boolean value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.AggregateConfiguration#isUseSlopedExtrapolation <em>Use Sloped Extrapolation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUseSlopedExtrapolation()
	 * @see #isUseSlopedExtrapolation()
	 * @see #setUseSlopedExtrapolation(boolean)
	 * @generated
	 */
	void unsetUseSlopedExtrapolation();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.AggregateConfiguration#isUseSlopedExtrapolation <em>Use Sloped Extrapolation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Use Sloped Extrapolation</em>' attribute is set.
	 * @see #unsetUseSlopedExtrapolation()
	 * @see #isUseSlopedExtrapolation()
	 * @see #setUseSlopedExtrapolation(boolean)
	 * @generated
	 */
	boolean isSetUseSlopedExtrapolation();

} // AggregateConfiguration
