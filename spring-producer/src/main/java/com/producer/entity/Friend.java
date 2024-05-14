package com.producer.entity;

import org.springframework.stereotype.Component;

@Component
public class Friend {
	
	private String firstName;
	private String lastName;
	
	private int age;
	private String location;
	
	private boolean is_a_close_friend;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Friend [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", location=" + location
				+ ", is_a_close_friend=" + is_a_close_friend + "]";
	}

	public boolean isIs_a_close_friend() {
		return is_a_close_friend;
	}

	public void setIs_a_close_friend(boolean is_a_close_friend) {
		this.is_a_close_friend = is_a_close_friend;
	}
	
	

}
