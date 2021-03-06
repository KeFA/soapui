/*
 *  soapUI, copyright (C) 2004-2012 smartbear.com 
 *
 *  soapUI is free software; you can redistribute it and/or modify it under the 
 *  terms of version 2.1 of the GNU Lesser General Public License as published by 
 *  the Free Software Foundation.
 *
 *  soapUI is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without 
 *  even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. 
 *  See the GNU Lesser General Public License for more details at gnu.org.
 */

package com.eviware.soapui.support.scripting;

import com.eviware.soapui.model.propertyexpansion.PropertyExpansion;
import com.eviware.soapui.support.xml.XPathData;

public interface SoapUIScriptGenerator
{
	String createContextExpansion( String name, PropertyExpansion expansion );

	String createScriptAssertionForExists( XPathData xpathData );
}
