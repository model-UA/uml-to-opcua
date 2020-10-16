/**
 */
package org.opcfoundation.ua._2011._03.ua.node.set.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.opcfoundation.ua._2011._03.ua.node.set.SetFactory;
import org.opcfoundation.ua._2011._03.ua.node.set.UANode;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>UA Node</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class UANodeTest extends TestCase {

	/**
	 * The fixture for this UA Node test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UANode fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(UANodeTest.class);
	}

	/**
	 * Constructs a new UA Node test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UANodeTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this UA Node test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(UANode fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this UA Node test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UANode getFixture() {
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
		setFixture(SetFactory.eINSTANCE.createUANode());
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

} //UANodeTest
