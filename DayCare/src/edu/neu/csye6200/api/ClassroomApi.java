package edu.neu.csye6200.api;

import edu.neu.csye6200.api.abstractClass.AbstractClassroom;
import edu.neu.csye6200.model.Classroom;

import java.util.List;

public class ClassroomApi extends AbstractClassroom {

    @Override
    public int getClassroomIdByStudentId(long studentId) {
        return 0;
    }

    @Override
    public int getClassroomIdByTeacherId(long teacherId) {
        return 0;
    }

    @Override
    public List<Classroom> getAllClassrooms() {
        return null;
    }

    @Override
    public int getNumOfClassrooms() {
        return 0;
    }
}
