package com.anmolsekhon.flightsAPI.repos;

import com.anmolsekhon.flightsAPI.domain.Flights;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlightsRepo extends JpaRepository<Flights, Long> {
    Flights getFlightByFlightNumber(Long flightNumber);
}
