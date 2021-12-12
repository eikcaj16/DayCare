package edu.neu.csye6200.api.abstractClass;

import edu.neu.csye6200.model.Classroom;
import edu.neu.csye6200.model.Group;
import edu.neu.csye6200.model.Student;

import java.util.*;

public abstract class AbstractClassroom {

	public abstract int getClassroomIdByStudentId(long studentId);

	public abstract int getClassroomIdByTeacherId(long teacherId);

	public abstract List<Classroom> getAllClassrooms();

	public abstract int getNumOfClassrooms();
}