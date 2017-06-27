package bwi.prog2B.SS2017.wi16b044_kapferer.SampleExam.entities;

public class Booking {
	
	private int bookingNo;
	
	public Booking(int bookingNo) {
		if (bookingNo > 0) {
			this.bookingNo = bookingNo;
		} else {
			this.bookingNo = -1;
		} 
	}
	
	public int getBookingNo() {
		return bookingNo;
	}

}
