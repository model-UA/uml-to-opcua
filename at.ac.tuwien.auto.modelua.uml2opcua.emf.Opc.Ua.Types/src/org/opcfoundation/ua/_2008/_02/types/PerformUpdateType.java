/**
 */
package org.opcfoundation.ua._2008._02.types;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Perform Update Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getPerformUpdateType()
 * @model extendedMetaData="name='PerformUpdateType'"
 * @generated
 */
public enum PerformUpdateType implements Enumerator {
	/**
	 * The '<em><b>Insert1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INSERT1_VALUE
	 * @generated
	 * @ordered
	 */
	INSERT1(0, "Insert1", "Insert_1"),

	/**
	 * The '<em><b>Replace2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REPLACE2_VALUE
	 * @generated
	 * @ordered
	 */
	REPLACE2(1, "Replace2", "Replace_2"),

	/**
	 * The '<em><b>Update3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UPDATE3_VALUE
	 * @generated
	 * @ordered
	 */
	UPDATE3(2, "Update3", "Update_3"),

	/**
	 * The '<em><b>Remove4</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REMOVE4_VALUE
	 * @generated
	 * @ordered
	 */
	REMOVE4(3, "Remove4", "Remove_4");

	/**
	 * The '<em><b>Insert1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INSERT1
	 * @model name="Insert1" literal="Insert_1"
	 * @generated
	 * @ordered
	 */
	public static final int INSERT1_VALUE = 0;

	/**
	 * The '<em><b>Replace2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REPLACE2
	 * @model name="Replace2" literal="Replace_2"
	 * @generated
	 * @ordered
	 */
	public static final int REPLACE2_VALUE = 1;

	/**
	 * The '<em><b>Update3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UPDATE3
	 * @model name="Update3" literal="Update_3"
	 * @generated
	 * @ordered
	 */
	public static final int UPDATE3_VALUE = 2;

	/**
	 * The '<em><b>Remove4</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REMOVE4
	 * @model name="Remove4" literal="Remove_4"
	 * @generated
	 * @ordered
	 */
	public static final int REMOVE4_VALUE = 3;

	/**
	 * An array of all the '<em><b>Perform Update Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PerformUpdateType[] VALUES_ARRAY =
		new PerformUpdateType[] {
			INSERT1,
			REPLACE2,
			UPDATE3,
			REMOVE4,
		};

	/**
	 * A public read-only list of all the '<em><b>Perform Update Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PerformUpdateType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Perform Update Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PerformUpdateType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PerformUpdateType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Perform Update Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PerformUpdateType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PerformUpdateType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Perform Update Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PerformUpdateType get(int value) {
		switch (value) {
			case INSERT1_VALUE: return INSERT1;
			case REPLACE2_VALUE: return REPLACE2;
			case UPDATE3_VALUE: return UPDATE3;
			case REMOVE4_VALUE: return REMOVE4;
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
	private PerformUpdateType(int value, String name, String literal) {
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
	
} //PerformUpdateType
