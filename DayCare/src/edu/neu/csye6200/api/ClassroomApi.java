package edu.neu.csye6200.api;

import edu.neu.csye6200.api.abstractClass.AbstractClassroom;
import edu.neu.csye6200.model.Group;

import java.util.List;

public class ClassroomApi extends AbstractClassroom {

    @Override
    public int getClassroomId() {
        return 0;
    }

    @Override
    public List<Group> getAllGroups() {
        return null;
    }

    public int getNumOfGroups() {
        return 0;
    }
}
