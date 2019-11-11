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
	public void drawCenteredCircle(Graphics g, int x, int y, int r) {
		  x = x-(r/2);
		  y = y-(r/2);
		  g.fillOval(x,y,r,r);
	}
	public void paintComponent(Graphics g){
		g.setColor(Color.RED);
		int centerX = this.getWidth()/2;
		int centerY = this.getHeight()/2;
		int radius = centerY;
		if (centerX < centerY) {
			radius = centerX;
		}
		drawCenteredCircle(g, radius/5, centerY, radius/5);
		drawCenteredCircle(g, centerX-radius/2, centerY-radius/2, radius/5);
		drawCenteredCircle(g, centerX, radius/5, radius/5);
		drawCenteredCircle(g, centerX+radius/2, centerY-radius/2, radius/5);
		drawCenteredCircle(g, centerX*2-radius/5, centerY, radius/5);
		drawCenteredCircle(g, centerX+radius/2, centerY+radius/2, radius/5);
		drawCenteredCircle(g, centerX, centerY*2-radius/5, radius/5);
		drawCenteredCircle(g, centerX-radius/2, centerY+radius/2, radius/5);
		
	}
}
