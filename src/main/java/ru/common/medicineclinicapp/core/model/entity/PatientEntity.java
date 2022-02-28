package ru.common.medicineclinicapp.core.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@Table(name = "patients")
public class PatientEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "gender", nullable = false)
    private Boolean gender;

    @Column(name = "age", nullable = false)
    private Integer age;

    @Column(name = "city", nullable = false)
    private String city;

    @Column(name = "adress", nullable = false)
    private String adress;

    @Column(name = "birhdayDT", nullable = false)
    private LocalDate birhdayDT;

    @Column(name = "birthPlace", nullable = false)
    private String birthPlace;

    @Column(name = "registration", nullable = false)
    private String registration;

    @Column(name = "passportSeries", nullable = false)
    private String passportSeries;

    @Column(name = "passportNumber", nullable = false)
    private String passportNumber;

    @Column(name = "phoneNumber", nullable = false)
    private String phoneNumber;

    @Column(name = "anotherDocument", nullable = false)
    private String anotherDocument;

}
