package com.anmolsekhon.flightsAPI;

import com.anmolsekhon.flightsAPI.domain.Airplanes;
import com.anmolsekhon.flightsAPI.domain.Flights;
import com.anmolsekhon.flightsAPI.domain.Pilot;
import com.anmolsekhon.flightsAPI.repos.PilotRepo;
import com.anmolsekhon.flightsAPI.services.FlightsService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;

@SpringBootApplication
public class FlightsApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(FlightsApiApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(FlightsService flightsService) {
        return args -> {
            flightsService.saveAirplanes(new Airplanes(null, "Boeing 737", 108L));
            flightsService.saveAirplanes(new Airplanes(null, "Boeing 747", 11L));
            flightsService.saveAirplanes(new Airplanes(null, "Airbus A350 XWB", 36L));
            flightsService.saveAirplanes(new Airplanes(null, "Comac C919", 53L));

            flightsService.savePilot(new Pilot(1L, "Anmol Sekhon"));
            flightsService.savePilot(new Pilot(2L, "Sarthak Wadhawan"));
            flightsService.savePilot(new Pilot(3L, "Lovepreet Singh Gill"));

            flightsService.saveFlights(new Flights(1L, 1200.35, "YYZ", "CAN", 23784L, null, new ArrayList<>()));
            flightsService.saveFlights(new Flights(2L, 1703.78, "YYZ", "DEL", 36535L, null, new ArrayList<>()));

            flightsService.addAirplaneToFlight(23784L, "Boeing 737");
            flightsService.addAirplaneToFlight(36535L, "Airbus A350 XWB");

            flightsService.addPilotToFlight(23784L, "Anmol Sekhon");
            flightsService.addPilotToFlight(23784L, "Sarthak Wadhawan");
            flightsService.addPilotToFlight(36535L, "Lovepreet Singh Gill");

        };
    }
}
