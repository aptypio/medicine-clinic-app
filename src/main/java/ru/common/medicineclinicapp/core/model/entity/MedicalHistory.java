package ru.common.medicineclinicapp.core.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "medical_history")
public class MedicalHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    private PatientEntity patient;

    @Column(name = "docNumber", nullable = false)
    private String docNumber;

    @Column(name = "createDttm", nullable = false)
    private LocalDateTime createDttm;

    @Column(name = "modifyDttm", nullable = false)
    private LocalDateTime modifyDttm;

    @Column(name = "doctor", nullable = false)
    private String doctor;

    @Column(name = "diagnosis", nullable = false)
    private String diagnosis;

    @OneToOne
    @JoinColumn(name = "medicalHistory")
    private MedicalHistory medicalHistory;
}
