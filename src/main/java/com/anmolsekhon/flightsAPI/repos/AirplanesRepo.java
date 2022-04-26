package com.anmolsekhon.flightsAPI.repos;

import com.anmolsekhon.flightsAPI.domain.Airplanes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AirplanesRepo extends JpaRepository<Airplanes, Long> {
    Airplanes getAirplaneByName(String name);
}
