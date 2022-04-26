package com.anmolsekhon.flightsAPI.controllers;

import com.anmolsekhon.flightsAPI.domain.Flights;
import com.anmolsekhon.flightsAPI.services.FlightsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/flights")
public class FlightsController {

    private final FlightsService flightsService;

    @GetMapping("{flightNumber}")
    public Flights getFlightByFlightNumber(@PathVariable Long flightNumber) {
        return flightsService.getFlightByFlightNumber(flightNumber);
    }

    @GetMapping
    public List<Flights> getAllFlights() {
        return flightsService.getAllFlights();
    }

    @PostMapping
    public void addFlight(@RequestBody Flights flight) {
        flightsService.saveFlights(flight);
    }

    @DeleteMapping("{flightNumber}")
    public void deleteFlight(@PathVariable Long flightNumber) {
        flightsService.deleteFlight(flightNumber);
    }

}
