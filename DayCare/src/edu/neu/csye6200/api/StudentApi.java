package edu.neu.csye6200.api;

import edu.neu.csye6200.api.abstractClass.AbstractStudent;
import edu.neu.csye6200.model.Student;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StudentApi extends AbstractStudent {

    public int getNumOfStudents() {
        return 0;
    }

    public List<Student> getAllStudents() {
        return new ArrayList<>();
    }

    public void addStudent(Student student) {

    }

    public void delStudent(Student student) {

    }

    public void delStudent(long studentId) {

    }

    public long getStudentId() {
        return 0;
    }

    public void setImmunizationDate(Date immunizationDate) {

    }

    public Date getImmunizationDate() {
        return null;
    }

    public void setRegistrationDate(Date registrationDate) {

    }

    public Date getRegistrationDate() {
        return null;
    }
}
