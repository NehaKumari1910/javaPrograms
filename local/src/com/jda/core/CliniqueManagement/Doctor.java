package com.jda.core.CliniqueManagement;

import java.util.ArrayList;
import java.util.List;

public class Doctor {
	private String name;
	private int id;
	private String specialization;
	private String availability;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public String getAvailability() {
		return availability;
	}
	public void setAvailability(String availability) {
		this.availability = availability;
	}
	public static String getAttributeValue(int choice,Doctor doctor)
	{
		if(choice==1)
			return doctor.getName();
		else if(choice==2)
			return Integer.toString(doctor.getId());
		else if(choice==3)
			return doctor.getSpecialization();
		else if(choice==4)
			return doctor.getAvailability();
		return null;
		
	}
	public static void printDetails(Doctor doctor)
	{
		System.out.println("Doctor's Name=>"+doctor.getName());
		System.out.println("Doctor's id=>"+doctor.getId());
		System.out.println("Doctor's speciality=>"+doctor.getSpecialization());
		System.out.println("Doctor's availablity=>"+doctor.getAvailability());
		return;
		
	}
	

}
