package com.wildlifepark.PatientTracking.business.concretes;

import com.wildlifepark.PatientTracking.business.abstracts.AnimalService;
import com.wildlifepark.PatientTracking.dataAccess.AnimalDao;
import com.wildlifepark.PatientTracking.entities.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimalManager implements AnimalService {
    @Autowired
    private AnimalDao animalDao;

    public AnimalManager(AnimalDao animalDao) {
        this.animalDao = animalDao;
    }

    @Override
    public boolean add(Animal entity) {
        this.animalDao.save(entity);
        return true;
    }

    @Override
    public boolean delete(Animal entity) {
        this.animalDao.delete(entity);
        return true;
    }

    @Override
    public boolean update(Animal entity) {
        this.animalDao.save(entity);
        return true;
    }

    @Override
    public List<Animal> getAll() {
        return this.animalDao.findAll();
    }
}
