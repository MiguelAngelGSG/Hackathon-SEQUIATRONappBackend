package com.droughtAppBackend.controllers;

import com.droughtAppBackend.models.Drought;
import com.droughtAppBackend.services.DroughtServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/")
@CrossOrigin(origins = "*")
public class DroughtAppBackendControllers {

    @Autowired
    DroughtServices droughtServices;

    @PutMapping(path = "/drought")
    public Drought updateDrought(@RequestBody Drought Drought) {
        return droughtServices.updateDrought(Drought);
    }
}