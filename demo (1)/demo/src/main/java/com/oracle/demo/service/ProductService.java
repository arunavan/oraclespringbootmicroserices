package com.oracle.demo.service;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oracle.demo.dao.ProductDao;
import com.oracle.demo.model.Product;

@Service
public class ProductService {
	
	@Autowired
	ProductDao productDao;
	
	public String addProduct(Product p) {
		productDao.addProduct(p);
		return "added successfully";
		
	}
	public List<Product> getProducts(){
		return productDao.getAllProducts();
	}
	public Product getPRoductDetailsbyId(Integer id) {
		return  productDao.getPRoductDetailsbyId(id);
		
	}
public String deletePRoductDetailsbyId(Integer id) {
		
		productDao.deletePRoductDetailsbyId(id);
		return  "deleted";
		
	}
public String updatePRoductDetailsbyId(Integer id,Double price) {
	productDao.updatePRoductDetailsbyId(id, price);
	
	return  "updated";
	
}

}
