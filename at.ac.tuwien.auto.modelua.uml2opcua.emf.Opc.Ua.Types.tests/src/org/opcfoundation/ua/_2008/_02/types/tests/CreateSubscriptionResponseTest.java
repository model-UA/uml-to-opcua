/**
 */
package org.opcfoundation.ua._2008._02.types.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.opcfoundation.ua._2008._02.types.CreateSubscriptionResponse;
import org.opcfoundation.ua._2008._02.types.TypesFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Create Subscription Response</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CreateSubscriptionResponseTest extends TestCase {

	/**
	 * The fixture for this Create Subscription Response test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CreateSubscriptionResponse fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CreateSubscriptionResponseTest.class);
	}

	/**
	 * Constructs a new Create Subscription Response test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateSubscriptionResponseTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Create Subscription Response test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(CreateSubscriptionResponse fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Create Subscription Response test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CreateSubscriptionResponse getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TypesFactory.eINSTANCE.createCreateSubscriptionResponse());
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

} //CreateSubscriptionResponseTest
