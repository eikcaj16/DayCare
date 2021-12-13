package edu.neu.csye6200.api.helper;

import edu.neu.csye6200.model.Teacher;

public class TeacherHelper {

    public static Teacher createTeacher(String[] attributes) {
        Teacher teacher = new Teacher();
        teacher.setFirstName(attributes[0]);
        teacher.setLastName(attributes[1]);
        teacher.setDateOfBirth(attributes[2]);
        teacher.setAddress(attributes[3]);
        teacher.setEmail(attributes[4]);
        teacher.setPhoneNum(Integer.parseInt(attributes[5]));
        teacher.setRating(Double.parseDouble(attributes[6]));
        teacher.setTeacherId(Integer.parseInt(attributes[7]));
        return teacher;
    }
}
