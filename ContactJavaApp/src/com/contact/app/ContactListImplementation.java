package com.contact.app;

import java.util.ArrayList;
import java.util.List;

public class ContactListImplementation {
List<Contact>  contactList = new ArrayList<Contact>();
	
	
	public void addPeron(String name,String phoneNumber,String dateOfBirth, String email) {
		
		Person person = new Person(name,phoneNumber,dateOfBirth,email);
		contactList.add(person);
		
		System.out.println(contactList);
		
	}
	
public void addOrganization(String name,String phoneNumber,String website) {
		
		Organisation organisation = new Organisation(name,phoneNumber,website);
		contactList.add(organisation);
		
		System.out.println(contactList);
		
	}

	
public void remove(String name,String phoneNumber,String email) {
		
		
		
		
		
	}

public void update(String name,String phoneNumber,String email) {
	
	
	
	
	
}

public List<Contact> getContactList() {
	
	for(Contact list: contactList) {
		
	}
	return contactList;
	
	

}



}


