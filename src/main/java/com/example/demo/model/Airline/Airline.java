package com.example.demo.model.Airline;


import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.example.demo.model.Flight.Flight;

@Entity
public class Airline {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id;
	
	
	String airlineName;
	
	ArrayList<Flight> flightsList;
}
