/*******************************************************************************
 * Copyright (c) 2001, 2004, 2007 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.datatools.connectivity.sqm.core.internal.ui.services;

import org.eclipse.datatools.modelbase.sql.constraints.ForeignKey;
import org.eclipse.datatools.modelbase.sql.tables.Table;

/**
 * @author ljulien
 */
public interface IForeignKeyHelperService
{
	public boolean isIdentifyingConstraint (ForeignKey constraint);
	public boolean isNonIdentifyingConstraint (ForeignKey constraint);
    public Table getTarget (ForeignKey constraint);
}
