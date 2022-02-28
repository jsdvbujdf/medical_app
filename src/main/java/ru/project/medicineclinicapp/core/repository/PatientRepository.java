package ru.project.medicineclinicapp.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.project.medicineclinicapp.core.model.entity.PatientEntity;

public interface PatientRepository extends JpaRepository<PatientEntity, Integer> {
}
