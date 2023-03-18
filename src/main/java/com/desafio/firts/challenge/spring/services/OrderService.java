package com.desafio.firts.challenge.spring.services;

import com.desafio.firts.challenge.spring.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    private ShippingService shippingService;
    public OrderService(ShippingService shippingService){
        this.shippingService = shippingService;
    }
    public double total(Order order){
        return order.getBasic() - ((order.getDiscount() / 100) * order.getBasic()) + shippingService.shipment(order);
    }
}
