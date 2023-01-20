package contactApp;

import java.util.ArrayList;
import java.util.Scanner;



public abstract class Contact {
	
	//fields
	private String name;
	private String phoneNumber;
	Scanner keyboard=new Scanner(System.in);
	//creating generic array list
	ArrayList<Contact> contactInfoList= new ArrayList<>();
	//constructor
	public Contact(String name, String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		
	}
	//methods
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public abstract void add();
}
