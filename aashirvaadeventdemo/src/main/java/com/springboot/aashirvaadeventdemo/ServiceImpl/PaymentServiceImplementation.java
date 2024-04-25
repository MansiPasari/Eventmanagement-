package com.springboot.aashirvaadeventdemo.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.aashirvaadeventdemo.Service.PaymentService;
import com.springboot.aashirvaadeventdemo.entity.Order;
import com.springboot.aashirvaadeventdemo.entity.Payment;
import com.springboot.aashirvaadeventdemo.repository.PaymentRepository;


@Service
public class PaymentServiceImplementation implements PaymentService{
    
	@Autowired
	PaymentRepository paymentRepository;
	
	@Override
	public Payment createPayment(Payment payment) {
		// TODO Auto-generated method stub
		Payment p1 = paymentRepository.save(payment);
		return p1;
	}

	@Override
	public Payment getPaymentById(int id) {
		// TODO Auto-generated method stub
		Optional<Payment> p1 = paymentRepository.findById(id);
		if(p1.isPresent()) {
			return p1.get();
		}
		return null;
	}
    

	@Override
	public Payment updatePayment(Payment payment) {
		// TODO Auto-generated method stub
		Payment existingPayment = paymentRepository.findById(payment.getPaymentId()).get();
		existingPayment.setPaymentMethod(payment.getPaymentMethod());
		
		Payment updatePayment= paymentRepository.save(existingPayment);
		return updatePayment;
	}
	
	@Override
	public void deletePayment(int id) {
		// TODO Auto-generated method stub
		paymentRepository.deleteById(id);
	}

	@Override
	public List<Payment> getAllPayment() {
		// TODO Auto-generated method stub
		return paymentRepository.findAll();
	}

  
}
