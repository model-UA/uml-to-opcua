/**
 */
package org.opcfoundation.ua._2008._02.types.tests;

import junit.textui.TestRunner;

import org.opcfoundation.ua._2008._02.types.SimpleTypeDescription;
import org.opcfoundation.ua._2008._02.types.TypesFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Simple Type Description</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimpleTypeDescriptionTest extends DataTypeDescriptionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SimpleTypeDescriptionTest.class);
	}

	/**
	 * Constructs a new Simple Type Description test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleTypeDescriptionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Simple Type Description test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SimpleTypeDescription getFixture() {
		return (SimpleTypeDescription)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TypesFactory.eINSTANCE.createSimpleTypeDescription());
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

} //SimpleTypeDescriptionTest
