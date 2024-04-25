package com.springboot.aashirvaadeventdemo.Service;

import java.util.List;

import com.springboot.aashirvaadeventdemo.entity.Event;

public interface EventService {
  
	Event createEvent(Event event);
	Event getEventById(int id);
	List<Event> getAllEvent();
	Event updateEvent(Event event);
	void deleteEvent(int id);
	
}
