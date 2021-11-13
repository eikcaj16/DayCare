public class AbstractClassroom {

	private int classroomId;
	private string classroomName;
	private List<AbstractPerson> students;
	private List<AbstractPerson> teachers;
	private List<AbstractGroup> groups;

	public int getClassroomId() {
		return this.classroomId;
	}

	/**
	 * 
	 * @param id
	 */
	protected void setClassroomId(int id) {
		this.classroomId = id;
	}

	public int getNumOfStudents() {
		// TODO - implement AbstractClassroom.getNumOfStudents
		throw new UnsupportedOperationException();
	}

	public Abstract<Student> getAllStudents() {
		// TODO - implement AbstractClassroom.getAllStudents
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param student
	 */
	public long addStudent(Student student) {
		// TODO - implement AbstractClassroom.addStudent
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param student
	 */
	public boolean delStudent(Student student) {
		// TODO - implement AbstractClassroom.delStudent
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param studentId
	 */
	public boolean delStudent(long studentId) {
		// TODO - implement AbstractClassroom.delStudent
		throw new UnsupportedOperationException();
	}

	public int getNumOfTeachers() {
		// TODO - implement AbstractClassroom.getNumOfTeachers
		throw new UnsupportedOperationException();
	}

	public List<Teacher> getAllTeachers() {
		// TODO - implement AbstractClassroom.getAllTeachers
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param teacher
	 */
	public long addTeacher(Teacher teacher) {
		// TODO - implement AbstractClassroom.addTeacher
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param teacher
	 */
	public boolean delTeacher(Teacher teacher) {
		// TODO - implement AbstractClassroom.delTeacher
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param teacherId
	 */
	public boolean delTeacher(long teacherId) {
		// TODO - implement AbstractClassroom.delTeacher
		throw new UnsupportedOperationException();
	}

	public int getNumOfGroups() {
		// TODO - implement AbstractClassroom.getNumOfGroups
		throw new UnsupportedOperationException();
	}

	public List<AbstractGroup> getAllGroups() {
		// TODO - implement AbstractClassroom.getAllGroups
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param teacher
	 */
	public int addGroup(Teacher teacher) {
		// TODO - implement AbstractClassroom.addGroup
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param group
	 */
	public boolean delGroup(Group group) {
		// TODO - implement AbstractClassroom.delGroup
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param groupId
	 */
	public boolean delGroup(int groupId) {
		// TODO - implement AbstractClassroom.delGroup
		throw new UnsupportedOperationException();
	}

}