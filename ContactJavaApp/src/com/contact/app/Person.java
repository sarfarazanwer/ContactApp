package com.contact.app;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class Person extends Contact{
	private LocalDate dateOfBirth;
	private String email;
	public Person(String name, String phoneNumber, LocalDate dateOfBirth, String email) {
		super(name, phoneNumber);
		this.dateOfBirth = dateOfBirth;
		this.email = email;
		System.out.println(name);
		System.out.println(phoneNumber);
		System.out.println(email);
		System.out.println(dateOfBirth);
		
	}
	
	public Person(String name, String phoneNumber, String email){
		super(name, phoneNumber);
		this.email = email;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getEnail() {
		return email;
	}
	public void setEnail( String email) {
		this.email = email;
		
	}
	
	@Override
	public String toString() {
		return "Person [dateOfBirth=" + dateOfBirth + ", email=" + email + "]";
	}
	
	
	public static boolean checkPhoneNumber(String number) {
		{  
			if (number.matches("\\d{3}-\\d{3}-\\d{4}"))  
			return true;  
			
			else  
			return false;  
			}  
			}  
	@Override
	public void add() {
		System.out.println("name:");
		
        String name= keyboard.nextLine();
		
		System.out.println("phone number in xxx-xxx-xxxx");
		String phoneNumber= keyboard.nextLine();
		boolean result = checkPhoneNumber(phoneNumber);
		System.out.println(result);
		if(result)
		{
		System.out.println("Email (leaveit blank if not available)");
		String email = keyboard.nextLine();
		System.out.println("Date of Birth(mm/dd/yyyy)");
		String dob=keyboard.nextLine();
		Person newP;
		if(!dob.isBlank() ) {
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/DD/YYYY");
			LocalDate localDate = LocalDate.parse(dob, formatter);
			newP= new Person(name,phoneNumber,localDate, email);
			}
		else {
			newP= new Person(name,phoneNumber,email);
		}
		}
		
	}
	
	
	

}
