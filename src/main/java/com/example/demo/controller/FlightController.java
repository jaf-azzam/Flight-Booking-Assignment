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
@RestController("api/v1.0/flight/")
public class FlightController {

	@Autowired
	BookingService bookingService;
	
	@Autowired
	AdminService adminService;
	
	@Autowired
	FlightService flightService;
	
	
	boolean isAdmin;
	
	
	// Mapping for testing end point
	@GetMapping
	public String testEndPoint() {
		return "Api End point working fine !";
	}
	
	
	
	// For creating a new booking
	@PostMapping("airline/register")
	public String newBooking(@RequestBody Booking booking) {
		
		bookingService.saveBooking(booking);
		return "Booking created successfully";
	}
	
	
	
	@PostMapping("admin/login")
	public String adminLogin() {
		adminService.adminLogin();
		isAdmin = true;
		return "Admin Logged In";
	}
	
	
	
	
	
	@PostMapping("airline/inventory/add")
	public String addInvetory(@RequestBody Flight flight) {
		
		if(isAdmin) {
			
			flightService.addFlight(flight);
			
			return "Flight Added Successfully";
		}
		
		return "Login as Admin to add or schedule a flight";
		
		
	}
	
	
	
	
	@GetMapping("search")
	public List<Flight> search() {
		return flightService.findAll();
	}
	
	
	
	
	
	@PostMapping("booking/{flightId}")
	public Integer bookTicket(@PathVariable int flightId, @RequestBody Booking booking) {
		
		booking.setFlight(flightId * 10 + 131);
		return bookingService.saveBooking(booking);
		
	}
	
	
	
	
	
	@GetMapping("ticket/{pnr}")
	public void getTicketFromPnr(@PathVariable int pnr) {
		bookingService.getFlight(pnr);
	}
	
	
	
	
	
	
	@GetMapping("booking/history/{email}")
	public List<Booking> getTicketHistoryBasedOnEmail(@PathVariable String email) {
		return bookingService.getFlightByEmail(email);
	}
	
	
	
	
	
	
	@DeleteMapping("booking/cancel/{pnr}")
	public String cancelTicket(@PathVariable int pnr) {
		return bookingService.cancelBooking(pnr);
	}
	
	
	
}
