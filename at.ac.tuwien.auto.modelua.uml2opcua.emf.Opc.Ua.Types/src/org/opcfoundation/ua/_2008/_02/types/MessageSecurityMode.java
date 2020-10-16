/**
 */
package org.opcfoundation.ua._2008._02.types;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Message Security Mode</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getMessageSecurityMode()
 * @model extendedMetaData="name='MessageSecurityMode'"
 * @generated
 */
public enum MessageSecurityMode implements Enumerator {
	/**
	 * The '<em><b>Invalid0</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INVALID0_VALUE
	 * @generated
	 * @ordered
	 */
	INVALID0(0, "Invalid0", "Invalid_0"),

	/**
	 * The '<em><b>None1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE1_VALUE
	 * @generated
	 * @ordered
	 */
	NONE1(1, "None1", "None_1"),

	/**
	 * The '<em><b>Sign2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIGN2_VALUE
	 * @generated
	 * @ordered
	 */
	SIGN2(2, "Sign2", "Sign_2"),

	/**
	 * The '<em><b>Sign And Encrypt3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIGN_AND_ENCRYPT3_VALUE
	 * @generated
	 * @ordered
	 */
	SIGN_AND_ENCRYPT3(3, "SignAndEncrypt3", "SignAndEncrypt_3");

	/**
	 * The '<em><b>Invalid0</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INVALID0
	 * @model name="Invalid0" literal="Invalid_0"
	 * @generated
	 * @ordered
	 */
	public static final int INVALID0_VALUE = 0;

	/**
	 * The '<em><b>None1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE1
	 * @model name="None1" literal="None_1"
	 * @generated
	 * @ordered
	 */
	public static final int NONE1_VALUE = 1;

	/**
	 * The '<em><b>Sign2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIGN2
	 * @model name="Sign2" literal="Sign_2"
	 * @generated
	 * @ordered
	 */
	public static final int SIGN2_VALUE = 2;

	/**
	 * The '<em><b>Sign And Encrypt3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIGN_AND_ENCRYPT3
	 * @model name="SignAndEncrypt3" literal="SignAndEncrypt_3"
	 * @generated
	 * @ordered
	 */
	public static final int SIGN_AND_ENCRYPT3_VALUE = 3;

	/**
	 * An array of all the '<em><b>Message Security Mode</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MessageSecurityMode[] VALUES_ARRAY =
		new MessageSecurityMode[] {
			INVALID0,
			NONE1,
			SIGN2,
			SIGN_AND_ENCRYPT3,
		};

	/**
	 * A public read-only list of all the '<em><b>Message Security Mode</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MessageSecurityMode> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Message Security Mode</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MessageSecurityMode get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MessageSecurityMode result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Message Security Mode</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MessageSecurityMode getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MessageSecurityMode result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Message Security Mode</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MessageSecurityMode get(int value) {
		switch (value) {
			case INVALID0_VALUE: return INVALID0;
			case NONE1_VALUE: return NONE1;
			case SIGN2_VALUE: return SIGN2;
			case SIGN_AND_ENCRYPT3_VALUE: return SIGN_AND_ENCRYPT3;
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
	private MessageSecurityMode(int value, String name, String literal) {
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
	
} //MessageSecurityMode
