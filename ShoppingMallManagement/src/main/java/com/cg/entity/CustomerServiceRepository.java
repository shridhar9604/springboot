package com.cg.entity;

import org.springframework.data.jpa.repository.JpaRepository;
public interface CustomerServiceRepository extends JpaRepository<Customer,Integer> 
{
	
}
