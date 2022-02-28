package ru.project.medicineclinicapp.core.model.entity;

import lombok.Data;
import ru.project.medicineclinicapp.core.model.gender.Gender;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "patient")
public class PatientEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "gender", nullable = false)
    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Column(name = "age", nullable = false)
    private Integer age;

    @Column(name = "city", nullable = false)
    private String city;

    @Column(name = "address", nullable = false)
    private String address;

    @Column(name = "birthdayDt", nullable = false)
    private LocalDate birthdayDt;

    @Column(name = "birthPlace", nullable = false)
    private String birthPlace;

    @Column(name = "registration", nullable = false)
    private String registration;

    @Column(name = "passportSeries", nullable = false)
    private Integer passportSeries;

    @Column(name = "passportNumber", nullable = false)
    private Integer passportNumber;

    @Column(name = "phoneNumber", nullable = false)
    private String phoneNumber;

    @Column(name = "anotherDocument")
    private String anotherDocument;
}
