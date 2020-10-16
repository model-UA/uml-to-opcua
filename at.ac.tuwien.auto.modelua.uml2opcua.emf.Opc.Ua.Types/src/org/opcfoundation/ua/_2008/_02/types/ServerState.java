/**
 */
package org.opcfoundation.ua._2008._02.types;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Server State</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getServerState()
 * @model extendedMetaData="name='ServerState'"
 * @generated
 */
public enum ServerState implements Enumerator {
	/**
	 * The '<em><b>Running0</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RUNNING0_VALUE
	 * @generated
	 * @ordered
	 */
	RUNNING0(0, "Running0", "Running_0"),

	/**
	 * The '<em><b>Failed1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FAILED1_VALUE
	 * @generated
	 * @ordered
	 */
	FAILED1(1, "Failed1", "Failed_1"),

	/**
	 * The '<em><b>No Configuration2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_CONFIGURATION2_VALUE
	 * @generated
	 * @ordered
	 */
	NO_CONFIGURATION2(2, "NoConfiguration2", "NoConfiguration_2"),

	/**
	 * The '<em><b>Suspended3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUSPENDED3_VALUE
	 * @generated
	 * @ordered
	 */
	SUSPENDED3(3, "Suspended3", "Suspended_3"),

	/**
	 * The '<em><b>Shutdown4</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHUTDOWN4_VALUE
	 * @generated
	 * @ordered
	 */
	SHUTDOWN4(4, "Shutdown4", "Shutdown_4"),

	/**
	 * The '<em><b>Test5</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEST5_VALUE
	 * @generated
	 * @ordered
	 */
	TEST5(5, "Test5", "Test_5"),

	/**
	 * The '<em><b>Communication Fault6</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMMUNICATION_FAULT6_VALUE
	 * @generated
	 * @ordered
	 */
	COMMUNICATION_FAULT6(6, "CommunicationFault6", "CommunicationFault_6"),

	/**
	 * The '<em><b>Unknown7</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNKNOWN7_VALUE
	 * @generated
	 * @ordered
	 */
	UNKNOWN7(7, "Unknown7", "Unknown_7");

	/**
	 * The '<em><b>Running0</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RUNNING0
	 * @model name="Running0" literal="Running_0"
	 * @generated
	 * @ordered
	 */
	public static final int RUNNING0_VALUE = 0;

	/**
	 * The '<em><b>Failed1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FAILED1
	 * @model name="Failed1" literal="Failed_1"
	 * @generated
	 * @ordered
	 */
	public static final int FAILED1_VALUE = 1;

	/**
	 * The '<em><b>No Configuration2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_CONFIGURATION2
	 * @model name="NoConfiguration2" literal="NoConfiguration_2"
	 * @generated
	 * @ordered
	 */
	public static final int NO_CONFIGURATION2_VALUE = 2;

	/**
	 * The '<em><b>Suspended3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUSPENDED3
	 * @model name="Suspended3" literal="Suspended_3"
	 * @generated
	 * @ordered
	 */
	public static final int SUSPENDED3_VALUE = 3;

	/**
	 * The '<em><b>Shutdown4</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHUTDOWN4
	 * @model name="Shutdown4" literal="Shutdown_4"
	 * @generated
	 * @ordered
	 */
	public static final int SHUTDOWN4_VALUE = 4;

	/**
	 * The '<em><b>Test5</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEST5
	 * @model name="Test5" literal="Test_5"
	 * @generated
	 * @ordered
	 */
	public static final int TEST5_VALUE = 5;

	/**
	 * The '<em><b>Communication Fault6</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMMUNICATION_FAULT6
	 * @model name="CommunicationFault6" literal="CommunicationFault_6"
	 * @generated
	 * @ordered
	 */
	public static final int COMMUNICATION_FAULT6_VALUE = 6;

	/**
	 * The '<em><b>Unknown7</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNKNOWN7
	 * @model name="Unknown7" literal="Unknown_7"
	 * @generated
	 * @ordered
	 */
	public static final int UNKNOWN7_VALUE = 7;

	/**
	 * An array of all the '<em><b>Server State</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ServerState[] VALUES_ARRAY =
		new ServerState[] {
			RUNNING0,
			FAILED1,
			NO_CONFIGURATION2,
			SUSPENDED3,
			SHUTDOWN4,
			TEST5,
			COMMUNICATION_FAULT6,
			UNKNOWN7,
		};

	/**
	 * A public read-only list of all the '<em><b>Server State</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ServerState> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Server State</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ServerState get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ServerState result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Server State</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ServerState getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ServerState result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Server State</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ServerState get(int value) {
		switch (value) {
			case RUNNING0_VALUE: return RUNNING0;
			case FAILED1_VALUE: return FAILED1;
			case NO_CONFIGURATION2_VALUE: return NO_CONFIGURATION2;
			case SUSPENDED3_VALUE: return SUSPENDED3;
			case SHUTDOWN4_VALUE: return SHUTDOWN4;
			case TEST5_VALUE: return TEST5;
			case COMMUNICATION_FAULT6_VALUE: return COMMUNICATION_FAULT6;
			case UNKNOWN7_VALUE: return UNKNOWN7;
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
	private ServerState(int value, String name, String literal) {
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
	
} //ServerState
