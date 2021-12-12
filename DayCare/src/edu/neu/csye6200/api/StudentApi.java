package edu.neu.csye6200.api;

import edu.neu.csye6200.api.abstractClass.AbstractStudent;
import edu.neu.csye6200.api.helper.StudentHelper;
import edu.neu.csye6200.dao.StudentDao;
import edu.neu.csye6200.model.Group;
import edu.neu.csye6200.model.Student;
import edu.neu.csye6200.utils.DatabaseUtil;
import edu.neu.csye6200.utils.Utilities;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class StudentApi extends AbstractStudent {
    private StudentDao studentDao = new StudentDao();
    private static final int[] AllGroupSize = {4, 5, 6, 8, 12, 15};
    private static final int[] AllGroupNum = {3, 3, 3, 3, 2, 2};
    private static final int[] AllMinAge = {6, 13, 25, 36, 48, 60};
    private static final int[] AllMaxAge = {12, 24, 35, 47, 59, Integer.MAX_VALUE};

    @Override
    public int getNumOfStudents() {
        return 0;
    }

    @Override
    public List<Student> getAllStudents() {
        return new ArrayList<>();
    }

    @Override
    public void addStudent(Student student) throws SQLException {
//        if(student_num >= AllGroupSize[classroom_type] * AllGroupNum[classroom_type]){
//            System.out.println("The class room is full!");
//            return false;
//        }

        // Query the student info from database and cal the age
        ResultSet rs = studentDao.getStudentFromDb(student);
        Student dbStudent = StudentHelper.createStudent(rs);
        int age = 0;
        try{
            if(Objects.requireNonNull(rs).next()) {
                String birthdate = dbStudent.getDateOfBirth();
                age = Utilities.calAge(birthdate);
            }
            else{
                System.out.println("This student id not exist!");
            }
        } catch (SQLException e){
            e.printStackTrace();
        }

        //Check if the student age fit this classroom
        //TODO: migrate the logic to some other class
        if(age >= AllMinAge[0] && age <= AllMaxAge[0]){
            // Assign student to a group
            int assign_group_id = -1;
//            for(Group g: groups){
//                if(g.getNumOfStudents() < AllGroupSize[classroom_type]){
//                    g.addStudent(studentId);
//                    assign_group_id = g.getGroupId();
//                    break;
//                }
//            }

            // Add student to group

            if(assign_group_id == -1){
                System.out.println("The class room is full!");
            }

            //Update classroom id of the student in database
            //TODO: add the student to group and classroom in db
            studentDao.updateClassIdAndGroupIdForStudent(student);
            System.out.println("Add success!");
        }
        else{
            System.out.println("Student age is not fit!");
            //Throw exception
        }
    }

    @Override
    public void updateStudent(Student student) throws SQLException {
        //Get student if exists
        ResultSet rs = studentDao.getStudentFromDb(student);
        //update
        Student dbStudent = StudentHelper.createStudent(rs);
        if(dbStudent != null){
            //TODO: update dbstudent with student values
            studentDao.updateStudent(dbStudent);
        }else{
            //TODO: Add new student to db
            studentDao.addStudentToDb(student);
        }

    }

    @Override
    public void delStudent(Student student) {
        studentDao.deleteStudentFromDb(student);

    }

    @Override
    public void delStudent(long studentId) {

    }

    public void setImmunizationDate(Date immunizationDate) {

    }

    public Date getImmunizationDate(long studentId) {
        return null;
    }

    public void setRegistrationDate(Date registrationDate) {

    }

    public Date getRegistrationDate(long studentId) {
        return null;
    }
}
