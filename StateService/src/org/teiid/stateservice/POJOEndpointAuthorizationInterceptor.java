/*
 * JBoss, Home of Professional Open Source.
*
* See the LEGAL.txt file distributed with this work for information regarding copyright ownership and licensing.
*
* See the AUTHORS.txt file distributed with this work for a full listing of individual contributors.
*/
package org.teiid.stateservice;

import java.util.HashMap;
import java.util.Map;
import org.apache.cxf.interceptor.security.SimpleAuthorizingInterceptor;
 
public class POJOEndpointAuthorizationInterceptor extends SimpleAuthorizingInterceptor
{
 
   public POJOEndpointAuthorizationInterceptor()
   {
      super();
      readRoles();
   }
 
   private void readRoles()
   {
      //just an example, this might read from a configuration file or such
      Map<String, String> roles = new HashMap<String, String>();
      roles.put("GetAllStateInfo", "example-role");
      roles.put("GetStateInfo", "example-role");
      setMethodRolesMap(roles);
   }
}
