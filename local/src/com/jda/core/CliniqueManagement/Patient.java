package com.jda.core.CliniqueManagement;

public class Patient {
	private String name;
	private int age;
	private String mobileNumber;
	private int id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public static String getAttributeValue(int choice,Patient patient)
	{
		if(choice==1)
			return patient.getName();
		if(choice==2)
			return Integer.toString(patient.getId());
		else if(choice==3)
			return Integer.toString(patient.getAge());
		else if(choice==4)
			return patient.getMobileNumber();
		return null;
	}
	public static void printDetails(Patient patient)
	{
		System.out.println("Doctor's Name=>"+patient.getName());
		System.out.println("Doctor's id=>"+patient.getId());
		System.out.println("Doctor's speciality=>"+patient.getAge());
		System.out.println("Doctor's availablity=>"+patient.getMobileNumber());
		
	}

}

