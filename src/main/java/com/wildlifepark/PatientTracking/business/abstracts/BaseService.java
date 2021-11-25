package com.wildlifepark.PatientTracking.business.abstracts;

import java.util.List;

public interface BaseService <T>{
    boolean add(T entity);
    boolean delete(T entity);
    boolean update(T entity);
    List<T> getAll();
}
