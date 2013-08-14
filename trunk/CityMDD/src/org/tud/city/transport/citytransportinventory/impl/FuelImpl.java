/**
 */
package org.tud.city.transport.citytransportinventory.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.tud.city.transport.citytransportinventory.CitytransportinventoryPackage;
import org.tud.city.transport.citytransportinventory.Fuel;
import org.tud.city.transport.citytransportinventory.FuelType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fuel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tud.city.transport.citytransportinventory.impl.FuelImpl#getFuelType <em>Fuel Type</em>}</li>
 *   <li>{@link org.tud.city.transport.citytransportinventory.impl.FuelImpl#getCapacity <em>Capacity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FuelImpl extends MinimalEObjectImpl.Container implements Fuel {
	/**
	 * The default value of the '{@link #getFuelType() <em>Fuel Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuelType()
	 * @generated
	 * @ordered
	 */
	protected static final FuelType FUEL_TYPE_EDEFAULT = FuelType.PETROL;

	/**
	 * The cached value of the '{@link #getFuelType() <em>Fuel Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuelType()
	 * @generated
	 * @ordered
	 */
	protected FuelType fuelType = FUEL_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCapacity() <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacity()
	 * @generated
	 * @ordered
	 */
	protected static final int CAPACITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCapacity() <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacity()
	 * @generated
	 * @ordered
	 */
	protected int capacity = CAPACITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FuelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CitytransportinventoryPackage.Literals.FUEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FuelType getFuelType() {
		return fuelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFuelType(FuelType newFuelType) {
		FuelType oldFuelType = fuelType;
		fuelType = newFuelType == null ? FUEL_TYPE_EDEFAULT : newFuelType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CitytransportinventoryPackage.FUEL__FUEL_TYPE, oldFuelType, fuelType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCapacity() {
		return capacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapacity(int newCapacity) {
		int oldCapacity = capacity;
		capacity = newCapacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CitytransportinventoryPackage.FUEL__CAPACITY, oldCapacity, capacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CitytransportinventoryPackage.FUEL__FUEL_TYPE:
				return getFuelType();
			case CitytransportinventoryPackage.FUEL__CAPACITY:
				return getCapacity();
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
			case CitytransportinventoryPackage.FUEL__FUEL_TYPE:
				setFuelType((FuelType)newValue);
				return;
			case CitytransportinventoryPackage.FUEL__CAPACITY:
				setCapacity((Integer)newValue);
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
			case CitytransportinventoryPackage.FUEL__FUEL_TYPE:
				setFuelType(FUEL_TYPE_EDEFAULT);
				return;
			case CitytransportinventoryPackage.FUEL__CAPACITY:
				setCapacity(CAPACITY_EDEFAULT);
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
			case CitytransportinventoryPackage.FUEL__FUEL_TYPE:
				return fuelType != FUEL_TYPE_EDEFAULT;
			case CitytransportinventoryPackage.FUEL__CAPACITY:
				return capacity != CAPACITY_EDEFAULT;
		}
		return super.eIsSet(featureID);
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
		result.append(" (fuelType: ");
		result.append(fuelType);
		result.append(", capacity: ");
		result.append(capacity);
		result.append(')');
		return result.toString();
	}

} //FuelImpl
