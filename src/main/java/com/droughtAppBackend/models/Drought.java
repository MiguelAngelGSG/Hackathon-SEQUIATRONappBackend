package com.droughtappbackend.models;

import javax.persistence.*;

@Entity
@Table(name = "drought_data")
public class Drought {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String municipality;

    @Column(nullable = false)
    private String droughtCode;

    @Column(nullable = false)
    private String riverStatus;

    @Column(nullable = false)
    private String hydrologicalStatus;

    // Constructors
    public Drought() {}

    public Drought(String municipality, String droughtCode, String riverStatus, String hydrologicalStatus) {
        this.municipality = municipality;
        this.droughtCode = droughtCode;
        this.riverStatus = riverStatus;
        this.hydrologicalStatus = hydrologicalStatus;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMunicipality() {
        return municipality;
    }

    public void setMunicipality(String municipality) {
        this.municipality = municipality;
    }

    public String getDroughtCode() {
        return droughtCode;
    }

    public void setDroughtCode(String droughtCode) {
        this.droughtCode = droughtCode;
    }

    public String getRiverStatus() {
        return riverStatus;
    }

    public void setRiverStatus(String riverStatus) {
        this.riverStatus = riverStatus;
    }

    public String getHydrologicalStatus() {
        return hydrologicalStatus;
    }

    public void setHydrologicalStatus(String hydrologicalStatus) {
        this.hydrologicalStatus = hydrologicalStatus;
    }
}