/**
 */
package org.tud.city.transport.citytransportinventory;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Train Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.tud.city.transport.citytransportinventory.CitytransportinventoryPackage#getTrainType()
 * @model
 * @generated
 */
public enum TrainType implements Enumerator {
	/**
	 * The '<em><b>RB</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RB_VALUE
	 * @generated
	 * @ordered
	 */
	RB(0, "RB", "RB"),

	/**
	 * The '<em><b>SB</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SB_VALUE
	 * @generated
	 * @ordered
	 */
	SB(1, "SB", "SB"),

	/**
	 * The '<em><b>UB</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UB_VALUE
	 * @generated
	 * @ordered
	 */
	UB(2, "UB", "UB");

	/**
	 * The '<em><b>RB</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RB</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RB
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RB_VALUE = 0;

	/**
	 * The '<em><b>SB</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SB</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SB
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SB_VALUE = 1;

	/**
	 * The '<em><b>UB</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UB</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UB
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UB_VALUE = 2;

	/**
	 * An array of all the '<em><b>Train Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TrainType[] VALUES_ARRAY =
		new TrainType[] {
			RB,
			SB,
			UB,
		};

	/**
	 * A public read-only list of all the '<em><b>Train Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TrainType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Train Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TrainType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TrainType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Train Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TrainType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TrainType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Train Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TrainType get(int value) {
		switch (value) {
			case RB_VALUE: return RB;
			case SB_VALUE: return SB;
			case UB_VALUE: return UB;
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
	private TrainType(int value, String name, String literal) {
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
	
} //TrainType
