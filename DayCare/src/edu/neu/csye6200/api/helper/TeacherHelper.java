package edu.neu.csye6200.api.helper;

import edu.neu.csye6200.model.Teacher;

public class TeacherHelper {

    public static Teacher createTeacher(String[] attributes) {
        Teacher teacher = new Teacher();
        teacher.setFirstName(attributes[0]);
        teacher.setLastName(attributes[1]);
        teacher.setDateOfBirth(attributes[2]);
        teacher.setAddress(attributes[3]);
        teacher.setPhoneNum(Integer.parseInt(attributes[4]));
        teacher.setRating(Double.parseDouble(attributes[5]));
        teacher.setTeacherId(Integer.parseInt(attributes[6]));
        return teacher;
    }
}
