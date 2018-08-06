package com.jda.core.CliniqueManagement;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import com.jda.utility.Utility;

public class CliniqueFunctionalities {
	private static ArrayList<Doctor> doctors=new ArrayList<>();
	private static ArrayList<Patient> patients=new ArrayList<>();
	private static Map<Doctor, ArrayList<Patient>> appointmentsList = new HashMap<>();
	static ArrayList<Patient> patientsWithAppointment;
	
	static Patient patient;
	static Doctor doctor;
	static ObjectMapper mapper=new ObjectMapper();
	private static String path= "C:\\Javaprograms\\Functional\\src\\com\\jda\\core\\CliniqueManagement";
	private static String filename;
	public static ArrayList<Doctor> getAllDoctorsDetails()
	{
		ArrayList<Doctor> allDoctors=new ArrayList<>();
		try {
			allDoctors = mapper.readValue(
					new File(path+"/doctor.json"),
					new TypeReference<ArrayList<Doctor>>() {
					});
		} catch (Exception e) {
			System.out.println("Empty File");
		}
		return allDoctors;
	}
	public static ArrayList<Patient> getAllPatientsDetails()
	{
		ArrayList<Patient> allPatients=new ArrayList<>();
		try {
			allPatients = mapper.readValue(
					new File(path+"/patient.json"),
					new TypeReference<ArrayList<Patient>>() {
					});
		} catch (Exception e) {
			System.out.println("Empty File");
		}
		return allPatients;
	}
	/*public static <T> ArrayList<T> readFromFile(String filename,T person)
	{
		ArrayList<person.getClass()> allDetails = new ArrayList<>();
		try {
			File file=new File(path+"/"+filename);
			allDetails=mapper.readValue(file,new TypeReference<ArrayList<person.getClass()>>() {
					});
		} catch (Exception e) {
			allPatients = new ArrayList<Patient>();
		}
		return allPatients;
	}*/
	public static <T> void writeToFile(ArrayList<T> data,String filename) throws JsonGenerationException, JsonMappingException, IOException
	{
		String jsonData=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(data);
		FileWriter file = new FileWriter(path+"//"+filename);
		file.write(jsonData);
		file.close();
	}
	public static void addDoctor() throws JsonGenerationException, JsonMappingException, IOException
	{
		filename="doctor.json";
		 doctor = new Doctor();
		System.out.println("Enter name of the doctor");
		//Utility.getstring();
		doctor.setName(Utility.getstring());
		//Utility.getstring();
		System.out.println("Enter id of the doctor");
		doctor.setId(Utility.getInt());
		Utility.getstring();
		System.out.println("Enter specialization of the doctor");
		doctor.setSpecialization(Utility.getstring());
		Utility.getstring();
		System.out.println("Enter availablity of the doctor");
		doctor.setAvailability(Utility.getstring());
		doctors.add(doctor);
		writeToFile(doctors,filename);
	}
	public static Patient addPatient() throws JsonGenerationException, JsonMappingException, IOException
	{
		filename="patient.json";
		patient = new Patient();
		System.out.println("Enter name of the patient");
		patient.setName(Utility.getstring());
		System.out.println("Enter id of the patient");
		patient.setId(Utility.getInt());
		System.out.println("Enter age of the patient");
		patient.setAge(Utility.getInt());
		Utility.getstring();
		System.out.println("Enter mobile number of the doctor");
		patient.setMobileNumber(Utility.getstring());
		patients.add(patient);
		writeToFile(patients,filename);
		return patient;
	}
	
	public static void search(int choice)
	{
		if(choice==3)
		{
			doctors=CliniqueFunctionalities.getAllDoctorsDetails();
			Search.searchDoctor(doctors);
			return;
		}
		else
		{
			patients=CliniqueFunctionalities.getAllPatientsDetails();
			Search.searchPatient(patients);
			return;
		}
		
	}
	static public void bookAppointment() throws JsonGenerationException, JsonMappingException, IOException {
		System.out.print("Enter 1 to book an appointment with a specific doctor");
		System.out.print("Eneter 2 to book an appointment with any doctor");
		int choice = Utility.getInt();
		Utility.getstring();
		switch (choice) 
		{
			case 1: 
				System.out.print("Enter the name of Doctor:");
				String name = Utility.getstring();
				doctor=Search.searchDoctorByAttributes(1,name, doctors);
				if (appointmentsList.containsKey(doctor)) 
				{
					int noOfappoinments = appointmentsList.get(doctor).size();
					if (noOfappoinments < 5) 
					{
						patientsWithAppointment = appointmentsList.get(doctor);
						patientsWithAppointment.add(addPatient());
						appointmentsList.put(doctor, patientsWithAppointment);
						System.out.print("Appointment booked!");
						return;
					} 
					else 
					{
						System.out.print("The doctor is booked for the day!");
						System.out.print("Enter 1 to book an appointment with another doctor");
						System.out.print("Exit without booking");
						int choice1 = Utility.getInt();
						Utility.getstring();
						if (choice1 == 2)
							break;
						switch (choice1) 
						{
							case 1: 
								getAppointmentDetails();
								break;
						
						}
					}
				}
				else 
				{
					patientsWithAppointment = new ArrayList<>();
					patientsWithAppointment.add(addPatient());
					appointmentsList.put(doctor, patientsWithAppointment);
					System.out.print("Appointment booked!");
					return;
				}
				break;
		case 2:
			getAppointmentDetails();
			break;
		}
	}
	private static void getAppointmentDetails() throws JsonGenerationException, JsonMappingException, IOException {
		System.out.println("Enter the specialization:");
		String specialization = Utility.getstring();
		System.out.println("Enter the time when you want appointment :");
		String time = Utility.getstring();
		ArrayList<Doctor> Doctors = new ArrayList<>();
		for (Doctor doctor : doctors) {
			if (doctor.getSpecialization().equals(specialization) && doctor.getAvailability().equals(time)) {
				Doctors.add(doctor);
			}
		}
		if (Doctors.size() == 0) {
			System.out.println("No doctor found with this specialization!");
			return;
		}

		for (Doctor doctor : Doctors) 
		{
			ArrayList<Patient> patientsWithAppointment;
			if (appointmentsList.containsKey(doctor)) 
			{
				 patientsWithAppointment= appointmentsList.get(doctor);
				if (patientsWithAppointment.size() < 5) 
				{
					patientsWithAppointment.add(addPatient());
				}
			} 
			else 
			{
				patientsWithAppointment = new ArrayList<>();
				patientsWithAppointment.add(addPatient());
				
			}
			appointmentsList.put(doctor, patientsWithAppointment);
			System.out.print("Appointment booked!");
			return;
		}
		System.out.println("\nAll doctors with this specialization and time are busy!");
		return;
		
	}
	/*public static void allAppointmentDetails()
	{
		System.out.println("fgfjgh");
		appointmentsList.forEach((key,value) -> System.out.println(key.getName()));
	}*/

}
