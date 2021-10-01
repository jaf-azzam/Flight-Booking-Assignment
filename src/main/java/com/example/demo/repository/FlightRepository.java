package com.example.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.Flight.Flight;


public interface FlightRepository extends JpaRepository<Flight, Integer> {

}
