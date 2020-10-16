/**
 */
package org.opcfoundation.ua._2008._02.types.tests;

import junit.textui.TestRunner;

import org.opcfoundation.ua._2008._02.types.TypesFactory;
import org.opcfoundation.ua._2008._02.types.UpdateEventDetails;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Update Event Details</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class UpdateEventDetailsTest extends HistoryUpdateDetailsTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(UpdateEventDetailsTest.class);
	}

	/**
	 * Constructs a new Update Event Details test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdateEventDetailsTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Update Event Details test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected UpdateEventDetails getFixture() {
		return (UpdateEventDetails)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TypesFactory.eINSTANCE.createUpdateEventDetails());
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

} //UpdateEventDetailsTest
