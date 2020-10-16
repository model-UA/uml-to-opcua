/**
 */
package org.opcfoundation.ua._2008._02.types.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.opcfoundation.ua._2008._02.types.TypesFactory;
import org.opcfoundation.ua._2008._02.types.UnregisterNodesRequest;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Unregister Nodes Request</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class UnregisterNodesRequestTest extends TestCase {

	/**
	 * The fixture for this Unregister Nodes Request test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnregisterNodesRequest fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(UnregisterNodesRequestTest.class);
	}

	/**
	 * Constructs a new Unregister Nodes Request test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnregisterNodesRequestTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Unregister Nodes Request test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(UnregisterNodesRequest fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Unregister Nodes Request test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnregisterNodesRequest getFixture() {
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
		setFixture(TypesFactory.eINSTANCE.createUnregisterNodesRequest());
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

} //UnregisterNodesRequestTest
