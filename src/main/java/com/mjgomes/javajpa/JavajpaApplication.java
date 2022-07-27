package com.mjgomes.javajpa;

import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mjgomes.javajpa.entities.Client;
import com.mjgomes.javajpa.entities.Order;
import com.mjgomes.javajpa.entities.OrderItem;
import com.mjgomes.javajpa.entities.Product;
import com.mjgomes.javajpa.entities.enums.OrderStatus;
import com.mjgomes.javajpa.repositories.ClientRepository;
import com.mjgomes.javajpa.repositories.OrderItemRepository;
import com.mjgomes.javajpa.repositories.OrderRepository;
import com.mjgomes.javajpa.repositories.ProductRepository;

@SpringBootApplication
public class JavajpaApplication implements CommandLineRunner{
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); 
	
	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private ClientRepository clientRepository;
	
	@Autowired
	private OrderRepository orderRepsository;
	
	@Autowired
	private OrderItemRepository orderItemRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(JavajpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Client cli1 = new Client(null, "Alex Green", "alex@gmail.com", sdf.parse("15/03/1985"));
		
		Product p1 = new Product(null, "TV", 1000.0);
		Product p2 = new Product(null, "Mouse", 40.0);
		
		Order order = new Order(null, sdf.parse("20/04/2018"), OrderStatus.PROCESSING, cli1);
		
		OrderItem oi1 = new OrderItem(null, 1, 1000.0, p1, order);
		OrderItem oi2 = new OrderItem(null, 2, 40.0, p2, order);
		
		order.getItems().add(oi1);
		order.getItems().add(oi2);
		
		clientRepository.save(cli1);
		productRepository.saveAll(Arrays.asList(p1, p2));
		orderRepsository.save(order);
		orderItemRepository.saveAll(Arrays.asList(oi1, oi2));
	}

}
