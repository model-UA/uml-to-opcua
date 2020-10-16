/**
 */
package org.opcfoundation.ua._2008._02.types;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Monitoring Mode</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getMonitoringMode()
 * @model extendedMetaData="name='MonitoringMode'"
 * @generated
 */
public enum MonitoringMode implements Enumerator {
	/**
	 * The '<em><b>Disabled0</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISABLED0_VALUE
	 * @generated
	 * @ordered
	 */
	DISABLED0(0, "Disabled0", "Disabled_0"),

	/**
	 * The '<em><b>Sampling1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SAMPLING1_VALUE
	 * @generated
	 * @ordered
	 */
	SAMPLING1(1, "Sampling1", "Sampling_1"),

	/**
	 * The '<em><b>Reporting2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REPORTING2_VALUE
	 * @generated
	 * @ordered
	 */
	REPORTING2(2, "Reporting2", "Reporting_2");

	/**
	 * The '<em><b>Disabled0</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISABLED0
	 * @model name="Disabled0" literal="Disabled_0"
	 * @generated
	 * @ordered
	 */
	public static final int DISABLED0_VALUE = 0;

	/**
	 * The '<em><b>Sampling1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SAMPLING1
	 * @model name="Sampling1" literal="Sampling_1"
	 * @generated
	 * @ordered
	 */
	public static final int SAMPLING1_VALUE = 1;

	/**
	 * The '<em><b>Reporting2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REPORTING2
	 * @model name="Reporting2" literal="Reporting_2"
	 * @generated
	 * @ordered
	 */
	public static final int REPORTING2_VALUE = 2;

	/**
	 * An array of all the '<em><b>Monitoring Mode</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MonitoringMode[] VALUES_ARRAY =
		new MonitoringMode[] {
			DISABLED0,
			SAMPLING1,
			REPORTING2,
		};

	/**
	 * A public read-only list of all the '<em><b>Monitoring Mode</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MonitoringMode> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Monitoring Mode</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MonitoringMode get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MonitoringMode result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Monitoring Mode</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MonitoringMode getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MonitoringMode result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Monitoring Mode</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MonitoringMode get(int value) {
		switch (value) {
			case DISABLED0_VALUE: return DISABLED0;
			case SAMPLING1_VALUE: return SAMPLING1;
			case REPORTING2_VALUE: return REPORTING2;
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
	private MonitoringMode(int value, String name, String literal) {
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
	
} //MonitoringMode
