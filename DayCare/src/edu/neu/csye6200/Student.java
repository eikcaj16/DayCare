public class Student extends Person {

	private LocalDate immunizationDate;
	private LocalDate registrationDate;
	private double gpa;
	private long studentId;

	/**
	 * 
	 * @param immunizationDate
	 */
	public void setImmunizationDate(LocalDate immunizationDate) {
		this.immunizationDate = immunizationDate;
	}

	public LocalDate getImmunizationDate() {
		return this.immunizationDate;
	}

	/**
	 * 
	 * @param registrationDate
	 */
	public void setRegistrationDate(LocalDate registrationDate) {
		this.registrationDate = registrationDate;
	}

	public LocalDate getRegistrationDate() {
		return this.registrationDate;
	}

	/**
	 * 
	 * @param gpa
	 */
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public double getGpa() {
		return this.gpa;
	}

	/**
	 * 
	 * @param studentId
	 */
	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}

	public long getStudentId() {
		return this.studentId;
	}

}