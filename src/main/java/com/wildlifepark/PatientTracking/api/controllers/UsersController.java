package com.wildlifepark.PatientTracking.api.controllers;

import com.wildlifepark.PatientTracking.business.abstracts.PatientService;
import com.wildlifepark.PatientTracking.business.abstracts.UserService;
import com.wildlifepark.PatientTracking.entities.Patient;
import com.wildlifepark.PatientTracking.entities.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/users/")
@CrossOrigin
public class UsersController {
    private UserService userService;
    private PatientService patientService;

    public UsersController(UserService userService, PatientService patientService) {
        this.userService = userService;
        this.patientService = patientService;
    }

    @PostMapping("add")
    public boolean add(@RequestBody User user){
        return this.userService.add(user);
    }


    @PostMapping("getByUser")
    public List<Patient> getByUser(User user){
        return this.patientService.findByUser(user);
    }

    @PostMapping("getByPatient")
    public List<User> getByPatient(Patient patient){

        return this.userService.getByPatient(patient);
    }

    @GetMapping("getall")
    public  List<User> getAll(){
        return this.userService.getAll();
    }



}
