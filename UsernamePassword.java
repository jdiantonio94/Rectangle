import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.control.TextInputDialog;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import java.util.Optional; 

/**
  *Author: John DiAntonio
  *Contact: jdiantonio94@gmail.com
  *Date: October 13, 2016
  *Puprose: Authenticating a username and password using JavaFX Text Input Dialog, Alert, and if-else statements.
  */

public class UsernamePassword extends Application {

	@Override
	public void start(Stage primaryStage) {

	//Prompt User for username and password input in text input dialog window
	TextInputDialog dialog = new TextInputDialog();
	dialog.setTitle("Login");
	dialog.setHeaderText("Username and Password");
	dialog.setContentText("Please enter your username and password seperated by a space");
	Optional<String> input = dialog.showAndWait();
	String [] enteredtext = input.get().split(" ");
	String username = enteredtext[0];
	String password = enteredtext[1];

	//Authenticate Username and Password
	if (username.equals("CSC200Student") && password.equals("Fall2016")) {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Success!");
		alert.setHeaderText("You have successfully logged in");
		alert.setContentText("Welcome " + username + "!");
		alert.showAndWait();


	//If Username and Password are incorrect
	} else {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Error");
		alert.setHeaderText("Invalid login");
		alert.setContentText("Wrong Username or Password!");
		alert.showAndWait();
	
		}
	}	
}	
