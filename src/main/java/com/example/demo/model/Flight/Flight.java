package com.example.demo.model.Flight;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Flight {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id;
	
	String date;
	String time;
	String flightFrom;
	String flightTo;
	Trip trip;
	Seats noOfSeats;
	int flightNo;
	
	
	
	
	public Flight(Integer id, String date, String time, String flightFrom, String flightTo, Trip trip, Seats noOfSeats,
			int flightNo) {
		super();
		this.id = id;
		this.date = date;
		this.time = time;
		this.flightFrom = flightFrom;
		this.flightTo = flightTo;
		this.trip = trip;
		this.noOfSeats = noOfSeats;
		this.flightNo = flightNo;
	}
	
	
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getFlightFrom() {
		return flightFrom;
	}
	public void setFlightFrom(String flightFrom) {
		this.flightFrom = flightFrom;
	}
	public String getFlightTo() {
		return flightTo;
	}
	public void setFlightTo(String flightTo) {
		this.flightTo = flightTo;
	}
	public Trip getTrip() {
		return trip;
	}
	public void setTrip(Trip trip) {
		this.trip = trip;
	}
	public Seats getNoOfSeats() {
		return noOfSeats;
	}
	public void setNoOfSeats(Seats noOfSeats) {
		this.noOfSeats = noOfSeats;
	}
	public int getFlightNo() {
		return flightNo;
	}
	public void setFlightNo(int flightNo) {
		this.flightNo = flightNo;
	}
}
