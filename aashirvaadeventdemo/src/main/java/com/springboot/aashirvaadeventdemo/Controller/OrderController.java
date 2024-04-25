package com.springboot.aashirvaadeventdemo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.aashirvaadeventdemo.Service.OrderService;
import com.springboot.aashirvaadeventdemo.entity.Event;
import com.springboot.aashirvaadeventdemo.entity.Order;

@RestController
public class OrderController {
	
	@Autowired
	OrderService orderService;
	
	@PostMapping("/order")
	public Order saveOrder(@RequestBody Order order) {
		
		return orderService.createOrder(order);
	}
	
	@GetMapping("/order/{id}")
	public Order getOrderById(@PathVariable("id")int id) {
		return orderService.getEventById(id);
	}
	
	@GetMapping("/order/getAllData")
	public List<Order> getAllOrder(){
		List<Order> order = orderService.getAllOrder();
		return order;
	}
	
	@PutMapping("/order/update/{id}")
	public Order updateOrder(@PathVariable("id")int id, @RequestBody Order order) {
		order.setOrderId(id);
		Order updateOrder = orderService.updateOrder(order);
		return updateOrder;
	}
    
	@DeleteMapping("/order/delete/{id}")
	public void deleteOrder(@PathVariable int id)
	{   
		orderService.deleteOrder(id);
		System.out.println("Data deleted successfully");
	}
}
