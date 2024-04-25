package com.springboot.aashirvaadeventdemo.entity;


import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

@Table(name ="Venue_Table")
public class Venue {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int venueId;
	
    private String venueName;
    private String venueAddress;
    private int venueCapacity;
    private String venueCity;
    private String venueState;
    
    //One venue can have many event under his or her reporting
    @OneToMany(mappedBy = "venue",cascade = CascadeType.ALL)
    private List<Event> event;
}
