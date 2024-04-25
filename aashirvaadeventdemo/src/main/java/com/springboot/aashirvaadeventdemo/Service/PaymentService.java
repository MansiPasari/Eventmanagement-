package com.springboot.aashirvaadeventdemo.Service;


import java.util.List;

import com.springboot.aashirvaadeventdemo.entity.Event;
import com.springboot.aashirvaadeventdemo.entity.Payment;

public interface PaymentService {
    
	 Payment createPayment(Payment payment);
	 Payment getPaymentById(int id);
	 List<Payment> getAllPayment();
	 Payment updatePayment(Payment payment);
	 void deletePayment(int id);
}
