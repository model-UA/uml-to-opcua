/**
 */
package org.opcfoundation.ua._2008._02.types.tests;

import junit.textui.TestRunner;

import org.opcfoundation.ua._2008._02.types.TypesFactory;
import org.opcfoundation.ua._2008._02.types.X509IdentityToken;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>X509 Identity Token</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class X509IdentityTokenTest extends UserIdentityTokenTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(X509IdentityTokenTest.class);
	}

	/**
	 * Constructs a new X509 Identity Token test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public X509IdentityTokenTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this X509 Identity Token test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected X509IdentityToken getFixture() {
		return (X509IdentityToken)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TypesFactory.eINSTANCE.createX509IdentityToken());
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

} //X509IdentityTokenTest
