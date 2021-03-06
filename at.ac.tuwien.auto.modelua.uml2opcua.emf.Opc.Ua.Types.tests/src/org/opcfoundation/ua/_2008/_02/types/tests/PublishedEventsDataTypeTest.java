/**
 */
package org.opcfoundation.ua._2008._02.types.tests;

import junit.textui.TestRunner;

import org.opcfoundation.ua._2008._02.types.PublishedEventsDataType;
import org.opcfoundation.ua._2008._02.types.TypesFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Published Events Data Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PublishedEventsDataTypeTest extends PublishedDataSetSourceDataTypeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PublishedEventsDataTypeTest.class);
	}

	/**
	 * Constructs a new Published Events Data Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PublishedEventsDataTypeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Published Events Data Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PublishedEventsDataType getFixture() {
		return (PublishedEventsDataType)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TypesFactory.eINSTANCE.createPublishedEventsDataType());
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

} //PublishedEventsDataTypeTest
