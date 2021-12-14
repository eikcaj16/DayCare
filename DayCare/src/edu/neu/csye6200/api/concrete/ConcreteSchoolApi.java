package edu.neu.csye6200.api.concrete;

import edu.neu.csye6200.api.SchoolApi;
import edu.neu.csye6200.model.Student;

import java.util.List;

public class ConcreteSchoolApi implements SchoolApi {
    @Override
    public void rateAllTeachers() {

    }

    @Override
    public void rateTeacher(int teacherId) {

    }

    @Override
    public void assignAllStudentsAndTeachers() {

    }

    @Override
    public List<Student> findUnvaccinatedStudentsByImmNameDose(String immName, int dose) {
        return null;
    }

    @Override
    public List<Student> findUnvaccinatedStudents() {
        return null;
    }

    @Override
    public void trackStudentEnrollment() {

    }

    @Override
    public void trackStudentRegistration() {

    }
}
