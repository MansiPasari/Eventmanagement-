package com.springboot.aashirvaadeventdemo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name ="Speaker_Table")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Speaker {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int speakerId;
	@NotBlank(message="Name Field should not be null")
    private String speakerName;
    private String speakerBio;
    
}
