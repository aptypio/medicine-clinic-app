package ru.common.medicineclinicapp.core.service;

import java.util.List;

public interface MedicalCrudService<T> {
    T getById(Long id);

    List<T> getAll();

    T delete(Long id);

    T save(T type);
}
