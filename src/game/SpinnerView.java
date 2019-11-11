package game;

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
		this.addKeyListener(new StopListener());
	}
	
	public Spinner getSpinner() {
		return this.spinner;
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