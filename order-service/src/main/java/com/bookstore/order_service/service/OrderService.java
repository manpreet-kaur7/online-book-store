package com.bookstore.order_service.service;

import com.bookstore.order_service.entity.Order;
import java.util.List;

public interface OrderService {
    Order saveOrder(Order order);
    List<Order> getAllOrders();
    Order getOrderById(Long id);
}

