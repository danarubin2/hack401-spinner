package game;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import java.util.TimerTask;
import java.util.Timer;

import javax.swing.JPanel;

public class SpinnerView extends JPanel implements KeyListener{
	
	private Spinner spinner;
	private Color[] colors = {Color.RED, Color.RED, Color.RED, Color.RED, Color.RED, Color.RED, Color.RED, Color.BLACK};
	private static int DELAY = 200;
	private Timer timer;
	
	public SpinnerView(Spinner spinner) {
		this.spinner = spinner;
		setUpSpinner();
	}
	
	public void setUpSpinner() {
		setLayout(new FlowLayout());
		//added in will be taken out after demo
		setPreferredSize(new Dimension(400,350));
		//this.addKeyListener(new StopListener());
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
		
		int[] x = {centerX, centerX+radius/2, centerX*2-2*radius/5, centerX+radius/2, centerX, centerX-radius/2, 2*radius/5, centerX-radius/2};
		int[] y = {radius/5, centerY-radius/2, centerY, centerY+radius/2, centerY*2-radius/5, centerY+radius/2, centerY, centerY-radius/2};
		for (int i = 0; i < x.length; i++) {
	        g.setColor(colors[i]);
	        drawCenteredCircle(g, x[i], y[i],radius/5);
	     }		
	}

	public void go() {
	    makeNewTimer();
	 }
	
	private void makeNewTimer() {
		TimerTask task = new TimerTask() {
		      public void run() {
		        Color c = colors[0];
		        synchronized (colors) {
		          System.arraycopy(colors, 1, colors, 0, colors.length - 1);
		          colors[colors.length - 1] = c;
		        }
		        repaint();
		      }
		    };
		    Timer timer = new Timer();
		    timer.schedule(task, 0, DELAY);
		    this.timer = timer;
	}

	@Override
	public void keyPressed(KeyEvent e) {
		timer.cancel();
		if(e.getKeyCode() != KeyEvent.VK_SPACE) {
			makeNewTimer();
		}
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