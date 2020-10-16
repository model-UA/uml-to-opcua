/**
 */
package org.opcfoundation.ua._2008._02.types.tests;

import junit.textui.TestRunner;

import org.opcfoundation.ua._2008._02.types.JsonDataSetWriterMessageDataType;
import org.opcfoundation.ua._2008._02.types.TypesFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Json Data Set Writer Message Data Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class JsonDataSetWriterMessageDataTypeTest extends DataSetWriterMessageDataTypeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(JsonDataSetWriterMessageDataTypeTest.class);
	}

	/**
	 * Constructs a new Json Data Set Writer Message Data Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JsonDataSetWriterMessageDataTypeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Json Data Set Writer Message Data Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected JsonDataSetWriterMessageDataType getFixture() {
		return (JsonDataSetWriterMessageDataType)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TypesFactory.eINSTANCE.createJsonDataSetWriterMessageDataType());
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

} //JsonDataSetWriterMessageDataTypeTest
