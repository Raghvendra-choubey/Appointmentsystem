package org.appointment;
import org.doctor.*;
import org.patient.*;

public class Appointment implements Runnable {
	static int no_of_appointments = 0 ;
	private Doctor doc;
	private Patient	patient;
	
	public Appointment(Doctor doc, Patient patient) {
		
		this.doc = doc;
		this.patient = patient;
		
		int level = patient.getCritical_level();
		
		doc.setAvailability(false, level);
		doc.setNo_of_patients(1);
		doc.setTime_taken(level);
	
	}
	public static int getNo_of_appointments() {
		return no_of_appointments;
	}
	public static void setNo_of_appointments(int no_of_appointments) {
		Appointment.no_of_appointments = no_of_appointments;
	}
	public Doctor getDoc() {
		return doc;
	}
	public void setDoc(Doctor doc) {
		this.doc = doc;
	}
	public Patient getPatient() {
		return patient;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	@Override
	public void run() {
		
		
		
	}
	

	
}
