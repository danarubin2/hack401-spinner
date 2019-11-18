package game;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;

import javax.swing.JPanel;

/*
 * Visual representation of the Game. Encapsulates a Game object, creates
 * a SpinnerView object for it, and adds it to this. Because the GameView object
 * is part of the main frame, the SpinnerView will also be added to the main frame.
 */
public class GameView extends JPanel{

	private Game game;

	public GameView(Game game) {
		this.game = game;
		setUpView(); 
	}

	public void setUpView() {
		setLayout(new FlowLayout());
		SpinnerView spinnerView = game.getSpinnerView();
		
		this.add(spinnerView);		
	}
}