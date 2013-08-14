/**
 */
package org.tud.city.transport.citytransportinventory.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.tud.city.transport.citytransportinventory.CitytransportinventoryPackage;
import org.tud.city.transport.citytransportinventory.ConnectionInfrastructure;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connection Infrastructure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tud.city.transport.citytransportinventory.impl.ConnectionInfrastructureImpl#getNextMaintanence <em>Next Maintanence</em>}</li>
 *   <li>{@link org.tud.city.transport.citytransportinventory.impl.ConnectionInfrastructureImpl#getLastMaintanence <em>Last Maintanence</em>}</li>
 *   <li>{@link org.tud.city.transport.citytransportinventory.impl.ConnectionInfrastructureImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ConnectionInfrastructureImpl extends MinimalEObjectImpl.Container implements ConnectionInfrastructure {
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
	 * The default value of the '{@link #getLastMaintanence() <em>Last Maintanence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastMaintanence()
	 * @generated
	 * @ordered
	 */
	protected static final Date LAST_MAINTANENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastMaintanence() <em>Last Maintanence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastMaintanence()
	 * @generated
	 * @ordered
	 */
	protected Date lastMaintanence = LAST_MAINTANENCE_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectionInfrastructureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CitytransportinventoryPackage.Literals.CONNECTION_INFRASTRUCTURE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CitytransportinventoryPackage.CONNECTION_INFRASTRUCTURE__NEXT_MAINTANENCE, oldNextMaintanence, nextMaintanence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getLastMaintanence() {
		return lastMaintanence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastMaintanence(Date newLastMaintanence) {
		Date oldLastMaintanence = lastMaintanence;
		lastMaintanence = newLastMaintanence;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CitytransportinventoryPackage.CONNECTION_INFRASTRUCTURE__LAST_MAINTANENCE, oldLastMaintanence, lastMaintanence));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CitytransportinventoryPackage.CONNECTION_INFRASTRUCTURE__NAME, oldName, name));
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CitytransportinventoryPackage.CONNECTION_INFRASTRUCTURE__NEXT_MAINTANENCE:
				return getNextMaintanence();
			case CitytransportinventoryPackage.CONNECTION_INFRASTRUCTURE__LAST_MAINTANENCE:
				return getLastMaintanence();
			case CitytransportinventoryPackage.CONNECTION_INFRASTRUCTURE__NAME:
				return getName();
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
			case CitytransportinventoryPackage.CONNECTION_INFRASTRUCTURE__NEXT_MAINTANENCE:
				setNextMaintanence((Date)newValue);
				return;
			case CitytransportinventoryPackage.CONNECTION_INFRASTRUCTURE__LAST_MAINTANENCE:
				setLastMaintanence((Date)newValue);
				return;
			case CitytransportinventoryPackage.CONNECTION_INFRASTRUCTURE__NAME:
				setName((String)newValue);
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
			case CitytransportinventoryPackage.CONNECTION_INFRASTRUCTURE__NEXT_MAINTANENCE:
				setNextMaintanence(NEXT_MAINTANENCE_EDEFAULT);
				return;
			case CitytransportinventoryPackage.CONNECTION_INFRASTRUCTURE__LAST_MAINTANENCE:
				setLastMaintanence(LAST_MAINTANENCE_EDEFAULT);
				return;
			case CitytransportinventoryPackage.CONNECTION_INFRASTRUCTURE__NAME:
				setName(NAME_EDEFAULT);
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
			case CitytransportinventoryPackage.CONNECTION_INFRASTRUCTURE__NEXT_MAINTANENCE:
				return NEXT_MAINTANENCE_EDEFAULT == null ? nextMaintanence != null : !NEXT_MAINTANENCE_EDEFAULT.equals(nextMaintanence);
			case CitytransportinventoryPackage.CONNECTION_INFRASTRUCTURE__LAST_MAINTANENCE:
				return LAST_MAINTANENCE_EDEFAULT == null ? lastMaintanence != null : !LAST_MAINTANENCE_EDEFAULT.equals(lastMaintanence);
			case CitytransportinventoryPackage.CONNECTION_INFRASTRUCTURE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
			case CitytransportinventoryPackage.CONNECTION_INFRASTRUCTURE___GET_LAST_MAINTENANCE_DATE:
				getLastMaintenanceDate();
				return null;
			case CitytransportinventoryPackage.CONNECTION_INFRASTRUCTURE___GET_NEXT_MAINTENANCE:
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
		result.append(" (nextMaintanence: ");
		result.append(nextMaintanence);
		result.append(", lastMaintanence: ");
		result.append(lastMaintanence);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ConnectionInfrastructureImpl
