package com.kaiqueDev.loja;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.kaiqueDev.loja.entities.Order;
import com.kaiqueDev.loja.services.OrderService;

@SpringBootApplication
public class DesafioComponentesApplication implements CommandLineRunner{

	@Autowired
	private OrderService orderService;
	
	public DesafioComponentesApplication(OrderService orderService) {
		this.orderService = orderService;
	}

	public static void main(String[] args) {
		SpringApplication.run(DesafioComponentesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Order p1 = new Order(1034 , 150.00 , 20.0);
		formata(p1.getCode() , orderService.total(p1));

		
		Order p2 = new Order(2282 , 800.00 , 10.0);
		formata(p2.getCode() , orderService.total(p2));
		
		Order p3 = new Order(1309 , 95.90 , 0.0);
		formata(p3.getCode() , orderService.total(p3));
		
	}
	
	private void formata(int codigo , double total) {
		System.out.println("Pedido código " + codigo + " Valor total: " +  total);
	}
	

}
