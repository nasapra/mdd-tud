/**
 */
package org.tud.city.transport.citytransportinventory.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tud.city.transport.citytransportinventory.Bus;
import org.tud.city.transport.citytransportinventory.BusType;
import org.tud.city.transport.citytransportinventory.CitytransportinventoryPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bus</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tud.city.transport.citytransportinventory.impl.BusImpl#getBusType <em>Bus Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BusImpl extends VehicleImpl implements Bus {
	/**
	 * The default value of the '{@link #getBusType() <em>Bus Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusType()
	 * @generated
	 * @ordered
	 */
	protected static final BusType BUS_TYPE_EDEFAULT = BusType.LONG;

	/**
	 * The cached value of the '{@link #getBusType() <em>Bus Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusType()
	 * @generated
	 * @ordered
	 */
	protected BusType busType = BUS_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BusImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CitytransportinventoryPackage.Literals.BUS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusType getBusType() {
		return busType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBusType(BusType newBusType) {
		BusType oldBusType = busType;
		busType = newBusType == null ? BUS_TYPE_EDEFAULT : newBusType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CitytransportinventoryPackage.BUS__BUS_TYPE, oldBusType, busType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CitytransportinventoryPackage.BUS__BUS_TYPE:
				return getBusType();
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
			case CitytransportinventoryPackage.BUS__BUS_TYPE:
				setBusType((BusType)newValue);
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
			case CitytransportinventoryPackage.BUS__BUS_TYPE:
				setBusType(BUS_TYPE_EDEFAULT);
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
			case CitytransportinventoryPackage.BUS__BUS_TYPE:
				return busType != BUS_TYPE_EDEFAULT;
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
		result.append(" (busType: ");
		result.append(busType);
		result.append(')');
		return result.toString();
	}

} //BusImpl
