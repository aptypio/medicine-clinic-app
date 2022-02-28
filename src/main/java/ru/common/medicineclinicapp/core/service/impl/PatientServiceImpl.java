package ru.common.medicineclinicapp.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import ru.common.medicineclinicapp.core.model.entity.PatientEntity;
import ru.common.medicineclinicapp.core.repository.PatientRepository;
import ru.common.medicineclinicapp.core.service.PatientService;

import java.util.List;

public class PatientServiceImpl implements PatientService {

    private final PatientRepository patientRepository;

    @Autowired
    public PatientServiceImpl(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    @Override
    public PatientEntity getById(Long id) {
        return patientRepository.findById(id).orElse(null);
    }

    @Override
    public List<PatientEntity> getAll() {
        List<PatientEntity> patientsList = patientRepository.findAll();
        return patientsList;
    }

    @Override
    public void delete(Long id) {
        patientRepository.deleteById(id);
    }

    @Override
    public PatientEntity save(PatientEntity type) {
        return patientRepository.save(type);
    }
}
