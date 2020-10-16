/**
 */
package org.opcfoundation.ua._2011._03.ua.node.set.tests;

import junit.textui.TestRunner;

import org.opcfoundation.ua._2011._03.ua.node.set.SetFactory;
import org.opcfoundation.ua._2011._03.ua.node.set.UAVariableType;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>UA Variable Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class UAVariableTypeTest extends UATypeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(UAVariableTypeTest.class);
	}

	/**
	 * Constructs a new UA Variable Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UAVariableTypeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this UA Variable Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected UAVariableType getFixture() {
		return (UAVariableType)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SetFactory.eINSTANCE.createUAVariableType());
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

} //UAVariableTypeTest
