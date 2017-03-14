package com.test.rest.impl;

import java.sql.SQLException;

import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

import com.test.rest.interfaces.ServiceResource;
import com.test.rest.model.Product;
import com.test.rest.service.ProductService;

@Path("/product")
public class ServiceResourcejersey implements ServiceResource {
	

	@Override
	public Response getDetails(String productName) throws SQLException {
		Product product = ProductService.getProduct(productName);
		return Response.status(Status.OK).entity(product).build();
	}

	@Override
	public Response postJson(JSONObject postProduct) throws JSONException, SQLException {
		Product pdt = new Product();
		pdt.setProductname(postProduct.getString("name"));
		pdt.setCategory(postProduct.getString("category"));
		pdt.setQuantity(postProduct.getInt("quantity"));
		pdt.setRegion(postProduct.getString("region"));
		Product product = ProductService.saveProduct(pdt);
		return Response.status(Status.OK).entity(product).build();
	}

	@Override
	public Response postFromForm(String name, String category, int quantity,
			String region) throws JSONException, SQLException {
		Product pdt = new Product();
		pdt.setProductname(name);
		pdt.setCategory(category);
		pdt.setQuantity(quantity);
		pdt.setRegion(region);
		Product product = ProductService.saveProduct(pdt);
		return Response.status(Status.OK).entity(product).build();
	}

	

}
