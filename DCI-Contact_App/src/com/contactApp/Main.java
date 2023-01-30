package com.contactApp;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
	static Scanner keyboard;
	public static String name;
	public static String phoneNumber;
	public static String email;
	public static String date;
	public static String website;
	static boolean flag;

	public static void main(String[] args) {
		LocalDate localDate = null;
		ContactAppImplementation cli = new ContactAppImplementation();
		keyboard = new Scanner(System.in);
		while (true) {
			System.out.println("Enter action[add, list, count, info, delete, search, exit]");
			String choice = keyboard.nextLine();

			if (choice.equalsIgnoreCase("add")) {
				System.out.println("Enter the type(person, organisation)");
				String choice2 = keyboard.nextLine();
				if (choice2.equalsIgnoreCase("person")) {
					System.out.println("name:");
					name = keyboard.nextLine();

					System.out.println("phone number in xxx-xxx-xxxx");
					phoneNumber = keyboard.nextLine();
					if (phoneNumber.isBlank()) {
						phoneNumber = "No Number";
					} else {
						boolean result = Contact.validatePhoneNumber(phoneNumber);
						if (result == false) {
							phoneNumber = "No Number";
						}
					}

					System.out.println("Email (leaveit blank if not available)");
					email = keyboard.nextLine();
					System.out.println("Date of Birth in (mm/dd/yyyy):");
					String dob = keyboard.nextLine();
					Person newP;
					if (!dob.isBlank()) {
						DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
						localDate = LocalDate.parse(dob, formatter);
						newP = new Person(name, phoneNumber, localDate, email);
					} else {
						newP = new Person(phoneNumber, name, localDate);
					}

					cli.addPerson(newP);

				} else if (choice2.equalsIgnoreCase("organisation")) {
					System.out.println("name:");
					name = keyboard.nextLine();
					System.out.println("phone number in xxx-xxx-xxxx");
					phoneNumber = keyboard.nextLine();
					if (phoneNumber.isBlank()) {
						phoneNumber = "No Number";
					} else {
						boolean result = Contact.validatePhoneNumber(phoneNumber);
						if (result == false) {
							phoneNumber = "No Number";
						}
					}
					System.out.println("Website(leaveit blank if not available)");
					website = keyboard.nextLine();

					cli.addOrganization(name, phoneNumber, website);

				}

			} else if (choice.equalsIgnoreCase("list")) {
				cli.list();

			} else if (choice.equalsIgnoreCase("count")) {
				cli.count();

			} else if (choice.equalsIgnoreCase("info")) {
				cli.info();

			} else if (choice.equalsIgnoreCase("delete")) {
				cli.delete();

			} else if (choice.equalsIgnoreCase("search")) {
				cli.search();
			} else if (choice.equalsIgnoreCase("exit")) {

				System.exit(0);

			} else {
				System.out.println("Make a valid choice!");
			}

		}
	}
}
