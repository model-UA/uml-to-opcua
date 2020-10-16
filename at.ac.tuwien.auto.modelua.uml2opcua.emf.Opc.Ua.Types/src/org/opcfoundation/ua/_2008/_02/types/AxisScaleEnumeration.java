/**
 */
package org.opcfoundation.ua._2008._02.types;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Axis Scale Enumeration</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getAxisScaleEnumeration()
 * @model extendedMetaData="name='AxisScaleEnumeration'"
 * @generated
 */
public enum AxisScaleEnumeration implements Enumerator {
	/**
	 * The '<em><b>Linear0</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LINEAR0_VALUE
	 * @generated
	 * @ordered
	 */
	LINEAR0(0, "Linear0", "Linear_0"),

	/**
	 * The '<em><b>Log1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOG1_VALUE
	 * @generated
	 * @ordered
	 */
	LOG1(1, "Log1", "Log_1"),

	/**
	 * The '<em><b>Ln2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LN2_VALUE
	 * @generated
	 * @ordered
	 */
	LN2(2, "Ln2", "Ln_2");

	/**
	 * The '<em><b>Linear0</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LINEAR0
	 * @model name="Linear0" literal="Linear_0"
	 * @generated
	 * @ordered
	 */
	public static final int LINEAR0_VALUE = 0;

	/**
	 * The '<em><b>Log1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOG1
	 * @model name="Log1" literal="Log_1"
	 * @generated
	 * @ordered
	 */
	public static final int LOG1_VALUE = 1;

	/**
	 * The '<em><b>Ln2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LN2
	 * @model name="Ln2" literal="Ln_2"
	 * @generated
	 * @ordered
	 */
	public static final int LN2_VALUE = 2;

	/**
	 * An array of all the '<em><b>Axis Scale Enumeration</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AxisScaleEnumeration[] VALUES_ARRAY =
		new AxisScaleEnumeration[] {
			LINEAR0,
			LOG1,
			LN2,
		};

	/**
	 * A public read-only list of all the '<em><b>Axis Scale Enumeration</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AxisScaleEnumeration> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Axis Scale Enumeration</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AxisScaleEnumeration get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AxisScaleEnumeration result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Axis Scale Enumeration</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AxisScaleEnumeration getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AxisScaleEnumeration result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Axis Scale Enumeration</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AxisScaleEnumeration get(int value) {
		switch (value) {
			case LINEAR0_VALUE: return LINEAR0;
			case LOG1_VALUE: return LOG1;
			case LN2_VALUE: return LN2;
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
	private AxisScaleEnumeration(int value, String name, String literal) {
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
	
} //AxisScaleEnumeration
