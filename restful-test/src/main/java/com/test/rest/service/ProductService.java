package com.test.rest.service;

import java.sql.SQLException;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

import com.test.rest.dao.ProductDaoImpl;
import com.test.rest.model.Product;

public class ProductService {
	
	
	public static Product getProduct(String id) throws SQLException {
		return ProductDaoImpl.getProduct(id);
		
	}
	
	public static Product saveProduct(Product product) throws SQLException, JSONException {
		
		return ProductDaoImpl.saveProduct(product);
		
	}


}
