package com.test.rest.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.test.rest.model.Product;
import com.test.rest.service.ConnectToDB;

public class ProductDaoImpl {
	
	public static Connection conn;
	
	public static Product getProduct(String id) throws SQLException {
		
		conn = ConnectToDB.getConnection();
		
		PreparedStatement stmt=conn.prepareStatement("select * from product where productname=?");
		stmt.setString(1, id);
		ResultSet rs=stmt.executeQuery();  
		Product product = new Product();
		
		while(rs.next())  {
		product.setProductname(rs.getString(1));  
		product.setCategory(rs.getString(2));  
		product.setQuantity(rs.getInt(3));
		product.setRegion(rs.getString(4));
		}
		conn.close();
		
		return product;  
		
	}
	
	public static Product saveProduct(Product product) throws SQLException {
		
		conn = ConnectToDB.getConnection();
		PreparedStatement stmt=conn.prepareStatement("insert into  product(productname, category, quantity, region) values(?,?,?,?)");   
		stmt.setString(1, product.getProductname());	
		stmt.setString(2, product.getCategory());	
		stmt.setInt(3, product.getQuantity());	
		stmt.setString(4, product.getRegion());	
        stmt.execute();
		return product;
		
	}
	
		

}
