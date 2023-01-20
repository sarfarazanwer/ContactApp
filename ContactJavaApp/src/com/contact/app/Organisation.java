package com.contact.app;

public class Organisation extends Contact{
	
private String website;

public Organisation(String name, String phoneNumber, String website) {
	super(name, phoneNumber);
	this.website = website;
	System.out.println(website);
	
}

public String getWebsite() {
	return website;
	
}

public void setWebsite(String website) {
	this.website = website;
	System.out.println(website);
}

@Override
public String toString() {
	return "Organisation [website=" + website + ", contactInfoList=" + contactInfoList + "]";
}

@Override
public void add() {
	
	
}
	


}
