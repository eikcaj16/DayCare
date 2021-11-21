package edu.neu.csye6200.model;

import java.util.List;

public class School extends AbstractSchool {
    public static List<AbstractClassroom> classrooms;

    // TODO - Arrange enums into an appropriate place
    public enum StudentStatus {
        enrolled,
        alumni
    }

    public enum ImmunizationStatus {
        noRecord,
        active,
        expired
    }

    public void trackStudentEnrollment() {
        // TODO - implement AbstractSchool.trackStudentEnrollment
        throw new UnsupportedOperationException();
    }

    public void trackStudentImmunization() {
        // TODO - implement AbstractSchool.trackStudentImmunization
        throw new UnsupportedOperationException();
    }

    public void trackStudentRegistration() {
        // TODO - implement AbstractSchool.trackStudentRegistration
        throw new UnsupportedOperationException();
    }

    public void trackAnnualEmployeeReview() {
        // TODO - implement AbstractSchool.trackAnnualEmployeeReview
        throw new UnsupportedOperationException();
    }

    public int getNumOfClassrooms() {
        return classrooms.size();
    }

    public List<AbstractClassroom> getAllClassrooms() {
        return classrooms.stream().sorted().toList();
    }

    /**
     *
     */
    public AbstractClassroom addClassroom() {
        AbstractClassroom classroom = new Classroom();
        classrooms.add(classroom);
        return classroom;
    }

    /**
     * @param classroom
     */
    public void delClassroom(Classroom classroom) {
        classrooms.remove(classroom);
    }

    /**
     * @param classroomId
     */
    public void delClassroom(int classroomId) {
        for (AbstractClassroom c : classrooms) {
            if (c.getClassroomId() == classroomId) {
                classrooms.remove(c);
                return;
            }
        }
    }

}