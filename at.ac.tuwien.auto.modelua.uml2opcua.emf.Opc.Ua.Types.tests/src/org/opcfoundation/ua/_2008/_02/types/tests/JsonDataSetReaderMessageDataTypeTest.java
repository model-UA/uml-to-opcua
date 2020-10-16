/**
 */
package org.opcfoundation.ua._2008._02.types.tests;

import junit.textui.TestRunner;

import org.opcfoundation.ua._2008._02.types.JsonDataSetReaderMessageDataType;
import org.opcfoundation.ua._2008._02.types.TypesFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Json Data Set Reader Message Data Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class JsonDataSetReaderMessageDataTypeTest extends DataSetReaderMessageDataTypeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(JsonDataSetReaderMessageDataTypeTest.class);
	}

	/**
	 * Constructs a new Json Data Set Reader Message Data Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JsonDataSetReaderMessageDataTypeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Json Data Set Reader Message Data Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected JsonDataSetReaderMessageDataType getFixture() {
		return (JsonDataSetReaderMessageDataType)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TypesFactory.eINSTANCE.createJsonDataSetReaderMessageDataType());
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

} //JsonDataSetReaderMessageDataTypeTest
