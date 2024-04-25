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

import com.springboot.aashirvaadeventdemo.Service.EventService;
import com.springboot.aashirvaadeventdemo.entity.Event;


import jakarta.validation.Valid;

@RestController
public class EventController {
        
	    @Autowired
		EventService eventService;
		
		@PostMapping("/event")
		public Event saveEvent(@Valid @RequestBody Event event) {
			
			return eventService.createEvent(event);
			
		}
		
		@GetMapping("/event/{id}")
		public Event getEventById(@PathVariable("id")int id) {
			
			return eventService.getEventById(id);
		}
		
		@GetMapping("/event/getAllData")
		public List<Event> getAllEvent(){
			List<Event> event = eventService.getAllEvent();
			return event;
		}
		
		@PutMapping("/event/update/{id}")
		public Event updateEvent(@PathVariable("id")int id, @RequestBody Event event) {
			event.setEventId(id);
			Event updateEvent = eventService.updateEvent(event);
			return updateEvent;
		}
		
		@DeleteMapping("/event/delete/{id}")
		public void deleteEvent(@PathVariable int id)
		{   
			eventService.deleteEvent(id);
			System.out.println("Data deleted successfully");
		}
}

