package edu.neu.csye6200.controller;

import edu.neu.csye6200.model.Classroom;
import edu.neu.csye6200.model.Group;
import edu.neu.csye6200.model.Student;
import edu.neu.csye6200.model.Teacher;

import java.util.List;

public class ClassroomController {
    private final Classroom model;

    public ClassroomController(Classroom c){
        this.model = c;
    }

    public int getClassroomId() {
        return model.getClassroomId();
    }

    public int getNumOfStudents() {
        return model.getNumOfStudents();
    }

    public List<Student> getAllStudents() {
        return model.getAllStudents();
    }

    public void addStudent(Student student) {
        model.addStudent(student);
    }

    public void delStudent(Student student) {
        model.delStudent(student);
    }

    public void delStudent(long studentId) {
        model.delStudent(studentId);
    }

    public int getNumOfTeachers() {
        return model.getNumOfTeachers();
    }

    public List<Teacher> getAllTeachers() {
        return model.getAllTeachers();
    }

    public void addTeacher(Teacher teacher) {
        model.addTeacher(teacher);
    }

    public void delTeacher(Teacher teacher) {
        model.delTeacher(teacher);
    }

    public void delTeacher(long teacherId) {
        model.delTeacher(teacherId);
    }

    public int getNumOfGroups() {
        return model.getNumOfGroups();
    }

    public List<Group> getAllGroups() {
        return model.getAllGroups();
    }

    public void addGroup(Group group) {
        model.addGroup(group);
    }

    public void delGroup(Group group) {
        model.delGroup(group);
    }

    public void delGroup(int groupId) {
        model.delGroup(groupId);
    }
}
