package main;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import game.Game;
import game.GameView;
import game.Spinner;
import game.SpinnerView;
import game.StopListener;

public class Main {

	public static void main (String[] args)throws IOException {
		
		//Create main spinner and its view
		Spinner spinner = new Spinner(8, 0);
		SpinnerView spinnerView = new SpinnerView(spinner);
				
		//Sets up main game and its view
		Game mainGame = new Game(spinnerView);
		GameView gameView = new GameView(mainGame);
	
		//Sets up the main frame title and behavior
		JFrame mainFrame = new JFrame();
		mainFrame.setTitle("Fun Spinner Game!");
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//Creating layout of content within the main frame, adding the gameView.
		mainFrame.setContentPane(gameView);
		
		//Makes main frame visible
		mainFrame.pack();
		
		//Add listener for spinner
		mainFrame.addKeyListener(spinnerView);
		
		JPanel panel = new JPanel();
		JLabel instructions = new JLabel("Press space to stop, press any other key to restart the spinning");
		panel.add(instructions);
		mainFrame.add(panel);
		
		mainFrame.setSize(400, 400); //added in will be taken out after demo
		mainFrame.setLocationRelativeTo(null); //added in will be taken out after demo
		mainFrame.setVisible(true);
		
	}	
}