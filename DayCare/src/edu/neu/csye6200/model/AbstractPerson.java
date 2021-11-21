package edu.neu.csye6200.model;

abstract class AbstractPerson {
	/**
	 * 
	 * @param firstName
	 */
	abstract void setFirstName(String firstName);

	abstract String getFirstName();

	/**
	 * 
	 * @param lastName
	 */
	abstract void setLastName(String lastName);

	abstract String getLastName();

	/**
	 * 
	 * @param age
	 */
	abstract void setAge(int age);

	abstract int getAge();

	/**
	 * 
	 * @param address
	 */
	abstract void setAddress(String address);

	abstract String getAddress();

	/**
	 * 
	 * @param phoneNum
	 * @param parameter
	 */
	abstract void setPhoneNum(long phoneNum);

	abstract long getPhoneNum();

	/**
	 * 
	 * @param parentName
	 */
	abstract void setParentName(String parentName);

	abstract String getParentName();

}