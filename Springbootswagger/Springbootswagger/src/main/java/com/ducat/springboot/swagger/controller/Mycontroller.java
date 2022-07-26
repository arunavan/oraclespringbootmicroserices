package com.ducat.springboot.swagger.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ducat.springboot.swagger.model.Myemployee;
import com.ducat.springboot.swagger.service.Myservice;

@RestController
@RequestMapping(value= "/employee")
public class Mycontroller {

	@Autowired
	Myservice service;

	@GetMapping(value= "/getall")
	public List<Myemployee> getEmployees() {
		return service.getEmployeesFromService();
	}
	@GetMapping(value= "/get/{id}")
	public Optional<Myemployee> getEmployeeById(@PathVariable(name= "id") int eid) {
		return service.getEmployeeByIdFromService(eid);
	}
	
	@PostMapping(value="/addcustomer")
	public void addCustomer() {
		System.out.println("customer added");
	}
	
}