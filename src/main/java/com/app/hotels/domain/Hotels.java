package com.app.hotels.domain;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Searches")
@Data
public class Hotels {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, unique = true)
    private String destination_id;

    @Column(nullable = false)
    private String average_price;


    // Empty constructor (required for JPA)
    public Hotels() {}

    // Constructor with parameters
    public Hotels(Long id, String name, String average_price, String destination_id, String tourist_flow, String description) {
        this.id = id;
        this.name = name;
        this.average_price = average_price;
        this.destination_id = destination_id;
        
    }

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getaverage_price() {
        return average_price;
    }

    public void setaverage_price(String average_price) {
        this.average_price = average_price;
    }

    public String getdestination_id() {
        return this.destination_id;
    }

    public void setdestination_id(String destination_id) {
        this.destination_id = destination_id;
    }
}

