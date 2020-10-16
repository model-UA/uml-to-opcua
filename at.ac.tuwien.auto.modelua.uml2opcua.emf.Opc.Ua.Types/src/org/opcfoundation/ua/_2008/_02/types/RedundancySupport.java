/**
 */
package org.opcfoundation.ua._2008._02.types;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Redundancy Support</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getRedundancySupport()
 * @model extendedMetaData="name='RedundancySupport'"
 * @generated
 */
public enum RedundancySupport implements Enumerator {
	/**
	 * The '<em><b>None0</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE0_VALUE
	 * @generated
	 * @ordered
	 */
	NONE0(0, "None0", "None_0"),

	/**
	 * The '<em><b>Cold1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLD1_VALUE
	 * @generated
	 * @ordered
	 */
	COLD1(1, "Cold1", "Cold_1"),

	/**
	 * The '<em><b>Warm2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WARM2_VALUE
	 * @generated
	 * @ordered
	 */
	WARM2(2, "Warm2", "Warm_2"),

	/**
	 * The '<em><b>Hot3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HOT3_VALUE
	 * @generated
	 * @ordered
	 */
	HOT3(3, "Hot3", "Hot_3"),

	/**
	 * The '<em><b>Transparent4</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRANSPARENT4_VALUE
	 * @generated
	 * @ordered
	 */
	TRANSPARENT4(4, "Transparent4", "Transparent_4"),

	/**
	 * The '<em><b>Hot And Mirrored5</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HOT_AND_MIRRORED5_VALUE
	 * @generated
	 * @ordered
	 */
	HOT_AND_MIRRORED5(5, "HotAndMirrored5", "HotAndMirrored_5");

	/**
	 * The '<em><b>None0</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE0
	 * @model name="None0" literal="None_0"
	 * @generated
	 * @ordered
	 */
	public static final int NONE0_VALUE = 0;

	/**
	 * The '<em><b>Cold1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLD1
	 * @model name="Cold1" literal="Cold_1"
	 * @generated
	 * @ordered
	 */
	public static final int COLD1_VALUE = 1;

	/**
	 * The '<em><b>Warm2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WARM2
	 * @model name="Warm2" literal="Warm_2"
	 * @generated
	 * @ordered
	 */
	public static final int WARM2_VALUE = 2;

	/**
	 * The '<em><b>Hot3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HOT3
	 * @model name="Hot3" literal="Hot_3"
	 * @generated
	 * @ordered
	 */
	public static final int HOT3_VALUE = 3;

	/**
	 * The '<em><b>Transparent4</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRANSPARENT4
	 * @model name="Transparent4" literal="Transparent_4"
	 * @generated
	 * @ordered
	 */
	public static final int TRANSPARENT4_VALUE = 4;

	/**
	 * The '<em><b>Hot And Mirrored5</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HOT_AND_MIRRORED5
	 * @model name="HotAndMirrored5" literal="HotAndMirrored_5"
	 * @generated
	 * @ordered
	 */
	public static final int HOT_AND_MIRRORED5_VALUE = 5;

	/**
	 * An array of all the '<em><b>Redundancy Support</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final RedundancySupport[] VALUES_ARRAY =
		new RedundancySupport[] {
			NONE0,
			COLD1,
			WARM2,
			HOT3,
			TRANSPARENT4,
			HOT_AND_MIRRORED5,
		};

	/**
	 * A public read-only list of all the '<em><b>Redundancy Support</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<RedundancySupport> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Redundancy Support</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RedundancySupport get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RedundancySupport result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Redundancy Support</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RedundancySupport getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RedundancySupport result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Redundancy Support</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RedundancySupport get(int value) {
		switch (value) {
			case NONE0_VALUE: return NONE0;
			case COLD1_VALUE: return COLD1;
			case WARM2_VALUE: return WARM2;
			case HOT3_VALUE: return HOT3;
			case TRANSPARENT4_VALUE: return TRANSPARENT4;
			case HOT_AND_MIRRORED5_VALUE: return HOT_AND_MIRRORED5;
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
	private RedundancySupport(int value, String name, String literal) {
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
	
} //RedundancySupport
