package com.droughtAppBackend.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "drought")
public class Drought {
    @Id
    @Column(nullable = false)
    private String municipality;

    @Column(nullable = false)
    private String droughtCode;

    @Column(nullable = false)
    private String riverStatus;

    @Column(nullable = false)
    private String hydrologicalStatus;

    public Drought(String municipality, String droughtCode, String riverStatus, String hydrologicalStatus) {
        this.municipality = municipality;
        this.droughtCode = droughtCode;
        this.riverStatus = riverStatus;
        this.hydrologicalStatus = hydrologicalStatus;
    }

}