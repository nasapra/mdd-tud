/**
 */
package org.tud.city.transport.citytransportinventory;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Maintainable</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.tud.city.transport.citytransportinventory.CitytransportinventoryPackage#getMaintainable()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Maintainable extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	void getLastMaintenanceDate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	void getNextMaintenance();

} // Maintainable
