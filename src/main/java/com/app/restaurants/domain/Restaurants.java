package com.app.restaurants.domain;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Restaurants")
@Data
public class Restaurants {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, unique = true)
    private String destination_id;

    @Column(nullable = false)
    private String cuisine_type;

    @Column(nullable = false)
    private String average_price ;

   

    // Empty constructor (required for JPA)
    public Restaurants() {}

    // Constructor with parameters
    public Restaurants(Long id, String name, String cuisine_type, String destination_id, String average_price , String description) {
        this.id = id;
        this.name = name;
        this.cuisine_type = cuisine_type;
        this.destination_id = destination_id;
        this.average_price  = average_price ;
        
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

    public String getcuisine_type() {
        return cuisine_type;
    }

    public void setcuisine_type(String cuisine_type) {
        this.cuisine_type = cuisine_type;
    }

    public String getdestination_id() {
        return this.destination_id;
    }

    public void setdestination_id(String destination_id) {
        this.destination_id = destination_id;
    }

    public String getaverage_price () {
        return this.average_price ;
    }

    public void setaverage_price (String average_price ) {
        this.average_price  = average_price ;
    }

  
}

