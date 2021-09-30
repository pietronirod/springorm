package br.com.pietroniro.patient.dao;

import br.com.pietroniro.patient.entity.Patient;

import java.util.List;

public interface PatientDao {
    void create(Patient patient);
    void update(Patient patient);
    void delete(Patient patient);
    Patient find(int id);
    List<Patient> readAll();
}
