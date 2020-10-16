/**
 */
package org.opcfoundation.ua._2008._02.types;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Structure Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getStructureType()
 * @model extendedMetaData="name='StructureType'"
 * @generated
 */
public enum StructureType implements Enumerator {
	/**
	 * The '<em><b>Structure0</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRUCTURE0_VALUE
	 * @generated
	 * @ordered
	 */
	STRUCTURE0(0, "Structure0", "Structure_0"),

	/**
	 * The '<em><b>Structure With Optional Fields1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRUCTURE_WITH_OPTIONAL_FIELDS1_VALUE
	 * @generated
	 * @ordered
	 */
	STRUCTURE_WITH_OPTIONAL_FIELDS1(1, "StructureWithOptionalFields1", "StructureWithOptionalFields_1"),

	/**
	 * The '<em><b>Union2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNION2_VALUE
	 * @generated
	 * @ordered
	 */
	UNION2(2, "Union2", "Union_2");

	/**
	 * The '<em><b>Structure0</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRUCTURE0
	 * @model name="Structure0" literal="Structure_0"
	 * @generated
	 * @ordered
	 */
	public static final int STRUCTURE0_VALUE = 0;

	/**
	 * The '<em><b>Structure With Optional Fields1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRUCTURE_WITH_OPTIONAL_FIELDS1
	 * @model name="StructureWithOptionalFields1" literal="StructureWithOptionalFields_1"
	 * @generated
	 * @ordered
	 */
	public static final int STRUCTURE_WITH_OPTIONAL_FIELDS1_VALUE = 1;

	/**
	 * The '<em><b>Union2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNION2
	 * @model name="Union2" literal="Union_2"
	 * @generated
	 * @ordered
	 */
	public static final int UNION2_VALUE = 2;

	/**
	 * An array of all the '<em><b>Structure Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final StructureType[] VALUES_ARRAY =
		new StructureType[] {
			STRUCTURE0,
			STRUCTURE_WITH_OPTIONAL_FIELDS1,
			UNION2,
		};

	/**
	 * A public read-only list of all the '<em><b>Structure Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<StructureType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Structure Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StructureType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StructureType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Structure Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StructureType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StructureType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Structure Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StructureType get(int value) {
		switch (value) {
			case STRUCTURE0_VALUE: return STRUCTURE0;
			case STRUCTURE_WITH_OPTIONAL_FIELDS1_VALUE: return STRUCTURE_WITH_OPTIONAL_FIELDS1;
			case UNION2_VALUE: return UNION2;
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
	private StructureType(int value, String name, String literal) {
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
	
} //StructureType
