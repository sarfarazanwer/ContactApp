package com.contactApp;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Person extends Contact {
	LocalDate dateOfBirth;
	private String email;

	public Person(String name, String phoneNumber, LocalDate dateOfBirth) {
		super(name, phoneNumber);
		this.dateOfBirth = dateOfBirth;

	}

	public Person(String name, String phoneNumber, LocalDate dateOfBirth, String email) {
		super(name, phoneNumber);
		this.dateOfBirth = dateOfBirth;
		this.email = email;
		this.createdAt = LocalDateTime.now();
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

	public void setEnail(String email) {
		this.email = email;

	}

	@Override
	public String toString() {
		return "Person [ email=" + email + ", dateOfBirth=" + dateOfBirth + ",createdAt=" + createdAt + ", toString()="
				+ super.toString() + "]";
	}

	}

