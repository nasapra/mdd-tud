/**
 */
package org.tud.city.transport.citytransportinventory;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fuel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tud.city.transport.citytransportinventory.Fuel#getFuelType <em>Fuel Type</em>}</li>
 *   <li>{@link org.tud.city.transport.citytransportinventory.Fuel#getCapacity <em>Capacity</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tud.city.transport.citytransportinventory.CitytransportinventoryPackage#getFuel()
 * @model
 * @generated
 */
public interface Fuel extends EObject {
	/**
	 * Returns the value of the '<em><b>Fuel Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.tud.city.transport.citytransportinventory.FuelType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fuel Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fuel Type</em>' attribute.
	 * @see org.tud.city.transport.citytransportinventory.FuelType
	 * @see #setFuelType(FuelType)
	 * @see org.tud.city.transport.citytransportinventory.CitytransportinventoryPackage#getFuel_FuelType()
	 * @model
	 * @generated
	 */
	FuelType getFuelType();

	/**
	 * Sets the value of the '{@link org.tud.city.transport.citytransportinventory.Fuel#getFuelType <em>Fuel Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fuel Type</em>' attribute.
	 * @see org.tud.city.transport.citytransportinventory.FuelType
	 * @see #getFuelType()
	 * @generated
	 */
	void setFuelType(FuelType value);

	/**
	 * Returns the value of the '<em><b>Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capacity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacity</em>' attribute.
	 * @see #setCapacity(int)
	 * @see org.tud.city.transport.citytransportinventory.CitytransportinventoryPackage#getFuel_Capacity()
	 * @model
	 * @generated
	 */
	int getCapacity();

	/**
	 * Sets the value of the '{@link org.tud.city.transport.citytransportinventory.Fuel#getCapacity <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacity</em>' attribute.
	 * @see #getCapacity()
	 * @generated
	 */
	void setCapacity(int value);

} // Fuel
