package com.oracle.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.oracle.demo.model.Product;
import com.oracle.demo.service.ProductService;

@RestController
public class ProductController {
	@Autowired
	ProductService productService;
	
	@PostMapping("/products")
	public String addProduct(@RequestBody Product p) {
		productService.addProduct(p);
		return "added successfully";
		
	}
	
	
	@GetMapping("/products") //read
	public List<Product> getPRoductDetails() {
		return  productService.getProducts();
		
	}
	@GetMapping("/products/{id}") //read
	public Product getPRoductDetailsbyId(@PathVariable Integer id) {
		return  productService.getPRoductDetailsbyId(id);
		
	}
	
	@DeleteMapping("/products/{id}") //read
	public String  deletePRoductDetailsbyId(@PathVariable Integer id) {
		 productService.deletePRoductDetailsbyId(id);
		 return "deleted successfully";
	}
	@PutMapping("/products/{id}/{price}") //read
	public String  updatePRoductDetailsbyId(@PathVariable Integer id,@PathVariable Double price) {
		 productService.updatePRoductDetailsbyId(id, price);
		 return "update successfully";
	}
	
}
