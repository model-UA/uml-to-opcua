/**
 */
package org.opcfoundation.ua._2008._02.types.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.opcfoundation.ua._2008._02.types.RegisterServerRequest;
import org.opcfoundation.ua._2008._02.types.TypesFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Register Server Request</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RegisterServerRequestTest extends TestCase {

	/**
	 * The fixture for this Register Server Request test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegisterServerRequest fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RegisterServerRequestTest.class);
	}

	/**
	 * Constructs a new Register Server Request test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegisterServerRequestTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Register Server Request test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(RegisterServerRequest fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Register Server Request test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegisterServerRequest getFixture() {
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
		setFixture(TypesFactory.eINSTANCE.createRegisterServerRequest());
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

} //RegisterServerRequestTest
