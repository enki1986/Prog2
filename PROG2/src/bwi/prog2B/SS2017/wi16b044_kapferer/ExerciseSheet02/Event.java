package bwi.prog2B.SS2017.wi16b044_kapferer.ExerciseSheet02;

public class Event {
	
	private Artist artist;
	
	private int attendees;
	
	private bwi.prog.utils.Date date;
	
	private String description;
	
	private bwi.prog.utils.Venue venue;
	
	//CONSTRUCTORS
	public Event() {
		this.artist = new Artist();
		this.description = "";
	}
	
	//METHODS
	
	public Artist getArtist() {
		return this.artist;
	}
	
	public int getAttendees() {
		return this.attendees;
	}
	
	public bwi.prog.utils.Date getDate() {
		if (date == null) {
			return null;
		} else {
		return new bwi.prog.utils.Date(this.date);
		}
	}	
	
	public String getDescription() {
		return this.description;
	}
	
	public bwi.prog.utils.Venue getVenue(){
		return this.venue;
	}
	
	public void setArtist(Artist artist) {
		if (artist == null) {
			this.artist = new Artist();
		} else {
		this.artist=artist;
		}
	}
	
	public void setAttendees(int attendees) {
		if (attendees < 0) {
			return;
		} else {
			this.attendees=attendees;
		}
	}
	
	public void setDate(bwi.prog.utils.Date date) {
		bwi.prog.utils.Date copyDate = new bwi.prog.utils.Date();
		date = copyDate;
		this.date=date;
	}
	
	public void setDescription(String description) {
		this.description=description;
	}
	
	public void setVenue(bwi.prog.utils.Venue venue) {
		this.venue=venue;		
	}
	

}










