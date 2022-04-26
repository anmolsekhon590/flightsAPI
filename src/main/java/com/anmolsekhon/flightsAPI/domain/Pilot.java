package com.anmolsekhon.flightsAPI.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import static javax.persistence.GenerationType.AUTO;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Pilot {
    @Id
    @GeneratedValue(strategy = AUTO)
    private Long pilot_id;
    private String name;
}
