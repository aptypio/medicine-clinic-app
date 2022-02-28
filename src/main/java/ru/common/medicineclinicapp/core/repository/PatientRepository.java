package ru.common.medicineclinicapp.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.common.medicineclinicapp.core.model.entity.PatientEntity;

public interface PatientRepository extends JpaRepository<PatientEntity, Long> {
}
