/**
 */
package org.opcfoundation.ua._2008._02.types;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Pub Sub State</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getPubSubState()
 * @model extendedMetaData="name='PubSubState'"
 * @generated
 */
public enum PubSubState implements Enumerator {
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
	 * The '<em><b>Paused1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PAUSED1_VALUE
	 * @generated
	 * @ordered
	 */
	PAUSED1(1, "Paused1", "Paused_1"),

	/**
	 * The '<em><b>Operational2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPERATIONAL2_VALUE
	 * @generated
	 * @ordered
	 */
	OPERATIONAL2(2, "Operational2", "Operational_2"),

	/**
	 * The '<em><b>Error3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ERROR3_VALUE
	 * @generated
	 * @ordered
	 */
	ERROR3(3, "Error3", "Error_3");

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
	 * The '<em><b>Paused1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PAUSED1
	 * @model name="Paused1" literal="Paused_1"
	 * @generated
	 * @ordered
	 */
	public static final int PAUSED1_VALUE = 1;

	/**
	 * The '<em><b>Operational2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPERATIONAL2
	 * @model name="Operational2" literal="Operational_2"
	 * @generated
	 * @ordered
	 */
	public static final int OPERATIONAL2_VALUE = 2;

	/**
	 * The '<em><b>Error3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ERROR3
	 * @model name="Error3" literal="Error_3"
	 * @generated
	 * @ordered
	 */
	public static final int ERROR3_VALUE = 3;

	/**
	 * An array of all the '<em><b>Pub Sub State</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PubSubState[] VALUES_ARRAY =
		new PubSubState[] {
			DISABLED0,
			PAUSED1,
			OPERATIONAL2,
			ERROR3,
		};

	/**
	 * A public read-only list of all the '<em><b>Pub Sub State</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PubSubState> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Pub Sub State</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PubSubState get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PubSubState result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Pub Sub State</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PubSubState getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PubSubState result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Pub Sub State</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PubSubState get(int value) {
		switch (value) {
			case DISABLED0_VALUE: return DISABLED0;
			case PAUSED1_VALUE: return PAUSED1;
			case OPERATIONAL2_VALUE: return OPERATIONAL2;
			case ERROR3_VALUE: return ERROR3;
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
	private PubSubState(int value, String name, String literal) {
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
	
} //PubSubState
