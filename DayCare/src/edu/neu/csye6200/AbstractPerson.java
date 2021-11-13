public class AbstractPerson {

	private string firstName;
	private string lastName;
	private int age;
	private long id;
	private string address;
	private long phoneNum;
	private string parentName;

	/**
	 * 
	 * @param firstName
	 */
	public void setFirstName(string firstName) {
		this.firstName = firstName;
	}

	public string getFirstName() {
		return this.firstName;
	}

	/**
	 * 
	 * @param lastName
	 */
	public void setLastName(string lastName) {
		this.lastName = lastName;
	}

	public string getLastName() {
		return this.lastName;
	}

	/**
	 * 
	 * @param age
	 */
	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return this.age;
	}

	/**
	 * 
	 * @param id
	 */
	public void setId(long id) {
		this.id = id;
	}

	public long getId() {
		return this.id;
	}

	/**
	 * 
	 * @param address
	 */
	public void setAddress(string address) {
		this.address = address;
	}

	public string getAddress() {
		return this.address;
	}

	/**
	 * 
	 * @param phoneNum
	 * @param parameter
	 */
	public void setPhoneNum(int phoneNum, long parameter) {
		// TODO - implement AbstractPerson.setPhoneNum
		throw new UnsupportedOperationException();
	}

	public long getPhoneNum() {
		return this.phoneNum;
	}

	/**
	 * 
	 * @param parentName
	 */
	public void setParentName(string parentName) {
		this.parentName = parentName;
	}

	public string getParentName() {
		return this.parentName;
	}

}