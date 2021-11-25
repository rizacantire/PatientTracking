package com.wildlifepark.PatientTracking.api.controllers.abstracts;

import java.util.List;

public interface BaseController<T> {
    boolean add(T entity);
    boolean delete(T entity);
    boolean update(T entity);
    List<T> getAll();
}
