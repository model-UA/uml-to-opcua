/**
 */
package org.opcfoundation.ua._2008._02.types;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Model Change Structure Verb Mask</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getModelChangeStructureVerbMask()
 * @model extendedMetaData="name='ModelChangeStructureVerbMask'"
 * @generated
 */
public enum ModelChangeStructureVerbMask implements Enumerator {
	/**
	 * The '<em><b>Node Added1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NODE_ADDED1_VALUE
	 * @generated
	 * @ordered
	 */
	NODE_ADDED1(0, "NodeAdded1", "NodeAdded_1"),

	/**
	 * The '<em><b>Node Deleted2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NODE_DELETED2_VALUE
	 * @generated
	 * @ordered
	 */
	NODE_DELETED2(1, "NodeDeleted2", "NodeDeleted_2"),

	/**
	 * The '<em><b>Reference Added4</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REFERENCE_ADDED4_VALUE
	 * @generated
	 * @ordered
	 */
	REFERENCE_ADDED4(2, "ReferenceAdded4", "ReferenceAdded_4"),

	/**
	 * The '<em><b>Reference Deleted8</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REFERENCE_DELETED8_VALUE
	 * @generated
	 * @ordered
	 */
	REFERENCE_DELETED8(3, "ReferenceDeleted8", "ReferenceDeleted_8"),

	/**
	 * The '<em><b>Data Type Changed16</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_TYPE_CHANGED16_VALUE
	 * @generated
	 * @ordered
	 */
	DATA_TYPE_CHANGED16(4, "DataTypeChanged16", "DataTypeChanged_16");

	/**
	 * The '<em><b>Node Added1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NODE_ADDED1
	 * @model name="NodeAdded1" literal="NodeAdded_1"
	 * @generated
	 * @ordered
	 */
	public static final int NODE_ADDED1_VALUE = 0;

	/**
	 * The '<em><b>Node Deleted2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NODE_DELETED2
	 * @model name="NodeDeleted2" literal="NodeDeleted_2"
	 * @generated
	 * @ordered
	 */
	public static final int NODE_DELETED2_VALUE = 1;

	/**
	 * The '<em><b>Reference Added4</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REFERENCE_ADDED4
	 * @model name="ReferenceAdded4" literal="ReferenceAdded_4"
	 * @generated
	 * @ordered
	 */
	public static final int REFERENCE_ADDED4_VALUE = 2;

	/**
	 * The '<em><b>Reference Deleted8</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REFERENCE_DELETED8
	 * @model name="ReferenceDeleted8" literal="ReferenceDeleted_8"
	 * @generated
	 * @ordered
	 */
	public static final int REFERENCE_DELETED8_VALUE = 3;

	/**
	 * The '<em><b>Data Type Changed16</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_TYPE_CHANGED16
	 * @model name="DataTypeChanged16" literal="DataTypeChanged_16"
	 * @generated
	 * @ordered
	 */
	public static final int DATA_TYPE_CHANGED16_VALUE = 4;

	/**
	 * An array of all the '<em><b>Model Change Structure Verb Mask</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ModelChangeStructureVerbMask[] VALUES_ARRAY =
		new ModelChangeStructureVerbMask[] {
			NODE_ADDED1,
			NODE_DELETED2,
			REFERENCE_ADDED4,
			REFERENCE_DELETED8,
			DATA_TYPE_CHANGED16,
		};

	/**
	 * A public read-only list of all the '<em><b>Model Change Structure Verb Mask</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ModelChangeStructureVerbMask> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Model Change Structure Verb Mask</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ModelChangeStructureVerbMask get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ModelChangeStructureVerbMask result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Model Change Structure Verb Mask</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ModelChangeStructureVerbMask getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ModelChangeStructureVerbMask result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Model Change Structure Verb Mask</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ModelChangeStructureVerbMask get(int value) {
		switch (value) {
			case NODE_ADDED1_VALUE: return NODE_ADDED1;
			case NODE_DELETED2_VALUE: return NODE_DELETED2;
			case REFERENCE_ADDED4_VALUE: return REFERENCE_ADDED4;
			case REFERENCE_DELETED8_VALUE: return REFERENCE_DELETED8;
			case DATA_TYPE_CHANGED16_VALUE: return DATA_TYPE_CHANGED16;
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
	private ModelChangeStructureVerbMask(int value, String name, String literal) {
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
	
} //ModelChangeStructureVerbMask
