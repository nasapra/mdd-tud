/**
 */
package org.tud.city.transport.citytransportinventory;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vehicle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tud.city.transport.citytransportinventory.Vehicle#getFuelStats <em>Fuel Stats</em>}</li>
 *   <li>{@link org.tud.city.transport.citytransportinventory.Vehicle#getName <em>Name</em>}</li>
 *   <li>{@link org.tud.city.transport.citytransportinventory.Vehicle#getRegistration <em>Registration</em>}</li>
 *   <li>{@link org.tud.city.transport.citytransportinventory.Vehicle#getSeatingCapacity <em>Seating Capacity</em>}</li>
 *   <li>{@link org.tud.city.transport.citytransportinventory.Vehicle#getCycleCapacity <em>Cycle Capacity</em>}</li>
 *   <li>{@link org.tud.city.transport.citytransportinventory.Vehicle#isPhysicallyHandicappedSupport <em>Physically Handicapped Support</em>}</li>
 *   <li>{@link org.tud.city.transport.citytransportinventory.Vehicle#getLastMaintanance <em>Last Maintanance</em>}</li>
 *   <li>{@link org.tud.city.transport.citytransportinventory.Vehicle#getNextMaintanence <em>Next Maintanence</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tud.city.transport.citytransportinventory.CitytransportinventoryPackage#getVehicle()
 * @model abstract="true"
 * @generated
 */
public interface Vehicle extends Maintainable {
	/**
	 * Returns the value of the '<em><b>Fuel Stats</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fuel Stats</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fuel Stats</em>' containment reference.
	 * @see #setFuelStats(Fuel)
	 * @see org.tud.city.transport.citytransportinventory.CitytransportinventoryPackage#getVehicle_FuelStats()
	 * @model containment="true"
	 * @generated
	 */
	Fuel getFuelStats();

	/**
	 * Sets the value of the '{@link org.tud.city.transport.citytransportinventory.Vehicle#getFuelStats <em>Fuel Stats</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fuel Stats</em>' containment reference.
	 * @see #getFuelStats()
	 * @generated
	 */
	void setFuelStats(Fuel value);

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
	 * @see org.tud.city.transport.citytransportinventory.CitytransportinventoryPackage#getVehicle_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.tud.city.transport.citytransportinventory.Vehicle#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Registration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Registration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Registration</em>' attribute.
	 * @see #setRegistration(String)
	 * @see org.tud.city.transport.citytransportinventory.CitytransportinventoryPackage#getVehicle_Registration()
	 * @model
	 * @generated
	 */
	String getRegistration();

	/**
	 * Sets the value of the '{@link org.tud.city.transport.citytransportinventory.Vehicle#getRegistration <em>Registration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Registration</em>' attribute.
	 * @see #getRegistration()
	 * @generated
	 */
	void setRegistration(String value);

	/**
	 * Returns the value of the '<em><b>Seating Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Seating Capacity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seating Capacity</em>' attribute.
	 * @see #setSeatingCapacity(int)
	 * @see org.tud.city.transport.citytransportinventory.CitytransportinventoryPackage#getVehicle_SeatingCapacity()
	 * @model
	 * @generated
	 */
	int getSeatingCapacity();

	/**
	 * Sets the value of the '{@link org.tud.city.transport.citytransportinventory.Vehicle#getSeatingCapacity <em>Seating Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seating Capacity</em>' attribute.
	 * @see #getSeatingCapacity()
	 * @generated
	 */
	void setSeatingCapacity(int value);

	/**
	 * Returns the value of the '<em><b>Cycle Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cycle Capacity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cycle Capacity</em>' attribute.
	 * @see #setCycleCapacity(int)
	 * @see org.tud.city.transport.citytransportinventory.CitytransportinventoryPackage#getVehicle_CycleCapacity()
	 * @model
	 * @generated
	 */
	int getCycleCapacity();

	/**
	 * Sets the value of the '{@link org.tud.city.transport.citytransportinventory.Vehicle#getCycleCapacity <em>Cycle Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cycle Capacity</em>' attribute.
	 * @see #getCycleCapacity()
	 * @generated
	 */
	void setCycleCapacity(int value);

	/**
	 * Returns the value of the '<em><b>Physically Handicapped Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Physically Handicapped Support</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Physically Handicapped Support</em>' attribute.
	 * @see #setPhysicallyHandicappedSupport(boolean)
	 * @see org.tud.city.transport.citytransportinventory.CitytransportinventoryPackage#getVehicle_PhysicallyHandicappedSupport()
	 * @model
	 * @generated
	 */
	boolean isPhysicallyHandicappedSupport();

	/**
	 * Sets the value of the '{@link org.tud.city.transport.citytransportinventory.Vehicle#isPhysicallyHandicappedSupport <em>Physically Handicapped Support</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Physically Handicapped Support</em>' attribute.
	 * @see #isPhysicallyHandicappedSupport()
	 * @generated
	 */
	void setPhysicallyHandicappedSupport(boolean value);

	/**
	 * Returns the value of the '<em><b>Last Maintanance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Maintanance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Maintanance</em>' attribute.
	 * @see #setLastMaintanance(Date)
	 * @see org.tud.city.transport.citytransportinventory.CitytransportinventoryPackage#getVehicle_LastMaintanance()
	 * @model
	 * @generated
	 */
	Date getLastMaintanance();

	/**
	 * Sets the value of the '{@link org.tud.city.transport.citytransportinventory.Vehicle#getLastMaintanance <em>Last Maintanance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Maintanance</em>' attribute.
	 * @see #getLastMaintanance()
	 * @generated
	 */
	void setLastMaintanance(Date value);

	/**
	 * Returns the value of the '<em><b>Next Maintanence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next Maintanence</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Maintanence</em>' attribute.
	 * @see #setNextMaintanence(Date)
	 * @see org.tud.city.transport.citytransportinventory.CitytransportinventoryPackage#getVehicle_NextMaintanence()
	 * @model
	 * @generated
	 */
	Date getNextMaintanence();

	/**
	 * Sets the value of the '{@link org.tud.city.transport.citytransportinventory.Vehicle#getNextMaintanence <em>Next Maintanence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Maintanence</em>' attribute.
	 * @see #getNextMaintanence()
	 * @generated
	 */
	void setNextMaintanence(Date value);

} // Vehicle
