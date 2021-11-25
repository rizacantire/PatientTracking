package com.wildlifepark.PatientTracking.dataAccess;

import com.wildlifepark.PatientTracking.entities.Patient;
import com.wildlifepark.PatientTracking.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PatientDao extends JpaRepository<Patient,Integer> {
    List<Patient> getPatientByUser(User user);
}
