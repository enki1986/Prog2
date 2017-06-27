package bwi.prog2B.SS2017.wi16b044_kapferer.SampleExam.entities;

import bwi.prog2B.SS2017.wi16b044_kapferer.SampleExam.provided.*;

public class CallCenterAgent extends Person{
	
	public CallCenterAgent(String name, Date dateOfBirth, int id) {
		super (name, dateOfBirth, id);
	}
	
	public void setId(int id) {
		if (id >= 1000) {
			this.id = id;
		}
	}
	
	public void setName(String name) {
		if (name != null && name.trim().length() > 0) {
			this.name = name;
		}
	}
}
