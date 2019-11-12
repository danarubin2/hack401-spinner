package game;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;

import javax.swing.JPanel;

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
