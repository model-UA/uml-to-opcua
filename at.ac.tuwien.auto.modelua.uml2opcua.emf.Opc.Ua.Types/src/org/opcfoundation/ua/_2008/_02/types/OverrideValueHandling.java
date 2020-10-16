/**
 */
package org.opcfoundation.ua._2008._02.types;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Override Value Handling</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getOverrideValueHandling()
 * @model extendedMetaData="name='OverrideValueHandling'"
 * @generated
 */
public enum OverrideValueHandling implements Enumerator {
	/**
	 * The '<em><b>Disabled0</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISABLED0_VALUE
	 * @generated
	 * @ordered
	 */
	DISABLED0(0, "Disabled0", "Disabled_0"),

	/**
	 * The '<em><b>Last Usable Value1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LAST_USABLE_VALUE1_VALUE
	 * @generated
	 * @ordered
	 */
	LAST_USABLE_VALUE1(1, "LastUsableValue1", "LastUsableValue_1"),

	/**
	 * The '<em><b>Override Value2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OVERRIDE_VALUE2_VALUE
	 * @generated
	 * @ordered
	 */
	OVERRIDE_VALUE2(2, "OverrideValue2", "OverrideValue_2");

	/**
	 * The '<em><b>Disabled0</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISABLED0
	 * @model name="Disabled0" literal="Disabled_0"
	 * @generated
	 * @ordered
	 */
	public static final int DISABLED0_VALUE = 0;

	/**
	 * The '<em><b>Last Usable Value1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LAST_USABLE_VALUE1
	 * @model name="LastUsableValue1" literal="LastUsableValue_1"
	 * @generated
	 * @ordered
	 */
	public static final int LAST_USABLE_VALUE1_VALUE = 1;

	/**
	 * The '<em><b>Override Value2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OVERRIDE_VALUE2
	 * @model name="OverrideValue2" literal="OverrideValue_2"
	 * @generated
	 * @ordered
	 */
	public static final int OVERRIDE_VALUE2_VALUE = 2;

	/**
	 * An array of all the '<em><b>Override Value Handling</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final OverrideValueHandling[] VALUES_ARRAY =
		new OverrideValueHandling[] {
			DISABLED0,
			LAST_USABLE_VALUE1,
			OVERRIDE_VALUE2,
		};

	/**
	 * A public read-only list of all the '<em><b>Override Value Handling</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<OverrideValueHandling> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Override Value Handling</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OverrideValueHandling get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OverrideValueHandling result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Override Value Handling</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OverrideValueHandling getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OverrideValueHandling result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Override Value Handling</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OverrideValueHandling get(int value) {
		switch (value) {
			case DISABLED0_VALUE: return DISABLED0;
			case LAST_USABLE_VALUE1_VALUE: return LAST_USABLE_VALUE1;
			case OVERRIDE_VALUE2_VALUE: return OVERRIDE_VALUE2;
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
	private OverrideValueHandling(int value, String name, String literal) {
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
	
} //OverrideValueHandling
