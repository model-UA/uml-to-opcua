/**
 */
package org.opcfoundation.ua._2008._02.types;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Browse Direction</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getBrowseDirection()
 * @model extendedMetaData="name='BrowseDirection'"
 * @generated
 */
public enum BrowseDirection implements Enumerator {
	/**
	 * The '<em><b>Forward0</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FORWARD0_VALUE
	 * @generated
	 * @ordered
	 */
	FORWARD0(0, "Forward0", "Forward_0"),

	/**
	 * The '<em><b>Inverse1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INVERSE1_VALUE
	 * @generated
	 * @ordered
	 */
	INVERSE1(1, "Inverse1", "Inverse_1"),

	/**
	 * The '<em><b>Both2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOTH2_VALUE
	 * @generated
	 * @ordered
	 */
	BOTH2(2, "Both2", "Both_2"),

	/**
	 * The '<em><b>Invalid3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INVALID3_VALUE
	 * @generated
	 * @ordered
	 */
	INVALID3(3, "Invalid3", "Invalid_3");

	/**
	 * The '<em><b>Forward0</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FORWARD0
	 * @model name="Forward0" literal="Forward_0"
	 * @generated
	 * @ordered
	 */
	public static final int FORWARD0_VALUE = 0;

	/**
	 * The '<em><b>Inverse1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INVERSE1
	 * @model name="Inverse1" literal="Inverse_1"
	 * @generated
	 * @ordered
	 */
	public static final int INVERSE1_VALUE = 1;

	/**
	 * The '<em><b>Both2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOTH2
	 * @model name="Both2" literal="Both_2"
	 * @generated
	 * @ordered
	 */
	public static final int BOTH2_VALUE = 2;

	/**
	 * The '<em><b>Invalid3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INVALID3
	 * @model name="Invalid3" literal="Invalid_3"
	 * @generated
	 * @ordered
	 */
	public static final int INVALID3_VALUE = 3;

	/**
	 * An array of all the '<em><b>Browse Direction</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final BrowseDirection[] VALUES_ARRAY =
		new BrowseDirection[] {
			FORWARD0,
			INVERSE1,
			BOTH2,
			INVALID3,
		};

	/**
	 * A public read-only list of all the '<em><b>Browse Direction</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<BrowseDirection> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Browse Direction</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BrowseDirection get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BrowseDirection result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Browse Direction</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BrowseDirection getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BrowseDirection result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Browse Direction</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BrowseDirection get(int value) {
		switch (value) {
			case FORWARD0_VALUE: return FORWARD0;
			case INVERSE1_VALUE: return INVERSE1;
			case BOTH2_VALUE: return BOTH2;
			case INVALID3_VALUE: return INVALID3;
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
	private BrowseDirection(int value, String name, String literal) {
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
	
} //BrowseDirection
