/**
 */
package org.opcfoundation.ua._2008._02.types.tests;

import junit.textui.TestRunner;

import org.opcfoundation.ua._2008._02.types.DatagramWriterGroupTransportDataType;
import org.opcfoundation.ua._2008._02.types.TypesFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Datagram Writer Group Transport Data Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DatagramWriterGroupTransportDataTypeTest extends WriterGroupTransportDataTypeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DatagramWriterGroupTransportDataTypeTest.class);
	}

	/**
	 * Constructs a new Datagram Writer Group Transport Data Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatagramWriterGroupTransportDataTypeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Datagram Writer Group Transport Data Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DatagramWriterGroupTransportDataType getFixture() {
		return (DatagramWriterGroupTransportDataType)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TypesFactory.eINSTANCE.createDatagramWriterGroupTransportDataType());
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

} //DatagramWriterGroupTransportDataTypeTest
