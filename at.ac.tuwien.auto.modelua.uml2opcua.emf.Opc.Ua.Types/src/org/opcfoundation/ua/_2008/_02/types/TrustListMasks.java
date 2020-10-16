/**
 */
package org.opcfoundation.ua._2008._02.types;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Trust List Masks</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getTrustListMasks()
 * @model extendedMetaData="name='TrustListMasks'"
 * @generated
 */
public enum TrustListMasks implements Enumerator {
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
	 * The '<em><b>Trusted Certificates1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRUSTED_CERTIFICATES1_VALUE
	 * @generated
	 * @ordered
	 */
	TRUSTED_CERTIFICATES1(1, "TrustedCertificates1", "TrustedCertificates_1"),

	/**
	 * The '<em><b>Trusted Crls2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRUSTED_CRLS2_VALUE
	 * @generated
	 * @ordered
	 */
	TRUSTED_CRLS2(2, "TrustedCrls2", "TrustedCrls_2"),

	/**
	 * The '<em><b>Issuer Certificates4</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ISSUER_CERTIFICATES4_VALUE
	 * @generated
	 * @ordered
	 */
	ISSUER_CERTIFICATES4(3, "IssuerCertificates4", "IssuerCertificates_4"),

	/**
	 * The '<em><b>Issuer Crls8</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ISSUER_CRLS8_VALUE
	 * @generated
	 * @ordered
	 */
	ISSUER_CRLS8(4, "IssuerCrls8", "IssuerCrls_8"),

	/**
	 * The '<em><b>All15</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALL15_VALUE
	 * @generated
	 * @ordered
	 */
	ALL15(5, "All15", "All_15");

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
	 * The '<em><b>Trusted Certificates1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRUSTED_CERTIFICATES1
	 * @model name="TrustedCertificates1" literal="TrustedCertificates_1"
	 * @generated
	 * @ordered
	 */
	public static final int TRUSTED_CERTIFICATES1_VALUE = 1;

	/**
	 * The '<em><b>Trusted Crls2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRUSTED_CRLS2
	 * @model name="TrustedCrls2" literal="TrustedCrls_2"
	 * @generated
	 * @ordered
	 */
	public static final int TRUSTED_CRLS2_VALUE = 2;

	/**
	 * The '<em><b>Issuer Certificates4</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ISSUER_CERTIFICATES4
	 * @model name="IssuerCertificates4" literal="IssuerCertificates_4"
	 * @generated
	 * @ordered
	 */
	public static final int ISSUER_CERTIFICATES4_VALUE = 3;

	/**
	 * The '<em><b>Issuer Crls8</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ISSUER_CRLS8
	 * @model name="IssuerCrls8" literal="IssuerCrls_8"
	 * @generated
	 * @ordered
	 */
	public static final int ISSUER_CRLS8_VALUE = 4;

	/**
	 * The '<em><b>All15</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALL15
	 * @model name="All15" literal="All_15"
	 * @generated
	 * @ordered
	 */
	public static final int ALL15_VALUE = 5;

	/**
	 * An array of all the '<em><b>Trust List Masks</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TrustListMasks[] VALUES_ARRAY =
		new TrustListMasks[] {
			NONE0,
			TRUSTED_CERTIFICATES1,
			TRUSTED_CRLS2,
			ISSUER_CERTIFICATES4,
			ISSUER_CRLS8,
			ALL15,
		};

	/**
	 * A public read-only list of all the '<em><b>Trust List Masks</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TrustListMasks> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Trust List Masks</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TrustListMasks get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TrustListMasks result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Trust List Masks</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TrustListMasks getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TrustListMasks result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Trust List Masks</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TrustListMasks get(int value) {
		switch (value) {
			case NONE0_VALUE: return NONE0;
			case TRUSTED_CERTIFICATES1_VALUE: return TRUSTED_CERTIFICATES1;
			case TRUSTED_CRLS2_VALUE: return TRUSTED_CRLS2;
			case ISSUER_CERTIFICATES4_VALUE: return ISSUER_CERTIFICATES4;
			case ISSUER_CRLS8_VALUE: return ISSUER_CRLS8;
			case ALL15_VALUE: return ALL15;
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
	private TrustListMasks(int value, String name, String literal) {
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
	
} //TrustListMasks
