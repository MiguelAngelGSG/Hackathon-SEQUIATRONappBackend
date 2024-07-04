package com.droughtAppBackend.Repositories;

import com.droughtAppBackend.models.Drought;
import org.springframework.data.repository.CrudRepository;

public interface IDroughtRepository extends CrudRepository<Drought, Integer> {
}