/**
 */
package org.opcfoundation.ua._2011._03.ua.node.set.tests;

import junit.textui.TestRunner;

import org.opcfoundation.ua._2011._03.ua.node.set.SetFactory;
import org.opcfoundation.ua._2011._03.ua.node.set.UAObjectType;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>UA Object Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class UAObjectTypeTest extends UATypeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(UAObjectTypeTest.class);
	}

	/**
	 * Constructs a new UA Object Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UAObjectTypeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this UA Object Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected UAObjectType getFixture() {
		return (UAObjectType)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SetFactory.eINSTANCE.createUAObjectType());
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

} //UAObjectTypeTest
