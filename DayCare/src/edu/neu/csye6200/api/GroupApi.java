package edu.neu.csye6200.api;

import edu.neu.csye6200.api.abstractClass.AbstractGroup;
import edu.neu.csye6200.model.Group;

import java.util.ArrayList;
import java.util.List;

public class GroupApi extends AbstractGroup {
    @Override
    public List<Group> getAllGroups() {
        return new ArrayList<>();
    }

    @Override
    public void addGroup(Group group) {

    }

    @Override
    public void delGroup(Group group) {
    }

    @Override
    public void delGroup(int groupId) {
    }
}
