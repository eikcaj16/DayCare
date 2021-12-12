package edu.neu.csye6200.api.abstractClass;

import edu.neu.csye6200.model.Teacher;

import java.util.List;

public abstract class AbstractTeacher {

    public abstract List<Teacher> getAllTeachers();

    /**
     *
     * @param teacherId
     * @return
     */
    public abstract boolean addTeacher(long teacherId);

    /**
     *
     * @param teacherId
     * @return
     */
    public abstract boolean delTeacher(long teacherId);

    public abstract int getNumOfTeachers();

}
