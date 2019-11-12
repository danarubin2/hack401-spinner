package game;

import java.awt.event.ActionEvent;

public class Game {
	
	private SpinnerView spinnerView;
	private StopListener listener;
	
	public Game(SpinnerView spinnerView, StopListener listener) {
		this.spinnerView = spinnerView;
		this.listener = listener;
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