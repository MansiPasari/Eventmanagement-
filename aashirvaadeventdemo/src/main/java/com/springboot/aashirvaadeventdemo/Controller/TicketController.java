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

import com.springboot.aashirvaadeventdemo.Service.TicketService;
import com.springboot.aashirvaadeventdemo.entity.Event;
import com.springboot.aashirvaadeventdemo.entity.Speaker;
import com.springboot.aashirvaadeventdemo.entity.Ticket;

@RestController
public class TicketController {
      
	@Autowired
	TicketService ticketService;
	
	@PostMapping("/ticket")
	public Ticket saveTicket(@RequestBody Ticket ticket) {
		
		return ticketService.createTicket(ticket);
	}
	
	@GetMapping("/ticket/{id}")
	public Ticket getticketById(@PathVariable("id")int id) {
		return ticketService.getTicketById(id);
	}
	
	@GetMapping("/ticket/getAllData")
	public List<Ticket> getAllTicket(){
		List<Ticket> ticket = ticketService.getAllTicket();
		return ticket;
	}
	
	@PutMapping("/ticket/update/{id}")
	public Ticket updateTicket(@PathVariable("id")int id, @RequestBody Ticket ticket) {
		ticket.setTicketId(id);
		Ticket updateTicket = ticketService.updateTicket(ticket);
		return updateTicket;
	}
	
	@DeleteMapping("/ticket/delete/{id}")
	public void deleteEvent(@PathVariable int id)
	{   
		ticketService.deleteTicket(id);
		System.out.println("Data deleted successfully");
	}
}
