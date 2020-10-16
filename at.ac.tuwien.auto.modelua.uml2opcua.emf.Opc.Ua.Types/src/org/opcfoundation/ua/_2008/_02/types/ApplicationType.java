/**
 */
package org.opcfoundation.ua._2008._02.types;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Application Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getApplicationType()
 * @model extendedMetaData="name='ApplicationType'"
 * @generated
 */
public enum ApplicationType implements Enumerator {
	/**
	 * The '<em><b>Server0</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SERVER0_VALUE
	 * @generated
	 * @ordered
	 */
	SERVER0(0, "Server0", "Server_0"),

	/**
	 * The '<em><b>Client1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLIENT1_VALUE
	 * @generated
	 * @ordered
	 */
	CLIENT1(1, "Client1", "Client_1"),

	/**
	 * The '<em><b>Client And Server2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLIENT_AND_SERVER2_VALUE
	 * @generated
	 * @ordered
	 */
	CLIENT_AND_SERVER2(2, "ClientAndServer2", "ClientAndServer_2"),

	/**
	 * The '<em><b>Discovery Server3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISCOVERY_SERVER3_VALUE
	 * @generated
	 * @ordered
	 */
	DISCOVERY_SERVER3(3, "DiscoveryServer3", "DiscoveryServer_3");

	/**
	 * The '<em><b>Server0</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SERVER0
	 * @model name="Server0" literal="Server_0"
	 * @generated
	 * @ordered
	 */
	public static final int SERVER0_VALUE = 0;

	/**
	 * The '<em><b>Client1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLIENT1
	 * @model name="Client1" literal="Client_1"
	 * @generated
	 * @ordered
	 */
	public static final int CLIENT1_VALUE = 1;

	/**
	 * The '<em><b>Client And Server2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLIENT_AND_SERVER2
	 * @model name="ClientAndServer2" literal="ClientAndServer_2"
	 * @generated
	 * @ordered
	 */
	public static final int CLIENT_AND_SERVER2_VALUE = 2;

	/**
	 * The '<em><b>Discovery Server3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISCOVERY_SERVER3
	 * @model name="DiscoveryServer3" literal="DiscoveryServer_3"
	 * @generated
	 * @ordered
	 */
	public static final int DISCOVERY_SERVER3_VALUE = 3;

	/**
	 * An array of all the '<em><b>Application Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ApplicationType[] VALUES_ARRAY =
		new ApplicationType[] {
			SERVER0,
			CLIENT1,
			CLIENT_AND_SERVER2,
			DISCOVERY_SERVER3,
		};

	/**
	 * A public read-only list of all the '<em><b>Application Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ApplicationType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Application Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ApplicationType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ApplicationType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Application Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ApplicationType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ApplicationType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Application Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ApplicationType get(int value) {
		switch (value) {
			case SERVER0_VALUE: return SERVER0;
			case CLIENT1_VALUE: return CLIENT1;
			case CLIENT_AND_SERVER2_VALUE: return CLIENT_AND_SERVER2;
			case DISCOVERY_SERVER3_VALUE: return DISCOVERY_SERVER3;
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
	private ApplicationType(int value, String name, String literal) {
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
	
} //ApplicationType
