package com.app.museums.domain;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Museums")
@Data
public class Museums {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, unique = true)
    private String destination_id;

    @Column(nullable = false)
    private String entry_price;


    // Empty constructor (required for JPA)
    public Museums() {}

    // Constructor with parameters
    public Museums(Long id, String name, String entry_price, String destination_id) {
        this.id = id;
        this.name = name;
        this.entry_price = entry_price;
        this.destination_id = destination_id;
        
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

    public String getentry_price() {
        return entry_price;
    }

    public void setentry_price(String entry_price) {
        this.entry_price = entry_price;
    }

    public String getdestination_id() {
        return this.destination_id;
    }

    public void setdestination_id(String destination_id) {
        this.destination_id = destination_id;
    }
}

