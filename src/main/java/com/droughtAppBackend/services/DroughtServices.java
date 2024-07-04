package com.droughtAppBackend.services;
import com.droughtAppBackend.models.DroughtApp;
import com.droughtAppBackend.Repositories.IDroughtRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class DroughtServices {

    @Autowired
    IDroughtRepository iDroughtRepository;

    //read
    public <Drought> ArrayList<Drought> getAllDrought() {
        return (ArrayList<Drought>) iDroughtRepository.findAll();
    }
    public <Drought> Optional<Drought> getDroughtById(int id) {
        return iDroughtRepository.findById(id);
    }
}
