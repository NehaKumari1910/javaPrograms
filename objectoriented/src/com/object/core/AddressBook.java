package com.object.core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.jda.functional.utility.Utility;

class ZipComparator implements Comparator<Person> {

	@Override
	public int compare(Person person1, Person person2) {
		if (person1.getZip().compareTo(person2.getZip()) > 0)
			return 1;
		else if (person1.getZip().compareTo(person2.getZip()) < 0)
			return -1;
		else {
			if (person1.getLastName().compareTo(person2.getLastName()) > 0)
				return 1;
			else if (person1.getLastName().compareTo(person2.getLastName()) < 0)
				return -1;
			else {
				if (person1.getFirstName().compareTo(person2.getFirstName()) > 0)
					return 1;
				else if (person1.getFirstName().compareTo(person2.getFirstName()) < 0)
					return -1;
				else
					return 0;
			}
		}
	}

}

class NameComparator implements Comparator<Person> {

	@Override
	public int compare(Person person1, Person person2) {
		if (person1.getLastName().compareTo(person2.getLastName()) > 0)
			return 1;
		else if (person1.getLastName().compareTo(person2.getLastName()) < 0)
			return -1;
		else {
			if (person1.getFirstName().compareTo(person2.getFirstName()) > 0)
				return 1;
			else if (person1.getFirstName().compareTo(person2.getFirstName()) < 0)
				return -1;
			return 0;
		}
	}
}

public class AddressBook {
	String addressBookName;
	List<Person> persons = new ArrayList<>();

	public List<Person> getPersons() {
		return persons;
	}

	public void setPersons(List<Person> persons) {
		this.persons = persons;
	}

	AddressBook(String name) {
		addressBookName = name;
	}

	public String getAddressBookName() {
		return addressBookName;
	}

	public void setAddressBookName(String addressBookName) {
		this.addressBookName = addressBookName;
	}

	public List<Person> addNewEntry(List<Person> persons_list) {
		Person person = new Person();
		System.out.println("Enter  first name");

		person.setFirstName(Utility.getString());
		System.out.println("Enter  last name");

		person.setLastName(Utility.getString());
		System.out.println("Enter address");

		person.setAddress(Utility.getString());
		System.out.println("Enter city");

		person.setCity(Utility.getString());
		System.out.println("Enter state");

		person.setState(Utility.getString());
		System.out.println("Enter zip");

		person.setZip(Utility.getString());
		System.out.println("phone number");

		person.setPhoneNumber(Utility.getString());
		persons_list.add(person);
		return persons_list;
	}

	public Person isPersonExist(List<Person> persons_list, String firstName, String lastName) {
		for (Person person : persons_list) {
			if (person.getFirstName().equals(firstName) && person.getLastName().equals(lastName)) {
				return person;
			}
		}
		return null;
	}

	public List<Person> deletePerson(List<Person> persons_list, String firstName, String lastName) {
		Person person = isPersonExist(persons_list, firstName, lastName);
		if (person != null) {
			persons_list.remove(person);
		} else
			System.out.println("person does not exit");

		return persons_list;
	}

	public  List<Person> sortByZip(List<Person> persons_list) {
		Collections.sort(persons_list, new ZipComparator());
		return persons_list;
	}

	public  List<Person> sortByLastName(List<Person> persons_list) {
		Collections.sort(persons_list, new NameComparator());
		return persons_list;
	}

	public List<Person> editInfo(List<Person> persons_list, String firstName, String lastName) {
		
		Person editPerson = isPersonExist(persons_list, firstName, lastName);

		if (editPerson != null) {
			Person editedPerson = null;
			while (true) {
				System.out.println("Enter 1 to edit address");
				System.out.println("Enter 2 to edit city");
				System.out.println("Enter 3 to edit state");
				System.out.println("Enter 4 to edit zip");
				System.out.println("Enter 5 to phone number");
				System.out.println("Enter 6 to go back to main menu");
				int choice = Utility.getInteger();
				Utility.getString();
				if (choice == 6)
					break;
				switch (choice) {
				case 1:
					editedPerson = editAddress(editPerson);
					break;
				case 2:
					editedPerson = editCity(editPerson);
					break;
				case 3:
					editedPerson = editState(editPerson);
					break;
				case 4:
					editedPerson = editZip(editPerson);
					break;
				case 5:
					editedPerson = editPhone(editPerson);
					break;
				}
			}
			persons_list.add(editedPerson);
		} else
			System.out.println("person does not exit");
		return persons_list;

	}

	private static Person editZip(Person editPerson) {
		System.out.println("Enter new zip code");
		editPerson.setAddress(Utility.getString());
		return editPerson;
	}

	private static Person editPhone(Person editPerson) {
		System.out.println("Enter new phone number");
		editPerson.setPhoneNumber(Utility.getString());
		return editPerson;
	}

	private static Person editState(Person editPerson) {
		System.out.println("Enter new state");
		editPerson.setState(Utility.getString());
		return editPerson;
	}

	private static Person editCity(Person editPerson) {
		System.out.println("Enter new city");
		editPerson.setCity(Utility.getString());
		return editPerson;
	}

	private static Person editAddress(Person editPerson) {
		System.out.println("Enter new Address");
		editPerson.setAddress(Utility.getString());
		return editPerson;
	}

	public void print(List<Person> persons_list) {
		for (Person person : persons_list) {
			System.out.println("Name " + person.getFirstName() + " " + person.getLastName());
			System.out.println("Address " + person.getAddress());
			System.out.println("City " + person.getCity());
			System.out.println("State " + person.getState());
			System.out.println("Zip code " + person.getZip());
			System.out.println("Phone number " + person.getPhoneNumber());
		}
	}

}
