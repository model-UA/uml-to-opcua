/**
 */
package org.opcfoundation.ua._2008._02.types.tests;

import junit.textui.TestRunner;

import org.opcfoundation.ua._2008._02.types.TypesFactory;
import org.opcfoundation.ua._2008._02.types.WriterGroupDataType;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Writer Group Data Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class WriterGroupDataTypeTest extends PubSubGroupDataTypeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(WriterGroupDataTypeTest.class);
	}

	/**
	 * Constructs a new Writer Group Data Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WriterGroupDataTypeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Writer Group Data Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected WriterGroupDataType getFixture() {
		return (WriterGroupDataType)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TypesFactory.eINSTANCE.createWriterGroupDataType());
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

} //WriterGroupDataTypeTest
