package com.jda.core.CliniqueManagement;


import java.util.ArrayList;
import java.util.List;

import com.jda.utility.Utility;

public class Search {
	
	public static void searchDoctor(List<Doctor> doctors)
	{
		while(true)
		{
			System.out.println("Enter 1 to search by name");
			System.out.println("Enter 2 to search by id");
			System.out.println("Enter 3 to search by specialization");
			System.out.println("Enter 4 to search by availability");
			System.out.println("Enter -1 to go back");
			Doctor tempDoctor = null;
			int choice=Utility.getInt();
			if(choice==-1)
				break;
			Utility.getstring();
			switch(choice)
			{
			case 1:
				System.out.println("Enter the name of doctor to be searched");
				tempDoctor=Search.searchDoctorByAttributes(choice,Utility.getstring(),doctors);
				System.out.println(tempDoctor.getName());
				break; 
			case 2:
				System.out.println("Enter the id of doctor to be searched");
				tempDoctor=Search.searchDoctorByAttributes(choice,Integer.toString(Utility.getInt()),doctors);
				break;
			case 3:
				System.out.println("Enter the speciality of doctor to be searched");
				tempDoctor=Search.searchDoctorByAttributes(choice,Utility.getstring(),doctors);
				break;
			case 4:
				System.out.println("Enter the availability of doctor to be searched");
				tempDoctor=Search.searchDoctorByAttributes(choice,Utility.getstring(),doctors);
				break;	
			}
			Doctor.printDetails(tempDoctor);
		}
	}
	public static Doctor searchDoctorByAttributes(int choice,String attribute,List<Doctor> doctors)
	{
		System.out.println(attribute);
		for(Doctor doctor:doctors)
		{
			System.out.println(attribute+Doctor.getAttributeValue(choice,doctor));
			if(Doctor.getAttributeValue(choice,doctor).equals(attribute))
			{
				return doctor;
			}
				
		}
		return null;
	}
	public static void searchPatient(List<Patient> patients)
	{
		while(true)
		{
			System.out.println("Enter 1 to search by name");
			System.out.println("Enter 2 to search by id");
			System.out.println("Enter 3 to search by age");
			System.out.println("Enter 3 to search by mobile number");
			System.out.println("Enter -1 to go back");
			Patient tempPatient = null;
			int choice=Utility.getInt();
			if(choice==-1)
				break;
			switch(choice)
			{
			case 1:
				System.out.println("Enter the name of patient to be searched");
				Utility.getstring();
				tempPatient=Search.searchPatientByAttributes(choice,Utility.getstring(),patients);
				break;
			case 2:
				System.out.println("Enter the id of patient to be searched");
				tempPatient=Search.searchPatientByAttributes(choice,Integer.toString(Utility.getInt()),patients);
				break;
			case 3:
				System.out.println("Enter the age of doctor to be searched");
				tempPatient=Search.searchPatientByAttributes(choice,Integer.toString(Utility.getInt()),patients);
				break;	
			}
			Patient.printDetails(tempPatient);
		}
		
	}
	public static Patient searchPatientByAttributes(int choice, String attribute,List<Patient> patients)
	{
		for(Patient patient:patients)
		{
			if(Patient.getAttributeValue(choice,patient).equals(attribute))
				return patient;	
		}
		return null;
	}

}
