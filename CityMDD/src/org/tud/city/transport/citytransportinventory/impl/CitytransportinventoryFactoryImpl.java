/**
 */
package org.tud.city.transport.citytransportinventory.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.tud.city.transport.citytransportinventory.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CitytransportinventoryFactoryImpl extends EFactoryImpl implements CitytransportinventoryFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CitytransportinventoryFactory init() {
		try {
			CitytransportinventoryFactory theCitytransportinventoryFactory = (CitytransportinventoryFactory)EPackage.Registry.INSTANCE.getEFactory(CitytransportinventoryPackage.eNS_URI);
			if (theCitytransportinventoryFactory != null) {
				return theCitytransportinventoryFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CitytransportinventoryFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CitytransportinventoryFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CitytransportinventoryPackage.BUS: return createBus();
			case CitytransportinventoryPackage.TRAIN: return createTrain();
			case CitytransportinventoryPackage.TRAM: return createTram();
			case CitytransportinventoryPackage.BUS_STATION: return createBusStation();
			case CitytransportinventoryPackage.TRAIN_STATION: return createTrainStation();
			case CitytransportinventoryPackage.TRAM_STATION: return createTramStation();
			case CitytransportinventoryPackage.BUS_ROUTE: return createBusRoute();
			case CitytransportinventoryPackage.TRAIN_ROUTE: return createTrainRoute();
			case CitytransportinventoryPackage.TRAM_ROUTE: return createTramRoute();
			case CitytransportinventoryPackage.LOCATION: return createLocation();
			case CitytransportinventoryPackage.BUS_TICKET: return createBusTicket();
			case CitytransportinventoryPackage.TRAIN_TICKET: return createTrainTicket();
			case CitytransportinventoryPackage.TRAM_TICKET: return createTramTicket();
			case CitytransportinventoryPackage.FUEL: return createFuel();
			case CitytransportinventoryPackage.PETROL: return createPetrol();
			case CitytransportinventoryPackage.ROAD: return createRoad();
			case CitytransportinventoryPackage.RAIL: return createRail();
			case CitytransportinventoryPackage.TRAM_TRACKS: return createTramTracks();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case CitytransportinventoryPackage.FUEL_TYPE:
				return createFuelTypeFromString(eDataType, initialValue);
			case CitytransportinventoryPackage.TRAIN_TYPE:
				return createTrainTypeFromString(eDataType, initialValue);
			case CitytransportinventoryPackage.BUS_TYPE:
				return createBusTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case CitytransportinventoryPackage.FUEL_TYPE:
				return convertFuelTypeToString(eDataType, instanceValue);
			case CitytransportinventoryPackage.TRAIN_TYPE:
				return convertTrainTypeToString(eDataType, instanceValue);
			case CitytransportinventoryPackage.BUS_TYPE:
				return convertBusTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bus createBus() {
		BusImpl bus = new BusImpl();
		return bus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Train createTrain() {
		TrainImpl train = new TrainImpl();
		return train;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tram createTram() {
		TramImpl tram = new TramImpl();
		return tram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusStation createBusStation() {
		BusStationImpl busStation = new BusStationImpl();
		return busStation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrainStation createTrainStation() {
		TrainStationImpl trainStation = new TrainStationImpl();
		return trainStation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TramStation createTramStation() {
		TramStationImpl tramStation = new TramStationImpl();
		return tramStation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusRoute createBusRoute() {
		BusRouteImpl busRoute = new BusRouteImpl();
		return busRoute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrainRoute createTrainRoute() {
		TrainRouteImpl trainRoute = new TrainRouteImpl();
		return trainRoute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TramRoute createTramRoute() {
		TramRouteImpl tramRoute = new TramRouteImpl();
		return tramRoute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location createLocation() {
		LocationImpl location = new LocationImpl();
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusTicket createBusTicket() {
		BusTicketImpl busTicket = new BusTicketImpl();
		return busTicket;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrainTicket createTrainTicket() {
		TrainTicketImpl trainTicket = new TrainTicketImpl();
		return trainTicket;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TramTicket createTramTicket() {
		TramTicketImpl tramTicket = new TramTicketImpl();
		return tramTicket;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fuel createFuel() {
		FuelImpl fuel = new FuelImpl();
		return fuel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Petrol createPetrol() {
		PetrolImpl petrol = new PetrolImpl();
		return petrol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Road createRoad() {
		RoadImpl road = new RoadImpl();
		return road;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rail createRail() {
		RailImpl rail = new RailImpl();
		return rail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TramTracks createTramTracks() {
		TramTracksImpl tramTracks = new TramTracksImpl();
		return tramTracks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FuelType createFuelTypeFromString(EDataType eDataType, String initialValue) {
		FuelType result = FuelType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFuelTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrainType createTrainTypeFromString(EDataType eDataType, String initialValue) {
		TrainType result = TrainType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTrainTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusType createBusTypeFromString(EDataType eDataType, String initialValue) {
		BusType result = BusType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBusTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CitytransportinventoryPackage getCitytransportinventoryPackage() {
		return (CitytransportinventoryPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CitytransportinventoryPackage getPackage() {
		return CitytransportinventoryPackage.eINSTANCE;
	}

} //CitytransportinventoryFactoryImpl
