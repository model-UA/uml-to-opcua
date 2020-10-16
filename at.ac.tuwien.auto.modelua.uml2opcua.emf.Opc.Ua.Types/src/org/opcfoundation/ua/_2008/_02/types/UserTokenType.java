/**
 */
package org.opcfoundation.ua._2008._02.types;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>User Token Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getUserTokenType()
 * @model extendedMetaData="name='UserTokenType'"
 * @generated
 */
public enum UserTokenType implements Enumerator {
	/**
	 * The '<em><b>Anonymous0</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANONYMOUS0_VALUE
	 * @generated
	 * @ordered
	 */
	ANONYMOUS0(0, "Anonymous0", "Anonymous_0"),

	/**
	 * The '<em><b>User Name1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USER_NAME1_VALUE
	 * @generated
	 * @ordered
	 */
	USER_NAME1(1, "UserName1", "UserName_1"),

	/**
	 * The '<em><b>Certificate2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CERTIFICATE2_VALUE
	 * @generated
	 * @ordered
	 */
	CERTIFICATE2(2, "Certificate2", "Certificate_2"),

	/**
	 * The '<em><b>Issued Token3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ISSUED_TOKEN3_VALUE
	 * @generated
	 * @ordered
	 */
	ISSUED_TOKEN3(3, "IssuedToken3", "IssuedToken_3");

	/**
	 * The '<em><b>Anonymous0</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANONYMOUS0
	 * @model name="Anonymous0" literal="Anonymous_0"
	 * @generated
	 * @ordered
	 */
	public static final int ANONYMOUS0_VALUE = 0;

	/**
	 * The '<em><b>User Name1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USER_NAME1
	 * @model name="UserName1" literal="UserName_1"
	 * @generated
	 * @ordered
	 */
	public static final int USER_NAME1_VALUE = 1;

	/**
	 * The '<em><b>Certificate2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CERTIFICATE2
	 * @model name="Certificate2" literal="Certificate_2"
	 * @generated
	 * @ordered
	 */
	public static final int CERTIFICATE2_VALUE = 2;

	/**
	 * The '<em><b>Issued Token3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ISSUED_TOKEN3
	 * @model name="IssuedToken3" literal="IssuedToken_3"
	 * @generated
	 * @ordered
	 */
	public static final int ISSUED_TOKEN3_VALUE = 3;

	/**
	 * An array of all the '<em><b>User Token Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final UserTokenType[] VALUES_ARRAY =
		new UserTokenType[] {
			ANONYMOUS0,
			USER_NAME1,
			CERTIFICATE2,
			ISSUED_TOKEN3,
		};

	/**
	 * A public read-only list of all the '<em><b>User Token Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<UserTokenType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>User Token Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static UserTokenType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			UserTokenType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>User Token Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static UserTokenType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			UserTokenType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>User Token Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static UserTokenType get(int value) {
		switch (value) {
			case ANONYMOUS0_VALUE: return ANONYMOUS0;
			case USER_NAME1_VALUE: return USER_NAME1;
			case CERTIFICATE2_VALUE: return CERTIFICATE2;
			case ISSUED_TOKEN3_VALUE: return ISSUED_TOKEN3;
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
	private UserTokenType(int value, String name, String literal) {
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
	
} //UserTokenType
