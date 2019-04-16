/**
 * <copyright>
 * </copyright>
 *
 * $Id: WritePermissionOption.java,v 1.3 2006/09/07 00:19:48 dpchou Exp $
 */
package org.eclipse.datatools.modelbase.sql.datatypes;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Write Permission Option</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.datatools.modelbase.sql.datatypes.SQLDataTypesPackage#getWritePermissionOption()
 * @model
 * @generated
 */
public final class WritePermissionOption extends AbstractEnumerator {
	/**
	 * The '<em><b>FS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FS_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FS = 0;

	/**
	 * The '<em><b>ADMIN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADMIN_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ADMIN = 1;

	/**
	 * The '<em><b>BLOCKED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BLOCKED_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BLOCKED = 2;

	/**
	 * The '<em><b>FS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FS
	 * @generated
	 * @ordered
	 */
	public static final WritePermissionOption FS_LITERAL = new WritePermissionOption(FS, "FS", "FS"); //$NON-NLS-1$

	/**
	 * The '<em><b>ADMIN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ADMIN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ADMIN
	 * @generated
	 * @ordered
	 */
	public static final WritePermissionOption ADMIN_LITERAL = new WritePermissionOption(ADMIN, "ADMIN", "ADMIN"); //$NON-NLS-1$

	/**
	 * The '<em><b>BLOCKED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BLOCKED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BLOCKED
	 * @generated
	 * @ordered
	 */
	public static final WritePermissionOption BLOCKED_LITERAL = new WritePermissionOption(BLOCKED, "BLOCKED", "BLOCKED"); //$NON-NLS-1$

	/**
	 * An array of all the '<em><b>Write Permission Option</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final WritePermissionOption[] VALUES_ARRAY =
		new WritePermissionOption[] {
			FS_LITERAL,
			ADMIN_LITERAL,
			BLOCKED_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Write Permission Option</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Write Permission Option</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WritePermissionOption get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			WritePermissionOption result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Write Permission Option</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WritePermissionOption getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			WritePermissionOption result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Write Permission Option</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WritePermissionOption get(int value) {
		switch (value) {
			case FS: return FS_LITERAL;
			case ADMIN: return ADMIN_LITERAL;
			case BLOCKED: return BLOCKED_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private WritePermissionOption(int value, String name, String literal) {
		super(value, name, literal);
	}

} //WritePermissionOption
