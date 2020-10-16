/**
 */
package org.opcfoundation.ua._2008._02.types;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Pub Sub Diagnostics Counter Classification</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getPubSubDiagnosticsCounterClassification()
 * @model extendedMetaData="name='PubSubDiagnosticsCounterClassification'"
 * @generated
 */
public enum PubSubDiagnosticsCounterClassification implements Enumerator {
	/**
	 * The '<em><b>Information0</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INFORMATION0_VALUE
	 * @generated
	 * @ordered
	 */
	INFORMATION0(0, "Information0", "Information_0"),

	/**
	 * The '<em><b>Error1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ERROR1_VALUE
	 * @generated
	 * @ordered
	 */
	ERROR1(1, "Error1", "Error_1");

	/**
	 * The '<em><b>Information0</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INFORMATION0
	 * @model name="Information0" literal="Information_0"
	 * @generated
	 * @ordered
	 */
	public static final int INFORMATION0_VALUE = 0;

	/**
	 * The '<em><b>Error1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ERROR1
	 * @model name="Error1" literal="Error_1"
	 * @generated
	 * @ordered
	 */
	public static final int ERROR1_VALUE = 1;

	/**
	 * An array of all the '<em><b>Pub Sub Diagnostics Counter Classification</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PubSubDiagnosticsCounterClassification[] VALUES_ARRAY =
		new PubSubDiagnosticsCounterClassification[] {
			INFORMATION0,
			ERROR1,
		};

	/**
	 * A public read-only list of all the '<em><b>Pub Sub Diagnostics Counter Classification</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PubSubDiagnosticsCounterClassification> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Pub Sub Diagnostics Counter Classification</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PubSubDiagnosticsCounterClassification get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PubSubDiagnosticsCounterClassification result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Pub Sub Diagnostics Counter Classification</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PubSubDiagnosticsCounterClassification getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PubSubDiagnosticsCounterClassification result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Pub Sub Diagnostics Counter Classification</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PubSubDiagnosticsCounterClassification get(int value) {
		switch (value) {
			case INFORMATION0_VALUE: return INFORMATION0;
			case ERROR1_VALUE: return ERROR1;
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
	private PubSubDiagnosticsCounterClassification(int value, String name, String literal) {
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
	
} //PubSubDiagnosticsCounterClassification
