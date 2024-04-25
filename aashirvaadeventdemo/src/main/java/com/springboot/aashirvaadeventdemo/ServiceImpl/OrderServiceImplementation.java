package com.springboot.aashirvaadeventdemo.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.aashirvaadeventdemo.Service.OrderService;
import com.springboot.aashirvaadeventdemo.entity.Order;
import com.springboot.aashirvaadeventdemo.repository.OrderRepository;

@Service
public class OrderServiceImplementation implements OrderService{
    
	@Autowired
	OrderRepository orderRepository;
	
	@Override
	public Order createOrder(Order order) {
		// TODO Auto-generated method stub
		Order o1 = orderRepository.save(order);
		return o1;
		
	}
	
	@Override
	public Order updateOrder(Order order) {
		// TODO Auto-generated method stub
		Order existingOrder = orderRepository.findById(order.getOrderId()).get();
		existingOrder.setOrderDate(order.getOrderDate());
		existingOrder.setOrderTotalprice(order.getOrderTotalprice());
		
		Order updateOrder= orderRepository.save(existingOrder);
		return updateOrder;
		
	}

	@Override
	public Order getEventById(int id) {
		// TODO Auto-generated method stub
		Optional<Order> o1 = orderRepository.findById(id);
		if(o1.isPresent()) {
			return o1.get();		}
		return null;
	}

	@Override
	public void deleteOrder(int id) {
		// TODO Auto-generated method stub
		orderRepository.deleteById(id);
	}

	@Override
	public List<Order> getAllOrder() {
		// TODO Auto-generated method stub
		return orderRepository.findAll();
	}

	

}
