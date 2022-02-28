package ru.project.medicineclinicapp.core.service.impl;

import org.springframework.stereotype.Service;
import ru.project.medicineclinicapp.core.service.PatientHistoryService;

import java.util.List;

@Service
public class PatientService implements PatientHistoryService {
    @Override
    public List<PatientHistoryService> findAll() {
        return null;
    }

    @Override
    public PatientHistoryService findById(int id) {
        return null;
    }

    @Override
    public void save(PatientHistoryService patientHistoryService) {

    }


    @Override
    public void delete(int id) {

    }
}
