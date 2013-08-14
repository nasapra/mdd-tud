/**
 */
package org.tud.city.transport.citytransportinventory;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection Infrastructure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tud.city.transport.citytransportinventory.ConnectionInfrastructure#getNextMaintanence <em>Next Maintanence</em>}</li>
 *   <li>{@link org.tud.city.transport.citytransportinventory.ConnectionInfrastructure#getLastMaintanence <em>Last Maintanence</em>}</li>
 *   <li>{@link org.tud.city.transport.citytransportinventory.ConnectionInfrastructure#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tud.city.transport.citytransportinventory.CitytransportinventoryPackage#getConnectionInfrastructure()
 * @model abstract="true"
 * @generated
 */
public interface ConnectionInfrastructure extends Maintainable {
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
	 * @see org.tud.city.transport.citytransportinventory.CitytransportinventoryPackage#getConnectionInfrastructure_NextMaintanence()
	 * @model
	 * @generated
	 */
	Date getNextMaintanence();

	/**
	 * Sets the value of the '{@link org.tud.city.transport.citytransportinventory.ConnectionInfrastructure#getNextMaintanence <em>Next Maintanence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Maintanence</em>' attribute.
	 * @see #getNextMaintanence()
	 * @generated
	 */
	void setNextMaintanence(Date value);

	/**
	 * Returns the value of the '<em><b>Last Maintanence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Maintanence</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Maintanence</em>' attribute.
	 * @see #setLastMaintanence(Date)
	 * @see org.tud.city.transport.citytransportinventory.CitytransportinventoryPackage#getConnectionInfrastructure_LastMaintanence()
	 * @model
	 * @generated
	 */
	Date getLastMaintanence();

	/**
	 * Sets the value of the '{@link org.tud.city.transport.citytransportinventory.ConnectionInfrastructure#getLastMaintanence <em>Last Maintanence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Maintanence</em>' attribute.
	 * @see #getLastMaintanence()
	 * @generated
	 */
	void setLastMaintanence(Date value);

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
	 * @see org.tud.city.transport.citytransportinventory.CitytransportinventoryPackage#getConnectionInfrastructure_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.tud.city.transport.citytransportinventory.ConnectionInfrastructure#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // ConnectionInfrastructure
