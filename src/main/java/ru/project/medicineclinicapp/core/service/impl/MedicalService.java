package ru.project.medicineclinicapp.core.service.impl;

import org.springframework.stereotype.Service;
import ru.project.medicineclinicapp.core.service.MedicalHistoryService;

import java.util.List;

@Service
public class MedicalService implements MedicalHistoryService {
    @Override
    public List<MedicalService> findAll() {
        return null;
    }

    @Override
    public MedicalService findById(int id) {
        return null;
    }

    @Override
    public void save(MedicalService medicalService) {

    }

    @Override
    public void delete(int id) {

    }
}
