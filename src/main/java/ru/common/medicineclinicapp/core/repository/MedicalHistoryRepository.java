package ru.common.medicineclinicapp.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.common.medicineclinicapp.core.model.entity.MedicalHistory;

public interface MedicalHistoryRepository extends JpaRepository<MedicalHistory, Long> {
}
