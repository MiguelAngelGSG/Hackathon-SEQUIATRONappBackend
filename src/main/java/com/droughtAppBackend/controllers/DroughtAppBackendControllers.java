package com.droughtAppBackend.controllers;

import com.droughtAppBackend.models.DroughtApp;
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

    @GetMapping(path = "/drought")
    public <Drought> ArrayList<Drought> getAllDrought() {
        return (ArrayList<Drought>) droughtServices.getAllDrought();
    }

    @GetMapping(path = "/drought/{id}")
    public <Drought> Optional<Drought> getDroughtById(@PathVariable("id")int id){
        return (Optional<Drought>) droughtServices.getDroughtById(id);
    }
}
