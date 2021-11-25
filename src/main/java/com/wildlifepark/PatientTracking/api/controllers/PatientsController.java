package com.wildlifepark.PatientTracking.api.controllers;

import com.wildlifepark.PatientTracking.api.controllers.abstracts.BaseController;
import com.wildlifepark.PatientTracking.business.abstracts.PatientService;
import com.wildlifepark.PatientTracking.entities.Patient;
import com.wildlifepark.PatientTracking.entities.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/patients/")
@CrossOrigin
public class PatientsController implements BaseController<Patient> {

    private PatientService patientService;

    public PatientsController(PatientService patientService) {
        this.patientService = patientService;
    }

    @Override
    @PostMapping("add")
    public boolean add(@RequestBody Patient entity) {
        return this.patientService.add(entity);
    }

    @Override
    @PostMapping("delete")
    public boolean delete(@RequestBody Patient entity) {
        return this.patientService.delete(entity);
    }

    @Override
    @PostMapping("update")
    public boolean update(@RequestBody Patient entity) {
        return this.patientService.update(entity);
    }

    @Override
    @GetMapping("getall")
    public List<Patient> getAll() {
        return this.patientService.getAll();
    }

    @PostMapping("getByUser")
    public List<Patient> getByUser(@RequestBody User user){
        return this.patientService.findByUser(user);
    }
}
