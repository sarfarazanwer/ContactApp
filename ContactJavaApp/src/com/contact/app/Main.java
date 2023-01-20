package com.contact.app;

import java.time.LocalDateTime;
import java.util.Scanner;

import validation.ContactListImplementation;

public class Main {
	static Scanner keyboard;
	public static String name;
	public static String phoneNumber;
	public static String email;
	public static String date;
	public static String website;
	static boolean flag;
	LocalDateTime dateOfBirth;
	
	public static boolean checkPhoneNumber(String number) {
		{  
			if (number.matches("\\d{3}-\\d{3}-\\d{4}"))  
			return true;  
			
			else  
			return false;  
			}  
			}  
		
	
	public static void add() {
		
		System.out.println( "Enter the type(person, organisation)");
		String choice2= keyboard.nextLine();
		if(choice2.equalsIgnoreCase("person")) {
			System.out.println("name:");
			name= keyboard.nextLine();
			
			System.out.println("phone number in xxx-xxx-xxxx");
			phoneNumber= keyboard.nextLine();
			boolean result = checkPhoneNumber(phoneNumber);
			//System.out.println(result);
			if(result)
			{
			System.out.println("Email (leaveit blank if not available)");
			email = keyboard.nextLine();
			System.out.println("Date of Birth(mm/dd/yyyy)");
			date=keyboard.nextLine();
			
			}
		
			
		}
		else if(choice2.equalsIgnoreCase("organisation" )) {
			System.out.println("name:");
		    name= keyboard.nextLine();
			System.out.println("phone number in xxx-xxx-xxxx");
			phoneNumber= keyboard.nextLine();
			System.out.println("Website(leaveit blank if not available)");
			website = keyboard.nextLine();
			
			
			
		}
		else {
			add();
		}
		
	}
	
	
	//main method
public static void main(String[] args) {
	ContactListImplementation cli= new ContactListImplementation();
	keyboard=new Scanner(System.in);
	while(true) {
	System.out.println("Enter action[add, list, count, info, delete, search, exit]");
	String choice=keyboard.nextLine();
	
	if(choice.equalsIgnoreCase("add")) {
		System.out.println("call add()");
	//	Main.add();
		/*
		 * Person per = new Person(name, phoneNumber, date, email); Organisation org =
		 * new Organisation(name, phoneNumber, website);
		 */
		
		System.out.println( "Enter the type(person, organisation)");
		String choice2= keyboard.nextLine();
		if(choice2.equalsIgnoreCase("person")) {
			System.out.println("name:");
			name= keyboard.nextLine();
			
			System.out.println("phone number in xxx-xxx-xxxx");
			phoneNumber= keyboard.nextLine();
			
			boolean result = checkPhoneNumber(phoneNumber);
			
			while(!result) {
				System.out.println("Phone number invalid, please enter valid number");
				System.out.println("phone number in xxx-xxx-xxxx");
				phoneNumber= keyboard.nextLine();
				result = checkPhoneNumber(phoneNumber);
			}
			

			System.out.println("Email (leaveit blank if not available)");
			email = keyboard.nextLine();
			System.out.println("Date of Birth(mm/dd/yyyy)");
			date=keyboard.nextLine();
			
			
			cli.addPeron(name, phoneNumber, email);
			
		
			
		}
		else if(choice2.equalsIgnoreCase("organisation" )) {
			System.out.println("name:");
		    name= keyboard.nextLine();
			System.out.println("phone number in xxx-xxx-xxxx");
			phoneNumber= keyboard.nextLine();
			System.out.println("Website(leaveit blank if not available)");
			website = keyboard.nextLine();
			
			cli.addOrganization(name, phoneNumber, email);
			
		}
		
		
		
		
	}
	else if (choice.equalsIgnoreCase("list")) {
		//call list method
		System.out.println("call list()");
		
	}
	else if(choice.equalsIgnoreCase("count")) {
		System.out.println("call count()");
	}
	else if (choice.equalsIgnoreCase("info")) {
		//call list method
		System.out.println("call info()");
		
	}
	else if (choice.equalsIgnoreCase("delete")) {
		//call list method
		System.out.println("call delete()");
		
	}
	else if(choice.equalsIgnoreCase("search")) {
		System.out.println("call search()");
	}
	else if (choice.equalsIgnoreCase("exit")) {
		//call list method
		System.out.println("call exit()");
		System.exit(0);
		
	}
	else {
		System.out.println("Make a valid choice!");
	}
	
	/*Person per = new Person(name, phoneNumber, date, email);
	Organisation org = new Organisation(name, phoneNumber, website);
}*/
	
}
}}
