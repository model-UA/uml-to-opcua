/**
 */
package org.opcfoundation.ua._2011._03.ua.node.set.tests;

import junit.textui.TestRunner;

import org.opcfoundation.ua._2011._03.ua.node.set.SetFactory;
import org.opcfoundation.ua._2011._03.ua.node.set.UAView;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>UA View</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class UAViewTest extends UAInstanceTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(UAViewTest.class);
	}

	/**
	 * Constructs a new UA View test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UAViewTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this UA View test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected UAView getFixture() {
		return (UAView)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SetFactory.eINSTANCE.createUAView());
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

} //UAViewTest
