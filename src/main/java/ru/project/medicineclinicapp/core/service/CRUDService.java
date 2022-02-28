package ru.project.medicineclinicapp.core.service;

import java.util.List;

interface CRUDService<T> {
    List<T> findAll ();

    T findById(int id);

    void save(T t);

    void delete(int id);
}
