/**
 */
package org.tud.city.transport.citytransportinventory;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Station</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tud.city.transport.citytransportinventory.Station#getLocation <em>Location</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tud.city.transport.citytransportinventory.CitytransportinventoryPackage#getStation()
 * @model abstract="true"
 * @generated
 */
public interface Station extends EObject {
	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' containment reference.
	 * @see #setLocation(Location)
	 * @see org.tud.city.transport.citytransportinventory.CitytransportinventoryPackage#getStation_Location()
	 * @model containment="true"
	 * @generated
	 */
	Location getLocation();

	/**
	 * Sets the value of the '{@link org.tud.city.transport.citytransportinventory.Station#getLocation <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' containment reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Location value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	Location getStationLocation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	void getAllConnections();

} // Station
