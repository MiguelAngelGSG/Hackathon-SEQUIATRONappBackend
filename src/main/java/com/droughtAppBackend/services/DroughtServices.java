package com.droughtAppBackend.services;
import com.droughtAppBackend.Repositories.IDroughtRepository;
import com.droughtAppBackend.models.Drought;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class DroughtServices {

    @Autowired
    IDroughtRepository iDroughtRepository;

    //read
//    public <Drought> ArrayList<Drought> getAllDrought() {
//        return (ArrayList<Drought>) iDroughtRepository.findAll();
//    }
//    public <Drought> Optional<Drought> getDroughtById(int id) {
//        return (Optional<Drought>) iDroughtRepository.findById(id);
//    }

//update
    public Drought updateDrought(Drought drought) {
        return iDroughtRepository.save(drought);
    }
}

    // CREATE
public DroughtData createData(DroughtData data) {
    return repository.save(data);
}

    // DELETE
public boolean deleteData(Long id) {
    if (repository.existsById(id)) {
        repository.deleteById(id);
        return true;
    } else {
        return false;
    }
}
}