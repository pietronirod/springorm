package br.com.pietroniro.patient.dao.impl;

import br.com.pietroniro.patient.dao.PatientDao;
import br.com.pietroniro.patient.entity.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component("patientDao")
public class PatientDaoImpl implements PatientDao {

    @Autowired
    private HibernateTemplate hibernateTemplate;

    @Override
    @Transactional
    public void create(Patient patient) {
        hibernateTemplate.save(patient);
    }

    @Override
    @Transactional
    public void update(Patient patient) {
        hibernateTemplate.update(patient);
    }

    @Override
    @Transactional
    public void delete(Patient patient) {
        hibernateTemplate.delete(patient);
    }

    @Override
    public Patient find(int id) {
        return hibernateTemplate.get(Patient.class, id);
    }

    @Override
    public List<Patient> readAll() {
        return hibernateTemplate.loadAll(Patient.class);
    }
}
