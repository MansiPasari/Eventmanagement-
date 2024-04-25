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

import com.springboot.aashirvaadeventdemo.Service.VenueService;
import com.springboot.aashirvaadeventdemo.entity.Event;
import com.springboot.aashirvaadeventdemo.entity.Venue;

import jakarta.validation.Valid;

@RestController
public class VenueController {

	@Autowired
	VenueService venueService;
	
	@PostMapping("/venue")
	public Venue saveVenue( @RequestBody Venue venue) {
		
		return venueService.createVenue(venue);
	}
	
	@GetMapping("/venue/{id}")
	public Venue getVenueById(@PathVariable("id") int id) {
		
		return venueService.getVenueByid(id);
	}
	
	@GetMapping("/venue/getAllData")
	public List<Venue> getAllEvent(){
		List<Venue> venue = venueService.getAllVenue();
		return venue;
	}
	
	@PutMapping("/venue/update/{id}")
	public Venue updateVenue(@PathVariable("id")int id, @RequestBody Venue venue) {
		venue.setVenueId(id);
		Venue updateVenue = venueService.updateVenue(venue);
		return updateVenue;
	}
	
	@DeleteMapping("/venue/delete/{id}")
	public void deleteEvent(@PathVariable int id)
	{   
		venueService.deleteVenue(id);
		System.out.println("Data deleted successfully");
	}
}
