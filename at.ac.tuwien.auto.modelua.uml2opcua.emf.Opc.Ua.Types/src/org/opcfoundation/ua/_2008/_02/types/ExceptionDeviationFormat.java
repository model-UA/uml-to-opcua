/**
 */
package org.opcfoundation.ua._2008._02.types;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Exception Deviation Format</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getExceptionDeviationFormat()
 * @model extendedMetaData="name='ExceptionDeviationFormat'"
 * @generated
 */
public enum ExceptionDeviationFormat implements Enumerator {
	/**
	 * The '<em><b>Absolute Value0</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ABSOLUTE_VALUE0_VALUE
	 * @generated
	 * @ordered
	 */
	ABSOLUTE_VALUE0(0, "AbsoluteValue0", "AbsoluteValue_0"),

	/**
	 * The '<em><b>Percent Of Value1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PERCENT_OF_VALUE1_VALUE
	 * @generated
	 * @ordered
	 */
	PERCENT_OF_VALUE1(1, "PercentOfValue1", "PercentOfValue_1"),

	/**
	 * The '<em><b>Percent Of Range2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PERCENT_OF_RANGE2_VALUE
	 * @generated
	 * @ordered
	 */
	PERCENT_OF_RANGE2(2, "PercentOfRange2", "PercentOfRange_2"),

	/**
	 * The '<em><b>Percent Of EU Range3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PERCENT_OF_EU_RANGE3_VALUE
	 * @generated
	 * @ordered
	 */
	PERCENT_OF_EU_RANGE3(3, "PercentOfEURange3", "PercentOfEURange_3"),

	/**
	 * The '<em><b>Unknown4</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNKNOWN4_VALUE
	 * @generated
	 * @ordered
	 */
	UNKNOWN4(4, "Unknown4", "Unknown_4");

	/**
	 * The '<em><b>Absolute Value0</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ABSOLUTE_VALUE0
	 * @model name="AbsoluteValue0" literal="AbsoluteValue_0"
	 * @generated
	 * @ordered
	 */
	public static final int ABSOLUTE_VALUE0_VALUE = 0;

	/**
	 * The '<em><b>Percent Of Value1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PERCENT_OF_VALUE1
	 * @model name="PercentOfValue1" literal="PercentOfValue_1"
	 * @generated
	 * @ordered
	 */
	public static final int PERCENT_OF_VALUE1_VALUE = 1;

	/**
	 * The '<em><b>Percent Of Range2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PERCENT_OF_RANGE2
	 * @model name="PercentOfRange2" literal="PercentOfRange_2"
	 * @generated
	 * @ordered
	 */
	public static final int PERCENT_OF_RANGE2_VALUE = 2;

	/**
	 * The '<em><b>Percent Of EU Range3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PERCENT_OF_EU_RANGE3
	 * @model name="PercentOfEURange3" literal="PercentOfEURange_3"
	 * @generated
	 * @ordered
	 */
	public static final int PERCENT_OF_EU_RANGE3_VALUE = 3;

	/**
	 * The '<em><b>Unknown4</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNKNOWN4
	 * @model name="Unknown4" literal="Unknown_4"
	 * @generated
	 * @ordered
	 */
	public static final int UNKNOWN4_VALUE = 4;

	/**
	 * An array of all the '<em><b>Exception Deviation Format</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ExceptionDeviationFormat[] VALUES_ARRAY =
		new ExceptionDeviationFormat[] {
			ABSOLUTE_VALUE0,
			PERCENT_OF_VALUE1,
			PERCENT_OF_RANGE2,
			PERCENT_OF_EU_RANGE3,
			UNKNOWN4,
		};

	/**
	 * A public read-only list of all the '<em><b>Exception Deviation Format</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ExceptionDeviationFormat> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Exception Deviation Format</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ExceptionDeviationFormat get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ExceptionDeviationFormat result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Exception Deviation Format</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ExceptionDeviationFormat getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ExceptionDeviationFormat result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Exception Deviation Format</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ExceptionDeviationFormat get(int value) {
		switch (value) {
			case ABSOLUTE_VALUE0_VALUE: return ABSOLUTE_VALUE0;
			case PERCENT_OF_VALUE1_VALUE: return PERCENT_OF_VALUE1;
			case PERCENT_OF_RANGE2_VALUE: return PERCENT_OF_RANGE2;
			case PERCENT_OF_EU_RANGE3_VALUE: return PERCENT_OF_EU_RANGE3;
			case UNKNOWN4_VALUE: return UNKNOWN4;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ExceptionDeviationFormat(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //ExceptionDeviationFormat
