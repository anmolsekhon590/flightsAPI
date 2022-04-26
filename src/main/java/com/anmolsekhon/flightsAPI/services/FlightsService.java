package com.anmolsekhon.flightsAPI.services;

import com.anmolsekhon.flightsAPI.domain.Airplanes;
import com.anmolsekhon.flightsAPI.domain.Flights;
import com.anmolsekhon.flightsAPI.domain.Pilot;

import java.util.List;

public interface FlightsService {
    Flights saveFlights(Flights flights);
    Airplanes saveAirplanes(Airplanes airplanes);
    Pilot savePilot(Pilot pilot);

    void addAirplaneToFlight(Long flightNumber, String name);
    void addPilotToFlight(Long flightNumber, String name);

    Flights getFlightByFlightNumber(Long flightNumber);
    List<Flights> getAllFlights();

    void deleteFlight(Long flightNumber);
}
