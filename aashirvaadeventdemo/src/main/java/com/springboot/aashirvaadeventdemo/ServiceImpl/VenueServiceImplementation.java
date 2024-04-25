package com.springboot.aashirvaadeventdemo.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.aashirvaadeventdemo.Service.VenueService;
import com.springboot.aashirvaadeventdemo.entity.Order;
import com.springboot.aashirvaadeventdemo.entity.Venue;
import com.springboot.aashirvaadeventdemo.repository.VenueRepository;

@Service
public class VenueServiceImplementation implements VenueService{
    
	@Autowired
	VenueRepository venueRepository;
	
	@Override
	public Venue createVenue(Venue venue) {
		// TODO Auto-generated method stub
		Venue v1= venueRepository.save(venue);
		return v1;
	}
	
	@Override
	public Venue updateVenue(Venue venue) {
		// TODO Auto-generated method stub
		Venue existingVenue = venueRepository.findById(venue.getVenueId()).get();
		existingVenue.setVenueName(venue.getVenueName());
		existingVenue.setVenueAddress(venue.getVenueAddress());
		existingVenue.setVenueCapacity(venue.getVenueCapacity());
		
		Venue updateVenue= venueRepository.save(existingVenue);
		return updateVenue;
	}

	@Override
	public Venue getVenueByid(int id) {
		// TODO Auto-generated method stub
		Optional<Venue> v1 = venueRepository.findById(id);
		if(v1.isPresent()) {
			return v1.get();
		}
		return null;
	}

	@Override
	public void deleteVenue(int id) {
		// TODO Auto-generated method stub
		venueRepository.deleteById(id);
	}

	@Override
	public List<Venue> getAllVenue() {
		// TODO Auto-generated method stub
		return venueRepository.findAll();
	}

	

}
