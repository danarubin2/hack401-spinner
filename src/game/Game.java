package game;

import java.awt.event.ActionEvent;

/*
 * Represents the Game object. The Game Object will encapsulate
 * a SpinnerView, be able to tell when the game is over, and update the Spinner
 * according to events. Feel free to add more, like a way to track the player
 * score.
 */

public class Game {
	
	private SpinnerView spinnerView;
	
	public Game(SpinnerView spinnerView) {
		this.spinnerView = spinnerView;
		spinnerView.go();
	}
	
	public boolean isGameOver() {
		// TODO Method for determining whether game is over
		
		return false;
	}
	
	public SpinnerView getSpinnerView() {
		return this.spinnerView;
	}
	
	public void update(ActionEvent e) {
		
	}
}