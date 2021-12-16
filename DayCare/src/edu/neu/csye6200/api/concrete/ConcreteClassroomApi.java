package edu.neu.csye6200.api.concrete;

import edu.neu.csye6200.api.ClassroomApi;
import edu.neu.csye6200.dao.ClassroomDao;
import edu.neu.csye6200.model.Classroom;
import edu.neu.csye6200.model.enums.ClassroomType;

import java.util.List;

public class ConcreteClassroomApi implements ClassroomApi {
    @Override
    public List<Classroom> getAllClassrooms() {
        return ClassroomDao.getAllClassroomsDao();
    }

    @Override
    public List<Classroom> getAllClassroomsWithType(ClassroomType classroomType) {
        return ClassroomDao.getAllClassroomsWithTypeDao(classroomType);
    }

    @Override
    public Classroom getClassroomWithId(int classroom_id) {
        return ClassroomDao.getClassroomWithIdDao(classroom_id);
    }

    @Override
    public int getMaxClassroomId() {
        return ClassroomDao.getMaxClassroomIdDao();
    }

    @Override
    public void addClassroom(Classroom classroom) {
        ClassroomDao.addClassroomDao(classroom);

    }

    @Override
    public void updateClassroom(Classroom classroom) {
        ClassroomDao.updateClassroomDao(classroom);
    }

    @Override
    public void deleteClassroom(Classroom classroom) {
        ClassroomDao.deleteClassroomDao(classroom);
    }
}
