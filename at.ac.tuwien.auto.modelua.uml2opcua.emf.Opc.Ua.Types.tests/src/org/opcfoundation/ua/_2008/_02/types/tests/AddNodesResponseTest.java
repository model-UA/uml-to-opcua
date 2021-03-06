/**
 */
package org.opcfoundation.ua._2008._02.types.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.opcfoundation.ua._2008._02.types.AddNodesResponse;
import org.opcfoundation.ua._2008._02.types.TypesFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Add Nodes Response</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AddNodesResponseTest extends TestCase {

	/**
	 * The fixture for this Add Nodes Response test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AddNodesResponse fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AddNodesResponseTest.class);
	}

	/**
	 * Constructs a new Add Nodes Response test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddNodesResponseTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Add Nodes Response test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(AddNodesResponse fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Add Nodes Response test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AddNodesResponse getFixture() {
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
		setFixture(TypesFactory.eINSTANCE.createAddNodesResponse());
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

} //AddNodesResponseTest
