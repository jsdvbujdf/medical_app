package ru.project.medicineclinicapp.core.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "medical_history")
public class MedicalHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    private PatientEntity patientId;

    @Column(name = "docnumber")
    private String docnumber;

    @Column(name = "doctor")
    private String doctor;

    @Column(name = "diagnosis")
    private String diagnosis;

    @Column(name = "createdttm")
    private LocalDateTime createdttm;

    @Column(name = "modifydttm")
    private LocalDateTime modifydttm;

    @OneToOne()
    @JoinColumn(name = "medical_history")
    private MedicalHistory medicalHistory;
}
