package com.example.demo.model.Booking;


import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Booking {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id;
	
	private String name;
	private String emailId;
	private int noOfSeatsBooked;
	private ArrayList<String> passengerDetailList;
	private Meal meal;
	private int flightPnr;
	
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public int getNoOfSeatsBooked() {
		return noOfSeatsBooked;
	}
	public void setNoOfSeatsBooked(int noOfSeatsBooked) {
		this.noOfSeatsBooked = noOfSeatsBooked;
	}
	public ArrayList<String> getPassengerDetailList() {
		return passengerDetailList;
	}
	public void setPassengerDetailList(ArrayList<String> passengerDetailList) {
		this.passengerDetailList = passengerDetailList;
	}
	public Meal getMeal() {
		return meal;
	}
	public void setMeal(Meal meal) {
		this.meal = meal;
	}
	public int getFlight() {
		return flightPnr;
	}
	public void setFlight(int flight) {
		this.flightPnr = flight;
	}
	
}
