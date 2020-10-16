/**
 */
package org.opcfoundation.ua._2011._03.ua.node.set.tests;

import junit.textui.TestRunner;

import org.opcfoundation.ua._2011._03.ua.node.set.SetFactory;
import org.opcfoundation.ua._2011._03.ua.node.set.UAType;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>UA Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class UATypeTest extends UANodeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(UATypeTest.class);
	}

	/**
	 * Constructs a new UA Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UATypeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this UA Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected UAType getFixture() {
		return (UAType)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SetFactory.eINSTANCE.createUAType());
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

} //UATypeTest
