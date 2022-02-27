package ru.common.medicineclinicapp.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.common.medicineclinicapp.core.repository.PatientRepository;

@Service
public class PatientService {

    @Autowired
    PatientRepository patientRepository;
}
