package com.test.rest.service;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectToDB {


	public static Connection con = null;
	public static Connection getConnection() {
		if(con == null) {
		try{  
			Class.forName("oracle.jdbc.driver.OracleDriver");  
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","webdev");  
			return con;  

		}catch(Exception e)
		
		{ System.out.println(e);}

	}  
	
	else {
		return con;
	}
		return null;
}
}