/**
 */
package org.tud.city.transport.citytransportinventory;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Fuel Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.tud.city.transport.citytransportinventory.CitytransportinventoryPackage#getFuelType()
 * @model
 * @generated
 */
public enum FuelType implements Enumerator {
	/**
	 * The '<em><b>PETROL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PETROL_VALUE
	 * @generated
	 * @ordered
	 */
	PETROL(0, "PETROL", "PETROL"),

	/**
	 * The '<em><b>DIESEL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIESEL_VALUE
	 * @generated
	 * @ordered
	 */
	DIESEL(1, "DIESEL", "DIESEL"),

	/**
	 * The '<em><b>ELECTRIC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ELECTRIC_VALUE
	 * @generated
	 * @ordered
	 */
	ELECTRIC(2, "ELECTRIC", "ELECTRIC");

	/**
	 * The '<em><b>PETROL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PETROL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PETROL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PETROL_VALUE = 0;

	/**
	 * The '<em><b>DIESEL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DIESEL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DIESEL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DIESEL_VALUE = 1;

	/**
	 * The '<em><b>ELECTRIC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ELECTRIC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ELECTRIC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ELECTRIC_VALUE = 2;

	/**
	 * An array of all the '<em><b>Fuel Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final FuelType[] VALUES_ARRAY =
		new FuelType[] {
			PETROL,
			DIESEL,
			ELECTRIC,
		};

	/**
	 * A public read-only list of all the '<em><b>Fuel Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<FuelType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Fuel Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FuelType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FuelType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Fuel Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FuelType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FuelType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Fuel Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FuelType get(int value) {
		switch (value) {
			case PETROL_VALUE: return PETROL;
			case DIESEL_VALUE: return DIESEL;
			case ELECTRIC_VALUE: return ELECTRIC;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private FuelType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
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
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //FuelType
