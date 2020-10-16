/**
 */
package org.opcfoundation.ua._2008._02.types.tests;

import junit.textui.TestRunner;

import org.opcfoundation.ua._2008._02.types.TypesFactory;
import org.opcfoundation.ua._2008._02.types.UserNameIdentityToken;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>User Name Identity Token</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class UserNameIdentityTokenTest extends UserIdentityTokenTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(UserNameIdentityTokenTest.class);
	}

	/**
	 * Constructs a new User Name Identity Token test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserNameIdentityTokenTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this User Name Identity Token test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected UserNameIdentityToken getFixture() {
		return (UserNameIdentityToken)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TypesFactory.eINSTANCE.createUserNameIdentityToken());
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

} //UserNameIdentityTokenTest
