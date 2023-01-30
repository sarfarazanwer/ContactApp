package com.contactApp;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContactAppImplementation implements ContactApp {
	List<Contact> contactList = new ArrayList<Contact>();
	Scanner Keyboard = new Scanner(System.in);

	public void addPerson(String name, String phoneNumber, LocalDate dateOfBirth, String email) {

		Person person = new Person(name, phoneNumber, dateOfBirth, email);
		contactList.add(person);

		System.out.println("contact added sucessfully");

	}

	public void addPerson(Person person) {

		contactList.add(person);

		// System.out.println(contactList);
		System.out.println("contact added sucessfully");

	}

	public void addOrganization(String name, String phoneNumber, String website) {

		Organisation organisation = new Organisation(name, phoneNumber, website);
		contactList.add(organisation);

		// System.out.println(contactList);
		System.out.println("contact added sucessfully");

	}

	public void list() {
		for (int i = 0; i < contactList.size(); i++) {

			Contact contact = contactList.get(i);

			System.out.println(i + ".  " + contact.getName());
		}

	}

	public void count() {
		System.out.println("The phonebook has " + contactList.size() + " records.");

	}

	public void info() {
		list();
		System.out.println("Enter the id to get the contact info:");
		int inputId = Keyboard.nextInt();
		for (int i = 0; i < contactList.size(); i++) {
			if (inputId == i) {
				System.out.println(contactList.get(inputId));
			}
		}
	}

	public void delete() {

		list();
		System.out.println("enter the id");
		int id = Keyboard.nextInt();
		for (int i = 0; i < contactList.size(); i++) {
			if (id == i) {
				contactList.remove(id);

			}

		}

	}

	public void search() {
		List<String> results = new ArrayList<>();
		System.out.println("Enter search query: ");
		String searchName = Keyboard.next();
		for (int i = 0; i < contactList.size(); i++) {
			String name = contactList.get(i).getName();
			if (name.contains(searchName)) {
				results.add(i + "  " + name);

			}

		}
		if (!results.isEmpty()) {
			System.out.println("Found these names containing the search query in your phone book:");
			for (String result : results) {
				System.out.println(result);
			}
		}
	}

}
