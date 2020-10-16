/**
 */
package org.opcfoundation.ua._2008._02.types;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Data Change Trigger</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDataChangeTrigger()
 * @model extendedMetaData="name='DataChangeTrigger'"
 * @generated
 */
public enum DataChangeTrigger implements Enumerator {
	/**
	 * The '<em><b>Status0</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STATUS0_VALUE
	 * @generated
	 * @ordered
	 */
	STATUS0(0, "Status0", "Status_0"),

	/**
	 * The '<em><b>Status Value1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STATUS_VALUE1_VALUE
	 * @generated
	 * @ordered
	 */
	STATUS_VALUE1(1, "StatusValue1", "StatusValue_1"),

	/**
	 * The '<em><b>Status Value Timestamp2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STATUS_VALUE_TIMESTAMP2_VALUE
	 * @generated
	 * @ordered
	 */
	STATUS_VALUE_TIMESTAMP2(2, "StatusValueTimestamp2", "StatusValueTimestamp_2");

	/**
	 * The '<em><b>Status0</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STATUS0
	 * @model name="Status0" literal="Status_0"
	 * @generated
	 * @ordered
	 */
	public static final int STATUS0_VALUE = 0;

	/**
	 * The '<em><b>Status Value1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STATUS_VALUE1
	 * @model name="StatusValue1" literal="StatusValue_1"
	 * @generated
	 * @ordered
	 */
	public static final int STATUS_VALUE1_VALUE = 1;

	/**
	 * The '<em><b>Status Value Timestamp2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STATUS_VALUE_TIMESTAMP2
	 * @model name="StatusValueTimestamp2" literal="StatusValueTimestamp_2"
	 * @generated
	 * @ordered
	 */
	public static final int STATUS_VALUE_TIMESTAMP2_VALUE = 2;

	/**
	 * An array of all the '<em><b>Data Change Trigger</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DataChangeTrigger[] VALUES_ARRAY =
		new DataChangeTrigger[] {
			STATUS0,
			STATUS_VALUE1,
			STATUS_VALUE_TIMESTAMP2,
		};

	/**
	 * A public read-only list of all the '<em><b>Data Change Trigger</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DataChangeTrigger> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Data Change Trigger</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DataChangeTrigger get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DataChangeTrigger result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Data Change Trigger</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DataChangeTrigger getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DataChangeTrigger result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Data Change Trigger</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DataChangeTrigger get(int value) {
		switch (value) {
			case STATUS0_VALUE: return STATUS0;
			case STATUS_VALUE1_VALUE: return STATUS_VALUE1;
			case STATUS_VALUE_TIMESTAMP2_VALUE: return STATUS_VALUE_TIMESTAMP2;
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
	private DataChangeTrigger(int value, String name, String literal) {
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
	
} //DataChangeTrigger
