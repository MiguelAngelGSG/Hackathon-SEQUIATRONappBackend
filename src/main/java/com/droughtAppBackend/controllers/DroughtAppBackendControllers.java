package com.droughtAppBackend.controllers;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

//    @GetMapping(path = "/drought")
//    public <Drought> ArrayList<Drought> getAllDrought() {
//        return (ArrayList<Drought>) droughtServices.getAllDrought();
//    }
//
//    @GetMapping(path = "/drought/{id}")
//    public <Drought> Optional<Drought> getDroughtById(@PathVariable("id")int id){
//        return (Optional<Drought>) droughtServices.getDroughtById(id);
//    }
    @PutMapping(path = "/drought")
    public Drought updateDrought(@RequestBody Drought Drought) {
        return droughtServices.updateDrought(Drought);
    }

    @PostMapping
    public ResponseEntity<DroughtData> createData(@RequestBody DroughtData data) {
        try {
            DroughtData newData = service.createData(data);
            return new ResponseEntity<>(newData, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}