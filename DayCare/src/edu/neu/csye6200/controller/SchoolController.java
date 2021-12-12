package edu.neu.csye6200.controller;

import edu.neu.csye6200.model.AbstractClassroom;
import edu.neu.csye6200.model.Classroom;
import edu.neu.csye6200.model.School;

import java.util.List;

public class SchoolController {
    private final School model;

    public SchoolController(School model) { this.model = model; }

    public int getNumOfClassrooms() { return model.getNumOfClassrooms(); }

    public List<AbstractClassroom> getAllClassrooms() { return model.getAllClassrooms(); }

    public AbstractClassroom addClassroom(int type) { return model.addClassroom(type); }

    public void delClassroom(Classroom classroom) { model.delClassroom(classroom); }

    public void delClassroom(int classroomId) { model.delClassroom(classroomId); }

}
