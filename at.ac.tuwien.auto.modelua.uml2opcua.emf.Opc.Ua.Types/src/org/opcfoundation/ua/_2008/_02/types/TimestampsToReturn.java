/**
 */
package org.opcfoundation.ua._2008._02.types;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Timestamps To Return</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getTimestampsToReturn()
 * @model extendedMetaData="name='TimestampsToReturn'"
 * @generated
 */
public enum TimestampsToReturn implements Enumerator {
	/**
	 * The '<em><b>Source0</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOURCE0_VALUE
	 * @generated
	 * @ordered
	 */
	SOURCE0(0, "Source0", "Source_0"),

	/**
	 * The '<em><b>Server1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SERVER1_VALUE
	 * @generated
	 * @ordered
	 */
	SERVER1(1, "Server1", "Server_1"),

	/**
	 * The '<em><b>Both2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOTH2_VALUE
	 * @generated
	 * @ordered
	 */
	BOTH2(2, "Both2", "Both_2"),

	/**
	 * The '<em><b>Neither3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEITHER3_VALUE
	 * @generated
	 * @ordered
	 */
	NEITHER3(3, "Neither3", "Neither_3"),

	/**
	 * The '<em><b>Invalid4</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INVALID4_VALUE
	 * @generated
	 * @ordered
	 */
	INVALID4(4, "Invalid4", "Invalid_4");

	/**
	 * The '<em><b>Source0</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOURCE0
	 * @model name="Source0" literal="Source_0"
	 * @generated
	 * @ordered
	 */
	public static final int SOURCE0_VALUE = 0;

	/**
	 * The '<em><b>Server1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SERVER1
	 * @model name="Server1" literal="Server_1"
	 * @generated
	 * @ordered
	 */
	public static final int SERVER1_VALUE = 1;

	/**
	 * The '<em><b>Both2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOTH2
	 * @model name="Both2" literal="Both_2"
	 * @generated
	 * @ordered
	 */
	public static final int BOTH2_VALUE = 2;

	/**
	 * The '<em><b>Neither3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEITHER3
	 * @model name="Neither3" literal="Neither_3"
	 * @generated
	 * @ordered
	 */
	public static final int NEITHER3_VALUE = 3;

	/**
	 * The '<em><b>Invalid4</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INVALID4
	 * @model name="Invalid4" literal="Invalid_4"
	 * @generated
	 * @ordered
	 */
	public static final int INVALID4_VALUE = 4;

	/**
	 * An array of all the '<em><b>Timestamps To Return</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TimestampsToReturn[] VALUES_ARRAY =
		new TimestampsToReturn[] {
			SOURCE0,
			SERVER1,
			BOTH2,
			NEITHER3,
			INVALID4,
		};

	/**
	 * A public read-only list of all the '<em><b>Timestamps To Return</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TimestampsToReturn> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Timestamps To Return</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TimestampsToReturn get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TimestampsToReturn result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Timestamps To Return</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TimestampsToReturn getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TimestampsToReturn result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Timestamps To Return</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TimestampsToReturn get(int value) {
		switch (value) {
			case SOURCE0_VALUE: return SOURCE0;
			case SERVER1_VALUE: return SERVER1;
			case BOTH2_VALUE: return BOTH2;
			case NEITHER3_VALUE: return NEITHER3;
			case INVALID4_VALUE: return INVALID4;
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
	private TimestampsToReturn(int value, String name, String literal) {
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
	
} //TimestampsToReturn
