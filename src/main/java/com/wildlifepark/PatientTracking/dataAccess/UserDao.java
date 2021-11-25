package com.wildlifepark.PatientTracking.dataAccess;

import com.wildlifepark.PatientTracking.entities.Patient;
import com.wildlifepark.PatientTracking.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserDao extends JpaRepository<User,Integer> {
    List<User> findAllByPatients(Patient patient);

}
