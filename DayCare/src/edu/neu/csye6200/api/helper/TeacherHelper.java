package edu.neu.csye6200.api.helper;

import edu.neu.csye6200.model.Teacher;

public class TeacherHelper {

    public static Teacher createTeacher(String[] attributes) {
        Teacher t = new Teacher();
        t.setFirstName(attributes[0]);
        t.setLastName(attributes[1]);
        t.setAge(Integer.parseInt(attributes[2]));
        t.setAddress(attributes[3]);
        t.setPhoneNum(Integer.parseInt(attributes[4]));
        t.setRating(Double.parseDouble(attributes[5]));
        t.setTeacherId(Integer.parseInt(attributes[6]));
        return t;
    }
}
