package com.example.demo.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Flight.Flight;
import com.example.demo.repository.FlightRepository;

@Service
public class FlightService {

	@Autowired
	FlightRepository flightRepo;
	
	public void addFlight() {
		
	}
	
	public void schedulFlight() {
		
	}
	
	public Flight searchFlight(int flightNo) {
		
		return flightRepo.findById(flightNo).get();
	}
	
	public List<Flight> findAll() {
		return flightRepo.findAll();
	}
}
