/**
 */
package org.opcfoundation.ua._2008._02.types;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Diagnostics Level</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDiagnosticsLevel()
 * @model extendedMetaData="name='DiagnosticsLevel'"
 * @generated
 */
public enum DiagnosticsLevel implements Enumerator {
	/**
	 * The '<em><b>Basic0</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BASIC0_VALUE
	 * @generated
	 * @ordered
	 */
	BASIC0(0, "Basic0", "Basic_0"),

	/**
	 * The '<em><b>Advanced1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADVANCED1_VALUE
	 * @generated
	 * @ordered
	 */
	ADVANCED1(1, "Advanced1", "Advanced_1"),

	/**
	 * The '<em><b>Info2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INFO2_VALUE
	 * @generated
	 * @ordered
	 */
	INFO2(2, "Info2", "Info_2"),

	/**
	 * The '<em><b>Log3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOG3_VALUE
	 * @generated
	 * @ordered
	 */
	LOG3(3, "Log3", "Log_3"),

	/**
	 * The '<em><b>Debug4</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEBUG4_VALUE
	 * @generated
	 * @ordered
	 */
	DEBUG4(4, "Debug4", "Debug_4");

	/**
	 * The '<em><b>Basic0</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BASIC0
	 * @model name="Basic0" literal="Basic_0"
	 * @generated
	 * @ordered
	 */
	public static final int BASIC0_VALUE = 0;

	/**
	 * The '<em><b>Advanced1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADVANCED1
	 * @model name="Advanced1" literal="Advanced_1"
	 * @generated
	 * @ordered
	 */
	public static final int ADVANCED1_VALUE = 1;

	/**
	 * The '<em><b>Info2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INFO2
	 * @model name="Info2" literal="Info_2"
	 * @generated
	 * @ordered
	 */
	public static final int INFO2_VALUE = 2;

	/**
	 * The '<em><b>Log3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOG3
	 * @model name="Log3" literal="Log_3"
	 * @generated
	 * @ordered
	 */
	public static final int LOG3_VALUE = 3;

	/**
	 * The '<em><b>Debug4</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEBUG4
	 * @model name="Debug4" literal="Debug_4"
	 * @generated
	 * @ordered
	 */
	public static final int DEBUG4_VALUE = 4;

	/**
	 * An array of all the '<em><b>Diagnostics Level</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DiagnosticsLevel[] VALUES_ARRAY =
		new DiagnosticsLevel[] {
			BASIC0,
			ADVANCED1,
			INFO2,
			LOG3,
			DEBUG4,
		};

	/**
	 * A public read-only list of all the '<em><b>Diagnostics Level</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DiagnosticsLevel> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Diagnostics Level</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DiagnosticsLevel get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DiagnosticsLevel result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Diagnostics Level</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DiagnosticsLevel getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DiagnosticsLevel result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Diagnostics Level</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DiagnosticsLevel get(int value) {
		switch (value) {
			case BASIC0_VALUE: return BASIC0;
			case ADVANCED1_VALUE: return ADVANCED1;
			case INFO2_VALUE: return INFO2;
			case LOG3_VALUE: return LOG3;
			case DEBUG4_VALUE: return DEBUG4;
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
	private DiagnosticsLevel(int value, String name, String literal) {
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
	
} //DiagnosticsLevel
