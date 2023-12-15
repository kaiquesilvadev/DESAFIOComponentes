package com.kaiqueDev.loja.services;

import org.springframework.stereotype.Service;

import com.kaiqueDev.loja.entities.Order;

@Service
public class ShippingService {

	public Double shipment(Order order) {

		if (order.getDasic() <= 100.00)
			return 20.00;
		else if (order.getDasic() > 100.00 && order.getDasic() <= 200.00)
			return 12.00;
		else
			return 0.00;
	}
}
