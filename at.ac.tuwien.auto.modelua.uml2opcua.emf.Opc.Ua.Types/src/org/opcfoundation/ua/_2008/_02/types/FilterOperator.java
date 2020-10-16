/**
 */
package org.opcfoundation.ua._2008._02.types;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Filter Operator</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getFilterOperator()
 * @model extendedMetaData="name='FilterOperator'"
 * @generated
 */
public enum FilterOperator implements Enumerator {
	/**
	 * The '<em><b>Equals0</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EQUALS0_VALUE
	 * @generated
	 * @ordered
	 */
	EQUALS0(0, "Equals0", "Equals_0"),

	/**
	 * The '<em><b>Is Null1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_NULL1_VALUE
	 * @generated
	 * @ordered
	 */
	IS_NULL1(1, "IsNull1", "IsNull_1"),

	/**
	 * The '<em><b>Greater Than2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GREATER_THAN2_VALUE
	 * @generated
	 * @ordered
	 */
	GREATER_THAN2(2, "GreaterThan2", "GreaterThan_2"),

	/**
	 * The '<em><b>Less Than3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LESS_THAN3_VALUE
	 * @generated
	 * @ordered
	 */
	LESS_THAN3(3, "LessThan3", "LessThan_3"),

	/**
	 * The '<em><b>Greater Than Or Equal4</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GREATER_THAN_OR_EQUAL4_VALUE
	 * @generated
	 * @ordered
	 */
	GREATER_THAN_OR_EQUAL4(4, "GreaterThanOrEqual4", "GreaterThanOrEqual_4"),

	/**
	 * The '<em><b>Less Than Or Equal5</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LESS_THAN_OR_EQUAL5_VALUE
	 * @generated
	 * @ordered
	 */
	LESS_THAN_OR_EQUAL5(5, "LessThanOrEqual5", "LessThanOrEqual_5"),

	/**
	 * The '<em><b>Like6</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIKE6_VALUE
	 * @generated
	 * @ordered
	 */
	LIKE6(6, "Like6", "Like_6"),

	/**
	 * The '<em><b>Not7</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT7_VALUE
	 * @generated
	 * @ordered
	 */
	NOT7(7, "Not7", "Not_7"),

	/**
	 * The '<em><b>Between8</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BETWEEN8_VALUE
	 * @generated
	 * @ordered
	 */
	BETWEEN8(8, "Between8", "Between_8"),

	/**
	 * The '<em><b>In List9</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IN_LIST9_VALUE
	 * @generated
	 * @ordered
	 */
	IN_LIST9(9, "InList9", "InList_9"),

	/**
	 * The '<em><b>And10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AND10_VALUE
	 * @generated
	 * @ordered
	 */
	AND10(10, "And10", "And_10"),

	/**
	 * The '<em><b>Or11</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OR11_VALUE
	 * @generated
	 * @ordered
	 */
	OR11(11, "Or11", "Or_11"),

	/**
	 * The '<em><b>Cast12</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CAST12_VALUE
	 * @generated
	 * @ordered
	 */
	CAST12(12, "Cast12", "Cast_12"),

	/**
	 * The '<em><b>In View13</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IN_VIEW13_VALUE
	 * @generated
	 * @ordered
	 */
	IN_VIEW13(13, "InView13", "InView_13"),

	/**
	 * The '<em><b>Of Type14</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OF_TYPE14_VALUE
	 * @generated
	 * @ordered
	 */
	OF_TYPE14(14, "OfType14", "OfType_14"),

	/**
	 * The '<em><b>Related To15</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RELATED_TO15_VALUE
	 * @generated
	 * @ordered
	 */
	RELATED_TO15(15, "RelatedTo15", "RelatedTo_15"),

	/**
	 * The '<em><b>Bitwise And16</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BITWISE_AND16_VALUE
	 * @generated
	 * @ordered
	 */
	BITWISE_AND16(16, "BitwiseAnd16", "BitwiseAnd_16"),

	/**
	 * The '<em><b>Bitwise Or17</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BITWISE_OR17_VALUE
	 * @generated
	 * @ordered
	 */
	BITWISE_OR17(17, "BitwiseOr17", "BitwiseOr_17");

	/**
	 * The '<em><b>Equals0</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EQUALS0
	 * @model name="Equals0" literal="Equals_0"
	 * @generated
	 * @ordered
	 */
	public static final int EQUALS0_VALUE = 0;

	/**
	 * The '<em><b>Is Null1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_NULL1
	 * @model name="IsNull1" literal="IsNull_1"
	 * @generated
	 * @ordered
	 */
	public static final int IS_NULL1_VALUE = 1;

	/**
	 * The '<em><b>Greater Than2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GREATER_THAN2
	 * @model name="GreaterThan2" literal="GreaterThan_2"
	 * @generated
	 * @ordered
	 */
	public static final int GREATER_THAN2_VALUE = 2;

	/**
	 * The '<em><b>Less Than3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LESS_THAN3
	 * @model name="LessThan3" literal="LessThan_3"
	 * @generated
	 * @ordered
	 */
	public static final int LESS_THAN3_VALUE = 3;

	/**
	 * The '<em><b>Greater Than Or Equal4</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GREATER_THAN_OR_EQUAL4
	 * @model name="GreaterThanOrEqual4" literal="GreaterThanOrEqual_4"
	 * @generated
	 * @ordered
	 */
	public static final int GREATER_THAN_OR_EQUAL4_VALUE = 4;

