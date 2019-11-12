package game;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

public class SpinnerView extends JPanel implements KeyListener{
	
	private Spinner spinner;
	
	public SpinnerView(Spinner spinner) {
		this.spinner = spinner;
		setUpSpinner();
	}
	
	public void setUpSpinner() {
		setLayout(new FlowLayout());
		//added in will be taken out after demo
		setPreferredSize(new Dimension(400,350));
		this.addKeyListener(new StopListener());
	}
	
	public Spinner getSpinner() {
		return this.spinner;
	}
	
	public void drawCenteredCircle(Graphics g, int x, int y, int r) { //added in will be taken out after demo
		  x = x-(r/2);
		  y = y-(r/2);
		  g.fillOval(x,y,r,r);
	}
	public void paintComponent(Graphics g){ //added in will be taken out after demo
		g.setColor(Color.RED);
		int centerX = this.getWidth()/2;
		int centerY = this.getHeight()/2;
		int radius = centerY;
		if (centerX < centerY) {
			radius = centerX;
		}
		drawCenteredCircle(g, 2*radius/5, centerY, radius/5);
		drawCenteredCircle(g, centerX-radius/2, centerY-radius/2, radius/5);
		drawCenteredCircle(g, centerX, radius/5, radius/5);
		drawCenteredCircle(g, centerX+radius/2, centerY-radius/2, radius/5);
		drawCenteredCircle(g, centerX*2-2*radius/5, centerY, radius/5);
		drawCenteredCircle(g, centerX+radius/2, centerY+radius/2, radius/5);
		drawCenteredCircle(g, centerX, centerY*2-radius/5, radius/5);
		drawCenteredCircle(g, centerX-radius/2, centerY+radius/2, radius/5);
		
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}