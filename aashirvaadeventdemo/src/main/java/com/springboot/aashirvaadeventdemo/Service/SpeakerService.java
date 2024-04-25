package com.springboot.aashirvaadeventdemo.Service;

import java.util.List;

import com.springboot.aashirvaadeventdemo.entity.Event;
import com.springboot.aashirvaadeventdemo.entity.Speaker;

public interface SpeakerService {

	 Speaker createSpeaker(Speaker speaker);
	 Speaker getSpeakerById(int id);
	 List<Speaker> getAllSpeaker();
	 Speaker updateSpeaker (Speaker speaker);
	 void deleteSpeaker(int id);
}
