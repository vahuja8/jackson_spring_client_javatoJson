package com.va.week8;

public class Patient {
	
	private String patientId;
	private String firstName;
	private String lastName;
	
	
	public Patient(String patientId, String firstName, String lastName) {
		super();
		this.patientId = patientId;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	public String getPatientId() {
		return patientId;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	

}
