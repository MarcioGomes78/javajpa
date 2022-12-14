package com.mjgomes.javajpa.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mjgomes.javajpa.entities.Order;
import com.mjgomes.javajpa.repositories.OrderRepository;

@RestController
@RequestMapping(value = "/orders")
public class OrderResource {

	@Autowired
	private OrderRepository repo;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Order> findById(@PathVariable Long id) {
		Order obj = repo.findById(id).get();
		return ResponseEntity.ok().body(obj);
	}
}