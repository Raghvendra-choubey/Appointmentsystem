package org.doctor;

public class Doctor {

	private int no_of_patients = 0;
	private int time_taken  = 0;
	
	private boolean availability = true;
	
	
	public boolean isAvailability() {
		return availability;
	}
	public void setAvailability(boolean availability) {
		this.availability = availability;
	}
	public int getNo_of_patients() {
		return no_of_patients;
	}
	public void setNo_of_patients(int no_of_patients) {
		this.no_of_patients += no_of_patients;
	}
	public int getTime_taken() {
		return time_taken;
	}
	public void setTime_taken(int time_taken) {
		this.time_taken += time_taken;
	}
	
	
	
}
