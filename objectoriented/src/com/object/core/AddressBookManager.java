package com.object.core;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import com.jda.functional.utility.Utility;

public class AddressBookManager {
	static List<String> addressBooksName = new ArrayList<>();
	static String openAddressBook;
	static AddressBook addressBook;
	static List<AddressBook> addressBookObjects = new ArrayList<>();

	public static void main(String[] args) throws IOException {

		while (true) {
			System.out.println("Enter 1 to create address book");
			System.out.println("Enter 2 to open address book");
			System.out.println("Enter 3 to close address book");
			System.out.println("Enter 4 to save address book");
			System.out.println("Enter 5 to save as address book");
			System.out.println("Enter -1 to quit");
			int check = Utility.getInteger();
			Utility.getString();
			if (check == -1)
				break;
			switch (check) {
			case 1:
				createAddressBook();
				break;
			case 2:
				openAddressBook();
				break;
			case 3:
				closeAddressBook();
				break;
			case 4:

				saveAddressBook(openAddressBook);
				break;
			case 5:
				saveAsAddressBook();

			}

		}
	}

	private static void saveAsAddressBook() throws JsonGenerationException, JsonMappingException, IOException {
		System.out.println("Enter save as name");
		String saveAsName = Utility.getString();
		System.out.println("Enter name of file to be saved");
		String name = Utility.getString();
		for (AddressBook adbook : addressBookObjects) {
			if (adbook.getAddressBookName().equals(name + ".json")) {
				System.out.println("data");
				ObjectMapper mapper = new ObjectMapper();
				String data = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(adbook.getPersons());
				FileWriter writer = new FileWriter(
				      "/home/bridgelabz/javaPrograms/objectoriented/src/com/object/AddressBooks/" + saveAsName + ".json");
				System.out.println(data);
				writer.write(data);
				writer.close();
			}
		}
	}

	private static void closeAddressBook() throws JsonGenerationException, JsonMappingException, IOException {
		saveAddressBook(openAddressBook);
	}

	private static void saveAddressBook(String name) throws JsonGenerationException, JsonMappingException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		String data = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(addressBook.getPersons());
		FileWriter writer = new FileWriter(
		      "/home/bridgelabz/javaPrograms/objectoriented/src/com/object/AddressBooks/" + name);
		System.out.println(data);
		writer.write(data);
		writer.close();
	}

	private static void openAddressBook() {
		File dir = new File("/home/bridgelabz/javaPrograms/objectoriented/src/com/object/AddressBooks");
		if (dir.isDirectory()) {
			if (dir.list().length > 0) {
				for (File file : dir.listFiles()) {
					System.out.println(file.getName());
					addressBooksName.add(file.getName());
				}
				System.out.println("Enter address book name to open");
				String name = Utility.getString();
				ObjectMapper mapper = new ObjectMapper();
				List<Person> persons_list = new ArrayList<>();
				addressBook = new AddressBook(name);
				openAddressBook = name + ".json";
				addressBook.setAddressBookName(name + ".json");
				File file1 = new File(
				      "/home/bridgelabz/javaPrograms/objectoriented/src/com/object/AddressBooks/" + name + ".json");
				try {
					persons_list = mapper.readValue(file1, new TypeReference<ArrayList<Person>>() {
					});
				} catch (Exception e) {
					System.out.println("Empty file");
				}
				while (true) {
					System.out.println("Enter 1 to add person information");
					System.out.println("Enter 2 to delete person");
					System.out.println("Enter 3 to sort by zip");
					System.out.println("Enter 4 to sort by last name");
					System.out.println("Enter 5 to edit information");
					System.out.println("Enter 6 to print");
					System.out.println("Enter -1 to go back");
					int check = Utility.getInteger();
					Utility.getString();
					if (check == -1)
						break;

					switch (check) {
					case 1:
						persons_list = addressBook.addNewEntry(persons_list);
						break;
					case 2:
						System.out.println("Enter first name of person");
						String first = Utility.getString();
						System.out.println("Enter last name of person");
						String last = Utility.getString();
						persons_list = addressBook.deletePerson(persons_list, first, last);
						break;
					case 3:
						persons_list = addressBook.sortByZip(persons_list);
						break;
					case 4:
						persons_list = addressBook.sortByLastName(persons_list);
						break;
					case 5:
						System.out.println("Enter first name of person");
						Utility.getString();
						String firstName = Utility.getString();
						System.out.println("Enter last name of person");
						String lastName = Utility.getString();
						persons_list = addressBook.editInfo(persons_list, firstName, lastName);
						break;
					case 6:
						addressBook.print(persons_list);
						break;
					}
				}
				addressBook.setPersons(persons_list);
				addressBookObjects.add(addressBook);
			} else {
				System.out.println("Directory is empty");
			}
		} else {
			System.out.println("It is not a directory");
		}

	}

	private static void createAddressBook() throws IOException {
		System.out.println("Enter name of address book");
		while (true) {
			String addressBookName = Utility.getString();
			File file = new File(
			      "/home/bridgelabz/javaPrograms/objectoriented/src/com/object/AddressBooks/" + addressBookName + ".json");
			if (file.createNewFile()) {
				System.out.println("File created successfully");
				break;
			} else {
				System.out.println("File already exists,Enter another name for address book");
			}
		}

	}

}