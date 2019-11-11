package game;

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