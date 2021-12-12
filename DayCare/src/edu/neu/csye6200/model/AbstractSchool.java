package edu.neu.csye6200.model;

import java.util.*;

public abstract class AbstractSchool {

    public abstract void trackStudentEnrollment();

    public abstract void trackStudentImmunization();

    public abstract void trackStudentRegistration();

    public abstract void trackAnnualEmployeeReview();

    public abstract List<AbstractClassroom> getAllClassrooms();

    public abstract int getNumOfClassrooms();
}