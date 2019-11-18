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

/*
 * The visual representation of the Spinner
 */
public class SpinnerView extends JPanel implements KeyListener{
	
	private Spinner spinner;
	private Color[] colors = {Color.RED, Color.RED, Color.RED, Color.RED, Color.RED, Color.RED, Color.RED, Color.BLACK};
	private static int DELAY = 70;
	private Timer timer;
	
	public SpinnerView(Spinner spinner) {
		this.spinner = spinner;
		setUpSpinner();
	}
	
	//Sets the size of the SpinnerView when it appears in the main frame
	public void setUpSpinner() {
		setLayout(new FlowLayout());
		setPreferredSize(new Dimension(400,350));
	}
	
	public Spinner getSpinner() {
		return this.spinner;
	}
	
	//Main graphic method that will be used to create the Spinner circles
	public void paintComponent(Graphics g){
		/*
		 * CenterX and CenterY represent the center of the spinner.
		 * When drawing circles, the X and Y positions will be determined relative
		 * to these CenterX and CenterY values. 
		 */
		g.setColor(Color.RED);
		int centerX = this.getWidth()/2;
		int centerY = this.getHeight()/2;
		int radius = centerY;
		if (centerX < centerY) {
			radius = centerX;
		}
		
		/*
		 * An array of x and y values for each circle in the Spinner. These are hardcoded
		 * so that the spinner circles appear to be in a circle. Feel free to make this a
		 * loop that sets the array values instead of just hard coding them! This will be
		 * necessary if you want to have a higher number of circles.
		 */
		int[] x = {centerX, centerX+radius/2, centerX*2-2*radius/5, centerX+radius/2, centerX, centerX-radius/2, 2*radius/5, centerX-radius/2};
		int[] y = {radius/5, centerY-radius/2, centerY, centerY+radius/2, centerY*2-radius/5, centerY+radius/2, centerY, centerY-radius/2};
		
		/*
		 * Draws each circle according to the encapsulated color array, which is all red
		 * besides the starting point, which is black
		 */
		for (int i = 0; i < x.length; i++) {
	        g.setColor(colors[i]);
	        drawCenteredCircle(g, x[i], y[i],radius/5);
	     }		
	}

	public void go() {
	    makeNewTimer();
	 }
	
	/*
	 * Helper method that creates a new timer for the Spinner. This is how the
	 * colors on the spinner change according to the encapsulated delay amount.
	 */
	private void makeNewTimer() {
		
		/*
		 * Create a TimerTask object and define the run method so that it shifts the
		 * black spot through the colors array and repaints the SpinnerView to update
		 * the change
		 */
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
		
		//Schedules the timer to do the TimerTask every (delay) seconds
		Timer timer = new Timer();
		timer.schedule(task, 0, DELAY);
		this.timer = timer;
	}
	
	/*
	 * Helper method that creates a circle of radius r centered at the provided x 
	 * and y location.
	 */
	private void drawCenteredCircle(Graphics g, int x, int y, int r) {
		  x = x-(r/2);
		  y = y-(r/2);
		  g.fillOval(x,y,r,r);
	}
	
	/*
	 * Fill in the code to register key events below! Note that if you would like
	 * to, you can also use a MouseListener to implement that starting/stopping of
	 * the Spinner.
	 */

	@Override
	public void keyPressed(KeyEvent e) {
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