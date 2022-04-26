package com.anmolsekhon.flightsAPI.repos;

import com.anmolsekhon.flightsAPI.domain.Pilot;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PilotRepo extends JpaRepository<Pilot, Long> {
    Pilot getPilotByName(String name);
}
