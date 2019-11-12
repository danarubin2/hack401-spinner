package game;

import java.awt.event.ActionEvent;

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