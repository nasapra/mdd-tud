/**
 */
package org.tud.city.transport.citytransportinventory.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.tud.city.transport.citytransportinventory.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.tud.city.transport.citytransportinventory.CitytransportinventoryPackage
 * @generated
 */
public class CitytransportinventorySwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CitytransportinventoryPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CitytransportinventorySwitch() {
		if (modelPackage == null) {
			modelPackage = CitytransportinventoryPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case CitytransportinventoryPackage.VEHICLE: {
				Vehicle vehicle = (Vehicle)theEObject;
				T result = caseVehicle(vehicle);
				if (result == null) result = caseMaintainable(vehicle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CitytransportinventoryPackage.BUS: {
				Bus bus = (Bus)theEObject;
				T result = caseBus(bus);
				if (result == null) result = caseVehicle(bus);
				if (result == null) result = caseMaintainable(bus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CitytransportinventoryPackage.TRAIN: {
				Train train = (Train)theEObject;
				T result = caseTrain(train);
				if (result == null) result = caseVehicle(train);
				if (result == null) result = caseMaintainable(train);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CitytransportinventoryPackage.TRAM: {
				Tram tram = (Tram)theEObject;
				T result = caseTram(tram);
				if (result == null) result = caseVehicle(tram);
				if (result == null) result = caseMaintainable(tram);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CitytransportinventoryPackage.STATION: {
				Station station = (Station)theEObject;
				T result = caseStation(station);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CitytransportinventoryPackage.BUS_STATION: {
				BusStation busStation = (BusStation)theEObject;
				T result = caseBusStation(busStation);
				if (result == null) result = caseStation(busStation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CitytransportinventoryPackage.TRAIN_STATION: {
				TrainStation trainStation = (TrainStation)theEObject;
				T result = caseTrainStation(trainStation);
				if (result == null) result = caseStation(trainStation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CitytransportinventoryPackage.TRAM_STATION: {
				TramStation tramStation = (TramStation)theEObject;
				T result = caseTramStation(tramStation);
				if (result == null) result = caseStation(tramStation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CitytransportinventoryPackage.ROUTE: {
				Route route = (Route)theEObject;
				T result = caseRoute(route);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CitytransportinventoryPackage.BUS_ROUTE: {
				BusRoute busRoute = (BusRoute)theEObject;
				T result = caseBusRoute(busRoute);
				if (result == null) result = caseRoute(busRoute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CitytransportinventoryPackage.TRAIN_ROUTE: {
				TrainRoute trainRoute = (TrainRoute)theEObject;
				T result = caseTrainRoute(trainRoute);
				if (result == null) result = caseRoute(trainRoute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CitytransportinventoryPackage.TRAM_ROUTE: {
				TramRoute tramRoute = (TramRoute)theEObject;
				T result = caseTramRoute(tramRoute);
				if (result == null) result = caseRoute(tramRoute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CitytransportinventoryPackage.LOCATION: {
				Location location = (Location)theEObject;
				T result = caseLocation(location);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CitytransportinventoryPackage.TICKET: {
				Ticket ticket = (Ticket)theEObject;
				T result = caseTicket(ticket);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CitytransportinventoryPackage.BUS_TICKET: {
				BusTicket busTicket = (BusTicket)theEObject;
				T result = caseBusTicket(busTicket);
				if (result == null) result = caseTicket(busTicket);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CitytransportinventoryPackage.TRAIN_TICKET: {
				TrainTicket trainTicket = (TrainTicket)theEObject;
				T result = caseTrainTicket(trainTicket);
				if (result == null) result = caseTicket(trainTicket);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CitytransportinventoryPackage.TRAM_TICKET: {
				TramTicket tramTicket = (TramTicket)theEObject;
				T result = caseTramTicket(tramTicket);
				if (result == null) result = caseTicket(tramTicket);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CitytransportinventoryPackage.FUEL: {
				Fuel fuel = (Fuel)theEObject;
				T result = caseFuel(fuel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CitytransportinventoryPackage.PETROL: {
				Petrol petrol = (Petrol)theEObject;
				T result = casePetrol(petrol);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CitytransportinventoryPackage.CONNECTION_INFRASTRUCTURE: {
				ConnectionInfrastructure connectionInfrastructure = (ConnectionInfrastructure)theEObject;
				T result = caseConnectionInfrastructure(connectionInfrastructure);
				if (result == null) result = caseMaintainable(connectionInfrastructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CitytransportinventoryPackage.ROAD: {
				Road road = (Road)theEObject;
				T result = caseRoad(road);
				if (result == null) result = caseConnectionInfrastructure(road);
				if (result == null) result = caseMaintainable(road);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CitytransportinventoryPackage.RAIL: {
				Rail rail = (Rail)theEObject;
				T result = caseRail(rail);
				if (result == null) result = caseConnectionInfrastructure(rail);
				if (result == null) result = caseMaintainable(rail);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CitytransportinventoryPackage.TRAM_TRACKS: {
				TramTracks tramTracks = (TramTracks)theEObject;
				T result = caseTramTracks(tramTracks);
				if (result == null) result = caseConnectionInfrastructure(tramTracks);
				if (result == null) result = caseMaintainable(tramTracks);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CitytransportinventoryPackage.MAINTAINABLE: {
				Maintainable maintainable = (Maintainable)theEObject;
				T result = caseMaintainable(maintainable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vehicle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vehicle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVehicle(Vehicle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bus</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bus</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBus(Bus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Train</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Train</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrain(Train object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tram</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tram</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTram(Tram object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Station</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Station</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStation(Station object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bus Station</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bus Station</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBusStation(BusStation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Train Station</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Train Station</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrainStation(TrainStation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tram Station</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tram Station</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTramStation(TramStation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Route</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Route</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoute(Route object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bus Route</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bus Route</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBusRoute(BusRoute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Train Route</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Train Route</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrainRoute(TrainRoute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tram Route</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tram Route</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTramRoute(TramRoute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Location</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Location</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocation(Location object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ticket</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ticket</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTicket(Ticket object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bus Ticket</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bus Ticket</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBusTicket(BusTicket object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Train Ticket</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Train Ticket</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrainTicket(TrainTicket object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tram Ticket</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tram Ticket</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTramTicket(TramTicket object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fuel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fuel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFuel(Fuel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Petrol</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Petrol</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePetrol(Petrol object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection Infrastructure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection Infrastructure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectionInfrastructure(ConnectionInfrastructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Road</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Road</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoad(Road object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rail</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rail</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRail(Rail object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tram Tracks</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tram Tracks</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTramTracks(TramTracks object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Maintainable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Maintainable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMaintainable(Maintainable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //CitytransportinventorySwitch
