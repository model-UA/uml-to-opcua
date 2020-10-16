/**
 */
package org.opcfoundation.ua._2008._02.types;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Identity Criteria Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getIdentityCriteriaType()
 * @model extendedMetaData="name='IdentityCriteriaType'"
 * @generated
 */
public enum IdentityCriteriaType implements Enumerator {
	/**
	 * The '<em><b>User Name1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USER_NAME1_VALUE
	 * @generated
	 * @ordered
	 */
	USER_NAME1(0, "UserName1", "UserName_1"),

	/**
	 * The '<em><b>Thumbprint2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #THUMBPRINT2_VALUE
	 * @generated
	 * @ordered
	 */
	THUMBPRINT2(1, "Thumbprint2", "Thumbprint_2"),

	/**
	 * The '<em><b>Role3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ROLE3_VALUE
	 * @generated
	 * @ordered
	 */
	ROLE3(2, "Role3", "Role_3"),

	/**
	 * The '<em><b>Group Id4</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GROUP_ID4_VALUE
	 * @generated
	 * @ordered
	 */
	GROUP_ID4(3, "GroupId4", "GroupId_4"),

	/**
	 * The '<em><b>Anonymous5</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANONYMOUS5_VALUE
	 * @generated
	 * @ordered
	 */
	ANONYMOUS5(4, "Anonymous5", "Anonymous_5"),

	/**
	 * The '<em><b>Authenticated User6</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUTHENTICATED_USER6_VALUE
	 * @generated
	 * @ordered
	 */
	AUTHENTICATED_USER6(5, "AuthenticatedUser6", "AuthenticatedUser_6");

	/**
	 * The '<em><b>User Name1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USER_NAME1
	 * @model name="UserName1" literal="UserName_1"
	 * @generated
	 * @ordered
	 */
	public static final int USER_NAME1_VALUE = 0;

	/**
	 * The '<em><b>Thumbprint2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #THUMBPRINT2
	 * @model name="Thumbprint2" literal="Thumbprint_2"
	 * @generated
	 * @ordered
	 */
	public static final int THUMBPRINT2_VALUE = 1;

	/**
	 * The '<em><b>Role3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ROLE3
	 * @model name="Role3" literal="Role_3"
	 * @generated
	 * @ordered
	 */
	public static final int ROLE3_VALUE = 2;

	/**
	 * The '<em><b>Group Id4</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GROUP_ID4
	 * @model name="GroupId4" literal="GroupId_4"
	 * @generated
	 * @ordered
	 */
	public static final int GROUP_ID4_VALUE = 3;

	/**
	 * The '<em><b>Anonymous5</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANONYMOUS5
	 * @model name="Anonymous5" literal="Anonymous_5"
	 * @generated
	 * @ordered
	 */
	public static final int ANONYMOUS5_VALUE = 4;

	/**
	 * The '<em><b>Authenticated User6</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUTHENTICATED_USER6
	 * @model name="AuthenticatedUser6" literal="AuthenticatedUser_6"
	 * @generated
	 * @ordered
	 */
	public static final int AUTHENTICATED_USER6_VALUE = 5;

	/**
	 * An array of all the '<em><b>Identity Criteria Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final IdentityCriteriaType[] VALUES_ARRAY =
		new IdentityCriteriaType[] {
			USER_NAME1,
			THUMBPRINT2,
			ROLE3,
			GROUP_ID4,
			ANONYMOUS5,
			AUTHENTICATED_USER6,
		};

	/**
	 * A public read-only list of all the '<em><b>Identity Criteria Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<IdentityCriteriaType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Identity Criteria Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static IdentityCriteriaType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IdentityCriteriaType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Identity Criteria Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static IdentityCriteriaType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IdentityCriteriaType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Identity Criteria Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static IdentityCriteriaType get(int value) {
		switch (value) {
			case USER_NAME1_VALUE: return USER_NAME1;
			case THUMBPRINT2_VALUE: return THUMBPRINT2;
			case ROLE3_VALUE: return ROLE3;
			case GROUP_ID4_VALUE: return GROUP_ID4;
			case ANONYMOUS5_VALUE: return ANONYMOUS5;
			case AUTHENTICATED_USER6_VALUE: return AUTHENTICATED_USER6;
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
	private IdentityCriteriaType(int value, String name, String literal) {
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
	
} //IdentityCriteriaType
