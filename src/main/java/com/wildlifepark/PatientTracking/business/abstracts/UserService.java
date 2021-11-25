package com.wildlifepark.PatientTracking.business.abstracts;

import com.wildlifepark.PatientTracking.entities.Patient;
import com.wildlifepark.PatientTracking.entities.User;

import java.util.List;

public interface UserService extends BaseService<User> {
    List<User> getByPatient(Patient patient);
}
