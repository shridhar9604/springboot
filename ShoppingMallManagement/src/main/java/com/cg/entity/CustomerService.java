package com.cg.entity;

import java.util.List;

import javax.persistence.Id;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Transactional
@Service
public class CustomerService {
	
	@Autowired
	private CustomerServiceRepository repo;
	
	public List<Customer> listAll() {
		return repo.findAll();
	}

	public Customer get(Integer id) {

		return repo.findById(id).get();
	}

	public void save(Customer customer) {
		repo.save(customer);

	}

	public void delete(Integer id) {
		repo.deleteById(id);

	}
}
