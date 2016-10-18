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
 *Purpose: Using IF ELSE expressions to form groups and teams based off of user input of number of people.
 */

public class GroupSize extends Application {
	@Override
	public void start(Stage primaryStage) {
	
	int groupSize = 0;
	int teamSize = 0;
	String inputpeople;
	String inputplayers;

	TextInputDialog dialognumberpeople = new TextInputDialog();
	dialognumberpeople.setTitle("Number of People");
	dialognumberpeople.setHeaderText("Enter Input");
	dialognumberpeople.setContentText("Please enter the number of people to form into groups");
	Optional<String> enteredpeople = dialognumberpeople.showAndWait();
	inputpeople = enteredpeople.get();
	int numPeople = Integer.parseInt(inputpeople);

	if ( numPeople>10) {
		groupSize = numPeople/2;
	} else if ( 2<numPeople && numPeople<=10) {
		groupSize = numPeople/3;
	} else {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setContentText("The number of people has to be at least 3");
		alert.showAndWait();
	}
	Alert alert = new Alert(AlertType.INFORMATION);
	alert.setTitle("Results");
	alert.setContentText("Number of people: " + numPeople + "\n" + "Group size: " + groupSize);
	alert.showAndWait();

	TextInputDialog dialognumberplayers = new TextInputDialog();
	dialognumberplayers.setTitle("Number of Players");
	dialognumberplayers.setHeaderText("Enter Input");
	dialognumberplayers.setContentText("Please enter the number of players");
	Optional<String> enteredplayers = dialognumberplayers.showAndWait();
	inputplayers = enteredplayers.get();
	int numPlayers = Integer.parseInt(inputplayers);

	if (11<=numPlayers && numPlayers<=55) {
		teamSize = numPlayers/11;
	} else {
	teamSize = 1;
	}
	Alert alertteamsize = new Alert(AlertType.INFORMATION);
	alertteamsize.setTitle("Results");
	alertteamsize.setContentText("Number of Players: " + numPlayers + "\n" + "Team Size: " + teamSize);
	alertteamsize.showAndWait();
	}
}
