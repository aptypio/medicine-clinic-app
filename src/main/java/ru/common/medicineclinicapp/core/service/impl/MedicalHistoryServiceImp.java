package ru.common.medicineclinicapp.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import ru.common.medicineclinicapp.core.model.entity.MedicalHistory;
import ru.common.medicineclinicapp.core.model.entity.PatientEntity;
import ru.common.medicineclinicapp.core.repository.MedicalHistoryRepository;
import ru.common.medicineclinicapp.core.service.MedicalHistoryService;

import java.util.List;

public class MedicalHistoryServiceImp implements MedicalHistoryService {

    private final MedicalHistoryRepository medicalHistoryRepository;

    @Autowired
    public MedicalHistoryServiceImp(MedicalHistoryRepository medicalHistoryRepository) {
        this.medicalHistoryRepository = medicalHistoryRepository;
    }

    @Override
    public MedicalHistory getById(Long id) {
        return medicalHistoryRepository.findById(id).orElse(null);
    }

    @Override
    public List<MedicalHistory> getAll() {
        List<MedicalHistory> medicalList = medicalHistoryRepository.findAll();
        return medicalList;
    }

    @Override
    public void delete(Long id) {
        medicalHistoryRepository.deleteById(id);
    }

    @Override
    public MedicalHistory save(MedicalHistory type) {
        return medicalHistoryRepository.save(type);
    }
}
