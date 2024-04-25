package com.springboot.aashirvaadeventdemo.Service;


import java.util.List;

import com.springboot.aashirvaadeventdemo.entity.Event;
import com.springboot.aashirvaadeventdemo.entity.Order;

public interface OrderService {
	Order createOrder(Order order);
	Order getEventById(int id);
	List<Order> getAllOrder();
	Order updateOrder(Order order);
	void deleteOrder(int id);
}
