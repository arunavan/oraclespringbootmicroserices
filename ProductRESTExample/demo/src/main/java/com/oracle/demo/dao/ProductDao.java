package com.oracle.demo.dao;
import java.util.*;
import org.springframework.stereotype.Repository;

import com.oracle.demo.model.Product;

@Repository
public class ProductDao {
	
	
	static ArrayList<Product> plist=new ArrayList<>();
	
	static {
		plist.add(new Product(10,"bag",890.00));
		plist.add(new Product(20,"box",890.00));
		plist.add(new Product(30,"table",890.00));
		plist.add(new Product(40,"bag",890.00));
		plist.add(new Product(50,"bag",890.00));
		
	}
	
	public String addProduct(Product p) {
		plist.add(p);
		return "added successfully";
		
	}
	
	public List<Product> getAllProducts(){
		return plist;
	}

	public Product getPRoductDetailsbyId(Integer id) {
		Product p1=new Product();
		for( Product p:plist) {
			if(p.getId()==id) {
				p1.setId(p.getId());
			p1.setName(p.getName());
			p1.setPrice(p.getPrice());
			}
		}
		return  p1;
		
	}
	
	public String deletePRoductDetailsbyId(Integer id) {
		
		Iterator it=plist.iterator();
		while(it.hasNext()) {
			Product p=(Product)it.next();
			if(p.getId()==id) {
				it.remove();
			}
		}
		return  "deleted";
		
	}
public String updatePRoductDetailsbyId(Integer id,Double price) {
		
		Iterator it=plist.iterator();
		while(it.hasNext()) {
			Product p=(Product)it.next();
			if(p.getId()==id) {
				p.setPrice(price);
			}
		}
		return  "updated";
		
	}
}
