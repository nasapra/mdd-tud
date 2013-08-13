/**
 */
package org.city.city;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see org.city.city.CityFactory
 * @model kind="package"
 * @generated
 */
public interface CityPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "city";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://city/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "city";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CityPackage eINSTANCE = org.city.city.impl.CityPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.city.city.impl.VehicleImpl <em>Vehicle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.city.city.impl.VehicleImpl
	 * @see org.city.city.impl.CityPackageImpl#getVehicle()
	 * @generated
	 */
	int VEHICLE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Driver</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE__DRIVER = 1;

	/**
	 * The number of structural features of the '<em>Vehicle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Vehicle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.city.city.impl.TrainImpl <em>Train</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.city.city.impl.TrainImpl
	 * @see org.city.city.impl.CityPackageImpl#getTrain()
	 * @generated
	 */
	int TRAIN = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN__NAME = VEHICLE__NAME;

	/**
	 * The feature id for the '<em><b>Driver</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN__DRIVER = VEHICLE__DRIVER;

	/**
	 * The number of structural features of the '<em>Train</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_FEATURE_COUNT = VEHICLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Train</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_OPERATION_COUNT = VEHICLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.city.city.impl.BusImpl <em>Bus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.city.city.impl.BusImpl
	 * @see org.city.city.impl.CityPackageImpl#getBus()
	 * @generated
	 */
	int BUS = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__NAME = VEHICLE__NAME;

	/**
	 * The feature id for the '<em><b>Driver</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__DRIVER = VEHICLE__DRIVER;

	/**
	 * The number of structural features of the '<em>Bus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_FEATURE_COUNT = VEHICLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Bus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_OPERATION_COUNT = VEHICLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.city.city.impl.TramImpl <em>Tram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.city.city.impl.TramImpl
	 * @see org.city.city.impl.CityPackageImpl#getTram()
	 * @generated
	 */
	int TRAM = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAM__NAME = VEHICLE__NAME;

	/**
	 * The feature id for the '<em><b>Driver</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAM__DRIVER = VEHICLE__DRIVER;

	/**
	 * The number of structural features of the '<em>Tram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAM_FEATURE_COUNT = VEHICLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Tram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAM_OPERATION_COUNT = VEHICLE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.city.city.Vehicle <em>Vehicle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vehicle</em>'.
	 * @see org.city.city.Vehicle
	 * @generated
	 */
	EClass getVehicle();

	/**
	 * Returns the meta object for the attribute '{@link org.city.city.Vehicle#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.city.city.Vehicle#getName()
	 * @see #getVehicle()
	 * @generated
	 */
	EAttribute getVehicle_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.city.city.Vehicle#getDriver <em>Driver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Driver</em>'.
	 * @see org.city.city.Vehicle#getDriver()
	 * @see #getVehicle()
	 * @generated
	 */
	EAttribute getVehicle_Driver();

	/**
	 * Returns the meta object for class '{@link org.city.city.Train <em>Train</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Train</em>'.
	 * @see org.city.city.Train
	 * @generated
	 */
	EClass getTrain();

	/**
	 * Returns the meta object for class '{@link org.city.city.Bus <em>Bus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bus</em>'.
	 * @see org.city.city.Bus
	 * @generated
	 */
	EClass getBus();

	/**
	 * Returns the meta object for class '{@link org.city.city.Tram <em>Tram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tram</em>'.
	 * @see org.city.city.Tram
	 * @generated
	 */
	EClass getTram();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CityFactory getCityFactory();

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
		 * The meta object literal for the '{@link org.city.city.impl.VehicleImpl <em>Vehicle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.city.city.impl.VehicleImpl
		 * @see org.city.city.impl.CityPackageImpl#getVehicle()
		 * @generated
		 */
		EClass VEHICLE = eINSTANCE.getVehicle();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VEHICLE__NAME = eINSTANCE.getVehicle_Name();

		/**
		 * The meta object literal for the '<em><b>Driver</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VEHICLE__DRIVER = eINSTANCE.getVehicle_Driver();

		/**
		 * The meta object literal for the '{@link org.city.city.impl.TrainImpl <em>Train</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.city.city.impl.TrainImpl
		 * @see org.city.city.impl.CityPackageImpl#getTrain()
		 * @generated
		 */
		EClass TRAIN = eINSTANCE.getTrain();

		/**
		 * The meta object literal for the '{@link org.city.city.impl.BusImpl <em>Bus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.city.city.impl.BusImpl
		 * @see org.city.city.impl.CityPackageImpl#getBus()
		 * @generated
		 */
		EClass BUS = eINSTANCE.getBus();

		/**
		 * The meta object literal for the '{@link org.city.city.impl.TramImpl <em>Tram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.city.city.impl.TramImpl
		 * @see org.city.city.impl.CityPackageImpl#getTram()
		 * @generated
		 */
		EClass TRAM = eINSTANCE.getTram();

	}

} //CityPackage
