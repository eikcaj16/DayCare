package edu.neu.csye6200.model;

import edu.neu.csye6200.api.abstractClass.AbstractClassroom;
import edu.neu.csye6200.api.abstractClass.AbstractSchool;
import edu.neu.csye6200.utils.DatabaseUtil;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class School extends AbstractSchool {

    public static List<Classroom> classrooms = new ArrayList<>();

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

    @Override
    public List<Classroom> getAllClassrooms() {
        return classrooms;
    }

    @Override
    public int getNumOfClassrooms() {
        return classrooms.size();
    }

    /**
     *
     */
    public static Classroom addClassroom(int type) {
        Classroom classroom = new Classroom(type);
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

    public static void init() {
        String sql = "SELECT COUNT(*) as num FROM student";
        ResultSet rs = DatabaseUtil.getSQLResult(sql);
        int stu_size = 0;
        try{
            if(Objects.requireNonNull(rs).next()) {
                stu_size = rs.getInt("num");
                System.out.printf("There are %d student", stu_size);
            }
        } catch (SQLException e){
            e.printStackTrace();
        }

        
    }
}