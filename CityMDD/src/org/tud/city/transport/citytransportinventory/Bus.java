/**
 */
package org.tud.city.transport.citytransportinventory;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bus</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tud.city.transport.citytransportinventory.Bus#getBusType <em>Bus Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tud.city.transport.citytransportinventory.CitytransportinventoryPackage#getBus()
 * @model
 * @generated
 */
public interface Bus extends Vehicle {
	/**
	 * Returns the value of the '<em><b>Bus Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.tud.city.transport.citytransportinventory.BusType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bus Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bus Type</em>' attribute.
	 * @see org.tud.city.transport.citytransportinventory.BusType
	 * @see #setBusType(BusType)
	 * @see org.tud.city.transport.citytransportinventory.CitytransportinventoryPackage#getBus_BusType()
	 * @model
	 * @generated
	 */
	BusType getBusType();

	/**
	 * Sets the value of the '{@link org.tud.city.transport.citytransportinventory.Bus#getBusType <em>Bus Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bus Type</em>' attribute.
	 * @see org.tud.city.transport.citytransportinventory.BusType
	 * @see #getBusType()
	 * @generated
	 */
	void setBusType(BusType value);

} // Bus
