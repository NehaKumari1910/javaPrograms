package com.jda.core.CliniqueManagement;

import java.io.IOException;
import java.util.ArrayList;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;

import com.jda.utility.Utility;

public class CliniqueManagementApplication {

	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		
		while(true)
		{
			System.out.println("Enter 1 to add doctor");
			System.out.println("Enter 2 to add patient");
			System.out.println("Enter 3 to search doctor");
			System.out.println("Enter 5 to book appoinment");
			System.out.println("Enter -1 to quit");
			System.out.println("Enter choice");
			int choice=Utility.getInt();
			Utility.getstring();
			if(choice==-1)
				break;
			switch(choice)
			{
				case 1:
				    CliniqueFunctionalities.addDoctor();
				    break;
				case 2:
					CliniqueFunctionalities.addPatient();
					break;
				case 3:
					CliniqueFunctionalities.search(choice);
					break;
				case 4:
					CliniqueFunctionalities.search(choice);
					break;
				case 5:
					CliniqueFunctionalities.bookAppointment();
					break;
				/*case 6:
					CliniqueFunctionalities.allAppointmentDetails();
					break;*/
				
			}
			
			
		}
	}

}
