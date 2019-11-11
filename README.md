Welcome to Cirque de 401! This is the Spinner Game, which represents a game where a ball or a light travels around the perimeter of a circle, and the player tries to stop the ball at a certain position. We have created starter code to represent this game, which includes the following:

Main:
  - Creates the Spinner and the SpinnerView, adding it to the GameView
  - Sets up main frame for the game to take place
  
Game:
  - Takes in the SpinnerView and StopListener in the constructor
  - Will listen for updates in StopListener and determine how this would change the SpinnerView
  - Updates the GameView using the update() method
  
GameView:
  - Visual representation of Game object
  
Spinner:
  - Spinner represents the model of the spinner, and it takes in an integer parameter to represent the number of spots along its perimeter
  - Uses “current” field to track where the Spinner is currently lit up
  - Listens for keyboard presses to stop the Spinner at current
  
SpinnerView:
  - Visual representation of Spinner object
  
StopListener:
  - Listens for key presses for when the user wants to stop the Spinner, notifying the Game when this happens

You are responsible for:
1.	Implementing StopListener so that it registers keyboard presses and passes the information to Game
2.	Addin the logic to Game so that it properly listens to the StopListener and updates the GameView accordingly
3.	Using Java Swing to improve the UI, with specific focus on the SpinnerView and GameView classes.

Bonus Ideas:
1.	Options for the spinner to move faster or slower
2.	Add a point based system so that players can compete with how well they can stop the spinner
3.	Rig the game so it doesn’t stop at the desired breakpoint, just like the real-life version of this game!
4.	Anything you want! This project is for you to use your own creativity, so feel free to add whatever you want to achieve that 😊
