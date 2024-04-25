package com.springboot.aashirvaadeventdemo.Service;

import java.util.List;

import com.springboot.aashirvaadeventdemo.entity.Event;
import com.springboot.aashirvaadeventdemo.entity.Venue;

public interface VenueService {

	Venue createVenue(Venue venue);
	Venue getVenueByid(int id);
	List<Venue> getAllVenue();
	Venue updateVenue(Venue venue);
	void deleteVenue(int id);
}
