/**
 */
package org.opcfoundation.ua._2008._02.types.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>Opc.Ua</b></em>' model.
 * <!-- end-user-doc -->
 * @generated
 */
public class OpcUaAllTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new OpcUaAllTests("Opc.Ua Tests");
		suite.addTest(TypesTests.suite());
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpcUaAllTests(String name) {
		super(name);
	}

} //OpcUaAllTests
