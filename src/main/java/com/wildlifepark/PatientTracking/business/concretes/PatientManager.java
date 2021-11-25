package com.wildlifepark.PatientTracking.business.concretes;

import com.wildlifepark.PatientTracking.business.abstracts.PatientService;
import com.wildlifepark.PatientTracking.dataAccess.PatientDao;
import com.wildlifepark.PatientTracking.entities.Patient;
import com.wildlifepark.PatientTracking.entities.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientManager implements PatientService {
    private PatientDao patientDao;

    public PatientManager(PatientDao patientDao) {
        this.patientDao = patientDao;
    }

    @Override
    public boolean add(Patient entity) {
        this.patientDao.save(entity);
        return true;
    }

    @Override
    public boolean delete(Patient entity) {
        this.patientDao.delete(entity);
        return true;
    }

    @Override
    public boolean update(Patient entity) {
        this.patientDao.save(entity);
        return true;
    }

    @Override
    public List<Patient> getAll() {
        return this.patientDao.findAll();
    }

    @Override
    public List<Patient> findByUser(User user) {
        return this.patientDao.getPatientByUser(user);
    }
}
