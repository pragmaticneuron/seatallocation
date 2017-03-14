package com.test.rest.client;

import com.test.rest.model.Product;

public class Test {

   public static void main(String args[]) {
    Product[] product = new Product[50];
    
    testMethod(product);
    
    for(int i=0;i<product.length;i++) {
    	System.out.println(i   +"   "  +product[i].getProductname());    }
    
   }

private static void testMethod(Product[] product) {
	System.out.println(product.length);
	
}
}
