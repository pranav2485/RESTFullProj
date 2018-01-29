package com.mtc.app.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.mtc.app.vo.Product;

@Path("/sampleServ")
public class SampleService {
	
	// this will return Text
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/{firstname}/{lastname}")
	public String getMessage(@PathParam("firstname") String firstname,@PathParam("lastname") String lastname){
		return "Hello "+firstname+" "+lastname+"! From RESTFull Service";
	}
	// This will Return XML
	@GET
	@Produces(MediaType.APPLICATION_XML)
	@Path("/product")
	public Product getProduct(@QueryParam("id") int id){
		return new Product(id,"S5", "Smart Phone", 400);
	}

}

 