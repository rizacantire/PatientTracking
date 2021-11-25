package com.wildlifepark.PatientTracking.dataAccess;

import com.wildlifepark.PatientTracking.entities.Animal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnimalDao extends JpaRepository<Animal,Integer> {
}
