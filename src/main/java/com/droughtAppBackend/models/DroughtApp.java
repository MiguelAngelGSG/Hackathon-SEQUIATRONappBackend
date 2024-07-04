package com.droughtAppBackend.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "drought")
public class DroughtApp {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "TITLE", nullable = false)
    private String title;

    @Column(name = "DESCRIPTION", length = 2000)
    private String description;

    public DroughtApp(String title, String description) {
        this.title = title;
        this.description = description;
    }

}