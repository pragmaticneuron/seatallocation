package com.test.rest.interfaces;

import java.sql.SQLException;

import javax.ws.rs.Consumes;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

@Path("/product")
public interface ServiceResource {
	
	@GET
	@Path("/getProduct/{name}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getDetails(@FormParam("name")String productName) throws SQLException;
	
	@POST
	@Path("/createProduct")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response postJson(JSONObject postProduct) throws JSONException, SQLException;
	
	@POST
	@Path("/createProductFromForm")
	@Produces(MediaType.APPLICATION_JSON)
	public Response postFromForm(@FormParam("name") String name, @FormParam("category") String category, @FormParam("quantity") int quantity, @FormParam("region") String region) throws JSONException, SQLException;

}
