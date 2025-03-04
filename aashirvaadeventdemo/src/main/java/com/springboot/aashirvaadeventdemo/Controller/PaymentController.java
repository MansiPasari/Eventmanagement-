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

import com.springboot.aashirvaadeventdemo.Service.PaymentService;
import com.springboot.aashirvaadeventdemo.entity.Event;
import com.springboot.aashirvaadeventdemo.entity.Order;
import com.springboot.aashirvaadeventdemo.entity.Payment;

import jakarta.validation.Valid;

@RestController
public class PaymentController {
    
	@Autowired
	PaymentService paymentService;
	
	@PostMapping("/payment")
	public Payment savePayment(@Valid @RequestBody Payment payment) {
		
		return paymentService.createPayment(payment);
	}
	
	@GetMapping("/payment/{id}")
	public Payment getpaymentById(@PathVariable("id")int id) {
		return paymentService.getPaymentById(id);
	}
	
	@GetMapping("/payment/getAllData")
	public List<Payment> getAllPayment(){
		List<Payment> payment = paymentService.getAllPayment();
		return payment;
	}
	
	@PutMapping("/payment/update/{id}")
	public Payment updatePayment(@PathVariable("id")int id, @RequestBody Payment payment) {
		payment.setPaymentId(id);
		Payment updatePayment = paymentService.updatePayment(payment);
		return updatePayment;
	}
	
	@DeleteMapping("/payment/delete/{id}")
	public void deleteEvent(@PathVariable int id)
	{   
		paymentService.deletePayment(id);
		System.out.println("Data deleted successfully");
	}
	
}
