package edu.neu.csye6200.controller;

import edu.neu.csye6200.api.ClassroomApi;
import edu.neu.csye6200.model.Classroom;
import edu.neu.csye6200.model.Group;
import edu.neu.csye6200.model.Student;
import edu.neu.csye6200.model.Teacher;

import java.util.List;

public class ClassroomController {

    private final ClassroomApi api = new ClassroomApi();

    public int getClassroomId() {
        return api.getClassroomId();
    }

    public int getNumOfGroups() {
        return api.getNumOfGroups();
    }
}
