package edu.neu.csye6200.api;

import edu.neu.csye6200.api.abstractClass.AbstractStudent;
import edu.neu.csye6200.api.helper.StudentHelper;
import edu.neu.csye6200.dao.StudentDao;
import edu.neu.csye6200.model.Student;
import edu.neu.csye6200.utils.ConvertUtil;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class StudentApi extends AbstractStudent {
    private final StudentDao studentDao = new StudentDao();
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
    public void addStudent(Student student) {

        // Query the student info from database and cal the age
        ResultSet rs = studentDao.getStudentFromDb(student);
        Student dbStudent = null;
        try{
            dbStudent = StudentHelper.createStudent(rs);
        } catch (SQLException e){
            e.printStackTrace();
        }
        int age = 0;
        try{
            if(Objects.requireNonNull(rs).next()) {
                String birthdate = "";
                try {
                    birthdate = dbStudent.getDateOfBirth();
                } catch (NullPointerException e){
                    e.printStackTrace();
                }
                age = ConvertUtil.calAge(birthdate);
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
//            studentDao.updateClassIdAndGroupIdForStudent(student);
            System.out.println("Add success!");
        }
        else{
            System.out.println("Student age is not fit!");

        }
    }

    @Override
    public void updateStudent(Student student){
        // Get student data if exists from database
        ResultSet rs = studentDao.getStudentFromDb(student);
        // create student object from data
        Student dbStudent = null;
        try{
        dbStudent = StudentHelper.createStudent(rs);
        } catch (SQLException e){
            e.printStackTrace();
        }


        if(dbStudent != null){
            // update the data in the database
            studentDao.updateStudent(dbStudent);
        }else{
            // create a new student
            studentDao.addStudentToDb(student);
        }
    }

    @Override
    public void deleteStudent(Student student) {
        // Deleting student using student obj from database
        studentDao.deleteStudentFromDb(student);
    }

    @Override
    public void deleteStudent(long studentId) {
        // Deleting student using student id from database
        studentDao.deleteStudentFromDb(studentId);
    }

    public void setRegistrationDate(String registrationDate, Student student){
        // Setting registration date using student obj
        student.setRegistrationDate(registrationDate);
        // Updating the student object in the database
        updateStudent(student);
    }

    public String getRegistrationDate(long studentId) {
        // Retrieving student data from database
        ResultSet rs = studentDao.getRegDateStudentFromDb(studentId);
        // Creating student from the data
        Student student = null;
        try{
            student = StudentHelper.createStudent(rs);
        } catch (SQLException e){
            e.printStackTrace();
        }

        // Returning the registration date
        return student.getRegistrationDate();
    }
}
