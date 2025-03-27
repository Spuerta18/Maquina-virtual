package com.app.searches.domain;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Searches")
@Data
public class Searches {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String user_id;

    @Column(nullable = false, unique = true)
    private String destination_id;

    @Column(nullable = false)
    private String search_date;


    // Empty constructor (required for JPA)
    public Searches() {}

    // Constructor with parameters
    public Searches(Long id, String user_id, String search_date, String destination_id, String tourist_flow, String description) {
        this.id = id;
        this.user_id = user_id;
        this.search_date = search_date;
        this.destination_id = destination_id;
        
    }

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getuser_id() {
        return user_id;
    }

    public void setuser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getsearch_date() {
        return search_date;
    }

    public void setsearch_date(String search_date) {
        this.search_date = search_date;
    }

    public String getdestination_id() {
        return this.destination_id;
    }

    public void setdestination_id(String destination_id) {
        this.destination_id = destination_id;
    }
}

