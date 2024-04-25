package com.springboot.aashirvaadeventdemo.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.aashirvaadeventdemo.Service.EventService;
import com.springboot.aashirvaadeventdemo.entity.Event;
import com.springboot.aashirvaadeventdemo.repository.EventRepository;

@Service
public class EventServiceImplementation  implements EventService{
    @Autowired
	EventRepository eventRepository;
	
	@Override
	public Event createEvent(Event event) {
		// TODO Auto-generated method stub
		Event e1 = eventRepository.save(event);
		return e1;
	}
    
	
	@Override
	public Event updateEvent(Event event) {
		// TODO Auto-generated method stub
		
		Event existingEvent = eventRepository.findById(event.getEventId()).get();
		existingEvent.setEventName(event.getEventName());
		existingEvent.setEventDescription(event.getEventDescription());
		
		Event updateEvent= eventRepository.save(existingEvent);
		return updateEvent;
	}
  
	
	@Override
	public Event getEventById(int id) {
		// TODO Auto-generated method stub
		//null value check
		Optional<Event> e1 = eventRepository.findById(id);
		if(e1.isPresent()) {
			return e1.get();
		}
		return null;
	}

	@Override
	public void deleteEvent(int id) {
		// TODO Auto-generated method stub
		eventRepository.deleteById(id);
		
	}


	@Override
	public List<Event> getAllEvent() {
		// TODO Auto-generated method stub
		
		return eventRepository.findAll();
	}

	
	
	
}
