package org.appointment;

import org.patient.*;
import org.doctor.*;
import java.util.List;
import java.util.Iterator;

public class AppointmentScheduler {

	public Appointment getAppointment(Patient p, List<Doctor> l) {
		Appointment A = null;
		Doctor d = null;
		Iterator<Doctor> itr = l.iterator();
		while (itr.hasNext()) {
			d = (Doctor) itr.next();
			if (d.isAvailability()) {
				A = new Appointment(d , p);
				
			}
		}
		return A;
	}
}
