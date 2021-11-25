package com.wildlifepark.PatientTracking.business.concretes;

import com.wildlifepark.PatientTracking.business.abstracts.UserService;
import com.wildlifepark.PatientTracking.dataAccess.UserDao;
import com.wildlifepark.PatientTracking.entities.Patient;
import com.wildlifepark.PatientTracking.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserManager implements UserService {
    @Autowired
    private UserDao userDao;

    public UserManager(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public boolean add(User entity) {
        this.userDao.save(entity);
        return true;
    }

    @Override
    public boolean delete(User entity) {
        this.userDao.delete(entity);
        return true;
    }

    @Override
    public boolean update(User entity) {
        this.userDao.save(entity);
        return true;
    }

    @Override
    public List<User> getAll() {
        return this.userDao.findAll();
    }

    @Override
    public List<User> getByPatient(Patient patient) {
        return this.userDao.findAllByPatients(patient);
    }
}
