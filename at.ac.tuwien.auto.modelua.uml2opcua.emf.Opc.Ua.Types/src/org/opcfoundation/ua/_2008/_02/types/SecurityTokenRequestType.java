/**
 */
package org.opcfoundation.ua._2008._02.types;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Security Token Request Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getSecurityTokenRequestType()
 * @model extendedMetaData="name='SecurityTokenRequestType'"
 * @generated
 */
public enum SecurityTokenRequestType implements Enumerator {
	/**
	 * The '<em><b>Issue0</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ISSUE0_VALUE
	 * @generated
	 * @ordered
	 */
	ISSUE0(0, "Issue0", "Issue_0"),

	/**
	 * The '<em><b>Renew1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RENEW1_VALUE
	 * @generated
	 * @ordered
	 */
	RENEW1(1, "Renew1", "Renew_1");

	/**
	 * The '<em><b>Issue0</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ISSUE0
	 * @model name="Issue0" literal="Issue_0"
	 * @generated
	 * @ordered
	 */
	public static final int ISSUE0_VALUE = 0;

	/**
	 * The '<em><b>Renew1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RENEW1
	 * @model name="Renew1" literal="Renew_1"
	 * @generated
	 * @ordered
	 */
	public static final int RENEW1_VALUE = 1;

	/**
	 * An array of all the '<em><b>Security Token Request Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SecurityTokenRequestType[] VALUES_ARRAY =
		new SecurityTokenRequestType[] {
			ISSUE0,
			RENEW1,
		};

	/**
	 * A public read-only list of all the '<em><b>Security Token Request Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SecurityTokenRequestType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Security Token Request Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SecurityTokenRequestType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SecurityTokenRequestType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Security Token Request Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SecurityTokenRequestType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SecurityTokenRequestType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Security Token Request Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SecurityTokenRequestType get(int value) {
		switch (value) {
			case ISSUE0_VALUE: return ISSUE0;
			case RENEW1_VALUE: return RENEW1;
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
	private SecurityTokenRequestType(int value, String name, String literal) {
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
	
} //SecurityTokenRequestType
