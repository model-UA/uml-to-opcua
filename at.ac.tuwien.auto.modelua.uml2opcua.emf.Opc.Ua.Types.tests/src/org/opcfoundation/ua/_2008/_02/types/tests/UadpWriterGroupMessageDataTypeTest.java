/**
 */
package org.opcfoundation.ua._2008._02.types.tests;

import junit.textui.TestRunner;

import org.opcfoundation.ua._2008._02.types.TypesFactory;
import org.opcfoundation.ua._2008._02.types.UadpWriterGroupMessageDataType;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Uadp Writer Group Message Data Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class UadpWriterGroupMessageDataTypeTest extends WriterGroupMessageDataTypeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(UadpWriterGroupMessageDataTypeTest.class);
	}

	/**
	 * Constructs a new Uadp Writer Group Message Data Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UadpWriterGroupMessageDataTypeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Uadp Writer Group Message Data Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected UadpWriterGroupMessageDataType getFixture() {
		return (UadpWriterGroupMessageDataType)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TypesFactory.eINSTANCE.createUadpWriterGroupMessageDataType());
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

} //UadpWriterGroupMessageDataTypeTest
