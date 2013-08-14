/**
 */
package org.tud.city.transport.citytransportinventory;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bus Ticket</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tud.city.transport.citytransportinventory.BusTicket#getRoute <em>Route</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tud.city.transport.citytransportinventory.CitytransportinventoryPackage#getBusTicket()
 * @model
 * @generated
 */
public interface BusTicket extends Ticket {
	/**
	 * Returns the value of the '<em><b>Route</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Route</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Route</em>' reference.
	 * @see #setRoute(Route)
	 * @see org.tud.city.transport.citytransportinventory.CitytransportinventoryPackage#getBusTicket_Route()
	 * @model
	 * @generated
	 */
	Route getRoute();

	/**
	 * Sets the value of the '{@link org.tud.city.transport.citytransportinventory.BusTicket#getRoute <em>Route</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Route</em>' reference.
	 * @see #getRoute()
	 * @generated
	 */
	void setRoute(Route value);

} // BusTicket
