package com.mjgomes.javajpa.resources;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mjgomes.javajpa.entities.Product;
import com.mjgomes.javajpa.repositories.ProductRepository;

@RestController
@RequestMapping(value = "/products")
public class ProductResource {

	private ProductRepository productRepository;
	
	@GetMapping
	public ResponseEntity<List<Product>> findAll() {
		List<Product> list = productRepository.findAll();
		return ResponseEntity.ok().body(list);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Product> findById(@PathVariable Long id) {
		Product obj = productRepository.findById(id).get();
		return ResponseEntity.ok().body(obj);
	}
}