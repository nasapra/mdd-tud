/**
 */
package org.tud.city.transport.citytransportinventory;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.tud.city.transport.citytransportinventory.CitytransportinventoryFactory
 * @model kind="package"
 * @generated
 */
public interface CitytransportinventoryPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "citytransportinventory";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://citytransportinventory/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "citytransportinventory";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CitytransportinventoryPackage eINSTANCE = org.tud.city.transport.citytransportinventory.impl.CitytransportinventoryPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.tud.city.transport.citytransportinventory.Maintainable <em>Maintainable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.city.transport.citytransportinventory.Maintainable
	 * @see org.tud.city.transport.citytransportinventory.impl.CitytransportinventoryPackageImpl#getMaintainable()
	 * @generated
	 */
	int MAINTAINABLE = 23;

	/**
	 * The number of structural features of the '<em>Maintainable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTAINABLE_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get Last Maintenance Date</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTAINABLE___GET_LAST_MAINTENANCE_DATE = 0;

	/**
	 * The operation id for the '<em>Get Next Maintenance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTAINABLE___GET_NEXT_MAINTENANCE = 1;

	/**
	 * The number of operations of the '<em>Maintainable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTAINABLE_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.tud.city.transport.citytransportinventory.impl.VehicleImpl <em>Vehicle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.city.transport.citytransportinventory.impl.VehicleImpl
	 * @see org.tud.city.transport.citytransportinventory.impl.CitytransportinventoryPackageImpl#getVehicle()
	 * @generated
	 */
	int VEHICLE = 0;

	/**
	 * The feature id for the '<em><b>Fuel Stats</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE__FUEL_STATS = MAINTAINABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE__NAME = MAINTAINABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Registration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE__REGISTRATION = MAINTAINABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Seating Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE__SEATING_CAPACITY = MAINTAINABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Cycle Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE__CYCLE_CAPACITY = MAINTAINABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Physically Handicapped Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE__PHYSICALLY_HANDICAPPED_SUPPORT = MAINTAINABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Last Maintanance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE__LAST_MAINTANANCE = MAINTAINABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Next Maintanence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE__NEXT_MAINTANENCE = MAINTAINABLE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Vehicle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_FEATURE_COUNT = MAINTAINABLE_FEATURE_COUNT + 8;

	/**
	 * The operation id for the '<em>Get Last Maintenance Date</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE___GET_LAST_MAINTENANCE_DATE = MAINTAINABLE___GET_LAST_MAINTENANCE_DATE;

	/**
	 * The operation id for the '<em>Get Next Maintenance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE___GET_NEXT_MAINTENANCE = MAINTAINABLE___GET_NEXT_MAINTENANCE;

	/**
	 * The number of operations of the '<em>Vehicle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_OPERATION_COUNT = MAINTAINABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tud.city.transport.citytransportinventory.impl.BusImpl <em>Bus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.city.transport.citytransportinventory.impl.BusImpl
	 * @see org.tud.city.transport.citytransportinventory.impl.CitytransportinventoryPackageImpl#getBus()
	 * @generated
	 */
	int BUS = 1;

	/**
	 * The feature id for the '<em><b>Fuel Stats</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__FUEL_STATS = VEHICLE__FUEL_STATS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__NAME = VEHICLE__NAME;

	/**
	 * The feature id for the '<em><b>Registration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__REGISTRATION = VEHICLE__REGISTRATION;

	/**
	 * The feature id for the '<em><b>Seating Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__SEATING_CAPACITY = VEHICLE__SEATING_CAPACITY;

	/**
	 * The feature id for the '<em><b>Cycle Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__CYCLE_CAPACITY = VEHICLE__CYCLE_CAPACITY;

	/**
	 * The feature id for the '<em><b>Physically Handicapped Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__PHYSICALLY_HANDICAPPED_SUPPORT = VEHICLE__PHYSICALLY_HANDICAPPED_SUPPORT;

	/**
	 * The feature id for the '<em><b>Last Maintanance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__LAST_MAINTANANCE = VEHICLE__LAST_MAINTANANCE;

	/**
	 * The feature id for the '<em><b>Next Maintanence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__NEXT_MAINTANENCE = VEHICLE__NEXT_MAINTANENCE;

	/**
	 * The feature id for the '<em><b>Bus Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__BUS_TYPE = VEHICLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_FEATURE_COUNT = VEHICLE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Last Maintenance Date</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS___GET_LAST_MAINTENANCE_DATE = VEHICLE___GET_LAST_MAINTENANCE_DATE;

	/**
	 * The operation id for the '<em>Get Next Maintenance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS___GET_NEXT_MAINTENANCE = VEHICLE___GET_NEXT_MAINTENANCE;

	/**
	 * The number of operations of the '<em>Bus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_OPERATION_COUNT = VEHICLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tud.city.transport.citytransportinventory.impl.TrainImpl <em>Train</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.city.transport.citytransportinventory.impl.TrainImpl
	 * @see org.tud.city.transport.citytransportinventory.impl.CitytransportinventoryPackageImpl#getTrain()
	 * @generated
	 */
	int TRAIN = 2;

	/**
	 * The feature id for the '<em><b>Fuel Stats</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN__FUEL_STATS = VEHICLE__FUEL_STATS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN__NAME = VEHICLE__NAME;

	/**
	 * The feature id for the '<em><b>Registration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN__REGISTRATION = VEHICLE__REGISTRATION;

	/**
	 * The feature id for the '<em><b>Seating Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN__SEATING_CAPACITY = VEHICLE__SEATING_CAPACITY;

	/**
	 * The feature id for the '<em><b>Cycle Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN__CYCLE_CAPACITY = VEHICLE__CYCLE_CAPACITY;

	/**
	 * The feature id for the '<em><b>Physically Handicapped Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN__PHYSICALLY_HANDICAPPED_SUPPORT = VEHICLE__PHYSICALLY_HANDICAPPED_SUPPORT;

	/**
	 * The feature id for the '<em><b>Last Maintanance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN__LAST_MAINTANANCE = VEHICLE__LAST_MAINTANANCE;

	/**
	 * The feature id for the '<em><b>Next Maintanence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN__NEXT_MAINTANENCE = VEHICLE__NEXT_MAINTANENCE;

	/**
	 * The feature id for the '<em><b>Train Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN__TRAIN_TYPE = VEHICLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Train</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_FEATURE_COUNT = VEHICLE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Last Maintenance Date</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN___GET_LAST_MAINTENANCE_DATE = VEHICLE___GET_LAST_MAINTENANCE_DATE;

	/**
	 * The operation id for the '<em>Get Next Maintenance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN___GET_NEXT_MAINTENANCE = VEHICLE___GET_NEXT_MAINTENANCE;

	/**
	 * The number of operations of the '<em>Train</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_OPERATION_COUNT = VEHICLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tud.city.transport.citytransportinventory.impl.TramImpl <em>Tram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.city.transport.citytransportinventory.impl.TramImpl
	 * @see org.tud.city.transport.citytransportinventory.impl.CitytransportinventoryPackageImpl#getTram()
	 * @generated
	 */
	int TRAM = 3;

	/**
	 * The feature id for the '<em><b>Fuel Stats</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAM__FUEL_STATS = VEHICLE__FUEL_STATS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAM__NAME = VEHICLE__NAME;

	/**
	 * The feature id for the '<em><b>Registration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAM__REGISTRATION = VEHICLE__REGISTRATION;

	/**
	 * The feature id for the '<em><b>Seating Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAM__SEATING_CAPACITY = VEHICLE__SEATING_CAPACITY;

	/**
	 * The feature id for the '<em><b>Cycle Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAM__CYCLE_CAPACITY = VEHICLE__CYCLE_CAPACITY;

	/**
	 * The feature id for the '<em><b>Physically Handicapped Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAM__PHYSICALLY_HANDICAPPED_SUPPORT = VEHICLE__PHYSICALLY_HANDICAPPED_SUPPORT;

	/**
	 * The feature id for the '<em><b>Last Maintanance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAM__LAST_MAINTANANCE = VEHICLE__LAST_MAINTANANCE;

	/**
	 * The feature id for the '<em><b>Next Maintanence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAM__NEXT_MAINTANENCE = VEHICLE__NEXT_MAINTANENCE;

	/**
	 * The number of structural features of the '<em>Tram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAM_FEATURE_COUNT = VEHICLE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Last Maintenance Date</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAM___GET_LAST_MAINTENANCE_DATE = VEHICLE___GET_LAST_MAINTENANCE_DATE;

	/**
	 * The operation id for the '<em>Get Next Maintenance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAM___GET_NEXT_MAINTENANCE = VEHICLE___GET_NEXT_MAINTENANCE;

	/**
	 * The number of operations of the '<em>Tram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAM_OPERATION_COUNT = VEHICLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tud.city.transport.citytransportinventory.impl.StationImpl <em>Station</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.city.transport.citytransportinventory.impl.StationImpl
	 * @see org.tud.city.transport.citytransportinventory.impl.CitytransportinventoryPackageImpl#getStation()
	 * @generated
	 */
	int STATION = 4;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION__LOCATION = 0;

	/**
	 * The number of structural features of the '<em>Station</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Get Station Location</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION___GET_STATION_LOCATION = 0;

	/**
	 * The operation id for the '<em>Get All Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION___GET_ALL_CONNECTIONS = 1;

	/**
	 * The number of operations of the '<em>Station</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.tud.city.transport.citytransportinventory.impl.BusStationImpl <em>Bus Station</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.city.transport.citytransportinventory.impl.BusStationImpl
	 * @see org.tud.city.transport.citytransportinventory.impl.CitytransportinventoryPackageImpl#getBusStation()
	 * @generated
	 */
	int BUS_STATION = 5;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_STATION__LOCATION = STATION__LOCATION;

	/**
	 * The number of structural features of the '<em>Bus Station</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_STATION_FEATURE_COUNT = STATION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Station Location</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_STATION___GET_STATION_LOCATION = STATION___GET_STATION_LOCATION;

	/**
	 * The operation id for the '<em>Get All Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_STATION___GET_ALL_CONNECTIONS = STATION___GET_ALL_CONNECTIONS;

	/**
	 * The number of operations of the '<em>Bus Station</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_STATION_OPERATION_COUNT = STATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tud.city.transport.citytransportinventory.impl.TrainStationImpl <em>Train Station</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.city.transport.citytransportinventory.impl.TrainStationImpl
	 * @see org.tud.city.transport.citytransportinventory.impl.CitytransportinventoryPackageImpl#getTrainStation()
	 * @generated
	 */
	int TRAIN_STATION = 6;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_STATION__LOCATION = STATION__LOCATION;

	/**
	 * The number of structural features of the '<em>Train Station</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_STATION_FEATURE_COUNT = STATION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Station Location</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_STATION___GET_STATION_LOCATION = STATION___GET_STATION_LOCATION;

	/**
	 * The operation id for the '<em>Get All Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_STATION___GET_ALL_CONNECTIONS = STATION___GET_ALL_CONNECTIONS;

	/**
	 * The number of operations of the '<em>Train Station</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_STATION_OPERATION_COUNT = STATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tud.city.transport.citytransportinventory.impl.TramStationImpl <em>Tram Station</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.city.transport.citytransportinventory.impl.TramStationImpl
	 * @see org.tud.city.transport.citytransportinventory.impl.CitytransportinventoryPackageImpl#getTramStation()
	 * @generated
	 */
	int TRAM_STATION = 7;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAM_STATION__LOCATION = STATION__LOCATION;

	/**
	 * The number of structural features of the '<em>Tram Station</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAM_STATION_FEATURE_COUNT = STATION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Station Location</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAM_STATION___GET_STATION_LOCATION = STATION___GET_STATION_LOCATION;

	/**
	 * The operation id for the '<em>Get All Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAM_STATION___GET_ALL_CONNECTIONS = STATION___GET_ALL_CONNECTIONS;

	/**
	 * The number of operations of the '<em>Tram Station</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAM_STATION_OPERATION_COUNT = STATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tud.city.transport.citytransportinventory.impl.RouteImpl <em>Route</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.city.transport.citytransportinventory.impl.RouteImpl
	 * @see org.tud.city.transport.citytransportinventory.impl.CitytransportinventoryPackageImpl#getRoute()
	 * @generated
	 */
	int ROUTE = 8;

	/**
	 * The feature id for the '<em><b>EReference0</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE__EREFERENCE0 = 0;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE__START_TIME = 1;

	/**
	 * The feature id for the '<em><b>End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE__END_TIME = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE__NAME = 3;

	/**
	 * The feature id for the '<em><b>Assigned Vehicles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE__ASSIGNED_VEHICLES = 4;

	/**
	 * The number of structural features of the '<em>Route</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Get All Stations After Station</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE___GET_ALL_STATIONS_AFTER_STATION = 0;

	/**
	 * The operation id for the '<em>Get End Station</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE___GET_END_STATION = 1;

	/**
	 * The operation id for the '<em>Get Start Station</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE___GET_START_STATION = 2;

	/**
	 * The number of operations of the '<em>Route</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.tud.city.transport.citytransportinventory.impl.BusRouteImpl <em>Bus Route</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.city.transport.citytransportinventory.impl.BusRouteImpl
	 * @see org.tud.city.transport.citytransportinventory.impl.CitytransportinventoryPackageImpl#getBusRoute()
	 * @generated
	 */
	int BUS_ROUTE = 9;

	/**
	 * The feature id for the '<em><b>EReference0</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_ROUTE__EREFERENCE0 = ROUTE__EREFERENCE0;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_ROUTE__START_TIME = ROUTE__START_TIME;

	/**
	 * The feature id for the '<em><b>End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_ROUTE__END_TIME = ROUTE__END_TIME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_ROUTE__NAME = ROUTE__NAME;

	/**
	 * The feature id for the '<em><b>Assigned Vehicles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_ROUTE__ASSIGNED_VEHICLES = ROUTE__ASSIGNED_VEHICLES;

	/**
	 * The number of structural features of the '<em>Bus Route</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_ROUTE_FEATURE_COUNT = ROUTE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get All Stations After Station</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_ROUTE___GET_ALL_STATIONS_AFTER_STATION = ROUTE___GET_ALL_STATIONS_AFTER_STATION;

	/**
	 * The operation id for the '<em>Get End Station</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_ROUTE___GET_END_STATION = ROUTE___GET_END_STATION;

	/**
	 * The operation id for the '<em>Get Start Station</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_ROUTE___GET_START_STATION = ROUTE___GET_START_STATION;

	/**
	 * The number of operations of the '<em>Bus Route</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_ROUTE_OPERATION_COUNT = ROUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tud.city.transport.citytransportinventory.impl.TrainRouteImpl <em>Train Route</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.city.transport.citytransportinventory.impl.TrainRouteImpl
	 * @see org.tud.city.transport.citytransportinventory.impl.CitytransportinventoryPackageImpl#getTrainRoute()
	 * @generated
	 */
	int TRAIN_ROUTE = 10;

	/**
	 * The feature id for the '<em><b>EReference0</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_ROUTE__EREFERENCE0 = ROUTE__EREFERENCE0;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_ROUTE__START_TIME = ROUTE__START_TIME;

	/**
	 * The feature id for the '<em><b>End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_ROUTE__END_TIME = ROUTE__END_TIME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_ROUTE__NAME = ROUTE__NAME;

	/**
	 * The feature id for the '<em><b>Assigned Vehicles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_ROUTE__ASSIGNED_VEHICLES = ROUTE__ASSIGNED_VEHICLES;

	/**
	 * The number of structural features of the '<em>Train Route</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_ROUTE_FEATURE_COUNT = ROUTE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get All Stations After Station</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_ROUTE___GET_ALL_STATIONS_AFTER_STATION = ROUTE___GET_ALL_STATIONS_AFTER_STATION;

	/**
	 * The operation id for the '<em>Get End Station</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_ROUTE___GET_END_STATION = ROUTE___GET_END_STATION;

	/**
	 * The operation id for the '<em>Get Start Station</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_ROUTE___GET_START_STATION = ROUTE___GET_START_STATION;

	/**
	 * The number of operations of the '<em>Train Route</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_ROUTE_OPERATION_COUNT = ROUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tud.city.transport.citytransportinventory.impl.TramRouteImpl <em>Tram Route</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.city.transport.citytransportinventory.impl.TramRouteImpl
	 * @see org.tud.city.transport.citytransportinventory.impl.CitytransportinventoryPackageImpl#getTramRoute()
	 * @generated
	 */
	int TRAM_ROUTE = 11;

	/**
	 * The feature id for the '<em><b>EReference0</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAM_ROUTE__EREFERENCE0 = ROUTE__EREFERENCE0;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAM_ROUTE__START_TIME = ROUTE__START_TIME;

	/**
	 * The feature id for the '<em><b>End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAM_ROUTE__END_TIME = ROUTE__END_TIME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAM_ROUTE__NAME = ROUTE__NAME;

	/**
	 * The feature id for the '<em><b>Assigned Vehicles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAM_ROUTE__ASSIGNED_VEHICLES = ROUTE__ASSIGNED_VEHICLES;

	/**
	 * The number of structural features of the '<em>Tram Route</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAM_ROUTE_FEATURE_COUNT = ROUTE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get All Stations After Station</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAM_ROUTE___GET_ALL_STATIONS_AFTER_STATION = ROUTE___GET_ALL_STATIONS_AFTER_STATION;

	/**
	 * The operation id for the '<em>Get End Station</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAM_ROUTE___GET_END_STATION = ROUTE___GET_END_STATION;

	/**
	 * The operation id for the '<em>Get Start Station</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAM_ROUTE___GET_START_STATION = ROUTE___GET_START_STATION;

	/**
	 * The number of operations of the '<em>Tram Route</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAM_ROUTE_OPERATION_COUNT = ROUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tud.city.transport.citytransportinventory.impl.LocationImpl <em>Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.city.transport.citytransportinventory.impl.LocationImpl
	 * @see org.tud.city.transport.citytransportinventory.impl.CitytransportinventoryPackageImpl#getLocation()
	 * @generated
	 */
	int LOCATION = 12;

	/**
	 * The feature id for the '<em><b>Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__LATITUDE = 0;

	/**
	 * The feature id for the '<em><b>Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__LONGITUDE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__NAME = 2;

	/**
	 * The number of structural features of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.tud.city.transport.citytransportinventory.Ticket <em>Ticket</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.city.transport.citytransportinventory.Ticket
	 * @see org.tud.city.transport.citytransportinventory.impl.CitytransportinventoryPackageImpl#getTicket()
	 * @generated
	 */
	int TICKET = 13;

	/**
	 * The number of structural features of the '<em>Ticket</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TICKET_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Getvalidity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TICKET___GETVALIDITY = 0;

	/**
	 * The operation id for the '<em>Get Cost</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TICKET___GET_COST = 1;

	/**
	 * The number of operations of the '<em>Ticket</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TICKET_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.tud.city.transport.citytransportinventory.impl.BusTicketImpl <em>Bus Ticket</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.city.transport.citytransportinventory.impl.BusTicketImpl
	 * @see org.tud.city.transport.citytransportinventory.impl.CitytransportinventoryPackageImpl#getBusTicket()
	 * @generated
	 */
	int BUS_TICKET = 14;

	/**
	 * The feature id for the '<em><b>Route</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_TICKET__ROUTE = TICKET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bus Ticket</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_TICKET_FEATURE_COUNT = TICKET_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Getvalidity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_TICKET___GETVALIDITY = TICKET___GETVALIDITY;

	/**
	 * The operation id for the '<em>Get Cost</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_TICKET___GET_COST = TICKET___GET_COST;

	/**
	 * The number of operations of the '<em>Bus Ticket</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_TICKET_OPERATION_COUNT = TICKET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tud.city.transport.citytransportinventory.impl.TrainTicketImpl <em>Train Ticket</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.city.transport.citytransportinventory.impl.TrainTicketImpl
	 * @see org.tud.city.transport.citytransportinventory.impl.CitytransportinventoryPackageImpl#getTrainTicket()
	 * @generated
	 */
	int TRAIN_TICKET = 15;

	/**
	 * The feature id for the '<em><b>Route</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_TICKET__ROUTE = TICKET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Train Ticket</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_TICKET_FEATURE_COUNT = TICKET_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Getvalidity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_TICKET___GETVALIDITY = TICKET___GETVALIDITY;

	/**
	 * The operation id for the '<em>Get Cost</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_TICKET___GET_COST = TICKET___GET_COST;

	/**
	 * The number of operations of the '<em>Train Ticket</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_TICKET_OPERATION_COUNT = TICKET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tud.city.transport.citytransportinventory.impl.TramTicketImpl <em>Tram Ticket</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.city.transport.citytransportinventory.impl.TramTicketImpl
	 * @see org.tud.city.transport.citytransportinventory.impl.CitytransportinventoryPackageImpl#getTramTicket()
	 * @generated
	 */
	int TRAM_TICKET = 16;

	/**
	 * The feature id for the '<em><b>Route</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAM_TICKET__ROUTE = TICKET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Tram Ticket</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAM_TICKET_FEATURE_COUNT = TICKET_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Getvalidity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAM_TICKET___GETVALIDITY = TICKET___GETVALIDITY;

	/**
	 * The operation id for the '<em>Get Cost</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAM_TICKET___GET_COST = TICKET___GET_COST;

	/**
	 * The number of operations of the '<em>Tram Ticket</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAM_TICKET_OPERATION_COUNT = TICKET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tud.city.transport.citytransportinventory.impl.FuelImpl <em>Fuel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.city.transport.citytransportinventory.impl.FuelImpl
	 * @see org.tud.city.transport.citytransportinventory.impl.CitytransportinventoryPackageImpl#getFuel()
	 * @generated
	 */
	int FUEL = 17;

	/**
	 * The feature id for the '<em><b>Fuel Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUEL__FUEL_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUEL__CAPACITY = 1;

	/**
	 * The number of structural features of the '<em>Fuel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUEL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Fuel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.tud.city.transport.citytransportinventory.impl.PetrolImpl <em>Petrol</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.city.transport.citytransportinventory.impl.PetrolImpl
	 * @see org.tud.city.transport.citytransportinventory.impl.CitytransportinventoryPackageImpl#getPetrol()
	 * @generated
	 */
	int PETROL = 18;

	/**
	 * The number of structural features of the '<em>Petrol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETROL_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Petrol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETROL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.tud.city.transport.citytransportinventory.impl.ConnectionInfrastructureImpl <em>Connection Infrastructure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.city.transport.citytransportinventory.impl.ConnectionInfrastructureImpl
	 * @see org.tud.city.transport.citytransportinventory.impl.CitytransportinventoryPackageImpl#getConnectionInfrastructure()
	 * @generated
	 */
	int CONNECTION_INFRASTRUCTURE = 19;

	/**
	 * The feature id for the '<em><b>Next Maintanence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_INFRASTRUCTURE__NEXT_MAINTANENCE = MAINTAINABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Last Maintanence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_INFRASTRUCTURE__LAST_MAINTANENCE = MAINTAINABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_INFRASTRUCTURE__NAME = MAINTAINABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Connection Infrastructure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_INFRASTRUCTURE_FEATURE_COUNT = MAINTAINABLE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Last Maintenance Date</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_INFRASTRUCTURE___GET_LAST_MAINTENANCE_DATE = MAINTAINABLE___GET_LAST_MAINTENANCE_DATE;

	/**
	 * The operation id for the '<em>Get Next Maintenance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_INFRASTRUCTURE___GET_NEXT_MAINTENANCE = MAINTAINABLE___GET_NEXT_MAINTENANCE;

	/**
	 * The number of operations of the '<em>Connection Infrastructure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_INFRASTRUCTURE_OPERATION_COUNT = MAINTAINABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tud.city.transport.citytransportinventory.impl.RoadImpl <em>Road</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.city.transport.citytransportinventory.impl.RoadImpl
	 * @see org.tud.city.transport.citytransportinventory.impl.CitytransportinventoryPackageImpl#getRoad()
	 * @generated
	 */
	int ROAD = 20;

	/**
	 * The feature id for the '<em><b>Next Maintanence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROAD__NEXT_MAINTANENCE = CONNECTION_INFRASTRUCTURE__NEXT_MAINTANENCE;

	/**
	 * The feature id for the '<em><b>Last Maintanence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROAD__LAST_MAINTANENCE = CONNECTION_INFRASTRUCTURE__LAST_MAINTANENCE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROAD__NAME = CONNECTION_INFRASTRUCTURE__NAME;

	/**
	 * The number of structural features of the '<em>Road</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROAD_FEATURE_COUNT = CONNECTION_INFRASTRUCTURE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Last Maintenance Date</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROAD___GET_LAST_MAINTENANCE_DATE = CONNECTION_INFRASTRUCTURE___GET_LAST_MAINTENANCE_DATE;

	/**
	 * The operation id for the '<em>Get Next Maintenance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROAD___GET_NEXT_MAINTENANCE = CONNECTION_INFRASTRUCTURE___GET_NEXT_MAINTENANCE;

	/**
	 * The number of operations of the '<em>Road</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROAD_OPERATION_COUNT = CONNECTION_INFRASTRUCTURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tud.city.transport.citytransportinventory.impl.RailImpl <em>Rail</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.city.transport.citytransportinventory.impl.RailImpl
	 * @see org.tud.city.transport.citytransportinventory.impl.CitytransportinventoryPackageImpl#getRail()
	 * @generated
	 */
	int RAIL = 21;

	/**
	 * The feature id for the '<em><b>Next Maintanence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAIL__NEXT_MAINTANENCE = CONNECTION_INFRASTRUCTURE__NEXT_MAINTANENCE;

	/**
	 * The feature id for the '<em><b>Last Maintanence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAIL__LAST_MAINTANENCE = CONNECTION_INFRASTRUCTURE__LAST_MAINTANENCE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAIL__NAME = CONNECTION_INFRASTRUCTURE__NAME;

	/**
	 * The number of structural features of the '<em>Rail</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAIL_FEATURE_COUNT = CONNECTION_INFRASTRUCTURE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Last Maintenance Date</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAIL___GET_LAST_MAINTENANCE_DATE = CONNECTION_INFRASTRUCTURE___GET_LAST_MAINTENANCE_DATE;

	/**
	 * The operation id for the '<em>Get Next Maintenance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAIL___GET_NEXT_MAINTENANCE = CONNECTION_INFRASTRUCTURE___GET_NEXT_MAINTENANCE;

	/**
	 * The number of operations of the '<em>Rail</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAIL_OPERATION_COUNT = CONNECTION_INFRASTRUCTURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tud.city.transport.citytransportinventory.impl.TramTracksImpl <em>Tram Tracks</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.city.transport.citytransportinventory.impl.TramTracksImpl
	 * @see org.tud.city.transport.citytransportinventory.impl.CitytransportinventoryPackageImpl#getTramTracks()
	 * @generated
	 */
	int TRAM_TRACKS = 22;

	/**
	 * The feature id for the '<em><b>Next Maintanence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAM_TRACKS__NEXT_MAINTANENCE = CONNECTION_INFRASTRUCTURE__NEXT_MAINTANENCE;

	/**
	 * The feature id for the '<em><b>Last Maintanence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAM_TRACKS__LAST_MAINTANENCE = CONNECTION_INFRASTRUCTURE__LAST_MAINTANENCE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAM_TRACKS__NAME = CONNECTION_INFRASTRUCTURE__NAME;

	/**
	 * The number of structural features of the '<em>Tram Tracks</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAM_TRACKS_FEATURE_COUNT = CONNECTION_INFRASTRUCTURE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Last Maintenance Date</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAM_TRACKS___GET_LAST_MAINTENANCE_DATE = CONNECTION_INFRASTRUCTURE___GET_LAST_MAINTENANCE_DATE;

	/**
	 * The operation id for the '<em>Get Next Maintenance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAM_TRACKS___GET_NEXT_MAINTENANCE = CONNECTION_INFRASTRUCTURE___GET_NEXT_MAINTENANCE;

	/**
	 * The number of operations of the '<em>Tram Tracks</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAM_TRACKS_OPERATION_COUNT = CONNECTION_INFRASTRUCTURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tud.city.transport.citytransportinventory.FuelType <em>Fuel Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.city.transport.citytransportinventory.FuelType
	 * @see org.tud.city.transport.citytransportinventory.impl.CitytransportinventoryPackageImpl#getFuelType()
	 * @generated
	 */
	int FUEL_TYPE = 24;

	/**
	 * The meta object id for the '{@link org.tud.city.transport.citytransportinventory.TrainType <em>Train Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.city.transport.citytransportinventory.TrainType
	 * @see org.tud.city.transport.citytransportinventory.impl.CitytransportinventoryPackageImpl#getTrainType()
	 * @generated
	 */
	int TRAIN_TYPE = 25;

	/**
	 * The meta object id for the '{@link org.tud.city.transport.citytransportinventory.BusType <em>Bus Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.city.transport.citytransportinventory.BusType
	 * @see org.tud.city.transport.citytransportinventory.impl.CitytransportinventoryPackageImpl#getBusType()
	 * @generated
	 */
	int BUS_TYPE = 26;


	/**
	 * Returns the meta object for class '{@link org.tud.city.transport.citytransportinventory.Vehicle <em>Vehicle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vehicle</em>'.
	 * @see org.tud.city.transport.citytransportinventory.Vehicle
	 * @generated
	 */
	EClass getVehicle();

	/**
	 * Returns the meta object for the containment reference '{@link org.tud.city.transport.citytransportinventory.Vehicle#getFuelStats <em>Fuel Stats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fuel Stats</em>'.
	 * @see org.tud.city.transport.citytransportinventory.Vehicle#getFuelStats()
	 * @see #getVehicle()
	 * @generated
	 */
	EReference getVehicle_FuelStats();

	/**
	 * Returns the meta object for the attribute '{@link org.tud.city.transport.citytransportinventory.Vehicle#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.tud.city.transport.citytransportinventory.Vehicle#getName()
	 * @see #getVehicle()
	 * @generated
	 */
	EAttribute getVehicle_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.tud.city.transport.citytransportinventory.Vehicle#getRegistration <em>Registration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Registration</em>'.
	 * @see org.tud.city.transport.citytransportinventory.Vehicle#getRegistration()
	 * @see #getVehicle()
	 * @generated
	 */
	EAttribute getVehicle_Registration();

	/**
	 * Returns the meta object for the attribute '{@link org.tud.city.transport.citytransportinventory.Vehicle#getSeatingCapacity <em>Seating Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seating Capacity</em>'.
	 * @see org.tud.city.transport.citytransportinventory.Vehicle#getSeatingCapacity()
	 * @see #getVehicle()
	 * @generated
	 */
	EAttribute getVehicle_SeatingCapacity();

	/**
	 * Returns the meta object for the attribute '{@link org.tud.city.transport.citytransportinventory.Vehicle#getCycleCapacity <em>Cycle Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cycle Capacity</em>'.
	 * @see org.tud.city.transport.citytransportinventory.Vehicle#getCycleCapacity()
	 * @see #getVehicle()
	 * @generated
	 */
	EAttribute getVehicle_CycleCapacity();

	/**
	 * Returns the meta object for the attribute '{@link org.tud.city.transport.citytransportinventory.Vehicle#isPhysicallyHandicappedSupport <em>Physically Handicapped Support</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Physically Handicapped Support</em>'.
	 * @see org.tud.city.transport.citytransportinventory.Vehicle#isPhysicallyHandicappedSupport()
	 * @see #getVehicle()
	 * @generated
	 */
	EAttribute getVehicle_PhysicallyHandicappedSupport();

	/**
	 * Returns the meta object for the attribute '{@link org.tud.city.transport.citytransportinventory.Vehicle#getLastMaintanance <em>Last Maintanance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Maintanance</em>'.
	 * @see org.tud.city.transport.citytransportinventory.Vehicle#getLastMaintanance()
	 * @see #getVehicle()
	 * @generated
	 */
	EAttribute getVehicle_LastMaintanance();

	/**
	 * Returns the meta object for the attribute '{@link org.tud.city.transport.citytransportinventory.Vehicle#getNextMaintanence <em>Next Maintanence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Next Maintanence</em>'.
	 * @see org.tud.city.transport.citytransportinventory.Vehicle#getNextMaintanence()
	 * @see #getVehicle()
	 * @generated
	 */
	EAttribute getVehicle_NextMaintanence();

	/**
	 * Returns the meta object for class '{@link org.tud.city.transport.citytransportinventory.Bus <em>Bus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bus</em>'.
	 * @see org.tud.city.transport.citytransportinventory.Bus
	 * @generated
	 */
	EClass getBus();

	/**
	 * Returns the meta object for the attribute '{@link org.tud.city.transport.citytransportinventory.Bus#getBusType <em>Bus Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bus Type</em>'.
	 * @see org.tud.city.transport.citytransportinventory.Bus#getBusType()
	 * @see #getBus()
	 * @generated
	 */
	EAttribute getBus_BusType();

	/**
	 * Returns the meta object for class '{@link org.tud.city.transport.citytransportinventory.Train <em>Train</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Train</em>'.
	 * @see org.tud.city.transport.citytransportinventory.Train
	 * @generated
	 */
	EClass getTrain();

	/**
	 * Returns the meta object for the attribute '{@link org.tud.city.transport.citytransportinventory.Train#getTrainType <em>Train Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Train Type</em>'.
	 * @see org.tud.city.transport.citytransportinventory.Train#getTrainType()
	 * @see #getTrain()
	 * @generated
	 */
	EAttribute getTrain_TrainType();

	/**
	 * Returns the meta object for class '{@link org.tud.city.transport.citytransportinventory.Tram <em>Tram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tram</em>'.
	 * @see org.tud.city.transport.citytransportinventory.Tram
	 * @generated
	 */
	EClass getTram();

	/**
	 * Returns the meta object for class '{@link org.tud.city.transport.citytransportinventory.Station <em>Station</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Station</em>'.
	 * @see org.tud.city.transport.citytransportinventory.Station
	 * @generated
	 */
	EClass getStation();

	/**
	 * Returns the meta object for the containment reference '{@link org.tud.city.transport.citytransportinventory.Station#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Location</em>'.
	 * @see org.tud.city.transport.citytransportinventory.Station#getLocation()
	 * @see #getStation()
	 * @generated
	 */
	EReference getStation_Location();

	/**
	 * Returns the meta object for the '{@link org.tud.city.transport.citytransportinventory.Station#getStationLocation() <em>Get Station Location</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Station Location</em>' operation.
	 * @see org.tud.city.transport.citytransportinventory.Station#getStationLocation()
	 * @generated
	 */
	EOperation getStation__GetStationLocation();

	/**
	 * Returns the meta object for the '{@link org.tud.city.transport.citytransportinventory.Station#getAllConnections() <em>Get All Connections</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Connections</em>' operation.
	 * @see org.tud.city.transport.citytransportinventory.Station#getAllConnections()
	 * @generated
	 */
	EOperation getStation__GetAllConnections();

	/**
	 * Returns the meta object for class '{@link org.tud.city.transport.citytransportinventory.BusStation <em>Bus Station</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bus Station</em>'.
	 * @see org.tud.city.transport.citytransportinventory.BusStation
	 * @generated
	 */
	EClass getBusStation();

	/**
	 * Returns the meta object for class '{@link org.tud.city.transport.citytransportinventory.TrainStation <em>Train Station</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Train Station</em>'.
	 * @see org.tud.city.transport.citytransportinventory.TrainStation
	 * @generated
	 */
	EClass getTrainStation();

	/**
	 * Returns the meta object for class '{@link org.tud.city.transport.citytransportinventory.TramStation <em>Tram Station</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tram Station</em>'.
	 * @see org.tud.city.transport.citytransportinventory.TramStation
	 * @generated
	 */
	EClass getTramStation();

	/**
	 * Returns the meta object for class '{@link org.tud.city.transport.citytransportinventory.Route <em>Route</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Route</em>'.
	 * @see org.tud.city.transport.citytransportinventory.Route
	 * @generated
	 */
	EClass getRoute();

	/**
	 * Returns the meta object for the containment reference list '{@link org.tud.city.transport.citytransportinventory.Route#getEReference0 <em>EReference0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>EReference0</em>'.
	 * @see org.tud.city.transport.citytransportinventory.Route#getEReference0()
	 * @see #getRoute()
	 * @generated
	 */
	EReference getRoute_EReference0();

	/**
	 * Returns the meta object for the attribute '{@link org.tud.city.transport.citytransportinventory.Route#getStartTime <em>Start Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Time</em>'.
	 * @see org.tud.city.transport.citytransportinventory.Route#getStartTime()
	 * @see #getRoute()
	 * @generated
	 */
	EAttribute getRoute_StartTime();

	/**
	 * Returns the meta object for the attribute '{@link org.tud.city.transport.citytransportinventory.Route#getEndTime <em>End Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Time</em>'.
	 * @see org.tud.city.transport.citytransportinventory.Route#getEndTime()
	 * @see #getRoute()
	 * @generated
	 */
	EAttribute getRoute_EndTime();

	/**
	 * Returns the meta object for the attribute '{@link org.tud.city.transport.citytransportinventory.Route#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.tud.city.transport.citytransportinventory.Route#getName()
	 * @see #getRoute()
	 * @generated
	 */
	EAttribute getRoute_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.tud.city.transport.citytransportinventory.Route#getAssignedVehicles <em>Assigned Vehicles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Assigned Vehicles</em>'.
	 * @see org.tud.city.transport.citytransportinventory.Route#getAssignedVehicles()
	 * @see #getRoute()
	 * @generated
	 */
	EReference getRoute_AssignedVehicles();

	/**
	 * Returns the meta object for the '{@link org.tud.city.transport.citytransportinventory.Route#getAllStationsAfterStation() <em>Get All Stations After Station</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Stations After Station</em>' operation.
	 * @see org.tud.city.transport.citytransportinventory.Route#getAllStationsAfterStation()
	 * @generated
	 */
	EOperation getRoute__GetAllStationsAfterStation();

	/**
	 * Returns the meta object for the '{@link org.tud.city.transport.citytransportinventory.Route#getEndStation() <em>Get End Station</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get End Station</em>' operation.
	 * @see org.tud.city.transport.citytransportinventory.Route#getEndStation()
	 * @generated
	 */
	EOperation getRoute__GetEndStation();

	/**
	 * Returns the meta object for the '{@link org.tud.city.transport.citytransportinventory.Route#getStartStation() <em>Get Start Station</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Start Station</em>' operation.
	 * @see org.tud.city.transport.citytransportinventory.Route#getStartStation()
	 * @generated
	 */
	EOperation getRoute__GetStartStation();

	/**
	 * Returns the meta object for class '{@link org.tud.city.transport.citytransportinventory.BusRoute <em>Bus Route</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bus Route</em>'.
	 * @see org.tud.city.transport.citytransportinventory.BusRoute
	 * @generated
	 */
	EClass getBusRoute();

	/**
	 * Returns the meta object for class '{@link org.tud.city.transport.citytransportinventory.TrainRoute <em>Train Route</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Train Route</em>'.
	 * @see org.tud.city.transport.citytransportinventory.TrainRoute
	 * @generated
	 */
	EClass getTrainRoute();

	/**
	 * Returns the meta object for class '{@link org.tud.city.transport.citytransportinventory.TramRoute <em>Tram Route</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tram Route</em>'.
	 * @see org.tud.city.transport.citytransportinventory.TramRoute
	 * @generated
	 */
	EClass getTramRoute();

	/**
	 * Returns the meta object for class '{@link org.tud.city.transport.citytransportinventory.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location</em>'.
	 * @see org.tud.city.transport.citytransportinventory.Location
	 * @generated
	 */
	EClass getLocation();

	/**
	 * Returns the meta object for the attribute '{@link org.tud.city.transport.citytransportinventory.Location#getLatitude <em>Latitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Latitude</em>'.
	 * @see org.tud.city.transport.citytransportinventory.Location#getLatitude()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_Latitude();

	/**
	 * Returns the meta object for the attribute '{@link org.tud.city.transport.citytransportinventory.Location#getLongitude <em>Longitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Longitude</em>'.
	 * @see org.tud.city.transport.citytransportinventory.Location#getLongitude()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_Longitude();

	/**
	 * Returns the meta object for the attribute '{@link org.tud.city.transport.citytransportinventory.Location#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.tud.city.transport.citytransportinventory.Location#getName()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_Name();

	/**
	 * Returns the meta object for class '{@link org.tud.city.transport.citytransportinventory.Ticket <em>Ticket</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ticket</em>'.
	 * @see org.tud.city.transport.citytransportinventory.Ticket
	 * @generated
	 */
	EClass getTicket();

	/**
	 * Returns the meta object for the '{@link org.tud.city.transport.citytransportinventory.Ticket#getvalidity() <em>Getvalidity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Getvalidity</em>' operation.
	 * @see org.tud.city.transport.citytransportinventory.Ticket#getvalidity()
	 * @generated
	 */
	EOperation getTicket__Getvalidity();

	/**
	 * Returns the meta object for the '{@link org.tud.city.transport.citytransportinventory.Ticket#getCost() <em>Get Cost</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Cost</em>' operation.
	 * @see org.tud.city.transport.citytransportinventory.Ticket#getCost()
	 * @generated
	 */
	EOperation getTicket__GetCost();

	/**
	 * Returns the meta object for class '{@link org.tud.city.transport.citytransportinventory.BusTicket <em>Bus Ticket</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bus Ticket</em>'.
	 * @see org.tud.city.transport.citytransportinventory.BusTicket
	 * @generated
	 */
	EClass getBusTicket();

	/**
	 * Returns the meta object for the reference '{@link org.tud.city.transport.citytransportinventory.BusTicket#getRoute <em>Route</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Route</em>'.
	 * @see org.tud.city.transport.citytransportinventory.BusTicket#getRoute()
	 * @see #getBusTicket()
	 * @generated
	 */
	EReference getBusTicket_Route();

	/**
	 * Returns the meta object for class '{@link org.tud.city.transport.citytransportinventory.TrainTicket <em>Train Ticket</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Train Ticket</em>'.
	 * @see org.tud.city.transport.citytransportinventory.TrainTicket
	 * @generated
	 */
	EClass getTrainTicket();

	/**
	 * Returns the meta object for the reference '{@link org.tud.city.transport.citytransportinventory.TrainTicket#getRoute <em>Route</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Route</em>'.
	 * @see org.tud.city.transport.citytransportinventory.TrainTicket#getRoute()
	 * @see #getTrainTicket()
	 * @generated
	 */
	EReference getTrainTicket_Route();

	/**
	 * Returns the meta object for class '{@link org.tud.city.transport.citytransportinventory.TramTicket <em>Tram Ticket</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tram Ticket</em>'.
	 * @see org.tud.city.transport.citytransportinventory.TramTicket
	 * @generated
	 */
	EClass getTramTicket();

	/**
	 * Returns the meta object for the reference '{@link org.tud.city.transport.citytransportinventory.TramTicket#getRoute <em>Route</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Route</em>'.
	 * @see org.tud.city.transport.citytransportinventory.TramTicket#getRoute()
	 * @see #getTramTicket()
	 * @generated
	 */
	EReference getTramTicket_Route();

	/**
	 * Returns the meta object for class '{@link org.tud.city.transport.citytransportinventory.Fuel <em>Fuel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fuel</em>'.
	 * @see org.tud.city.transport.citytransportinventory.Fuel
	 * @generated
	 */
	EClass getFuel();

	/**
	 * Returns the meta object for the attribute '{@link org.tud.city.transport.citytransportinventory.Fuel#getFuelType <em>Fuel Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fuel Type</em>'.
	 * @see org.tud.city.transport.citytransportinventory.Fuel#getFuelType()
	 * @see #getFuel()
	 * @generated
	 */
	EAttribute getFuel_FuelType();

	/**
	 * Returns the meta object for the attribute '{@link org.tud.city.transport.citytransportinventory.Fuel#getCapacity <em>Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capacity</em>'.
	 * @see org.tud.city.transport.citytransportinventory.Fuel#getCapacity()
	 * @see #getFuel()
	 * @generated
	 */
	EAttribute getFuel_Capacity();

	/**
	 * Returns the meta object for class '{@link org.tud.city.transport.citytransportinventory.Petrol <em>Petrol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Petrol</em>'.
	 * @see org.tud.city.transport.citytransportinventory.Petrol
	 * @generated
	 */
	EClass getPetrol();

	/**
	 * Returns the meta object for class '{@link org.tud.city.transport.citytransportinventory.ConnectionInfrastructure <em>Connection Infrastructure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection Infrastructure</em>'.
	 * @see org.tud.city.transport.citytransportinventory.ConnectionInfrastructure
	 * @generated
	 */
	EClass getConnectionInfrastructure();

	/**
	 * Returns the meta object for the attribute '{@link org.tud.city.transport.citytransportinventory.ConnectionInfrastructure#getNextMaintanence <em>Next Maintanence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Next Maintanence</em>'.
	 * @see org.tud.city.transport.citytransportinventory.ConnectionInfrastructure#getNextMaintanence()
	 * @see #getConnectionInfrastructure()
	 * @generated
	 */
	EAttribute getConnectionInfrastructure_NextMaintanence();

	/**
	 * Returns the meta object for the attribute '{@link org.tud.city.transport.citytransportinventory.ConnectionInfrastructure#getLastMaintanence <em>Last Maintanence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Maintanence</em>'.
	 * @see org.tud.city.transport.citytransportinventory.ConnectionInfrastructure#getLastMaintanence()
	 * @see #getConnectionInfrastructure()
	 * @generated
	 */
	EAttribute getConnectionInfrastructure_LastMaintanence();

	/**
	 * Returns the meta object for the attribute '{@link org.tud.city.transport.citytransportinventory.ConnectionInfrastructure#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.tud.city.transport.citytransportinventory.ConnectionInfrastructure#getName()
	 * @see #getConnectionInfrastructure()
	 * @generated
	 */
	EAttribute getConnectionInfrastructure_Name();

	/**
	 * Returns the meta object for class '{@link org.tud.city.transport.citytransportinventory.Road <em>Road</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Road</em>'.
	 * @see org.tud.city.transport.citytransportinventory.Road
	 * @generated
	 */
	EClass getRoad();

	/**
	 * Returns the meta object for class '{@link org.tud.city.transport.citytransportinventory.Rail <em>Rail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rail</em>'.
	 * @see org.tud.city.transport.citytransportinventory.Rail
	 * @generated
	 */
	EClass getRail();

	/**
	 * Returns the meta object for class '{@link org.tud.city.transport.citytransportinventory.TramTracks <em>Tram Tracks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tram Tracks</em>'.
	 * @see org.tud.city.transport.citytransportinventory.TramTracks
	 * @generated
	 */
	EClass getTramTracks();

	/**
	 * Returns the meta object for class '{@link org.tud.city.transport.citytransportinventory.Maintainable <em>Maintainable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Maintainable</em>'.
	 * @see org.tud.city.transport.citytransportinventory.Maintainable
	 * @generated
	 */
	EClass getMaintainable();

	/**
	 * Returns the meta object for the '{@link org.tud.city.transport.citytransportinventory.Maintainable#getLastMaintenanceDate() <em>Get Last Maintenance Date</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Last Maintenance Date</em>' operation.
	 * @see org.tud.city.transport.citytransportinventory.Maintainable#getLastMaintenanceDate()
	 * @generated
	 */
	EOperation getMaintainable__GetLastMaintenanceDate();

	/**
	 * Returns the meta object for the '{@link org.tud.city.transport.citytransportinventory.Maintainable#getNextMaintenance() <em>Get Next Maintenance</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Next Maintenance</em>' operation.
	 * @see org.tud.city.transport.citytransportinventory.Maintainable#getNextMaintenance()
	 * @generated
	 */
	EOperation getMaintainable__GetNextMaintenance();

	/**
	 * Returns the meta object for enum '{@link org.tud.city.transport.citytransportinventory.FuelType <em>Fuel Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Fuel Type</em>'.
	 * @see org.tud.city.transport.citytransportinventory.FuelType
	 * @generated
	 */
	EEnum getFuelType();

	/**
	 * Returns the meta object for enum '{@link org.tud.city.transport.citytransportinventory.TrainType <em>Train Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Train Type</em>'.
	 * @see org.tud.city.transport.citytransportinventory.TrainType
	 * @generated
	 */
	EEnum getTrainType();

	/**
	 * Returns the meta object for enum '{@link org.tud.city.transport.citytransportinventory.BusType <em>Bus Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Bus Type</em>'.
	 * @see org.tud.city.transport.citytransportinventory.BusType
	 * @generated
	 */
	EEnum getBusType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CitytransportinventoryFactory getCitytransportinventoryFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.tud.city.transport.citytransportinventory.impl.VehicleImpl <em>Vehicle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.city.transport.citytransportinventory.impl.VehicleImpl
		 * @see org.tud.city.transport.citytransportinventory.impl.CitytransportinventoryPackageImpl#getVehicle()
		 * @generated
		 */
		EClass VEHICLE = eINSTANCE.getVehicle();

		/**
		 * The meta object literal for the '<em><b>Fuel Stats</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VEHICLE__FUEL_STATS = eINSTANCE.getVehicle_FuelStats();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VEHICLE__NAME = eINSTANCE.getVehicle_Name();

		/**
		 * The meta object literal for the '<em><b>Registration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VEHICLE__REGISTRATION = eINSTANCE.getVehicle_Registration();

		/**
		 * The meta object literal for the '<em><b>Seating Capacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VEHICLE__SEATING_CAPACITY = eINSTANCE.getVehicle_SeatingCapacity();

		/**
		 * The meta object literal for the '<em><b>Cycle Capacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VEHICLE__CYCLE_CAPACITY = eINSTANCE.getVehicle_CycleCapacity();

		/**
		 * The meta object literal for the '<em><b>Physically Handicapped Support</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VEHICLE__PHYSICALLY_HANDICAPPED_SUPPORT = eINSTANCE.getVehicle_PhysicallyHandicappedSupport();

		/**
		 * The meta object literal for the '<em><b>Last Maintanance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VEHICLE__LAST_MAINTANANCE = eINSTANCE.getVehicle_LastMaintanance();

		/**
		 * The meta object literal for the '<em><b>Next Maintanence</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VEHICLE__NEXT_MAINTANENCE = eINSTANCE.getVehicle_NextMaintanence();

		/**
		 * The meta object literal for the '{@link org.tud.city.transport.citytransportinventory.impl.BusImpl <em>Bus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.city.transport.citytransportinventory.impl.BusImpl
		 * @see org.tud.city.transport.citytransportinventory.impl.CitytransportinventoryPackageImpl#getBus()
		 * @generated
		 */
		EClass BUS = eINSTANCE.getBus();

		/**
		 * The meta object literal for the '<em><b>Bus Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUS__BUS_TYPE = eINSTANCE.getBus_BusType();

		/**
		 * The meta object literal for the '{@link org.tud.city.transport.citytransportinventory.impl.TrainImpl <em>Train</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.city.transport.citytransportinventory.impl.TrainImpl
		 * @see org.tud.city.transport.citytransportinventory.impl.CitytransportinventoryPackageImpl#getTrain()
		 * @generated
		 */
		EClass TRAIN = eINSTANCE.getTrain();

		/**
		 * The meta object literal for the '<em><b>Train Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAIN__TRAIN_TYPE = eINSTANCE.getTrain_TrainType();

		/**
		 * The meta object literal for the '{@link org.tud.city.transport.citytransportinventory.impl.TramImpl <em>Tram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.city.transport.citytransportinventory.impl.TramImpl
		 * @see org.tud.city.transport.citytransportinventory.impl.CitytransportinventoryPackageImpl#getTram()
		 * @generated
		 */
		EClass TRAM = eINSTANCE.getTram();

		/**
		 * The meta object literal for the '{@link org.tud.city.transport.citytransportinventory.impl.StationImpl <em>Station</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.city.transport.citytransportinventory.impl.StationImpl
		 * @see org.tud.city.transport.citytransportinventory.impl.CitytransportinventoryPackageImpl#getStation()
		 * @generated
		 */
		EClass STATION = eINSTANCE.getStation();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATION__LOCATION = eINSTANCE.getStation_Location();

		/**
		 * The meta object literal for the '<em><b>Get Station Location</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATION___GET_STATION_LOCATION = eINSTANCE.getStation__GetStationLocation();

		/**
		 * The meta object literal for the '<em><b>Get All Connections</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATION___GET_ALL_CONNECTIONS = eINSTANCE.getStation__GetAllConnections();

		/**
		 * The meta object literal for the '{@link org.tud.city.transport.citytransportinventory.impl.BusStationImpl <em>Bus Station</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.city.transport.citytransportinventory.impl.BusStationImpl
		 * @see org.tud.city.transport.citytransportinventory.impl.CitytransportinventoryPackageImpl#getBusStation()
		 * @generated
		 */
		EClass BUS_STATION = eINSTANCE.getBusStation();

		/**
		 * The meta object literal for the '{@link org.tud.city.transport.citytransportinventory.impl.TrainStationImpl <em>Train Station</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.city.transport.citytransportinventory.impl.TrainStationImpl
		 * @see org.tud.city.transport.citytransportinventory.impl.CitytransportinventoryPackageImpl#getTrainStation()
		 * @generated
		 */
		EClass TRAIN_STATION = eINSTANCE.getTrainStation();

		/**
		 * The meta object literal for the '{@link org.tud.city.transport.citytransportinventory.impl.TramStationImpl <em>Tram Station</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.city.transport.citytransportinventory.impl.TramStationImpl
		 * @see org.tud.city.transport.citytransportinventory.impl.CitytransportinventoryPackageImpl#getTramStation()
		 * @generated
		 */
		EClass TRAM_STATION = eINSTANCE.getTramStation();

		/**
		 * The meta object literal for the '{@link org.tud.city.transport.citytransportinventory.impl.RouteImpl <em>Route</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.city.transport.citytransportinventory.impl.RouteImpl
		 * @see org.tud.city.transport.citytransportinventory.impl.CitytransportinventoryPackageImpl#getRoute()
		 * @generated
		 */
		EClass ROUTE = eINSTANCE.getRoute();

		/**
		 * The meta object literal for the '<em><b>EReference0</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTE__EREFERENCE0 = eINSTANCE.getRoute_EReference0();

		/**
		 * The meta object literal for the '<em><b>Start Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROUTE__START_TIME = eINSTANCE.getRoute_StartTime();

		/**
		 * The meta object literal for the '<em><b>End Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROUTE__END_TIME = eINSTANCE.getRoute_EndTime();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROUTE__NAME = eINSTANCE.getRoute_Name();

		/**
		 * The meta object literal for the '<em><b>Assigned Vehicles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTE__ASSIGNED_VEHICLES = eINSTANCE.getRoute_AssignedVehicles();

		/**
		 * The meta object literal for the '<em><b>Get All Stations After Station</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROUTE___GET_ALL_STATIONS_AFTER_STATION = eINSTANCE.getRoute__GetAllStationsAfterStation();

		/**
		 * The meta object literal for the '<em><b>Get End Station</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROUTE___GET_END_STATION = eINSTANCE.getRoute__GetEndStation();

		/**
		 * The meta object literal for the '<em><b>Get Start Station</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROUTE___GET_START_STATION = eINSTANCE.getRoute__GetStartStation();

		/**
		 * The meta object literal for the '{@link org.tud.city.transport.citytransportinventory.impl.BusRouteImpl <em>Bus Route</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.city.transport.citytransportinventory.impl.BusRouteImpl
		 * @see org.tud.city.transport.citytransportinventory.impl.CitytransportinventoryPackageImpl#getBusRoute()
		 * @generated
		 */
		EClass BUS_ROUTE = eINSTANCE.getBusRoute();

		/**
		 * The meta object literal for the '{@link org.tud.city.transport.citytransportinventory.impl.TrainRouteImpl <em>Train Route</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.city.transport.citytransportinventory.impl.TrainRouteImpl
		 * @see org.tud.city.transport.citytransportinventory.impl.CitytransportinventoryPackageImpl#getTrainRoute()
		 * @generated
		 */
		EClass TRAIN_ROUTE = eINSTANCE.getTrainRoute();

		/**
		 * The meta object literal for the '{@link org.tud.city.transport.citytransportinventory.impl.TramRouteImpl <em>Tram Route</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.city.transport.citytransportinventory.impl.TramRouteImpl
		 * @see org.tud.city.transport.citytransportinventory.impl.CitytransportinventoryPackageImpl#getTramRoute()
		 * @generated
		 */
		EClass TRAM_ROUTE = eINSTANCE.getTramRoute();

		/**
		 * The meta object literal for the '{@link org.tud.city.transport.citytransportinventory.impl.LocationImpl <em>Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.city.transport.citytransportinventory.impl.LocationImpl
		 * @see org.tud.city.transport.citytransportinventory.impl.CitytransportinventoryPackageImpl#getLocation()
		 * @generated
		 */
		EClass LOCATION = eINSTANCE.getLocation();

		/**
		 * The meta object literal for the '<em><b>Latitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__LATITUDE = eINSTANCE.getLocation_Latitude();

		/**
		 * The meta object literal for the '<em><b>Longitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__LONGITUDE = eINSTANCE.getLocation_Longitude();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__NAME = eINSTANCE.getLocation_Name();

		/**
		 * The meta object literal for the '{@link org.tud.city.transport.citytransportinventory.Ticket <em>Ticket</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.city.transport.citytransportinventory.Ticket
		 * @see org.tud.city.transport.citytransportinventory.impl.CitytransportinventoryPackageImpl#getTicket()
		 * @generated
		 */
		EClass TICKET = eINSTANCE.getTicket();

		/**
		 * The meta object literal for the '<em><b>Getvalidity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TICKET___GETVALIDITY = eINSTANCE.getTicket__Getvalidity();

		/**
		 * The meta object literal for the '<em><b>Get Cost</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TICKET___GET_COST = eINSTANCE.getTicket__GetCost();

		/**
		 * The meta object literal for the '{@link org.tud.city.transport.citytransportinventory.impl.BusTicketImpl <em>Bus Ticket</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.city.transport.citytransportinventory.impl.BusTicketImpl
		 * @see org.tud.city.transport.citytransportinventory.impl.CitytransportinventoryPackageImpl#getBusTicket()
		 * @generated
		 */
		EClass BUS_TICKET = eINSTANCE.getBusTicket();

		/**
		 * The meta object literal for the '<em><b>Route</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUS_TICKET__ROUTE = eINSTANCE.getBusTicket_Route();

		/**
		 * The meta object literal for the '{@link org.tud.city.transport.citytransportinventory.impl.TrainTicketImpl <em>Train Ticket</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.city.transport.citytransportinventory.impl.TrainTicketImpl
		 * @see org.tud.city.transport.citytransportinventory.impl.CitytransportinventoryPackageImpl#getTrainTicket()
		 * @generated
		 */
		EClass TRAIN_TICKET = eINSTANCE.getTrainTicket();

		/**
		 * The meta object literal for the '<em><b>Route</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAIN_TICKET__ROUTE = eINSTANCE.getTrainTicket_Route();

		/**
		 * The meta object literal for the '{@link org.tud.city.transport.citytransportinventory.impl.TramTicketImpl <em>Tram Ticket</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.city.transport.citytransportinventory.impl.TramTicketImpl
		 * @see org.tud.city.transport.citytransportinventory.impl.CitytransportinventoryPackageImpl#getTramTicket()
		 * @generated
		 */
		EClass TRAM_TICKET = eINSTANCE.getTramTicket();

		/**
		 * The meta object literal for the '<em><b>Route</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAM_TICKET__ROUTE = eINSTANCE.getTramTicket_Route();

		/**
		 * The meta object literal for the '{@link org.tud.city.transport.citytransportinventory.impl.FuelImpl <em>Fuel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.city.transport.citytransportinventory.impl.FuelImpl
		 * @see org.tud.city.transport.citytransportinventory.impl.CitytransportinventoryPackageImpl#getFuel()
		 * @generated
		 */
		EClass FUEL = eINSTANCE.getFuel();

		/**
		 * The meta object literal for the '<em><b>Fuel Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUEL__FUEL_TYPE = eINSTANCE.getFuel_FuelType();

		/**
		 * The meta object literal for the '<em><b>Capacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUEL__CAPACITY = eINSTANCE.getFuel_Capacity();

		/**
		 * The meta object literal for the '{@link org.tud.city.transport.citytransportinventory.impl.PetrolImpl <em>Petrol</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.city.transport.citytransportinventory.impl.PetrolImpl
		 * @see org.tud.city.transport.citytransportinventory.impl.CitytransportinventoryPackageImpl#getPetrol()
		 * @generated
		 */
		EClass PETROL = eINSTANCE.getPetrol();

		/**
		 * The meta object literal for the '{@link org.tud.city.transport.citytransportinventory.impl.ConnectionInfrastructureImpl <em>Connection Infrastructure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.city.transport.citytransportinventory.impl.ConnectionInfrastructureImpl
		 * @see org.tud.city.transport.citytransportinventory.impl.CitytransportinventoryPackageImpl#getConnectionInfrastructure()
		 * @generated
		 */
		EClass CONNECTION_INFRASTRUCTURE = eINSTANCE.getConnectionInfrastructure();

		/**
		 * The meta object literal for the '<em><b>Next Maintanence</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION_INFRASTRUCTURE__NEXT_MAINTANENCE = eINSTANCE.getConnectionInfrastructure_NextMaintanence();

		/**
		 * The meta object literal for the '<em><b>Last Maintanence</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION_INFRASTRUCTURE__LAST_MAINTANENCE = eINSTANCE.getConnectionInfrastructure_LastMaintanence();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION_INFRASTRUCTURE__NAME = eINSTANCE.getConnectionInfrastructure_Name();

		/**
		 * The meta object literal for the '{@link org.tud.city.transport.citytransportinventory.impl.RoadImpl <em>Road</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.city.transport.citytransportinventory.impl.RoadImpl
		 * @see org.tud.city.transport.citytransportinventory.impl.CitytransportinventoryPackageImpl#getRoad()
		 * @generated
		 */
		EClass ROAD = eINSTANCE.getRoad();

		/**
		 * The meta object literal for the '{@link org.tud.city.transport.citytransportinventory.impl.RailImpl <em>Rail</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.city.transport.citytransportinventory.impl.RailImpl
		 * @see org.tud.city.transport.citytransportinventory.impl.CitytransportinventoryPackageImpl#getRail()
		 * @generated
		 */
		EClass RAIL = eINSTANCE.getRail();

		/**
		 * The meta object literal for the '{@link org.tud.city.transport.citytransportinventory.impl.TramTracksImpl <em>Tram Tracks</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.city.transport.citytransportinventory.impl.TramTracksImpl
		 * @see org.tud.city.transport.citytransportinventory.impl.CitytransportinventoryPackageImpl#getTramTracks()
		 * @generated
		 */
		EClass TRAM_TRACKS = eINSTANCE.getTramTracks();

		/**
		 * The meta object literal for the '{@link org.tud.city.transport.citytransportinventory.Maintainable <em>Maintainable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.city.transport.citytransportinventory.Maintainable
		 * @see org.tud.city.transport.citytransportinventory.impl.CitytransportinventoryPackageImpl#getMaintainable()
		 * @generated
		 */
		EClass MAINTAINABLE = eINSTANCE.getMaintainable();

		/**
		 * The meta object literal for the '<em><b>Get Last Maintenance Date</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MAINTAINABLE___GET_LAST_MAINTENANCE_DATE = eINSTANCE.getMaintainable__GetLastMaintenanceDate();

		/**
		 * The meta object literal for the '<em><b>Get Next Maintenance</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MAINTAINABLE___GET_NEXT_MAINTENANCE = eINSTANCE.getMaintainable__GetNextMaintenance();

		/**
		 * The meta object literal for the '{@link org.tud.city.transport.citytransportinventory.FuelType <em>Fuel Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.city.transport.citytransportinventory.FuelType
		 * @see org.tud.city.transport.citytransportinventory.impl.CitytransportinventoryPackageImpl#getFuelType()
		 * @generated
		 */
		EEnum FUEL_TYPE = eINSTANCE.getFuelType();

		/**
		 * The meta object literal for the '{@link org.tud.city.transport.citytransportinventory.TrainType <em>Train Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.city.transport.citytransportinventory.TrainType
		 * @see org.tud.city.transport.citytransportinventory.impl.CitytransportinventoryPackageImpl#getTrainType()
		 * @generated
		 */
		EEnum TRAIN_TYPE = eINSTANCE.getTrainType();

		/**
		 * The meta object literal for the '{@link org.tud.city.transport.citytransportinventory.BusType <em>Bus Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.city.transport.citytransportinventory.BusType
		 * @see org.tud.city.transport.citytransportinventory.impl.CitytransportinventoryPackageImpl#getBusType()
		 * @generated
		 */
		EEnum BUS_TYPE = eINSTANCE.getBusType();

	}

} //CitytransportinventoryPackage
