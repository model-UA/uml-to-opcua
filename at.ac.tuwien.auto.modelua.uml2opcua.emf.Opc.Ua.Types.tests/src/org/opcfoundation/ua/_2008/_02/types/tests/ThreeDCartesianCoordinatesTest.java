/**
 */
package org.opcfoundation.ua._2008._02.types.tests;

import junit.textui.TestRunner;

import org.opcfoundation.ua._2008._02.types.ThreeDCartesianCoordinates;
import org.opcfoundation.ua._2008._02.types.TypesFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Three DCartesian Coordinates</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ThreeDCartesianCoordinatesTest extends CartesianCoordinatesTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ThreeDCartesianCoordinatesTest.class);
	}

	/**
	 * Constructs a new Three DCartesian Coordinates test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThreeDCartesianCoordinatesTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Three DCartesian Coordinates test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ThreeDCartesianCoordinates getFixture() {
		return (ThreeDCartesianCoordinates)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TypesFactory.eINSTANCE.createThreeDCartesianCoordinates());
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

} //ThreeDCartesianCoordinatesTest
