/**
 */
package org.tud.city.transport.citytransportinventory;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Train</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tud.city.transport.citytransportinventory.Train#getTrainType <em>Train Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tud.city.transport.citytransportinventory.CitytransportinventoryPackage#getTrain()
 * @model
 * @generated
 */
public interface Train extends Vehicle {
	/**
	 * Returns the value of the '<em><b>Train Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.tud.city.transport.citytransportinventory.TrainType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Train Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Train Type</em>' attribute.
	 * @see org.tud.city.transport.citytransportinventory.TrainType
	 * @see #setTrainType(TrainType)
	 * @see org.tud.city.transport.citytransportinventory.CitytransportinventoryPackage#getTrain_TrainType()
	 * @model
	 * @generated
	 */
	TrainType getTrainType();

	/**
	 * Sets the value of the '{@link org.tud.city.transport.citytransportinventory.Train#getTrainType <em>Train Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Train Type</em>' attribute.
	 * @see org.tud.city.transport.citytransportinventory.TrainType
	 * @see #getTrainType()
	 * @generated
	 */
	void setTrainType(TrainType value);

} // Train
