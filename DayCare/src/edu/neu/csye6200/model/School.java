package edu.neu.csye6200.model;

import java.io.IOException;
import java.util.List;
import static edu.neu.csye6200.utils.FileUtil.*;

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

    /**
     *
     */
    public static AbstractClassroom addClassroom() {
        AbstractClassroom classroom = new Classroom();
        classrooms.add(classroom);
        return classroom;
    }

    /**
     * @param classroom
     */
    public static void delClassroom(Classroom classroom) {
        classrooms.remove(classroom);
    }

    /**
     * @param classroomId
     */
    public static void delClassroom(int classroomId) {
        classrooms.stream().filter(c -> c.getClassroomId() == classroomId).forEach(c -> classrooms.remove(c));
    }

    public static void init() throws IOException {
        List<Student> students = readStudentFromCSV("resource/student_data.csv");
        List<Teacher> teachers = readTeacherFromCSV("resource/teachers_data.csv");

        
    }
}