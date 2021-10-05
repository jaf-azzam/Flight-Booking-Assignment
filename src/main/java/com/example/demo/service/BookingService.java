package com.example.demo.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Booking.Booking;
import com.example.demo.repository.BookingRepository;


@Service
public class BookingService {

	@Autowired
	BookingRepository bookingRepo;
	
	public Integer saveBooking(Booking booking) {
		bookingRepo.save(booking);
		return booking.getFlight();
	}
	
	public Booking getFlight(int pnr) {
		
		return bookingRepo.findById(pnr).get();
	}
	
	
	public List<Booking> getFlightByEmail(String email) {
		List<Booking> bookingList =  bookingRepo.findAll();
		
		List<Booking> bookings = new ArrayList<Booking>();
		
		for(Booking booking : bookingList) {
			if(email.equals(booking.getEmailId())) {
				bookings.add(booking);
			}
		}
		
		if(bookings.size() == 0)
			System.out.println("No bookings with this email address");
		return bookings;
	}
	
	
	
	public String cancelBooking(int pnr) {
		bookingRepo.deleteById(pnr);
		
		return "Booking Cancelled Successfully !";
	}
}
