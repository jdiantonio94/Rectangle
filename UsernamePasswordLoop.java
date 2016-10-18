import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.control.TextInputDialog;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import java.util.Optional;

/**
  *Author: John DiAntonio
  *Contact: jdiantonio94@gmail.com
  *Date: October 18, 2016
  *Purpose: Authenticating a username and password using JavaFX Text Input Dialog and utilising loops and If...Else statements to lock a user out of their account if they attempt to login incorrectly too many times.
  */
public class UsernamePasswordLoop extends Application {
	
	@Override
	public void start(Stage primaryStage) {
	
	TextInputDialog dialoginitiallogin = new TextInputDialog();
	dialoginitiallogin.setTitle("Login");
	dialoginitiallogin.setHeaderText("Username and Password");
	dialoginitiallogin.setContentText("Please enter your username and password seperated by a space");
	Optional<String> input = dialoginitiallogin.showAndWait();
	String [] enteredtext = input.get().split(" ");
	String username = enteredtext[0];
	String password = enteredtext[1];

	

if (username.equals("CSC200Student")) {

	if (password.equals("Fall2016")) {
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Success!");
			alert.setHeaderText("You have successfully logged in!");
			alert.setContentText("Welcome " + username + "!");
			alert.showAndWait();
	return;
	} else {
		int passwordattempts = 1;
		while (passwordattempts <3) {
		dialoginitiallogin.showAndWait();
		passwordattempts++; 
		}
	}	
	Alert alert = new Alert(AlertType.INFORMATION);
	alert.setContentText("Contact Administrator");
	alert.showAndWait();

} else {
		int usernameattempts = 1;
		while (usernameattempts < 3) {
		dialoginitiallogin.showAndWait();
		usernameattempts++;
		}
	Alert alert = new Alert(AlertType.INFORMATION);
	alert.setContentText("Invalid Username");
	alert.showAndWait();
	}	
	
}
	}

