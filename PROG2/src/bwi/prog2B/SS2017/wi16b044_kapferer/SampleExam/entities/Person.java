package bwi.prog2B.SS2017.wi16b044_kapferer.SampleExam.entities;

import java.util.HashSet;
import java.util.Set;

import bwi.prog2B.SS2017.wi16b044_kapferer.SampleExam.provided.Date;

public abstract class Person implements java.lang.Comparable<Person>{
	
	protected Set<Booking> bookings = new HashSet<Booking>();
	protected Date dateOfBirth = null;
	protected int id = 0;
	protected String name = null;
	
	public Person(java.lang.String name, Date dateOfBirth) {
		setName(name);
		setDateOfBirth(dateOfBirth);
	}
	
	public Person(String name, Date dateOfBirth, int id) {
		this(name, dateOfBirth);
		setId(id);
	}
	
	public boolean addBooking(Booking booking) {
		return bookings.add(booking);
	}
	
	public int compareTo(Person p) {
		return name.compareTo(p.name);
	}
	
	public String getDateOfBirth() {
		return dateOfBirth.toString();
	}
	
	public int getID() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public int getNoOfBookings() {
		return bookings.size(); 
	}
	
	public void setDateOfBirth(Date dateOfBirth) {
		if (dateOfBirth != null) {
			this.dateOfBirth = new Date(dateOfBirth);
		}
	}
	
	public abstract void setId(int id);
	
	public void setName(String name) {
		if (name != null) {
			this.name = name;
		} 
	}
}
