package com.mtc.app.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.mtc.app.util.HibernateUtil;
import com.mtc.app.vo.Product;

public class ProductDAO {
	
	public Product getProductById(int id){
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		Product product = (Product)session.get(Product.class, id);
		
		return product;
	}
	
	public void addProduct(Product product){
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		Transaction transaction = session.getTransaction();
		
		transaction.begin();
		
			session.save(product);
			
		transaction.commit();
		
		session.close();
	}

}
