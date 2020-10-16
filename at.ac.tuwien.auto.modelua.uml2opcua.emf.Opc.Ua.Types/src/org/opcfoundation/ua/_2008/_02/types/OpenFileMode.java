/**
 */
package org.opcfoundation.ua._2008._02.types;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Open File Mode</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getOpenFileMode()
 * @model extendedMetaData="name='OpenFileMode'"
 * @generated
 */
public enum OpenFileMode implements Enumerator {
	/**
	 * The '<em><b>Read1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #READ1_VALUE
	 * @generated
	 * @ordered
	 */
	READ1(0, "Read1", "Read_1"),

	/**
	 * The '<em><b>Write2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WRITE2_VALUE
	 * @generated
	 * @ordered
	 */
	WRITE2(1, "Write2", "Write_2"),

	/**
	 * The '<em><b>Erase Existing4</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ERASE_EXISTING4_VALUE
	 * @generated
	 * @ordered
	 */
	ERASE_EXISTING4(2, "EraseExisting4", "EraseExisting_4"),

	/**
	 * The '<em><b>Append8</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPEND8_VALUE
	 * @generated
	 * @ordered
	 */
	APPEND8(3, "Append8", "Append_8");

	/**
	 * The '<em><b>Read1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #READ1
	 * @model name="Read1" literal="Read_1"
	 * @generated
	 * @ordered
	 */
	public static final int READ1_VALUE = 0;

	/**
	 * The '<em><b>Write2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WRITE2
	 * @model name="Write2" literal="Write_2"
	 * @generated
	 * @ordered
	 */
	public static final int WRITE2_VALUE = 1;

	/**
	 * The '<em><b>Erase Existing4</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ERASE_EXISTING4
	 * @model name="EraseExisting4" literal="EraseExisting_4"
	 * @generated
	 * @ordered
	 */
	public static final int ERASE_EXISTING4_VALUE = 2;

	/**
	 * The '<em><b>Append8</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPEND8
	 * @model name="Append8" literal="Append_8"
	 * @generated
	 * @ordered
	 */
	public static final int APPEND8_VALUE = 3;

	/**
	 * An array of all the '<em><b>Open File Mode</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final OpenFileMode[] VALUES_ARRAY =
		new OpenFileMode[] {
			READ1,
			WRITE2,
			ERASE_EXISTING4,
			APPEND8,
		};

	/**
	 * A public read-only list of all the '<em><b>Open File Mode</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<OpenFileMode> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Open File Mode</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OpenFileMode get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OpenFileMode result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Open File Mode</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OpenFileMode getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OpenFileMode result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Open File Mode</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OpenFileMode get(int value) {
		switch (value) {
			case READ1_VALUE: return READ1;
			case WRITE2_VALUE: return WRITE2;
			case ERASE_EXISTING4_VALUE: return ERASE_EXISTING4;
			case APPEND8_VALUE: return APPEND8;
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
	private OpenFileMode(int value, String name, String literal) {
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
	
} //OpenFileMode
