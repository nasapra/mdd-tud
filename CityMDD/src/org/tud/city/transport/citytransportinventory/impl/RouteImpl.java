/**
 */
package org.tud.city.transport.citytransportinventory.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.tud.city.transport.citytransportinventory.CitytransportinventoryPackage;
import org.tud.city.transport.citytransportinventory.Route;
import org.tud.city.transport.citytransportinventory.Station;
import org.tud.city.transport.citytransportinventory.Vehicle;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Route</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tud.city.transport.citytransportinventory.impl.RouteImpl#getEReference0 <em>EReference0</em>}</li>
 *   <li>{@link org.tud.city.transport.citytransportinventory.impl.RouteImpl#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link org.tud.city.transport.citytransportinventory.impl.RouteImpl#getEndTime <em>End Time</em>}</li>
 *   <li>{@link org.tud.city.transport.citytransportinventory.impl.RouteImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.tud.city.transport.citytransportinventory.impl.RouteImpl#getAssignedVehicles <em>Assigned Vehicles</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class RouteImpl extends MinimalEObjectImpl.Container implements Route {
	/**
	 * The cached value of the '{@link #getEReference0() <em>EReference0</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEReference0()
	 * @generated
	 * @ordered
	 */
	protected EList<Station> eReference0;

	/**
	 * The default value of the '{@link #getStartTime() <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date START_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartTime() <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartTime()
	 * @generated
	 * @ordered
	 */
	protected Date startTime = START_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndTime() <em>End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date END_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndTime() <em>End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndTime()
	 * @generated
	 * @ordered
	 */
	protected Date endTime = END_TIME_EDEFAULT;

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
	 * The cached value of the '{@link #getAssignedVehicles() <em>Assigned Vehicles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignedVehicles()
	 * @generated
	 * @ordered
	 */
	protected EList<Vehicle> assignedVehicles;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RouteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CitytransportinventoryPackage.Literals.ROUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Station> getEReference0() {
		if (eReference0 == null) {
			eReference0 = new EObjectContainmentEList<Station>(Station.class, this, CitytransportinventoryPackage.ROUTE__EREFERENCE0);
		}
		return eReference0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getStartTime() {
		return startTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartTime(Date newStartTime) {
		Date oldStartTime = startTime;
		startTime = newStartTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CitytransportinventoryPackage.ROUTE__START_TIME, oldStartTime, startTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getEndTime() {
		return endTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndTime(Date newEndTime) {
		Date oldEndTime = endTime;
		endTime = newEndTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CitytransportinventoryPackage.ROUTE__END_TIME, oldEndTime, endTime));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CitytransportinventoryPackage.ROUTE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Vehicle> getAssignedVehicles() {
		if (assignedVehicles == null) {
			assignedVehicles = new EObjectContainmentEList<Vehicle>(Vehicle.class, this, CitytransportinventoryPackage.ROUTE__ASSIGNED_VEHICLES);
		}
		return assignedVehicles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Station getAllStationsAfterStation() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Station getEndStation() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Station getStartStation() {
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
			case CitytransportinventoryPackage.ROUTE__EREFERENCE0:
				return ((InternalEList<?>)getEReference0()).basicRemove(otherEnd, msgs);
			case CitytransportinventoryPackage.ROUTE__ASSIGNED_VEHICLES:
				return ((InternalEList<?>)getAssignedVehicles()).basicRemove(otherEnd, msgs);
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
			case CitytransportinventoryPackage.ROUTE__EREFERENCE0:
				return getEReference0();
			case CitytransportinventoryPackage.ROUTE__START_TIME:
				return getStartTime();
			case CitytransportinventoryPackage.ROUTE__END_TIME:
				return getEndTime();
			case CitytransportinventoryPackage.ROUTE__NAME:
				return getName();
			case CitytransportinventoryPackage.ROUTE__ASSIGNED_VEHICLES:
				return getAssignedVehicles();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CitytransportinventoryPackage.ROUTE__EREFERENCE0:
				getEReference0().clear();
				getEReference0().addAll((Collection<? extends Station>)newValue);
				return;
			case CitytransportinventoryPackage.ROUTE__START_TIME:
				setStartTime((Date)newValue);
				return;
			case CitytransportinventoryPackage.ROUTE__END_TIME:
				setEndTime((Date)newValue);
				return;
			case CitytransportinventoryPackage.ROUTE__NAME:
				setName((String)newValue);
				return;
			case CitytransportinventoryPackage.ROUTE__ASSIGNED_VEHICLES:
				getAssignedVehicles().clear();
				getAssignedVehicles().addAll((Collection<? extends Vehicle>)newValue);
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
			case CitytransportinventoryPackage.ROUTE__EREFERENCE0:
				getEReference0().clear();
				return;
			case CitytransportinventoryPackage.ROUTE__START_TIME:
				setStartTime(START_TIME_EDEFAULT);
				return;
			case CitytransportinventoryPackage.ROUTE__END_TIME:
				setEndTime(END_TIME_EDEFAULT);
				return;
			case CitytransportinventoryPackage.ROUTE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CitytransportinventoryPackage.ROUTE__ASSIGNED_VEHICLES:
				getAssignedVehicles().clear();
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
			case CitytransportinventoryPackage.ROUTE__EREFERENCE0:
				return eReference0 != null && !eReference0.isEmpty();
			case CitytransportinventoryPackage.ROUTE__START_TIME:
				return START_TIME_EDEFAULT == null ? startTime != null : !START_TIME_EDEFAULT.equals(startTime);
			case CitytransportinventoryPackage.ROUTE__END_TIME:
				return END_TIME_EDEFAULT == null ? endTime != null : !END_TIME_EDEFAULT.equals(endTime);
			case CitytransportinventoryPackage.ROUTE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CitytransportinventoryPackage.ROUTE__ASSIGNED_VEHICLES:
				return assignedVehicles != null && !assignedVehicles.isEmpty();
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
			case CitytransportinventoryPackage.ROUTE___GET_ALL_STATIONS_AFTER_STATION:
				return getAllStationsAfterStation();
			case CitytransportinventoryPackage.ROUTE___GET_END_STATION:
				return getEndStation();
			case CitytransportinventoryPackage.ROUTE___GET_START_STATION:
				return getStartStation();
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
		result.append(" (startTime: ");
		result.append(startTime);
		result.append(", endTime: ");
		result.append(endTime);
		result.append(", Name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //RouteImpl
