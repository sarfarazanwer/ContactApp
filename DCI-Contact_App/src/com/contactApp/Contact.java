package com.contactApp;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public  class Contact {

	private String name;
	private String phoneNumber;
	LocalDateTime createdAt = LocalDateTime.now();

	Scanner keyboard = new Scanner(System.in);

	ArrayList<Contact> contactInfoList = new ArrayList<>();

	public Contact(String name, String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;

	}

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

	

	public static boolean validatePhoneNumber(String number) {
		{
			if (number.matches("\\d{3}-\\d{3}-\\d{4}"))
				return true;

			else
				return false;
		}
	}
	@Override
	public String toString() {
		return " name=" + name + ",createdAt=" + createdAt + ",phone Number=" + phoneNumber;
	}
}
