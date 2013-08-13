/**
 */
package org.city.city.tests;

import junit.textui.TestRunner;

import org.city.city.CityFactory;
import org.city.city.Tram;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Tram</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TramTest extends VehicleTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TramTest.class);
	}

	/**
	 * Constructs a new Tram test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TramTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Tram test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Tram getFixture() {
		return (Tram)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CityFactory.eINSTANCE.createTram());
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

} //TramTest
