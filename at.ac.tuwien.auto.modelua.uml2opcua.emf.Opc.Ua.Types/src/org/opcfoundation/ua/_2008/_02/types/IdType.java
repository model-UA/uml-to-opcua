/**
 */
package org.opcfoundation.ua._2008._02.types;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Id Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getIdType()
 * @model extendedMetaData="name='IdType'"
 * @generated
 */
public enum IdType implements Enumerator {
	/**
	 * The '<em><b>Numeric0</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NUMERIC0_VALUE
	 * @generated
	 * @ordered
	 */
	NUMERIC0(0, "Numeric0", "Numeric_0"),

	/**
	 * The '<em><b>String1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRING1_VALUE
	 * @generated
	 * @ordered
	 */
	STRING1(1, "String1", "String_1"),

	/**
	 * The '<em><b>Guid2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GUID2_VALUE
	 * @generated
	 * @ordered
	 */
	GUID2(2, "Guid2", "Guid_2"),

	/**
	 * The '<em><b>Opaque3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPAQUE3_VALUE
	 * @generated
	 * @ordered
	 */
	OPAQUE3(3, "Opaque3", "Opaque_3");

	/**
	 * The '<em><b>Numeric0</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NUMERIC0
	 * @model name="Numeric0" literal="Numeric_0"
	 * @generated
	 * @ordered
	 */
	public static final int NUMERIC0_VALUE = 0;

	/**
	 * The '<em><b>String1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRING1
	 * @model name="String1" literal="String_1"
	 * @generated
	 * @ordered
	 */
	public static final int STRING1_VALUE = 1;

	/**
	 * The '<em><b>Guid2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GUID2
	 * @model name="Guid2" literal="Guid_2"
	 * @generated
	 * @ordered
	 */
	public static final int GUID2_VALUE = 2;

	/**
	 * The '<em><b>Opaque3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPAQUE3
	 * @model name="Opaque3" literal="Opaque_3"
	 * @generated
	 * @ordered
	 */
	public static final int OPAQUE3_VALUE = 3;

	/**
	 * An array of all the '<em><b>Id Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final IdType[] VALUES_ARRAY =
		new IdType[] {
			NUMERIC0,
			STRING1,
			GUID2,
			OPAQUE3,
		};

	/**
	 * A public read-only list of all the '<em><b>Id Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<IdType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Id Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static IdType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IdType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Id Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static IdType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IdType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Id Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static IdType get(int value) {
		switch (value) {
			case NUMERIC0_VALUE: return NUMERIC0;
			case STRING1_VALUE: return STRING1;
			case GUID2_VALUE: return GUID2;
			case OPAQUE3_VALUE: return OPAQUE3;
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
	private IdType(int value, String name, String literal) {
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
	
} //IdType
