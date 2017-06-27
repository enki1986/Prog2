package bwi.prog2B.SS2017.wi16b044_kapferer.SampleExam.utils;

import bwi.prog2B.SS2017.wi16b044_kapferer.SampleExam.provided.*;
import bwi.prog2B.SS2017.wi16b044_kapferer.SampleExam.entities.Person;

public class PersonFormatter implements IFormatter<Person> {
	
	public String format(Person p) {
		return String.format("%15.15s (%10s) -> %02d", p.getName(), p.getDateOfBirth(), p.getNoOfBookings());
	}
	
}
