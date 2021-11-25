package com.wildlifepark.PatientTracking.api.controllers;

import com.wildlifepark.PatientTracking.business.abstracts.AnimalService;
import com.wildlifepark.PatientTracking.entities.Animal;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/animals/")
@CrossOrigin
public class AnimalsController {
    private AnimalService animalService;

    public AnimalsController(AnimalService animalService) {
        this.animalService = animalService;
    }
    @GetMapping("getAll")
    public List<Animal> getAll(){
        return this.animalService.getAll();
    }


    @PostMapping("add")
    public boolean add(@RequestBody Animal animal){
        return this.animalService.add(animal);
    }

    @PostMapping("delete")
    public boolean delete(@RequestBody Animal animal){
        return this.animalService.delete(animal);
    }

    @PostMapping("update")
    public boolean update(@RequestBody Animal animal){
        return this.animalService.update(animal);
    }


}
