package com.example.demo.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Booking.Booking;
import com.example.demo.model.Flight.Flight;
import com.example.demo.service.AdminService;
import com.example.demo.service.BookingService;
import com.example.demo.service.FlightService;


//@RestController
@RestController("/api/v1.0/flight/")
public class FlightController {

	@Autowired
	BookingService bookingService;
	
	@Autowired
	AdminService adminService;
	
	@Autowired
	FlightService flightService;
	
	
	@GetMapping
	public String testEndPoint() {
		return "Api End point working fine !";
	}
	
	@PostMapping("airline/register")
	public void newBooking(@RequestBody Booking booking) {
		
		bookingService.saveBooking(booking);
		System.out.println("Booking created successfully");

	}
	
	
	@PostMapping("admin/login")
	public void adminLogin() {
		
		adminService.adminLogin();
	}
	
	
	@PostMapping("airline/inventory/add")
	public void addInvetory(@PathVariable int flightNo) {
		if(flightService.searchFlight(flightNo) == null) {
			flightService.addFlight();
		}
		else
			flightService.schedulFlight();
	}
	
	
	@PostMapping("flight/search")
	public List<Flight> search() {
		return flightService.findAll();
	}
	
	
	@PostMapping("booking/{flightd}")
	public void bookTicket() {
		
		bookingService.saveBooking(booking);
		
	}
	
	@GetMapping("ticket/{pnr}")
	public void getTicketFromPnr() {
		
	}
	
	@GetMapping("booking/history/{emailid}")
	public void getTicketHistoryBasedOnEmail() {
		
	}
	
	@DeleteMapping("booking/cancel/{pnr}")
	public void cancelTicket() {
		
	}
}
