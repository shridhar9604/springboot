package com.cg.entity;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerServiceController {
	@Autowired
	private CustomerService service;

	// Retrieve All the the rows from Database
	@GetMapping("/customerservice")
	public List<Customer> list() {
		return service.listAll();

	}

//Retrieve Specific Records from Database 
	@GetMapping("/customerservice/{id}")
	public ResponseEntity<Customer> get(@PathVariable Integer id) {
		try {
			Customer customer = service.get(id);
			service.save(customer);
			return new ResponseEntity<Customer>(customer, HttpStatus.OK);
		} 
		catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	// CREATE a row in database
	@PostMapping("/customerservice")
	public void add(@RequestBody Customer customer) {
		service.save(customer);
	}

//Update Operation - record in database
	@PutMapping("/customerservice/{id}")
	public ResponseEntity<?> update(@RequestBody Customer customer, @PathVariable Integer Id) {
		try {
		Customer existcustomer=service.get(Id);
		service.save(customer);
		return new ResponseEntity<>( HttpStatus.OK);
	} 
	catch (Exception e) {
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
	}
	// Delete Operation
	@DeleteMapping("/customerservice/{id}")
	public void delete(@PathVariable Integer id) {
		service.delete(id);
	}
}