	/**
	 * The '<em><b>Less Than Or Equal5</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LESS_THAN_OR_EQUAL5
	 * @model name="LessThanOrEqual5" literal="LessThanOrEqual_5"
	 * @generated
	 * @ordered
	 */
	public static final int LESS_THAN_OR_EQUAL5_VALUE = 5;

	/**
	 * The '<em><b>Like6</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIKE6
	 * @model name="Like6" literal="Like_6"
	 * @generated
	 * @ordered
	 */
	public static final int LIKE6_VALUE = 6;

	/**
	 * The '<em><b>Not7</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT7
	 * @model name="Not7" literal="Not_7"
	 * @generated
	 * @ordered
	 */
	public static final int NOT7_VALUE = 7;

	/**
	 * The '<em><b>Between8</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BETWEEN8
	 * @model name="Between8" literal="Between_8"
	 * @generated
	 * @ordered
	 */
	public static final int BETWEEN8_VALUE = 8;

	/**
	 * The '<em><b>In List9</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IN_LIST9
	 * @model name="InList9" literal="InList_9"
	 * @generated
	 * @ordered
	 */
	public static final int IN_LIST9_VALUE = 9;

	/**
	 * The '<em><b>And10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AND10
	 * @model name="And10" literal="And_10"
	 * @generated
	 * @ordered
	 */
	public static final int AND10_VALUE = 10;

	/**
	 * The '<em><b>Or11</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OR11
	 * @model name="Or11" literal="Or_11"
	 * @generated
	 * @ordered
	 */
	public static final int OR11_VALUE = 11;

	/**
	 * The '<em><b>Cast12</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CAST12
	 * @model name="Cast12" literal="Cast_12"
	 * @generated
	 * @ordered
	 */
	public static final int CAST12_VALUE = 12;

	/**
	 * The '<em><b>In View13</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IN_VIEW13
	 * @model name="InView13" literal="InView_13"
	 * @generated
	 * @ordered
	 */
	public static final int IN_VIEW13_VALUE = 13;

	/**
	 * The '<em><b>Of Type14</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OF_TYPE14
	 * @model name="OfType14" literal="OfType_14"
	 * @generated
	 * @ordered
	 */
	public static final int OF_TYPE14_VALUE = 14;

	/**
	 * The '<em><b>Related To15</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RELATED_TO15
	 * @model name="RelatedTo15" literal="RelatedTo_15"
	 * @generated
	 * @ordered
	 */
	public static final int RELATED_TO15_VALUE = 15;

	/**
	 * The '<em><b>Bitwise And16</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BITWISE_AND16
	 * @model name="BitwiseAnd16" literal="BitwiseAnd_16"
	 * @generated
	 * @ordered
	 */
	public static final int BITWISE_AND16_VALUE = 16;

	/**
	 * The '<em><b>Bitwise Or17</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BITWISE_OR17
	 * @model name="BitwiseOr17" literal="BitwiseOr_17"
	 * @generated
	 * @ordered
	 */
	public static final int BITWISE_OR17_VALUE = 17;

	/**
	 * An array of all the '<em><b>Filter Operator</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final FilterOperator[] VALUES_ARRAY =
		new FilterOperator[] {
			EQUALS0,
			IS_NULL1,
			GREATER_THAN2,
			LESS_THAN3,
			GREATER_THAN_OR_EQUAL4,
			LESS_THAN_OR_EQUAL5,
			LIKE6,
			NOT7,
			BETWEEN8,
			IN_LIST9,
			AND10,
			OR11,
			CAST12,
			IN_VIEW13,
			OF_TYPE14,
			RELATED_TO15,
			BITWISE_AND16,
			BITWISE_OR17,
		};

	/**
	 * A public read-only list of all the '<em><b>Filter Operator</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<FilterOperator> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Filter Operator</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FilterOperator get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FilterOperator result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Filter Operator</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FilterOperator getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FilterOperator result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Filter Operator</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FilterOperator get(int value) {
		switch (value) {
			case EQUALS0_VALUE: return EQUALS0;
			case IS_NULL1_VALUE: return IS_NULL1;
			case GREATER_THAN2_VALUE: return GREATER_THAN2;
			case LESS_THAN3_VALUE: return LESS_THAN3;
			case GREATER_THAN_OR_EQUAL4_VALUE: return GREATER_THAN_OR_EQUAL4;
			case LESS_THAN_OR_EQUAL5_VALUE: return LESS_THAN_OR_EQUAL5;
			case LIKE6_VALUE: return LIKE6;
			case NOT7_VALUE: return NOT7;
			case BETWEEN8_VALUE: return BETWEEN8;
			case IN_LIST9_VALUE: return IN_LIST9;
			case AND10_VALUE: return AND10;
			case OR11_VALUE: return OR11;
			case CAST12_VALUE: return CAST12;
			case IN_VIEW13_VALUE: return IN_VIEW13;
			case OF_TYPE14_VALUE: return OF_TYPE14;
			case RELATED_TO15_VALUE: return RELATED_TO15;
			case BITWISE_AND16_VALUE: return BITWISE_AND16;
			case BITWISE_OR17_VALUE: return BITWISE_OR17;
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
	private FilterOperator(int value, String name, String literal) {
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
	
} //FilterOperator
