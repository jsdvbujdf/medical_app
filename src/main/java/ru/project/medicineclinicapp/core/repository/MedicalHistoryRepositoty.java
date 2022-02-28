package ru.project.medicineclinicapp.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.project.medicineclinicapp.core.model.entity.MedicalHistory;

public interface MedicalHistoryRepositoty extends JpaRepository<MedicalHistory, Integer> {
}
