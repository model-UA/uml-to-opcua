/**
 */
package org.opcfoundation.ua._2008._02.types.tests;

import junit.textui.TestRunner;

import org.opcfoundation.ua._2008._02.types.TypesFactory;
import org.opcfoundation.ua._2008._02.types.UABinaryFileDataType;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>UA Binary File Data Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class UABinaryFileDataTypeTest extends DataTypeSchemaHeaderTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(UABinaryFileDataTypeTest.class);
	}

	/**
	 * Constructs a new UA Binary File Data Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UABinaryFileDataTypeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this UA Binary File Data Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected UABinaryFileDataType getFixture() {
		return (UABinaryFileDataType)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TypesFactory.eINSTANCE.createUABinaryFileDataType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //UABinaryFileDataTypeTest
