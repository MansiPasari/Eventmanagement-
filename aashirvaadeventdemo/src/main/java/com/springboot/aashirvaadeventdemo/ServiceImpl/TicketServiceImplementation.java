package com.springboot.aashirvaadeventdemo.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.aashirvaadeventdemo.Service.TicketService;
import com.springboot.aashirvaadeventdemo.entity.Order;
import com.springboot.aashirvaadeventdemo.entity.Ticket;
import com.springboot.aashirvaadeventdemo.repository.TicketRepository;

@Service
public class TicketServiceImplementation implements TicketService {
    
	@Autowired
	TicketRepository ticketRepository;
	
	@Override
	public Ticket createTicket(Ticket ticket) {
		// TODO Auto-generated method stub
		Ticket t1 = ticketRepository.save(ticket);
		return t1;
	}
	
	@Override
	public Ticket updateTicket(Ticket ticket) {
		// TODO Auto-generated method stub
		Ticket existingTicket = ticketRepository.findById(ticket.getTicketId()).get();
		existingTicket.setTicketPrice(ticket.getTicketPrice());
		existingTicket.setTicketSeatnumber(ticket.getTicketSeatnumber());
		
		Ticket updateTicket = ticketRepository.save(existingTicket);
		return updateTicket;
	}

	@Override
	public Ticket getTicketById(int id) {
		// TODO Auto-generated method stub
		Optional<Ticket> t1 = ticketRepository.findById(id);
		if(t1.isPresent()) {
			return t1.get();
	    }
		return null;
	}

	@Override
	public void deleteTicket(int id) {
		// TODO Auto-generated method stub
		ticketRepository.deleteById(id);
	}

	@Override
	public List<Ticket> getAllTicket() {
		// TODO Auto-generated method stub
		return ticketRepository.findAll();
	}

	

}
