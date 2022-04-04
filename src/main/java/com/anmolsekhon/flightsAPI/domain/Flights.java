package com.anmolsekhon.flightsAPI.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import java.util.ArrayList;
import java.util.Collection;

import static javax.persistence.GenerationType.AUTO;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Flights {
    @Id
    @GeneratedValue(strategy = AUTO)
    private Long flight_id;
    private Double price;
    private String departure;
    private String destination;
    private Long flightNumber;

    @OneToOne
    @JoinColumn(name = "airplane_airplane_id")
    private Airplanes airplane = new Airplanes();
    @OneToMany(fetch = FetchType.EAGER)
    private Collection<Pilot> pilots = new ArrayList<>();
}
