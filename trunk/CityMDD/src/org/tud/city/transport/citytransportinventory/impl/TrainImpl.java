/**
 */
package org.tud.city.transport.citytransportinventory.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tud.city.transport.citytransportinventory.CitytransportinventoryPackage;
import org.tud.city.transport.citytransportinventory.Train;
import org.tud.city.transport.citytransportinventory.TrainType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Train</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tud.city.transport.citytransportinventory.impl.TrainImpl#getTrainType <em>Train Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TrainImpl extends VehicleImpl implements Train {
	/**
	 * The default value of the '{@link #getTrainType() <em>Train Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrainType()
	 * @generated
	 * @ordered
	 */
	protected static final TrainType TRAIN_TYPE_EDEFAULT = TrainType.RB;

	/**
	 * The cached value of the '{@link #getTrainType() <em>Train Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrainType()
	 * @generated
	 * @ordered
	 */
	protected TrainType trainType = TRAIN_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrainImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CitytransportinventoryPackage.Literals.TRAIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrainType getTrainType() {
		return trainType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrainType(TrainType newTrainType) {
		TrainType oldTrainType = trainType;
		trainType = newTrainType == null ? TRAIN_TYPE_EDEFAULT : newTrainType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CitytransportinventoryPackage.TRAIN__TRAIN_TYPE, oldTrainType, trainType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CitytransportinventoryPackage.TRAIN__TRAIN_TYPE:
				return getTrainType();
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
			case CitytransportinventoryPackage.TRAIN__TRAIN_TYPE:
				setTrainType((TrainType)newValue);
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
			case CitytransportinventoryPackage.TRAIN__TRAIN_TYPE:
				setTrainType(TRAIN_TYPE_EDEFAULT);
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
			case CitytransportinventoryPackage.TRAIN__TRAIN_TYPE:
				return trainType != TRAIN_TYPE_EDEFAULT;
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
		result.append(" (trainType: ");
		result.append(trainType);
		result.append(')');
		return result.toString();
	}

} //TrainImpl
