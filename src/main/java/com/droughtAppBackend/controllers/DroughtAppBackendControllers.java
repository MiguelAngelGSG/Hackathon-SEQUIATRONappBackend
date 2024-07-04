package com.droughtAppBackend.controllers;
//this is a test
import com.droughtappbackend.models.DroughtData;
import com.droughtappbackend.services.DroughtDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/drought-data")
public class DroughtDataController {

    @Autowired
    private DroughtDataService service;

    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> deleteData(@PathVariable Long id) {
        try {
            if (service.deleteData(id)) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            } else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}