/**
 */
package org.opcfoundation.ua._2008._02.types.tests;

import junit.textui.TestRunner;

import org.opcfoundation.ua._2008._02.types.ReadAnnotationDataDetails;
import org.opcfoundation.ua._2008._02.types.TypesFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Read Annotation Data Details</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ReadAnnotationDataDetailsTest extends HistoryReadDetailsTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ReadAnnotationDataDetailsTest.class);
	}

	/**
	 * Constructs a new Read Annotation Data Details test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadAnnotationDataDetailsTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Read Annotation Data Details test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ReadAnnotationDataDetails getFixture() {
		return (ReadAnnotationDataDetails)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TypesFactory.eINSTANCE.createReadAnnotationDataDetails());
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

} //ReadAnnotationDataDetailsTest
