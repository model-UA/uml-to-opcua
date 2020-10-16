/**
 */
package org.opcfoundation.ua._2008._02.types;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Broker Transport Quality Of Service</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getBrokerTransportQualityOfService()
 * @model extendedMetaData="name='BrokerTransportQualityOfService'"
 * @generated
 */
public enum BrokerTransportQualityOfService implements Enumerator {
	/**
	 * The '<em><b>Not Specified0</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT_SPECIFIED0_VALUE
	 * @generated
	 * @ordered
	 */
	NOT_SPECIFIED0(0, "NotSpecified0", "NotSpecified_0"),

	/**
	 * The '<em><b>Best Effort1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BEST_EFFORT1_VALUE
	 * @generated
	 * @ordered
	 */
	BEST_EFFORT1(1, "BestEffort1", "BestEffort_1"),

	/**
	 * The '<em><b>At Least Once2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AT_LEAST_ONCE2_VALUE
	 * @generated
	 * @ordered
	 */
	AT_LEAST_ONCE2(2, "AtLeastOnce2", "AtLeastOnce_2"),

	/**
	 * The '<em><b>At Most Once3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AT_MOST_ONCE3_VALUE
	 * @generated
	 * @ordered
	 */
	AT_MOST_ONCE3(3, "AtMostOnce3", "AtMostOnce_3"),

	/**
	 * The '<em><b>Exactly Once4</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXACTLY_ONCE4_VALUE
	 * @generated
	 * @ordered
	 */
	EXACTLY_ONCE4(4, "ExactlyOnce4", "ExactlyOnce_4");

	/**
	 * The '<em><b>Not Specified0</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT_SPECIFIED0
	 * @model name="NotSpecified0" literal="NotSpecified_0"
	 * @generated
	 * @ordered
	 */
	public static final int NOT_SPECIFIED0_VALUE = 0;

	/**
	 * The '<em><b>Best Effort1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BEST_EFFORT1
	 * @model name="BestEffort1" literal="BestEffort_1"
	 * @generated
	 * @ordered
	 */
	public static final int BEST_EFFORT1_VALUE = 1;

	/**
	 * The '<em><b>At Least Once2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AT_LEAST_ONCE2
	 * @model name="AtLeastOnce2" literal="AtLeastOnce_2"
	 * @generated
	 * @ordered
	 */
	public static final int AT_LEAST_ONCE2_VALUE = 2;

	/**
	 * The '<em><b>At Most Once3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AT_MOST_ONCE3
	 * @model name="AtMostOnce3" literal="AtMostOnce_3"
	 * @generated
	 * @ordered
	 */
	public static final int AT_MOST_ONCE3_VALUE = 3;

	/**
	 * The '<em><b>Exactly Once4</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXACTLY_ONCE4
	 * @model name="ExactlyOnce4" literal="ExactlyOnce_4"
	 * @generated
	 * @ordered
	 */
	public static final int EXACTLY_ONCE4_VALUE = 4;

	/**
	 * An array of all the '<em><b>Broker Transport Quality Of Service</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final BrokerTransportQualityOfService[] VALUES_ARRAY =
		new BrokerTransportQualityOfService[] {
			NOT_SPECIFIED0,
			BEST_EFFORT1,
			AT_LEAST_ONCE2,
			AT_MOST_ONCE3,
			EXACTLY_ONCE4,
		};

	/**
	 * A public read-only list of all the '<em><b>Broker Transport Quality Of Service</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<BrokerTransportQualityOfService> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Broker Transport Quality Of Service</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BrokerTransportQualityOfService get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BrokerTransportQualityOfService result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Broker Transport Quality Of Service</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BrokerTransportQualityOfService getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BrokerTransportQualityOfService result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Broker Transport Quality Of Service</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BrokerTransportQualityOfService get(int value) {
		switch (value) {
			case NOT_SPECIFIED0_VALUE: return NOT_SPECIFIED0;
			case BEST_EFFORT1_VALUE: return BEST_EFFORT1;
			case AT_LEAST_ONCE2_VALUE: return AT_LEAST_ONCE2;
			case AT_MOST_ONCE3_VALUE: return AT_MOST_ONCE3;
			case EXACTLY_ONCE4_VALUE: return EXACTLY_ONCE4;
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
	private BrokerTransportQualityOfService(int value, String name, String literal) {
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
	
} //BrokerTransportQualityOfService
