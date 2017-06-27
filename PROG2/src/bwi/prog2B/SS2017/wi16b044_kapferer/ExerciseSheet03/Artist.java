package bwi.prog2B.SS2017.wi16b044_kapferer.ExerciseSheet03;

import bwi.prog2B.SS2017.wi16b044_kapferer.ExerciseSheet03.Artist;

public class Artist {
	
	private String name;
	
	//Constructor
	
	public Artist() {
		this.name = "unknown";
	}
	
	public Artist(Artist a) {
		this();
		setName(a.name);
	}
	
	public Artist(String name) {
		this.name = name;
	}
	//Methods
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		if (name == null) {
			return;
		} else {
		this.name=name;
		}
	}
	

}
