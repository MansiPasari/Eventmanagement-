package com.springboot.aashirvaadeventdemo.Service;

import java.util.List;

import com.springboot.aashirvaadeventdemo.entity.Event;
import com.springboot.aashirvaadeventdemo.entity.Ticket;

public interface TicketService {
	
   Ticket createTicket(Ticket ticket);
   Ticket getTicketById(int id);
   List<Ticket> getAllTicket();
   Ticket updateTicket(Ticket ticket);
   void deleteTicket(int id);
}
