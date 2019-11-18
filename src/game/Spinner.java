package game;

/*
 * Represents the Spinner object. It will encapsulate the total number
 * of spots and the position of the current/highlighted spot at the
 * very least. You may add additional information here too, like a 
 * variable to track the Spinner speed and update it as needed.
 */

public class Spinner {
	
	private int spots;
	private int current;
	
	public Spinner(int spots, int current) {
		this.spots = spots;
		this.current = current;
	}
	
	public int getNumSpots() {
		return spots;
	}
	
	public int getCurrent() {
		return current;
	}

}