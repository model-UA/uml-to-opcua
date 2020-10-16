/**
 */
package org.opcfoundation.ua._2008._02.types;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Data Set Ordering Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDataSetOrderingType()
 * @model extendedMetaData="name='DataSetOrderingType'"
 * @generated
 */
public enum DataSetOrderingType implements Enumerator {
	/**
	 * The '<em><b>Undefined0</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNDEFINED0_VALUE
	 * @generated
	 * @ordered
	 */
	UNDEFINED0(0, "Undefined0", "Undefined_0"),

	/**
	 * The '<em><b>Ascending Writer Id1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASCENDING_WRITER_ID1_VALUE
	 * @generated
	 * @ordered
	 */
	ASCENDING_WRITER_ID1(1, "AscendingWriterId1", "AscendingWriterId_1"),

	/**
	 * The '<em><b>Ascending Writer Id Single2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASCENDING_WRITER_ID_SINGLE2_VALUE
	 * @generated
	 * @ordered
	 */
	ASCENDING_WRITER_ID_SINGLE2(2, "AscendingWriterIdSingle2", "AscendingWriterIdSingle_2");

	/**
	 * The '<em><b>Undefined0</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNDEFINED0
	 * @model name="Undefined0" literal="Undefined_0"
	 * @generated
	 * @ordered
	 */
	public static final int UNDEFINED0_VALUE = 0;

	/**
	 * The '<em><b>Ascending Writer Id1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASCENDING_WRITER_ID1
	 * @model name="AscendingWriterId1" literal="AscendingWriterId_1"
	 * @generated
	 * @ordered
	 */
	public static final int ASCENDING_WRITER_ID1_VALUE = 1;

	/**
	 * The '<em><b>Ascending Writer Id Single2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASCENDING_WRITER_ID_SINGLE2
	 * @model name="AscendingWriterIdSingle2" literal="AscendingWriterIdSingle_2"
	 * @generated
	 * @ordered
	 */
	public static final int ASCENDING_WRITER_ID_SINGLE2_VALUE = 2;

	/**
	 * An array of all the '<em><b>Data Set Ordering Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DataSetOrderingType[] VALUES_ARRAY =
		new DataSetOrderingType[] {
			UNDEFINED0,
			ASCENDING_WRITER_ID1,
			ASCENDING_WRITER_ID_SINGLE2,
		};

	/**
	 * A public read-only list of all the '<em><b>Data Set Ordering Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DataSetOrderingType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Data Set Ordering Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DataSetOrderingType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DataSetOrderingType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Data Set Ordering Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DataSetOrderingType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DataSetOrderingType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Data Set Ordering Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DataSetOrderingType get(int value) {
		switch (value) {
			case UNDEFINED0_VALUE: return UNDEFINED0;
			case ASCENDING_WRITER_ID1_VALUE: return ASCENDING_WRITER_ID1;
			case ASCENDING_WRITER_ID_SINGLE2_VALUE: return ASCENDING_WRITER_ID_SINGLE2;
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
	private DataSetOrderingType(int value, String name, String literal) {
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
	
} //DataSetOrderingType
