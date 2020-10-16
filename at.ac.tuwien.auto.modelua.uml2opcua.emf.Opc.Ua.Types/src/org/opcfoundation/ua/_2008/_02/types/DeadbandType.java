/**
 */
package org.opcfoundation.ua._2008._02.types;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Deadband Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDeadbandType()
 * @model extendedMetaData="name='DeadbandType'"
 * @generated
 */
public enum DeadbandType implements Enumerator {
	/**
	 * The '<em><b>None0</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE0_VALUE
	 * @generated
	 * @ordered
	 */
	NONE0(0, "None0", "None_0"),

	/**
	 * The '<em><b>Absolute1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ABSOLUTE1_VALUE
	 * @generated
	 * @ordered
	 */
	ABSOLUTE1(1, "Absolute1", "Absolute_1"),

	/**
	 * The '<em><b>Percent2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PERCENT2_VALUE
	 * @generated
	 * @ordered
	 */
	PERCENT2(2, "Percent2", "Percent_2");

	/**
	 * The '<em><b>None0</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE0
	 * @model name="None0" literal="None_0"
	 * @generated
	 * @ordered
	 */
	public static final int NONE0_VALUE = 0;

	/**
	 * The '<em><b>Absolute1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ABSOLUTE1
	 * @model name="Absolute1" literal="Absolute_1"
	 * @generated
	 * @ordered
	 */
	public static final int ABSOLUTE1_VALUE = 1;

	/**
	 * The '<em><b>Percent2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PERCENT2
	 * @model name="Percent2" literal="Percent_2"
	 * @generated
	 * @ordered
	 */
	public static final int PERCENT2_VALUE = 2;

	/**
	 * An array of all the '<em><b>Deadband Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DeadbandType[] VALUES_ARRAY =
		new DeadbandType[] {
			NONE0,
			ABSOLUTE1,
			PERCENT2,
		};

	/**
	 * A public read-only list of all the '<em><b>Deadband Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DeadbandType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Deadband Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DeadbandType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DeadbandType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Deadband Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DeadbandType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DeadbandType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Deadband Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DeadbandType get(int value) {
		switch (value) {
			case NONE0_VALUE: return NONE0;
			case ABSOLUTE1_VALUE: return ABSOLUTE1;
			case PERCENT2_VALUE: return PERCENT2;
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
	private DeadbandType(int value, String name, String literal) {
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
	
} //DeadbandType
