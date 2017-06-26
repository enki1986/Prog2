package bwi.prog2B.SS2017.wi16b044_kapferer.ExerciseSheet02;

import bwi.prog.utils.TextIO;

public class Track {
	
	private int 	duration; 
	private Artist 	performer = new Artist();
	private String 	title;
	private Artist	writer = new Artist();;
	private int		year;
	
	// CONSTRUCTORS
	
	
	public Track() {
		this.title = null;
		this.duration = 0;
		this.performer = new Artist();
		this.writer = new Artist();
	}
	
	public Track(String title) {
		this();
		this.title = title;
	}
	
	public Track(Track t) {
		this.duration = t.duration;
		this.performer = new Artist(t.performer);
		this.title = t.title;
		this.writer = new Artist(t.writer);
		this.year = t.year;		
	}
	
	// METHODS
	
	public int getDuration() {
		return duration;						
	}
	
	public Artist getPerformer() {
		return performer;
	}
	
	public String getString() {
		
		String writer, performer, title;
		
		if (this.title == null) {
			title = "unknown";
		} else {
			title = this.title;
		}
		
		if (this.writer == null || this.writer.getName() == null) {
			writer = "unknown";
		} else {
			writer = this.writer.getName();
		}
		
		if (this.performer == null || this.performer.getName() == null) {
			performer = "unknown";
		} else {
			performer = this.performer.getName();
		}
		return String.format("%10.10s by %10.10s performed by %10.10s (%02d:%02d)", title, writer, performer, getDuration() / 60, getDuration() % 60);	
	}
	
	public String getTitle() {
		if (title == null) {
			return "unknown title";
		} else {
		return this.title;
		}
	}
	
	public Artist getWriter() {
		return writer;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setDuration(int duration) {
		if (duration <= 0) {
			return;
		} else {
			 this.duration=duration;
		}
	}
	
	public void setPerformer(Artist performer) {
		if (performer == null) {
			return;
		} else {
			this.performer=performer;
		}
	}
	
	public void setTitle(String title) {
		if (title == null) {
			this.title="unknown title";
		} else {
			this.title=title;
		}
	}
	
	public void setWriter(Artist writer) {
		if (writer != null) {
			this.writer = writer;
		}
	}
	
	public void setYear(int year) {
		if (year < 1900 || year > 2999) {
			return;
		} else {
			this.year=year;
		}
	}
	
	public boolean writerIsKnown() {
		if (writer != null && writer.getName() != null) {
			return true;
		} else {
			return false;
		}
	}

	
}





















