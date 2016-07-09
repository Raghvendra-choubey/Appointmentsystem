package org.patient;

public class Patient {

	private String name;
	private int critical_level = 1;
	
	public Patient(String nm, int level)
	{
		name = nm;
		critical_level = level;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCritical_level() {
		return critical_level;
	}
	public void setCritical_level(int critical_level) {
		this.critical_level = critical_level;
	}
	
	
}
