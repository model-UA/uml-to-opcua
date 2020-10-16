/**
 */
package org.opcfoundation.ua._2011._03.ua.node.set.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.opcfoundation.ua._2011._03.ua.node.set.NodeSetStatus;
import org.opcfoundation.ua._2011._03.ua.node.set.SetFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Node Set Status</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NodeSetStatusTest extends TestCase {

	/**
	 * The fixture for this Node Set Status test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeSetStatus fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NodeSetStatusTest.class);
	}

	/**
	 * Constructs a new Node Set Status test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeSetStatusTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Node Set Status test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(NodeSetStatus fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Node Set Status test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeSetStatus getFixture() {
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
		setFixture(SetFactory.eINSTANCE.createNodeSetStatus());
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

} //NodeSetStatusTest
