package com.droughtAppBackend.services;
import com.droughtAppBackend.Repositories.IDroughtRepository;
import com.droughtAppBackend.models.Drought;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DroughtServices {

    @Autowired
    IDroughtRepository iDroughtRepository;

    public Drought updateDrought(Drought drought) {
        return iDroughtRepository.save(drought);
    }
}