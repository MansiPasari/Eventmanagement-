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

import com.springboot.aashirvaadeventdemo.Service.SpeakerService;
import com.springboot.aashirvaadeventdemo.entity.Event;
import com.springboot.aashirvaadeventdemo.entity.Payment;
import com.springboot.aashirvaadeventdemo.entity.Speaker;

import jakarta.validation.Valid;



@RestController
public class SpeakerController {

        @Autowired
		SpeakerService speakerService;
		
		@PostMapping("/speaker")
		public Speaker saveSpeaker(@Valid @RequestBody Speaker speaker) {
			
			return speakerService.createSpeaker(speaker);
		}
		
		@GetMapping("/speaker/{id}")
		public Speaker getspeakerById(@PathVariable("id")int id) {
			return speakerService.getSpeakerById(id);
		}
		
		@GetMapping("/speaker/getAllData")
		public List<Speaker> getAllSpeaker(){
			List<Speaker> speaker = speakerService.getAllSpeaker();
			return speaker;
		}		
		
		@PutMapping("/speaker/update/{id}")
		public Speaker updateSpeaker(@PathVariable("id")int id, @RequestBody Speaker speaker) {
			speaker.setSpeakerId(id);
			Speaker updateSpeaker = speakerService.updateSpeaker(speaker);
			return updateSpeaker;
		}
		
		@DeleteMapping("/speaker/delete/{id}")
		public void deleteEvent(@PathVariable int id)
		{   
			speakerService.deleteSpeaker(id);
			System.out.println("Data deleted successfully");
		}
}
