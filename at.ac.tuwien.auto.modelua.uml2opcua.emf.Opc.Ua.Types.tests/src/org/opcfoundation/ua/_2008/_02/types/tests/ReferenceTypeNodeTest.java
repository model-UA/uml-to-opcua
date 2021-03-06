/**
 */
package org.opcfoundation.ua._2008._02.types.tests;

import junit.textui.TestRunner;

import org.opcfoundation.ua._2008._02.types.ReferenceTypeNode;
import org.opcfoundation.ua._2008._02.types.TypesFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Reference Type Node</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ReferenceTypeNodeTest extends TypeNodeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ReferenceTypeNodeTest.class);
	}

	/**
	 * Constructs a new Reference Type Node test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceTypeNodeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Reference Type Node test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ReferenceTypeNode getFixture() {
		return (ReferenceTypeNode)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TypesFactory.eINSTANCE.createReferenceTypeNode());
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

} //ReferenceTypeNodeTest
