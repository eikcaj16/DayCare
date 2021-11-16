package edu.neu.csye6200.model;

public class Person extends AbstractPerson {
	
	private String firstName;
	private String lastName;
	private int age;
	private String address;
	private long phoneNum;
	private String parentName;
	
	/**
	 * 
	 * @param firstName
	 */
	@Override
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Override
	public String getFirstName() {
		return this.firstName;
	}

	/**
	 * 
	 * @param lastName
	 */
	@Override
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String getLastName() {
		return this.lastName;
	}

	/**
	 * 
	 * @param age
	 */
	@Override
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int getAge() {
		return this.age;
	}

	/**
	 * 
	 * @param address
	 */
	@Override
	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String getAddress() {
		return this.address;
	}

	/**
	 * 
	 * @param phoneNum
	 * @param parameter
	 */
	@Override
	public void setPhoneNum(int phoneNum, long parameter) {
		// TODO - implement AbstractPerson.setPhoneNum
		throw new UnsupportedOperationException();
	}

	@Override
	public long getPhoneNum() {
		return this.phoneNum;
	}

	/**
	 * 
	 * @param parentName
	 */
	@Override
	public void setParentName(String parentName) {
		this.parentName = parentName;
	}
	@Override
	public String getParentName() {
		return this.parentName;
	}

}