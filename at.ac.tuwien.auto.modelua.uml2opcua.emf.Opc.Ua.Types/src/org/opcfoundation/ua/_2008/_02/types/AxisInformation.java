/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Axis Information</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.AxisInformation#getEngineeringUnits <em>Engineering Units</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.AxisInformation#getEURange <em>EU Range</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.AxisInformation#getTitle <em>Title</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.AxisInformation#getAxisScaleType <em>Axis Scale Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.AxisInformation#getAxisSteps <em>Axis Steps</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getAxisInformation()
 * @model extendedMetaData="name='AxisInformation' kind='elementOnly'"
 * @generated
 */
public interface AxisInformation extends EObject {
	/**
	 * Returns the value of the '<em><b>Engineering Units</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Engineering Units</em>' containment reference.
	 * @see #isSetEngineeringUnits()
	 * @see #unsetEngineeringUnits()
	 * @see #setEngineeringUnits(EUInformation)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getAxisInformation_EngineeringUnits()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='EngineeringUnits' namespace='##targetNamespace'"
	 * @generated
	 */
	EUInformation getEngineeringUnits();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.AxisInformation#getEngineeringUnits <em>Engineering Units</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Engineering Units</em>' containment reference.
	 * @see #isSetEngineeringUnits()
	 * @see #unsetEngineeringUnits()
	 * @see #getEngineeringUnits()
	 * @generated
	 */
	void setEngineeringUnits(EUInformation value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.AxisInformation#getEngineeringUnits <em>Engineering Units</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEngineeringUnits()
	 * @see #getEngineeringUnits()
	 * @see #setEngineeringUnits(EUInformation)
	 * @generated
	 */
	void unsetEngineeringUnits();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.AxisInformation#getEngineeringUnits <em>Engineering Units</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Engineering Units</em>' containment reference is set.
	 * @see #unsetEngineeringUnits()
	 * @see #getEngineeringUnits()
	 * @see #setEngineeringUnits(EUInformation)
	 * @generated
	 */
	boolean isSetEngineeringUnits();

	/**
	 * Returns the value of the '<em><b>EU Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EU Range</em>' containment reference.
	 * @see #isSetEURange()
	 * @see #unsetEURange()
	 * @see #setEURange(Range)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getAxisInformation_EURange()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='EURange' namespace='##targetNamespace'"
	 * @generated
	 */
	Range getEURange();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.AxisInformation#getEURange <em>EU Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EU Range</em>' containment reference.
	 * @see #isSetEURange()
	 * @see #unsetEURange()
	 * @see #getEURange()
	 * @generated
	 */
	void setEURange(Range value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.AxisInformation#getEURange <em>EU Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEURange()
	 * @see #getEURange()
	 * @see #setEURange(Range)
	 * @generated
	 */
	void unsetEURange();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.AxisInformation#getEURange <em>EU Range</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>EU Range</em>' containment reference is set.
	 * @see #unsetEURange()
	 * @see #getEURange()
	 * @see #setEURange(Range)
	 * @generated
	 */
	boolean isSetEURange();

	/**
	 * Returns the value of the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' containment reference.
	 * @see #isSetTitle()
	 * @see #unsetTitle()
	 * @see #setTitle(LocalizedText)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getAxisInformation_Title()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='Title' namespace='##targetNamespace'"
	 * @generated
	 */
	LocalizedText getTitle();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.AxisInformation#getTitle <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' containment reference.
	 * @see #isSetTitle()
	 * @see #unsetTitle()
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(LocalizedText value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.AxisInformation#getTitle <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTitle()
	 * @see #getTitle()
	 * @see #setTitle(LocalizedText)
	 * @generated
	 */
	void unsetTitle();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.AxisInformation#getTitle <em>Title</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Title</em>' containment reference is set.
	 * @see #unsetTitle()
	 * @see #getTitle()
	 * @see #setTitle(LocalizedText)
	 * @generated
	 */
	boolean isSetTitle();

	/**
	 * Returns the value of the '<em><b>Axis Scale Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.opcfoundation.ua._2008._02.types.AxisScaleEnumeration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Axis Scale Type</em>' attribute.
	 * @see org.opcfoundation.ua._2008._02.types.AxisScaleEnumeration
	 * @see #isSetAxisScaleType()
	 * @see #unsetAxisScaleType()
	 * @see #setAxisScaleType(AxisScaleEnumeration)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getAxisInformation_AxisScaleType()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='AxisScaleType' namespace='##targetNamespace'"
	 * @generated
	 */
	AxisScaleEnumeration getAxisScaleType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.AxisInformation#getAxisScaleType <em>Axis Scale Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Axis Scale Type</em>' attribute.
	 * @see org.opcfoundation.ua._2008._02.types.AxisScaleEnumeration
	 * @see #isSetAxisScaleType()
	 * @see #unsetAxisScaleType()
	 * @see #getAxisScaleType()
	 * @generated
	 */
	void setAxisScaleType(AxisScaleEnumeration value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.AxisInformation#getAxisScaleType <em>Axis Scale Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAxisScaleType()
	 * @see #getAxisScaleType()
	 * @see #setAxisScaleType(AxisScaleEnumeration)
	 * @generated
	 */
	void unsetAxisScaleType();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.AxisInformation#getAxisScaleType <em>Axis Scale Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Axis Scale Type</em>' attribute is set.
	 * @see #unsetAxisScaleType()
	 * @see #getAxisScaleType()
	 * @see #setAxisScaleType(AxisScaleEnumeration)
	 * @generated
	 */
	boolean isSetAxisScaleType();

	/**
	 * Returns the value of the '<em><b>Axis Steps</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Axis Steps</em>' containment reference.
	 * @see #isSetAxisSteps()
	 * @see #unsetAxisSteps()
	 * @see #setAxisSteps(ListOfDouble)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getAxisInformation_AxisSteps()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='AxisSteps' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfDouble getAxisSteps();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.AxisInformation#getAxisSteps <em>Axis Steps</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Axis Steps</em>' containment reference.
	 * @see #isSetAxisSteps()
	 * @see #unsetAxisSteps()
	 * @see #getAxisSteps()
	 * @generated
	 */
	void setAxisSteps(ListOfDouble value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.AxisInformation#getAxisSteps <em>Axis Steps</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAxisSteps()
	 * @see #getAxisSteps()
	 * @see #setAxisSteps(ListOfDouble)
	 * @generated
	 */
	void unsetAxisSteps();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.AxisInformation#getAxisSteps <em>Axis Steps</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Axis Steps</em>' containment reference is set.
	 * @see #unsetAxisSteps()
	 * @see #getAxisSteps()
	 * @see #setAxisSteps(ListOfDouble)
	 * @generated
	 */
	boolean isSetAxisSteps();

} // AxisInformation
