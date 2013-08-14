/**
 */
package org.tud.city.transport.citytransportinventory;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Route</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tud.city.transport.citytransportinventory.Route#getEReference0 <em>EReference0</em>}</li>
 *   <li>{@link org.tud.city.transport.citytransportinventory.Route#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link org.tud.city.transport.citytransportinventory.Route#getEndTime <em>End Time</em>}</li>
 *   <li>{@link org.tud.city.transport.citytransportinventory.Route#getName <em>Name</em>}</li>
 *   <li>{@link org.tud.city.transport.citytransportinventory.Route#getAssignedVehicles <em>Assigned Vehicles</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tud.city.transport.citytransportinventory.CitytransportinventoryPackage#getRoute()
 * @model abstract="true"
 * @generated
 */
public interface Route extends EObject {
	/**
	 * Returns the value of the '<em><b>EReference0</b></em>' containment reference list.
	 * The list contents are of type {@link org.tud.city.transport.citytransportinventory.Station}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EReference0</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EReference0</em>' containment reference list.
	 * @see org.tud.city.transport.citytransportinventory.CitytransportinventoryPackage#getRoute_EReference0()
	 * @model containment="true"
	 * @generated
	 */
	EList<Station> getEReference0();

	/**
	 * Returns the value of the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Time</em>' attribute.
	 * @see #setStartTime(Date)
	 * @see org.tud.city.transport.citytransportinventory.CitytransportinventoryPackage#getRoute_StartTime()
	 * @model
	 * @generated
	 */
	Date getStartTime();

	/**
	 * Sets the value of the '{@link org.tud.city.transport.citytransportinventory.Route#getStartTime <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Time</em>' attribute.
	 * @see #getStartTime()
	 * @generated
	 */
	void setStartTime(Date value);

	/**
	 * Returns the value of the '<em><b>End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Time</em>' attribute.
	 * @see #setEndTime(Date)
	 * @see org.tud.city.transport.citytransportinventory.CitytransportinventoryPackage#getRoute_EndTime()
	 * @model
	 * @generated
	 */
	Date getEndTime();

	/**
	 * Sets the value of the '{@link org.tud.city.transport.citytransportinventory.Route#getEndTime <em>End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Time</em>' attribute.
	 * @see #getEndTime()
	 * @generated
	 */
	void setEndTime(Date value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.tud.city.transport.citytransportinventory.CitytransportinventoryPackage#getRoute_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.tud.city.transport.citytransportinventory.Route#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Assigned Vehicles</b></em>' containment reference list.
	 * The list contents are of type {@link org.tud.city.transport.citytransportinventory.Vehicle}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assigned Vehicles</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assigned Vehicles</em>' containment reference list.
	 * @see org.tud.city.transport.citytransportinventory.CitytransportinventoryPackage#getRoute_AssignedVehicles()
	 * @model containment="true"
	 * @generated
	 */
	EList<Vehicle> getAssignedVehicles();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	Station getAllStationsAfterStation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	Station getEndStation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	Station getStartStation();

} // Route
