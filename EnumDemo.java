import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.control.ComboBox;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

/**
  *Author: John DiAntonio
  *Contact: jdiantonio94@gmail.com
  *Date: October 25, 2016
  *Purpose: Using enum my own variables with JavaFX combobox and switch case, user is prompted to select a month of the year to return a message relating to the season that the month selected is in.
  */



public class EnumDemo extends Application {
	
	public enum Months {January, February, March, April, May, June, July, August, September, October, November, December}


	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Months");
		primaryStage.setWidth(450);
		ComboBox<Months> combo = new ComboBox<>();
		combo.getItems().addAll(Months.January, Months.February, Months.March, Months.April, Months.May, Months.June, Months.July, Months.August, Months.September, Months.October, Months.November, Months.December);
		Label label = new Label("Hello! Please select a month from the list.");
		Button button = new Button("Exit");
		VBox pane = new VBox();
		combo.setOnAction(e-> { 	
			switch(combo.getValue()) {
				case December : 
				case January : 
				case February : 
					label.setText("Do you want to build a snow man?");
					break;
				case March :
				case April :
				case May : 
					label.setText("Happy Spring days!");
					break;
				case June :
				case July :
				case August :
					label.setText("It's a summer time");
					break;
				case September :
				case October :
				case November :
					label.setText("Welcome to the foliage season!");
					break;
				}
			});

		button.setOnAction(e->System.exit(0));
		pane.getChildren().add(label);
		pane.getChildren().add(combo);
		pane.getChildren().add(button);
		Scene scene = new Scene(pane);
		primaryStage.setScene(scene);
		primaryStage.show();
	}	
}
