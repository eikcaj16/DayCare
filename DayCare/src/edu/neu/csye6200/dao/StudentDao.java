package edu.neu.csye6200.dao;

import edu.neu.csye6200.model.Student;
import edu.neu.csye6200.utils.DatabaseUtil;

import java.sql.ResultSet;
import java.util.List;

public class StudentDao {
    public int getNumOfStudentsDao() {
        return 0;
    }

    public List<Student> getAllStudentsDao() {
        return null;
    }

    public List<Student> getAllStudentsInClassroomDao(int classroomId) {
        return null;
    }

    public List<Student> getAllStudentsInGroupDao(int classroomId, int groupId) {
        return null;
    }

    public void addStudentDao(Student student) {

    }

    public void updateStudentDao(Student student) {

    }

    public void deleteStudentDao(Student student) {

    }

    public void deleteStudentDao(int studentId) {


//    public void addStudentToDb(Student student){
//        String sql = "INSERT INTO student (first_name, last_name, address, date_of_birth, parent_name, email, " +
//                "reg_date, phone_no, classroom_id, group_id, rating)" +
//                "VALUES('" + student.getFirstName()
//                + "','" + student.getLastName()
//                + "','" + student.getAddress()
//                + "','" + student.getDateOfBirth()
//                + "','" + student.getAge()
//                + "','" + student.getParentName()
//                + "','" + student.getPhoneNum()
//                + "','" + student.getEmail()
//                + "','" + student.getRegistrationDate()
//                + "','" + student.getAnnualRegistrationDate()
//                + "','" + student.getReview() + "');";
//        DatabaseUtil.executeSQL(sql);
//    }
//
//    public void updateStudent(Student student){
//        String sql = "UPDATE student " + "SET first_name = '" + student.getFirstName()
//                + "', last_name = '" + student.getLastName()
//                + "', address = '" + student.getAddress()
//                + "', date_of_birth = '" + student.getDateOfBirth()
//                + "', age = '" + student.getAge()
//                + "', parent_name = '" + student.getParentName()
//                + "', email = '" + student.getEmail()
//                + "', reg_date = '" + student.getRegistrationDate()
//                + "', annual_reg_date = '" + student.getAnnualRegistrationDate()
//                + "', phone_no = '" + student.getPhoneNum()
//                + "', rating = '" + student.getReview()
//                + " WHERE student_id = '" + student.getStudentId() + "';";
//        DatabaseUtil.executeSQL(sql);
//    }
//
//    public ResultSet getStudentFromDb(Student student){
//        String sql = "SELECT * FROM student WHERE student_id = "  + student.getStudentId() + ";";
//        return DatabaseUtil.getSQLResult(sql);
//    }
//
//    public ResultSet getRegDateStudentFromDb(long studentId){
//        String sql = "SELECT * FROM student WHERE student_id = " + studentId + ";";
//        return DatabaseUtil.getSQLResult(sql);
//    }
//
//    public void deleteStudentFromDb(Student student){
//        DatabaseUtil.deleteRecord("student", "student_id", String.valueOf(student.getStudentId()));
//    }
//
//    public void deleteStudentFromDb(long studentId){
//        DatabaseUtil.deleteRecord("student", "student_id", String.valueOf(studentId));
//    }
}
