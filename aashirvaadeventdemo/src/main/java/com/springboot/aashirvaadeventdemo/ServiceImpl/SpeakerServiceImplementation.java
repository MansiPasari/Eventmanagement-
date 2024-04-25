package com.springboot.aashirvaadeventdemo.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.aashirvaadeventdemo.Service.SpeakerService;
import com.springboot.aashirvaadeventdemo.entity.Order;
import com.springboot.aashirvaadeventdemo.entity.Speaker;
import com.springboot.aashirvaadeventdemo.repository.SpeakerRepository;

@Service
public class SpeakerServiceImplementation implements SpeakerService{
    
	@Autowired
	SpeakerRepository speakerRepository;
	
	@Override
	public Speaker createSpeaker(Speaker speaker) {
		// TODO Auto-generated method stub
		Speaker s1 = speakerRepository.save(speaker); 
		return s1;
	}
    
	@Override
	public Speaker updateSpeaker(Speaker speaker) {
		// TODO Auto-generated method stub
		Speaker  existingSpeaker = speakerRepository.findById(speaker.getSpeakerId()).get();
		existingSpeaker.setSpeakerName(speaker.getSpeakerName());
		existingSpeaker.setSpeakerBio(speaker.getSpeakerBio());
		
		Speaker updateSpeaker= speakerRepository.save(existingSpeaker);
		return updateSpeaker;
	}
	
	@Override
	public Speaker getSpeakerById(int id) {
		// TODO Auto-generated method stub
		Optional<Speaker> s1 = speakerRepository.findById(id);
		if(s1.isPresent()) {
			return s1.get();
		}
		return null;
	}

	@Override
	public void deleteSpeaker(int id) {
		// TODO Auto-generated method stub
		speakerRepository.deleteById(id);
	}

	@Override
	public List<Speaker> getAllSpeaker() {
		// TODO Auto-generated method stub
		return speakerRepository.findAll();
	}

	

}
