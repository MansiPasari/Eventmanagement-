package com.springboot.aashirvaadeventdemo.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name ="Event_Table")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Event {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private int eventId;
	
	@NotBlank(message="Name Field should not be null")
    private String eventName;
    private String eventDescription;
//    private LocalDate joiningDate=LocalDate.now();
//    private LocalTime joiningTime=LocalTime.now();
    private Date eventDate;
    @Column(name="time")
    private String eventTime;
   
    //Many event can be mapped with only one Venue
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="venueId")
    
    private Venue venue;
    
}
