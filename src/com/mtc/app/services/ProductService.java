package com.mtc.app.services;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import com.mtc.app.dao.ProductDAO;
import com.mtc.app.vo.Product;

@Path("/productService")
public class ProductService {
			
	@Path("/addProduct")
	@POST
	public void addProductRecord(@FormParam("id")int id,@FormParam("name")String name,@FormParam("description")String description,@FormParam("price")float price){
		
		Product product = new Product(id, name, description, price);
		
		ProductDAO productDAO = new ProductDAO();
		
		productDAO.addProduct(product);
		
		System.out.println("Record added successfully");
	}

}
