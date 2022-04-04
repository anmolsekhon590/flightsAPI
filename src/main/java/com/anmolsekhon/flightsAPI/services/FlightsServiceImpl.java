package com.anmolsekhon.flightsAPI.services;

import com.anmolsekhon.flightsAPI.domain.Airplanes;
import com.anmolsekhon.flightsAPI.domain.Flights;
import com.anmolsekhon.flightsAPI.domain.Pilot;
import com.anmolsekhon.flightsAPI.repos.AirplanesRepo;
import com.anmolsekhon.flightsAPI.repos.FlightsRepo;
import com.anmolsekhon.flightsAPI.repos.PilotRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Slf4j
@Service
@Transactional
@RequiredArgsConstructor
public class FlightsServiceImpl implements FlightsService {

    private final FlightsRepo flightsRepo;
    private final AirplanesRepo airplanesRepo;
    private final PilotRepo pilotRepo;

    @Override
    public Flights saveFlights(Flights flights) {
        return flightsRepo.save(flights);
    }

    @Override
    public Airplanes saveAirplanes(Airplanes airplanes) {
        return airplanesRepo.save(airplanes);
    }

    @Override
    public Pilot savePilot(Pilot pilot) {
        return pilotRepo.save(pilot);
    }

    @Override
    public void addAirplaneToFlight(Long flightNumber, String name) {
        Flights flight = flightsRepo.getFlightByFlightNumber(flightNumber);
        Airplanes airplane = airplanesRepo.getAirplaneByName(name);

        flight.setAirplane(airplane);
    }

    @Override
    public void addPilotToFlight(Long flightNumber, String name) {
        Flights flight = flightsRepo.getFlightByFlightNumber(flightNumber);
        Pilot pilot = pilotRepo.getPilotByName(name);
        log.info("Adding Pilot: {} to Flight: {}", pilot, flight);
        flight.getPilots().add(pilot);
        log.info("Flight info after adding: {}", flight);
    }


    @Override
    public Flights getFlightByFlightNumber(Long flightNumber) {
        return flightsRepo.getFlightByFlightNumber(flightNumber);
    }

    @Override
    public List<Flights> getAllFlights() {
        log.info("Fetching all flights from database");
        return flightsRepo.findAll();
    }
}
