package com.app.destinations.domain;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Destinations")
@Data
public class Destinations {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, unique = true)
    private String climate;

    @Column(nullable = false)
    private String country;

    @Column(nullable = false)
    private String tourist_flow;

    @Column(nullable = false)
    private String description;

    // Empty constructor (required for JPA)
    public Destinations() {}

    // Constructor with parameters
    public Destinations(Long id, String name, String country, String climate, String tourist_flow, String description) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.climate = climate;
        this.tourist_flow = tourist_flow;
        this.description = description;
    }

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getClimate() {
        return this.climate;
    }

    public void setClimate(String climate) {
        this.climate = climate;
    }

    public String getTourist_flow() {
        return this.tourist_flow;
    }

    public void setTourist_flow(String tourist_flow) {
        this.tourist_flow = tourist_flow;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

