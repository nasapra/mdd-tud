/**
 */
package org.tud.city.transport.citytransportinventory.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.tud.city.transport.citytransportinventory.CitytransportinventoryPackage;
import org.tud.city.transport.citytransportinventory.Fuel;
import org.tud.city.transport.citytransportinventory.Vehicle;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vehicle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tud.city.transport.citytransportinventory.impl.VehicleImpl#getFuelStats <em>Fuel Stats</em>}</li>
 *   <li>{@link org.tud.city.transport.citytransportinventory.impl.VehicleImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.tud.city.transport.citytransportinventory.impl.VehicleImpl#getRegistration <em>Registration</em>}</li>
 *   <li>{@link org.tud.city.transport.citytransportinventory.impl.VehicleImpl#getSeatingCapacity <em>Seating Capacity</em>}</li>
 *   <li>{@link org.tud.city.transport.citytransportinventory.impl.VehicleImpl#getCycleCapacity <em>Cycle Capacity</em>}</li>
 *   <li>{@link org.tud.city.transport.citytransportinventory.impl.VehicleImpl#isPhysicallyHandicappedSupport <em>Physically Handicapped Support</em>}</li>
 *   <li>{@link org.tud.city.transport.citytransportinventory.impl.VehicleImpl#getLastMaintanance <em>Last Maintanance</em>}</li>
 *   <li>{@link org.tud.city.transport.citytransportinventory.impl.VehicleImpl#getNextMaintanence <em>Next Maintanence</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class VehicleImpl extends MinimalEObjectImpl.Container implements Vehicle {
	/**
	 * The cached value of the '{@link #getFuelStats() <em>Fuel Stats</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuelStats()
	 * @generated
	 * @ordered
	 */
	protected Fuel fuelStats;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getRegistration() <em>Registration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegistration()
	 * @generated
	 * @ordered
	 */
	protected static final String REGISTRATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRegistration() <em>Registration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegistration()
	 * @generated
	 * @ordered
	 */
	protected String registration = REGISTRATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getSeatingCapacity() <em>Seating Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeatingCapacity()
	 * @generated
	 * @ordered
	 */
	protected static final int SEATING_CAPACITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSeatingCapacity() <em>Seating Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeatingCapacity()
	 * @generated
	 * @ordered
	 */
	protected int seatingCapacity = SEATING_CAPACITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getCycleCapacity() <em>Cycle Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCycleCapacity()
	 * @generated
	 * @ordered
	 */
	protected static final int CYCLE_CAPACITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCycleCapacity() <em>Cycle Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCycleCapacity()
	 * @generated
	 * @ordered
	 */
	protected int cycleCapacity = CYCLE_CAPACITY_EDEFAULT;

	/**
	 * The default value of the '{@link #isPhysicallyHandicappedSupport() <em>Physically Handicapped Support</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPhysicallyHandicappedSupport()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PHYSICALLY_HANDICAPPED_SUPPORT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPhysicallyHandicappedSupport() <em>Physically Handicapped Support</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPhysicallyHandicappedSupport()
	 * @generated
	 * @ordered
	 */
	protected boolean physicallyHandicappedSupport = PHYSICALLY_HANDICAPPED_SUPPORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastMaintanance() <em>Last Maintanance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastMaintanance()
	 * @generated
	 * @ordered
	 */
	protected static final Date LAST_MAINTANANCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastMaintanance() <em>Last Maintanance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastMaintanance()
	 * @generated
	 * @ordered
	 */
	protected Date lastMaintanance = LAST_MAINTANANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNextMaintanence() <em>Next Maintanence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextMaintanence()
	 * @generated
	 * @ordered
	 */
	protected static final Date NEXT_MAINTANENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNextMaintanence() <em>Next Maintanence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextMaintanence()
	 * @generated
	 * @ordered
	 */
	protected Date nextMaintanence = NEXT_MAINTANENCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VehicleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CitytransportinventoryPackage.Literals.VEHICLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fuel getFuelStats() {
		return fuelStats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFuelStats(Fuel newFuelStats, NotificationChain msgs) {
		Fuel oldFuelStats = fuelStats;
		fuelStats = newFuelStats;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CitytransportinventoryPackage.VEHICLE__FUEL_STATS, oldFuelStats, newFuelStats);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFuelStats(Fuel newFuelStats) {
		if (newFuelStats != fuelStats) {
			NotificationChain msgs = null;
			if (fuelStats != null)
				msgs = ((InternalEObject)fuelStats).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CitytransportinventoryPackage.VEHICLE__FUEL_STATS, null, msgs);
			if (newFuelStats != null)
				msgs = ((InternalEObject)newFuelStats).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CitytransportinventoryPackage.VEHICLE__FUEL_STATS, null, msgs);
			msgs = basicSetFuelStats(newFuelStats, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CitytransportinventoryPackage.VEHICLE__FUEL_STATS, newFuelStats, newFuelStats));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CitytransportinventoryPackage.VEHICLE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRegistration() {
		return registration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegistration(String newRegistration) {
		String oldRegistration = registration;
		registration = newRegistration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CitytransportinventoryPackage.VEHICLE__REGISTRATION, oldRegistration, registration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSeatingCapacity() {
		return seatingCapacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeatingCapacity(int newSeatingCapacity) {
		int oldSeatingCapacity = seatingCapacity;
		seatingCapacity = newSeatingCapacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CitytransportinventoryPackage.VEHICLE__SEATING_CAPACITY, oldSeatingCapacity, seatingCapacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCycleCapacity() {
		return cycleCapacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCycleCapacity(int newCycleCapacity) {
		int oldCycleCapacity = cycleCapacity;
		cycleCapacity = newCycleCapacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CitytransportinventoryPackage.VEHICLE__CYCLE_CAPACITY, oldCycleCapacity, cycleCapacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPhysicallyHandicappedSupport() {
		return physicallyHandicappedSupport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhysicallyHandicappedSupport(boolean newPhysicallyHandicappedSupport) {
		boolean oldPhysicallyHandicappedSupport = physicallyHandicappedSupport;
		physicallyHandicappedSupport = newPhysicallyHandicappedSupport;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CitytransportinventoryPackage.VEHICLE__PHYSICALLY_HANDICAPPED_SUPPORT, oldPhysicallyHandicappedSupport, physicallyHandicappedSupport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getLastMaintanance() {
		return lastMaintanance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastMaintanance(Date newLastMaintanance) {
		Date oldLastMaintanance = lastMaintanance;
		lastMaintanance = newLastMaintanance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CitytransportinventoryPackage.VEHICLE__LAST_MAINTANANCE, oldLastMaintanance, lastMaintanance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getNextMaintanence() {
		return nextMaintanence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNextMaintanence(Date newNextMaintanence) {
		Date oldNextMaintanence = nextMaintanence;
		nextMaintanence = newNextMaintanence;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CitytransportinventoryPackage.VEHICLE__NEXT_MAINTANENCE, oldNextMaintanence, nextMaintanence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getLastMaintenanceDate() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getNextMaintenance() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CitytransportinventoryPackage.VEHICLE__FUEL_STATS:
				return basicSetFuelStats(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CitytransportinventoryPackage.VEHICLE__FUEL_STATS:
				return getFuelStats();
			case CitytransportinventoryPackage.VEHICLE__NAME:
				return getName();
			case CitytransportinventoryPackage.VEHICLE__REGISTRATION:
				return getRegistration();
			case CitytransportinventoryPackage.VEHICLE__SEATING_CAPACITY:
				return getSeatingCapacity();
			case CitytransportinventoryPackage.VEHICLE__CYCLE_CAPACITY:
				return getCycleCapacity();
			case CitytransportinventoryPackage.VEHICLE__PHYSICALLY_HANDICAPPED_SUPPORT:
				return isPhysicallyHandicappedSupport();
			case CitytransportinventoryPackage.VEHICLE__LAST_MAINTANANCE:
				return getLastMaintanance();
			case CitytransportinventoryPackage.VEHICLE__NEXT_MAINTANENCE:
				return getNextMaintanence();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CitytransportinventoryPackage.VEHICLE__FUEL_STATS:
				setFuelStats((Fuel)newValue);
				return;
			case CitytransportinventoryPackage.VEHICLE__NAME:
				setName((String)newValue);
				return;
			case CitytransportinventoryPackage.VEHICLE__REGISTRATION:
				setRegistration((String)newValue);
				return;
			case CitytransportinventoryPackage.VEHICLE__SEATING_CAPACITY:
				setSeatingCapacity((Integer)newValue);
				return;
			case CitytransportinventoryPackage.VEHICLE__CYCLE_CAPACITY:
				setCycleCapacity((Integer)newValue);
				return;
			case CitytransportinventoryPackage.VEHICLE__PHYSICALLY_HANDICAPPED_SUPPORT:
				setPhysicallyHandicappedSupport((Boolean)newValue);
				return;
			case CitytransportinventoryPackage.VEHICLE__LAST_MAINTANANCE:
				setLastMaintanance((Date)newValue);
				return;
			case CitytransportinventoryPackage.VEHICLE__NEXT_MAINTANENCE:
				setNextMaintanence((Date)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CitytransportinventoryPackage.VEHICLE__FUEL_STATS:
				setFuelStats((Fuel)null);
				return;
			case CitytransportinventoryPackage.VEHICLE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CitytransportinventoryPackage.VEHICLE__REGISTRATION:
				setRegistration(REGISTRATION_EDEFAULT);
				return;
			case CitytransportinventoryPackage.VEHICLE__SEATING_CAPACITY:
				setSeatingCapacity(SEATING_CAPACITY_EDEFAULT);
				return;
			case CitytransportinventoryPackage.VEHICLE__CYCLE_CAPACITY:
				setCycleCapacity(CYCLE_CAPACITY_EDEFAULT);
				return;
			case CitytransportinventoryPackage.VEHICLE__PHYSICALLY_HANDICAPPED_SUPPORT:
				setPhysicallyHandicappedSupport(PHYSICALLY_HANDICAPPED_SUPPORT_EDEFAULT);
				return;
			case CitytransportinventoryPackage.VEHICLE__LAST_MAINTANANCE:
				setLastMaintanance(LAST_MAINTANANCE_EDEFAULT);
				return;
			case CitytransportinventoryPackage.VEHICLE__NEXT_MAINTANENCE:
				setNextMaintanence(NEXT_MAINTANENCE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CitytransportinventoryPackage.VEHICLE__FUEL_STATS:
				return fuelStats != null;
			case CitytransportinventoryPackage.VEHICLE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CitytransportinventoryPackage.VEHICLE__REGISTRATION:
				return REGISTRATION_EDEFAULT == null ? registration != null : !REGISTRATION_EDEFAULT.equals(registration);
			case CitytransportinventoryPackage.VEHICLE__SEATING_CAPACITY:
				return seatingCapacity != SEATING_CAPACITY_EDEFAULT;
			case CitytransportinventoryPackage.VEHICLE__CYCLE_CAPACITY:
				return cycleCapacity != CYCLE_CAPACITY_EDEFAULT;
			case CitytransportinventoryPackage.VEHICLE__PHYSICALLY_HANDICAPPED_SUPPORT:
				return physicallyHandicappedSupport != PHYSICALLY_HANDICAPPED_SUPPORT_EDEFAULT;
			case CitytransportinventoryPackage.VEHICLE__LAST_MAINTANANCE:
				return LAST_MAINTANANCE_EDEFAULT == null ? lastMaintanance != null : !LAST_MAINTANANCE_EDEFAULT.equals(lastMaintanance);
			case CitytransportinventoryPackage.VEHICLE__NEXT_MAINTANENCE:
				return NEXT_MAINTANENCE_EDEFAULT == null ? nextMaintanence != null : !NEXT_MAINTANENCE_EDEFAULT.equals(nextMaintanence);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case CitytransportinventoryPackage.VEHICLE___GET_LAST_MAINTENANCE_DATE:
				getLastMaintenanceDate();
				return null;
			case CitytransportinventoryPackage.VEHICLE___GET_NEXT_MAINTENANCE:
				getNextMaintenance();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", registration: ");
		result.append(registration);
		result.append(", seatingCapacity: ");
		result.append(seatingCapacity);
		result.append(", cycleCapacity: ");
		result.append(cycleCapacity);
		result.append(", physicallyHandicappedSupport: ");
		result.append(physicallyHandicappedSupport);
		result.append(", lastMaintanance: ");
		result.append(lastMaintanance);
		result.append(", nextMaintanence: ");
		result.append(nextMaintanence);
		result.append(')');
		return result.toString();
	}

} //VehicleImpl
