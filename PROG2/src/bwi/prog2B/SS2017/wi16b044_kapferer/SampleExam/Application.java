package bwi.prog2B.SS2017.wi16b044_kapferer.SampleExam;

import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import bwi.prog2B.SS2017.wi16b044_kapferer.SampleExam.entities.*;
import bwi.prog2B.SS2017.wi16b044_kapferer.SampleExam.provided.Date;
import bwi.prog2B.SS2017.wi16b044_kapferer.SampleExam.utils.*;

public class Application {

	private static Booking b1, b2, b3, b4, b5;
	
	private static Customer c1, c2, c3;
	
	private static CallCenterAgent cca1, cca2;
	
	public static FileWriter fw;
	
	private static MyFileWriter<Person> mfw;
	
	private static PersonComparator pc;
	
	private static List<Person> persons;
	
	private static PersonFormatter pf;
	
	
	
	public static void main(String[] args) throws IOException {
		
		c1 = new Customer("Horst", new Date(), 1);
		c2 = new Customer("Alfons", new Date(), 2);
		c3 = new Customer("Herbert", new Date(), 3);
		cca1 = new CallCenterAgent("Eduardo Garcia", new Date(), 4);
		cca2 = new CallCenterAgent("Alfonso Riberio", new Date(), 5);
		
		persons = new LinkedList<Person>();
		persons.add(c1);
		persons.add(c2);
		persons.add(c3);
		persons.add(cca1);
		persons.add(cca2);
		
		b1 = new Booking(1);
		b2 = new Booking(2);
		b3 = new Booking(3);
		b4 = new Booking(4);
		b5 = new Booking(5);
		persons.get(0).addBooking(b1);
		persons.get(1).addBooking(b2);
		persons.get(1).addBooking(b3);
		persons.get(2).addBooking(b3);
		persons.get(3).addBooking(b4);
		persons.get(4).addBooking(b5);
		persons.get(4).addBooking(b4);
		persons.get(4).addBooking(b2);
		
		pc = new PersonComparator();
		persons.sort(pc);
		
		pf = new PersonFormatter();
		fw = new FileWriter("src/bwi/prog2B/SS2017/wi16b044_kapferer/SampleExam/out/SortedListOfPersons.txt");
		mfw = new MyFileWriter<Person>(fw, pf);
		for (Person p : persons)
			mfw.put(p);
		fw.close();
	}

}





























