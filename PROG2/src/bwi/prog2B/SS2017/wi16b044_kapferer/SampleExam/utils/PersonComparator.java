package bwi.prog2B.SS2017.wi16b044_kapferer.SampleExam.utils;

import java.util.Comparator;


import bwi.prog2B.SS2017.wi16b044_kapferer.SampleExam.entities.Person;

public class PersonComparator implements Comparator<Person>{
	
	
	public int compare(Person p1, Person p2) {
		return p1.compareTo(p2);
		
	}

}
