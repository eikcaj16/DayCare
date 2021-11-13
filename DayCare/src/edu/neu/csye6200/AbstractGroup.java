public class AbstractGroup {

	private Teacher teacher;
	private List<Student> students;
	private int groupId;

	public Teacher getTeacher() {
		return this.teacher;
	}

	/**
	 * 
	 * @param teacher
	 */
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public List<Student> getAllStudents() {
		// TODO - implement AbstractGroup.getAllStudents
		throw new UnsupportedOperationException();
	}

	public int getGroupId() {
		return this.groupId;
	}

	/**
	 * 
	 * @param groupId
	 */
	protected void setGroupId(int groupId) {
		this.groupId = groupId;
	}

	/**
	 * 
	 * @param student
	 */
	public int addStudent(Student student) {
		// TODO - implement AbstractGroup.addStudent
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param student
	 */
	public boolean delStudent(Student student) {
		// TODO - implement AbstractGroup.delStudent
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param studentId
	 */
	public boolean delStudent(long studentId) {
		// TODO - implement AbstractGroup.delStudent
		throw new UnsupportedOperationException();
	}

	public int getNumOfStudents() {
		// TODO - implement AbstractGroup.getNumOfStudents
		throw new UnsupportedOperationException();
	}

}