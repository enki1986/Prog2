package bwi.prog2B.SS2017.wi16b044_kapferer.ExerciseSheet03;

import bwi.prog2B.SS2017.wi16b044_kapferer.ExerciseSheet03.Track;
import bwi.prog2B.SS2017.wi16b044_kapferer.ExerciseSheet03.Event;

public class Concert extends Event{
	
	private int nextIdx;
	
	private Track[] setList;
	
	//CONSTRUCTOR
	
	public Concert() {
				
	}
	
	//METHODS
	
	public boolean addTrack(Track t) {
		if (t == null) 
			return false; 
		
		if (nextIdx >= setList.length) {
			ensureCapacity(setList.length * 2);
			setList[nextIdx++] = t;
			}
			return true;
	}
	
	public int duration() {
		int dur = 0;
		for (int i=0; i < nextIdx; i++) {
			dur += setList[i].getDuration();
		}
		return dur;
	}
	
	private void ensureCapacity(int length) {
		Track[] copyList = new Track[setList.length + length];
		for (int i=0; i < setList.length; i++) {
			copyList[i] = setList[i];
		}
		setList = copyList;
	}
	
	public Track[] getList() {
		Track[] copyList = new Track[nextIdx];
		for (int i=0; i < nextIdx; i++) {
			copyList[i] = new Track(setList[i]);
			
		}
		return copyList;
	}
	
	public int impact() {
		int durationFactor = ((duration() / 1800) + 1);
		
		return getAttendees() * durationFactor;
		 
	}
	
	public int nrTracks() {
		int nr=0;
		for (int i=0; i < nextIdx; i++) {
			nr++;
		}
		
		return nr;
	}
	
	public void resetSetList() {
		setList = new Track[0];
		nextIdx = 0;
	}
	
	public void setSetList() {
		
	}
	
	//public String toString() {
		
	//}

}
