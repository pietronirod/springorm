package br.com.pietroniro.patient.test;

import br.com.pietroniro.patient.dao.PatientDao;
import br.com.pietroniro.patient.entity.Patient;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
        PatientDao patientDao = (PatientDao) ctx.getBean("patientDao");

        Patient patient = new Patient();
        patient.setId(1);
        patient.setFirstName("David");
        patient.setLastName("Pietroniro");

        patientDao.create(patient);
        System.out.println(patientDao.find(patient.getId()));
        patientDao.readAll().forEach(System.out::println);
        patientDao.delete(patient);
    }
}
