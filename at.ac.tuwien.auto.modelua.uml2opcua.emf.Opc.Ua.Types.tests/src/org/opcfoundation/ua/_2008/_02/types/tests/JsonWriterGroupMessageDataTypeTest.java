/**
 */
package org.opcfoundation.ua._2008._02.types.tests;

import junit.textui.TestRunner;

import org.opcfoundation.ua._2008._02.types.JsonWriterGroupMessageDataType;
import org.opcfoundation.ua._2008._02.types.TypesFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Json Writer Group Message Data Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class JsonWriterGroupMessageDataTypeTest extends WriterGroupMessageDataTypeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(JsonWriterGroupMessageDataTypeTest.class);
	}

	/**
	 * Constructs a new Json Writer Group Message Data Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JsonWriterGroupMessageDataTypeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Json Writer Group Message Data Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected JsonWriterGroupMessageDataType getFixture() {
		return (JsonWriterGroupMessageDataType)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TypesFactory.eINSTANCE.createJsonWriterGroupMessageDataType());
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

} //JsonWriterGroupMessageDataTypeTest
