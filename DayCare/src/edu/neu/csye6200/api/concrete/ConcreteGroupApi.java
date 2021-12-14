package edu.neu.csye6200.api.concrete;

import edu.neu.csye6200.api.GroupApi;
import edu.neu.csye6200.model.Group;

import java.util.ArrayList;
import java.util.List;

public class ConcreteGroupApi implements GroupApi {
    @Override
    public List<Group> getAllGroups() {
        return null;
    }

    @Override
    public List<Group> getAllGroupsInClassroom(int classroomId) {
        return null;
    }

    @Override
    public void addGroup(Group group) {

    }

    @Override
    public void updatedGroup(Group group) {

    }

    @Override
    public void delGroup(Group group) {

    }
}
