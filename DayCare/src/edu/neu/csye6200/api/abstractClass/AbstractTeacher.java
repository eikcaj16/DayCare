package edu.neu.csye6200.api.abstractClass;

import edu.neu.csye6200.model.Teacher;

import java.util.List;

public abstract class AbstractTeacher {

    public abstract List<Teacher> getAllTeachers();

    /**
     *
     * @param teacher
     */
    public abstract void addTeacher(Teacher teacher);

    public abstract void updateTeacher(Teacher teacher);
    /**
     *
     * @param teacher
     */
    public abstract void delTeacher(Teacher teacher);
    /**
     *
     * @param teacherId
     */
    public abstract void delTeacher(long teacherId);

    public abstract int getNumOfTeachers();

    public abstract double getRating(long teacherId);
}
