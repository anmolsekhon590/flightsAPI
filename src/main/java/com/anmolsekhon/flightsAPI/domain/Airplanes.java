package com.anmolsekhon.flightsAPI.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import static javax.persistence.GenerationType.AUTO;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Airplanes {
    @Id
    @GeneratedValue(strategy = AUTO)
    private Long airplane_id;
    private String name;
    private Long numOfSeats;
}
