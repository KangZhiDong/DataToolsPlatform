/**
 * <copyright>
 * </copyright>
 *
 * $Id: ProcedureType.java,v 1.3 2006/10/11 20:34:54 dpchou Exp $
 */
package org.eclipse.datatools.modelbase.dbdefinition;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Procedure Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.datatools.modelbase.dbdefinition.DatabaseDefinitionPackage#getProcedureType()
 * @model
 * @generated
 */
public final class ProcedureType extends AbstractEnumerator {
	/**
	 * The '<em><b>PROCEDURE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROCEDURE_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PROCEDURE = 0;

	/**
	 * The '<em><b>FUNCTION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FUNCTION_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FUNCTION = 1;

	/**
	 * The '<em><b>PROCEDURE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PROCEDURE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PROCEDURE
	 * @generated
	 * @ordered
	 */
	public static final ProcedureType PROCEDURE_LITERAL = new ProcedureType(PROCEDURE, "PROCEDURE", "PROCEDURE"); //$NON-NLS-1$

	/**
	 * The '<em><b>FUNCTION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FUNCTION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FUNCTION
	 * @generated
	 * @ordered
	 */
	public static final ProcedureType FUNCTION_LITERAL = new ProcedureType(FUNCTION, "FUNCTION", "FUNCTION"); //$NON-NLS-1$

	/**
	 * An array of all the '<em><b>Procedure Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ProcedureType[] VALUES_ARRAY =
		new ProcedureType[] {
			PROCEDURE_LITERAL,
			FUNCTION_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Procedure Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Procedure Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ProcedureType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ProcedureType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Procedure Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ProcedureType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ProcedureType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Procedure Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ProcedureType get(int value) {
		switch (value) {
			case PROCEDURE: return PROCEDURE_LITERAL;
			case FUNCTION: return FUNCTION_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ProcedureType(int value, String name, String literal) {
		super(value, name, literal);
	}

} //ProcedureType
