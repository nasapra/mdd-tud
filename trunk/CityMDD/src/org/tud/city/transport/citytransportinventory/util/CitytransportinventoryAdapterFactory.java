/**
 */
package org.tud.city.transport.citytransportinventory.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.tud.city.transport.citytransportinventory.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.tud.city.transport.citytransportinventory.CitytransportinventoryPackage
 * @generated
 */
public class CitytransportinventoryAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CitytransportinventoryPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CitytransportinventoryAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CitytransportinventoryPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CitytransportinventorySwitch<Adapter> modelSwitch =
		new CitytransportinventorySwitch<Adapter>() {
			@Override
			public Adapter caseVehicle(Vehicle object) {
				return createVehicleAdapter();
			}
			@Override
			public Adapter caseBus(Bus object) {
				return createBusAdapter();
			}
			@Override
			public Adapter caseTrain(Train object) {
				return createTrainAdapter();
			}
			@Override
			public Adapter caseTram(Tram object) {
				return createTramAdapter();
			}
			@Override
			public Adapter caseStation(Station object) {
				return createStationAdapter();
			}
			@Override
			public Adapter caseBusStation(BusStation object) {
				return createBusStationAdapter();
			}
			@Override
			public Adapter caseTrainStation(TrainStation object) {
				return createTrainStationAdapter();
			}
			@Override
			public Adapter caseTramStation(TramStation object) {
				return createTramStationAdapter();
			}
			@Override
			public Adapter caseRoute(Route object) {
				return createRouteAdapter();
			}
			@Override
			public Adapter caseBusRoute(BusRoute object) {
				return createBusRouteAdapter();
			}
			@Override
			public Adapter caseTrainRoute(TrainRoute object) {
				return createTrainRouteAdapter();
			}
			@Override
			public Adapter caseTramRoute(TramRoute object) {
				return createTramRouteAdapter();
			}
			@Override
			public Adapter caseLocation(Location object) {
				return createLocationAdapter();
			}
			@Override
			public Adapter caseTicket(Ticket object) {
				return createTicketAdapter();
			}
			@Override
			public Adapter caseBusTicket(BusTicket object) {
				return createBusTicketAdapter();
			}
			@Override
			public Adapter caseTrainTicket(TrainTicket object) {
				return createTrainTicketAdapter();
			}
			@Override
			public Adapter caseTramTicket(TramTicket object) {
				return createTramTicketAdapter();
			}
			@Override
			public Adapter caseFuel(Fuel object) {
				return createFuelAdapter();
			}
			@Override
			public Adapter casePetrol(Petrol object) {
				return createPetrolAdapter();
			}
			@Override
			public Adapter caseConnectionInfrastructure(ConnectionInfrastructure object) {
				return createConnectionInfrastructureAdapter();
			}
			@Override
			public Adapter caseRoad(Road object) {
				return createRoadAdapter();
			}
			@Override
			public Adapter caseRail(Rail object) {
				return createRailAdapter();
			}
			@Override
			public Adapter caseTramTracks(TramTracks object) {
				return createTramTracksAdapter();
			}
			@Override
			public Adapter caseMaintainable(Maintainable object) {
				return createMaintainableAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.tud.city.transport.citytransportinventory.Vehicle <em>Vehicle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.city.transport.citytransportinventory.Vehicle
	 * @generated
	 */
	public Adapter createVehicleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.city.transport.citytransportinventory.Bus <em>Bus</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.city.transport.citytransportinventory.Bus
	 * @generated
	 */
	public Adapter createBusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.city.transport.citytransportinventory.Train <em>Train</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.city.transport.citytransportinventory.Train
	 * @generated
	 */
	public Adapter createTrainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.city.transport.citytransportinventory.Tram <em>Tram</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.city.transport.citytransportinventory.Tram
	 * @generated
	 */
	public Adapter createTramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.city.transport.citytransportinventory.Station <em>Station</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.city.transport.citytransportinventory.Station
	 * @generated
	 */
	public Adapter createStationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.city.transport.citytransportinventory.BusStation <em>Bus Station</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.city.transport.citytransportinventory.BusStation
	 * @generated
	 */
	public Adapter createBusStationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.city.transport.citytransportinventory.TrainStation <em>Train Station</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.city.transport.citytransportinventory.TrainStation
	 * @generated
	 */
	public Adapter createTrainStationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.city.transport.citytransportinventory.TramStation <em>Tram Station</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.city.transport.citytransportinventory.TramStation
	 * @generated
	 */
	public Adapter createTramStationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.city.transport.citytransportinventory.Route <em>Route</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.city.transport.citytransportinventory.Route
	 * @generated
	 */
	public Adapter createRouteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.city.transport.citytransportinventory.BusRoute <em>Bus Route</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.city.transport.citytransportinventory.BusRoute
	 * @generated
	 */
	public Adapter createBusRouteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.city.transport.citytransportinventory.TrainRoute <em>Train Route</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.city.transport.citytransportinventory.TrainRoute
	 * @generated
	 */
	public Adapter createTrainRouteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.city.transport.citytransportinventory.TramRoute <em>Tram Route</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.city.transport.citytransportinventory.TramRoute
	 * @generated
	 */
	public Adapter createTramRouteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.city.transport.citytransportinventory.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.city.transport.citytransportinventory.Location
	 * @generated
	 */
	public Adapter createLocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.city.transport.citytransportinventory.Ticket <em>Ticket</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.city.transport.citytransportinventory.Ticket
	 * @generated
	 */
	public Adapter createTicketAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.city.transport.citytransportinventory.BusTicket <em>Bus Ticket</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.city.transport.citytransportinventory.BusTicket
	 * @generated
	 */
	public Adapter createBusTicketAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.city.transport.citytransportinventory.TrainTicket <em>Train Ticket</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.city.transport.citytransportinventory.TrainTicket
	 * @generated
	 */
	public Adapter createTrainTicketAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.city.transport.citytransportinventory.TramTicket <em>Tram Ticket</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.city.transport.citytransportinventory.TramTicket
	 * @generated
	 */
	public Adapter createTramTicketAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.city.transport.citytransportinventory.Fuel <em>Fuel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.city.transport.citytransportinventory.Fuel
	 * @generated
	 */
	public Adapter createFuelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.city.transport.citytransportinventory.Petrol <em>Petrol</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.city.transport.citytransportinventory.Petrol
	 * @generated
	 */
	public Adapter createPetrolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.city.transport.citytransportinventory.ConnectionInfrastructure <em>Connection Infrastructure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.city.transport.citytransportinventory.ConnectionInfrastructure
	 * @generated
	 */
	public Adapter createConnectionInfrastructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.city.transport.citytransportinventory.Road <em>Road</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.city.transport.citytransportinventory.Road
	 * @generated
	 */
	public Adapter createRoadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.city.transport.citytransportinventory.Rail <em>Rail</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.city.transport.citytransportinventory.Rail
	 * @generated
	 */
	public Adapter createRailAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.city.transport.citytransportinventory.TramTracks <em>Tram Tracks</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.city.transport.citytransportinventory.TramTracks
	 * @generated
	 */
	public Adapter createTramTracksAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.city.transport.citytransportinventory.Maintainable <em>Maintainable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.city.transport.citytransportinventory.Maintainable
	 * @generated
	 */
	public Adapter createMaintainableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //CitytransportinventoryAdapterFactory
