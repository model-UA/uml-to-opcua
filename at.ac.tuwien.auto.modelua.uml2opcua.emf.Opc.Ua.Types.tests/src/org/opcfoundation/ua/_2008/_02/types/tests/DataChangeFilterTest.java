/**
 */
package org.opcfoundation.ua._2008._02.types.tests;

import junit.textui.TestRunner;

import org.opcfoundation.ua._2008._02.types.DataChangeFilter;
import org.opcfoundation.ua._2008._02.types.TypesFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Data Change Filter</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DataChangeFilterTest extends MonitoringFilterTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DataChangeFilterTest.class);
	}

	/**
	 * Constructs a new Data Change Filter test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataChangeFilterTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Data Change Filter test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DataChangeFilter getFixture() {
		return (DataChangeFilter)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TypesFactory.eINSTANCE.createDataChangeFilter());
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

} //DataChangeFilterTest
