/**
 */
package org.opcfoundation.ua._2011._03.ua.node.set.tests;

import junit.textui.TestRunner;

import org.opcfoundation.ua._2011._03.ua.node.set.SetFactory;
import org.opcfoundation.ua._2011._03.ua.node.set.UAObject;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>UA Object</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class UAObjectTest extends UAInstanceTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(UAObjectTest.class);
	}

	/**
	 * Constructs a new UA Object test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UAObjectTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this UA Object test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected UAObject getFixture() {
		return (UAObject)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SetFactory.eINSTANCE.createUAObject());
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

} //UAObjectTest
