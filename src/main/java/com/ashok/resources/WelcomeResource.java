package com.ashok.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * This class is exposed as Rest Resource
 * 
 * @author Ashok
 *
 */
@Path("/welcome")
public class WelcomeResource {

	public WelcomeResource() {
		System.out.println("WelcomeResource:::Constructor abc");
	}

	/**
	 * This method is used to handle GET request
	 * http://localhost:<port-num>/JAX-RS-JERSEY-APP/rest/welcome
	 * 
	 * @return String
	 */
	@GET
	public String wish() {
		return "<h1>Welcome to Restful Services...!!</h1>";
	}

}
