package edu.neu.csye6200.api.abstractClass;

import edu.neu.csye6200.model.Group;

import java.util.*;
public abstract class AbstractGroup {

	public abstract List<Group> getAllGroups();

	public abstract void addGroup(Group group);

	public abstract void updatedGroup(Group group);

	public abstract void delGroup(Group group);
}