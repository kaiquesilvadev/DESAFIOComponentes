package com.kaiqueDev.loja.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kaiqueDev.loja.entities.Order;

@Service
public class OrderService {

	@Autowired
	private ShippingService shippingService;
	
	public Double total(Order order) {
		double valorComDesconto = order.getDasic() - (order.getDasic() * (order.getDiscount() / 100));
		double valorFrete = shippingService.shipment(order);
		
		return valorFrete + valorComDesconto;
	}
}
