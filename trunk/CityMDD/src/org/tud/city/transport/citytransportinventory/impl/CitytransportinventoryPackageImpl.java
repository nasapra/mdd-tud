/**
 */
package org.tud.city.transport.citytransportinventory.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.tud.city.transport.citytransportinventory.Bus;
import org.tud.city.transport.citytransportinventory.BusRoute;
import org.tud.city.transport.citytransportinventory.BusStation;
import org.tud.city.transport.citytransportinventory.BusTicket;
import org.tud.city.transport.citytransportinventory.BusType;
import org.tud.city.transport.citytransportinventory.CitytransportinventoryFactory;
import org.tud.city.transport.citytransportinventory.CitytransportinventoryPackage;
import org.tud.city.transport.citytransportinventory.ConnectionInfrastructure;
import org.tud.city.transport.citytransportinventory.Fuel;
import org.tud.city.transport.citytransportinventory.FuelType;
import org.tud.city.transport.citytransportinventory.Location;
import org.tud.city.transport.citytransportinventory.Maintainable;
import org.tud.city.transport.citytransportinventory.Petrol;
import org.tud.city.transport.citytransportinventory.Rail;
import org.tud.city.transport.citytransportinventory.Road;
import org.tud.city.transport.citytransportinventory.Route;
import org.tud.city.transport.citytransportinventory.Station;
import org.tud.city.transport.citytransportinventory.Ticket;
import org.tud.city.transport.citytransportinventory.Train;
import org.tud.city.transport.citytransportinventory.TrainRoute;
import org.tud.city.transport.citytransportinventory.TrainStation;
import org.tud.city.transport.citytransportinventory.TrainTicket;
import org.tud.city.transport.citytransportinventory.TrainType;
import org.tud.city.transport.citytransportinventory.Tram;
import org.tud.city.transport.citytransportinventory.TramRoute;
import org.tud.city.transport.citytransportinventory.TramStation;
import org.tud.city.transport.citytransportinventory.TramTicket;
import org.tud.city.transport.citytransportinventory.TramTracks;
import org.tud.city.transport.citytransportinventory.Vehicle;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CitytransportinventoryPackageImpl extends EPackageImpl implements CitytransportinventoryPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vehicleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass busEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass busStationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trainStationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tramStationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass routeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass busRouteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trainRouteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tramRouteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ticketEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass busTicketEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trainTicketEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tramTicketEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fuelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass petrolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionInfrastructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass railEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tramTracksEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass maintainableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum fuelTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum trainTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum busTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.tud.city.transport.citytransportinventory.CitytransportinventoryPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CitytransportinventoryPackageImpl() {
		super(eNS_URI, CitytransportinventoryFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link CitytransportinventoryPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CitytransportinventoryPackage init() {
		if (isInited) return (CitytransportinventoryPackage)EPackage.Registry.INSTANCE.getEPackage(CitytransportinventoryPackage.eNS_URI);

		// Obtain or create and register package
		CitytransportinventoryPackageImpl theCitytransportinventoryPackage = (CitytransportinventoryPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CitytransportinventoryPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CitytransportinventoryPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theCitytransportinventoryPackage.createPackageContents();

		// Initialize created meta-data
		theCitytransportinventoryPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCitytransportinventoryPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CitytransportinventoryPackage.eNS_URI, theCitytransportinventoryPackage);
		return theCitytransportinventoryPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVehicle() {
		return vehicleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVehicle_FuelStats() {
		return (EReference)vehicleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVehicle_Name() {
		return (EAttribute)vehicleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVehicle_Registration() {
		return (EAttribute)vehicleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVehicle_SeatingCapacity() {
		return (EAttribute)vehicleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVehicle_CycleCapacity() {
		return (EAttribute)vehicleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVehicle_PhysicallyHandicappedSupport() {
		return (EAttribute)vehicleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVehicle_LastMaintanance() {
		return (EAttribute)vehicleEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVehicle_NextMaintanence() {
		return (EAttribute)vehicleEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBus() {
		return busEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBus_BusType() {
		return (EAttribute)busEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrain() {
		return trainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrain_TrainType() {
		return (EAttribute)trainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTram() {
		return tramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStation() {
		return stationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStation_Location() {
		return (EReference)stationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStation__GetStationLocation() {
		return stationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStation__GetAllConnections() {
		return stationEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBusStation() {
		return busStationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrainStation() {
		return trainStationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTramStation() {
		return tramStationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoute() {
		return routeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoute_EReference0() {
		return (EReference)routeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoute_StartTime() {
		return (EAttribute)routeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoute_EndTime() {
		return (EAttribute)routeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoute_Name() {
		return (EAttribute)routeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoute_AssignedVehicles() {
		return (EReference)routeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoute__GetAllStationsAfterStation() {
		return routeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoute__GetEndStation() {
		return routeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoute__GetStartStation() {
		return routeEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBusRoute() {
		return busRouteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrainRoute() {
		return trainRouteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTramRoute() {
		return tramRouteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocation() {
		return locationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocation_Latitude() {
		return (EAttribute)locationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocation_Longitude() {
		return (EAttribute)locationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocation_Name() {
		return (EAttribute)locationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTicket() {
		return ticketEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTicket__Getvalidity() {
		return ticketEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTicket__GetCost() {
		return ticketEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBusTicket() {
		return busTicketEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusTicket_Route() {
		return (EReference)busTicketEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrainTicket() {
		return trainTicketEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrainTicket_Route() {
		return (EReference)trainTicketEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTramTicket() {
		return tramTicketEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTramTicket_Route() {
		return (EReference)tramTicketEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFuel() {
		return fuelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFuel_FuelType() {
		return (EAttribute)fuelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFuel_Capacity() {
		return (EAttribute)fuelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPetrol() {
		return petrolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectionInfrastructure() {
		return connectionInfrastructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectionInfrastructure_NextMaintanence() {
		return (EAttribute)connectionInfrastructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectionInfrastructure_LastMaintanence() {
		return (EAttribute)connectionInfrastructureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectionInfrastructure_Name() {
		return (EAttribute)connectionInfrastructureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoad() {
		return roadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRail() {
		return railEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTramTracks() {
		return tramTracksEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMaintainable() {
		return maintainableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMaintainable__GetLastMaintenanceDate() {
		return maintainableEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMaintainable__GetNextMaintenance() {
		return maintainableEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFuelType() {
		return fuelTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTrainType() {
		return trainTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBusType() {
		return busTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CitytransportinventoryFactory getCitytransportinventoryFactory() {
		return (CitytransportinventoryFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		vehicleEClass = createEClass(VEHICLE);
		createEReference(vehicleEClass, VEHICLE__FUEL_STATS);
		createEAttribute(vehicleEClass, VEHICLE__NAME);
		createEAttribute(vehicleEClass, VEHICLE__REGISTRATION);
		createEAttribute(vehicleEClass, VEHICLE__SEATING_CAPACITY);
		createEAttribute(vehicleEClass, VEHICLE__CYCLE_CAPACITY);
		createEAttribute(vehicleEClass, VEHICLE__PHYSICALLY_HANDICAPPED_SUPPORT);
		createEAttribute(vehicleEClass, VEHICLE__LAST_MAINTANANCE);
		createEAttribute(vehicleEClass, VEHICLE__NEXT_MAINTANENCE);

		busEClass = createEClass(BUS);
		createEAttribute(busEClass, BUS__BUS_TYPE);

		trainEClass = createEClass(TRAIN);
		createEAttribute(trainEClass, TRAIN__TRAIN_TYPE);

		tramEClass = createEClass(TRAM);

		stationEClass = createEClass(STATION);
		createEReference(stationEClass, STATION__LOCATION);
		createEOperation(stationEClass, STATION___GET_STATION_LOCATION);
		createEOperation(stationEClass, STATION___GET_ALL_CONNECTIONS);

		busStationEClass = createEClass(BUS_STATION);

		trainStationEClass = createEClass(TRAIN_STATION);

		tramStationEClass = createEClass(TRAM_STATION);

		routeEClass = createEClass(ROUTE);
		createEReference(routeEClass, ROUTE__EREFERENCE0);
		createEAttribute(routeEClass, ROUTE__START_TIME);
		createEAttribute(routeEClass, ROUTE__END_TIME);
		createEAttribute(routeEClass, ROUTE__NAME);
		createEReference(routeEClass, ROUTE__ASSIGNED_VEHICLES);
		createEOperation(routeEClass, ROUTE___GET_ALL_STATIONS_AFTER_STATION);
		createEOperation(routeEClass, ROUTE___GET_END_STATION);
		createEOperation(routeEClass, ROUTE___GET_START_STATION);

		busRouteEClass = createEClass(BUS_ROUTE);

		trainRouteEClass = createEClass(TRAIN_ROUTE);

		tramRouteEClass = createEClass(TRAM_ROUTE);

		locationEClass = createEClass(LOCATION);
		createEAttribute(locationEClass, LOCATION__LATITUDE);
		createEAttribute(locationEClass, LOCATION__LONGITUDE);
		createEAttribute(locationEClass, LOCATION__NAME);

		ticketEClass = createEClass(TICKET);
		createEOperation(ticketEClass, TICKET___GETVALIDITY);
		createEOperation(ticketEClass, TICKET___GET_COST);

		busTicketEClass = createEClass(BUS_TICKET);
		createEReference(busTicketEClass, BUS_TICKET__ROUTE);

		trainTicketEClass = createEClass(TRAIN_TICKET);
		createEReference(trainTicketEClass, TRAIN_TICKET__ROUTE);

		tramTicketEClass = createEClass(TRAM_TICKET);
		createEReference(tramTicketEClass, TRAM_TICKET__ROUTE);

		fuelEClass = createEClass(FUEL);
		createEAttribute(fuelEClass, FUEL__FUEL_TYPE);
		createEAttribute(fuelEClass, FUEL__CAPACITY);

		petrolEClass = createEClass(PETROL);

		connectionInfrastructureEClass = createEClass(CONNECTION_INFRASTRUCTURE);
		createEAttribute(connectionInfrastructureEClass, CONNECTION_INFRASTRUCTURE__NEXT_MAINTANENCE);
		createEAttribute(connectionInfrastructureEClass, CONNECTION_INFRASTRUCTURE__LAST_MAINTANENCE);
		createEAttribute(connectionInfrastructureEClass, CONNECTION_INFRASTRUCTURE__NAME);

		roadEClass = createEClass(ROAD);

		railEClass = createEClass(RAIL);

		tramTracksEClass = createEClass(TRAM_TRACKS);

		maintainableEClass = createEClass(MAINTAINABLE);
		createEOperation(maintainableEClass, MAINTAINABLE___GET_LAST_MAINTENANCE_DATE);
		createEOperation(maintainableEClass, MAINTAINABLE___GET_NEXT_MAINTENANCE);

		// Create enums
		fuelTypeEEnum = createEEnum(FUEL_TYPE);
		trainTypeEEnum = createEEnum(TRAIN_TYPE);
		busTypeEEnum = createEEnum(BUS_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		vehicleEClass.getESuperTypes().add(this.getMaintainable());
		busEClass.getESuperTypes().add(this.getVehicle());
		trainEClass.getESuperTypes().add(this.getVehicle());
		tramEClass.getESuperTypes().add(this.getVehicle());
		busStationEClass.getESuperTypes().add(this.getStation());
		trainStationEClass.getESuperTypes().add(this.getStation());
		tramStationEClass.getESuperTypes().add(this.getStation());
		busRouteEClass.getESuperTypes().add(this.getRoute());
		trainRouteEClass.getESuperTypes().add(this.getRoute());
		tramRouteEClass.getESuperTypes().add(this.getRoute());
		busTicketEClass.getESuperTypes().add(this.getTicket());
		trainTicketEClass.getESuperTypes().add(this.getTicket());
		tramTicketEClass.getESuperTypes().add(this.getTicket());
		connectionInfrastructureEClass.getESuperTypes().add(this.getMaintainable());
		roadEClass.getESuperTypes().add(this.getConnectionInfrastructure());
		railEClass.getESuperTypes().add(this.getConnectionInfrastructure());
		tramTracksEClass.getESuperTypes().add(this.getConnectionInfrastructure());

		// Initialize classes, features, and operations; add parameters
		initEClass(vehicleEClass, Vehicle.class, "Vehicle", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVehicle_FuelStats(), this.getFuel(), null, "fuelStats", null, 0, 1, Vehicle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVehicle_Name(), ecorePackage.getEString(), "name", null, 0, 1, Vehicle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVehicle_Registration(), ecorePackage.getEString(), "registration", null, 0, 1, Vehicle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVehicle_SeatingCapacity(), ecorePackage.getEInt(), "seatingCapacity", null, 0, 1, Vehicle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVehicle_CycleCapacity(), ecorePackage.getEInt(), "cycleCapacity", null, 0, 1, Vehicle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVehicle_PhysicallyHandicappedSupport(), ecorePackage.getEBoolean(), "physicallyHandicappedSupport", null, 0, 1, Vehicle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVehicle_LastMaintanance(), ecorePackage.getEDate(), "lastMaintanance", null, 0, 1, Vehicle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVehicle_NextMaintanence(), ecorePackage.getEDate(), "nextMaintanence", null, 0, 1, Vehicle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(busEClass, Bus.class, "Bus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBus_BusType(), this.getBusType(), "busType", null, 0, 1, Bus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(trainEClass, Train.class, "Train", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTrain_TrainType(), this.getTrainType(), "trainType", null, 0, 1, Train.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tramEClass, Tram.class, "Tram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(stationEClass, Station.class, "Station", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStation_Location(), this.getLocation(), null, "location", null, 0, 1, Station.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getStation__GetStationLocation(), this.getLocation(), "getStationLocation", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getStation__GetAllConnections(), null, "getAllConnections", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(busStationEClass, BusStation.class, "BusStation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(trainStationEClass, TrainStation.class, "TrainStation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tramStationEClass, TramStation.class, "TramStation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(routeEClass, Route.class, "Route", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoute_EReference0(), this.getStation(), null, "EReference0", null, 0, -1, Route.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoute_StartTime(), ecorePackage.getEDate(), "startTime", null, 0, 1, Route.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoute_EndTime(), ecorePackage.getEDate(), "endTime", null, 0, 1, Route.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoute_Name(), ecorePackage.getEString(), "Name", null, 0, 1, Route.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoute_AssignedVehicles(), this.getVehicle(), null, "assignedVehicles", null, 0, -1, Route.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getRoute__GetAllStationsAfterStation(), this.getStation(), "getAllStationsAfterStation", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getRoute__GetEndStation(), this.getStation(), "getEndStation", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getRoute__GetStartStation(), this.getStation(), "getStartStation", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(busRouteEClass, BusRoute.class, "BusRoute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(trainRouteEClass, TrainRoute.class, "TrainRoute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tramRouteEClass, TramRoute.class, "TramRoute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(locationEClass, Location.class, "Location", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLocation_Latitude(), ecorePackage.getEBigDecimal(), "latitude", null, 0, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocation_Longitude(), ecorePackage.getEBigDecimal(), "longitude", null, 0, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocation_Name(), ecorePackage.getEString(), "name", null, 0, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ticketEClass, Ticket.class, "Ticket", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getTicket__Getvalidity(), null, "getvalidity", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getTicket__GetCost(), null, "getCost", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(busTicketEClass, BusTicket.class, "BusTicket", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBusTicket_Route(), this.getRoute(), null, "route", null, 0, 1, BusTicket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(trainTicketEClass, TrainTicket.class, "TrainTicket", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrainTicket_Route(), this.getRoute(), null, "route", null, 0, 1, TrainTicket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tramTicketEClass, TramTicket.class, "TramTicket", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTramTicket_Route(), this.getRoute(), null, "route", null, 0, 1, TramTicket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fuelEClass, Fuel.class, "Fuel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFuel_FuelType(), this.getFuelType(), "fuelType", null, 0, 1, Fuel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFuel_Capacity(), ecorePackage.getEInt(), "capacity", null, 0, 1, Fuel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(petrolEClass, Petrol.class, "Petrol", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(connectionInfrastructureEClass, ConnectionInfrastructure.class, "ConnectionInfrastructure", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConnectionInfrastructure_NextMaintanence(), ecorePackage.getEDate(), "nextMaintanence", null, 0, 1, ConnectionInfrastructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnectionInfrastructure_LastMaintanence(), ecorePackage.getEDate(), "lastMaintanence", null, 0, 1, ConnectionInfrastructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnectionInfrastructure_Name(), ecorePackage.getEString(), "name", null, 0, 1, ConnectionInfrastructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roadEClass, Road.class, "Road", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(railEClass, Rail.class, "Rail", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tramTracksEClass, TramTracks.class, "TramTracks", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(maintainableEClass, Maintainable.class, "Maintainable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getMaintainable__GetLastMaintenanceDate(), null, "getLastMaintenanceDate", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getMaintainable__GetNextMaintenance(), null, "getNextMaintenance", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(fuelTypeEEnum, FuelType.class, "FuelType");
		addEEnumLiteral(fuelTypeEEnum, FuelType.PETROL);
		addEEnumLiteral(fuelTypeEEnum, FuelType.DIESEL);
		addEEnumLiteral(fuelTypeEEnum, FuelType.ELECTRIC);

		initEEnum(trainTypeEEnum, TrainType.class, "TrainType");
		addEEnumLiteral(trainTypeEEnum, TrainType.RB);
		addEEnumLiteral(trainTypeEEnum, TrainType.SB);
		addEEnumLiteral(trainTypeEEnum, TrainType.UB);

		initEEnum(busTypeEEnum, BusType.class, "BusType");
		addEEnumLiteral(busTypeEEnum, BusType.LONG);
		addEEnumLiteral(busTypeEEnum, BusType.SHORT);

		// Create resource
		createResource(eNS_URI);
	}

} //CitytransportinventoryPackageImpl
